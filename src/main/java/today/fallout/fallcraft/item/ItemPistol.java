package today.fallout.fallcraft.item;

import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import today.fallout.fallcraft.FallCraftMod;

import java.util.List;

public class ItemPistol extends FCItemGun
{
	public ItemPistol(String itemName, CreativeTabs itemCreativeTab, int itemStackSize, int damageMin, int damageMax, Item itemAmmo, int shotCooldown, int reloadCooldown, int clipSize, int strRequired, float basePrecision)
	{
		super(itemName, itemCreativeTab, itemStackSize, damageMin, damageMax, itemAmmo, shotCooldown, reloadCooldown, clipSize, strRequired, basePrecision);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced)
	{
		tooltip.add("§6" + I18n.format("tooltip." + FallCraftMod.MODID + ".damage") + "§r : " + damageMin + " - " + damageMax);
		tooltip.add("§6" + I18n.format("tooltip." + FallCraftMod.MODID + ".ammo") + "§r : " + I18n.format(itemAmmo.getUnlocalizedName() + ".name"));
		tooltip.add("§6" + I18n.format("tooltip." + FallCraftMod.MODID + ".clip") + "§r : " + clipSize);
		tooltip.add("§o" + I18n.format("tooltip." + this.getUnlocalizedName().substring(5) + ".desc1") + "§r");
		tooltip.add("§o" + I18n.format("tooltip." + this.getUnlocalizedName().substring(5) + ".desc2") + "§r");
		tooltip.add("§o" + I18n.format("tooltip." + this.getUnlocalizedName().substring(5) + ".desc3") + "§r");
	}

	@Override
	public EnumAction getItemUseAction(ItemStack stack)
	{
		return EnumAction.BOW;
	}

	@Override
	public void shoot(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		/*
		if (PropertiesHelper.canShoot(player))
		{
			setClip(stack, getClip(stack) - 1);
			world.spawnEntityInWorld(new EntityBullet(world, player, 3.0F, 7.5F, PropertiesHelper.getBulletDamage(player)));
			world.spawnEntityInWorld(new EntityBullet(world, player, 3.0F, 7.5F, PropertiesHelper.getBulletDamage(player)));
			world.spawnEntityInWorld(new EntityBullet(world, player, 3.0F, 7.5F, PropertiesHelper.getBulletDamage(player)));
			world.spawnEntityInWorld(new EntityBullet(world, player, 3.0F, 7.5F, PropertiesHelper.getBulletDamage(player)));
		}
		else if (getClip(stack) == 0) setClip(stack, clipSize);9
		*/
	}
}
