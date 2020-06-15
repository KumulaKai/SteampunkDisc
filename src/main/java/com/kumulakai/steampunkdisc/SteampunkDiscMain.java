package com.kumulakai.steampunkdisc;

import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kumulakai.steampunkdisc.items.ModItems;
import com.kumulakai.steampunkdisc.setup.ClientProxy;
import com.kumulakai.steampunkdisc.setup.IProxy;
import com.kumulakai.steampunkdisc.setup.ServerProxy;

@Mod("steampunkdisc")
public class SteampunkDiscMain {

	public static final String MODID = "steampunkdisc";

	public static final IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(),
			() -> () -> new ServerProxy());

	private static final Logger LOGGER = LogManager.getLogger();

}