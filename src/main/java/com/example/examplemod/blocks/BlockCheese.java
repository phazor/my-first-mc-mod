package com.example.examplemod.blocks;

import com.example.examplemod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockCheese extends Block {
	
	public BlockCheese() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.TutorialBlocks.CHEESE.getUnlocalisedName());
		setRegistryName(Reference.TutorialBlocks.CHEESE.getRegistryName());
		setHardness(1.0F);
		setSoundType(SoundType.SLIME);
	}

}
