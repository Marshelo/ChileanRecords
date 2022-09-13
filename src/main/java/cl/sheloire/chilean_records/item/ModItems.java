package cl.sheloire.chilean_records.item;

import cl.sheloire.chilean_records.ChileanRecords;
import cl.sheloire.chilean_records.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChileanRecords.MOD_ID);


    public static final RegistryObject<Item> MUSIC_DISC_CHILEAN_ANTHEM =
            ITEMS.register("music_disc_chilean_anthem",
            ()-> new MusicDiscItem(1, () -> ModSounds.CHILEAN_ANTHEM.get(),
                    new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_LA_CONSENTIDA =
            ITEMS.register("music_disc_la_consentida",
                    ()-> new MusicDiscItem(1, () -> ModSounds.LA_CONSENTIDA.get(),
                            new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_LOS_VIEJOS_ESTANDARTES =
            ITEMS.register("music_disc_los_viejos_estandartes",
                    ()-> new MusicDiscItem(1, () -> ModSounds.LOS_VIEJOS_ESTANDARTES.get(),
                            new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_UN_ANO_MAS =
            ITEMS.register("music_disc_un_ano_mas",
                    ()-> new MusicDiscItem(1, () -> ModSounds.UN_ANO_MAS.get(),
                            new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_TREN_AL_SUR =
            ITEMS.register("music_disc_tren_al_sur",
                    ()-> new MusicDiscItem(1, () -> ModSounds.TREN_AL_SUR.get(),
                            new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_FALSO_AMOR =
            ITEMS.register("music_disc_falso_amor",
                    ()-> new MusicDiscItem(1, () -> ModSounds.FALSO_AMOR.get(),
                            new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_CURAO_MANEJO_MEJOR =
            ITEMS.register("music_disc_curao_manejo_mejor",
                    ()-> new MusicDiscItem(1, () -> ModSounds.CURAO_MANEJO_MEJOR.get(),
                            new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_LA_MEJICANA =
            ITEMS.register("music_disc_la_mejicana",
                    ()-> new MusicDiscItem(1, () -> ModSounds.LA_MEJICANA.get(),
                            new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_MORTAL_KUMBIAT=
            ITEMS.register("music_disc_mortal_kumbiat",
                    ()-> new MusicDiscItem(1, () -> ModSounds.MORTAL_KUMBIAT.get(),
                            new Item.Properties().maxStackSize(1).group(ItemGroup.MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
