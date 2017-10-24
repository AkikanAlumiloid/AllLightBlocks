package com.akikan.AllLightBlocks.init.blocks.lumen16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;

public class BlockHay_Lumen16 extends BlockRotatedPillar{
	public BlockHay_Lumen16(){
		super(Material.GRASS, MapColor.YELLOW);
		setDefaultState(blockState.getBaseState().withProperty(AXIS, EnumFacing.Axis.Y));
		setRegistryName("HAY_LUMEN16");
		setUnlocalizedName("HAY_LUMEN16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		setSoundType(SoundType.GROUND);
		setResistance(2000.0F);
		setLightLevel(Reference.LUMEN_16);
	}
}
