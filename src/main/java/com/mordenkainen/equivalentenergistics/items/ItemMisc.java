package com.mordenkainen.equivalentenergistics.items;

import java.util.List;

import com.mordenkainen.equivalentenergistics.lib.Reference;
import com.mordenkainen.equivalentenergistics.registries.TextureEnum;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemMisc extends Item {

	public ItemMisc() {
		super();
		setHasSubtypes(true);
	}

	@Override
	public void registerIcons(final IIconRegister reg) {}
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(final int damage) {
        return TextureEnum.MISCITEM.getTexture(damage);
    }

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(final Item item, final CreativeTabs tab, final List list) {
		list.add(new ItemStack(item, 1, 0));
	}
	
	@Override
	public String getUnlocalizedName(final ItemStack stack) {
		return "item." + Reference.MOD_ID + ":" + "ItemMisc." + stack.getItemDamage();
	}
	
}