import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("aa")
	static boolean[] field1481;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 460990005
	)
	static int field1480;
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;I)I",
		garbageValue = "-2121627067"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1302234549"
	)
	static int method2976(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("jx")
	@ObfuscatedSignature(
		descriptor = "(ZLun;B)V",
		garbageValue = "5"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			var3 = var1.readUnsignedShortAddLE();
			var1.readShort();
			int var2 = var1.readUnsignedShortLE();
			var4 = var1.readUnsignedShort();
			FriendLoginUpdate.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					FriendLoginUpdate.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class13.regions = new int[var4];
			class318.regionMapArchiveIds = new int[var4];
			class146.regionLandArchiveIds = new int[var4];
			Player.regionLandArchives = new byte[var4][];
			HorizontalAlignment.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class13.regions[var4] = var7;
					class318.regionMapArchiveIds[var4] = JagexCache.archive9.getGroupId("m" + var5 + "_" + var6);
					class146.regionLandArchiveIds[var4] = JagexCache.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			class103.method2750(var2, var3, true);
		} else {
			boolean var15 = var1.readUnsignedByteAdd() == 1;
			var3 = var1.readUnsignedShortAdd();
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
			FriendLoginUpdate.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					FriendLoginUpdate.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class13.regions = new int[var5];
			class318.regionMapArchiveIds = new int[var5];
			class146.regionLandArchiveIds = new int[var5];
			Player.regionLandArchives = new byte[var5][];
			HorizontalAlignment.regionMapArchives = new byte[var5][];
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
								if (class13.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class13.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class318.regionMapArchiveIds[var5] = JagexCache.archive9.getGroupId("m" + var13 + "_" + var14);
								class146.regionLandArchiveIds[var5] = JagexCache.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			class103.method2750(var4, var3, !var15);
		}

	}
}
