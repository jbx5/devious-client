import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "Lnl;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("fn")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1478993123
	)
	final int field2703;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1217958337
	)
	final int field2704;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1407363735
	)
	final int field2705;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2703 = var1; // L: 15
		this.field2704 = var2; // L: 16
		this.field2705 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "2147480714"
	)
	boolean method4687(float var1) {
		return var1 >= (float)this.field2705; // L: 21
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lmv;Lmv;I)V",
		garbageValue = "288051440"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class123.canvasWidth - 765) / 2; // L: 1164
		Login.loginBoxX = Login.xPadding + 202; // L: 1165
		ModeWhere.loginBoxCenter = Login.loginBoxX + 180; // L: 1166
		byte var3;
		int var4;
		int var10;
		int var12;
		int var25;
		int var26;
		int var28;
		int var30;
		int var34;
		int var41;
		if (Login.worldSelectOpen) { // L: 1167
			int var47;
			if (class82.worldSelectBackSprites == null) { // L: 1169
				Archive var42 = ChatChannel.archive8; // L: 1171
				var41 = var42.getGroupId("sl_back"); // L: 1173
				var47 = var42.getFileId(var41, ""); // L: 1174
				SpritePixels[] var49 = AbstractRasterProvider.method8301(var42, var41, var47); // L: 1175
				class82.worldSelectBackSprites = var49; // L: 1177
			}

			if (ReflectionCheck.worldSelectFlagSprites == null) { // L: 1179
				ReflectionCheck.worldSelectFlagSprites = SpriteMask.method5693(ChatChannel.archive8, "sl_flags", "");
			}

			if (UserComparator6.worldSelectArrows == null) { // L: 1180
				UserComparator6.worldSelectArrows = SpriteMask.method5693(ChatChannel.archive8, "sl_arrows", "");
			}

			if (class182.worldSelectStars == null) { // L: 1181
				class182.worldSelectStars = SpriteMask.method5693(ChatChannel.archive8, "sl_stars", "");
			}

			if (class239.worldSelectLeftSprite == null) { // L: 1182
				class239.worldSelectLeftSprite = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(ChatChannel.archive8, "leftarrow", "");
			}

			if (class13.worldSelectRightSprite == null) { // L: 1183
				class13.worldSelectRightSprite = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(ChatChannel.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0); // L: 1184
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624); // L: 1185
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513); // L: 1186
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1); // L: 1187
			if (class182.worldSelectStars != null) { // L: 1188
				class182.worldSelectStars[1].drawAt(Login.xPadding + 140, 1); // L: 1189
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1); // L: 1190
				class182.worldSelectStars[0].drawAt(Login.xPadding + 140, 12); // L: 1191
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1); // L: 1192
			}

			if (UserComparator6.worldSelectArrows != null) { // L: 1194
				var34 = Login.xPadding + 280; // L: 1195
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) { // L: 1196
					UserComparator6.worldSelectArrows[2].drawAt(var34, 4);
				} else {
					UserComparator6.worldSelectArrows[0].drawAt(var34, 4); // L: 1197
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) { // L: 1198
					UserComparator6.worldSelectArrows[3].drawAt(var34 + 15, 4);
				} else {
					UserComparator6.worldSelectArrows[1].drawAt(var34 + 15, 4); // L: 1199
				}

				var0.draw("World", var34 + 32, 17, 16777215, -1); // L: 1200
				var4 = Login.xPadding + 390; // L: 1201
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) { // L: 1202
					UserComparator6.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					UserComparator6.worldSelectArrows[0].drawAt(var4, 4); // L: 1203
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) { // L: 1204
					UserComparator6.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					UserComparator6.worldSelectArrows[1].drawAt(var4 + 15, 4); // L: 1205
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1); // L: 1206
				var41 = Login.xPadding + 500; // L: 1207
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) { // L: 1208
					UserComparator6.worldSelectArrows[2].drawAt(var41, 4);
				} else {
					UserComparator6.worldSelectArrows[0].drawAt(var41, 4); // L: 1209
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) { // L: 1210
					UserComparator6.worldSelectArrows[3].drawAt(var41 + 15, 4);
				} else {
					UserComparator6.worldSelectArrows[1].drawAt(var41 + 15, 4); // L: 1211
				}

				var0.draw("Location", var41 + 32, 17, 16777215, -1); // L: 1212
				var47 = Login.xPadding + 610; // L: 1213
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) { // L: 1214
					UserComparator6.worldSelectArrows[2].drawAt(var47, 4);
				} else {
					UserComparator6.worldSelectArrows[0].drawAt(var47, 4); // L: 1215
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) { // L: 1216
					UserComparator6.worldSelectArrows[3].drawAt(var47 + 15, 4);
				} else {
					UserComparator6.worldSelectArrows[1].drawAt(var47 + 15, 4); // L: 1217
				}

				var0.draw("Type", var47 + 32, 17, 16777215, -1); // L: 1218
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0); // L: 1220
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1); // L: 1221
			Login.hoveredWorldIndex = -1; // L: 1222
			if (class82.worldSelectBackSprites != null) { // L: 1223
				var3 = 88; // L: 1224
				byte var38 = 19; // L: 1225
				var41 = 765 / (var3 + 1) - 1; // L: 1226
				var47 = 480 / (var38 + 1); // L: 1227

				do {
					var25 = var47; // L: 1229
					var26 = var41; // L: 1230
					if (var47 * (var41 - 1) >= World.World_count) { // L: 1231
						--var41;
					}

					if (var41 * (var47 - 1) >= World.World_count) { // L: 1232
						--var47;
					}

					if (var41 * (var47 - 1) >= World.World_count) { // L: 1233
						--var47;
					}
				} while(var47 != var25 || var41 != var26); // L: 1234

				var25 = (765 - var41 * var3) / (var41 + 1); // L: 1236
				if (var25 > 5) { // L: 1237
					var25 = 5;
				}

				var26 = (480 - var38 * var47) / (var47 + 1); // L: 1238
				if (var26 > 5) { // L: 1239
					var26 = 5;
				}

				var28 = (765 - var3 * var41 - var25 * (var41 - 1)) / 2; // L: 1240
				var10 = (480 - var38 * var47 - var26 * (var47 - 1)) / 2; // L: 1241
				var30 = (var47 + World.World_count - 1) / var47; // L: 1242
				Login.worldSelectPagesCount = var30 - var41; // L: 1243
				if (class239.worldSelectLeftSprite != null && Login.worldSelectPage > 0) { // L: 1244
					class239.worldSelectLeftSprite.drawAt(8, class166.canvasHeight / 2 - class239.worldSelectLeftSprite.subHeight / 2); // L: 1245
				}

				if (class13.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) { // L: 1247
					class13.worldSelectRightSprite.drawAt(class123.canvasWidth - class13.worldSelectRightSprite.subWidth - 8, class166.canvasHeight / 2 - class13.worldSelectRightSprite.subHeight / 2); // L: 1248
				}

				var12 = var10 + 23; // L: 1250
				int var37 = var28 + Login.xPadding; // L: 1251
				int var14 = 0; // L: 1252
				boolean var15 = false; // L: 1253
				int var16 = Login.worldSelectPage; // L: 1254

				int var17;
				for (var17 = var47 * var16; var17 < World.World_count && var16 - Login.worldSelectPage < var41; ++var17) { // L: 1255 1256
					World var18 = World.World_worlds[var17]; // L: 1259
					boolean var19 = true; // L: 1260
					String var20 = Integer.toString(var18.population); // L: 1261
					if (var18.population == -1) { // L: 1262
						var20 = "OFF"; // L: 1263
						var19 = false; // L: 1264
					} else if (var18.population > 1980) { // L: 1266
						var20 = "FULL"; // L: 1267
						var19 = false; // L: 1268
					}

					int var22 = 0; // L: 1271
					int var21;
					if (var18.isBeta()) { // L: 1272
						if (var18.isMembersOnly()) { // L: 1273
							var21 = class97.field1305.field1319; // L: 1274
						} else {
							var21 = class97.field1312.field1319; // L: 1277
						}
					} else if (var18.isDeadman()) { // L: 1280
						var22 = 16711680; // L: 1281
						if (var18.isMembersOnly()) { // L: 1282
							var21 = class97.field1311.field1319; // L: 1283
						} else {
							var21 = class97.field1309.field1319; // L: 1286
						}
					} else if (var18.method1739()) { // L: 1289
						if (var18.isMembersOnly()) { // L: 1290
							var21 = class97.field1314.field1319; // L: 1291
						} else {
							var21 = class97.field1310.field1319; // L: 1294
						}
					} else if (var18.isPvp()) { // L: 1297
						if (var18.isMembersOnly()) { // L: 1298
							var21 = class97.field1313.field1319; // L: 1299
						} else {
							var21 = class97.field1308.field1319; // L: 1302
						}
					} else if (var18.method1735()) { // L: 1305
						if (var18.isMembersOnly()) { // L: 1306
							var21 = class97.field1316.field1319; // L: 1307
						} else {
							var21 = class97.field1315.field1319; // L: 1310
						}
					} else if (var18.method1777()) { // L: 1313
						if (var18.isMembersOnly()) { // L: 1314
							var21 = class97.field1318.field1319;
						} else {
							var21 = class97.field1317.field1319; // L: 1315
						}
					} else if (var18.isMembersOnly()) { // L: 1318
						var21 = class97.field1306.field1319; // L: 1319
					} else {
						var21 = class97.field1307.field1319; // L: 1322
					}

					if (MouseHandler.MouseHandler_x >= var37 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var37 + var3 && MouseHandler.MouseHandler_y < var12 + var38 && var19) { // L: 1325
						Login.hoveredWorldIndex = var17; // L: 1326
						class82.worldSelectBackSprites[var21].drawTransOverlayAt(var37, var12, 128, 16777215); // L: 1327
						var15 = true; // L: 1328
					} else {
						class82.worldSelectBackSprites[var21].drawAt(var37, var12); // L: 1330
					}

					if (ReflectionCheck.worldSelectFlagSprites != null) { // L: 1331
						ReflectionCheck.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var37 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var37 + 15, var38 / 2 + var12 + 5, var22, -1); // L: 1332
					var1.drawCentered(var20, var37 + 60, var38 / 2 + var12 + 5, 268435455, -1); // L: 1333
					var12 = var12 + var26 + var38; // L: 1334
					++var14; // L: 1335
					if (var14 >= var47) {
						var12 = var10 + 23; // L: 1336
						var37 = var37 + var3 + var25; // L: 1337
						var14 = 0; // L: 1338
						++var16; // L: 1339
					}
				}

				if (var15) { // L: 1342
					var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6; // L: 1343
					int var32 = var1.ascent + 8; // L: 1344
					int var40 = MouseHandler.MouseHandler_y + 25; // L: 1345
					if (var32 + var40 > 480) { // L: 1346
						var40 = MouseHandler.MouseHandler_y - 25 - var32; // L: 1347
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var40, var17, var32, 16777120); // L: 1349
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var40, var17, var32, 0); // L: 1350
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var40 + var1.ascent + 4, 0, -1); // L: 1351
				}
			}

			class20.rasterProvider.drawFull(0, 0); // L: 1354
		} else {
			TextureProvider.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 1358
			PcmPlayer.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 1359
			MilliClock.logoSprite.drawAt(Login.xPadding + 382 - MilliClock.logoSprite.subWidth / 2, 18); // L: 1360
			if (Client.gameState == 0 || Client.gameState == 5) { // L: 1361
				var3 = 20; // L: 1362
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1); // L: 1363
				var4 = 253 - var3; // L: 1364
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409); // L: 1365
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0); // L: 1366
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409); // L: 1367
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0); // L: 1368
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1); // L: 1369
			}

			String var6;
			String var8;
			String var9;
			char[] var11;
			short var33;
			short var35;
			if (Client.gameState == 20) { // L: 1371
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2); // L: 1372
				var33 = 201; // L: 1373
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1374
				var34 = var33 + 15; // L: 1375
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1376
				var34 += 15; // L: 1377
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1378
				var34 += 15; // L: 1379
				var34 += 7; // L: 1380
				if (Login.loginIndex != 4 && Login.loginIndex != 10) { // L: 1381
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var34, 16777215, 0); // L: 1382
					var35 = 200; // L: 1383
					if (!Player.clientPreferences.method2397()) { // L: 1387
						var6 = Login.Login_username; // L: 1402
					} else {
						var8 = Login.Login_username; // L: 1389
						var10 = var8.length(); // L: 1392
						var11 = new char[var10]; // L: 1394

						for (var12 = 0; var12 < var10; ++var12) { // L: 1395
							var11[var12] = '*';
						}

						var9 = new String(var11); // L: 1396
						var6 = var9; // L: 1400
					}

					for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(0, var6.length() - 1)) { // L: 1405 1406 1407
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var34, 16777215, 0); // L: 1409
					var34 += 15; // L: 1410
					var8 = Login.Login_password; // L: 1412
					var10 = var8.length(); // L: 1415
					var11 = new char[var10]; // L: 1417

					for (var12 = 0; var12 < var10; ++var12) { // L: 1418
						var11[var12] = '*';
					}

					var9 = new String(var11); // L: 1419

					for (var9 = var9; var0.stringWidth(var9) > var35; var9 = var9.substring(1)) { // L: 1423 1424 1425
					}

					var0.draw("Password: " + var9, Login.loginBoxX + 180 - 108, var34, 16777215, 0); // L: 1427
					var34 += 15; // L: 1428
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) { // L: 1431
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171); // L: 1432
				short var23;
				if (Login.loginIndex == 0) { // L: 1433
					var33 = 251; // L: 1434
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1435
					var34 = var33 + 30; // L: 1436
					var4 = Login.loginBoxX + 180 - 80; // L: 1437
					var23 = 291; // L: 1438
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1439
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1440
					var4 = Login.loginBoxX + 180 + 80; // L: 1441
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1442
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0); // L: 1443
				} else if (Login.loginIndex == 1) { // L: 1445
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0); // L: 1446
					var33 = 236; // L: 1447
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1448
					var34 = var33 + 15; // L: 1449
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1450
					var34 += 15; // L: 1451
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1452
					var34 += 15; // L: 1453
					var4 = Login.loginBoxX + 180 - 80; // L: 1454
					var23 = 321; // L: 1455
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1456
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0); // L: 1457
					var4 = Login.loginBoxX + 180 + 80; // L: 1458
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1459
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0); // L: 1460
				} else if (Login.loginIndex == 2) { // L: 1462
					var33 = 201; // L: 1463
					var0.drawCentered(Login.Login_response1, ModeWhere.loginBoxCenter, var33, 16776960, 0); // L: 1464
					var34 = var33 + 15; // L: 1465
					var0.drawCentered(Login.Login_response2, ModeWhere.loginBoxCenter, var34, 16776960, 0); // L: 1466
					var34 += 15; // L: 1467
					var0.drawCentered(Login.Login_response3, ModeWhere.loginBoxCenter, var34, 16776960, 0); // L: 1468
					var34 += 15; // L: 1469
					var34 += 7; // L: 1470
					var0.draw("Login: ", ModeWhere.loginBoxCenter - 110, var34, 16777215, 0); // L: 1471
					var35 = 200; // L: 1472
					if (!Player.clientPreferences.method2397()) { // L: 1476
						var6 = Login.Login_username; // L: 1491
					} else {
						var8 = Login.Login_username; // L: 1478
						var10 = var8.length(); // L: 1481
						var11 = new char[var10]; // L: 1483

						for (var12 = 0; var12 < var10; ++var12) { // L: 1484
							var11[var12] = '*';
						}

						var9 = new String(var11); // L: 1485
						var6 = var9; // L: 1489
					}

					for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(1)) { // L: 1494 1495 1496
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? SoundCache.colorStartTag(16776960) + "|" : ""), ModeWhere.loginBoxCenter - 70, var34, 16777215, 0); // L: 1498
					var34 += 15; // L: 1499
					var8 = Login.Login_password; // L: 1501
					var10 = var8.length(); // L: 1504
					var11 = new char[var10]; // L: 1506

					for (var12 = 0; var12 < var10; ++var12) { // L: 1507
						var11[var12] = '*';
					}

					var9 = new String(var11); // L: 1508

					for (var9 = var9; var0.stringWidth(var9) > var35; var9 = var9.substring(1)) { // L: 1512 1513 1514
					}

					var0.draw("Password: " + var9 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? SoundCache.colorStartTag(16776960) + "|" : ""), ModeWhere.loginBoxCenter - 108, var34, 16777215, 0); // L: 1516
					var34 += 15; // L: 1517
					var33 = 277; // L: 1518
					var10 = ModeWhere.loginBoxCenter + -117; // L: 1519
					IndexedSprite var36 = Client.method1725(Client.Login_isUsernameRemembered, Login.field925); // L: 1520
					var36.drawAt(var10, var33); // L: 1521
					var10 = var10 + var36.subWidth + 5; // L: 1522
					var1.draw("Remember username", var10, var33 + 13, 16776960, 0); // L: 1523
					var10 = ModeWhere.loginBoxCenter + 24; // L: 1524
					var36 = Client.method1725(Player.clientPreferences.method2397(), Login.field920); // L: 1525
					var36.drawAt(var10, var33); // L: 1526
					var10 = var10 + var36.subWidth + 5; // L: 1527
					var1.draw("Hide username", var10, var33 + 13, 16776960, 0); // L: 1528
					var34 = var33 + 15; // L: 1529
					var12 = ModeWhere.loginBoxCenter - 80; // L: 1530
					short var13 = 321; // L: 1531
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20); // L: 1532
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0); // L: 1533
					var12 = ModeWhere.loginBoxCenter + 80; // L: 1534
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20); // L: 1535
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0); // L: 1536
					var33 = 357; // L: 1537
					switch(Login.field903) { // L: 1538
					case 2:
						SceneTilePaint.field2648 = "Having trouble logging in?"; // L: 1540
						break;
					default:
						SceneTilePaint.field2648 = "Can't login? Click here."; // L: 1543
					}

					class269.field3195 = new Bounds(ModeWhere.loginBoxCenter, var33, var1.stringWidth(SceneTilePaint.field2648), 11); // L: 1546
					Projectile.field957 = new Bounds(ModeWhere.loginBoxCenter, var33, var1.stringWidth("Still having trouble logging in?"), 11); // L: 1547
					var1.drawCentered(SceneTilePaint.field2648, ModeWhere.loginBoxCenter, var33, 16777215, 0); // L: 1548
				} else if (Login.loginIndex == 3) { // L: 1550
					var33 = 201; // L: 1551
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1552
					var34 = var33 + 20; // L: 1553
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1554
					var34 += 15; // L: 1555
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1556
					var34 += 15; // L: 1557
					var4 = Login.loginBoxX + 180; // L: 1558
					var23 = 276; // L: 1559
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1560
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1561
					var4 = Login.loginBoxX + 180; // L: 1562
					var23 = 326; // L: 1563
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1564
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0); // L: 1565
				} else {
					String var5;
					if (Login.loginIndex == 4) { // L: 1567
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1568
						var33 = 236; // L: 1569
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1570
						var34 = var33 + 15; // L: 1571
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1572
						var34 += 15; // L: 1573
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1574
						var34 += 15; // L: 1575
						var5 = "PIN: "; // L: 1577
						String var7 = class28.otp; // L: 1579
						var28 = var7.length(); // L: 1582
						char[] var29 = new char[var28]; // L: 1584

						for (var30 = 0; var30 < var28; ++var30) { // L: 1585
							var29[var30] = '*';
						}

						var8 = new String(var29); // L: 1586
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? SoundCache.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var34, 16777215, 0); // L: 1590
						var34 -= 8; // L: 1591
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var34, 16776960, 0); // L: 1592
						var34 += 15; // L: 1593
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var34, 16776960, 0); // L: 1594
						var26 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15; // L: 1595
						var28 = var34 - var0.ascent; // L: 1596
						IndexedSprite var48;
						if (Login.field916) { // L: 1598
							var48 = UserComparator7.options_buttons_2Sprite; // L: 1599
						} else {
							var48 = WorldMapDecoration.options_buttons_0Sprite; // L: 1602
						}

						var48.drawAt(var26, var28); // L: 1604
						var34 += 15; // L: 1605
						var30 = Login.loginBoxX + 180 - 80; // L: 1606
						short var39 = 321; // L: 1607
						Login.titlebuttonSprite.drawAt(var30 - 73, var39 - 20); // L: 1608
						var0.drawCentered("Continue", var30, var39 + 5, 16777215, 0); // L: 1609
						var30 = Login.loginBoxX + 180 + 80; // L: 1610
						Login.titlebuttonSprite.drawAt(var30 - 73, var39 - 20); // L: 1611
						var0.drawCentered("Cancel", var30, var39 + 5, 16777215, 0); // L: 1612
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var39 + 36, 255, 0); // L: 1613
					} else {
						short var43;
						if (Login.loginIndex == 5) { // L: 1615
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0); // L: 1616
							var33 = 221; // L: 1617
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1618
							var34 = var33 + 15; // L: 1619
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1620
							var34 += 15; // L: 1621
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1622
							var34 += 15; // L: 1623
							var34 += 14; // L: 1624
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var34, 16777215, 0); // L: 1625
							var35 = 174; // L: 1626
							if (!Player.clientPreferences.method2397()) { // L: 1630
								var6 = Login.Login_username; // L: 1645
							} else {
								var8 = Login.Login_username; // L: 1632
								var10 = var8.length(); // L: 1635
								var11 = new char[var10]; // L: 1637

								for (var12 = 0; var12 < var10; ++var12) { // L: 1638
									var11[var12] = '*';
								}

								var9 = new String(var11); // L: 1639
								var6 = var9; // L: 1643
							}

							for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(1)) { // L: 1648 1649 1650
							}

							var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? SoundCache.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var34, 16777215, 0); // L: 1652
							var34 += 15; // L: 1653
							var25 = Login.loginBoxX + 180 - 80; // L: 1654
							var43 = 321; // L: 1655
							Login.titlebuttonSprite.drawAt(var25 - 73, var43 - 20); // L: 1656
							var0.drawCentered("Recover", var25, var43 + 5, 16777215, 0); // L: 1657
							var25 = Login.loginBoxX + 180 + 80; // L: 1658
							Login.titlebuttonSprite.drawAt(var25 - 73, var43 - 20); // L: 1659
							var0.drawCentered("Back", var25, var43 + 5, 16777215, 0); // L: 1660
							var43 = 356; // L: 1661
							var1.drawCentered("Still having trouble logging in?", ModeWhere.loginBoxCenter, var43, 268435455, 0); // L: 1662
						} else if (Login.loginIndex == 6) { // L: 1664
							var33 = 201; // L: 1665
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1666
							var34 = var33 + 15; // L: 1667
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1668
							var34 += 15; // L: 1669
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1670
							var34 += 15; // L: 1671
							var4 = Login.loginBoxX + 180; // L: 1672
							var23 = 321; // L: 1673
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1674
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1675
						} else if (Login.loginIndex == 7) { // L: 1677
							if (UserComparator9.field1387 && !Client.onMobile) { // L: 1678
								var33 = 201; // L: 1679
								var0.drawCentered(Login.Login_response1, ModeWhere.loginBoxCenter, var33, 16776960, 0); // L: 1680
								var34 = var33 + 15; // L: 1681
								var0.drawCentered(Login.Login_response2, ModeWhere.loginBoxCenter, var34, 16776960, 0); // L: 1682
								var34 += 15; // L: 1683
								var0.drawCentered(Login.Login_response3, ModeWhere.loginBoxCenter, var34, 16776960, 0); // L: 1684
								var4 = ModeWhere.loginBoxCenter - 150; // L: 1685
								var34 += 10; // L: 1686

								for (var41 = 0; var41 < 8; ++var41) { // L: 1687
									Login.titlebuttonSprite.method8316(var4, var34, 30, 40); // L: 1688
									boolean var27 = var41 == Login.field891 & Client.cycle % 40 < 20; // L: 1689
									var0.draw((Login.field907[var41] == null ? "" : Login.field907[var41]) + (var27 ? SoundCache.colorStartTag(16776960) + "|" : ""), var4 + 10, var34 + 27, 16777215, 0); // L: 1690
									if (var41 != 1 && var41 != 3) { // L: 1691
										var4 += 35; // L: 1696
									} else {
										var4 += 50; // L: 1692
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var34 + 27, 16777215, 0); // L: 1693
									}
								}

								var41 = ModeWhere.loginBoxCenter - 80; // L: 1699
								short var44 = 321; // L: 1700
								Login.titlebuttonSprite.drawAt(var41 - 73, var44 - 20); // L: 1701
								var0.drawCentered("Submit", var41, var44 + 5, 16777215, 0); // L: 1702
								var41 = ModeWhere.loginBoxCenter + 80; // L: 1703
								Login.titlebuttonSprite.drawAt(var41 - 73, var44 - 20); // L: 1704
								var0.drawCentered("Cancel", var41, var44 + 5, 16777215, 0); // L: 1705
							} else {
								var33 = 216; // L: 1708
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1709
								var34 = var33 + 15; // L: 1710
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1711
								var34 += 15; // L: 1712
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1713
								var34 += 15; // L: 1714
								var4 = Login.loginBoxX + 180 - 80; // L: 1715
								var23 = 321; // L: 1716
								Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1717
								var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1718
								var4 = Login.loginBoxX + 180 + 80; // L: 1719
								Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1720
								var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1721
							}
						} else if (Login.loginIndex == 8) { // L: 1724
							var33 = 216; // L: 1725
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1726
							var34 = var33 + 15; // L: 1727
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1728
							var34 += 15; // L: 1729
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1730
							var34 += 15; // L: 1731
							var4 = Login.loginBoxX + 180 - 80; // L: 1732
							var23 = 321; // L: 1733
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1734
							var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0); // L: 1735
							var4 = Login.loginBoxX + 180 + 80; // L: 1736
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1737
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1738
						} else if (Login.loginIndex == 9) { // L: 1740
							var33 = 221; // L: 1741
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1742
							var34 = var33 + 25; // L: 1743
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1744
							var34 += 25; // L: 1745
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1746
							var4 = Login.loginBoxX + 180; // L: 1747
							var23 = 311; // L: 1748
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1749
							var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0); // L: 1750
						} else if (Login.loginIndex == 10) { // L: 1752
							var34 = Login.loginBoxX + 180; // L: 1753
							var35 = 209; // L: 1754
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var35, 16776960, 0); // L: 1755
							var4 = var35 + 20; // L: 1756
							Calendar.field3331.drawAt(var34 - 109, var4); // L: 1757
							class147.field1693.drawAt(var34 - 48, var4 + 18); // L: 1758
						} else if (Login.loginIndex == 12) { // L: 1760
							var34 = ModeWhere.loginBoxCenter; // L: 1761
							var35 = 216; // L: 1762
							var2.drawCentered("Before using this app, please read and accept our", var34, var35, 16777215, 0); // L: 1763
							var4 = var35 + 17; // L: 1764
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var34, var4, 16777215, 0); // L: 1765
							var4 += 17; // L: 1766
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var34, var4, 16777215, 0); // L: 1767
							var4 += 17; // L: 1768
							var2.drawCentered("By accepting, you agree to these documents.", var34, var4, 16777215, 0); // L: 1769
							var34 = ModeWhere.loginBoxCenter - 80; // L: 1770
							var35 = 311; // L: 1771
							Login.titlebuttonSprite.drawAt(var34 - 73, var35 - 20); // L: 1772
							var0.drawCentered("Accept", var34, var35 + 5, 16777215, 0); // L: 1773
							var34 = ModeWhere.loginBoxCenter + 80; // L: 1774
							Login.titlebuttonSprite.drawAt(var34 - 73, var35 - 20); // L: 1775
							var0.drawCentered("Decline", var34, var35 + 5, 16777215, 0); // L: 1776
						} else if (Login.loginIndex == 13) { // L: 1778
							var33 = 231; // L: 1779
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var33, 16777215, 0); // L: 1780
							var34 = var33 + 20; // L: 1781
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var34, 16777215, 0); // L: 1782
							var4 = Login.loginBoxX + 180; // L: 1783
							var33 = 311; // L: 1784
							Login.titlebuttonSprite.drawAt(var4 - 73, var33 - 20); // L: 1785
							var0.drawCentered("Back", var4, var33 + 5, 16777215, 0); // L: 1786
						} else if (Login.loginIndex == 14) { // L: 1788
							var33 = 201; // L: 1789
							String var24 = ""; // L: 1790
							var5 = ""; // L: 1791
							var6 = ""; // L: 1792
							switch(Login.Login_banType) { // L: 1793
							case 0:
								var24 = "Your account has been involved"; // L: 1810
								var5 = "in serious rule breaking."; // L: 1811
								var6 = ""; // L: 1812
								break; // L: 1813
							case 1:
								var24 = "Account locked as we suspect it has been stolen."; // L: 1803
								var5 = Strings.field3748; // L: 1804
								var6 = ""; // L: 1805
								break; // L: 1806
							case 2:
								var24 = "The unpaid balance on your account needs"; // L: 1796
								var5 = "to be resolved before you can play."; // L: 1797
								var6 = Strings.field3965; // L: 1798
								break;
							default:
								Calendar.Login_promptCredentials(false); // L: 1817
							}

							var0.drawCentered(var24, Login.loginBoxX + 180, var33, 16776960, 0); // L: 1821
							var34 = var33 + 20; // L: 1822
							var0.drawCentered(var5, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1823
							var34 += 20; // L: 1824
							var0.drawCentered(var6, Login.loginBoxX + 180, var34, 16776960, 0); // L: 1825
							var25 = Login.loginBoxX + 180; // L: 1826
							var43 = 276; // L: 1827
							Login.titlebuttonSprite.drawAt(var25 - 73, var43 - 20); // L: 1828
							var0.drawCentered("Support Page", var25, var43 + 5, 16777215, 0); // L: 1829
							var25 = Login.loginBoxX + 180; // L: 1830
							var43 = 326; // L: 1831
							Login.titlebuttonSprite.drawAt(var25 - 73, var43 - 20); // L: 1832
							var0.drawCentered("Back", var25, var43 + 5, 16777215, 0); // L: 1833
						} else if (Login.loginIndex == 24) { // L: 1835
							var33 = 221; // L: 1836
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0); // L: 1837
							var34 = var33 + 15; // L: 1838
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1839
							var34 += 15; // L: 1840
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0); // L: 1841
							var34 += 15; // L: 1842
							var4 = Login.loginBoxX + 180; // L: 1843
							var23 = 301; // L: 1844
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1845
							var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0); // L: 1846
						} else if (Login.loginIndex == 26) { // L: 1848
							var33 = 216; // L: 1849
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var33, 16776960, 0); // L: 1850
							var34 = var33 + 15; // L: 1851
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1852
							var34 += 15; // L: 1853
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var34, 16776960, 0); // L: 1854
							var34 += 15; // L: 1855
							var4 = Login.loginBoxX + 180 - 80; // L: 1856
							var23 = 321; // L: 1857
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1858
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0); // L: 1859
							var4 = Login.loginBoxX + 180 + 80; // L: 1860
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20); // L: 1861
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0); // L: 1862
						}
					}
				}
			}

			if (Client.gameState >= 10) { // L: 1865
				int[] var31 = new int[4]; // L: 1866
				Rasterizer2D.Rasterizer2D_getClipArray(var31); // L: 1867
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class166.canvasHeight); // L: 1868
				VertexNormal.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle); // L: 1869
				VertexNormal.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle); // L: 1870
				Rasterizer2D.Rasterizer2D_setClipArray(var31); // L: 1871
			}

			LoginType.title_muteSprite[Player.clientPreferences.method2393() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463); // L: 1873
			if (Client.gameState > 5 && class271.clientLanguage == Language.Language_EN) { // L: 1874
				if (class10.field45 != null) { // L: 1875
					var34 = Login.xPadding + 5; // L: 1876
					var35 = 463; // L: 1877
					byte var45 = 100; // L: 1878
					byte var46 = 35; // L: 1879
					class10.field45.drawAt(var34, var35); // L: 1880
					var0.drawCentered("World" + " " + Client.worldId, var45 / 2 + var34, var46 / 2 + var35 - 2, 16777215, 0); // L: 1881
					if (Frames.World_request != null) { // L: 1882
						var1.drawCentered("Loading...", var45 / 2 + var34, var46 / 2 + var35 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var45 / 2 + var34, var46 / 2 + var35 + 12, 16777215, 0); // L: 1883
					}
				} else {
					class10.field45 = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(ChatChannel.archive8, "sl_button", ""); // L: 1886
				}
			}

		}
	} // L: 1356 1889

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(Lgd;IIII)V",
		garbageValue = "1541393387"
	)
	static void method4684(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Player.clientPreferences.method2474() != 0) { // L: 3474
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) { // L: 3475
				int var4 = var0.soundEffects[var1]; // L: 3476
				if (var4 != 0) { // L: 3480
					int var7 = var4 >> 8; // L: 3481
					int var8 = var4 >> 4 & 7; // L: 3482
					int var9 = var4 & 15; // L: 3483
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3484
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3485
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3486
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3487
					int var10 = (var2 - 64) / 128; // L: 3488
					int var11 = (var3 - 64) / 128; // L: 3489
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3490
					++Client.soundEffectCount; // L: 3491
				}

			}
		}
	} // L: 3493
}
