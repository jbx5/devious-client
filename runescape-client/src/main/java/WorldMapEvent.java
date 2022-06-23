import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("iy")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("eg")
	@ObfuscatedSignature(descriptor = "Llc;")
	static Archive field2882;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 285885713)
	@Export("mapElement")
	public int mapElement;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lkd;")
	@Export("coord1")
	public Coord coord1;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lkd;")
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(descriptor = "(ILkd;Lkd;)V")
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(DDIB)[D", garbageValue = "-87")
	public static double[] method5119(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;
		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = class357.method6530(((double) (var7)), var0, var2);
			++var7;
		}
		return var6;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2116126418")
	static final void method5120(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = ((float) (var0)) / 200.0F + 0.5F;
		Rasterizer3D.Rasterizer3D_setBrightness(((double) (var1)));
		((TextureProvider) (Rasterizer3D.Rasterizer3D_textureLoader)).setBrightness(((double) (var1)));
		Projectile.method1959();
		class19.clientPreferences.method2255(((double) (var1)));
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "124")
	static final void method5121(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class19.clientPreferences.method2341(var0);
	}
}