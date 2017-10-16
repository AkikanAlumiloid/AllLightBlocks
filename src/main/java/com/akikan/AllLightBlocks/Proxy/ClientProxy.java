package com.akikan.AllLightBlocks.Proxy;

import com.akikan.AllLightBlocks.init.AllLightBlocks;
import com.akikan.AllLightBlocks.init.AllLightBlocksItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent event){
		super.preInit(event);

//		AllLightBlocksItems.init();
//		AllLightBlocks.init();
//		AllLightBlocks.register();
	}

	@Override
	public void init(FMLInitializationEvent event){
		super.init(event);

		AllLightBlocksItems.registerRender();

		AllLightBlocks.registerRender();
	}

	@Override
	public void posInit(FMLPostInitializationEvent event){
		super.posInit(event);
	}
}
