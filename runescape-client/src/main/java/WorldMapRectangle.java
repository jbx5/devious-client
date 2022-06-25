import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.Reflection;
import net.runelite.mapping.Export;
@ObfuscatedName("ij")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1451061377)
	@Export("width")
	int width;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -216115115)
	@Export("height")
	int height;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -90003499)
	@Export("x")
	int x;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1498862133)
	@Export("y")
	int y;

	@ObfuscatedSignature(descriptor = "Lhm;")
	final WorldMapManager this$0;

	@ObfuscatedSignature(descriptor = "(Lhm;)V")
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", garbageValue = "-2108490134")
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

	@ObfuscatedName("li")
	@ObfuscatedSignature(descriptor = "(IB)Lps;", garbageValue = "46")
	static class436 method4988(int var0) {
		class436 var1 = ((class436) (Client.Widget_cachedFonts.get(((long) (var0)))));
		if (var1 == null) {
			var1 = new class436(class132.field1588, var0);
		}
		return var1;
	}
}