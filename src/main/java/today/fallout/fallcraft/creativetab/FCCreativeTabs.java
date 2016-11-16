package today.fallout.fallcraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import today.fallout.fallcraft.FallCraftMod;

public class FCCreativeTabs
{
	public static final CreativeTabs TAB_WEAPON = new CreativeTabs(FallCraftMod.MODID + "." + "weapon")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() { return Items.FLOWER_POT; }
	};

	public static final CreativeTabs TAB_AMMO = new CreativeTabs(FallCraftMod.MODID + "." + "ammo")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() { return Items.APPLE; }
	};

	public static final CreativeTabs TAB_MISC = new CreativeTabs(FallCraftMod.MODID + "." + "misc")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() { return Items.IRON_CHESTPLATE; }
	};

	public static final CreativeTabs TAB_USABLE = new CreativeTabs(FallCraftMod.MODID + "." + "usable")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() { return Items.GOLDEN_HOE; }
	};

	public static final CreativeTabs TAB_ARMOR = new CreativeTabs(FallCraftMod.MODID + "." + "armor")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() { return Items.SNOWBALL; }
	};

	public static final CreativeTabs TAB_BLOCK = new CreativeTabs(FallCraftMod.MODID + "." + "block")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() { return Items.COMMAND_BLOCK_MINECART; }
	};
}
