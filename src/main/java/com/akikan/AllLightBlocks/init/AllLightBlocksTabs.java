package com.akikan.AllLightBlocks.init;

import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;



public class AllLightBlocksTabs{
	public static final CreativeTabs tabAllLightBlocks = new CreativeTabs(Reference.CREATIVE_TAB_NAME){
		@Override
		public Item getTabIconItem(){
			return AllLightBlocksItems.ARMY_PROVISIONS;
		}
	};
}
