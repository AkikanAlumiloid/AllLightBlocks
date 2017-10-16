package com.akikan.AllLightBlocks.main;

import com.akikan.AllLightBlocks.Proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class MainMod{

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@Instance
	public static MainMod instance;

	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		logger = event.getModLog();
		proxy.preInit(event);

	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init(event);
	}

	@EventHandler
	public void posInit(FMLPostInitializationEvent event){

		proxy.posInit(event);
	}
}
