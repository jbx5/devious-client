import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lbo;"
	)
	@Export("pcmPlayerProvider")
	public static class51 pcmPlayerProvider;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1081028821
	)
	@Export("z")
	int z;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -977526839
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 756234425
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2073889549
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1987297085
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -8745652971025510383L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2055775521
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Llz;I)V",
		garbageValue = "-151690096"
	)
	static final void method5888(class309 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var2;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		if (class309.field3273 == var0) {
			var2 = var1.readUnsignedByte();
			var3 = var1.readUnsignedByteAdd();
			var4 = var3 >> 2;
			var5 = var3 & 3;
			var6 = Client.field574[var4];
			var7 = var1.readUnsignedByteSub();
			var8 = (var7 >> 4 & 7) + NpcOverrides.field1944;
			var9 = (var7 & 7) + class235.field2478;
			var10 = var1.readUnsignedShortAddLE();
			if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
				var11 = Client.field652 == -1 ? SecureUrlRequester.Client_plane : Client.field652;
				class482.method8736(var11, var8, var9, var6, var10, var4, var5, var2, 0, -1);
			}

		} else if (class309.field3274 == var0) {
			var2 = var1.readUnsignedShortAdd();
			var3 = var1.readUnsignedByteSub();
			var4 = (var3 >> 4 & 7) + NpcOverrides.field1944;
			var5 = (var3 & 7) + class235.field2478;
			var6 = var1.readUnsignedByteSub();
			var7 = var6 >> 2;
			var8 = var6 & 3;
			var9 = Client.field574[var7];
			if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
				var10 = Client.field652 == -1 ? SecureUrlRequester.Client_plane : Client.field652;
				boolean var25 = class167.method3538(var10, var4, var5, var7, var8, var9, var2);
				if (var25) {
					return;
				}

				MidiPcmStream.method6149(var10, var4, var5, var9, var2);
			}

		} else if (class309.field3264 == var0) {
			var2 = var1.readUnsignedByteSub();
			var3 = (var2 >> 4 & 7) + NpcOverrides.field1944;
			var4 = (var2 & 7) + class235.field2478;
			var5 = var1.readUnsignedIntME();
			var6 = var1.readUnsignedIntME();
			var7 = var1.readUnsignedShortAdd();
			if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
				var8 = Client.field652 == -1 ? SecureUrlRequester.Client_plane : Client.field652;
				class4.method16(var8, var3, var4, var7, var5, var6);
			}

		} else {
			int var12;
			if (class309.field3266 == var0) {
				var2 = var1.readUnsignedByteSub();
				boolean var20 = var1.readUnsignedByteAdd() == 1;
				var4 = var1.readUnsignedShort();
				var5 = var1.readUnsignedIntIME();
				var6 = var1.readUnsignedByteSub();
				var7 = var1.readUnsignedShortLE();
				var8 = var1.readUnsignedByteSub();
				var9 = (var8 >> 4 & 7) + NpcOverrides.field1944;
				var10 = (var8 & 7) + class235.field2478;
				var11 = var1.readUnsignedShortLE();
				if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
					var12 = Client.field652 == -1 ? SecureUrlRequester.Client_plane : Client.field652;
					PcmPlayer.method859(var12, var9, var10, var7, var5, var6, var4, var11, var2, var20);
				}

			} else {
				int var13;
				int var14;
				int var15;
				byte var23;
				if (class309.field3263 == var0) {
					var2 = var1.method9436();
					var3 = var1.readUnsignedShortLE();
					var4 = var1.readUnsignedByteSub();
					byte var21 = var1.readByte();
					var6 = var1.readUnsignedShortAddLE();
					var7 = var1.readUnsignedShortAddLE();
					var8 = var1.readUnsignedShortAdd();
					var23 = var1.readByte();
					var10 = var1.readUnsignedByteNeg() * 4;
					var11 = var1.readUnsignedByteSub() * 4;
					var12 = var1.method9436();
					var13 = var1.readUnsignedByteSub();
					var14 = (var13 >> 4 & 7) + NpcOverrides.field1944;
					var15 = (var13 & 7) + class235.field2478;
					var5 = var21 + var14;
					var9 = var23 + var15;
					if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104 && var5 >= 0 && var9 >= 0 && var5 < 104 && var9 < 104 && var3 != 65535) {
						int var26 = Client.field652 == -1 ? SecureUrlRequester.Client_plane : Client.field652;
						BufferedFile.method9180(var26, var14, var15, var5, var9, var2, var3, var11, var10, var7, var6, var4, var8, var12);
					}

				} else if (class309.field3269 == var0) {
					var2 = var1.readUnsignedByteAdd();
					var3 = (var2 >> 4 & 7) + NpcOverrides.field1944;
					var4 = (var2 & 7) + class235.field2478;
					var5 = var1.readUnsignedByteNeg();
					var6 = var5 >> 2;
					var7 = var5 & 3;
					var8 = Client.field574[var6];
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
						var9 = Client.field652 == -1 ? SecureUrlRequester.Client_plane : Client.field652;
						class482.method8736(var9, var3, var4, var8, -1, var6, var7, 31, 0, -1);
					}

				} else if (class309.field3268 == var0) {
					var2 = var1.readUnsignedShortAddLE();
					var3 = var1.readUnsignedByteSub();
					var4 = (var3 >> 4 & 7) + NpcOverrides.field1944;
					var5 = (var3 & 7) + class235.field2478;
					var6 = var1.readInt();
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						var7 = Client.field652 == -1 ? SecureUrlRequester.Client_plane : Client.field652;
						WorldMapSprite.method5027(var7, var4, var5, var2, var6);
					}

				} else {
					if (class309.field3271 == var0) {
						var2 = var1.readUnsignedByteNeg();
						var3 = var1.readUnsignedByteAdd();
						var4 = (var3 >> 4 & 7) + NpcOverrides.field1944;
						var5 = (var3 & 7) + class235.field2478;
						var6 = var1.readUnsignedByteAdd();
						var7 = var6 >> 4 & 15;
						var8 = var6 & 7;
						var9 = var1.readUnsignedShortAdd();
						if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
							var10 = var7 + 1;
							if (KeyHandler.localPlayer.pathX[0] >= var4 - var10 && KeyHandler.localPlayer.pathX[0] <= var10 + var4 && KeyHandler.localPlayer.pathY[0] >= var5 - var10 && KeyHandler.localPlayer.pathY[0] <= var10 + var5 && class93.clientPreferences.getAreaSoundEffectsVolume() != 0 && var8 > 0 && Client.soundEffectCount < 50) {
								Client.soundEffectIds[Client.soundEffectCount] = var9;
								Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
								Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
								Client.soundEffects[Client.soundEffectCount] = null;
								Client.soundLocations[Client.soundEffectCount] = var7 + (var5 << 8) + (var4 << 16);
								++Client.soundEffectCount;
							}
						}
					}

					if (class309.field3265 == var0) {
						var2 = var1.readUnsignedShortLE();
						var3 = var1.readUnsignedByteNeg();
						var4 = var1.readUnsignedByteSub();
						var5 = (var4 >> 4 & 7) + NpcOverrides.field1944;
						var6 = (var4 & 7) + class235.field2478;
						var7 = var1.readUnsignedShort();
						if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
							var5 = var5 * 128 + 64;
							var6 = var6 * 128 + 64;
							var8 = Client.field652 == -1 ? SecureUrlRequester.Client_plane : Client.field652;
							GraphicsObject var19 = new GraphicsObject(var2, var8, var5, var6, HttpRequestTask.getTileHeight(var5, var6, var8) - var3, var7, Client.cycle);
							Client.graphicsObjects.addFirst(var19);
						}

					} else if (class309.field3267 == var0) {
						var2 = var1.readUnsignedByteAdd();
						var3 = (var2 >> 4 & 7) + NpcOverrides.field1944;
						var4 = (var2 & 7) + class235.field2478;
						var5 = var1.readUnsignedByteNeg();
						var6 = var1.readUnsignedShortAddLE();
						if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
							var7 = Client.field652 == -1 ? SecureUrlRequester.Client_plane : Client.field652;
							ScriptFrame.method1204(var7, var3, var4, var6, var5);
						}

					} else {
						if (class309.field3270 == var0) {
							var2 = var1.readUnsignedShortLE();
							var3 = var1.readUnsignedShort();
							var4 = var1.readUnsignedShortLE();
							var5 = var1.readUnsignedByte();
							var6 = (var5 >> 4 & 7) + NpcOverrides.field1944;
							var7 = (var5 & 7) + class235.field2478;
							byte var22 = var1.readByteNeg();
							var23 = var1.readByteNeg();
							byte var24 = var1.readByteAdd();
							var11 = var1.readUnsignedByte();
							var12 = var11 >> 2;
							var13 = var11 & 3;
							var14 = Client.field574[var12];
							var15 = var1.readUnsignedShort();
							byte var16 = var1.readByteSub();
							Player var17;
							if (var4 == Client.localPlayerIndex) {
								var17 = KeyHandler.localPlayer;
							} else {
								var17 = Client.players[var4];
							}

							if (var17 != null) {
								int var18 = Client.field652 == -1 ? SecureUrlRequester.Client_plane : Client.field652;
								class31.method466(var18, var6, var7, var12, var13, var14, var3, var2, var15, var23, var22, var24, var16, var17);
							}
						}

					}
				}
			}
		}
	}
}
