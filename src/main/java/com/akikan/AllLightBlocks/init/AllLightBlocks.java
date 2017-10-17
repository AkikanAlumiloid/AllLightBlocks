package com.akikan.AllLightBlocks.init;

import com.akikan.AllLightBlocks.init.blocks.BlockStrongGlowstone;
import com.akikan.AllLightBlocks.init.blocks.lumen16.BlockBone_Lumen16;
import com.akikan.AllLightBlocks.init.blocks.lumen16.BlockBookshelf_Lumen16;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBookshelf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AllLightBlocks{

//	public static Block EMPTY_BOX;//test
	public static Block STRONG_GLOWSTONE;
	public static Block BONE_LUMEN16;
	public static Block BOOKSHELF_LUMEN16;


	public static void init(){
//		EMPTY_BOX = new BlockEmptyBox();
		STRONG_GLOWSTONE = new BlockStrongGlowstone();
		BONE_LUMEN16 = new BlockBone_Lumen16();
		BOOKSHELF_LUMEN16 = new BlockBookshelf_Lumen16();
	}

	public static void register(){
//		registerBlock(EMPTY_BOX);
		registerBlock(STRONG_GLOWSTONE);
		registerBlock(BONE_LUMEN16);
		registerBlock(BOOKSHELF_LUMEN16);
	}

	public static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}

	public static void registerRender(){
//		registerRenders(EMPTY_BOX);
		registerRenders(STRONG_GLOWSTONE);
		registerRenders(BONE_LUMEN16);
		registerRenders(BOOKSHELF_LUMEN16);
	}

	public static void registerRenders(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
