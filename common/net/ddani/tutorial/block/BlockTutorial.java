package net.ddani.tutorial.block;

import net.ddani.tutorial.Tutorial;
import net.ddani.tutorial.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class BlockTutorial extends Block {

	public BlockTutorial() {
		super(Material.IRON);
		setHardness(5.0f);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.METAL);
		setResistance(10.0f);
		setCreativeTab(Tutorial.tabTutorial);
	}
	public void addRecipes() {
		GameRegistry.addShapedRecipe(new ItemStack(this), " l ", "lwl", " l ", 'l', Blocks.LADDER, 'w',new ItemStack(Blocks.WOOL, 1,OreDictionary.WILDCARD_VALUE ));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(this), "dld","lwl","dld", 'l',Blocks.LADDER, 'w', Blocks.WOOL, 'd', "dyeBlack"));
	}

	@Override
	public String getUnlocalizedName() {
		return "tile." + Tutorial.resource_prefix + Names.tutorial_block;//item.tutorial:tutorial_block
	}
}
