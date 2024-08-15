import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("to")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	static ClanSettings field5226;
	@ObfuscatedName("am")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvc;IIIB)V",
		garbageValue = "35"
	)
	static void method9267(SpritePixels var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, MenuAction.method2179(var1, var2, var3), var0.pixels.length * 4);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lkt;I)Z",
		garbageValue = "-481661253"
	)
	static boolean method9268(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = class222.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "533749058"
	)
	@Export("getUserId")
	static long getUserId() {
		return Client.userId;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V",
		garbageValue = "-1689077940"
	)
	static void method9265(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		ReflectionCheck.method672(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < AsyncRestClient.field53.length; ++var4) {
			if (Huffman.field3961[var4] != -1 && AsyncRestClient.field53[var4] == null) {
				AsyncRestClient.field53[var4] = ClientPreferences.archive9.takeFile(Huffman.field3961[var4], 0);
				if (AsyncRestClient.field53[var4] == null) {
					var3 = false;
				}
			}

			if (WorldMapLabelSize.field3032[var4] != -1 && Script.field995[var4] == null) {
				Script.field995[var4] = ClientPreferences.archive9.takeFileEncrypted(WorldMapLabelSize.field3032[var4], 0, class137.field1615[var4]);
				if (Script.field995[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			ReflectionCheck.method672(false);
			var3 = true;

			for (var4 = 0; var4 < AsyncRestClient.field53.length; ++var4) {
				byte[] var17 = Script.field995[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= RestClientThreadFactory.method190(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				ClanChannelMember.method3363();
				Occluder.method4145();
				AbstractWorldMapData.method5949();
				ReflectionCheck.method672(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					ClanChannelMember.method3363();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field767[var4][var5][var18];
							if (var8 != -1) {
								var9 = var8 >> 24 & 3;
								var10 = var8 >> 1 & 3;
								var11 = var8 >> 14 & 1023;
								var12 = var8 >> 3 & 2047;
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < AbstractByteArrayCopier.field3968.length; ++var14) {
									if (AbstractByteArrayCopier.field3968[var14] == var13 && AsyncRestClient.field53[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										TaskHandler.method4571(var0, AsyncRestClient.field53[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								UserComparator10.method3083(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field767[0][var4][var5];
						if (var18 == -1) {
							PlayerCompositionColorTextureOverride.method4751(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				ReflectionCheck.method672(true);

				for (var4 = 0; var4 < 4; ++var4) {
					ClanChannelMember.method3363();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field767[var4][var5][var18];
							if (var20 != -1) {
								var8 = var20 >> 24 & 3;
								var9 = var20 >> 1 & 3;
								var10 = var20 >> 14 & 1023;
								var11 = var20 >> 3 & 2047;
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < AbstractByteArrayCopier.field3968.length; ++var13) {
									if (AbstractByteArrayCopier.field3968[var13] == var12 && Script.field995[var13] != null) {
										Tiles.method2347(var0, Script.field995[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				ReflectionCheck.method672(true);
				ClanChannelMember.method3363();
				class430.method7978(var0);
				ReflectionCheck.method672(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				ClanChannelMember.method3363();
				LoginState.method1213();
				Client.field513 = false;
			}
		}
	}
}
