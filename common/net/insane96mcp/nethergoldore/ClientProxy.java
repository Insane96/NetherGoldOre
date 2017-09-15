package net.insane96mcp.nethergoldore;

import net.insane96mcp.nethergoldore.init.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void PreInit(FMLPreInitializationEvent event) {
		super.PreInit(event);
	}

	@Override
	public void Init(FMLInitializationEvent event) {
		super.Init(event);
		ModBlocks.InitClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
	}

	@Override
	public void PostInit(FMLPostInitializationEvent event) {
		super.PostInit(event);
	}
	
}
