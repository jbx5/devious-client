import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public final class class4 {
	@ObfuscatedName("dm")
	static boolean field9;

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2107420782"
	)
	static void method17(int var0) {
		class423.field4697 = var0;
		class423.field4701 = new class423[var0];
		class423.field4698 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1016993723"
	)
	static boolean method15(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-961108480"
	)
	static final boolean method16(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label69:
		while (true) {
			int var6 = var4.readIncrSmallSmart();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label69;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = HttpRequest.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field573;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("lr")
	@ObfuscatedSignature(
		descriptor = "(Lde;Lug;I)V",
		garbageValue = "1857324243"
	)
	static void method18(WorldView var0, PacketBuffer var1) {
		int var2 = var1.readUnsignedShort();
		WorldEntity var3 = var0.worldEntities[var2];
		WorldView var4 = var3.worldView;
		var4.baseX = var1.readUnsignedShort();
		var4.baseY = var1.readUnsignedShort();
		var4.playerUpdateManager.updatePlayer(var1, false);
		int var5 = var4.sizeX / 8;
		int var6 = var4.sizeY / 8;
		int var7 = var1.readUnsignedShort();
		var1.importIndex();

		int var8;
		int var9;
		int var10;
		int var11;
		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = var1.readBits(1);
					if (var11 == 1) {
						Client.field683[var8][var9][var10] = var1.readBits(26);
					} else {
						Client.field683[var8][var9][var10] = -1;
					}
				}
			}
		}

		var1.exportIndex();
		ApproximateRouteStrategy.field460 = new int[var7][4];

		for (var8 = 0; var8 < var7; ++var8) {
			for (var9 = 0; var9 < 4; ++var9) {
				ApproximateRouteStrategy.field460[var8][var9] = var1.readInt();
			}
		}

		AABB.field3014 = new int[var7];
		class30.field147 = new int[var7];
		class147.field1696 = new int[var7];
		HttpContentType.field5041 = new byte[var7][];
		class366.field4005 = new byte[var7][];
		var7 = 0;

		for (var8 = 0; var8 < 4; ++var8) {
			for (var9 = 0; var9 < var5; ++var9) {
				for (var10 = 0; var10 < var6; ++var10) {
					var11 = Client.field683[var8][var9][var10];
					if (var11 != -1) {
						int var12 = var11 >> 14 & 1023;
						int var13 = var11 >> 3 & 2047;
						int var14 = (var12 / 8 << 8) + var13 / 8;

						int var15;
						for (var15 = 0; var15 < var7; ++var15) {
							if (AABB.field3014[var15] == var14) {
								var14 = -1;
								break;
							}
						}

						if (var14 != -1) {
							AABB.field3014[var7] = var14;
							var15 = var14 >> 8 & 255;
							int var16 = var14 & 255;
							class30.field147[var7] = class157.archive9.getGroupId("m" + var15 + "_" + var16);
							class147.field1696[var7] = class157.archive9.getGroupId("l" + var15 + "_" + var16);
							++var7;
						}
					}
				}
			}
		}

		ClanChannelMember.updateGameState(25);
		Client.field510 = true;
		class170.field1839 = var4;
		class201.method3827(var4);
	}
}
