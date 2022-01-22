package dev.bmedina.rose;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec CE_CFG;

    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldHelmetDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldChestplateDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldLeggingsDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldBootsDurability;

    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldHelmetProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldChestplateProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldLeggingsProtection;
    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldBootsProtection;

    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldToolsDurability;
    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldToolsMiningLevel;

    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldSwordDamage;
    public static ForgeConfigSpec.ConfigValue<Float> RoseGoldSwordAttackSpeed;

    public static ForgeConfigSpec.ConfigValue<Integer> RoseGoldAxeDamage;
    public static ForgeConfigSpec.ConfigValue<Float> RoseGoldAxeAttackSpeed;

    static {
        BUILDER.push("The config is currently under development and is unstable.\nRose Gold Equipment Mod Config!");

        RoseGoldHelmetDurability = BUILDER.define("Rose Gold Helmet Durability", 82);
        RoseGoldChestplateDurability = BUILDER.define("Rose Gold Chestplate Durability", 168);
        RoseGoldLeggingsDurability = BUILDER.define("Rose Gold Leggings Durability", 149);
        RoseGoldBootsDurability = BUILDER.define("Rose Gold Boots Durability", 104);

        RoseGoldHelmetProtection = BUILDER.comment(" # #").define("Rose Gold Helmet Protection", 2);
        RoseGoldChestplateProtection = BUILDER.define("Rose Gold Chestplate Protection", 6);
        RoseGoldLeggingsProtection = BUILDER.define("Rose Gold Leggings Protection", 5);
        RoseGoldBootsProtection = BUILDER.define("Rose Gold Boots Protection", 2);


        RoseGoldToolsDurability = BUILDER.comment(" # #\n # #").define("Rose Gold Tools Durability", 120);
        RoseGoldToolsMiningLevel = BUILDER.define("Rose Gold Tools Mining Level", 2);

        RoseGoldSwordDamage = BUILDER.comment(" # #").define("Rose Gold Sword Damage", 6);
        RoseGoldSwordAttackSpeed = BUILDER.define("Rose Gold Sword Attack Speed", -2.3f);

        RoseGoldAxeDamage = BUILDER.comment(" # #").define("Rose Gold Axe Damage", 9);
        RoseGoldAxeAttackSpeed = BUILDER.define("Rose Gold Axe Attack Speed", -3.1f);

        BUILDER.pop();
        CE_CFG = BUILDER.build();
    }
}
