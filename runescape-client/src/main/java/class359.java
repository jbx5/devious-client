



import net.runelite.rs.Reflection; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public class class359 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lmh;")

	public static final class359 field4222;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lmh;")

	static final class359 field4220;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	1598216455)

	final int field4219;
	static 
	{
		field4222 = new class359(1);
		field4220 = new class359(0);
	}

	class359(int var1) {
		this.field4219 = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"([BI)[B", garbageValue = 
	"-1840227815")

	public static byte[] method6624(byte[] var0) {
		int var1 = var0.length;
		byte[] var2 = new byte[var1];
		System.arraycopy(var0, 0, var2, 0, var1);
		return var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)Ljava/lang/Class;", garbageValue = 
	"1772105666")

	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}
}