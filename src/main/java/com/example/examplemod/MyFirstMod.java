package com.example.examplemod;

import org.apache.logging.log4j.Logger;

import com.example.examplemod.init.ModBlocks;
import com.example.examplemod.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.MODVERSION, dependencies = "required-after:Forge@[11.16.0.1865,)", useMetadata = true)
public class MyFirstMod {

    @SidedProxy
    public static CommonProxy proxy;

    @Mod.Instance
    public static MyFirstMod instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
      // some example code
      System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

    public static class CommonProxy {
        public void preInit(FMLPreInitializationEvent e) {
            // Initialization of blocks and items typically goes here:
			 ModItems.init();
			 ModItems.register();
			 
			 ModBlocks.init();
			 ModBlocks.register();
        }

        public void init(FMLInitializationEvent e) {
    
        }

        public void postInit(FMLPostInitializationEvent e) {
    
        }
    }


    public static class ClientProxy extends CommonProxy {
        @Override
        public void preInit(FMLPreInitializationEvent e) {
            super.preInit(e);
        }
        
        @Override
        public void init(FMLInitializationEvent e) {
        	super.init(e);
            ModItems.registerRenders();
            ModBlocks.registerRenders();
        }
    }

    public static class ServerProxy extends CommonProxy {
    
    }
}
