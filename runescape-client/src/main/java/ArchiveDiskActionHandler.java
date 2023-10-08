import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 963420465
	)
	static int field4294;
	@ObfuscatedName("ax")
	static boolean field4300;
	@ObfuscatedName("ao")
	static Object field4292;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4294 = 0;
		field4300 = false;
		field4292 = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(field4292) {
						if ((field4300 || field4294 <= 1) && ArchiveDiskActionHandler_requestQueue.method7225()) {
							field4294 = 0;
							field4292.notifyAll();
							return;
						}

						field4294 = 600;
					}
				} else {
					Players.method2741(100L);
					synchronized(field4292) {
						if ((field4300 || field4294 <= 1) && ArchiveDiskActionHandler_requestQueue.method7225()) {
							field4294 = 0;
							field4292.notifyAll();
							return;
						}

						--field4294;
					}
				}
			}
		} catch (Exception var13) {
			class190.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lpu;Lpu;I)V",
		garbageValue = "2109842428"
	)
	static void method6854(Font var0, Font var1) {
		if (SecureRandomCallable.worldSelectBackSprites == null) {
			SecureRandomCallable.worldSelectBackSprites = PacketWriter.method2826(class199.archive8, "sl_back", "");
		}

		if (PendingSpawn.worldSelectFlagSprites == null) {
			PendingSpawn.worldSelectFlagSprites = InvDefinition.method3618(class199.archive8, "sl_flags", "");
		}

		if (ModelData0.worldSelectArrows == null) {
			ModelData0.worldSelectArrows = InvDefinition.method3618(class199.archive8, "sl_arrows", "");
		}

		if (TaskHandler.worldSelectStars == null) {
			TaskHandler.worldSelectStars = InvDefinition.method3618(class199.archive8, "sl_stars", "");
		}

		if (class372.worldSelectLeftSprite == null) {
			class372.worldSelectLeftSprite = class167.SpriteBuffer_getIndexedSpriteByName(class199.archive8, "leftarrow", "");
		}

		if (class230.worldSelectRightSprite == null) {
			class230.worldSelectRightSprite = class167.SpriteBuffer_getIndexedSpriteByName(class199.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (TaskHandler.worldSelectStars != null) {
			TaskHandler.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			TaskHandler.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		int var4;
		int var5;
		if (ModelData0.worldSelectArrows != null) {
			int var2 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				ModelData0.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				ModelData0.worldSelectArrows[0].drawAt(var2, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				ModelData0.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				ModelData0.worldSelectArrows[1].drawAt(var2 + 15, 4);
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1);
			int var3 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				ModelData0.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				ModelData0.worldSelectArrows[0].drawAt(var3, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				ModelData0.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				ModelData0.worldSelectArrows[1].drawAt(var3 + 15, 4);
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				ModelData0.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				ModelData0.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				ModelData0.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				ModelData0.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				ModelData0.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				ModelData0.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				ModelData0.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				ModelData0.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (SecureRandomCallable.worldSelectBackSprites != null) {
			byte var23 = 88;
			byte var24 = 19;
			var4 = 765 / (var23 + 1) - 1;
			var5 = 480 / (var24 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var6 != var5 || var7 != var4);

			var6 = (765 - var23 * var4) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var5 * var24) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var23 * var4 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var24 * var5 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (class372.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				class372.worldSelectLeftSprite.drawAt(8, class491.canvasHeight / 2 - class372.worldSelectLeftSprite.subHeight / 2);
			}

			if (class230.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				class230.worldSelectRightSprite.drawAt(class340.canvasWidth - class230.worldSelectRightSprite.subWidth - 8, class491.canvasHeight / 2 - class230.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var5 * var15; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = UserComparator3.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				class110 var20 = null;
				int var21 = 0;
				if (var17.isBeta()) {
					var20 = var17.isMembersOnly() ? class110.field1393 : class110.field1392;
				} else if (var17.isDeadman()) {
					var20 = var17.isMembersOnly() ? class110.field1389 : class110.field1404;
				} else if (var17.method1835()) {
					var21 = 16711680;
					var20 = var17.isMembersOnly() ? class110.field1386 : class110.field1387;
				} else if (var17.method1837()) {
					var20 = var17.isMembersOnly() ? class110.field1390 : class110.field1394;
				} else if (var17.isPvp()) {
					var20 = var17.isMembersOnly() ? class110.field1402 : class110.field1388;
				} else if (var17.method1838()) {
					var20 = var17.isMembersOnly() ? class110.field1397 : class110.field1396;
				} else if (var17.method1839()) {
					var20 = var17.isMembersOnly() ? class110.field1399 : class110.field1398;
				}

				if (var20 == null || var20.field1391 >= SecureRandomCallable.worldSelectBackSprites.length) {
					var20 = var17.isMembersOnly() ? class110.field1401 : class110.field1400;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var23 && MouseHandler.MouseHandler_y < var11 + var24 && var18) {
					Login.hoveredWorldIndex = var16;
					SecureRandomCallable.worldSelectBackSprites[var20.field1391].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					SecureRandomCallable.worldSelectBackSprites[var20.field1391].drawAt(var12, var11);
				}

				if (PendingSpawn.worldSelectFlagSprites != null) {
					PendingSpawn.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var24 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var24 + var7;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var23 + var6;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(UserComparator3.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var22 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var25 + var22 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var22;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 0);
				var1.drawCentered(UserComparator3.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}

	}
}
