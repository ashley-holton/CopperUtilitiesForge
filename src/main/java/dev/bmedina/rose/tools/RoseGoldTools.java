package dev.bmedina.rose.tools;

import dev.bmedina.rose.Config;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;


public class RoseGoldTools implements Tier {

    public static final Tier ROSE_GOLD_TOOL = new RoseGoldTools();

    static final int RoseGoldToolsDurability = Config.RoseGoldToolsDurability.get();
    static final int RoseGoldToolsMiningLevel = Config.RoseGoldToolsMiningLevel.get();


    @Override
    public int getUses() {
        return RoseGoldToolsDurability;
    }

    @Override
    public float getSpeed() {
        return 12;
    }

    @Override
    public float getAttackDamageBonus() {
        return 2;
    }

    @Override
    public int getLevel() {
        return RoseGoldToolsMiningLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.GOLD_INGOT);
    }
}