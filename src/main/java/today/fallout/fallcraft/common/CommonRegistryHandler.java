package today.fallout.fallcraft.common;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import today.fallout.fallcraft.FallCraftMod;
import today.fallout.fallcraft.block.*;
import today.fallout.fallcraft.entity.monster.*;
import today.fallout.fallcraft.item.FCItem3D;
import today.fallout.fallcraft.item.FCItemSlab;

import static today.fallout.fallcraft.creativetab.FCCreativeTabs.TAB_BLOCK;
import static today.fallout.fallcraft.creativetab.FCCreativeTabs.TAB_WEAPON;

public class CommonRegistryHandler
{
	public static Block block_crate_dark;
	public static Block block_crate_light;
	public static Block block_brick;

	// Non-full blocks
	public static Block block_radio;
	public static Block block_tv;
	public static Block block_trash;

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
	public static Item item_pistol_223;


	public static void registerItems()
	{
		GameRegistry.register(new FCItemSlab(block_metal_slab, block_metal_slab, block_metal_double_slab));
		GameRegistry.register(new FCItemSlab(block_steel_slab, block_steel_slab, block_steel_double_slab));

		item_pistol_223 = new FCItem3D("pistol_223", TAB_WEAPON);
	}

	public static void registerBlocks()
	{
		block_crate_dark = new BlockVariant("crate_light_block", TAB_BLOCK);
		block_crate_light = new BlockVariant("crate_dark_block", TAB_BLOCK);
		block_brick = new BlockVariant("brick_block", TAB_BLOCK);

		block_radio = new BlockRadio("radio_block", TAB_BLOCK);
		block_tv = new BlockRadio("tv_block", TAB_BLOCK);
		block_trash = new BlockTrash("trash_block", TAB_BLOCK);

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

	public static void registerEntities()
	{
		int mobID = 200;

		EntityRegistry.registerModEntity(EntityAnt.class, "Ant", mobID++, FallCraftMod.instance, 32, 1, false);
		EntityRegistry.registerEgg(EntityAnt.class, 51200, 16744448);
		EntityRegistry.registerModEntity(EntityCentaur.class, "Centaur", mobID++, FallCraftMod.instance, 32, 1, false);
		EntityRegistry.registerEgg(EntityCentaur.class, 51200, 1350046);
		EntityRegistry.registerModEntity(EntityFloater.class, "Floater", mobID++, FallCraftMod.instance, 32, 1, false);
		EntityRegistry.registerEgg(EntityFloater.class, 51200, 12480446);
		EntityRegistry.registerModEntity(EntityMolerat.class, "Molerat", mobID++, FallCraftMod.instance, 32, 1, false);
		EntityRegistry.registerEgg(EntityMolerat.class, 51200, 2650046);
		EntityRegistry.registerModEntity(EntitySporePlant.class, "Spore Plant", mobID++, FallCraftMod.instance, 32, 1, false);
		EntityRegistry.registerEgg(EntitySporePlant.class, 51200, 32768);
	}
}
