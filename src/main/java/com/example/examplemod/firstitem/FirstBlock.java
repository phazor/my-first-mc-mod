package com.example.examplemod.firstitem;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstBlock extends Block {
    
    public FirstBlock() {
        super(Material.ROCK);
        System.out.println("TEST TEST");
        setUnlocalizedName("blah.firstblock");
//        setUnlocalizedName(MyFirstMod.MODID + ".firstblock");     // Used for localization (en_US.lang)
        setRegistryName("firstblock");        // The unique name (within your mod) that identifies this block
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }
}