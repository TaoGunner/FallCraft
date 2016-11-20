package today.fallout.fallcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockTrash extends FCBlock
{
	public static final PropertyDirection FACING = BlockHorizontal.FACING;
	static AxisAlignedBB bBoxX = new AxisAlignedBB(0.375D, 0.0D, 0.1875D, 0.625D, 0.3125D, 0.8125D);
	static AxisAlignedBB bBoxY = new AxisAlignedBB(0.1875D, 0.0D, 0.375D, 0.8125D, 0.3125D, 0.625D);

	public BlockTrash(String blockName, CreativeTabs blockCreativeTab)
	{
		super(blockName, blockCreativeTab);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}

	@Override   // Делаем куб прозрачным
	@SuppressWarnings("deprecation")
	public boolean isOpaqueCube(IBlockState state) { return false; }

	@Override   // Убираем тени
	@SuppressWarnings("deprecation")
	public boolean isFullCube(IBlockState state) { return false; }

	@Override   // Убираем проблемы рендеринга
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}

	@Override   // Область взаимодействия с игроком
	@SuppressWarnings("deprecation")
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);
		return enumfacing.getAxis() == EnumFacing.Axis.X ? bBoxX : bBoxY;
	}

	@Override   // Запрещаем ставить на неполные блоки
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	{
		return worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos) && worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos, EnumFacing.UP);
	}

	@Override   // Событие при изменение блока снизу
	@SuppressWarnings("deprecation")
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn)
	{
		if (!worldIn.isRemote)
		{
			boolean flag = false;
			if (!worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos.down(), EnumFacing.UP))
			{
				flag = true;
			}

			if (flag && !worldIn.isAirBlock(pos))
			{
				this.dropBlockAsItem(worldIn, pos, state, 0);
				worldIn.setBlockToAir(pos);
			}
		}
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, FACING);
	}

	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing());
	}

	@Override
	@SuppressWarnings("deprecation")
	public IBlockState getStateFromMeta(int meta)
	{
		EnumFacing enumfacing = EnumFacing.getFront(meta);
		if (enumfacing.getAxis() == EnumFacing.Axis.Y) { enumfacing = EnumFacing.NORTH; }
		return this.getDefaultState().withProperty(FACING, enumfacing);
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return state.getValue(FACING).getIndex();
	}
}
