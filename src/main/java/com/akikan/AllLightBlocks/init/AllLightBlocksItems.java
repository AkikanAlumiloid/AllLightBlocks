package com.akikan.AllLightBlocks.init;

import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AllLightBlocksItems{

	// TODO このMOD用のクリエイティブタブ用にアイテムを登録し、タブの絵柄として登録させる
	public static Item LUMEN16;
	public static Item LUMEN8;
	//	public static Item LUMEN0;

	public static void init(){
		LUMEN16 = registerItem(new Item(), "alllightblocks16icon").setUnlocalizedName("alllightblocks16icon")
				.setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
		LUMEN8 = registerItem(new Item(), "alllightblocks8icon").setUnlocalizedName("alllightblocks8icon")
				.setCreativeTab(AllLightBlocksTabs.TabAllLightBlocksLumen8);
	}

	public static Item registerItem(
			Item item, String registryName){
		return registerItem(item, registryName, null);
	}

	public static Item registerItem(
			Item item, String registryName, CreativeTabs tab){
		GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID, registryName));
		return item;
	}

	public static void registerRender(){
				registerRender(LUMEN16);
				registerRender(LUMEN8);
	}

	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
				.register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventry"));
	}
}
