package today.fallout.fallcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import today.fallout.fallcraft.common.CommonProxy;

@Mod(modid = FallCraftMod.MODID, version = FallCraftMod.VERSION)
public class FallCraftMod
{
	public static final String MODID = "fallcraft";
	public static final String VERSION = "1.0";

	public static Logger log = LogManager.getLogger(MODID);

	@Mod.Instance(MODID)
	public static FallCraftMod instance;

	@SidedProxy(clientSide="today.fallout.fallcraft.client.ClientProxy", serverSide="today.fallout.fallcraft.common.CommonProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit();
	}
}
