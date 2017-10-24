package com.akikan.AllLightBlocks.init.blocks.lumen16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockSponge_Lumen16 extends Block{
	public BlockSponge_Lumen16(){
		super(Material.SPONGE);
		setRegistryName("SPONGE_LUMEN16");
		setUnlocalizedName("SPONGE_LUMEN16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		setSoundType(SoundType.CLOTH);
		setResistance(2000.0F);
		setLightLevel(Reference.LUMEN_16);
	}
}
