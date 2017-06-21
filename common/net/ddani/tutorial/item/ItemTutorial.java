package net.ddani.tutorial.item;

import net.ddani.tutorial.Tutorial;
import net.ddani.tutorial.lib.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemTutorial extends Item {
	
	public ItemTutorial() {
		setMaxStackSize(64);
		setCreativeTab(Tutorial.tabTutorial);
	}
	@Override
	 public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	 {	
		if(!worldIn.isRemote)
			playerIn.sendMessage(new TextComponentString("You used my Item!"));
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
	 }
	 
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + Tutorial.resource_prefix + Names.tutorial_item;//item.tutorial:tutorial_item
	}
	
}
