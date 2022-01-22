package dev.bmedina.rose;

import dev.bmedina.rose.armor.RoseGoldArmor;
import dev.bmedina.rose.tools.RoseGoldTools;

import net.minecraft.world.item.*;
import net.minecraft.world.entity.EquipmentSlot;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            Rose.MOD_ID);

    static int RoseGoldSwordDamage = Config.RoseGoldSwordDamage.get();
    static float RoseGoldSwordAttackSpeed = Config.RoseGoldSwordAttackSpeed.get();

    static int RoseGoldAxeDamage = Config.RoseGoldAxeDamage.get();
    static float RoseGoldAxeAttackSpeed = Config.RoseGoldAxeAttackSpeed.get();

    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(RoseGoldTools.COPPER_TOOL, RoseGoldSwordDamage, RoseGoldSwordAttackSpeed,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("rose_gold_shovel",
            () -> new ShovelItem(RoseGoldTools.COPPER_TOOL, 1, -2.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("rose_gold_pickaxe",
            () -> new PickaxeItem(RoseGoldTools.COPPER_TOOL, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("rose_gold_axe",
            () -> new AxeItem(RoseGoldTools.COPPER_TOOL, RoseGoldAxeDamage, RoseGoldAxeAttackSpeed,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("rose_gold_hoe",
            () -> new HoeItem(RoseGoldTools.COPPER_TOOL, -2, -0.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("rose_gold_helmet",
            () -> new ArmorItem(RoseGoldArmor.COPPER_ARMOR, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new ArmorItem(RoseGoldArmor.COPPER_ARMOR, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("rose_gold_leggings",
            () -> new ArmorItem(RoseGoldArmor.COPPER_ARMOR, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new ArmorItem(RoseGoldArmor.COPPER_ARMOR, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}