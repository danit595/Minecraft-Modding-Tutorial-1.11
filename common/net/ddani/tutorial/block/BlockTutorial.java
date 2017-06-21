package net.ddani.tutorial.block;

import net.ddani.tutorial.Tutorial;
import net.ddani.tutorial.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockTutorial extends Block {

	public BlockTutorial() {
		super(Material.IRON);
		setHardness(5.0f);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.METAL);
		setResistance(10.0f);		
	}

	@Override
	public String getUnlocalizedName() {
		return "tile." + Tutorial.resource_prefix + Names.tutorial_block;//item.tutorial:tutorial_block
	}
}
