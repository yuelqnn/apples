package net.yuelqnn.apples.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import net.minecraft.world.item.ToolMaterial;
import net.yuelqnn.apples.Apples;

import java.util.function.Function;

public class ModItems {

    public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Apples.MOD_ID, name));

        T item = itemFactory.apply(settings.setId(itemKey));

        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static final TagKey<Item> REPAIRS_APPLE_RUBY_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(),
            Identifier.fromNamespaceAndPath(Apples.MOD_ID, "repairs_apple_ruby_armor"));

    public static final ToolMaterial APPLE_RUBY_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            455,
            6.0F,
            1.5F,
            22,
            REPAIRS_APPLE_RUBY_ARMOR
    );

    public static final Item APPLE_SLICE = register("apple_slice", Item::new, new Item.Properties().stacksTo(16).food(
            new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build()));
    public static final Item APPLE_PIE = register("apple_pie", Item::new, new Item.Properties().food(
            new FoodProperties.Builder().nutrition(8).saturationModifier(0.3F).build()));
    public static final Item APPLE_RUBY = register("apple_ruby", Item::new, new Item.Properties());

    // tools

    public static final Item APPLE_SWORD = register("apple_sword", Item::new, new Item.Properties().sword(
            APPLE_RUBY_TOOL_MATERIAL,
            3f,
            -2.4f
    ));
    public static final Item APPLE_PICKAXE = register("apple_pickaxe", Item::new, new Item.Properties().pickaxe(
            APPLE_RUBY_TOOL_MATERIAL,
            1f,
            -2.8f
    ));
    public static final Item APPLE_SHOVEL = register("apple_shovel", Item::new, new Item.Properties().shovel(
            APPLE_RUBY_TOOL_MATERIAL,
            1f,
            -2.8f
    ));
    public static final Item APPLE_AXE = register("apple_axe", Item::new, new Item.Properties().axe(
            APPLE_RUBY_TOOL_MATERIAL,
            6f,
            -3f
    ));
    public static final Item APPLE_HOE = register("apple_hoe", Item::new, new Item.Properties().hoe(
            APPLE_RUBY_TOOL_MATERIAL,
            -1f,
            0f
    ));

    public static void registerItems(){

    }
}
