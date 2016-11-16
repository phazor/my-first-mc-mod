package com.example.examplemod.init;

import com.example.examplemod.blocks.BlockCheese;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static Block cheese;
	
    public static void init() {
    	cheese = new BlockCheese();
    }
     
    public static void register() {
    	registerBlock(cheese);
    }
    
    private static void registerBlock(Block block) {
    	GameRegistry.register(block);
    	GameRegistry.register(new ItemBlock(block), block.getRegistryName());
    }
    
    public static void registerRenders() {
    	registerRender(cheese);
    }
    
    private static void registerRender(Block block) {
    	Minecraft.getMinecraft()
    		.getRenderItem()
    		.getItemModelMesher()
    		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
