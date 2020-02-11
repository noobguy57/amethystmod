package com.example.TestMod;

import com.example.TestMod.init.BlockLoader;
import com.example.TestMod.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_MINECRAFT_VERSIONS)
public class TestMod {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println(Reference.MOD_ID + ":preInit");
        BlockLoader.init();
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(Reference.MOD_ID + ":init");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        System.out.println(Reference.MOD_ID + ":postInit");
    }
}