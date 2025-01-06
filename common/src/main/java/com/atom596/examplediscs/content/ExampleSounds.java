package com.atom596.examplediscs.content;

import com.atom596.examplediscs.ExampleDiscs;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ExampleSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ExampleDiscs.MOD_ID, RegistryKeys.SOUND_EVENT);

    public static final RegistrySupplier<SoundEvent> GEOSENGE_TOWN = SOUNDS.register("music_disc.geosenge", () ->
            SoundEvent.of(new Identifier(ExampleDiscs.MOD_ID, "music_disc.geosenge")));
}
