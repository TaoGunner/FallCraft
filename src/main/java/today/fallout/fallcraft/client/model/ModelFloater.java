package today.fallout.fallcraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelFloater extends ModelBase
{
	public ModelRenderer body1;
	public ModelRenderer tail2;
	public ModelRenderer body2;
	public ModelRenderer body3;
	public ModelRenderer body4;
	public ModelRenderer tail1;
	public ModelRenderer body5;
	public ModelRenderer body6;
	public ModelRenderer body7;
	public ModelRenderer body8;
	public ModelRenderer body9;
	public ModelRenderer head;
	public ModelRenderer head1L;
	public ModelRenderer head1R;
	public ModelRenderer head2L;
	public ModelRenderer head2R;
	public ModelRenderer head3L;
	public ModelRenderer head3R;
	public ModelRenderer teeth1;
	public ModelRenderer teeth2;
	public ModelRenderer teeth3;
	public ModelRenderer teeth4;
	public ModelRenderer teeth5;
	public ModelRenderer teeth6;
	public ModelRenderer teeth7;
	public ModelRenderer antennRT;
	public ModelRenderer antennLT;
	public ModelRenderer antennRB;
	public ModelRenderer antennLB;

	public ModelFloater()
	{
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.teeth1 = new ModelRenderer(this, 0, 7);
		this.teeth1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.teeth1.addBox(-6.0F, 0.0F, 7.5F, 5, 0, 3, 0.0F);
		this.setRotateAngle(teeth1, 3.141592653589793F, -0.6283185307179586F, 3.141592653589793F);
		this.teeth4 = new ModelRenderer(this, 0, 13);
		this.teeth4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.teeth4.addBox(-3.0F, 0.0F, -4.5F, 6, 0, 3, 0.0F);
		this.setRotateAngle(teeth4, 0.08726646259971647F, -0.0F, 0.0F);
		this.antennLT = new ModelRenderer(this, 0, 3);
		this.antennLT.setRotationPoint(-3.0F, -1.0F, -12.0F);
		this.antennLT.addBox(0.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F);
		this.setRotateAngle(antennLT, 2.2689280275926285F, 0.0F, 0.0F);
		this.body6 = new ModelRenderer(this, 102, 11);
		this.body6.setRotationPoint(0.0F, -4.0F, 2.0F);
		this.body6.addBox(-3.5F, 4.5F, -3.0F, 7, 2, 6, 0.0F);
		this.setRotateAngle(body6, 0.08726646259971647F, -0.0F, 0.0F);
		this.head2R = new ModelRenderer(this, 82, 12);
		this.head2R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.head2R.addBox(3.5F, -1.5F, 5.5F, 7, 3, 3, 0.0F);
		this.setRotateAngle(head2R, 3.141592653589793F, 1.5707963267948966F, 3.141592653589793F);
		this.teeth6 = new ModelRenderer(this, 0, 10);
		this.teeth6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.teeth6.addBox(4.0F, 0.0F, 2.5F, 5, 0, 3, 0.0F);
		this.setRotateAngle(teeth6, 3.1764992386296798F, 1.5707963267948966F, 3.141592653589793F);
		this.body4 = new ModelRenderer(this, 96, 0);
		this.body4.mirror = true;
		this.body4.setRotationPoint(0.0F, 12.0F, 0.0F);
		this.body4.addBox(-4.0F, 8.0F, -4.0F, 8, 3, 8, 0.0F);
		this.setRotateAngle(body4, -2.0943951023931953F, -0.0F, 0.0F);
		this.tail2 = new ModelRenderer(this, 44, 9);
		this.tail2.setRotationPoint(0.0F, 12.0F, 0.0F);
		this.tail2.addBox(-3.0F, 8.5F, 8.0F, 6, 2, 4, 0.0F);
		this.setRotateAngle(tail2, 0.16318828506146982F, -0.0F, 0.0F);
		this.antennRT = new ModelRenderer(this, 0, 3);
		this.antennRT.setRotationPoint(2.0F, -1.0F, -12.0F);
		this.antennRT.addBox(0.0F, 0.0F, 0.0F, 1, 0, 4, 0.0F);
		this.setRotateAngle(antennRT, 2.2689280275926285F, 0.0F, 0.0F);
		this.head3R = new ModelRenderer(this, 82, 12);
		this.head3R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.head3R.addBox(-0.5F, -1.5F, 10.5F, 7, 3, 3, 0.0F);
		this.setRotateAngle(head3R, 3.141592653589793F, 0.6457718232379019F, 3.141592653589793F);
		this.antennRB = new ModelRenderer(this, 0, 0);
		this.antennRB.setRotationPoint(0.0F, 0.0F, 4.0F);
		this.antennRB.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
		this.setRotateAngle(antennRB, 1.0471975511965976F, 0.0F, 0.0F);
		this.body1 = new ModelRenderer(this, 64, 0);
		this.body1.setRotationPoint(0.0F, 12.0F, 0.0F);
		this.body1.addBox(-4.0F, 7.0F, -4.0F, 8, 4, 8, 0.0F);
		this.body5 = new ModelRenderer(this, 96, 0);
		this.body5.setRotationPoint(0.0F, 12.0F, 0.0F);
		this.body5.addBox(-4.0F, 8.0F, -4.0F, 8, 3, 8, 0.0F);
		this.setRotateAngle(body5, -2.792526803190927F, -0.0F, 0.0F);
		this.head1L = new ModelRenderer(this, 82, 12);
		this.head1L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.head1L.addBox(-8.5F, -1.5F, 0.5F, 7, 3, 3, 0.0F);
		this.setRotateAngle(head1L, 0.0F, -0.7853981633974483F, 0.0F);
		this.body8 = new ModelRenderer(this, 102, 11);
		this.body8.setRotationPoint(0.0F, -4.0F, 2.0F);
		this.body8.addBox(-3.5F, 4.5F, -3.0F, 7, 2, 6, 0.0F);
		this.setRotateAngle(body8, 1.8325957145940461F, -0.0F, 0.0F);
		this.teeth2 = new ModelRenderer(this, 0, 10);
		this.teeth2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.teeth2.addBox(-9.0F, 0.0F, 2.5F, 5, 0, 3, 0.0F);
		this.setRotateAngle(teeth2, 3.1764992386296798F, -1.5707963267948966F, 3.141592653589793F);
		this.body7 = new ModelRenderer(this, 102, 11);
		this.body7.mirror = true;
		this.body7.setRotationPoint(0.0F, -4.0F, 2.0F);
		this.body7.addBox(-3.5F, 4.5F, -3.0F, 7, 2, 6, 0.0F);
		this.setRotateAngle(body7, 0.9599310885968813F, -0.0F, 0.0F);
		this.body3 = new ModelRenderer(this, 96, 0);
		this.body3.setRotationPoint(0.0F, 12.0F, 0.0F);
		this.body3.addBox(-4.0F, 8.0F, -4.0F, 8, 3, 8, 0.0F);
		this.setRotateAngle(body3, -1.3962634015954636F, -0.0F, 0.0F);
		this.head1R = new ModelRenderer(this, 82, 12);
		this.head1R.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.head1R.addBox(1.5F, -1.5F, 0.5F, 7, 3, 3, 0.0F);
		this.setRotateAngle(head1R, 0.0F, 0.7853981633974483F, 0.0F);
		this.head3L = new ModelRenderer(this, 82, 12);
		this.head3L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.head3L.addBox(-6.6F, -1.5F, 10.5F, 7, 3, 3, 0.0F);
		this.setRotateAngle(head3L, 3.141592653589793F, -0.6457718232379019F, 3.141592653589793F);
		this.antennLB = new ModelRenderer(this, 0, 0);
		this.antennLB.setRotationPoint(0.0F, 0.0F, 4.0F);
		this.antennLB.addBox(0.0F, 0.0F, 0.0F, 1, 0, 3, 0.0F);
		this.setRotateAngle(antennLB, 1.0471975511965976F, 0.0F, 0.0F);
		this.tail1 = new ModelRenderer(this, 38, 0);
		this.tail1.setRotationPoint(0.0F, 12.0F, 0.0F);
		this.tail1.addBox(-3.5F, 8.0F, 2.0F, 7, 3, 6, 0.0F);
		this.setRotateAngle(tail1, 0.16318828506146982F, -0.0F, 0.0F);
		this.head2L = new ModelRenderer(this, 82, 12);
		this.head2L.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.head2L.addBox(-10.5F, -1.5F, 5.5F, 7, 3, 3, 0.0F);
		this.setRotateAngle(head2L, 3.141592653589793F, -1.5707963267948966F, 3.141592653589793F);
		this.body9 = new ModelRenderer(this, 102, 11);
		this.body9.mirror = true;
		this.body9.setRotationPoint(0.0F, -4.0F, 2.0F);
		this.body9.addBox(-3.5F, 4.5F, -3.0F, 7, 2, 6, 0.0F);
		this.setRotateAngle(body9, 2.705260340591211F, -0.0F, 0.0F);
		this.teeth7 = new ModelRenderer(this, 0, 7);
		this.teeth7.mirror = true;
		this.teeth7.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.teeth7.addBox(1.0F, 0.0F, 7.5F, 5, 0, 3, 0.0F);
		this.setRotateAngle(teeth7, 3.141592653589793F, 0.6632251157578453F, 3.141592653589793F);
		this.teeth3 = new ModelRenderer(this, 0, 7);
		this.teeth3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.teeth3.addBox(-7.0F, 0.0F, -2.5F, 4, 0, 3, 0.0F);
		this.setRotateAngle(teeth3, -0.08726646259971647F, -0.7853981633974483F, 0.0F);
		this.teeth5 = new ModelRenderer(this, 0, 7);
		this.teeth5.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.teeth5.addBox(3.0F, 0.0F, -2.5F, 4, 0, 3, 0.0F);
		this.setRotateAngle(teeth5, -0.08726646259971647F, 0.7853981633974483F, 0.0F);
		this.body2 = new ModelRenderer(this, 96, 0);
		this.body2.mirror = true;
		this.body2.setRotationPoint(0.0F, 12.0F, 0.0F);
		this.body2.addBox(-4.0F, 8.0F, -4.0F, 8, 3, 8, 0.0F);
		this.setRotateAngle(body2, -0.6981317007977318F, -0.0F, 0.0F);
		this.head = new ModelRenderer(this, 82, 12);
		this.head.setRotationPoint(0.0F, -10.0F, 1.0F);
		this.head.addBox(-3.5F, -1.5F, -1.5F, 7, 3, 3, 0.0F);
		this.head.addChild(this.teeth1);
		this.head.addChild(this.teeth4);
		this.head.addChild(this.antennLT);
		this.head.addChild(this.head2R);
		this.head.addChild(this.teeth6);
		this.head.addChild(this.antennRT);
		this.head.addChild(this.head3R);
		this.antennRT.addChild(this.antennRB);
		this.head.addChild(this.head1L);
		this.head.addChild(this.teeth2);
		this.head.addChild(this.head1R);
		this.head.addChild(this.head3L);
		this.antennLT.addChild(this.antennLB);
		this.head.addChild(this.head2L);
		this.head.addChild(this.teeth7);
		this.head.addChild(this.teeth3);
		this.head.addChild(this.teeth5);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.body3.render(f5);
		this.tail1.render(f5);
		this.body5.render(f5);
		this.tail2.render(f5);
		this.body6.render(f5);
		this.body7.render(f5);
		this.body1.render(f5);
		this.body4.render(f5);
		this.body9.render(f5);
		this.body8.render(f5);
		this.body2.render(f5);
		this.head.render(f5);
	}

	@Override
	public void setRotationAngles(float par1float, float par2float, float par3float, float par4float, float par5float, float par6float, Entity par7Entity)
	{
		// Движение головы
		this.head.rotateAngleY = par4float * 0.5F / (180F/(float)Math.PI);
		this.head.rotateAngleX = par5float / (180F/(float)Math.PI);
		
		// Движение тела
		float x1 = (MathHelper.cos(par1float + (float)Math.PI)) * 0.4F * par2float;
		this.setRotateAngle(body1, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(body2, -0.6981317007977318F, 0.0F, 0.0F);
		this.setRotateAngle(body3, -1.3962634015954636F, 0.0F, 0.0F);
		this.setRotateAngle(body4, -2.0943951023931953F, 0.0F, 0.0F);
		this.setRotateAngle(body5, -2.792526803190927F, 0.0F, 0.0F);
		this.setRotateAngle(body6, 0.08726646259971647F, 0.0F, 0.0F);
		this.setRotateAngle(body7, 0.9599310885968813F, 0.0F, 0.0F);
		this.setRotateAngle(body8, 1.8325957145940461F, 0.0F, 0.0F);
		this.setRotateAngle(body9, 2.705260340591211F, 0.0F, 0.0F);
		this.setRotateAngle(tail1, 0.16318828506146982F, 0.0F, 0.0F);
		this.setRotateAngle(tail2, 0.16318828506146982F, 0.0F, 0.0F);
		this.body1.rotateAngleX += x1;
		this.body2.rotateAngleX += x1;
		this.body3.rotateAngleX += x1;
		this.body4.rotateAngleX += x1;
		this.body6.rotateAngleX += x1;
		this.body7.rotateAngleX += x1;
		this.body8.rotateAngleX += x1;
		this.body9.rotateAngleX += x1;
		this.tail1.rotateAngleX += x1;
		this.tail2.rotateAngleX += x1;
		
		// Движение усиков
		this.setRotateAngle(antennRT, 2.2689280275926285F, 0.0F, 0.0F);
		this.setRotateAngle(antennLT, 2.2689280275926285F, 0.0F, 0.0F);
		this.antennRT.rotateAngleX += x1;
		this.antennLT.rotateAngleX -= x1;
		this.antennRT.rotateAngleZ -= x1;
		this.antennLT.rotateAngleZ += x1;
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
