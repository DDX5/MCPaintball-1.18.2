package org.multicoder.mcpaintball.util.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MCPaintballConfig
{
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static ForgeConfigSpec.BooleanValue FRIENDLY_FIRE;
    public static ForgeConfigSpec.DoubleValue PISTOL_INACCURACY;
    public static ForgeConfigSpec.DoubleValue SHOTGUN_INACCURACY;


    static{
        BUILDER.push("MCPaintball Team");
        FRIENDLY_FIRE = BUILDER.comment("Enables/Disables Friendly Fire").define("Friendly_fire",false);
        BUILDER.pop();
        BUILDER.push("MCPaintball Weapons");
        PISTOL_INACCURACY = BUILDER.comment("The Inaccuracy Of The Pistol, Lower The Better").defineInRange("pistol_accuracy",0.5,0.0,1.0);
        SHOTGUN_INACCURACY = BUILDER.comment("The Inaccuracy Of The Shotgun, Lower The Better").defineInRange("shotgun_accuracy",0.5,0.0,1.0);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
