package com.akikan.AllLightBlocks.init.blocks.lux16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.init.blocks.LuxInterface;
import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBone_Lux16 extends BlockRotatedPillar implements LuxInterface{

	public BlockBone_Lux16(){
		super(Material.ROCK);
		setRegistryName("Bone_Lux16");
		setUnlocalizedName("Bone_Lux16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocks);
		setSoundType(SoundType.CLOTH);
		setResistance(2000.0F);
		luxSetting();
	}

	@Override
	public void luxSetting(){
		setLightLevel(Reference.LUX_16);
	}

}
