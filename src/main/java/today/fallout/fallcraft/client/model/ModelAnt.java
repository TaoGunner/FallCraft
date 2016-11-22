package today.fallout.fallcraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelAnt extends ModelBase
{
	public ModelRenderer legRT1;
	public ModelRenderer legRT2;
	public ModelRenderer legRT3;
	public ModelRenderer legLT2;
	public ModelRenderer legLT1;
	public ModelRenderer legLT3;
	public ModelRenderer legRB1;
	public ModelRenderer legRB2;
	public ModelRenderer legRB3;
	public ModelRenderer legLB2;
	public ModelRenderer legLB1;
	public ModelRenderer legLB3;
	public ModelRenderer body1;
	public ModelRenderer body2;
	public ModelRenderer head;
	public ModelRenderer antennLT;
	public ModelRenderer antennRT;
	public ModelRenderer teeth;
	public ModelRenderer antennLB;
	public ModelRenderer antennRB;

	public ModelAnt() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.legRT2 = new ModelRenderer(this, 96, 0);
		this.legRT2.setRotationPoint(5.0F, 16.0F, 0.0F);
		this.legRT2.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legRT2, 0.0F, 0.0F, -0.5235987755982988F);
		this.legLT2 = new ModelRenderer(this, 96, 0);
		this.legLT2.setRotationPoint(-5.0F, 16.0F, 0.0F);
		this.legLT2.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legLT2, 0.0F, 3.141592653589793F, 0.5235987755982988F);
		this.antennRB = new ModelRenderer(this, 70, 0);
		this.antennRB.mirror = true;
		this.antennRB.setRotationPoint(0.0F, 0.0F, -12.0F);
		this.antennRB.addBox(-1.0F, 0.0F, -6.0F, 2, 0, 6, 0.0F);
		this.setRotateAngle(antennRB, 0.7853981633974483F, 0.0F, 0.0F);
		this.antennLT = new ModelRenderer(this, 76, 0);
		this.antennLT.mirror = true;
		this.antennLT.setRotationPoint(-4.0F, -4.0F, -4.0F);
		this.antennLT.addBox(-1.0F, 0.0F, -12.0F, 2, 0, 12, 0.0F);
		this.setRotateAngle(antennLT, -0.5235987755982988F, 0.3490658503988659F, 0.0F);
		this.antennLB = new ModelRenderer(this, 70, 0);
		this.antennLB.mirror = true;
		this.antennLB.setRotationPoint(0.0F, 0.0F, -12.0F);
		this.antennLB.addBox(-1.0F, 0.0F, -6.0F, 2, 0, 6, 0.0F);
		this.setRotateAngle(antennLB, 0.7853981633974483F, 0.0F, 0.0F);
		this.antennRT = new ModelRenderer(this, 76, 0);
		this.antennRT.mirror = true;
		this.antennRT.setRotationPoint(4.0F, -4.0F, -4.0F);
		this.antennRT.addBox(-1.0F, 0.0F, -12.0F, 2, 0, 12, 0.0F);
		this.setRotateAngle(antennRT, -0.5235987755982988F, -0.3490658503988659F, 0.0F);
		this.body1 = new ModelRenderer(this, 68, 36);
		this.body1.setRotationPoint(0.0F, 16.0F, 0.0F);
		this.body1.addBox(-5.0F, -4.0F, -10.0F, 10, 8, 20, 0.0F);
		this.legLB2 = new ModelRenderer(this, 96, 4);
		this.legLB2.setRotationPoint(12.0F, 2.0F, 0.0F);
		this.legLB2.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legLB2, 0.0F, 0.0F, 1.5707963267948966F);
		this.body2 = new ModelRenderer(this, 0, 36);
		this.body2.setRotationPoint(0.0F, 16.0F, 18.0F);
		this.body2.addBox(-8.0F, -6.0F, -8.0F, 16, 12, 16, 0.0F);
		this.legLB1 = new ModelRenderer(this, 96, 4);
		this.legLB1.setRotationPoint(12.0F, 2.0F, 0.0F);
		this.legLB1.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legLB1, 0.0F, 0.0F, 1.5707963267948966F);
		this.legRB1 = new ModelRenderer(this, 96, 4);
		this.legRB1.setRotationPoint(12.0F, 2.0F, 0.0F);
		this.legRB1.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legRB1, 0.0F, 0.0F, 1.5707963267948966F);
		this.teeth = new ModelRenderer(this, 106, 8);
		this.teeth.setRotationPoint(0.0F, 2.0F, -11.0F);
		this.teeth.addBox(-4.0F, -1.0F, -1.0F, 8, 3, 3, 0.0F);
		this.legLT1 = new ModelRenderer(this, 96, 0);
		this.legLT1.setRotationPoint(-5.0F, 16.0F, -5.0F);
		this.legLT1.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legLT1, 0.2617993877991494F, 2.6179938779914944F, 0.5235987755982988F);
		this.legRT3 = new ModelRenderer(this, 96, 0);
		this.legRT3.setRotationPoint(5.0F, 16.0F, 5.0F);
		this.legRT3.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legRT3, 0.2617993877991494F, -0.5235987755982988F, -0.5235987755982988F);
		this.legRT1 = new ModelRenderer(this, 96, 0);
		this.legRT1.setRotationPoint(5.0F, 16.0F, -5.0F);
		this.legRT1.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legRT1, 0.0F, 0.5235987755982988F, -0.5235987755982988F);
		this.legLT3 = new ModelRenderer(this, 96, 0);
		this.legLT3.setRotationPoint(-5.0F, 16.0F, 5.0F);
		this.legLT3.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legLT3, -0.2617993877991494F, -2.6179938779914944F, 0.5235987755982988F);
		this.head = new ModelRenderer(this, 80, 16);
		this.head.setRotationPoint(0.0F, 16.0F, -10.0F);
		this.head.addBox(-7.0F, -5.0F, -10.0F, 14, 10, 10, 0.0F);
		this.legRB2 = new ModelRenderer(this, 96, 4);
		this.legRB2.setRotationPoint(12.0F, 2.0F, 0.0F);
		this.legRB2.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legRB2, 0.0F, 0.0F, 1.5707963267948966F);
		this.legLB3 = new ModelRenderer(this, 96, 4);
		this.legLB3.setRotationPoint(12.0F, 2.0F, 0.0F);
		this.legLB3.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legLB3, 0.0F, 0.0F, 1.5707963267948966F);
		this.legRB3 = new ModelRenderer(this, 96, 4);
		this.legRB3.setRotationPoint(12.0F, 2.0F, 0.0F);
		this.legRB3.addBox(-1.0F, -1.0F, -1.0F, 14, 2, 2, 0.0F);
		this.setRotateAngle(legRB3, 0.0F, 0.0F, 1.5707963267948966F);
		this.antennRT.addChild(this.antennRB);
		this.head.addChild(this.antennLT);
		this.antennLT.addChild(this.antennLB);
		this.head.addChild(this.antennRT);
		this.legLT2.addChild(this.legLB2);
		this.legLT1.addChild(this.legLB1);
		this.legRT1.addChild(this.legRB1);
		this.head.addChild(this.teeth);
		this.legRT2.addChild(this.legRB2);
		this.legLT3.addChild(this.legLB3);
		this.legRT3.addChild(this.legRB3);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		this.legRT1.render(f5);
		this.legRT2.render(f5);
		this.legRT3.render(f5);
		this.body2.render(f5);
		this.legLT3.render(f5);
		this.head.render(f5);
		this.legLT2.render(f5);
		this.body1.render(f5);
		this.legLT1.render(f5);
	}

	@Override
	public void setRotationAngles(float par1float, float par2float, float par3float, float par4float, float par5float, float par6float, Entity par7Entity)
	{
		// Вращение головы
		this.head.rotateAngleY = par4float * 0.3F / (180F/(float)Math.PI);
		this.head.rotateAngleX = par5float * 0.3F / (180F/(float)Math.PI);

		// Вращение ног
		float x1 = (MathHelper.cos(par1float + (float)Math.PI)) * 0.3F * par2float;
		this.setRotateAngle(legRT1, 0.0F, 0.5235987755982988F, -0.5235987755982988F);
		this.setRotateAngle(legRT2, 0.0F, 0.0F, -0.5235987755982988F);
		this.setRotateAngle(legRT3, 0.2617993877991494F, -0.5235987755982988F, -0.5235987755982988F);
		this.setRotateAngle(legLT1, 0.2617993877991494F, 2.6179938779914944F, 0.5235987755982988F);
		this.setRotateAngle(legLT2, 0.0F, 3.141592653589793F, 0.5235987755982988F);
		this.setRotateAngle(legLT3, -0.2617993877991494F, -2.6179938779914944F, 0.5235987755982988F);

		this.legRT1.rotateAngleY += x1;
		this.legRT2.rotateAngleY -= x1;
		this.legRT3.rotateAngleY += x1;
		this.legLT1.rotateAngleY -= x1;
		this.legLT2.rotateAngleY += x1;
		this.legLT3.rotateAngleY -= x1;

		this.legRT1.rotateAngleZ += x1 * 0.5F;
		this.legRT2.rotateAngleZ += x1 * 0.5F;
		this.legRT3.rotateAngleZ += x1 * 0.5F;
		this.legLT1.rotateAngleZ += x1 * 0.5F;
		this.legLT2.rotateAngleZ += x1 * 0.5F;
		this.legLT3.rotateAngleZ += x1 * 0.5F;
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
