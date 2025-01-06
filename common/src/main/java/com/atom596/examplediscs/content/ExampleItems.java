package com.atom596.examplediscs.content;

import dev.architectury.core.item.ArchitecturyRecordItem;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import com.atom596.examplediscs.ExampleDiscs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;

public class ExampleItems {
    public static final DeferredRegister<ItemGroup> TABS = DeferredRegister.create(ExampleDiscs.MOD_ID, RegistryKeys.ITEM_GROUP);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ExampleDiscs.MOD_ID, RegistryKeys.ITEM);

    public static final RegistrySupplier<ItemGroup> EXAMPLE_TAB = TABS.register("music_discs", () ->
            CreativeTabRegistry.create(Text.translatable("itemGroup." + ExampleDiscs.MOD_ID + ".music_discs"),
                    () -> new ItemStack(ExampleItems.GEOSENGE_TOWN.get())));

    public static final RegistrySupplier<Item> GEOSENGE_TOWN = ITEMS.register("music_disc_geosenge", () ->
            new ArchitecturyRecordItem(9, ExampleSounds.GEOSENGE_TOWN,
                    new Item.Settings().maxCount(1).rarity(Rarity.RARE).arch$tab(EXAMPLE_TAB), 178));
}
