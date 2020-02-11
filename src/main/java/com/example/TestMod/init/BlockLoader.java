package com.example.TestMod.init;

import com.example.TestMod.Reference;
import com.example.TestMod.blocks.Amethyst;
import com.example.TestMod.blocks.BlockOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid= Reference.MOD_ID)
public class BlockLoader {

    public static Block amethyst;
    static Block Amethyst;



    public static void init() {
        Amethyst = new Amethyst("amethyst", Material.ROCK);
        amethyst.setHarvestLevel("pickaxe",2);
        amethyst = new BlockOre("amethyst", Material.ROCK, ModItems.amethyst_dust, 1, 5).setHardness(3f).setResistance(5f).setCreativeTab(CreativeTabs.BUILDING_BLOCKS);

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(Amethyst);
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(new ItemBlock(amethyst).setRegistryName(amethyst.getRegistryName()));
        event.getRegistry().registerAll(new ItemBlock(Amethyst).setRegistryName(Amethyst.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        registerRender(Item.getItemFromBlock(amethyst));
        registerRender(Item.getItemFromBlock(Amethyst));
    }

    public static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}