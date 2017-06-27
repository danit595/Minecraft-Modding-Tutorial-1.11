package net.ddani.tutorial.item;

import net.ddani.tutorial.Tutorial;
import net.ddani.tutorial.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SteelIngot extends Item {

	public SteelIngot() {
		setMaxStackSize(64);
	}
	
	public void addRecipes(){
		//GameRegistry.addSmelting(,new ItemStack(this), 0.0f);
	}
	 
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + Tutorial.resource_prefix + Names.steel_ingot;//item.tutorial:tutorial_item
	}
}
