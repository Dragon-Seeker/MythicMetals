package nourl.mythicmetals.registry;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import nourl.mythicmetals.MythicMetals;

public class RegisterItems {
    public static final Item ADAMANTITE_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item AETHERIUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item AQUARIUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item ARGONIUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item BANGLUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item BRASS_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item BRONZE_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item CARMOT_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item CELESTIUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item COPPER_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item DISCORDIUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item DURASTEEL_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item ELECTRUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item ETHERITE_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item GOLD_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item HALLOWED_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item KYBER_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item MANGANESE_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item METALLURGIUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS).fireproof());
    public static final Item MIDAS_GOLD_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item MYTHRIL_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item ORICHALCUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item OSMIUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item PLATINUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item PROMETHEUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item QUADRILLUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item QUICKSILVER_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item RUNITE_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item SILVER_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item SLOWSILVER_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item STARRITE_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item STEEL_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item STORMYX_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item TANTALITE_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item TIN_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item TRUESILVER_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item UNOBTAINIUM_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS).fireproof());
    public static final Item UR_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item VERMICULITE = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static final Item ZINC_DUST = new Item(new Item.Settings().group(MythicMetals.MYTHICMETALS));
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "adamantite_dust"), ADAMANTITE_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "aetherium_dust"), AETHERIUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "aquarium_dust"), AQUARIUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "argonium_dust"), ARGONIUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "banglum_dust"), BANGLUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "brass_dust"), BRASS_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "bronze_dust"), BRONZE_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "carmot_dust"), CARMOT_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "celestium_dust"), CELESTIUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "copper_dust"), COPPER_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "discordium_dust"), DISCORDIUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "durasteel_dust"), DURASTEEL_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "electrum_dust"), ELECTRUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "etherite_dust"), ETHERITE_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "gold_dust"), GOLD_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "hallowed_dust"), HALLOWED_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "kyber_dust"), KYBER_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "manganese_dust"), MANGANESE_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "metallurgium_dust"), METALLURGIUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "midas_gold_dust"), MIDAS_GOLD_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "mythril_dust"), MYTHRIL_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "orichalcum_dust"), ORICHALCUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "osmium_dust"), OSMIUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "platinum_dust"), PLATINUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "prometheum_dust"), PROMETHEUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "quadrillum_dust"), QUADRILLUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "quicksilver_dust"), QUICKSILVER_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "runite_dust"), RUNITE_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "silver_dust"), SILVER_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "slowsilver_dust"), SLOWSILVER_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "starrite_dust"), STARRITE_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "steel_dust"), STEEL_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "stormyx_dust"), STORMYX_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "tantalite_dust"), TANTALITE_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "tin_dust"), TIN_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "truesilver_dust"), TRUESILVER_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "unobtainium_dust"), UNOBTAINIUM_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "ur_dust"), UR_DUST);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "vermiculite"), VERMICULITE);
        Registry.register(Registry.ITEM, new Identifier(MythicMetals.MOD_ID, "zinc_dust"), ZINC_DUST);
    }
}
