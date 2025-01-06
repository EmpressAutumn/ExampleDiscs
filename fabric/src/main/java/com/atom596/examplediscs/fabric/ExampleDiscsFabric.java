package com.atom596.examplediscs.fabric;

import com.atom596.examplediscs.ExampleDiscs;
import net.fabricmc.api.ModInitializer;

public class ExampleDiscsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleDiscs.init();
    }
}
