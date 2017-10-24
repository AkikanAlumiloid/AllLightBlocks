package com.akikan.AllLightBlocks.init.blocks.lumen16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockIce_Lumen16 extends BlockBreakable{
	public BlockIce_Lumen16(){
		super(Material.ICE, false);
		slipperiness = 0.98F;
		setRegistryName("ICE_LUMEN16");
		setUnlocalizedName("ICE_LUMEN16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		setSoundType(SoundType.GLASS);
		setResistance(2000.0F);
		setLightLevel(Reference.LUMEN_16);

	}
}
