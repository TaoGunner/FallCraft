package today.fallout.fallcraft.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelSporePlant extends ModelBase {
    public ModelRenderer root;
    public ModelRenderer head;
    public ModelRenderer leaf1;
    public ModelRenderer leaf2;
    public ModelRenderer leaf3;
    public ModelRenderer leaf4;
    public ModelRenderer leaf5;
    public ModelRenderer leaf6;
    public ModelRenderer stem1;
    public ModelRenderer stem2;
    public ModelRenderer stem3;
    public ModelRenderer stemL;
    public ModelRenderer stemR;
    public ModelRenderer leafL;
    public ModelRenderer leafR;
    public ModelRenderer clawRB;
    public ModelRenderer clawLB;
    public ModelRenderer clawRT;
    public ModelRenderer clawLT;
    public ModelRenderer teethRB;
    public ModelRenderer teethLB;
    public ModelRenderer teethRT;
    public ModelRenderer teethLT;

    public ModelSporePlant() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.stem3 = new ModelRenderer(this, 48, 0);
        this.stem3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.stem3.addBox(-2.0F, -32.0F, 19.0F, 4, 14, 4, 0.0F);
        this.setRotateAngle(stem3, 0.6981317007977318F, 0.0F, 0.0F);
        this.leafL = new ModelRenderer(this, 88, 0);
        this.leafL.mirror = true;
        this.leafL.setRotationPoint(9.0F, 0.0F, 0.0F);
        this.leafL.addBox(-1.0F, 0.0F, -4.0F, 12, 0, 8, 0.0F);
        this.setRotateAngle(leafL, -0.08726646259971647F, 0.3490658503988659F, 0.4363323129985824F);
        this.stem2 = new ModelRenderer(this, 32, 0);
        this.stem2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.stem2.addBox(-2.0F, -26.0F, -16.0F, 4, 18, 4, 0.0F);
        this.setRotateAngle(stem2, -0.6981317007977318F, 0.0F, 0.0F);
        this.leaf3 = new ModelRenderer(this, 0, 0);
        this.leaf3.mirror = true;
        this.leaf3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf3.addBox(-4.0F, -12.0F, 2.0F, 8, 12, 0, 0.0F);
        this.setRotateAngle(leaf3, -0.6108652381980153F, 2.0943951023931953F, 0.0F);
        this.clawLB = new ModelRenderer(this, 84, 8);
        this.clawLB.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.clawLB.addBox(-1.0F, 2.0F, -12.0F, 12, 2, 10, 0.0F);
        this.setRotateAngle(clawLB, 0.0F, 0.0F, -0.17453292519943295F);
        this.leaf5 = new ModelRenderer(this, 0, 0);
        this.leaf5.mirror = true;
        this.leaf5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf5.addBox(-4.0F, -12.0F, 2.0F, 8, 12, 0, 0.0F);
        this.setRotateAngle(leaf5, -0.5235987755982988F, 4.1887902047863905F, 0.0F);
        this.leafR = new ModelRenderer(this, 88, 0);
        this.leafR.mirror = true;
        this.leafR.setRotationPoint(9.0F, 0.0F, 0.0F);
        this.leafR.addBox(-1.0F, 0.0F, -4.0F, 12, 0, 8, 0.0F);
        this.setRotateAngle(leafR, 0.08726646259971647F, 0.3490658503988659F, 0.2617993877991494F);
        this.head = new ModelRenderer(this, 0, 24);
        this.head.setRotationPoint(0.0F, -16.0F, -3.0F);
        this.head.addBox(-11.5F, -2.0F, -2.0F, 23, 4, 2, 0.0F);
        this.clawRT = new ModelRenderer(this, 84, 8);
        this.clawRT.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.clawRT.addBox(-11.0F, -4.0F, -12.0F, 12, 2, 10, 0.0F);
        this.setRotateAngle(clawRT, 0.0F, 0.0F, -0.17453292519943295F);
        this.teethLB = new ModelRenderer(this, 64, 0);
        this.teethLB.mirror = true;
        this.teethLB.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.teethLB.addBox(-1.0F, 0.0F, 1.0F, 12, 5, 0, 0.0F);
        this.setRotateAngle(teethLB, 0.22689280275926282F, 0.0F, 0.0F);
        this.stemL = new ModelRenderer(this, 108, 20);
        this.stemL.setRotationPoint(0.0F, -26.0F, 5.0F);
        this.stemL.addBox(0.0F, -0.5F, -0.5F, 9, 1, 1, 0.0F);
        this.setRotateAngle(stemL, 0.0F, 2.792526803190927F, 0.4363323129985824F);
        this.leaf1 = new ModelRenderer(this, 0, 0);
        this.leaf1.mirror = true;
        this.leaf1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf1.addBox(-4.0F, -12.0F, 2.0F, 8, 12, 0, 0.0F);
        this.setRotateAngle(leaf1, -0.5235987755982988F, 0.0F, 0.0F);
        this.teethLT = new ModelRenderer(this, 64, 0);
        this.teethLT.mirror = true;
        this.teethLT.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.teethLT.addBox(-1.0F, 0.0F, 0.0F, 12, 5, 0, 0.0F);
        this.setRotateAngle(teethLT, 2.670353755551324F, 0.0F, 0.0F);
        this.leaf4 = new ModelRenderer(this, 0, 0);
        this.leaf4.mirror = true;
        this.leaf4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf4.addBox(-4.0F, -12.0F, 2.0F, 8, 12, 0, 0.0F);
        this.setRotateAngle(leaf4, -0.7853981633974483F, 3.141592653589793F, 0.0F);
        this.leaf6 = new ModelRenderer(this, 0, 0);
        this.leaf6.mirror = true;
        this.leaf6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf6.addBox(-4.0F, -12.0F, 2.0F, 8, 12, 0, 0.0F);
        this.setRotateAngle(leaf6, -0.6981317007977318F, 55.850536063818545F, 0.0F);
        this.clawLT = new ModelRenderer(this, 84, 8);
        this.clawLT.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.clawLT.addBox(-1.0F, -4.0F, -12.0F, 12, 2, 10, 0.0F);
        this.setRotateAngle(clawLT, 0.0F, 0.0F, 0.17453292519943295F);
        this.teethRT = new ModelRenderer(this, 64, 0);
        this.teethRT.mirror = true;
        this.teethRT.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.teethRT.addBox(-11.0F, 0.0F, 0.0F, 12, 5, 0, 0.0F);
        this.setRotateAngle(teethRT, 2.670353755551324F, 0.0F, 0.0F);
        this.root = new ModelRenderer(this, 50, 20);
        this.root.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.root.addBox(-3.0F, 0.0F, -3.0F, 6, 4, 6, 0.0F);
        this.teethRB = new ModelRenderer(this, 64, 0);
        this.teethRB.mirror = true;
        this.teethRB.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.teethRB.addBox(-11.0F, 0.0F, 1.0F, 12, 5, 0, 0.0F);
        this.setRotateAngle(teethRB, 0.22689280275926282F, 0.0F, 0.0F);
        this.leaf2 = new ModelRenderer(this, 0, 0);
        this.leaf2.mirror = true;
        this.leaf2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leaf2.addBox(-4.0F, -12.0F, 2.0F, 8, 12, 0, 0.0F);
        this.setRotateAngle(leaf2, -0.7853981633974483F, 1.0471975511965976F, 0.0F);
        this.clawRB = new ModelRenderer(this, 84, 8);
        this.clawRB.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.clawRB.addBox(-11.0F, 2.0F, -12.0F, 12, 2, 10, 0.0F);
        this.setRotateAngle(clawRB, 0.0F, 0.0F, 0.17453292519943295F);
        this.stem1 = new ModelRenderer(this, 16, 0);
        this.stem1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.stem1.addBox(-2.0F, -18.0F, -2.0F, 4, 20, 4, 0.0F);
        this.setRotateAngle(stem1, 0.3490658503988659F, 0.0F, 0.0F);
        this.stemR = new ModelRenderer(this, 108, 20);
        this.stemR.setRotationPoint(0.0F, -15.0F, -5.0F);
        this.stemR.addBox(0.0F, -0.5F, -0.5F, 9, 1, 1, 0.0F);
        this.setRotateAngle(stemR, 0.0F, -0.3490658503988659F, -0.2617993877991494F);
        this.root.addChild(this.stem3);
        this.stemL.addChild(this.leafL);
        this.root.addChild(this.stem2);
        this.root.addChild(this.leaf3);
        this.head.addChild(this.clawLB);
        this.root.addChild(this.leaf5);
        this.stemR.addChild(this.leafR);
        this.head.addChild(this.clawRT);
        this.clawLB.addChild(this.teethLB);
        this.root.addChild(this.stemL);
        this.root.addChild(this.leaf1);
        this.clawLT.addChild(this.teethLT);
        this.root.addChild(this.leaf4);
        this.root.addChild(this.leaf6);
        this.head.addChild(this.clawLT);
        this.clawRT.addChild(this.teethRT);
        this.clawRB.addChild(this.teethRB);
        this.root.addChild(this.leaf2);
        this.head.addChild(this.clawRB);
        this.root.addChild(this.stem1);
        this.root.addChild(this.stemR);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.head.render(f5);
        this.root.render(f5);
    }


	@Override
	public void setRotationAngles(float par1float, float par2float, float par3float, float par4float, float par5float, float par6float, Entity par7Entity)
    {
		this.head.rotateAngleY = par4float * 0.5F / (180F/(float)Math.PI);
        this.head.rotateAngleX = par5float * 0.5F / (180F/(float)Math.PI);
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
