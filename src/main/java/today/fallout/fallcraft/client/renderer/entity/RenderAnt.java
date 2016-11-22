package today.fallout.fallcraft.client.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import today.fallout.fallcraft.FallCraftMod;
import today.fallout.fallcraft.entity.monster.EntityAnt;

@SideOnly(Side.CLIENT)
public class RenderAnt extends RenderLiving
{
	private static final ResourceLocation ANT_TEXTURE = new ResourceLocation(FallCraftMod.MODID + ":" + "textures/entity/ant/ant.png");

	public RenderAnt(RenderManager par1RenderManager, ModelBase par2ModelBase, float par3float)
	{
		super(par1RenderManager, par2ModelBase, par3float);
	}

	protected void preRenderCallback(EntityAnt par1Entity, float par2float)
	{
		GlStateManager.scale(0.5F, 0.5F, 0.5F);
	}

	@Override
	protected void preRenderCallback(EntityLivingBase par1Entity, float par2float)
	{
		this.preRenderCallback((EntityAnt)par1Entity, par2float);
	}

	protected ResourceLocation getEntityTexture(EntityAnt entity)
	{
		return ANT_TEXTURE;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return this.getEntityTexture((EntityAnt)entity);
	}
}
