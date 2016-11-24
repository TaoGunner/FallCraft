package today.fallout.fallcraft.client;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import today.fallout.fallcraft.common.CommonRegistryHandler;

public class ClientEventHandler
{

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onRenderLivingEvent(RenderPlayerEvent.Pre event)
	{
		ItemStack stackRightHand = event.getEntityPlayer().getHeldItemMainhand();
		ItemStack stackLeftHand = event.getEntityPlayer().getHeldItemOffhand();

		if (stackRightHand != null && stackLeftHand == null && stackRightHand.getItem() == CommonRegistryHandler.item_pistol_223)
		{
			event.setCanceled(true);
			//RenderPlayer renderPlayer = new RenderPlayer(Minecraft.getMinecraft().getRenderManager());
			//ModelPlayer modelPlayer = event.getRenderer().getMainModel();
			//modelPlayer.rightArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
			//renderPlayer.doRender((AbstractClientPlayer) event.getEntityPlayer(), event.getEntityPlayer().posX, event.getEntityPlayer().posY, event.getEntityPlayer().posZ, event.getEntityPlayer().rotationYaw, event.getPartialRenderTick());
		}

		if (stackLeftHand != null && stackRightHand == null && stackLeftHand.getItem() == CommonRegistryHandler.item_pistol_223)
		{
			ModelPlayer modelPlayer = event.getRenderer().getMainModel();
			modelPlayer.leftArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
		}

		if (stackRightHand != null && stackLeftHand != null && stackRightHand.getItem() == CommonRegistryHandler.item_pistol_223 && stackLeftHand.getItem() == CommonRegistryHandler.item_pistol_223)
		{
		}
	}
}
