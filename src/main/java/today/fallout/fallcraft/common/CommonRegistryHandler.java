package today.fallout.fallcraft.common;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import today.fallout.fallcraft.FallCraftMod;
import today.fallout.fallcraft.block.*;
import today.fallout.fallcraft.entity.monster.*;
import today.fallout.fallcraft.item.FCItemArmor;
import today.fallout.fallcraft.item.FCItemSlab;
import today.fallout.fallcraft.item.ItemPistol;

import static net.minecraft.init.SoundEvents.ITEM_ARMOR_EQUIP_IRON;
import static today.fallout.fallcraft.creativetab.FCCreativeTabs.*;

public class CommonRegistryHandler
{
	public static final ItemArmor.ArmorMaterial MATERIAL_LEATHER = EnumHelper.addArmorMaterial("leather", "fallcraft:leather", 8, new int[] {1, 3, 2, 1}, 15, ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ItemArmor.ArmorMaterial MATERIAL_METAL = EnumHelper.addArmorMaterial("metal", "fallcraft:metal", 18, new int[] {2, 5, 3, 1}, 20, ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ItemArmor.ArmorMaterial MATERIAL_BATTLE = EnumHelper.addArmorMaterial("battle", "fallcraft:battle", 35, new int[] {2, 6, 5, 2}, 15, ITEM_ARMOR_EQUIP_IRON, 1.0F);
	public static final ItemArmor.ArmorMaterial MATERIAL_POWER = EnumHelper.addArmorMaterial("power", "fallcraft:power", 42, new int[] {3, 8, 6, 3}, 10, ITEM_ARMOR_EQUIP_IRON, 2.0F);

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

	// ARMOR
	public static ItemArmor item_leather_helmet;
	public static ItemArmor item_leather_chestplate;
	public static ItemArmor item_leather_legs;
	public static ItemArmor item_leather_boots;

	public static ItemArmor item_metal_helmet;
	public static ItemArmor item_metal_chestplate;
	public static ItemArmor item_metal_legs;
	public static ItemArmor item_metal_boots;



	public static void registerItems()
	{
		GameRegistry.register(new FCItemSlab(block_metal_slab, block_metal_slab, block_metal_double_slab));
		GameRegistry.register(new FCItemSlab(block_steel_slab, block_steel_slab, block_steel_double_slab));

		item_pistol_223 = new ItemPistol("pistol_223", TAB_WEAPON, 1, 5, 10, Items.ARROW, 300, 2000, 12, 3, 1.0F);

		item_leather_helmet = new FCItemArmor(MATERIAL_LEATHER, EntityEquipmentSlot.HEAD);
		item_leather_chestplate = new FCItemArmor(MATERIAL_LEATHER, EntityEquipmentSlot.CHEST);
		item_leather_legs = new FCItemArmor(MATERIAL_LEATHER, EntityEquipmentSlot.LEGS);
		item_leather_boots = new FCItemArmor(MATERIAL_LEATHER, EntityEquipmentSlot.FEET);

		item_metal_helmet = new FCItemArmor(MATERIAL_METAL, EntityEquipmentSlot.HEAD);
		item_metal_chestplate = new FCItemArmor(MATERIAL_METAL, EntityEquipmentSlot.CHEST);
		item_metal_legs = new FCItemArmor(MATERIAL_METAL, EntityEquipmentSlot.LEGS);
		item_metal_boots = new FCItemArmor(MATERIAL_METAL, EntityEquipmentSlot.FEET);

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
