package today.fallout.fallcraft.client;

import net.minecraftforge.common.MinecraftForge;
import today.fallout.fallcraft.common.CommonEventHandler;
import today.fallout.fallcraft.common.CommonProxy;

public class ClientProxy extends CommonProxy
{
	public ClientProxy()
	{
		MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
	}

	@Override
	public void preInit()
	{
		super.preInit();
	}

}
