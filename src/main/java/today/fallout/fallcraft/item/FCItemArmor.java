package today.fallout.fallcraft.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import today.fallout.fallcraft.FallCraftMod;

import static today.fallout.fallcraft.creativetab.FCCreativeTabs.TAB_ARMOR;

public class FCItemArmor extends ItemArmor
{
	public FCItemArmor(ArmorMaterial itemArmorMaterial, EntityEquipmentSlot itemEquipmentSlot)
	{
		super(itemArmorMaterial, 0, itemEquipmentSlot);
		this.setUnlocalizedName(FallCraftMod.MODID + "." + itemArmorMaterial.name() + "_" + itemEquipmentSlot.getName());
		this.setCreativeTab(TAB_ARMOR);
		this.setMaxStackSize(1);
		this.setRegistryName(this.getUnlocalizedName());
		GameRegistry.register(this);
		if ( FMLCommonHandler.instance().getSide() == Side.CLIENT)
		{
			ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(FallCraftMod.MODID + ":" + itemArmorMaterial.name() + "_" + itemEquipmentSlot.getName(), "inventory"));
		}
	}
}
