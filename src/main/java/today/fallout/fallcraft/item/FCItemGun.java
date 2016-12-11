package today.fallout.fallcraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public abstract class FCItemGun extends FCItem
{
	public int damageMin;
	public int damageMax;
	public int strRequired;
	public int shotCooldown;
	public int reloadCooldown;
	protected Item itemAmmo;
	protected int clipSize;
	public float basePrecision;

	public FCItemGun(String itemName, CreativeTabs itemCreativeTab, int itemStackSize, int damageMin, int damageMax, Item itemAmmo, int shotCooldown, int reloadCooldown, int clipSize, int strRequired, float basePrecision)
	{
		super(itemName, itemCreativeTab, itemStackSize);
		this.damageMin = damageMin;
		this.damageMax = damageMax;
		this.itemAmmo = itemAmmo;
		this.shotCooldown = shotCooldown;
		this.reloadCooldown = reloadCooldown;
		this.clipSize = clipSize;
		this.strRequired = strRequired;
		this.basePrecision = basePrecision;
	}

	@Override
	public boolean onEntitySwing(EntityLivingBase par1entityLiving, ItemStack par2ItemStack)
	{
		return true;
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity)
	{
		return true;
	}

	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) { return true; }

	@Override
	public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) { return slotChanged; }

	@Override
	public boolean showDurabilityBar(ItemStack stack) { return stack.hasTagCompound() ? true : false; }

	@Override
	public double getDurabilityForDisplay(ItemStack stack) { return 1.0D - ((double)getClip(stack) / (double)clipSize); }

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected)
	{
		if (!worldIn.isRemote)
		{
			if (!stack.hasTagCompound())
			{
				stack.setTagCompound(new NBTTagCompound());
				stack.getTagCompound().setInteger("ammo", clipSize);
				stack.getTagCompound().setLong("lastShot", System.currentTimeMillis());
			}
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public abstract void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced);

	public abstract void shoot(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer);

	public int getClip(ItemStack stack) { return stack.getTagCompound().getInteger("ammo"); }

	public void setClip(ItemStack stack, int count) { stack.getTagCompound().setInteger("ammo", count); }
}
