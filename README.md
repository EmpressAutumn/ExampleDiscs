# EmpressAutumn's Music Disc Example

## Credits
- EmpressAutumn
- [Pokestir](https://www.youtube.com/watch?v=EWJXSJTzGPI) (song creator)

## Steps
To create your own custom music discs using Architectury 1.20.1, follow these steps:
1. Download a song for your music disc, convert it to a mono-channel .ogg file, and name it **{song_id}.ogg**
2. In the resources folder, move **{song_id}.ogg** to *assets/{mod_id}/sounds/records/*
3. In the resources folder, at *assets/{mod_id}/*, create **sounds.json** with the following contents:
```
{
    "music_disc.{song_id}": {
        "sounds": [
            {
                "name": "{mod_id}:records/{song_id}",
                "stream": true
            }
        ]
    }
}
```
4. Change `{song_id}` to your file's name from step 2, and `{mod_id}` to your mod's id
5. In your lang file, add these lines:
```
"item.{mod_id}.music_disc_{song_id}": "Music Disc",
"item.{mod_id}.music_disc_{song_id}.desc": "{artist} - {song_name}"
```
6. Change `{mod_id}` and `{song_id}` to the values from previous steps, and `{artist}` and `{song_name}` to the name and artist of the song
7. In the resources folder, at *data/minecraft/tags/items/*, create **music_discs.json** with the following contents:
```
{
    "replace": false,
    "values": [
        "{mod_id}:music_disc_{song_id}"
    ]
}
```
8. Change `{mod_id}` and `{song_id}` to the values from previous steps
9. In your SoundEvents class (create one if you don't have one), create a new sound event:
```
public static final RegistrySupplier<SoundEvent> {SONG_ID} = {SOUND_REGISTER}.register("music_disc.{song_id}", () ->
        SoundEvent.of(new Identifier({mod_id}, "music_disc.{song_id}")));
```
10. Change `{SONG_ID}` to your song's id in all-caps, `{SOUND_REGISTER}` to your SoundEvent DeferredRegister, and `{song_id}` and `{mod_id}` to the values from previous steps
11. In your Items class, create a new item:
```
public static final RegistrySupplier<Item> {SONG_ID} = {ITEM_REGISTER}.register("music_disc_{song_id}", () ->
        new ArchitecturyRecordItem({comparator_output}, {RECORD_SOUND_EVENT},
                new Item.Settings().maxCount(1).rarity(Rarity.RARE).arch$tab({CREATIVE_TAB}), {song_length}));
```
12. Replace `{ITEM_REGISTER}` with your Item DeferredRegister, `{comparator_output}` to a number from 0 to 15, `{RECORD_SOUND_EVENT}` to the SoundEvent from step 9, `{CREATIVE_TAB}` to the item's creative mode tab, `{song_length}` to the song's length in seconds, and `{SONG_ID}` and `{song_id}` to the values from previous steps
13. Create a texture and model for your music disc and add them to your mod
