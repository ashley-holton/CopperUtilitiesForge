package dev.bmedina.rose.armor;

import dev.bmedina.rose.Config;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;


public class RoseGoldArmor implements ArmorMaterial
{
    static int RoseGoldBootsDurability = Config.RoseGoldBootsDurability.get();
    static int RoseGoldLeggingsDurability = Config.RoseGoldLeggingsDurability.get();
    static int RoseGoldChestplateDurability = Config.RoseGoldChestplateDurability.get();
    static int RoseGoldHelmetDurability = Config.RoseGoldHelmetDurability.get();

    static int RoseGoldBootsProtection = Config.RoseGoldBootsProtection.get();
    static int RoseGoldLeggingsProtection = Config.RoseGoldLeggingsProtection.get();
    static int RoseGoldChestplateProtection = Config.RoseGoldChestplateProtection.get();
    static int RoseGoldHelmetProtection = Config.RoseGoldHelmetProtection.get();

    public static final ArmorMaterial ROSE_GOLD_ARMOR = new RoseGoldArmor();

    private static final int[] Durability = new int[] {RoseGoldBootsDurability, RoseGoldLeggingsDurability, RoseGoldChestplateDurability, RoseGoldHelmetDurability};
    private static final int[] Protection = new int[] {RoseGoldBootsProtection, RoseGoldLeggingsProtection, RoseGoldChestplateProtection, RoseGoldHelmetProtection};


    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return Durability[slot.getIndex()];
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return Protection[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return 25;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.GOLD_INGOT);
    }

    @Override
    public String getName() {
        return "rose_gold";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}