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
	public static Block HARDENEDCLAY_LUMEN16;
	public static Block HAY_LUMEN16;
	public static Block ICE_LUMEN16;
	public static Block MAGMA_LUMEN16;
	public static Block MELON_LUMEN16;
	public static Block MYCELIUM_LUMEN16;
	public static Block NETHERBRICK_LUMEN16;
	public static Block NETHERRACK_LUMEN16;
	public static Block OBSIDIAN_LUMEN16;
	public static Block PACKEDICE_LUMEN16;
	public static Block SNOWBLOCK_LUMEN16;
	public static Block SOULSAND_LUMEN16;
	public static Block SPONGE_LUMEN16;
	public static Block STONE_LUMEN16;
	public static Block STONEBRICK_LUMEN16;

	public static void init(){
		STRONG_GLOWSTONE = new BlockStrongGlowstone();
		BONE_LUMEN16 = new BlockBone_Lumen16();
		BOOKSHELF_LUMEN16 = new BlockBookshelf_Lumen16();
		CLAY_LUMEN16 = new BlockClay_Lumen16();
		DIRT_LUMEN16 = new BlockDirt_Lumen16();
		GRASS_LUMEN16 = new BlockGrass_Lumen16();
		GLASS_LUMEN16 = new BlockGlass_Lumen16();
		HARDENEDCLAY_LUMEN16 = new BlockHardenedClay_lumen16();
		HAY_LUMEN16 = new BlockHay_Lumen16();
		ICE_LUMEN16 = new BlockIce_Lumen16();
		MAGMA_LUMEN16 = new BlockMagma_Lumen16();
		MELON_LUMEN16 = new BlockMelon_Lumen16();
		MYCELIUM_LUMEN16 = new BlockMycelium_Lumen16();
		NETHERBRICK_LUMEN16 = new BlockNetherBrick_Lumen16();
		NETHERRACK_LUMEN16 = new BlockNetherrack_Lumen16();
		OBSIDIAN_LUMEN16 = new BlockObsidian_Lumen16();
		PACKEDICE_LUMEN16 = new BlockPackedIce_Lumen16();
		SNOWBLOCK_LUMEN16 = new BlockSnowBlock_Lumen16();
		SOULSAND_LUMEN16 = new BlockSoulSand_Lumen16();
		SPONGE_LUMEN16 = new BlockSponge_Lumen16();
		STONE_LUMEN16 = new BlockStone_Lumen16();
		STONEBRICK_LUMEN16 = new BlockStoneBrick_Lumen16();

	}

	public static void register(){
		registerBlock(STRONG_GLOWSTONE);
		registerBlock(BONE_LUMEN16);
		registerBlock(BOOKSHELF_LUMEN16);
		registerBlock(CLAY_LUMEN16);
		registerBlock(DIRT_LUMEN16);
		registerBlock(GRASS_LUMEN16);
		registerBlock(GLASS_LUMEN16);
		registerBlock(HARDENEDCLAY_LUMEN16);
		registerBlock(HAY_LUMEN16);
		registerBlock(ICE_LUMEN16);
		registerBlock(MAGMA_LUMEN16);
		registerBlock(MELON_LUMEN16);
		registerBlock(MYCELIUM_LUMEN16);
		registerBlock(NETHERBRICK_LUMEN16);
		registerBlock(NETHERRACK_LUMEN16);
		registerBlock(OBSIDIAN_LUMEN16);
		registerBlock(PACKEDICE_LUMEN16);
		registerBlock(SNOWBLOCK_LUMEN16);
		registerBlock(SOULSAND_LUMEN16);
		registerBlock(SPONGE_LUMEN16);
		registerBlock(STONE_LUMEN16);
		registerBlock(STONEBRICK_LUMEN16);
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
		registerRenders(HARDENEDCLAY_LUMEN16);
		registerRenders(HAY_LUMEN16);
		registerRenders(ICE_LUMEN16);
		registerRenders(MAGMA_LUMEN16);
		registerRenders(MELON_LUMEN16);
		registerRenders(MYCELIUM_LUMEN16);
		registerRenders(NETHERBRICK_LUMEN16);
		registerRenders(NETHERRACK_LUMEN16);
		registerRenders(OBSIDIAN_LUMEN16);
		registerRenders(PACKEDICE_LUMEN16);
		registerRenders(SNOWBLOCK_LUMEN16);
		registerRenders(SOULSAND_LUMEN16);
		registerRenders(SPONGE_LUMEN16);
		registerRenders(STONE_LUMEN16);
		registerRenders(STONEBRICK_LUMEN16);
	}

	public static void registerRenders(Block block){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
