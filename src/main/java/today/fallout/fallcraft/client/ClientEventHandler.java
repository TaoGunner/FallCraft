package today.fallout.fallcraft.client;

import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ClientEventHandler
{
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void lanternHolding(RenderPlayerEvent.Pre event)
	{
		//FMLDeobfuscatingRemapper.INSTANCE.map()
	}
}
