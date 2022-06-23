import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("bm")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("c")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;

	@ObfuscatedName("v")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1266793715)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;

	@ObfuscatedName("f")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;

	@ObfuscatedName("j")
	@Export("Tiles_overlays")
	static byte[][][] Tiles_overlays;

	@ObfuscatedName("e")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;

	@ObfuscatedName("g")
	static byte[][][] field996;

	@ObfuscatedName("s")
	@Export("Tiles_saturation")
	static int[] Tiles_saturation;

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Ljj;")
	@Export("musicTrack")
	public static MusicTrack musicTrack;

	@ObfuscatedName("l")
	static final int[] field1007;

	@ObfuscatedName("a")
	static final int[] field1011;

	@ObfuscatedName("p")
	static final int[] field1003;

	@ObfuscatedName("b")
	static final int[] field1005;

	@ObfuscatedName("n")
	static final int[] field1006;

	@ObfuscatedName("o")
	static final int[] field1002;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = -1814148363)
	@Export("rndHue")
	static int rndHue;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1220296573)
	@Export("rndLightness")
	static int rndLightness;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field1007 = new int[]{ 1, 2, 4, 8 };
		field1011 = new int[]{ 16, 32, 64, 128 };
		field1003 = new int[]{ 1, 0, -1, 0 };
		field1005 = new int[]{ 0, -1, 0, 1 };
		field1006 = new int[]{ 1, -1, -1, 1 };
		field1002 = new int[]{ -1, -1, 1, 1 };
		rndHue = ((int) (Math.random() * 17.0)) - 8;
		rndLightness = ((int) (Math.random() * 33.0)) - 16;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2041916936")
	static void method2065() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
			if (ArchiveDiskActionHandler.field3971 == 0) {
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
				ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
			}
			ArchiveDiskActionHandler.field3971 = 600;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "([BIIIIIIILgg;[Lgv;)V")
	static final void method2007(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;
		while (true) {
			int var12 = var10.readIncrSmallSmart();
			if (var12 == 0) {
				return;
			}
			var11 += var12;
			int var13 = 0;
			while (true) {
				int var14 = var10.readUShortSmart();
				if (var14 == 0) {
					break;
				}
				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectComposition var21 = class162.getObjectDefinition(var11);
					int var22 = var2 + FloorOverlayDefinition.method3810(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					int var23 = var3 + class141.method3044(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
						int var24 = var1;
						if ((Tiles_renderFlags[1][var22][var23] & 2) == 2) {
							var24 = var1 - 1;
						}
						CollisionMap var25 = null;
						if (var24 >= 0) {
							var25 = var9[var24];
						}
						class268.addObjects(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25);
					}
				}
			} 
		} 
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-21")
	static void method2021() {
		Login.worldSelectOpen = false;
		class16.leftTitleSprite.drawAt(Login.xPadding, 0);
		Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
		Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
	}
}