package net.ddani.tutorial;

import net.ddani.tutorial.init.ModItems;
import net.minecraft.client.Minecraft;
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
		
		ModItems.initClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
	}
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		
		super.postInit(event);
	}
}	
