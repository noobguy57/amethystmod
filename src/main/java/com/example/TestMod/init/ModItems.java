package com.example.TestMod.init;

import com.example.TestMod.items.ItemDust;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.example.TestMod.Reference;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class ModItems {

    static Item amethyst_dust;

    public static void init() {
        amethyst_dust = new ItemDust("amethystdust").setCreativeTab(CreativeTabs.MATERIALS).setMaxStackSize(64);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(amethyst_dust);
    }
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(amethyst_dust);
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
