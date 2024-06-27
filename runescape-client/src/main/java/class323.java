import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ma")
public class class323 implements class318 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	public static final class323 field3544;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	public static final class323 field3539;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	public static final class323 field3538;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	public static final class323 field3537;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	public static final class323 field3540;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	public static final class323 field3541;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	public static final class323 field3542;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	static final class323 field3543;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lma;"
	)
	static final class323[] field3546;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1880455773
	)
	public final int field3536;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -179587169
	)
	public final int field3545;

	static {
		field3544 = new class323(14, 0);
		field3539 = new class323(15, 20);
		field3538 = new class323(16, -2);
		field3537 = new class323(18, -2);
		field3540 = new class323(19, -2);
		field3541 = new class323(20, 58);
		field3542 = new class323(21, 37);
		field3543 = new class323(27, 0);
		field3546 = new class323[32];
		class323[] var0 = class263.method5015();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field3546[var0[var1].field3536] = var0[var1];
		}

	}

	class323(int var1, int var2) {
		this.field3536 = var1;
		this.field3545 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lmb;",
		garbageValue = "1"
	)
	static PacketBufferNode method6113() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1181492300"
	)
	static int method6112(int var0, int var1) {
		FloorOverlayDefinition var2 = class60.method1179(var0);
		if (var2 == null) {
			return var1;
		} else {
			int var3;
			int var4;
			if (var2.secondaryRgb >= 0) {
				var3 = Sound.method3909(var2.secondaryHue, var2.secondarySaturation, var2.secondaryLightness);
				var4 = Player.method2462(var3, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			} else if (var2.texture >= 0) {
				var3 = Player.method2462(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var3 = Sound.method3909(var2.hue, var2.saturation, var2.lightness);
				var4 = Player.method2462(var3, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | -16777216;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	static void method6110() {
		ByteArrayPool.field4842.clear();
		ByteArrayPool.field4842.add(100);
		ByteArrayPool.field4842.add(5000);
		ByteArrayPool.field4842.add(10000);
		ByteArrayPool.field4842.add(30000);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZB)V",
		garbageValue = "-96"
	)
	static void method6111(String var0, boolean var1, String var2, boolean var3) {
		if (var1) {
			if (!var3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var5) {
				}
			}

			if (class31.field150.startsWith("win") && !var3) {
				GameEngine.method655(var0, 0, "openjs");
				return;
			}

			if (class31.field150.startsWith("mac")) {
				GameEngine.method655(var0, 1, var2);
				return;
			}

			GameEngine.method655(var0, 2, "openjs");
		} else {
			GameEngine.method655(var0, 3, "openjs");
		}

	}
}
