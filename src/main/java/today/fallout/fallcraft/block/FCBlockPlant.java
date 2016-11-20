package today.fallout.fallcraft.block;

import net.minecraft.block.BlockCrops;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FCBlockPlant extends BlockCrops
{
	public FCBlockPlant(String blockName)
	{
		this.setRegistryName(blockName);
		this.setUnlocalizedName(this.getRegistryName().toString());
		GameRegistry.register(this);
	}
}
