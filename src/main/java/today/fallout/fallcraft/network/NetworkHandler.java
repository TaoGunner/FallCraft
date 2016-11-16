package today.fallout.fallcraft.network;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import today.fallout.fallcraft.FallCraftMod;

public class NetworkHandler
{
	public static final SimpleNetworkWrapper NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel(FallCraftMod.MODID);

	public static void registerPackets()
	{
		int packetID = 0;
		// NETWORK.registerMessage(PacketC00Shoot.ServerHandler.class, PacketC00Shoot.class, packetID++, Side.SERVER);
		// NETWORK.registerMessage(PacketC01OpenGui.ServerHandler.class, PacketC01OpenGui.class, packetID++, Side.SERVER);
	}
}
