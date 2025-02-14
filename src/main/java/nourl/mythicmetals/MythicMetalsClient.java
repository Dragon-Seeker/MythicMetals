package nourl.mythicmetals;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.*;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nourl.mythicmetals.armor.HallowedArmor;
import nourl.mythicmetals.blocks.BanglumTntEntityRenderer;
import nourl.mythicmetals.models.CarmotStaffBlockRenderer;
import nourl.mythicmetals.models.MythicModelHandler;
import nourl.mythicmetals.models.PlayerEnergySwirlFeatureRenderer;
import nourl.mythicmetals.registry.RegisterEntities;
import nourl.mythicmetals.tools.BanglumPick;
import nourl.mythicmetals.tools.BanglumShovel;
import nourl.mythicmetals.tools.MythicTools;
import nourl.mythicmetals.utils.RegistryHelper;

import java.util.Calendar;

public class MythicMetalsClient implements ClientModInitializer {

    @SuppressWarnings("unchecked")
    @Override
    public void onInitializeClient() {
        MythicModelHandler.init((loc, def) -> EntityModelLayerRegistry.registerModelLayer(loc, () -> def));
        registerArmorRenderer();
        registerModelPredicates();

        LivingEntityFeatureRendererRegistrationCallback.EVENT.register((entityType, entityRenderer, registrationHelper, entityRendererFactoryCtx) -> {
            if (entityType != EntityType.PLAYER) return;
            registrationHelper.register(
                    new PlayerEnergySwirlFeatureRenderer(
                            (FeatureRendererContext<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>>) entityRenderer,
                            entityRendererFactoryCtx.getModelLoader()));
        });

        EntityRendererRegistry.register(RegisterEntities.BANGLUM_TNT_ENTITY_TYPE, BanglumTntEntityRenderer::new);

        BuiltinItemRendererRegistry.INSTANCE.register(MythicTools.CARMOT_STAFF, new CarmotStaffBlockRenderer());
        ModelLoadingRegistry.INSTANCE.registerModelProvider(new CarmotStaffBlockRenderer());
    }

    private void registerArmorRenderer() {
        Item[] armors = Registry.ITEM.stream()
                .filter(i -> i instanceof HallowedArmor
                        && Registry.ITEM.getKey(i).get().getValue().getNamespace().equals(MythicMetals.MOD_ID))
                .toArray(Item[]::new);

        ArmorRenderer renderer = (matrices, vertexConsumer, stack, entity, slot, light, original) -> {

            HallowedArmor armor = (HallowedArmor) stack.getItem();
            var model = armor.getArmorModel();
            var texture = armor.getArmorTexture(stack, slot);
            original.setAttributes(model);
            ArmorRenderer.renderPart(matrices, vertexConsumer, light, stack, model, texture);
        };
        ArmorRenderer.register(renderer, armors);
    }

    private void registerModelPredicates() {
        ModelPredicateProviderRegistry.register(MythicTools.LEGENDARY_BANGLUM.getPickaxe(), new Identifier("is_primed"),
                (stack, world, entity, seed) -> BanglumPick.getCooldown(entity, stack) ? 0 : 1);

        ModelPredicateProviderRegistry.register(MythicTools.LEGENDARY_BANGLUM.getShovel(), new Identifier("is_primed"),
                (stack, world, entity, seed) -> BanglumShovel.getCooldown(entity, stack) ? 0 : 1);

        ModelPredicateProviderRegistry.register(RegistryHelper.id("funny_day"), (stack, world, entity, seed) ->
                (Calendar.getInstance().get(Calendar.MONTH) == Calendar.APRIL && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 1
                        && !MythicMetals.CONFIG.disableFunny) ? 1 : 0);
    }

}
