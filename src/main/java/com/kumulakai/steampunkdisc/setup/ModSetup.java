package com.kumulakai.steampunkdisc.setup;

import com.kumulakai.steampunkdisc.SteampunkDiscMain;
import com.kumulakai.steampunkdisc.api.item.SteampunkDiscItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SteampunkDiscMain.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModSetup {

	public static final ItemGroup ITEM_GROUP = new ItemGroup("steampunkdisc") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(SteampunkDiscItems.steampunkdisc);
		}
	};
}