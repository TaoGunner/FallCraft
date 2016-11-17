package today.fallout.fallcraft.common;

import net.minecraftforge.common.MinecraftForge;
import today.fallout.fallcraft.network.NetworkHandler;

public class CommonProxy
{
	public CommonProxy()
	{
		MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
	}

	public void preInit()
	{
		CommonRegistryHandler.registerBlocks();
		CommonRegistryHandler.registerItems();
		NetworkHandler.registerPackets();
	}
}
