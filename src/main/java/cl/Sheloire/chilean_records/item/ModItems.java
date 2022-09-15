package cl.Sheloire.chilean_records.item;

import cl.Sheloire.chilean_records.ChileanRecords;
import cl.Sheloire.chilean_records.sound.ModSounds;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChileanRecords.MOD_ID);

    public static final RegistryObject<Item> MUSIC_DISC_CHILEAN_ANTHEM = ITEMS.register("music_disc_chilean_anthem",
            () -> new RecordItem(1, ModSounds.CHILEAN_ANTHEM,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1), 0));

    public static final RegistryObject<Item> MUSIC_DISC_LA_CONSENTIDA = ITEMS.register("music_disc_la_consentida",
            () -> new RecordItem(2, ModSounds.LA_CONSENTIDA,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1), 0));

    public static final RegistryObject<Item> MUSIC_DISC_LOS_VIEJOS_ESTANDARTES = ITEMS.register("music_disc_los_viejos_estandartes",
            () -> new RecordItem(3, ModSounds.LOS_VIEJOS_ESTANDARTES,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1), 00));

    public static final RegistryObject<Item> MUSIC_DISC_UN_ANO_MAS = ITEMS.register("music_disc_un_ano_mas",
            () -> new RecordItem(4, ModSounds.UN_ANO_MAS,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1),0));

    public static final RegistryObject<Item> MUSIC_DISC_TREN_AL_SUR = ITEMS.register("music_disc_tren_al_sur",
            () -> new RecordItem(5, ModSounds.TREN_AL_SUR,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1), 0));

    public static final RegistryObject<Item> MUSIC_DISC_FALSO_AMOR = ITEMS.register("music_disc_falso_amor",
            () -> new RecordItem(6, ModSounds.FALSO_AMOR,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1), 0));

    public static final RegistryObject<Item> MUSIC_DISC_CURAO_MANEJO_MEJOR = ITEMS.register("music_disc_curao_manejo_mejor",
            () -> new RecordItem(7, ModSounds.CURAO_MANEJO_MEJOR,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1), 0));

    public static final RegistryObject<Item> MUSIC_DISC_LA_MEJICANA = ITEMS.register("music_disc_la_mejicana",
            () -> new RecordItem(8, ModSounds.LA_MEJICANA,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1), 0));

    public static final RegistryObject<Item> MUSIC_DISC_MORTAL_KUMBIAT = ITEMS.register("music_disc_mortal_kumbiat",
            () -> new RecordItem(9, ModSounds.MORTAL_KUMBIAT,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1), 0));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
