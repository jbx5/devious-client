import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class232 {
	@ObfuscatedName("az")
	final int[][] field2476;
	@ObfuscatedName("ah")
	final int[][] field2479;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1247409161
	)
	int field2481;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1078506777
	)
	int field2477;
	@ObfuscatedName("an")
	final int[] field2478;
	@ObfuscatedName("ao")
	final int[] field2474;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1133988185
	)
	final int field2480;

	class232(int var1, int var2) {
		this.field2476 = new int[var1][var2];
		this.field2479 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = class193.method3722(var3 / 4);
		this.field2478 = new int[var4];
		this.field2474 = new int[var4];
		this.field2480 = var4 - 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "118"
	)
	void method4401() {
		for (int var1 = 0; var1 < this.field2476.length; ++var1) {
			for (int var2 = 0; var2 < this.field2476[var1].length; ++var2) {
				this.field2476[var1][var2] = 0;
				this.field2479[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "102"
	)
	void method4402(int var1, int var2) {
		this.field2481 = var1;
		this.field2477 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	int method4403() {
		return this.field2481;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1903798289"
	)
	int method4404() {
		return this.field2477;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1073721780"
	)
	int method4405() {
		return this.field2476.length;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1563145756"
	)
	int method4400() {
		return this.field2476[0].length;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "2132677962"
	)
	int[][] method4406() {
		return this.field2476;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-334912628"
	)
	int[][] method4427() {
		return this.field2479;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "11830"
	)
	int[] method4409() {
		return this.field2478;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-2088099832"
	)
	int[] method4428() {
		return this.field2474;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "45"
	)
	int method4430() {
		return this.field2480;
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Llk;I)V",
		garbageValue = "907453280"
	)
	static final void method4433(class311 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var22;
		int var23;
		int var25;
		if (class311.field3312 == var0) {
			var22 = var1.readUnsignedShortAdd();
			var23 = var1.readUnsignedByteAdd();
			var4 = (var23 >> 4 & 7) + ModelData0.field2905;
			var5 = (var23 & 7) + class332.field3602;
			var6 = var1.readUnsignedByteSub();
			var7 = var6 >> 2;
			var8 = var6 & 3;
			var9 = Client.field586[var7];
			var25 = var1.readUnsignedByteSub();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				var11 = Client.field587 == -1 ? class172.Client_plane : Client.field587;
				class332.method6230(var11, var4, var5, var9, var22, var7, var8, var25, 0, -1);
			}

		} else {
			byte var3;
			int var12;
			int var13;
			int var14;
			int var15;
			if (class311.field3305 == var0) {
				byte var2 = var1.readByteSub();
				var3 = var1.readByteSub();
				var4 = var1.readUnsignedShortAdd();
				var5 = var1.readUnsignedShort();
				var6 = var1.readUnsignedByteNeg();
				var7 = var6 >> 2;
				var8 = var6 & 3;
				var9 = Client.field586[var7];
				byte var10 = var1.readByteSub();
				var11 = var1.readUnsignedShortLE();
				var12 = var1.readUnsignedShortLE();
				var13 = var1.readUnsignedByte();
				var14 = (var13 >> 4 & 7) + ModelData0.field2905;
				var15 = (var13 & 7) + class332.field3602;
				byte var16 = var1.readByteNeg();
				Player var17;
				if (var4 == Client.localPlayerIndex) {
					var17 = class133.localPlayer;
				} else {
					var17 = Client.players[var4];
				}

				if (var17 != null) {
					int var18 = Client.field587 == -1 ? class172.Client_plane : Client.field587;
					class129.method3005(var18, var14, var15, var7, var8, var9, var5, var11, var12, var2, var3, var10, var16, var17);
				}
			}

			if (class311.field3307 == var0) {
				var22 = var1.readUnsignedByteAdd();
				var23 = (var22 >> 4 & 7) + ModelData0.field2905;
				var4 = (var22 & 7) + class332.field3602;
				var5 = var1.readUnsignedShortLE();
				var6 = var1.readUnsignedShort();
				var7 = var1.readUnsignedByteAdd();
				if (var23 >= 0 && var4 >= 0 && var23 < 104 && var4 < 104) {
					var23 = var23 * 128 + 64;
					var4 = var4 * 128 + 64;
					var8 = Client.field587 == -1 ? class172.Client_plane : Client.field587;
					GraphicsObject var21 = new GraphicsObject(var6, var8, var23, var4, Canvas.getTileHeight(var23, var4, var8) - var7, var5, Client.cycle);
					Client.graphicsObjects.addFirst(var21);
				}

			} else if (class311.field3310 == var0) {
				var22 = var1.readUnsignedByteNeg() * 4;
				var3 = var1.readByteNeg();
				var4 = var1.readUnsignedShortLE();
				var5 = var1.readUnsignedShortLE();
				var6 = var1.readUnsignedByteAdd() * 4;
				var7 = var1.method9312();
				var8 = var1.method9313();
				var9 = var1.readUnsignedByteSub();
				var25 = (var9 >> 4 & 7) + ModelData0.field2905;
				var11 = (var9 & 7) + class332.field3602;
				byte var27 = var1.readByteAdd();
				var13 = var1.readUnsignedByte();
				var14 = var1.readUnsignedShortAdd();
				var15 = var1.readUnsignedShortLE();
				var12 = var27 + var25;
				var23 = var3 + var11;
				if (var25 >= 0 && var11 >= 0 && var25 < 104 && var11 < 104 && var12 >= 0 && var23 >= 0 && var12 < 104 && var23 < 104 && var14 != 65535) {
					int var28 = Client.field587 == -1 ? class172.Client_plane : Client.field587;
					class156.method3318(var28, var25, var11, var12, var23, var7, var14, var6, var22, var15, var5, var13, var4, var8);
				}

			} else if (class311.field3309 == var0) {
				var22 = var1.readUnsignedByte();
				var23 = var1.readUnsignedShortAddLE();
				var4 = var1.readUnsignedByteAdd();
				var5 = (var4 >> 4 & 7) + ModelData0.field2905;
				var6 = (var4 & 7) + class332.field3602;
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
					var7 = Client.field587 == -1 ? class172.Client_plane : Client.field587;
					class6.method42(var7, var5, var6, var23, var22);
				}

			} else if (class311.field3306 == var0) {
				var22 = var1.readUnsignedShortAdd();
				var23 = var1.readUnsignedByte();
				var4 = var23 >> 2;
				var5 = var23 & 3;
				var6 = Client.field586[var4];
				var7 = var1.readUnsignedByteSub();
				var8 = (var7 >> 4 & 7) + ModelData0.field2905;
				var9 = (var7 & 7) + class332.field3602;
				if (var8 >= 0 && var9 >= 0 && var8 < 103 && var9 < 103) {
					var25 = Client.field587 == -1 ? class172.Client_plane : Client.field587;
					PendingSpawn var19 = Message.method1178(var25, var8, var9, var6);
					if (var19 != null) {
						ObjectComposition var20 = MouseRecorder.getObjectDefinition(var19.field1198);
						if (var20.field2297) {
							var19.field1192 = var22;
							return;
						}
					}

					boolean var26 = HorizontalAlignment.method3853(var25, var8, var9, var4, var5, var6, var22);
					if (var26) {
						return;
					}

					if (var19 != null) {
						var19.field1192 = var22;
					}
				}

			} else if (class311.field3311 == var0) {
				var22 = var1.readUnsignedShortLE();
				var23 = var1.readUnsignedByteSub();
				var4 = (var23 >> 4 & 7) + ModelData0.field2905;
				var5 = (var23 & 7) + class332.field3602;
				var6 = var1.readUnsignedByteSub();
				var7 = var1.readUnsignedByteAdd() & 31;
				var8 = var1.readUnsignedByteAdd();
				var9 = var1.readUnsignedByteAdd();
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
					var25 = var7 + 1;
					if (class133.localPlayer.pathX[0] >= var4 - var25 && class133.localPlayer.pathX[0] <= var4 + var25 && class133.localPlayer.pathY[0] >= var5 - var25 && class133.localPlayer.pathY[0] <= var25 + var5 && NPC.clientPreferences.getAreaSoundEffectsVolume() != 0 && var6 > 0 && Client.soundEffectCount < 50) {
						Client.soundEffectIds[Client.soundEffectCount] = var22;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16);
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var8;
						Client.field770[Client.soundEffectCount] = var9;
						++Client.soundEffectCount;
					}
				}

			} else if (class311.field3314 == var0) {
				var22 = var1.readUnsignedIntLE();
				var23 = var1.readUnsignedShortAddLE();
				var4 = var1.readUnsignedShortLE();
				var5 = var1.readUnsignedShortAdd();
				var6 = var1.readUnsignedByte();
				var7 = var1.readUnsignedByteAdd();
				boolean var24 = var1.readUnsignedByte() == 1;
				var9 = var1.readUnsignedByteAdd();
				var25 = (var9 >> 4 & 7) + ModelData0.field2905;
				var11 = (var9 & 7) + class332.field3602;
				if (var25 >= 0 && var11 >= 0 && var25 < 104 && var11 < 104) {
					var12 = Client.field587 == -1 ? class172.Client_plane : Client.field587;
					class499.method8670(var12, var25, var11, var4, var22, var7, var23, var5, var6, var24);
				}

			} else if (class311.field3308 == var0) {
				var22 = var1.readUnsignedByteSub();
				var23 = (var22 >> 4 & 7) + ModelData0.field2905;
				var4 = (var22 & 7) + class332.field3602;
				var5 = var1.readUnsignedByteSub();
				var6 = var5 >> 2;
				var7 = var5 & 3;
				var8 = Client.field586[var6];
				if (var23 >= 0 && var4 >= 0 && var23 < 104 && var4 < 104) {
					var9 = Client.field587 == -1 ? class172.Client_plane : Client.field587;
					class332.method6230(var9, var23, var4, var8, -1, var6, var7, 31, 0, -1);
				}

			} else if (class311.field3304 == var0) {
				var22 = var1.readUnsignedByteNeg();
				var23 = (var22 >> 4 & 7) + ModelData0.field2905;
				var4 = (var22 & 7) + class332.field3602;
				var5 = var1.readUnsignedIntLE();
				var6 = var1.readUnsignedShortAdd();
				var7 = var1.readUnsignedIntME();
				if (var23 >= 0 && var4 >= 0 && var23 < 104 && var4 < 104) {
					var8 = Client.field587 == -1 ? class172.Client_plane : Client.field587;
					class13.method170(var8, var23, var4, var6, var7, var5);
				}

			} else if (class311.field3302 == var0) {
				var22 = var1.readUnsignedIntLE();
				var23 = var1.readUnsignedByteSub();
				var4 = (var23 >> 4 & 7) + ModelData0.field2905;
				var5 = (var23 & 7) + class332.field3602;
				var6 = var1.readUnsignedShortLE();
				if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
					var7 = Client.field587 == -1 ? class172.Client_plane : Client.field587;
					MusicPatchNode.method6224(var7, var4, var5, var6, var22);
				}

			}
		}
	}
}
