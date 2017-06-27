package net.ddani.tutorial.item;

import net.ddani.tutorial.Tutorial;
import net.ddani.tutorial.lib.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemTutorial extends Item {
	
	public ItemTutorial() {
		setMaxStackSize(64);
	}
	@Override
	 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	 {	
		if(!worldIn.isRemote)
			playerIn.sendMessage(new TextComponentString("You used my Item!"));
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	 }
	
	public void addRecipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(this), Items.BONE, Items.BONE, new ItemStack(Blocks.LOG,1,2));
	}
	 
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + Tutorial.resource_prefix + Names.tutorial_item;//item.tutorial:tutorial_item
	}
	
}
