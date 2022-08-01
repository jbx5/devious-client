import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("dy")
public enum class116 implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ldy;")
	field1431(0, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ldy;")
	field1423(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ldy;")
	field1424(2, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ldy;")
	field1425(3, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ldy;")
	field1422(4, 4);
	@ObfuscatedName("hf")
	@ObfuscatedSignature(descriptor = "Lmx;")
	@Export("fontPlain11")
	static Font fontPlain11;

	@ObfuscatedName("hl")
	@ObfuscatedSignature(descriptor = "Lmx;")
	@Export("fontBold12")
	static Font fontBold12;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -773544317)
	final int field1427;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 2104046389)
	final int field1428;

	class116(int var3, int var4) {
		this.field1427 = var3;
		this.field1428 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1428;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1056521271")
	static void method2767() {
		Tiles.Tiles_minPlane = 99;
		class356.Tiles_underlays = new byte[4][104][104];
		Tiles.Tiles_overlays = new byte[4][104][104];
		Tiles.Tiles_shapes = new byte[4][104][104];
		Tiles.field997 = new byte[4][104][104];
		MouseRecorder.field1060 = new int[4][105][105];
		Tiles.field998 = new byte[4][105][105];
		class295.field3524 = new int[105][105];
		NetFileRequest.Tiles_hue = new int[104];
		class430.Tiles_saturation = new int[104];
		WallDecoration.Tiles_lightness = new int[104];
		class4.Tiles_hueMultiplier = new int[104];
		Tiles.field999 = new int[104];
	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "205788425")
	static final void method2763() {
		FriendSystem.method1764(Tiles.field993, ScriptFrame.field461, class122.field1500);
		WorldMapSectionType.method4927(Canvas.field164, class263.field3029);
		if (WorldMapLabelSize.cameraX == Tiles.field993 && ScriptFrame.field461 == class123.cameraY && Widget.cameraZ == class122.field1500 && Canvas.field164 == UserComparator9.cameraPitch && class263.field3029 == PendingSpawn.cameraYaw) {
			Client.field745 = false;
			Client.isCameraLocked = false;
			WorldMapLabelSize.field2673 = 0;
			LoginScreenAnimation.field1233 = 0;
			UrlRequest.field1350 = 0;
			class83.field1082 = 0;
			ScriptFrame.field459 = 0;
			SoundCache.field325 = 0;
			class115.field1419 = 0;
			class457.field4811 = 0;
			NPC.field1261 = 0;
			ScriptEvent.field1052 = 0;
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-1547558951")
	static final void method2766(int var0, int var1, int var2, int var3) {
		WorldMapID.method4982();
	}
}