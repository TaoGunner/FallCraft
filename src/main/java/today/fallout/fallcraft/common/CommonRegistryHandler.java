package today.fallout.fallcraft.common;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.fml.common.registry.GameRegistry;
import today.fallout.fallcraft.block.*;
import today.fallout.fallcraft.item.FCItemSlab;

import static today.fallout.fallcraft.creativetab.FCCreativeTabs.TAB_BLOCK;

public class CommonRegistryHandler
{
	public static Block block_crate_dark;
	public static Block block_crate_light;
	public static Block block_brick;

	// Non-full blocks
	public static Block block_radio;
	public static Block block_tv;
	public static Block block_trash;

	public static Block block_xander;

	// Metal
	public static Block block_metal;
	public static Block block_metal_stairs;
	public static Block block_metal_wall;
	public static Block block_metal_fence;
	public static BlockSlab block_metal_slab;
	public static BlockSlab block_metal_double_slab;

	// Steel
	public static Block block_steel;
	public static Block block_steel_stairs;
	public static Block block_steel_wall;
	public static Block block_steel_fence;
	public static BlockSlab block_steel_slab;
	public static BlockSlab block_steel_double_slab;

	// ITEMS
	public static Item item_xander_seed;

	public static void registerItems()
	{
		GameRegistry.register(new FCItemSlab(block_metal_slab, block_metal_slab, block_metal_double_slab));
		GameRegistry.register(new FCItemSlab(block_steel_slab, block_steel_slab, block_steel_double_slab));
		item_xander_seed = new ItemSeeds(block_xander, Blocks.DIRT);
	}

	public static void registerBlocks()
	{
		block_crate_dark = new BlockVariant("crate_light_block", TAB_BLOCK);
		block_crate_light = new BlockVariant("crate_dark_block", TAB_BLOCK);
		block_brick = new BlockVariant("brick_block", TAB_BLOCK);

		block_radio = new BlockRadio("radio_block", TAB_BLOCK);
		block_tv = new BlockRadio("tv_block", TAB_BLOCK);
		block_trash = new BlockTrash("trash_block", TAB_BLOCK);

		block_xander = new FCBlockPlant("xander_block");

		block_metal = new BlockVariant("metal_block", TAB_BLOCK);
		block_metal_stairs = new FCBlockStairs(block_metal, "metal_stairs", TAB_BLOCK);
		block_metal_wall = new FCBlockWall(block_metal, "metal_wall", TAB_BLOCK);
		block_metal_fence = new FCBlockFence("metal_fence", TAB_BLOCK);
		block_metal_slab = new FCBlockHalfSlab("metal_slab", TAB_BLOCK);
		block_metal_double_slab = new FCBlockDoubleSlab("metal_double_slab", TAB_BLOCK);

		block_steel = new BlockVariant("steel_block", TAB_BLOCK);
		block_steel_stairs = new FCBlockStairs(block_metal, "steel_stairs", TAB_BLOCK);
		block_steel_wall = new FCBlockWall(block_metal, "steel_wall", TAB_BLOCK);
		block_steel_fence = new FCBlockFence("steel_fence", TAB_BLOCK);
		block_steel_slab = new FCBlockHalfSlab("steel_slab", TAB_BLOCK);
		block_steel_double_slab = new FCBlockDoubleSlab("steel_double_slab", TAB_BLOCK);
	}
}
