package today.fallout.fallcraft.core.asm;

import jdk.internal.org.objectweb.asm.MethodVisitor;
import jdk.internal.org.objectweb.asm.Opcodes;

public class FCMethodVisitor extends MethodVisitor implements Opcodes
{
	public FCMethodVisitor(MethodVisitor methodVisitor)
	{
		super(ASM5, methodVisitor);
	}

	@Override
	public void visitInsn(int opCode)
	{
		if (opCode == RETURN)
		{
			mv.visitVarInsn(ALOAD, 0);
			mv.visitVarInsn(ALOAD, 7);
			mv.visitMethodInsn(INVOKESTATIC, "today/fallout/fallcraft/core/asm/FCPatcher", "fixArmRotation", "(Lnet/minecraft/client/model/ModelBiped;Lnet/minecraft/entity/Entity;)V", false);
		}
		super.visitInsn(opCode);
	}
}
