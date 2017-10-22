package com.akikan.AllLightBlocks.init;

import com.akikan.AllLightBlocks.init.blocks.BlockStrongGlowstone;
import com.akikan.AllLightBlocks.init.blocks.lumen16.*;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AllLightBlocks{

	public static Block STRONG_GLOWSTONE;
	public static Block BONE_LUMEN16;
	public static Block BOOKSHELF_LUMEN16;
	public static Block CLAY_LUMEN16;
	public static Block DIRT_LUMEN16;
	public static Block GRASS_LUMEN16;
	public static Block GLASS_LUMEN16;

	public static void init(){
		STRONG_GLOWSTONE = new BlockStrongGlowstone();
		BONE_LUMEN16 = new BlockBone_Lumen16();
		BOOKSHELF_LUMEN16 = new BlockBookshelf_Lumen16();
		CLAY_LUMEN16 = new BlockClay_Lumen16();
		DIRT_LUMEN16 = new BlockDirt_Lumen16();
		GRASS_LUMEN16 = new BlockGrass_Lumen16();
		GLASS_LUMEN16 = new BlockGlass_Lumen16();
	}

	public static void register(){
		registerBlock(STRONG_GLOWSTONE);
		registerBlock(BONE_LUMEN16);
		registerBlock(BOOKSHELF_LUMEN16);
		registerBlock(CLAY_LUMEN16);
		registerBlock(DIRT_LUMEN16);
		registerBlock(GRASS_LUMEN16);
		registerBlock(GLASS_LUMEN16);
	}

	public static void registerBlock(Block block){
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}

	public static void registerRender(){
		registerRenders(STRONG_GLOWSTONE);
		registerRenders(BONE_LUMEN16);
		registerRenders(BOOKSHELF_LUMEN16);
		registerRenders(CLAY_LUMEN16);
		registerRenders(DIRT_LUMEN16);
		registerRenders(GRASS_LUMEN16);
		registerRenders(GLASS_LUMEN16);
	}

	public static void registerRenders(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
