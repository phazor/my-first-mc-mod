package com.example.examplemod.items;

import com.example.examplemod.Reference;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstItem extends Item {

    public FirstItem() {
        setRegistryName("firstitem");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(Reference.MODID + ".firstitem");     // Used for localization (en_US.lang)
    }
}
