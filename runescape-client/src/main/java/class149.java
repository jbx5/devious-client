import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class149 extends class144 {
	@ObfuscatedName("vm")
	static Iterator field1705;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2001320945
	)
	int field1703;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 846715435
	)
	int field1707;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 561447973
	)
	int field1702;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -425673859
	)
	int field1704;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class149(class147 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1703 = var1.readInt();
		this.field1704 = var1.readInt();
		this.field1707 = var1.readUnsignedByte();
		this.field1702 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3252(this.field1703, this.field1704, this.field1707, this.field1702);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "16"
	)
	static int method3186(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class225.method4273(var0, var1, var2);
		} else if (var0 < 1100) {
			return class109.method2718(var0, var1, var2);
		} else if (var0 < 1200) {
			return TextureProvider.method4931(var0, var1, var2);
		} else if (var0 < 1300) {
			return UrlRequester.method2833(var0, var1, var2);
		} else if (var0 < 1400) {
			return class414.method7646(var0, var1, var2);
		} else if (var0 < 1500) {
			return class324.method6176(var0, var1, var2);
		} else if (var0 < 1600) {
			return class141.method3122(var0, var1, var2);
		} else if (var0 < 1700) {
			return class154.method3238(var0, var1, var2);
		} else if (var0 < 1800) {
			return WorldMapLabelSize.method5243(var0, var1, var2);
		} else if (var0 < 1900) {
			return MusicSong.method6238(var0, var1, var2);
		} else if (var0 < 2000) {
			return ScriptFrame.method1147(var0, var1, var2);
		} else if (var0 < 2100) {
			return class109.method2718(var0, var1, var2);
		} else if (var0 < 2200) {
			return TextureProvider.method4931(var0, var1, var2);
		} else if (var0 < 2300) {
			return UrlRequester.method2833(var0, var1, var2);
		} else if (var0 < 2400) {
			return class414.method7646(var0, var1, var2);
		} else if (var0 < 2500) {
			return class324.method6176(var0, var1, var2);
		} else if (var0 < 2600) {
			return HttpResponse.method271(var0, var1, var2);
		} else if (var0 < 2700) {
			return DevicePcmPlayerProvider.method291(var0, var1, var2);
		} else if (var0 < 2800) {
			return class472.method8485(var0, var1, var2);
		} else if (var0 < 2900) {
			return FontName.method8923(var0, var1, var2);
		} else if (var0 < 3000) {
			return ScriptFrame.method1147(var0, var1, var2);
		} else if (var0 < 3200) {
			return Varcs.method2747(var0, var1, var2);
		} else if (var0 < 3300) {
			return class152.method3220(var0, var1, var2);
		} else if (var0 < 3400) {
			return class316.method5941(var0, var1, var2);
		} else if (var0 < 3500) {
			return class134.method3072(var0, var1, var2);
		} else if (var0 < 3600) {
			return UrlRequester.method2831(var0, var1, var2);
		} else if (var0 < 3700) {
			return class135.method3078(var0, var1, var2);
		} else if (var0 < 3800) {
			return class93.method2380(var0, var1, var2);
		} else if (var0 < 3900) {
			return GrandExchangeOfferOwnWorldComparator.method1192(var0, var1, var2);
		} else if (var0 < 4000) {
			return Canvas.method297(var0, var1, var2);
		} else if (var0 < 4100) {
			return class191.method3713(var0, var1, var2);
		} else if (var0 < 4200) {
			return class93.method2382(var0, var1, var2);
		} else if (var0 < 4300) {
			return StructComposition.method4031(var0, var1, var2);
		} else if (var0 < 5100) {
			return class107.method2700(var0, var1, var2);
		} else if (var0 < 5400) {
			return ClanChannel.method3397(var0, var1, var2);
		} else if (var0 < 5600) {
			return RouteStrategy.method4399(var0, var1, var2);
		} else if (var0 < 5700) {
			return DevicePcmPlayerProvider.method293(var0, var1, var2);
		} else if (var0 < 6300) {
			return class442.method8004(var0, var1, var2);
		} else if (var0 < 6600) {
			return Projectile.method2176(var0, var1, var2);
		} else if (var0 < 6700) {
			return class347.method6642(var0, var1, var2);
		} else if (var0 < 6800) {
			return FloorUnderlayDefinition.method3965(var0, var1, var2);
		} else if (var0 < 6900) {
			return WorldMapIcon_1.method5262(var0, var1, var2);
		} else if (var0 < 7000) {
			return class185.method3669(var0, var1, var2);
		} else if (var0 < 7100) {
			return SceneTilePaint.method5103(var0, var1, var2);
		} else if (var0 < 7200) {
			return RouteStrategy.method4397(var0, var1, var2);
		} else if (var0 < 7300) {
			return class276.method5577(var0, var1, var2);
		} else if (var0 < 7500) {
			return GameEngine.method620(var0, var1, var2);
		} else if (var0 < 7600) {
			return HttpRequestTask.method270(var0, var1, var2);
		} else if (var0 < 7700) {
			return UserComparator3.method2906(var0, var1, var2);
		} else {
			return var0 < 8100 ? class227.method4309(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(ZLun;I)V",
		garbageValue = "-1924647945"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			var2 = var1.readUnsignedShortAddLE();
			var3 = var1.readUnsignedShortAddLE();
			var1.method9519();
			int var4 = var1.readUnsignedShort();
			MusicPatchPcmStream.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					MusicPatchPcmStream.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			PcmPlayer.regions = new int[var4];
			class390.regionMapArchiveIds = new int[var4];
			Tile.regionLandArchiveIds = new int[var4];
			class73.regionLandArchives = new byte[var4][];
			class127.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					PcmPlayer.regions[var4] = var7;
					class390.regionMapArchiveIds[var4] = class73.archive9.getGroupId("m" + var5 + "_" + var6);
					Tile.regionLandArchiveIds[var4] = class73.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			InvDefinition.method3708(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShort();
			var3 = var1.readUnsignedShortAdd();
			boolean var15 = var1.readUnsignedByteNeg() == 1;
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			MusicPatchPcmStream.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					MusicPatchPcmStream.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			PcmPlayer.regions = new int[var5];
			class390.regionMapArchiveIds = new int[var5];
			Tile.regionLandArchiveIds = new int[var5];
			class73.regionLandArchives = new byte[var5][];
			class127.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (PcmPlayer.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								PcmPlayer.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class390.regionMapArchiveIds[var5] = class73.archive9.getGroupId("m" + var13 + "_" + var14);
								Tile.regionLandArchiveIds[var5] = class73.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			InvDefinition.method3708(var2, var3, !var15);
		}

	}
}
