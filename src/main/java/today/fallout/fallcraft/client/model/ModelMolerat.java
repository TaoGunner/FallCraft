package today.fallout.fallcraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelMolerat extends ModelBase
{
	public ModelRenderer body;
	public ModelRenderer head;
	public ModelRenderer tail;
	public ModelRenderer bodyT;
	public ModelRenderer bodyB;
	public ModelRenderer legTL;
	public ModelRenderer legTR;
	public ModelRenderer legBL;
	public ModelRenderer legBR;
	public ModelRenderer teeth;
	public ModelRenderer headB;
	public ModelRenderer tail1;
	public ModelRenderer tail2;

	public ModelMolerat() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.bodyT = new ModelRenderer(this, 0, 33);
		this.bodyT.setRotationPoint(0.0F, 0.0F, 1.0F);
		this.bodyT.addBox(-5.0F, 4.0F, -8.0F, 10, 1, 6, 0.0F);
		this.teeth = new ModelRenderer(this, 0, 53);
		this.teeth.setRotationPoint(0.0F, 2.0F, -4.9F);
		this.teeth.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F);
		this.setRotateAngle(teeth, -0.13962634015954636F, 0.0F, 0.0F);
		this.legTR = new ModelRenderer(this, 0, 0);
		this.legTR.setRotationPoint(2.5F, 4.0F, -5.0F);
		this.legTR.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
		this.tail1 = new ModelRenderer(this, 34, 0);
		this.tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tail1.addBox(-2.5F, -2.0F, 2.0F, 5, 3, 2, 0.0F);
		this.legBR = new ModelRenderer(this, 0, 0);
		this.legBR.setRotationPoint(2.5F, 4.0F, 5.0F);
		this.legBR.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
		this.head = new ModelRenderer(this, 52, 53);
		this.head.setRotationPoint(0.0F, 14.0F, -8.0F);
		this.head.addBox(-4.0F, -2.0F, -6.0F, 8, 5, 6, 0.0F);
		this.tail = new ModelRenderer(this, 16, 0);
		this.tail.setRotationPoint(0.0F, 14.0F, 8.0F);
		this.tail.addBox(-3.5F, -2.5F, 0.0F, 7, 5, 2, 0.0F);
		this.tail2 = new ModelRenderer(this, 48, 0);
		this.tail2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.tail2.addBox(-1.5F, -1.5F, 4.0F, 3, 1, 2, 0.0F);
		this.bodyB = new ModelRenderer(this, 0, 33);
		this.bodyB.setRotationPoint(0.0F, 0.0F, -1.0F);
		this.bodyB.addBox(-5.0F, 4.0F, 2.0F, 10, 1, 6, 0.0F);
		this.legBL = new ModelRenderer(this, 0, 0);
		this.legBL.setRotationPoint(-2.5F, 4.0F, 5.0F);
		this.legBL.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
		this.legTL = new ModelRenderer(this, 0, 0);
		this.legTL.setRotationPoint(-2.5F, 4.0F, -5.0F);
		this.legTL.addBox(-2.0F, 0.0F, -2.0F, 4, 5, 4, 0.0F);
		this.body = new ModelRenderer(this, 0, 40);
		this.body.setRotationPoint(0.0F, 15.0F, 0.0F);
		this.body.addBox(-5.0F, -4.0F, -8.0F, 10, 8, 16, 0.0F);
		this.headB = new ModelRenderer(this, 80, 57);
		this.headB.setRotationPoint(0.0F, 3.0F, 0.0F);
		this.headB.addBox(-3.0F, 0.0F, -6.0F, 6, 1, 6, 0.0F);
		this.setRotateAngle(headB, 0.17453292519943295F, 0.0F, 0.0F);
		this.body.addChild(this.bodyT);
		this.head.addChild(this.teeth);
		this.bodyT.addChild(this.legTR);
		this.tail.addChild(this.tail1);
		this.bodyB.addChild(this.legBR);
		this.tail.addChild(this.tail2);
		this.body.addChild(this.bodyB);
		this.bodyB.addChild(this.legBL);
		this.bodyT.addChild(this.legTL);
		this.head.addChild(this.headB);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{ 
		this.head.render(f5);
		this.body.render(f5);
		this.tail.render(f5);
	}

	@Override
	public void setRotationAngles(float par1float, float par2float, float par3float, float par4float, float par5float, float par6float, Entity par7Entity)
	{
		// Вращение головы
		this.head.rotateAngleY = par4float * 0.3F / (180F/(float)Math.PI);
		this.head.rotateAngleX = par5float * 0.3F / (180F/(float)Math.PI);
		
		// Вращение ног
		float x1 = (MathHelper.cos(par1float + (float)Math.PI)) * par2float;
		this.setRotateAngle(legTL, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(legTR, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(legBL, 0.0F, 0.0F, 0.0F);
		this.setRotateAngle(legBR, 0.0F, 0.0F, 0.0F);
		
		this.legTL.rotateAngleX += x1;
		this.legTR.rotateAngleX += x1;
		this.legBL.rotateAngleX -= x1;
		this.legBR.rotateAngleX -= x1;
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