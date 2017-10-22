package com.akikan.AllLightBlocks.init.blocks.lumen16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockGlass_Lumen16 extends BlockBreakable{
	public BlockGlass_Lumen16(){
		super(Material.GLASS, true);
		setRegistryName("GLASS_LUMEN16");
		setUnlocalizedName("GLASS_LUMEN16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		setSoundType(SoundType.GLASS);
		setResistance(2000.0F);
		setLightLevel(Reference.LUMEN_16);
	}
}
