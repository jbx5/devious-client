import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
public class class235 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lde;[BIII)V",
		garbageValue = "1525733208"
	)
	static final void method4451(WorldView var0, byte[] var1, int var2, int var3) {
		Buffer var4 = new Buffer(var1);
		int var5 = -1;

		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return;
			}

			var5 += var6;
			int var7 = 0;

			while (true) {
				int var8 = var4.readUShortSmart();
				if (var8 == 0) {
					break;
				}

				var7 += var8 - 1;
				int var9 = var7 & 63;
				int var10 = var7 >> 6 & 63;
				int var11 = var7 >> 12;
				int var12 = var4.readUnsignedByte();
				int var13 = var12 >> 2;
				int var14 = var12 & 3;
				int var15 = var10 + var2;
				int var16 = var3 + var9;
				if (var15 > 0 && var16 > 0 && var15 < var0.tileHeights[0].length - 2 && var16 < var0.tileHeights[0][0].length - 2) {
					int var17 = var11;
					if ((var0.tileSettings[1][var15][var16] & 2) == 2) {
						var17 = var11 - 1;
					}

					CollisionMap var18 = null;
					if (var17 >= 0 && var0.collisionMaps != null) {
						var18 = var0.collisionMaps[var17];
					}

					KeyHandler.addObjects(var0, var11, var15, var16, var5, var14, var13, var18);
				}
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1105010162"
	)
	static final void method4450() {
		AbstractWorldMapIcon.method5076("You can't add yourself to your own ignore list");
	}
}
