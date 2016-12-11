package today.fallout.fallcraft.client.model.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHelmetMetal extends ModelBiped
{
	private ModelRenderer head;
	private ModelRenderer torso;
	private ModelRenderer armLeft;
	private ModelRenderer armRight;
	private ModelRenderer legLeft;
	private ModelRenderer legRight;
	private ModelRenderer helmetB;
	private ModelRenderer helmetT;
	private ModelRenderer helmetFT;
	private ModelRenderer helmetFB;
	private ModelRenderer helmetFR;
	private ModelRenderer helmetFL;
	private ModelRenderer helmetR;
	private ModelRenderer helmetL;
	private ModelRenderer glass;

	public ModelHelmetMetal()
	{
		super(0.0F, 0, 64, 64);
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.glass = new ModelRenderer(this, 52, 57);
		this.glass.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.glass.addBox(-3.0F, -10.5F, -5.0F, 6, 3, 0, 0.0F);
		this.helmetT = new ModelRenderer(this, 11, 46);
		this.helmetT.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.helmetT.addBox(-4.0F, -9.0F, -4.5F, 8, 1, 9, 0.0F);
		this.helmetFT = new ModelRenderer(this, 46, 61);
		this.helmetFT.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.helmetFT.addBox(-4.0F, -8.5F, -5.0F, 8, 2, 1, 0.0F);
		this.helmetFR = new ModelRenderer(this, 40, 60);
		this.helmetFR.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.helmetFR.addBox(-4.0F, -10.5F, -5.0F, 1, 3, 1, 0.0F);
		this.helmetL = new ModelRenderer(this, 0, 47);
		this.helmetL.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.helmetL.addBox(3.5F, -12.5F, -4.5F, 1, 8, 9, 0.0F);
		this.helmetFL = new ModelRenderer(this, 40, 60);
		this.helmetFL.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.helmetFL.addBox(3.0F, -10.5F, -5.0F, 1, 3, 1, 0.0F);
		this.helmetR = new ModelRenderer(this, 0, 47);
		this.helmetR.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.helmetR.addBox(-4.5F, -12.5F, -4.5F, 1, 8, 9, 0.0F);
		this.helmetB = new ModelRenderer(this, 20, 55);
		this.helmetB.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.helmetB.addBox(-4.0F, -8.5F, 4.0F, 8, 8, 1, 0.0F);
		this.helmetFB = new ModelRenderer(this, 46, 60);
		this.helmetFB.setRotationPoint(0.0F, 4.0F, 0.0F);
		this.helmetFB.addBox(-4.0F, -7.5F, -5.0F, 8, 1, 1, 0.0F);

		this.bipedHead.addChild(this.glass);
		this.bipedHead.addChild(this.helmetT);
		this.bipedHead.addChild(this.helmetFT);
		this.bipedHead.addChild(this.helmetFR);
		this.bipedHead.addChild(this.helmetL);
		this.bipedHead.addChild(this.helmetFL);
		this.bipedHead.addChild(this.helmetR);
		this.bipedHead.addChild(this.helmetB);
		this.bipedHead.addChild(this.helmetFB);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
	}
}
