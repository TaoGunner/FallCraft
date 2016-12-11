package today.fallout.fallcraft.core.asm;

import jdk.internal.org.objectweb.asm.ClassReader;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;
import net.minecraft.launchwrapper.IClassTransformer;
import net.minecraftforge.fml.relauncher.CoreModManager;

import java.lang.reflect.Field;

public class ASMClassTransformer implements IClassTransformer, Opcodes
{
	boolean isObfuscated = false;

	@Override
	public byte[] transform(String origClassName, String newClassName, byte[] byteCode)
	{
		try
		{
			Field fieldIsObfuscated = CoreModManager.class.getDeclaredField("deobfuscatedEnvironment");
			fieldIsObfuscated.setAccessible(true);
			isObfuscated = !fieldIsObfuscated.getBoolean(null);
		}
		catch (IllegalAccessException | NoSuchFieldException e) { e.printStackTrace(); }

		if (isObfuscated && newClassName.equals("bjp"))
		{
			ClassReader cr = new ClassReader(byteCode);
			ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
			FCClassVisitor cma = new FCClassVisitor(ASM5, cw);
			cr.accept(cma, 0);
			return cw.toByteArray();
		}

		if (!isObfuscated && newClassName.equals("net.minecraft.client.model.ModelBiped"))
		{
			ClassReader cr = new ClassReader(byteCode);
			ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
			FCClassVisitor cma = new FCClassVisitor(ASM5, cw);
			cr.accept(cma, 0);
			return cw.toByteArray();
		}
		return byteCode;
	}
}
