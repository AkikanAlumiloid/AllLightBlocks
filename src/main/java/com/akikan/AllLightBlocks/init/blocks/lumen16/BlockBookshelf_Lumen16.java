package com.akikan.AllLightBlocks.init.blocks.lumen16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.init.blocks.LumenInterface;
import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockBookshelf_Lumen16 extends Block implements LumenInterface{
	public BlockBookshelf_Lumen16(){
		super(Material.WOOD);
		setRegistryName("BOOKSHELF_LUMEN16");
		setUnlocalizedName("BOOKSHELF_LUMEN16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		setSoundType(SoundType.WOOD);
		setResistance(2000.0F);
		lumenSetting(Reference.LUMEN_16);
	}

	@Override
	public void lumenSetting(float f){
		setLightLevel(f);
	}
}