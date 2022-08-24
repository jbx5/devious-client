import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("fm")
public class class181 extends DualNode {
	@ObfuscatedName("o")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;

	@ObfuscatedName("eu")
	@ObfuscatedSignature(descriptor = "Lnz;")
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;

	static {
		new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)J", garbageValue = "1284170470")
	public static synchronized final long method3483() {
		long var0 = System.currentTimeMillis();
		if (var0 < class269.field3178) {
			class269.field3180 += class269.field3178 - var0;
		}
		class269.field3178 = var0;
		return class269.field3180 + var0;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(descriptor = "(ZLqz;I)V", garbageValue = "-736067315")
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			int var2 = var1.readUnsignedShort();
			var3 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedShort();
			class220.xteaKeys = new int[var4][4];
			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class220.xteaKeys[var5][var6] = var1.readInt();
				}
			}
			class394.regions = new int[var4];
			Archive.regionMapArchiveIds = new int[var4];
			NetFileRequest.regionLandArchiveIds = new int[var4];
			TaskHandler.regionLandArchives = new byte[var4][];
			Varcs.regionMapArchives = new byte[var4][];
			var4 = 0;
			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) {
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class394.regions[var4] = var7;
					Archive.regionMapArchiveIds[var4] = class120.archive9.getGroupId("m" + var5 + "_" + var6);
					NetFileRequest.regionLandArchiveIds[var4] = class120.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}
			DevicePcmPlayerProvider.method348(var3, var2, true);
		} else {
			boolean var15 = var1.readUnsignedByteAdd() == 1;
			var3 = var1.readUnsignedShort();
			var4 = var1.readUnsignedShortLE();
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
			class220.xteaKeys = new int[var5][4];
			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class220.xteaKeys[var6][var7] = var1.readInt();
				}
			}
			class394.regions = new int[var5];
			Archive.regionMapArchiveIds = new int[var5];
			NetFileRequest.regionLandArchiveIds = new int[var5];
			TaskHandler.regionLandArchives = new byte[var5][];
			Varcs.regionMapArchives = new byte[var5][];
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
								if (class394.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}
							if (var12 != -1) {
								class394.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								Archive.regionMapArchiveIds[var5] = class120.archive9.getGroupId("m" + var13 + "_" + var14);
								NetFileRequest.regionLandArchiveIds[var5] = class120.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}
			DevicePcmPlayerProvider.method348(var4, var3, !var15);
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(descriptor = "([Lkn;Lkn;ZB)V", garbageValue = "6")
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = (var1.scrollWidth != 0) ? var1.scrollWidth : var1.width;
		int var4 = (var1.scrollHeight != 0) ? var1.scrollHeight : var1.height;
		Canvas.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			Canvas.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}
		InterfaceParent var5 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var1.id)))));
		if (var5 != null) {
			int var6 = var5.group;
			if (ParamComposition.loadInterface(var6)) {
				Canvas.resizeInterface(class358.Widget_interfaceComponents[var6], -1, var3, var4, var2);
			}
		}
		if (var1.contentType == 1337) {
		}
	}

	@ObfuscatedName("jo")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1351544774")
	static final void method3480(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		ClanMate.clientPreferences.updateSoundEffectVolume(var0);
	}
}