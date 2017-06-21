package net.ddani.tutorial.block;

import net.ddani.tutorial.Tutorial;
import net.ddani.tutorial.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockTutorial extends Block {

	public BlockTutorial() {
		super(Material.IRON);
	}

	@Override
	public String getUnlocalizedName() {
		return "tile." + Tutorial.resource_prefix + Names.tutorial_block;//item.tutorial:tutorial_block
	}
}
