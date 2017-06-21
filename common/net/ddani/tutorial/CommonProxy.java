package net.ddani.tutorial;

import net.ddani.tutorial.init.ModBlocks;
import net.ddani.tutorial.init.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event){
		
		ModItems.init();
		ModBlocks.init();
	}
	public void Init (FMLInitializationEvent event){
		
	}
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
