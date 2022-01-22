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

    public static final RegistryObject<Item> ROSE_GOLD_SWORD = ITEMS.register("rose_gold_sword",
            () -> new SwordItem(RoseGoldTools.ROSE_GOLD_TOOL, RoseGoldSwordDamage, RoseGoldSwordAttackSpeed,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROSE_GOLD_SHOVEL = ITEMS.register("rose_gold_shovel",
            () -> new ShovelItem(RoseGoldTools.ROSE_GOLD_TOOL, 1, -2.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> ROSE_GOLD_PICKAXE = ITEMS.register("rose_gold_pickaxe",
            () -> new PickaxeItem(RoseGoldTools.ROSE_GOLD_TOOL, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> ROSE_GOLD_AXE = ITEMS.register("rose_gold_axe",
            () -> new AxeItem(RoseGoldTools.ROSE_GOLD_TOOL, RoseGoldAxeDamage, RoseGoldAxeAttackSpeed,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> ROSE_GOLD_HOE = ITEMS.register("rose_gold_hoe",
            () -> new HoeItem(RoseGoldTools.ROSE_GOLD_TOOL, -2, -0.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> ROSE_GOLD_HELMET = ITEMS.register("rose_gold_helmet",
            () -> new ArmorItem(RoseGoldArmor.ROSE_GOLD_ARMOR, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROSE_GOLD_CHESTPLATE = ITEMS.register("rose_gold_chestplate",
            () -> new ArmorItem(RoseGoldArmor.ROSE_GOLD_ARMOR, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROSE_GOLD_LEGGINGS = ITEMS.register("rose_gold_leggings",
            () -> new ArmorItem(RoseGoldArmor.ROSE_GOLD_ARMOR, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> ROSE_GOLD_BOOTS = ITEMS.register("rose_gold_boots",
            () -> new ArmorItem(RoseGoldArmor.ROSE_GOLD_ARMOR, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}