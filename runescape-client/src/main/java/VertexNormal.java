import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hj")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 852204679)
	@Export("x")
	int x;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -2028083131)
	@Export("y")
	int y;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1173750943)
	@Export("z")
	int z;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -860468825)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(descriptor = "(Lhj;)V")
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "886166360")
	public static boolean method4528(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field136[var0] : false;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "([BIILgg;[Lgv;I)V", garbageValue = "-1413330538")
	static final void method4527(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0);
		int var6 = -1;
		while (true) {
			int var7 = var5.readIncrSmallSmart();
			if (var7 == 0) {
				return;
			}
			var6 += var7;
			int var8 = 0;
			while (true) {
				int var9 = var5.readUShortSmart();
				if (var9 == 0) {
					break;
				}
				var8 += var9 - 1;
				int var10 = var8 & 63;
				int var11 = var8 >> 6 & 63;
				int var12 = var8 >> 12;
				int var13 = var5.readUnsignedByte();
				int var14 = var13 >> 2;
				int var15 = var13 & 3;
				int var16 = var11 + var1;
				int var17 = var10 + var2;
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
					int var18 = var12;
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) {
						var18 = var12 - 1;
					}
					CollisionMap var19 = null;
					if (var18 >= 0) {
						var19 = var4[var18];
					}
					class268.addObjects(var12, var16, var17, var6, var15, var14, var3, var19);
				}
			} 
		} 
	}
}