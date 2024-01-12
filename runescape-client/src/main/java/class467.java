import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
public class class467 {
	@ObfuscatedName("am")
	float field4822;
	@ObfuscatedName("ap")
	float field4813;
	@ObfuscatedName("af")
	float field4816;
	@ObfuscatedName("aj")
	float field4821;
	@ObfuscatedName("aq")
	float field4815;
	@ObfuscatedName("ar")
	float field4817;
	@ObfuscatedName("ag")
	float field4818;
	@ObfuscatedName("ao")
	float field4819;
	@ObfuscatedName("ae")
	float field4820;
	@ObfuscatedName("aa")
	float field4812;
	@ObfuscatedName("au")
	float field4814;
	@ObfuscatedName("an")
	float field4823;

	static {
		new class467();
	}

	class467() {
		this.method8614();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1780261737"
	)
	void method8614() {
		this.field4823 = 0.0F;
		this.field4814 = 0.0F;
		this.field4812 = 0.0F;
		this.field4819 = 0.0F;
		this.field4818 = 0.0F;
		this.field4817 = 0.0F;
		this.field4821 = 0.0F;
		this.field4816 = 0.0F;
		this.field4813 = 0.0F;
		this.field4820 = 1.0F;
		this.field4815 = 1.0F;
		this.field4822 = 1.0F;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1687317289"
	)
	void method8615(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4813;
		float var5 = this.field4815;
		float var6 = this.field4819;
		float var7 = this.field4814;
		this.field4813 = var2 * var4 - this.field4816 * var3;
		this.field4816 = var2 * this.field4816 + var3 * var4;
		this.field4815 = var2 * var5 - this.field4817 * var3;
		this.field4817 = var5 * var3 + this.field4817 * var2;
		this.field4819 = var6 * var2 - var3 * this.field4820;
		this.field4820 = var2 * this.field4820 + var3 * var6;
		this.field4814 = var7 * var2 - this.field4823 * var3;
		this.field4823 = var3 * var7 + var2 * this.field4823;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1230248122"
	)
	void method8627(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4822;
		float var5 = this.field4821;
		float var6 = this.field4818;
		float var7 = this.field4812;
		this.field4822 = var4 * var2 + this.field4816 * var3;
		this.field4816 = var2 * this.field4816 - var3 * var4;
		this.field4821 = var5 * var2 + var3 * this.field4817;
		this.field4817 = this.field4817 * var2 - var5 * var3;
		this.field4818 = this.field4820 * var3 + var6 * var2;
		this.field4820 = this.field4820 * var2 - var6 * var3;
		this.field4812 = var2 * var7 + var3 * this.field4823;
		this.field4823 = this.field4823 * var2 - var7 * var3;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "87"
	)
	void method8619(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4822;
		float var5 = this.field4821;
		float var6 = this.field4818;
		float var7 = this.field4812;
		this.field4822 = var2 * var4 - var3 * this.field4813;
		this.field4813 = var4 * var3 + this.field4813 * var2;
		this.field4821 = var5 * var2 - this.field4815 * var3;
		this.field4815 = this.field4815 * var2 + var5 * var3;
		this.field4818 = var6 * var2 - var3 * this.field4819;
		this.field4819 = this.field4819 * var2 + var6 * var3;
		this.field4812 = var7 * var2 - this.field4814 * var3;
		this.field4814 = this.field4814 * var2 + var7 * var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "118251049"
	)
	void method8618(float var1, float var2, float var3) {
		this.field4812 += var1;
		this.field4814 += var2;
		this.field4823 += var3;
	}

	public String toString() {
		return this.field4822 + "," + this.field4821 + "," + this.field4818 + "," + this.field4812 + "\n" + this.field4813 + "," + this.field4815 + "," + this.field4819 + "," + this.field4814 + "\n" + this.field4816 + "," + this.field4817 + "," + this.field4820 + "," + this.field4823;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1253007278"
	)
	static final void method8636(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		GrandExchangeEvents.addGameMessage(30, "", var1);
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(ZLuo;B)V",
		garbageValue = "22"
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
			var1.readShortLE();
			int var3 = var1.readUnsignedShortAdd();
			var2 = var1.readUnsignedShortAddLE();
			var4 = var1.readUnsignedShort();
			class166.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class166.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			class33.regions = new int[var4];
			WorldMapData_0.regionMapArchiveIds = new int[var4];
			class364.regionLandArchiveIds = new int[var4];
			class319.regionLandArchives = new byte[var4][];
			class341.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					class33.regions[var4] = var7;
					WorldMapData_0.regionMapArchiveIds[var4] = class30.archive9.getGroupId("m" + var5 + "_" + var6);
					class364.regionLandArchiveIds[var4] = class30.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			class59.method1170(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShortLE();
			boolean var15 = var1.readUnsignedByteNeg() == 1;
			var4 = var1.readUnsignedShortAddLE();
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
			class166.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class166.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			class33.regions = new int[var5];
			WorldMapData_0.regionMapArchiveIds = new int[var5];
			class364.regionLandArchiveIds = new int[var5];
			class319.regionLandArchives = new byte[var5][];
			class341.regionMapArchives = new byte[var5][];
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
								if (class33.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								class33.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								WorldMapData_0.regionMapArchiveIds[var5] = class30.archive9.getGroupId("m" + var13 + "_" + var14);
								class364.regionLandArchiveIds[var5] = class30.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			class59.method1170(var2, var4, !var15);
		}

	}
}
