package net.ddani.tutorial;

import java.util.Random;

import net.ddani.tutorial.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Tutorial.mod_id,name = Tutorial.mod_name,version = Tutorial.version,dependencies = Tutorial.dependencies)
public class Tutorial {
	public static final String 
			mod_id = "tutorial", 
			mod_name = "Advanced Evolution",
			version="0.1",
			dependencies="required-after:forge@[13.19.1.2188,)",
			resource_prefix= mod_id.toLowerCase() + ":"
			;
	//Variables
	public static Random random = new Random();
	
	@Instance(mod_id)
	public static Tutorial instance;
	
	@SidedProxy(clientSide = "net.ddani.tutorial.ClientProxy", serverSide = "net.ddani.tutorial.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.preInit(event);
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.Init(event);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
	}
	
	public static CreativeTabs tabTutorial = new CreativeTabs("tab_tutorial") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.tutorialItem);
		}
	};
}
