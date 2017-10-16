package com.akikan.AllLightBlocks.init;

import com.akikan.AllLightBlocks.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AllLightBlocksItems{

	// TODO 変数名をAllLightBlocksにふさわしいアイテム名に変える
	public static Item ARMY_PROVISIONS;

	public static void init(){
		ARMY_PROVISIONS = registerItem(new Item(), "army_provisions").setUnlocalizedName(
				"army_provisions").setCreativeTab(AllLightBlocksTabs.tabAllLightBlocksLumen16);
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
		registerRender(ARMY_PROVISIONS);
	}

	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
				item, 0, new ModelResourceLocation(item.getRegistryName(), "inventry")
		                                                                      );
	}
}
