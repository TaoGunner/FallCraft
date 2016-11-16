package today.fallout.fallcraft.block;

import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BlockVariant extends FCBlock
{
	public static final PropertyInteger VARIANT = PropertyInteger.create("variant", 0, 3);

	public BlockVariant(String blockName, CreativeTabs blockCreativeTab)
	{
		this(blockName, blockCreativeTab, 64);
	}

	public BlockVariant(String blockName, CreativeTabs blockCreativeTab, int stackSize)
	{
		super(blockName, blockCreativeTab, stackSize);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, 0));
	}

	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		return this.getDefaultState().withProperty(VARIANT, new Random().nextInt(3));
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, VARIANT);
	}

	@Override
	public int getMetaFromState(IBlockState state) { return state.getValue(VARIANT); }
}
