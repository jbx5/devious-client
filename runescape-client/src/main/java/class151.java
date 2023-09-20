import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class151 extends class161 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 94912453
	)
	int field1679;
	@ObfuscatedName("al")
	byte field1680;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -46389521
	)
	int field1681;
	@ObfuscatedName("ax")
	String field1682;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class151(class162 var1) {
		this.this$0 = var1;
		this.field1679 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "0"
	)
	void vmethod3405(Buffer var1) {
		this.field1679 = var1.readUnsignedShort();
		this.field1680 = var1.readByte();
		this.field1681 = var1.readUnsignedShort();
		var1.readLong();
		this.field1682 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgb;B)V",
		garbageValue = "0"
	)
	void vmethod3411(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1679);
		var2.rank = this.field1680;
		var2.world = this.field1681;
		var2.username = new Username(this.field1682);
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(ZLuy;B)V",
		garbageValue = "43"
	)
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
			int var3 = var1.readUnsignedShortAdd();
			var4 = var1.readUnsignedShort();
			class178.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class178.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class152.regions = new int[var4];
			HorizontalAlignment.regionMapArchiveIds = new int[var4];
			WorldMapIcon_0.regionLandArchiveIds = new int[var4];
			class345.regionLandArchives = new byte[var4][];
			class201.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) {
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class152.regions[var4] = var7;
					HorizontalAlignment.regionMapArchiveIds[var4] = class198.archive9.getGroupId("m" + var5 + "_" + var6);
					WorldMapIcon_0.regionLandArchiveIds[var4] = class198.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			MouseRecorder.method2335(var3, var2, true);
		} else {
			var2 = var1.readUnsignedShortAddLE();
			boolean var15 = var1.readUnsignedByteNeg() == 1;
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
			class178.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class178.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class152.regions = new int[var5];
			HorizontalAlignment.regionMapArchiveIds = new int[var5];
			WorldMapIcon_0.regionLandArchiveIds = new int[var5];
			class345.regionLandArchives = new byte[var5][];
			class201.regionMapArchives = new byte[var5][];
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
								if (class152.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class152.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								HorizontalAlignment.regionMapArchiveIds[var5] = class198.archive9.getGroupId("m" + var13 + "_" + var14);
								WorldMapIcon_0.regionLandArchiveIds[var5] = class198.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			MouseRecorder.method2335(var4, var2, !var15);
		}

	}
}
