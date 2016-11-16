package today.fallout.fallcraft.block;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public abstract class FCBlockSlab extends BlockSlab
{
	public FCBlockSlab(String blockName, CreativeTabs blockCreativeTab)
	{
		this(blockName, blockCreativeTab, 64);
	}

	public FCBlockSlab(String blockName, CreativeTabs blockCreativeTab, int stackSize)
	{
		super(Material.IRON);
		this.setRegistryName(blockName);
		this.setUnlocalizedName(this.getRegistryName().toString());

		if (!this.isDouble()) this.setCreativeTab(blockCreativeTab);
		IBlockState blockState = this.blockState.getBaseState();
		if (!this.isDouble()) blockState = blockState.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
		this.setDefaultState(blockState);
		this.useNeighborBrightness = !this.isDouble();

		GameRegistry.register(this);

		BlockSlab blockHalfSLab = new FCBlockHalfSlab(blockName, blockCreativeTab);
		BlockSlab blockDoubleSlab = new FCBlockDoubleSlab(blockName, blockCreativeTab);
		//GameRegistry.register(new ItemSlab(this, blockHalfSLab, blockDoubleSlab));

		Item item = Item.getItemFromBlock(this);
		item.setMaxStackSize(stackSize);
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString()));
		}
	}

	@Override
	public final String getUnlocalizedName(int metadata)
	{
		return this.getUnlocalizedName();
	}

	@Override
	public IProperty<?> getVariantProperty()
	{
		return null;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack)
	{
		return null;
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState iblockstate = this.getDefaultState();

		if (!this.isDouble())
		{
			iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
		}

		return iblockstate;
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;

		if (state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)
		{
			i |= 8;
		}

		return i;
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return this.isDouble() ? new BlockStateContainer(this, new IProperty[] {}): new BlockStateContainer(this, new IProperty[] {HALF});
	}
}
