package com.akikan.AllLightBlocks.init.blocks.lumen16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockDirt_Lumen16 extends Block{

	public BlockDirt_Lumen16(){
		super(Material.GROUND);
		setRegistryName("DIRT_LUMEN16");
		setUnlocalizedName("DIRT_LUMEN16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		setSoundType(SoundType.GROUND);
		setResistance(2000.0F);
		setLightLevel(Reference.LUMEN_16);
	}
}
