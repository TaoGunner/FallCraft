package today.fallout.fallcraft.block;

import net.minecraft.creativetab.CreativeTabs;

public class FCBlockDoubleSlab extends FCBlockSlab
{
	public FCBlockDoubleSlab(String blockName, CreativeTabs blockCreativeTab)
	{
		super(blockName, blockCreativeTab);
	}

	@Override
	public boolean isDouble()
	{
		return true;
	}
}
