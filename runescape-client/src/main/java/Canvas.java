import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -904242969
	)
	@Export("selectedItemId")
	static int selectedItemId;
	@ObfuscatedName("c")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void paint(Graphics var1) {
		this.component.paint(var1); // L: 19
	} // L: 20

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-14"
	)
	public static final void method379(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 79
		ViewportMouse.ViewportMouse_y = var1; // L: 80
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 81
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 82
		ViewportMouse.ViewportMouse_false0 = false; // L: 83
	} // L: 84

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2081819735"
	)
	static void method376(int var0, int var1) {
		int[] var2 = new int[9]; // L: 1491

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1492
			int var4 = var3 * 32 + 15 + 128; // L: 1493
			int var5 = MusicPatchNode2.method5401(var4); // L: 1494
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4]; // L: 1495
			var5 = Huffman.method5646(var5, var1); // L: 1496
			var2[var3] = var6 * var5 >> 16; // L: 1497
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334); // L: 1499
	} // L: 1500

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "121"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0; // L: 10773
	} // L: 10774
}
