package dev.redy1aye.copperequipment;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CE_CFG;

    public static ForgeConfigSpec.ConfigValue<Integer> CopperHelmetDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperChestplateDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperLeggingsDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperBootsDurability;

    public static ForgeConfigSpec.ConfigValue<Integer> CopperHelmetProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperChestplateProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperLeggingsProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperBootsProtection;

    public static ForgeConfigSpec.ConfigValue<Integer> CopperToolsDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> CopperToolsMiningLevel;

    public static ForgeConfigSpec.ConfigValue<Integer> CopperSwordDamage;
    public static ForgeConfigSpec.ConfigValue<Float> CopperSwordAttackSpeed;

    public static ForgeConfigSpec.ConfigValue<Integer> CopperAxeDamage;
    public static ForgeConfigSpec.ConfigValue<Float> CopperAxeAttackSpeed;

    static {
        BUILDER.push("The config is currently under development and is unstable.\nCopper Equipment Mod Config!");

        CopperHelmetDurability = BUILDER.define("Copper Helmet Durability", 82);
        CopperChestplateDurability = BUILDER.define("Copper Chestplate Durability", 168);
        CopperLeggingsDurability = BUILDER.define("Copper Leggings Durability", 149);
        CopperBootsDurability = BUILDER.define("Copper Boots Durability", 104);

        CopperHelmetProtection = BUILDER.comment(" # #").define("Copper Helmet Protection", 2);
        CopperChestplateProtection = BUILDER.define("Copper Chestplate Protection", 6);
        CopperLeggingsProtection = BUILDER.define("Copper Leggings Protection", 5);
        CopperBootsProtection = BUILDER.define("Copper Boots Protection", 2);


        CopperToolsDurability = BUILDER.comment(" # #\n # #").define("Copper Tools Durability", 120);
        CopperToolsMiningLevel = BUILDER.define("Copper Tools Mining Level", 2);

        CopperSwordDamage = BUILDER.comment(" # #").define("Copper Sword Damage", 6);
        CopperSwordAttackSpeed = BUILDER.define("Copper Sword Attack Speed", -2.3f);

        CopperAxeDamage = BUILDER.comment(" # #").define("Copper Axe Damage", 9);
        CopperAxeAttackSpeed = BUILDER.define("Copper Axe Attack Speed", -3.1f);

        BUILDER.pop();
        CE_CFG = BUILDER.build();
    }
}
