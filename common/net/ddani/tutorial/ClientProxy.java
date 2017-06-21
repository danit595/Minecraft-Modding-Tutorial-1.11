package net.ddani.tutorial;

import net.ddani.tutorial.init.ModBlocks;
import net.ddani.tutorial.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		
		super.preInit(event);
	}
	@Override
	public void Init(FMLInitializationEvent event) {
		
		super.Init(event);
		
		ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
		ModItems.initClient(mesher);
		ModBlocks.initClient(mesher);
	}
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		
		super.postInit(event);
	}
}	
