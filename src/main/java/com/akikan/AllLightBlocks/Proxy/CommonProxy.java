package com.akikan.AllLightBlocks.Proxy;

import com.akikan.AllLightBlocks.init.AllLightBlocks;
import com.akikan.AllLightBlocks.init.AllLightBlocksItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


public class CommonProxy{


	public void preInit(FMLPreInitializationEvent event){
		AllLightBlocksItems.init();
		AllLightBlocks.init();
		AllLightBlocks.register();
	}

	public void init(FMLInitializationEvent event){
	}

	public void posInit(FMLPostInitializationEvent event){
	}
}
