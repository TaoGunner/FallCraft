package today.fallout.fallcraft.block;

import net.minecraft.creativetab.CreativeTabs;

public class FCBlockHalfSlab extends FCBlockSlab
{
	public FCBlockHalfSlab(String blockName, CreativeTabs blockCreativeTab)
	{
		super(blockName, blockCreativeTab);
	}

	@Override
	public boolean isDouble()
	{
		return false;
	}
}
