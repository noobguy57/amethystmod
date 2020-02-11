package com.example.TestMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class Amethyst extends Block
{
    public Amethyst(String name, Material material)
    {
        super(material);
        setUnlocalizedName("amethyst");
        setRegistryName("amethyst");

    }


}
