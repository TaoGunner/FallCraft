package today.fallout.fallcraft.core.asm;

import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.MethodVisitor;

public class FCClassVisitor extends ClassVisitor
{
	public FCClassVisitor(int api, ClassVisitor classVisitor)
	{
		super(api, classVisitor);
	}

	@Override
	public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions)
	{
		MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
		if (name.equals("setRotationAngles") || name.equals("func_78087_a")) { mv = new FCMethodVisitor(mv); }
		return mv;
	}
}
