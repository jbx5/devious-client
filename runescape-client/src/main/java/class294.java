import java.net.URL;
import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import net.runelite.mapping.Export;
@ObfuscatedName("ke")
public class class294 {
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z", garbageValue = "-1442442974")
	static boolean method5736(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class29.field169.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var13.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var8) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Applet var7 = class29.field172;
				Object[] var5 = new Object[]{ new URL(class29.field172.getCodeBase(), var0).toString() };
				Object var3 = JSObject.getWindow(var7).call(var2, var5);
				return var3 != null;
			} catch (Throwable var9) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class29.field172.getAppletContext().showDocument(new URL(class29.field172.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var10) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class27.method346(class29.field172, "loggedout");
			} catch (Throwable var12) {
			}
			try {
				class29.field172.getAppletContext().showDocument(new URL(class29.field172.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var11) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("hh")
	@ObfuscatedSignature(descriptor = "(ZLpq;I)V", garbageValue = "409985565")
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			var2 = var1.readUnsignedShort();
			int var3 = var1.readUnsignedShort();
			var4 = var1.readUnsignedShort();
			WorldMapRegion.xteaKeys = new int[var4][4];
			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					WorldMapRegion.xteaKeys[var5][var6] = var1.readInt();
				}
			}
			Client.regions = new int[var4];
			PcmPlayer.regionMapArchiveIds = new int[var4];
			ObjectSound.regionLandArchiveIds = new int[var4];
			Actor.regionLandArchives = new byte[var4][];
			class145.regionMapArchives = new byte[var4][];
			var4 = 0;
			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) {
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					Client.regions[var4] = var7;
					PcmPlayer.regionMapArchiveIds[var4] = WorldMapSectionType.archive9.getGroupId("m" + var5 + "_" + var6);
					ObjectSound.regionLandArchiveIds[var4] = WorldMapSectionType.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}
			WorldMap.method7377(var3, var2, true);
		} else {
			var2 = var1.readUnsignedShort();
			boolean var15 = var1.readUnsignedByte() == 1;
			var4 = var1.readUnsignedShort();
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
			WorldMapRegion.xteaKeys = new int[var5][4];
			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					WorldMapRegion.xteaKeys[var6][var7] = var1.readInt();
				}
			}
			Client.regions = new int[var5];
			PcmPlayer.regionMapArchiveIds = new int[var5];
			ObjectSound.regionLandArchiveIds = new int[var5];
			Actor.regionLandArchives = new byte[var5][];
			class145.regionMapArchives = new byte[var5][];
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
								if (Client.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}
							if (var12 != -1) {
								Client.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								PcmPlayer.regionMapArchiveIds[var5] = WorldMapSectionType.archive9.getGroupId("m" + var13 + "_" + var14);
								ObjectSound.regionLandArchiveIds[var5] = WorldMapSectionType.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}
			WorldMap.method7377(var4, var2, !var15);
		}
	}
}