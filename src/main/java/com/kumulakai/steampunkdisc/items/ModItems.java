package com.kumulakai.steampunkdisc.items;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static com.kumulakai.steampunkdisc.api.item.SteampunkDiscItems.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {

		steampunkdisc = registerItem(new SteampunkDisc("march_of_the_constructs"), "march_of_the_constructs");

	}

	public static Item registerItem(Item item, String name) {
		item.setRegistryName(name);
		ForgeRegistries.ITEMS.register(item);
		return item;
	}
}