package today.fallout.fallcraft.common;

import net.minecraft.block.Block;
import today.fallout.fallcraft.block.*;

import static today.fallout.fallcraft.creativetab.FCCreativeTabs.TAB_BLOCK;

public class CommonRegistryHandler
{
	public static Block block_metal;
	public static Block block_metal_stairs;
	public static Block block_metal_wall;
	public static Block block_metal_fence;
	public static Block block_metal_slab;
	//public static Block block_metal_double_slab;

	public static void registerItems()
	{
	}

	public static void registerBlocks()
	{
		block_metal = new BlockVariant("metal_block", TAB_BLOCK);
		block_metal_stairs = new FCBlockStairs(block_metal, "metal_stairs", TAB_BLOCK);
		block_metal_wall = new FCBlockWall(block_metal, "metal_wall", TAB_BLOCK);
		block_metal_fence = new FCBlockFence("metal_fence", TAB_BLOCK);
		block_metal_slab = new FCBlockHalfSlab("metal_slab", TAB_BLOCK);
		//block_metal_double_slab = new FCBlockDoubleSlab("metal_double_slab", TAB_BLOCK);
	}
}
