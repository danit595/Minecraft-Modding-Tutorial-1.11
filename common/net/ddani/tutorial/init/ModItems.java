package net.ddani.tutorial.init;

import net.ddani.tutorial.Tutorial;
import net.ddani.tutorial.item.ItemTutorial;
import net.ddani.tutorial.lib.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

	public static ItemTutorial tutorialItem;
	public static void init() {
		
		tutorialItem = new ItemTutorial();
		tutorialItem.setRegistryName(new ResourceLocation(Tutorial.mod_id,Names.tutorial_item));
		GameRegistry.register(tutorialItem);
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		
		ModelResourceLocation model = new ModelResourceLocation(Tutorial.resource_prefix + Names.tutorial_item , "inventory");
		ModelLoader.registerItemVariants(tutorialItem, model);
		mesher.register(tutorialItem, 0, model); 
	}
}
