import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class263 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lji;")

	public static final class263 field3010;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lji;")

	public static final class263 field3004;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lji;")

	public static final class263 field3005;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lji;")

	public static final class263 field3006;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lji;")

	public static final class263 field3007;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lji;")

	public static final class263 field3008;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Lji;")

	public static final class263 field3009;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lji;")

	public static final class263 field3013;
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"Lji;")

	public static final class263 field3011;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lji;")

	public static final class263 field3012;
	static 
	{
		field3010 = new class263(5);
		field3004 = new class263(4);
		field3005 = new class263(6);
		field3006 = new class263(7);
		field3007 = new class263(5);
		field3008 = new class263(3);
		field3009 = new class263(14);
		field3013 = new class263(15);
		field3011 = new class263(2);
		field3012 = new class263(4);
	}

	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"5")

	class263(int var1) {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"-374274388")

	public static int method5208(int var0) {
		var0 = (var0 & 1431655765) + ((var0 >>> 1) & 1431655765);
		var0 = ((var0 >>> 2) & 858993459) + (var0 & 858993459);
		var0 = (var0 + (var0 >>> 4)) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = 
	"(ILko;ZI)V", garbageValue = 
	"-28231882")

	static void method5204(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = StudioGame.getWorldMap().getMapArea(var0);
		int var4 = class19.localPlayer.plane;
		int var5 = (class19.localPlayer.x >> 7) + ApproximateRouteStrategy.baseX;
		int var6 = (class19.localPlayer.y >> 7) + class250.baseY;
		Coord var7 = new Coord(var4, var5, var6);
		StudioGame.getWorldMap().method7319(var3, var7, var1, var2);
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;I)Z", garbageValue = 
	"314452552")

	@Export("isComponentHidden")
	static boolean isComponentHidden(Widget var0) {
		return var0.isHidden;
	}
}