import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ux")
public class class537 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	public static final class537 field5332;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	public static final class537 field5333;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	public static final class537 field5331;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 34535067
	)
	public final int field5330;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -266704093
	)
	public final int field5334;
	@ObfuscatedName("aq")
	public final Class field5335;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lut;"
	)
	final class533 field5336;

	static {
		field5332 = new class537(2, 0, Integer.class, new class534());
		field5333 = new class537(0, 1, Long.class, new class536());
		field5331 = new class537(1, 2, String.class, new class538());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lut;)V"
	)
	class537(int var1, int var2, Class var3, class533 var4) {
		this.field5330 = var1;
		this.field5334 = var2;
		this.field5335 = var3;
		this.field5336 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5334;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)Ljava/lang/Object;",
		garbageValue = "-1237041641"
	)
	public Object method9761(Buffer var1) {
		return this.field5336.vmethod9784(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1351469684"
	)
	static final boolean method9779(int var0) {
		return var0 == 14 || var0 == 15 || var0 >= 44 && var0 <= 51;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-91"
	)
	public static void method9770(int var0) {
		MouseHandler.MouseHandler_idleCycles = var0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[Lux;",
		garbageValue = "2048758935"
	)
	public static class537[] method9774() {
		return new class537[]{field5333, field5332, field5331};
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Class;I)Lux;",
		garbageValue = "-200880612"
	)
	public static class537 method9758(Class var0) {
		class537[] var1 = method9774();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class537 var3 = var1[var2];
			if (var3.field5335 == var0) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lvf;I)V",
		garbageValue = "57278149"
	)
	public static void method9759(Object var0, Buffer var1) {
		Class var3 = var0.getClass();
		class537 var4 = method9758(var3);
		if (var4 == null) {
			throw new IllegalArgumentException();
		} else {
			class533 var2 = var4.field5336;
			var2.vmethod9785(var0, var1);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Lvf;IIIIIII)V",
		garbageValue = "-356037928"
	)
	@Export("loadTerrain")
	static final void loadTerrain(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.tileHeights;
		byte[][][] var9 = var0.tileSettings;
		int var10;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
			var9[var2][var3][var4] = 0;

			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					if (var2 == 0) {
						int[] var17 = var8[0][var3];
						int var14 = var5 + 932731;
						int var15 = var6 + 556238;
						int var16 = PlayerUpdateManager.method3033(var14 + 45365, 91923 + var15, 4) - 128 + (PlayerUpdateManager.method3033(var14 + 10294, 37821 + var15, 2) - 128 >> 1) + (PlayerUpdateManager.method3033(var14, var15, 1) - 128 >> 2);
						var16 = (int)((double)var16 * 0.3D) + 35;
						if (var16 < 10) {
							var16 = 10;
						} else if (var16 > 60) {
							var16 = 60;
						}

						var17[var4] = -var16 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.readUnsignedByte();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						var8[0][var3][var4] = -var11 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					AbstractByteArrayCopier.Tiles_overlays[var2][var3][var4] = (short)var1.readShort();
					UserComparator2.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
					Tiles.field1065[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					var9[var2][var3][var4] = (byte)(var10 - 49);
				} else {
					class442.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
				}
			}
		} else {
			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					break;
				}

				if (var10 == 1) {
					var1.readUnsignedByte();
					break;
				}

				if (var10 <= 49) {
					var1.readShort();
				}
			}
		}

	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(B)J",
		garbageValue = "45"
	)
	@Export("getUserHash")
	static long getUserHash() {
		return Client.userHash;
	}

	@ObfuscatedName("lp")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1722508326"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		Messages.updateItemPile2(class162.worldView, var0, var1, var2);
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-58"
	)
	static final int method9781() {
		return Client.menu.menuOptionsCount - 1;
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-119"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		JagexCache.scrollBarSprites[0].drawAt(var0, var1);
		JagexCache.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field599);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field600);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field602);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field602);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field602);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field602);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field601);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field601);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field601);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field601);
	}

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-5"
	)
	public static void method9777(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class141.getPacketBufferNode(ClientPacket.field3345, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeIntLE(var3 ? Client.revision : 0);
		var4.packetBuffer.writeByteAdd(var2);
		var4.packetBuffer.writeShortLE(var0);
		var4.packetBuffer.writeShortLE(var1);
		Client.packetWriter.addNode(var4);
	}
}
