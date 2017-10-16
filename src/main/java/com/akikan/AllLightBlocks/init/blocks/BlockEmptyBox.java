package com.akikan.AllLightBlocks.init.blocks;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockEmptyBox extends Block{
	public BlockEmptyBox(){
		super(Material.WOOD);
		setRegistryName("block_empty_box");
		setUnlocalizedName("block_empty_box");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocks);

	}
}
