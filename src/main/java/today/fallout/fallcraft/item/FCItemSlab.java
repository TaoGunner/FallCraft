package today.fallout.fallcraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FCItemSlab extends ItemBlock
{
	private final BlockSlab singleSlab;
	private final BlockSlab doubleSlab;

	public FCItemSlab(Block block, BlockSlab singleSlab, BlockSlab doubleSlab)
	{
		super(block);
		this.singleSlab = singleSlab;
		this.doubleSlab = doubleSlab;
		this.setMaxDamage(0);
		this.setHasSubtypes(false);
		this.setRegistryName(block.getRegistryName());
		this.setUnlocalizedName(this.getRegistryName().toString());
		if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName().toString()));
		}
	}

	@Override
	public int getMetadata(int par1int)
	{
		return 0;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return this.singleSlab.getUnlocalizedName();
	}

	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		if (stack.stackSize != 0 && playerIn.canPlayerEdit(pos.offset(facing), facing, stack))
		{
			//Comparable<?> comparable = this.singleSlab.getTypeForItem(stack);
			IBlockState iblockstate = worldIn.getBlockState(pos);

			if (iblockstate.getBlock() == this.singleSlab)
			{
				//IProperty<?> iproperty = this.singleSlab.getVariantProperty();
				//Comparable<?> comparable1 = iblockstate.getValue(iproperty);
				BlockSlab.EnumBlockHalf blockslab$enumblockhalf = (BlockSlab.EnumBlockHalf)iblockstate.getValue(BlockSlab.HALF);

				// if ((facing == EnumFacing.UP && blockslab$enumblockhalf == BlockSlab.EnumBlockHalf.BOTTOM || facing == EnumFacing.DOWN && blockslab$enumblockhalf == BlockSlab.EnumBlockHalf.TOP) && comparable1 == comparable)
				if (facing == EnumFacing.UP && blockslab$enumblockhalf == BlockSlab.EnumBlockHalf.BOTTOM || facing == EnumFacing.DOWN && blockslab$enumblockhalf == BlockSlab.EnumBlockHalf.TOP)
				{
					//IBlockState iblockstate1 = this.makeState(iproperty, comparable1);
					IBlockState iblockstate1 = this.doubleSlab.getDefaultState();
					AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(worldIn, pos);

					if (axisalignedbb != Block.NULL_AABB && worldIn.checkNoEntityCollision(axisalignedbb.offset(pos)) && worldIn.setBlockState(pos, iblockstate1, 11))
					{
						SoundType soundtype = this.doubleSlab.getSoundType(iblockstate1, worldIn, pos,playerIn);
						worldIn.playSound(playerIn, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
						--stack.stackSize;
					}

					return EnumActionResult.SUCCESS;
				}
			}

			return this.tryPlace(playerIn, stack, worldIn, pos.offset(facing), null) ? EnumActionResult.SUCCESS : super.onItemUse(stack, playerIn, worldIn, pos, hand, facing, hitX, hitY, hitZ);
		}
		else
		{
			return EnumActionResult.FAIL;
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean canPlaceBlockOnSide(World worldIn, BlockPos pos, EnumFacing side, EntityPlayer player, ItemStack stack)
	{
		BlockPos blockpos = pos;
		//IProperty<?> iproperty = this.singleSlab.getVariantProperty();
		//Comparable<?> comparable = this.singleSlab.getTypeForItem(stack);
		IBlockState iblockstate = worldIn.getBlockState(pos);

		if (iblockstate.getBlock() == this.singleSlab)
		{
			boolean flag = iblockstate.getValue(BlockSlab.HALF) == BlockSlab.EnumBlockHalf.TOP;

			// if ((side == EnumFacing.UP && !flag || side == EnumFacing.DOWN && flag) && comparable == iblockstate.getValue(iproperty))
			if ((side == EnumFacing.UP && !flag || side == EnumFacing.DOWN && flag)) return true;
		}

		pos = pos.offset(side);
		IBlockState iblockstate1 = worldIn.getBlockState(pos);
		// return iblockstate1.getBlock() == this.singleSlab && comparable == iblockstate1.getValue(iproperty) ? true : super.canPlaceBlockOnSide(worldIn, blockpos, side, player, stack);
		return iblockstate1.getBlock() == this.singleSlab ? true : super.canPlaceBlockOnSide(worldIn, blockpos, side, player, stack);
	}

	private boolean tryPlace(EntityPlayer player, ItemStack stack, World worldIn, BlockPos pos, Object itemSlabType)
	{
		IBlockState iblockstate = worldIn.getBlockState(pos);

		if (iblockstate.getBlock() == this.singleSlab)
		{
			// Comparable<?> comparable = iblockstate.getValue(this.singleSlab.getVariantProperty());

			//if (comparable == itemSlabType)
			//{
				// IBlockState iblockstate1 = this.makeState(this.singleSlab.getVariantProperty(), comparable);
				IBlockState iblockstate1 = this.doubleSlab.getDefaultState();
				AxisAlignedBB axisalignedbb = iblockstate1.getCollisionBoundingBox(worldIn, pos);

				if (axisalignedbb != Block.NULL_AABB && worldIn.checkNoEntityCollision(axisalignedbb.offset(pos)) && worldIn.setBlockState(pos, iblockstate1, 11))
				{
					SoundType soundtype = this.doubleSlab.getSoundType(iblockstate1, worldIn, pos, player);
					worldIn.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
					--stack.stackSize;
				}

				return true;
			//}
		}

		return false;
	}
}
