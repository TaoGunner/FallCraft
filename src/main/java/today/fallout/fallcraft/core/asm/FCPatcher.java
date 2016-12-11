package today.fallout.fallcraft.core.asm;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class FCPatcher
{
	public static void fixArmRotation(ModelBiped modelBiped, Entity entityIn)
	{
		//System.out.println("Surprise!");
		if (entityIn instanceof EntityPlayer)
		{
			modelBiped.bipedLeftArm.rotateAngleY = 0.1F + modelBiped.bipedHead.rotateAngleY;
			modelBiped.bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F) + modelBiped.bipedHead.rotateAngleX;
			modelBiped.bipedRightArm.rotateAngleY = -0.1F + modelBiped.bipedHead.rotateAngleY;
			modelBiped.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F) + modelBiped.bipedHead.rotateAngleX;
		}
	}
}
