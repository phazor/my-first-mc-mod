package com.example.examplemod.init;

import com.example.examplemod.Reference;
import com.example.examplemod.items.FirstItem;
import com.example.examplemod.items.ItemCheese;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static FirstItem firstItem;
    public static ItemCheese cheese;

    public static void init() {
    	cheese = new ItemCheese();
        firstItem = new FirstItem();
    }
    
    public static void register() {
    	GameRegistry.register(cheese);
    }
    
    public static void registerRenders() {
    	registerRender(cheese);
    }
    
    private static void registerRender(Item item) {
    	Minecraft.getMinecraft()
    		.getRenderItem()
    		.getItemModelMesher()
    		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" +item.getUnlocalizedName().substring(5), "inventory"));
    }
}