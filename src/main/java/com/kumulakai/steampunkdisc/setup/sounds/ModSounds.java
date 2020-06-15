package com.kumulakai.steampunkdisc.setup.sounds;

import com.kumulakai.steampunkdisc.SteampunkDiscMain;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static com.kumulakai.steampunkdisc.api.sound.SteampunkDiscSounds.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSounds {
	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		march_of_the_constructs = registerSound("music.march_of_the_constructs");
	}

	private static SoundEvent registerSound(String soundName) {
		ResourceLocation location = new ResourceLocation(SteampunkDiscMain.MODID, soundName);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(location);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}