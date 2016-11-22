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
import today.fallout.fallcraft.entity.monster.EntityMolerat;

@SideOnly(Side.CLIENT)
public class RenderMolerat extends RenderLiving
{
	private static final ResourceLocation MOLERAT_TEXTURE = new ResourceLocation(FallCraftMod.MODID + ":" + "textures/entity/molerat/molerat.png");
	
	public RenderMolerat(RenderManager par1RenderManager, ModelBase par2ModelBase, float par3float)
	{
		super(par1RenderManager, par2ModelBase, par3float);
	}
	
    protected void preRenderCallback(EntityMolerat par1Entity, float par2float)
    {
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
    }
	
    @Override
    protected void preRenderCallback(EntityLivingBase par1Entity, float par2float)
    {
        this.preRenderCallback((EntityMolerat)par1Entity, par2float);
    }
	
    protected ResourceLocation getEntityTexture(EntityMolerat entity)
    {
        return MOLERAT_TEXTURE;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.getEntityTexture((EntityMolerat)entity);
    }
}
