import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("aq")
	static final int[] field2116;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 143859779
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1870632745
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -833963677
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field2116 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2116[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "2120653875"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)V",
		garbageValue = "-193468728"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1855235665"
	)
	public static void method4073() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)V",
		garbageValue = "1968561728"
	)
	static void method4074(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		class271.method5644(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < HttpRequest.field47.length; ++var4) {
			if (class111.field1427[var4] != -1 && HttpRequest.field47[var4] == null) {
				HttpRequest.field47[var4] = Bounds.archive9.takeFile(class111.field1427[var4], 0);
				if (HttpRequest.field47[var4] == null) {
					var3 = false;
				}
			}

			if (class462.field4932[var4] != -1 && UserComparator8.field1516[var4] == null) {
				UserComparator8.field1516[var4] = Bounds.archive9.takeFileEncrypted(class462.field4932[var4], 0, GraphicsObject.field914[var4]);
				if (UserComparator8.field1516[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			class271.method5644(false);
			var3 = true;

			for (var4 = 0; var4 < HttpRequest.field47.length; ++var4) {
				byte[] var17 = UserComparator8.field1516[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= class230.method4622(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				GrandExchangeOffer.method7712();
				PlayerUpdateManager.method3035();
				MenuAction.method2299();
				class271.method5644(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					GrandExchangeOffer.method7712();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field591[var4][var5][var18];
							if (var8 != -1) {
								var9 = var8 >> 24 & 3;
								var10 = var8 >> 1 & 3;
								var11 = var8 >> 14 & 1023;
								var12 = var8 >> 3 & 2047;
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < class142.field1664.length; ++var14) {
									if (class142.field1664[var14] == var13 && HttpRequest.field47[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										WorldMapIcon_0.method6097(var0, HttpRequest.field47[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								ClientPreferences.method2841(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field591[0][var4][var5];
						if (var18 == -1) {
							WorldMapID.method6196(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				class271.method5644(true);

				for (var4 = 0; var4 < 4; ++var4) {
					GrandExchangeOffer.method7712();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field591[var4][var5][var18];
							if (var20 != -1) {
								var8 = var20 >> 24 & 3;
								var9 = var20 >> 1 & 3;
								var10 = var20 >> 14 & 1023;
								var11 = var20 >> 3 & 2047;
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < class142.field1664.length; ++var13) {
									if (class142.field1664[var13] == var12 && UserComparator8.field1516[var13] != null) {
										Tiles.method2422(var0, UserComparator8.field1516[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				class271.method5644(true);
				GrandExchangeOffer.method7712();
				class33.method479(var0);
				class271.method5644(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				GrandExchangeOffer.method7712();
				class111.method2994();
				Client.field612 = false;
			}
		}
	}
}
