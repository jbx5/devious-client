


import net.runelite.rs.Reflection; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
final class class430 implements class427 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Object;Lpi;I)V", garbageValue = 
	"-700069158")

	public void vmethod7597(Object var1, Buffer var2) {
		this.method7570(((Long) (var1)), var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)Ljava/lang/Object;", garbageValue = 
	"-1640188252")

	public Object vmethod7598(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Long;Lpi;B)V", garbageValue = 
	"-28")

	void method7570(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)Ljava/lang/Class;", garbageValue = 
	"1539194584")

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