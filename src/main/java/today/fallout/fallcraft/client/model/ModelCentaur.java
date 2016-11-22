package today.fallout.fallcraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelCentaur extends ModelBase
{
	public ModelRenderer torsoR;
	public ModelRenderer torsoL;
	public ModelRenderer torsoR1;
	public ModelRenderer torsoR2;
	public ModelRenderer torsoR3;
	public ModelRenderer torsoR4;
	public ModelRenderer torsoR5;
	public ModelRenderer headR;
	public ModelRenderer legR1T;
	public ModelRenderer legR2T;
	public ModelRenderer legR1B;
	public ModelRenderer legR2B;
	public ModelRenderer torsoL1;
	public ModelRenderer torsoL2;
	public ModelRenderer torsoL3;
	public ModelRenderer torsoL4;
	public ModelRenderer torsoL5;
	public ModelRenderer headL;
	public ModelRenderer legL1T;
	public ModelRenderer legL2T;
	public ModelRenderer legL1B;
	public ModelRenderer legL2B;

	public ModelCentaur() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.torsoL3 = new ModelRenderer(this, 68, 0);
		this.torsoL3.mirror = true;
		this.torsoL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torsoL3.addBox(-6.0F, 3.0F, 12.0F, 6, 3, 3, 0.0F);
		this.torsoR4 = new ModelRenderer(this, 52, 0);
		this.torsoR4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torsoR4.addBox(0.0F, 4.0F, 15.0F, 5, 2, 3, 0.0F);
		this.torsoL1 = new ModelRenderer(this, 106, 0);
		this.torsoL1.mirror = true;
		this.torsoL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torsoL1.addBox(-8.0F, 1.0F, 6.0F, 8, 5, 3, 0.0F);
		this.torsoR2 = new ModelRenderer(this, 86, 0);
		this.torsoR2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torsoR2.addBox(0.0F, 2.0F, 9.0F, 7, 4, 3, 0.0F);
		this.legR2B = new ModelRenderer(this, 24, 20);
		this.legR2B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.legR2B.addBox(1.5F, -9.0F, -1.5F, 9, 3, 3, 0.0F);
		this.setRotateAngle(legR2B, 0.0F, 0.0F, 1.239183768915974F);
		this.torsoL4 = new ModelRenderer(this, 52, 0);
		this.torsoL4.mirror = true;
		this.torsoL4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torsoL4.addBox(-5.0F, 4.0F, 15.0F, 5, 2, 3, 0.0F);
		this.legL1T = new ModelRenderer(this, 0, 20);
		this.legL1T.mirror = true;
		this.legL1T.setRotationPoint(-8.0F, 4.0F, -8.0F);
		this.legL1T.addBox(-9.0F, -1.5F, -1.5F, 9, 3, 3, 0.0F);
		this.setRotateAngle(legL1T, 0.0F, -0.2617993877991494F, -0.2617993877991494F);
		this.torsoR3 = new ModelRenderer(this, 68, 0);
		this.torsoR3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torsoR3.addBox(0.0F, 3.0F, 12.0F, 6, 3, 3, 0.0F);
		this.legL2T = new ModelRenderer(this, 0, 20);
		this.legL2T.mirror = true;
		this.legL2T.setRotationPoint(-8.0F, 4.0F, 3.0F);
		this.legL2T.addBox(-9.0F, -1.5F, -1.5F, 9, 3, 3, 0.0F);
		this.setRotateAngle(legL2T, 0.0F, 0.2617993877991494F, -0.2617993877991494F);
		this.legL1B = new ModelRenderer(this, 24, 20);
		this.legL1B.mirror = true;
		this.legL1B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.legL1B.addBox(-10.5F, -9.0F, -1.5F, 9, 3, 3, 0.0F);
		this.setRotateAngle(legL1B, 0.0F, 0.0F, -1.239183768915974F);
		this.torsoR1 = new ModelRenderer(this, 106, 0);
		this.torsoR1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torsoR1.addBox(0.0F, 1.0F, 6.0F, 8, 5, 3, 0.0F);
		this.torsoL5 = new ModelRenderer(this, 0, 46);
		this.torsoL5.mirror = true;
		this.torsoL5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torsoL5.addBox(-9.0F, -6.0F, -12.0F, 9, 12, 6, 0.0F);
		this.torsoR5 = new ModelRenderer(this, 30, 46);
		this.torsoR5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torsoR5.addBox(0.0F, -6.0F, -12.0F, 9, 12, 6, 0.0F);
		this.legR1T = new ModelRenderer(this, 0, 20);
		this.legR1T.setRotationPoint(8.0F, 4.0F, -8.0F);
		this.legR1T.addBox(0.0F, -1.5F, -1.5F, 9, 3, 3, 0.0F);
		this.setRotateAngle(legR1T, 0.0F, 0.2617993877991494F, 0.2617993877991494F);
		this.torsoL2 = new ModelRenderer(this, 86, 0);
		this.torsoL2.mirror = true;
		this.torsoL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.torsoL2.addBox(-7.0F, 2.0F, 9.0F, 7, 4, 3, 0.0F);
		this.torsoR = new ModelRenderer(this, 60, 46);
		this.torsoR.setRotationPoint(-0.5F, 8.0F, 0.0F);
		this.torsoR.addBox(0.0F, 0.0F, -6.0F, 9, 6, 12, 0.0F);
		this.setRotateAngle(torsoR, 0.0F, 0.0F, 0.17453292519943295F);
		this.torsoL = new ModelRenderer(this, 60, 46);
		this.torsoL.mirror = true;
		this.torsoL.setRotationPoint(0.5F, 8.0F, 0.0F);
		this.torsoL.addBox(-9.0F, 0.0F, -6.0F, 9, 6, 12, 0.0F);
		this.setRotateAngle(torsoL, 0.0F, 0.0F, -0.17453292519943295F);
		this.legL2B = new ModelRenderer(this, 24, 20);
		this.legL2B.mirror = true;
		this.legL2B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.legL2B.addBox(-10.5F, -9.0F, -1.5F, 9, 3, 3, 0.0F);
		this.setRotateAngle(legL2B, 0.0F, 0.0F, -1.239183768915974F);
		this.legR1B = new ModelRenderer(this, 24, 20);
		this.legR1B.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.legR1B.addBox(1.5F, -9.0F, -1.5F, 9, 3, 3, 0.0F);
		this.setRotateAngle(legR1B, 0.0F, 0.0F, 1.239183768915974F);
		this.headL = new ModelRenderer(this, 0, 34);
		this.headL.setRotationPoint(-4.0F, -5.5F, -9.0F);
		this.headL.addBox(-4.5F, -7.0F, -2.5F, 8, 7, 5, 0.0F);
		this.headR = new ModelRenderer(this, 26, 33);
		this.headR.setRotationPoint(5.0F, -6.0F, -9.0F);
		this.headR.addBox(-5.5F, -5.0F, -3.5F, 10, 6, 7, 0.0F);
		this.legR2T = new ModelRenderer(this, 0, 20);
		this.legR2T.setRotationPoint(8.0F, 4.0F, 3.0F);
		this.legR2T.addBox(0.0F, -1.5F, -1.5F, 9, 3, 3, 0.0F);
		this.setRotateAngle(legR2T, 0.0F, -0.2617993877991494F, 0.2617993877991494F);
		this.torsoL.addChild(this.torsoL3);
		this.torsoR.addChild(this.torsoR4);
		this.torsoL.addChild(this.torsoL1);
		this.torsoR.addChild(this.torsoR2);
		this.legR2T.addChild(this.legR2B);
		this.torsoL.addChild(this.torsoL4);
		this.torsoL.addChild(this.legL1T);
		this.torsoR.addChild(this.torsoR3);
		this.torsoL.addChild(this.legL2T);
		this.legL1T.addChild(this.legL1B);
		this.torsoR.addChild(this.torsoR1);
		this.torsoL.addChild(this.torsoL5);
		this.torsoR.addChild(this.torsoR5);
		this.torsoR.addChild(this.legR1T);
		this.torsoL.addChild(this.torsoL2);
		this.legL2T.addChild(this.legL2B);
		this.legR1T.addChild(this.legR1B);
		this.torsoL.addChild(this.headL);
		this.torsoR.addChild(this.headR);
		this.torsoR.addChild(this.legR2T);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{ 
		this.torsoR.render(f5);
		this.torsoL.render(f5);
	}

	@Override
	public void setRotationAngles(float par1float, float par2float, float par3float, float par4float, float par5float, float par6float, Entity par7Entity)
	{
		// Движение обоих голов
		this.headR.rotateAngleY = par4float * 0.5F / (180F/(float)Math.PI);
		this.headR.rotateAngleX = par5float * 0.5F / (180F/(float)Math.PI);
		this.headL.rotateAngleY = par4float * 0.5F / (180F/(float)Math.PI);
		this.headL.rotateAngleX = par5float * 0.5F / (180F/(float)Math.PI);
		
		// Движение ног
		float x1 = (MathHelper.cos(par1float + (float)Math.PI)) * 1.4F * par2float;
		this.setRotateAngle(legL1T, 0.0F, -0.2617993877991494F, -0.2617993877991494F);
		this.setRotateAngle(legL2T, 0.0F, 0.2617993877991494F, -0.2617993877991494F);
		this.setRotateAngle(legR1T, 0.0F, 0.2617993877991494F, 0.2617993877991494F);
		this.setRotateAngle(legR2T, 0.0F, -0.2617993877991494F, 0.2617993877991494F);
		this.legL1T.rotateAngleY += x1;
		this.legL2T.rotateAngleY -= x1;
		this.legR1T.rotateAngleY += x1;
		this.legR2T.rotateAngleY -= x1;
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
