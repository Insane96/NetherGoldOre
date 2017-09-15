package net.insane96mcp.nethergoldore.lib;

import net.insane96mcp.nethergoldore.NetherGoldOre;
import net.insane96mcp.nethergoldore.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = NetherGoldOre.MOD_ID)
public class RegistryEventHandler {

	//1.12 Register Items and Blocks
	@SubscribeEvent
	public static void RegisterBlocks(RegistryEvent.Register<Block> event) {
		for (Block block : ModBlocks.BLOCKS)
			event.getRegistry().register(block);
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void RegisterModels(ModelRegistryEvent event) {
		for (Block block : ModBlocks.BLOCKS) {
			Item item = Item.getItemFromBlock(block);
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		}
	}
}