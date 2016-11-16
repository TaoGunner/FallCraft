package today.fallout.fallcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class FCBlockWall extends BlockWall
{
	public FCBlockWall(Block block, String blockName, CreativeTabs blockCreativeTab)
	{
		this(block, blockName, blockCreativeTab, 64);
	}

	public FCBlockWall(Block block, String blockName, CreativeTabs blockCreativeTab, int stackSize)
	{
		super(block);
		this.setRegistryName(blockName);
		this.setUnlocalizedName(this.getRegistryName().toString());
		this.setCreativeTab(blockCreativeTab);
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		Item item = Item.getItemFromBlock(this);
		item.setMaxStackSize(stackSize);
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString()));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
	{
		list.add(new ItemStack(itemIn, 1, 0));
	}
}
