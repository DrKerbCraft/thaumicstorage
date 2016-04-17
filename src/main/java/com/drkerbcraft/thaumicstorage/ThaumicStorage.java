package com.drkerbcraft.thaumicstorage;

import com.drkerbcraft.thaumicstorage.init.ThaumicStorageItems;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ThaumicStorage.MODID, version = ThaumicStorage.VERSION)
public class ThaumicStorage
{
    public static final String MODID = "thaumicstorage";
    public static final String VERSION = "1.0";


    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ThaumicStorageItems.init();
        ThaumicStorageItems.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }


}
