package com.akikan.AllLightBlocks.init.blocks.lumen16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.init.blocks.LumenInterface;
import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBone_Lumen16 extends BlockRotatedPillar implements LumenInterface{

	public BlockBone_Lumen16(){
		super(Material.ROCK);
		setRegistryName("BONE_LUMEN16");
		setUnlocalizedName("BONE_LUMEN16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		setSoundType(SoundType.STONE);
		setResistance(2000.0F);
		lumenSetting(Reference.LUMEN_16);
	}

	@Override
	public void lumenSetting(float f){
		setLightLevel(f);
	}

}
