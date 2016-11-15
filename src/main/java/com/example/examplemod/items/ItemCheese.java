package com.example.examplemod.items;

import com.example.examplemod.Reference;

import net.minecraft.item.Item;

public class ItemCheese extends Item {
	
	public ItemCheese() {
		setUnlocalizedName(Reference.TutorialItems.CHEESE.getUnlocalisedName());
		setRegistryName(Reference.TutorialItems.CHEESE.getRegistryName());
	}
}
