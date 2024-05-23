import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public class class424 {
	@ObfuscatedName("ak")
	float field4700;
	@ObfuscatedName("al")
	float field4708;
	@ObfuscatedName("aj")
	float field4697;
	@ObfuscatedName("az")
	float field4699;
	@ObfuscatedName("af")
	float field4701;
	@ObfuscatedName("aa")
	float field4702;
	@ObfuscatedName("at")
	float field4703;
	@ObfuscatedName("ab")
	float field4704;
	@ObfuscatedName("ac")
	float field4705;
	@ObfuscatedName("ao")
	float field4706;
	@ObfuscatedName("ah")
	float field4707;
	@ObfuscatedName("av")
	float field4698;

	static {
		new class424();
	}

	public class424() {
		this.method7924();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1078685386"
	)
	void method7924() {
		this.field4698 = 0.0F;
		this.field4707 = 0.0F;
		this.field4706 = 0.0F;
		this.field4704 = 0.0F;
		this.field4703 = 0.0F;
		this.field4702 = 0.0F;
		this.field4699 = 0.0F;
		this.field4697 = 0.0F;
		this.field4708 = 0.0F;
		this.field4705 = 1.0F;
		this.field4701 = 1.0F;
		this.field4700 = 1.0F;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "0"
	)
	public void method7925(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4708;
		float var5 = this.field4701;
		float var6 = this.field4704;
		float var7 = this.field4707;
		this.field4708 = var2 * var4 - var3 * this.field4697;
		this.field4697 = var2 * this.field4697 + var4 * var3;
		this.field4701 = var2 * var5 - this.field4702 * var3;
		this.field4702 = this.field4702 * var2 + var3 * var5;
		this.field4704 = var2 * var6 - this.field4705 * var3;
		this.field4705 = this.field4705 * var2 + var6 * var3;
		this.field4707 = var7 * var2 - var3 * this.field4698;
		this.field4698 = var3 * var7 + var2 * this.field4698;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FS)V",
		garbageValue = "16609"
	)
	public void method7926(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4700;
		float var5 = this.field4699;
		float var6 = this.field4703;
		float var7 = this.field4706;
		this.field4700 = var3 * this.field4697 + var4 * var2;
		this.field4697 = this.field4697 * var2 - var3 * var4;
		this.field4699 = this.field4702 * var3 + var5 * var2;
		this.field4702 = this.field4702 * var2 - var3 * var5;
		this.field4703 = var3 * this.field4705 + var2 * var6;
		this.field4705 = this.field4705 * var2 - var6 * var3;
		this.field4706 = var3 * this.field4698 + var2 * var7;
		this.field4698 = this.field4698 * var2 - var7 * var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-275523790"
	)
	void method7927(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4700;
		float var5 = this.field4699;
		float var6 = this.field4703;
		float var7 = this.field4706;
		this.field4700 = var2 * var4 - this.field4708 * var3;
		this.field4708 = var3 * var4 + this.field4708 * var2;
		this.field4699 = var2 * var5 - this.field4701 * var3;
		this.field4701 = var2 * this.field4701 + var5 * var3;
		this.field4703 = var6 * var2 - var3 * this.field4704;
		this.field4704 = var3 * var6 + this.field4704 * var2;
		this.field4706 = var7 * var2 - this.field4707 * var3;
		this.field4707 = var3 * var7 + this.field4707 * var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1486959787"
	)
	public void method7928(float var1, float var2, float var3) {
		this.field4706 += var1;
		this.field4707 += var2;
		this.field4698 += var3;
	}

	public String toString() {
		return this.field4700 + "," + this.field4699 + "," + this.field4703 + "," + this.field4706 + "\n" + this.field4708 + "," + this.field4701 + "," + this.field4704 + "," + this.field4707 + "\n" + this.field4697 + "," + this.field4702 + "," + this.field4705 + "," + this.field4698;
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(
		descriptor = "(ZLuk;I)V",
		garbageValue = "-1290878348"
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
			int var3 = var1.readUnsignedShortAddLE();
			var1.readSignedShort();
			var2 = var1.readUnsignedShortAddLE();
			var4 = var1.readUnsignedShort();
			class17.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class17.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			Client.regions = new int[var4];
			class157.regionMapArchiveIds = new int[var4];
			DesktopPlatformInfoProvider.regionLandArchiveIds = new int[var4];
			class140.regionLandArchives = new byte[var4][];
			WorldMapArchiveLoader.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					Client.regions[var4] = var7;
					class157.regionMapArchiveIds[var4] = SceneTilePaint.archive9.getGroupId("m" + var5 + "_" + var6);
					DesktopPlatformInfoProvider.regionLandArchiveIds[var4] = SceneTilePaint.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			GrandExchangeOffer.method7426(var2, var3, true);
		} else {
			var2 = var1.readUnsignedIntIME();
			boolean var15 = var1.readUnsignedShortAdd() == 1;
			var4 = var1.readUnsignedIntLE();
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.field609[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.field609[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			class17.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class17.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			Client.regions = new int[var5];
			class157.regionMapArchiveIds = new int[var5];
			DesktopPlatformInfoProvider.regionLandArchiveIds = new int[var5];
			class140.regionLandArchives = new byte[var5][];
			WorldMapArchiveLoader.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.field609[var6][var7][var8];
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
								class157.regionMapArchiveIds[var5] = SceneTilePaint.archive9.getGroupId("m" + var13 + "_" + var14);
								DesktopPlatformInfoProvider.regionLandArchiveIds[var5] = SceneTilePaint.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			GrandExchangeOffer.method7426(var2, var4, !var15);
		}

	}
}
