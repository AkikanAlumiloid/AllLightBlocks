package com.akikan.AllLightBlocks.init.blocks;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockStrongGlowstone extends BlockGlowstone{
	public BlockStrongGlowstone(){
		super(Material.SPONGE);
		setRegistryName("strong_glowstone");
		setUnlocalizedName("strong_glowstone");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocks);
		setSoundType(SoundType.CLOTH);
		setResistance(2000.0F);
		setLightLevel(1.0F);
	}
}
