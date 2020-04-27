package com.implodium.implomod.init;

import com.implodium.implomod.blocks.BlockBase;
import com.implodium.implomod.blocks.InfiniteWater;
import com.implodium.implomod.blocks.InfiniteWaterFull;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.List;
import java.util.ArrayList;

public class ModBlocks
{
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block INFINITE_WATER = new InfiniteWater("infinite_water", Material.GLASS);
    public static final Block INFINITE_WATER_FULL = new InfiniteWaterFull("infinite_water_full", Material.GLASS);
}