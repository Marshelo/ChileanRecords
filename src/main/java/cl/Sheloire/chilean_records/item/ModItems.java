package cl.Sheloire.chilean_records.item;

import cl.Sheloire.chilean_records.ChileanRecords;
import cl.Sheloire.chilean_records.sound.ModSounds;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.SnowballItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChileanRecords.MOD_ID);

//    public static final RegistryObject<Item> ITEM_NAME = ITEMS.register("item_name",
//            () -> new Item[or what you what](new Item[again].Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_CHILEAN_ANTHEM = ITEMS.register("music_disc_chilean_anthem",
            () -> new RecordItem(1, ModSounds.CHILEAN_ANTHEM,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));

    public static final RegistryObject<Item> MUSIC_DISC_LA_CONSENTIDA = ITEMS.register("music_disc_la_consentida",
            () -> new RecordItem(2, ModSounds.LA_CONSENTIDA,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));

    public static final RegistryObject<Item> MUSIC_DISC_LOS_VIEJOS_ESTANDARTES = ITEMS.register("music_disc_los_viejos_estandartes",
            () -> new RecordItem(3, ModSounds.LOS_VIEJOS_ESTANDARTES,
                    new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
