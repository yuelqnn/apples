package net.yuelqnn.apples.item;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.yuelqnn.apples.Apples;

public class ModItemGroups {
    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Apples.MOD_ID, "creative_tab")
    );
    public static final CreativeModeTab CUSTOM_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModItems.APPLE_RUBY))
            .title(Component.translatable("creativeTab.apples"))
            .displayItems((params, output) -> {
                output.accept(ModItems.APPLE_SLICE);
                output.accept(ModItems.APPLE_PIE);
                output.accept(ModItems.APPLE_RUBY);

                output.accept(ModItems.APPLE_SWORD);
                output.accept(ModItems.APPLE_PICKAXE);
                output.accept(ModItems.APPLE_AXE);
                output.accept(ModItems.APPLE_HOE);
                output.accept(ModItems.APPLE_SHOVEL);

            })
            .build();

    public static void registerItemGroups() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_CREATIVE_TAB_KEY, CUSTOM_CREATIVE_TAB);
    }
}
