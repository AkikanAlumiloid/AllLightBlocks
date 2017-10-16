package com.akikan.AllLightBlocks.init;

import com.akikan.AllLightBlocks.init.blocks.BlockEmptyBox;
import com.akikan.AllLightBlocks.init.blocks.BlockStrongGlowstone;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AllLightBlocks{

	public static Block EMPTY_BOX;//test
	public static Block STRONG_GLOWSTONE;

	public static void init(){
		EMPTY_BOX = new BlockEmptyBox();
		STRONG_GLOWSTONE = new BlockStrongGlowstone();
	}

	public static void register(){
		registerBlock(EMPTY_BOX);
		registerBlock(STRONG_GLOWSTONE);
	}

	public static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}

	public static void registerRender(){
		registerRenders(EMPTY_BOX);
		registerRenders(STRONG_GLOWSTONE);
	}

	public static void registerRenders(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
