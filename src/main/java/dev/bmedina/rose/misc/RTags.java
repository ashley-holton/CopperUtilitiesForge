package dev.bmedina.rose.misc;

import dev.bmedina.rose.Rose;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public class RTags {
    public static class Items {

        public static final Tags.IOptionalNamedTag<Item> ROSE_GOLD_STUFF = createForgeTag("rose_gold_stuff");

        private static Tags.IOptionalNamedTag<Item> createTag(String name) {
            return ItemTags.createOptional(new ResourceLocation(Rose.MOD_ID, name));
        }

        private static Tags.IOptionalNamedTag<Item> createForgeTag(String name) {
            return ItemTags.createOptional(new ResourceLocation("forge", name));
        }
    }
}