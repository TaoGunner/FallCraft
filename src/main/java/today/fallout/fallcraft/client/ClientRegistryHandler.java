package today.fallout.fallcraft.client;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import today.fallout.fallcraft.client.model.*;
import today.fallout.fallcraft.client.renderer.entity.*;
import today.fallout.fallcraft.entity.monster.*;

public class ClientRegistryHandler
{
	public static void registerEntityRenderer()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityAnt.class, renderManager -> new RenderAnt(renderManager, new ModelAnt(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class, renderManager -> new RenderCentaur(renderManager, new ModelCentaur(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFloater.class, renderManager -> new RenderFloater(renderManager, new ModelFloater(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMolerat.class, renderManager -> new RenderMolerat(renderManager, new ModelMolerat(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySporePlant.class, renderManager -> new RenderSporePlant(renderManager, new ModelSporePlant(), 0.5F));
	}
}
