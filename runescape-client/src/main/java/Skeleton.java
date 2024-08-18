import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hq")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("jp")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 919453945
	)
	@Export("id")
	int id;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -192143757
	)
	@Export("count")
	int count;
	@ObfuscatedName("ac")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("ae")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	class182 field1972;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field1972 = new class182(var3, var4);
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-530561456"
	)
	public int method3878() {
		return this.count;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Lhh;",
		garbageValue = "1520658395"
	)
	public class182 method3879() {
		return this.field1972;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-919826475"
	)
	public static String method3886(String var0) {
		int var1 = var0.length();
		char[] var2 = new char[var1];
		byte var3 = 2;

		for (int var4 = 0; var4 < var1; ++var4) {
			char var5 = var0.charAt(var4);
			if (var3 == 0) {
				var5 = Character.toLowerCase(var5);
			} else if (var3 == 2 || Character.isUpperCase(var5)) {
				char var6;
				if (var5 != 181 && var5 != 402) {
					var6 = Character.toTitleCase(var5);
				} else {
					var6 = var5;
				}

				var5 = var6;
			}

			if (Character.isLetter(var5)) {
				var3 = 0;
			} else if (var5 != '.' && var5 != '?' && var5 != '!') {
				if (Character.isSpaceChar(var5)) {
					if (var3 != 2) {
						var3 = 1;
					}
				} else {
					var3 = 1;
				}
			} else {
				var3 = 2;
			}

			var2[var4] = var5;
		}

		return new String(var2);
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "7"
	)
	static final void method3882(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = var6 - 334;
		if (var8 < 0) {
			var8 = 0;
		} else if (var8 > 100) {
			var8 = 100;
		}

		int var9 = (Client.zoomWidth - Client.zoomHeight) * var8 / 100 + Client.zoomHeight;
		int var7 = var5 * var9 / 256;
		var8 = 2048 - var3 & 2047;
		var9 = 2048 - var4 & 2047;
		int var10 = 0;
		int var11 = 0;
		int var12 = var7;
		int var13;
		int var14;
		int var15;
		if (var8 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var8];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var15 = var11 * var14 - var13 * var7 >> 16;
			var12 = var14 * var7 + var13 * var11 >> 16;
			var11 = var15;
		}

		if (var9 != 0) {
			var13 = Rasterizer3D.Rasterizer3D_sine[var9];
			var14 = Rasterizer3D.Rasterizer3D_cosine[var9];
			var15 = var10 * var14 + var12 * var13 >> 16;
			var12 = var12 * var14 - var10 * var13 >> 16;
			var10 = var15;
		}

		if (Client.isCameraLocked) {
			class394.field4556 = var0 - var10;
			class219.field2387 = var1 - var11;
			class426.field4703 = var2 - var12;
			class276.field3004 = var3;
			TextureProvider.field2118 = var4;
		} else {
			class433.cameraX = var0 - var10;
			RestClientThreadFactory.cameraY = var1 - var11;
			WorldMapSection0.cameraZ = var2 - var12;
			UserComparator6.cameraPitch = var3;
			class264.cameraYaw = var4;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (class130.oculusOrbFocalPointX >> 7 != class253.localPlayer.x >> 7 || class499.oculusOrbFocalPointY >> 7 != class253.localPlayer.y >> 7)) {
			var13 = class253.localPlayer.plane;
			var14 = (class130.oculusOrbFocalPointX >> 7) + ConcurrentMidiTask.topLevelWorldView.baseX;
			var15 = (class499.oculusOrbFocalPointY >> 7) + ConcurrentMidiTask.topLevelWorldView.baseY;
			FloorDecoration.method3717(var14, var15, var13, true);
		}

	}
}
