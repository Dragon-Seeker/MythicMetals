package nourl.mythicmetals.config;

import me.shedaniel.autoconfig.annotation.ConfigEntry;

/**
 * A config constructor that lets you quickly create all the settings used
 * for a ore in the {@link nourl.mythicmetals.world.MythicOreFeatures} class.
 */
public class OreConfig {
    @ConfigEntry.Gui.RequiresRestart
    public boolean enabled;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    @ConfigEntry.Gui.RequiresRestart
    public int veinSize;
    @ConfigEntry.BoundedDiscrete(min = 1, max = 64)
    @ConfigEntry.Gui.RequiresRestart
    public int perChunk;
    @ConfigEntry.Gui.RequiresRestart
    public int bottom;
    @ConfigEntry.Gui.RequiresRestart
    public int top;
    @ConfigEntry.Gui.RequiresRestart
    public float discardChance;
    @ConfigEntry.Gui.RequiresRestart
    public boolean offset;
    @ConfigEntry.Gui.RequiresRestart
    public boolean trapezoid;

    /**
     *  The constructor of the OreConfig. Contains all the elements needed to configure a single ore feature.
     * @param enabled           Whether the ore is enabled or not
     * @param veinSize          The vein size of the ore feature
     * @param perChunk          How many times the ore should attempt to generate per chunk
     * @param bottom            The lowest value in the fixed/offset range of where the ore can generate
     * @param top               The highest value in the fixed/offset range of where the ore can generate
     * @param discardChance     The chance the ore is discarded when exposed to air
     */
    public OreConfig(boolean enabled, int veinSize, int perChunk, int bottom, int top, float discardChance, boolean offset) {
        this.enabled = enabled;
        this.veinSize = veinSize;
        this.perChunk = perChunk;
        this.bottom = bottom;
        this.top = top;
        this.discardChance = discardChance;
        this.offset = offset;
    }

    /**
     *  Extra constructor that contains an extra boolean, which is whether or not the feature contains an offset.
     * @param enabled           Whether the ore is enabled or not
     * @param veinSize          The vein size of the ore feature
     * @param perChunk          How many times the ore should attempt to generate per chunk
     * @param bottom            The lowest value in the fixed/offset range of where the ore can generate
     * @param top               The highest value in the fixed/offset range of where the ore can generate
     * @param discardChance     The chance the ore is discarded when exposed to air
     * @param offset            If true the feature is offset from the bottom, else it is not offset
     */
    public OreConfig(boolean enabled, int veinSize, int perChunk, int bottom, int top, float discardChance, boolean offset, boolean trapezoid) {
        this.enabled = enabled;
        this.veinSize = veinSize;
        this.perChunk = perChunk;
        this.bottom = bottom;
        this.top = top;
        this.discardChance = discardChance;
        this.offset = offset;
        this.trapezoid = trapezoid;
    }

}
