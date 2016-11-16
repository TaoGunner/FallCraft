package today.fallout.fallcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class FCBlockStairs extends BlockStairs
{
	public FCBlockStairs(Block block, String blockName, CreativeTabs blockCreativeTab)
	{
		this(block, blockName, blockCreativeTab, 64);
	}

	public FCBlockStairs(Block block, String blockName, CreativeTabs blockCreativeTab, int stackSize)
	{
		super(block.getDefaultState());
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
}
