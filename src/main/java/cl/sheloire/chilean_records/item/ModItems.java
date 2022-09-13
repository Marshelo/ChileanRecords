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


//    public static final RegistryObject<Item> MUSIC_DISC_LA_CONSENTIDA = ITEMS.register("music_disc_la_consentida",
//            () -> new RecordItem(2, ModSounds.LA_CONSENTIDA,
//                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
//
//    public static final RegistryObject<Item> MUSIC_DISC_LOS_VIEJOS_ESTANDARTES = ITEMS.register("music_disc_los_viejos_estandartes",
//            () -> new RecordItem(3, ModSounds.LOS_VIEJOS_ESTANDARTES,
//                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
