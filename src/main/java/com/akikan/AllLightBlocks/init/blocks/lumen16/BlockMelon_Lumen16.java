package com.akikan.AllLightBlocks.init.blocks.lumen16;

import com.akikan.AllLightBlocks.init.AllLightBlocksTabs;
import com.akikan.AllLightBlocks.main.Reference;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockMelon_Lumen16 extends Block{
	public BlockMelon_Lumen16(){
		super(Material.GOURD, MapColor.LIME);
		setRegistryName("MELON_LUMEN16");
		setUnlocalizedName("MELON_LUMEN16");
		setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		setSoundType(SoundType.WOOD);
		setResistance(2000.0F);
		setLightLevel(Reference.LUMEN_16);
	}

	@Nullable
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return Items.MELON;
	}

	public int quantityDropped(Random random){
		return 3 + random.nextInt(5);
	}

	public int quantityDroppedWithBonus(int fortune, Random random){
		return Math.min(9, quantityDropped(random) + random.nextInt(1 + fortune));
	}
}
