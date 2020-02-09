package com.example.TestMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Amethyst extends Block
{
    public Amethyst(String name, Material material)
    {
        super(Material.ROCK);
        setUnlocalizedName("amethystore");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setRegistryName("amethystore");
        setHardness(4.0F);
        setHarvestLevel("pickaxe", 2); // 2 = iron or greater 1 = stone, 0 = wood/gold
        setSoundType(SoundType.STONE);
        setLightLevel(1.0F);
    }
}
