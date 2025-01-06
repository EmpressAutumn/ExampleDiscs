package com.atom596.examplediscs.forge;

import dev.architectury.platform.forge.EventBuses;
import com.atom596.examplediscs.ExampleDiscs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleDiscs.MOD_ID)
public class ExampleDiscsForge {
    public ExampleDiscsForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ExampleDiscs.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ExampleDiscs.init();
    }
}
