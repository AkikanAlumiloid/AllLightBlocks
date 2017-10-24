package com.akikan.AllLightBlocks.init.blocks.lumen16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.block.Block;

import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import javax.annotation.Nullable;

public class BlockSnowBlock_Lumen16 extends Block{
	public BlockSnowBlock_Lumen16(){
		super(Material.SNOW);
		setRegistryName("SNOWBLOCK_LUMEN16");
		setUnlocalizedName("SNOWBLOCK_LUMEN16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		setSoundType(SoundType.SNOW);
		setResistance(2000.0F);
		setLightLevel(Reference.LUMEN_16);
	}

	@Nullable

	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return Items.SNOWBALL;
	}

	public int quantityDropped(Random random){
		return 4;
	}
}
