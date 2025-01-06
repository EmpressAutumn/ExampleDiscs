package com.atom596.examplediscs;

import com.atom596.examplediscs.content.ExampleItems;
import com.atom596.examplediscs.content.ExampleSounds;
import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.RegistrarManager;

import java.util.function.Supplier;

public class ExampleDiscs {
    public static final String MOD_ID = "examplediscs";
    public static final Supplier<RegistrarManager> REGISTRIES = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));

    public static void init() {
        ExampleSounds.SOUNDS.register();
        ExampleItems.TABS.register();
        ExampleItems.ITEMS.register();
        
        System.out.println(ExampleExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
