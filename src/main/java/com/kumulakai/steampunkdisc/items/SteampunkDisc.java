package com.kumulakai.steampunkdisc.items;

import com.kumulakai.steampunkdisc.SteampunkDiscMain;
import com.kumulakai.steampunkdisc.setup.ModSetup;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class SteampunkDisc extends MusicDiscItem {

	public static RegistryObject<SoundEvent> soundProvider(String soundName) {
		return RegistryObject.of(new ResourceLocation(SteampunkDiscMain.MODID, soundName),
				ForgeRegistries.SOUND_EVENTS);
	};

	public SteampunkDisc(String record) {
		super(0, soundProvider(record), new Item.Properties().group(ModSetup.ITEM_GROUP).maxStackSize(1));
	}
}