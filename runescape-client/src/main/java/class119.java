import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("dt")
public class class119 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1488 = new class119(0, 0, ((String) (null)), -1, -1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1490 = new class119(1, 1, ((String) (null)), 0, 2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1468 = new class119(2, 2, ((String) (null)), 1, 2);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1471 = new class119(3, 3, ((String) (null)), 2, 2);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1472 = new class119(4, 4, ((String) (null)), 3, 1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1473 = new class119(5, 5, ((String) (null)), 4, 1);

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1474 = new class119(6, 6, ((String) (null)), 5, 1);

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1475 = new class119(7, 7, ((String) (null)), 6, 3);

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1476 = new class119(8, 8, ((String) (null)), 7, 3);

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1477 = new class119(9, 9, ((String) (null)), 8, 3);

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1478 = new class119(10, 10, ((String) (null)), 0, 7);

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1482 = new class119(11, 11, ((String) (null)), 1, 7);

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1479 = new class119(12, 12, ((String) (null)), 2, 7);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1481 = new class119(13, 13, ((String) (null)), 3, 7);

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1470 = new class119(14, 14, ((String) (null)), 4, 7);

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1483 = new class119(15, 15, ((String) (null)), 5, 7);

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Ldt;")
	static final class119 field1480 = new class119(16, 16, ((String) (null)), 0, 5);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "Lqs;")
	@Export("rasterProvider")
	public static AbstractRasterProvider rasterProvider;

	@ObfuscatedName("qq")
	@ObfuscatedSignature(descriptor = "Lfd;")
	@Export("mouseWheel")
	static class158 mouseWheel;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -752072491)
	final int field1485;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = -1075378133)
	final int field1486;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 2147335737)
	final int field1487;

	@ObfuscatedSignature(descriptor = "(IILjava/lang/String;II)V", garbageValue = "-1")
	class119(int var1, int var2, String var3, int var4, int var5) {
		this.field1485 = var1;
		this.field1486 = var2;
		this.field1487 = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1486;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-404131772")
	int method2723() {
		return this.field1487;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Li;I)Lv;", garbageValue = "1989632710")
	public static class3 method2732(class6 var0) {
		switch (var0.field20) {
			case 0 :
				return new class0();
			default :
				throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)Lfj;", garbageValue = "-2034783467")
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = ((NPCComposition) (NPCComposition.NpcDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1896748538")
	static final int method2724() {
		return ViewportMouse.ViewportMouse_y;
	}

	@ObfuscatedName("ga")
	@ObfuscatedSignature(descriptor = "(IIIIII)V", garbageValue = "-1562460171")
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class12.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var14;
		int var26;
		if (var5 != 0L) {
			var7 = class12.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			boolean var12 = 0L != var5;
			if (var12) {
				boolean var13 = ((int) (var5 >>> 16 & 1L)) == 1;
				var12 = !var13;
			}
			if (var12) {
				var10 = var4;
			}
			int[] var19 = class1.sceneMinimapSprite.pixels;
			var26 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var14 = WorldMapSection2.Entity_unpackID(var5);
			ObjectComposition var15 = FileSystem.getObjectDefinition(var14);
			if (var15.mapSceneId != -1) {
				IndexedSprite var16 = class120.mapSceneSprites[var15.mapSceneId];
				if (var16 != null) {
					int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
					int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
					var16.drawAt(var1 * 4 + var17 + 48, var18 + (104 - var2 - var15.sizeY) * 4 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var19[var26] = var10;
						var19[var26 + 512] = var10;
						var19[var26 + 1024] = var10;
						var19[var26 + 1536] = var10;
					} else if (var8 == 1) {
						var19[var26] = var10;
						var19[var26 + 1] = var10;
						var19[var26 + 2] = var10;
						var19[var26 + 3] = var10;
					} else if (var8 == 2) {
						var19[var26 + 3] = var10;
						var19[var26 + 512 + 3] = var10;
						var19[var26 + 1024 + 3] = var10;
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var19[var26 + 1536] = var10;
						var19[var26 + 1536 + 1] = var10;
						var19[var26 + 1536 + 2] = var10;
						var19[var26 + 1536 + 3] = var10;
					}
				}
				if (var9 == 3) {
					if (var8 == 0) {
						var19[var26] = var10;
					} else if (var8 == 1) {
						var19[var26 + 3] = var10;
					} else if (var8 == 2) {
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var19[var26 + 1536] = var10;
					}
				}
				if (var9 == 2) {
					if (var8 == 3) {
						var19[var26] = var10;
						var19[var26 + 512] = var10;
						var19[var26 + 1024] = var10;
						var19[var26 + 1536] = var10;
					} else if (var8 == 0) {
						var19[var26] = var10;
						var19[var26 + 1] = var10;
						var19[var26 + 2] = var10;
						var19[var26 + 3] = var10;
					} else if (var8 == 1) {
						var19[var26 + 3] = var10;
						var19[var26 + 512 + 3] = var10;
						var19[var26 + 1024 + 3] = var10;
						var19[var26 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var19[var26 + 1536] = var10;
						var19[var26 + 1536 + 1] = var10;
						var19[var26 + 1536 + 2] = var10;
						var19[var26 + 1536 + 3] = var10;
					}
				}
			}
		}
		var5 = class12.scene.getGameObjectTag(var0, var1, var2);
		if (0L != var5) {
			var7 = class12.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = WorldMapSection2.Entity_unpackID(var5);
			ObjectComposition var20 = FileSystem.getObjectDefinition(var10);
			if (var20.mapSceneId != -1) {
				IndexedSprite var28 = class120.mapSceneSprites[var20.mapSceneId];
				if (var28 != null) {
					var26 = (var20.sizeX * 4 - var28.subWidth) / 2;
					var14 = (var20.sizeY * 4 - var28.subHeight) / 2;
					var28.drawAt(var1 * 4 + var26 + 48, (104 - var2 - var20.sizeY) * 4 + var14 + 48);
				}
			} else if (var9 == 9) {
				int var25 = 15658734;
				boolean var27 = var5 != 0L;
				if (var27) {
					boolean var21 = ((int) (var5 >>> 16 & 1L)) == 1;
					var27 = !var21;
				}
				if (var27) {
					var25 = 15597568;
				}
				int[] var22 = class1.sceneMinimapSprite.pixels;
				int var29 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var22[var29] = var25;
					var22[var29 + 1 + 512] = var25;
					var22[var29 + 1024 + 2] = var25;
					var22[var29 + 1536 + 3] = var25;
				} else {
					var22[var29 + 1536] = var25;
					var22[var29 + 1 + 1024] = var25;
					var22[var29 + 512 + 2] = var25;
					var22[var29 + 3] = var25;
				}
			}
		}
		var5 = class12.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = WorldMapSection2.Entity_unpackID(var5);
			ObjectComposition var23 = FileSystem.getObjectDefinition(var7);
			if (var23.mapSceneId != -1) {
				IndexedSprite var24 = class120.mapSceneSprites[var23.mapSceneId];
				if (var24 != null) {
					var10 = (var23.sizeX * 4 - var24.subWidth) / 2;
					int var11 = (var23.sizeY * 4 - var24.subHeight) / 2;
					var24.drawAt(var10 + var1 * 4 + 48, var11 + (104 - var2 - var23.sizeY) * 4 + 48);
				}
			}
		}
	}
}