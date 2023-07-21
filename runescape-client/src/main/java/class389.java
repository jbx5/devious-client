import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oa")
public final class class389 {
	@ObfuscatedName("aw")
	@Export("base37Table")
	public static final char[] base37Table;
	@ObfuscatedName("ay")
	static long[] field4444;
	@ObfuscatedName("jt")
	@Export("regionMapArchives")
	static byte[][] regionMapArchives;

	static {
		base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		field4444 = new long[12];

		for (int var0 = 0; var0 < field4444.length; ++var0) {
			field4444[var0] = (long)Math.pow(37.0D, (double)var0);
		}

	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V",
		garbageValue = "-811988232"
	)
	static final void method7260(Actor var0) {
		int var2;
		int var3;
		int var4;
		int var6;
		if (var0.targetIndex != -1) {
			Object var1 = null;
			var2 = 65536;
			if (var0.targetIndex < var2) {
				var1 = Client.npcs[var0.targetIndex];
			} else {
				var1 = Client.players[var0.targetIndex - var2];
			}

			if (var1 != null) {
				var3 = var0.x - ((Actor)var1).x;
				var4 = var0.y - ((Actor)var1).y;
				if (var3 != 0 || var4 != 0) {
					var6 = (int)(Math.atan2((double)var3, (double)var4) * 325.94932345220167D) & 2047;
					var0.orientation = var6;
				}
			} else if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1256 > 0) {
			var7 = -1;
			if (var0.field1220 != -1 && var0.field1221 != -1) {
				var2 = var0.field1220 * 128 - AbstractArchive.baseX * 8192 + 64;
				var3 = var0.field1221 * 128 - class148.baseY * 8192 + 64;
				var4 = var0.x - var2;
				int var8 = var0.y - var3;
				if (var4 != 0 || var8 != 0) {
					var6 = (int)(Math.atan2((double)var4, (double)var8) * 325.94932345220167D) & 2047;
					var7 = var6;
				}
			} else if (var0.field1219 != -1) {
				var7 = var0.field1219;
			}

			if (var7 != -1) {
				var0.orientation = var7;
				if (var0.field1222) {
					var0.rotation = var0.orientation;
				}
			}

			var0.method2392();
		}

		var7 = var0.orientation - var0.rotation & 2047;
		if (var7 != 0) {
			boolean var10 = true;
			boolean var11 = true;
			++var0.field1250;
			var4 = var7 > 1024 ? -1 : 1;
			var0.rotation += var4 * var0.field1251;
			boolean var12 = true;
			if (var7 < var0.field1251 || var7 > 2048 - var0.field1251) {
				var0.rotation = var0.orientation;
				var12 = false;
			}

			if (var0.field1251 > 0 && var0.idleSequence == var0.movementSequence && (var0.field1250 > 25 || var12)) {
				if (var4 == -1 && var0.turnLeftSequence != -1) {
					var0.movementSequence = var0.turnLeftSequence;
				} else if (var4 == 1 && var0.turnRightSequence != -1) {
					var0.movementSequence = var0.turnRightSequence;
				} else {
					var0.movementSequence = var0.walkSequence;
				}
			}

			var0.rotation &= 2047;
		} else {
			if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			var0.field1250 = 0;
		}

	}
}
