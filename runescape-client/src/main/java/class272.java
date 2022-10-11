import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
public class class272 {
	@ObfuscatedName("c")
	static int[] field3209;

	static {
		new Object();
		field3209 = new int[33]; // L: 8
		field3209[0] = 0; // L: 11
		int var0 = 2; // L: 12

		for (int var1 = 1; var1 < 33; ++var1) { // L: 13
			field3209[var1] = var0 - 1; // L: 14
			var0 += var0; // L: 15
		}

	} // L: 17

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(ZLqf;I)V",
		garbageValue = "-1747382017"
	)
	static final void method5399(boolean var0, PacketBuffer var1) {
		while (true) {
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) { // L: 7872
				int var2 = var1.readBits(15); // L: 7873
				if (var2 != 32767) { // L: 7874
					boolean var3 = false; // L: 7875
					if (Client.npcs[var2] == null) { // L: 7876
						Client.npcs[var2] = new NPC(); // L: 7877
						var3 = true; // L: 7878
					}

					NPC var4 = Client.npcs[var2]; // L: 7880
					Client.npcIndices[++Client.npcCount - 1] = var2; // L: 7881
					var4.npcCycle = Client.cycle; // L: 7882
					int var5;
					int var6;
					int var7;
					int var8;
					int var9;
					boolean var10;
					if (WorldMapSectionType.field2826) { // L: 7886
						var5 = var1.readBits(1); // L: 7887
						var4.definition = class193.getNpcDefinition(var1.readBits(14)); // L: 7888
						var8 = var1.readBits(1); // L: 7889
						if (var8 == 1) { // L: 7890
							Client.field550[++Client.field549 - 1] = var2;
						}

						var9 = Client.defaultRotations[var1.readBits(3)]; // L: 7891
						if (var3) { // L: 7892
							var4.orientation = var4.rotation = var9;
						}

						if (var0) { // L: 7893
							var6 = var1.readBits(8); // L: 7894
							if (var6 > 127) { // L: 7895
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5); // L: 7898
							if (var6 > 15) { // L: 7899
								var6 -= 32;
							}
						}

						if (var0) { // L: 7901
							var7 = var1.readBits(8); // L: 7902
							if (var7 > 127) {
								var7 -= 256; // L: 7903
							}
						} else {
							var7 = var1.readBits(5); // L: 7906
							if (var7 > 15) { // L: 7907
								var7 -= 32;
							}
						}

						var10 = var1.readBits(1) == 1; // L: 7909
						if (var10) { // L: 7910
							var1.readBits(32); // L: 7911
						}
					} else {
						var8 = var1.readBits(1); // L: 7915
						if (var8 == 1) { // L: 7916
							Client.field550[++Client.field549 - 1] = var2;
						}

						var9 = Client.defaultRotations[var1.readBits(3)]; // L: 7917
						if (var3) { // L: 7918
							var4.orientation = var4.rotation = var9;
						}

						var10 = var1.readBits(1) == 1; // L: 7919
						if (var10) { // L: 7920
							var1.readBits(32); // L: 7921
						}

						if (var0) { // L: 7923
							var7 = var1.readBits(8); // L: 7924
							if (var7 > 127) { // L: 7925
								var7 -= 256;
							}
						} else {
							var7 = var1.readBits(5); // L: 7928
							if (var7 > 15) { // L: 7929
								var7 -= 32;
							}
						}

						var5 = var1.readBits(1); // L: 7931
						if (var0) { // L: 7932
							var6 = var1.readBits(8); // L: 7933
							if (var6 > 127) { // L: 7934
								var6 -= 256;
							}
						} else {
							var6 = var1.readBits(5); // L: 7937
							if (var6 > 15) { // L: 7938
								var6 -= 32;
							}
						}

						var4.definition = class193.getNpcDefinition(var1.readBits(14)); // L: 7940
					}

					var4.field1131 = var4.definition.size * 235857927; // L: 7942
					var4.field1196 = var4.definition.rotation; // L: 7943
					if (var4.field1196 == 0) { // L: 7944
						var4.rotation = 0;
					}

					var4.walkSequence = var4.definition.walkSequence; // L: 7945
					var4.walkBackSequence = var4.definition.walkBackSequence; // L: 7946
					var4.walkLeftSequence = var4.definition.walkLeftSequence; // L: 7947
					var4.walkRightSequence = var4.definition.walkRightSequence; // L: 7948
					var4.idleSequence = var4.definition.idleSequence; // L: 7949
					var4.turnLeftSequence = var4.definition.turnLeftSequence; // L: 7950
					var4.turnRightSequence = var4.definition.turnRightSequence; // L: 7951
					var4.runSequence = var4.definition.field1944; // L: 7952
					var4.field1189 = var4.definition.field1945; // L: 7953
					var4.field1193 = var4.definition.field1956; // L: 7954
					var4.field1143 = var4.definition.field1947; // L: 7955
					var4.field1144 = var4.definition.field1971; // L: 7956
					var4.field1179 = var4.definition.field1949; // L: 7957
					var4.field1182 = var4.definition.field1950; // L: 7958
					var4.field1171 = var4.definition.field1941; // L: 7959
					var4.method2507(class67.localPlayer.pathX[0] + var6, class67.localPlayer.pathY[0] + var7, var5 == 1); // L: 7960
					continue; // L: 7961
				}
			}

			var1.exportIndex(); // L: 7962
			return; // L: 7963
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-43"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		ChatChannel.scrollBarSprites[0].drawAt(var0, var1); // L: 10437
		ChatChannel.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 10438
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field508); // L: 10439
		int var5 = var3 * (var3 - 32) / var4; // L: 10440
		if (var5 < 8) { // L: 10441
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 10442
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field716); // L: 10443
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field727); // L: 10444
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field727); // L: 10445
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field727); // L: 10446
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field727); // L: 10447
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field568); // L: 10448
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field568); // L: 10449
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var5 + var1 + 15, 16, Client.field568); // L: 10450
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field568); // L: 10451
	} // L: 10452
}
