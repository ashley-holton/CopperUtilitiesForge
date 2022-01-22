package dev.bmedina.rose.tools;

import dev.bmedina.rose.Config;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;


public class RoseGoldTools implements Tier {

    public static final Tier COPPER_TOOL = new RoseGoldTools();

    static final int RoseGoldToolsDurability = Config.RoseGoldToolsDurability.get();
    static final int RoseGoldToolsMiningLevel = Config.RoseGoldToolsMiningLevel.get();


    @Override
    public int getUses() {
        return RoseGoldToolsDurability;
    }

    @Override
    public float getSpeed() {
        return 6;
    }

    @Override
    public float getAttackDamageBonus() {
        return -1;
    }

    @Override
    public int getLevel() {
        return RoseGoldToolsMiningLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return 17;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.COPPER_INGOT);
    }
}