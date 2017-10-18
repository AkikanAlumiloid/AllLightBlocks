package com.akikan.AllLightBlocks.init;

import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class AllLightBlocksTabs{
	public static final CreativeTabs tabAllLightBlocksLumen16 = new CreativeTabs(Reference.CREATIVE_TAB_NAME_LUMEN16){
		@Override
		public Item getTabIconItem(){
			return AllLightBlocksItems.LUMEN16;
		}
	};

	public static final CreativeTabs TabAllLightBlocksLumen8 = new CreativeTabs(Reference.CREATIVE_TAB_NAME_LUMEN8){
		@Override
		public Item getTabIconItem(){
			return AllLightBlocksItems.LUMEN8;
		}
	};
}
