package cl.sheloire.chilean_records.sound;

import cl.sheloire.chilean_records.ChileanRecords;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ChileanRecords.MOD_ID);

    public static final RegistryObject<SoundEvent> CHILEAN_ANTHEM =
            registerSoundEvent("chilean_anthem");
    public static final RegistryObject<SoundEvent> LA_CONSENTIDA =
            registerSoundEvent("la_consentida");
    public static final RegistryObject<SoundEvent> LOS_VIEJOS_ESTANDARTES =
            registerSoundEvent("los_viejos_estandartes");


    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(ChileanRecords.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
