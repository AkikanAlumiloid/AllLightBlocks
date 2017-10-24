package com.akikan.AllLightBlocks.init.blocks.lumen16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockMagma_Lumen16 extends Block{
	public BlockMagma_Lumen16(){
		super(Material.ROCK);
		setRegistryName("MAGMA_LUMEN16");
		setUnlocalizedName("MAGMA_LUMEN16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		setSoundType(SoundType.STONE);
		setResistance(2000.0F);
		setLightLevel(Reference.LUMEN_16);
	}
}
