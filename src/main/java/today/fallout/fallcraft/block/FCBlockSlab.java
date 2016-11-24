package today.fallout.fallcraft.block;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

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

		GameRegistry.register(this);
	}

	@Override
	public String getUnlocalizedName(int meta)
	{
		return this.getUnlocalizedName();
	}

	@Override
	public boolean isDouble() { return false; }

	@Override
	public IProperty<?> getVariantProperty() { return null; }

	public Comparable<?> getTypeForItem(ItemStack stack) { return null; }

	@Override
	@SuppressWarnings("deprecation")
	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState iblockstate = this.getDefaultState();

		if (!this.isDouble()) iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);

		return iblockstate;
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;

		if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP) i |= 8;

		return i;
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return this.isDouble() ? new BlockStateContainer(this): new BlockStateContainer(this, HALF);
	}
}
