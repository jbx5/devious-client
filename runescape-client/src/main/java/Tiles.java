import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 426206599
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("aj")
	@Export("Tiles_overlays")
	static short[][][] Tiles_overlays;
	@ObfuscatedName("ao")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("av")
	static int[] field1050;
	@ObfuscatedName("ay")
	static final int[] field1059;
	@ObfuscatedName("au")
	static final int[] field1047;
	@ObfuscatedName("as")
	static final int[] field1053;
	@ObfuscatedName("aw")
	static final int[] field1054;
	@ObfuscatedName("ad")
	static final int[] field1055;
	@ObfuscatedName("ai")
	static final int[] field1056;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1511509861
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1397851693
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lca;"
	)
	@Export("loginState")
	static LoginState loginState;

	static {
		Tiles_minPlane = 99;
		field1059 = new int[]{1, 2, 4, 8};
		field1047 = new int[]{16, 32, 64, 128};
		field1053 = new int[]{1, 0, -1, 0};
		field1054 = new int[]{0, -1, 0, 1};
		field1055 = new int[]{1, -1, -1, 1};
		field1056 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ldt;[BIIIIIII)V"
	)
	static final void method2249(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Buffer var9 = new Buffer(var1);
		int var10 = -1;

		while (true) {
			int var11 = var9.readIncrSmallSmart();
			if (var11 == 0) {
				return;
			}

			var10 += var11;
			int var12 = 0;

			while (true) {
				int var13 = var9.readUShortSmart();
				if (var13 == 0) {
					break;
				}

				var12 += var13 - 1;
				int var14 = var12 & 63;
				int var15 = var12 >> 6 & 63;
				int var16 = var12 >> 12;
				int var17 = var9.readUnsignedByte();
				int var18 = var17 >> 2;
				int var19 = var17 & 3;
				if (var5 == var16 && var15 >= var6 && var15 < var6 + 8 && var14 >= var7 && var14 < var7 + 8) {
					ObjectComposition var20 = HitSplatDefinition.getObjectDefinition(var10);
					int var23 = var15 & 7;
					int var24 = var14 & 7;
					int var26 = var20.sizeX;
					int var27 = var20.sizeY;
					int var28;
					if ((var19 & 1) == 1) {
						var28 = var26;
						var26 = var27;
						var27 = var28;
					}

					int var25 = var8 & 3;
					int var22;
					if (var25 == 0) {
						var22 = var23;
					} else if (var25 == 1) {
						var22 = var24;
					} else if (var25 == 2) {
						var22 = 7 - var23 - (var26 - 1);
					} else {
						var22 = 7 - var24 - (var27 - 1);
					}

					var28 = var22 + var3;
					int var31 = var15 & 7;
					int var32 = var14 & 7;
					int var34 = var20.sizeX;
					int var35 = var20.sizeY;
					int var36;
					if ((var19 & 1) == 1) {
						var36 = var34;
						var34 = var35;
						var35 = var36;
					}

					int var33 = var8 & 3;
					int var30;
					if (var33 == 0) {
						var30 = var32;
					} else if (var33 == 1) {
						var30 = 7 - var31 - (var34 - 1);
					} else if (var33 == 2) {
						var30 = 7 - var32 - (var35 - 1);
					} else {
						var30 = var31;
					}

					var36 = var30 + var4;
					if (var28 > 0 && var36 > 0 && var28 < var0.sizeX - 1 && var36 < var0.sizeY - 1) {
						int var37 = var2;
						if ((var0.tileSettings[1][var28][var36] & 2) == 2) {
							var37 = var2 - 1;
						}

						CollisionMap var38 = null;
						if (var37 >= 0 && var0.collisionMaps != null) {
							var38 = var0.collisionMaps[var37];
						}

						class130.addObjects(var0, var2, var28, var36, var10, var19 + var8 & 3, var18, var38);
					}
				}
			}
		}
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Lic;IIILdh;I)V",
		garbageValue = "1393536723"
	)
	static void method2272(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length && var0.soundEffects[var1] != null) {
				int var5 = var0.soundEffects[var1].field2271 & 31;
				if ((var5 <= 0 || class459.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var5 != 0 || class459.clientPreferences.getSoundEffectsVolume() != 0)) {
					Sound var6 = var0.soundEffects[var1];
					boolean var9 = var4 == class17.localPlayer;
					if (var6 != null) {
						if (var6.field2271 == 0) {
							if (!var9) {
								return;
							}

							Client.soundLocations[Client.soundEffectCount] = 0;
						} else {
							int var10 = (var2 - 64) / 128;
							int var11 = (var3 - 64) / 128;
							Client.soundLocations[Client.soundEffectCount] = (var11 << 8) + (var10 << 16) + var6.field2271;
						}

						Client.soundEffectIds[Client.soundEffectCount] = var6.field2272;
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6.field2269;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.field785[Client.soundEffectCount] = var6.field2273;
						++Client.soundEffectCount;
					}

				}
			}
		}
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "67"
	)
	static final void method2269(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : Language.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3453()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = WorldMapElement.getPacketBufferNode(ClientPacket.field3350, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + class432.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
