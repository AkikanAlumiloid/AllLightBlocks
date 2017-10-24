package com.akikan.AllLightBlocks.init.blocks.lumen16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockLog_Lumen16 extends BlockRotatedPillar{
	public BlockLog_Lumen16(){
		super(Material.WOOD);
		setRegistryName("LOG_LUMEN16");
		setUnlocalizedName("LOG_LUMEN16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		setSoundType(SoundType.WOOD);
		setResistance(2000.0F);
		setLightLevel(Reference.LUMEN_16);
	}
}
