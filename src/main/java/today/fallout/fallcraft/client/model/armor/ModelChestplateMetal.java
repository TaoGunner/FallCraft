package today.fallout.fallcraft.client.model.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChestplateMetal extends ModelBiped
{
	private ModelRenderer armorTorso;
	private ModelRenderer scapularLeft;
	private ModelRenderer pikeL1;
	private ModelRenderer pikeL2;
	private ModelRenderer pikeL3;
	private ModelRenderer scapularRight;
	private ModelRenderer deflector;

	public ModelChestplateMetal()
	{
		super(0.0F, 0, 64, 64);
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.scapularLeft = new ModelRenderer(this, 44, 44);
		this.scapularLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.scapularLeft.addBox(-1.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);
		this.scapularRight = new ModelRenderer(this, 44, 54);
		this.scapularRight.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.scapularRight.addBox(-3.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);
		this.armorTorso = new ModelRenderer(this, 0, 51);
		this.armorTorso.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.armorTorso.addBox(-4.5F, -0.5F, -2.5F, 9, 8, 5, 0.0F);
		this.pikeL1 = new ModelRenderer(this, 30, 60);
		this.pikeL1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.pikeL1.addBox(0.5F, -5.5F, -1.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(pikeL1, 0.35F, 0.0F, 0.0F);
		this.pikeL2 = new ModelRenderer(this, 30, 60);
		this.pikeL2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.pikeL2.addBox(0.5F, -5.5F, -0.5F, 1, 3, 1, 0.0F);
		this.pikeL3 = new ModelRenderer(this, 30, 60);
		this.pikeL3.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.pikeL3.addBox(0.5F, -5.5F, 0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(pikeL3, -0.35F, 0.0F, 0.0F);
		this.deflector = new ModelRenderer(this, 25, 45);
		this.deflector.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.deflector.addBox(-3.7F, -2.7F, -3.0F, 3, 3, 6, 0.0F);

		this.bipedLeftArm.addChild(this.scapularLeft);
		this.bipedRightArm.addChild(this.scapularRight);
		this.bipedBody.addChild(this.armorTorso);
		this.scapularLeft.addChild(this.pikeL1);
		this.scapularLeft.addChild(this.pikeL2);
		this.scapularLeft.addChild(this.pikeL3);
		this.scapularRight.addChild(this.deflector);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
	}

	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
