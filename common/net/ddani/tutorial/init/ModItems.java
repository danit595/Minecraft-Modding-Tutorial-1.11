package net.ddani.tutorial.init;

import net.ddani.tutorial.Tutorial;
import net.ddani.tutorial.item.ItemTutorial;
import net.ddani.tutorial.item.SteelIngot;
import net.ddani.tutorial.item.tool.ItemTutorialPickaxe;
import net.ddani.tutorial.lib.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

	public static ToolMaterial toolMaterial = EnumHelper.addToolMaterial(Tutorial.resource_prefix + "tut_mat",4,2048,10.0f,4.0f,16);
	
	public static ItemTutorial tutorialItem;
	public static SteelIngot steel_ingot;
	public static ItemPickaxe tutorialPickaxe;
	public static void init() {
		
		tutorialItem = new ItemTutorial();
		tutorialItem.setRegistryName(new ResourceLocation(Tutorial.mod_id,Names.tutorial_item));
		GameRegistry.register(tutorialItem);
		
		steel_ingot = new SteelIngot();
		steel_ingot.setRegistryName(new ResourceLocation(Tutorial.mod_id,Names.steel_ingot));
		GameRegistry.register(steel_ingot);
		
		tutorialPickaxe = register(new ItemTutorialPickaxe(), Names.pickaxe);
		//registerItem(new SteelIngot(), Names.steel_ingot);
		//registerItem(new ItemTutorial(), Names.tutorial_item);

	}	
	
	public static void initRecipes() {
		
		tutorialItem.addRecipes();
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		
		registerModel(mesher, tutorialItem, Names.tutorial_item);
		
		registerModel(mesher, steel_ingot, Names.steel_ingot);
		
		registerModel(mesher, tutorialPickaxe, Names.pickaxe);
	}
	
	
	///Helpers
	protected static <T extends Item> T register(T item, String name) {
		item.setRegistryName(new ResourceLocation(Tutorial.mod_id,name));
		GameRegistry.register(item);
		item.setCreativeTab(Tutorial.tabTutorial);
		item.setUnlocalizedName(Tutorial.resource_prefix + name);
		return item;		
	}
	
	@SideOnly(Side.CLIENT)
	protected static void registerModel(ItemModelMesher mesher,Item item , String name){
		ModelResourceLocation model = new ModelResourceLocation(Tutorial.resource_prefix + name ,"inventory");
		ModelLoader.registerItemVariants(item, model);
		mesher.register(item, 0,model);
	}	
}