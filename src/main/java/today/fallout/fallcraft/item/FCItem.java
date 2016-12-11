package today.fallout.fallcraft.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import today.fallout.fallcraft.FallCraftMod;

public class FCItem extends Item
{
	public FCItem(String itemName, CreativeTabs itemCreativeTab)
	{
		this(itemName, itemCreativeTab, 1, 0);
	}

	public FCItem(String itemName, CreativeTabs itemCreativeTab, int itemStackSize)
	{
		this(itemName, itemCreativeTab, itemStackSize, 0);
	}

	public FCItem(String itemName, CreativeTabs itemCreativeTab, int itemStackSize, int itemMeta)
	{
		super();
		this.setUnlocalizedName(FallCraftMod.MODID + "." + itemName);
		this.setCreativeTab(itemCreativeTab);
		this.setMaxStackSize(itemStackSize);
		this.setRegistryName(this.getUnlocalizedName());
		GameRegistry.register(this);
		if ( FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			ModelLoader.setCustomModelResourceLocation(this, itemMeta, new ModelResourceLocation(FallCraftMod.MODID + ":" + itemName, "inventory"));
		}
	}
}
