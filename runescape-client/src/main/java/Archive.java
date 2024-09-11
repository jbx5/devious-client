import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("ad")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -93970877
	)
	@Export("index")
	int index;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 347865881
	)
	volatile int field4508;
	@ObfuscatedName("ar")
	boolean field4509;
	@ObfuscatedName("al")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -729879015
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 291833841
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 962479547
	)
	int field4504;
	@ObfuscatedName("az")
	boolean field4515;
	@ObfuscatedName("aa")
	boolean field4502;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	JagNetThread field4517;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;Lpy;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4508 = 0;
		this.field4509 = false;
		this.field4504 = -1;
		this.field4515 = false;
		this.field4502 = false;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4509 = var7;
		this.field4515 = var8;
		this.field4502 = var9;
		this.field4517 = var3;
		this.field4517.method7619(this, this.index);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method7474() {
		return this.field4508 == 1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "825679276"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4508 == 1 || this.field4515 && this.field4508 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4517.method7623(class388.field4535.field4541, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1085256964"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4517.method7622(this.index, var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "509466096"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			HttpRequestTask.method288(var1, this.archiveDisk, this);
		} else {
			this.field4517.method7630(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1422610858"
	)
	void method7504() {
		this.field4508 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "923027108"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			HttpRequestTask.method288(this.index, this.masterDisk, this);
		} else {
			this.field4517.method7630(this, class388.field4535.field4541, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "47765125"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4508 == 1) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				class254.method5217(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				class254.method5217(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				Object[] var5 = super.groups;
				Object var7;
				if (var2 == null) {
					var7 = null;
				} else if (var2.length > 136) {
					DirectByteArrayCopier var8 = new DirectByteArrayCopier();
					var8.set(var2);
					var7 = var8;
				} else {
					var7 = var2;
				}

				var5[var1] = var7;
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I[BZI)V",
		garbageValue = "1665005302"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4508 == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4517.method7630(this, class388.field4535.field4541, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4517.method7630(this, class388.field4535.field4541, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var11 = new Buffer(VertexNormal.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 != 5 && var12 != 6) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) {
				this.field4517.method7630(this, class388.field4535.field4541, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4504) {
				this.field4508 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field4509 || var4) {
					this.field4517.method7630(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field4509 || var4) {
					this.field4517.method7630(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				Object[] var7 = super.groups;
				Object var9;
				if (var3 == null) {
					var9 = null;
				} else if (var3.length > 136) {
					DirectByteArrayCopier var10 = new DirectByteArrayCopier();
					var10.set(var3);
					var9 = var10;
				} else {
					var9 = var3;
				}

				var7[var2] = var9;
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4508 = 1;
		} else {
			this.field4504 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					PacketWriter.method3121(var1, this.archiveDisk, this);
					this.field4504 = var1;
				}
			}

			if (this.field4504 == -1) {
				this.field4508 = 1;
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-828917415"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4517.method7623(this.index, var1);
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1677601037"
	)
	public boolean method7483(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2144621165"
	)
	public boolean method7484(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1712367457"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0;
		int var2 = 0;

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) {
			if (super.fileCounts[var3] > 0) {
				var1 += 100;
				var2 += this.groupLoadPercent(var3);
			}
		}

		if (var1 == 0) {
			return 100;
		} else {
			var3 = var2 * 100 / var1;
			return var3;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FB)I",
		garbageValue = "-93"
	)
	public static int method7520(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var24 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class133.field1561;
		if (var7 <= var24) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) {
				var9[var10] = 1.0F / var7 * var0[var10];
			}

			while (Math.abs(var9[var1]) < var24) {
				--var1;
			}

			var10 = 0;
			if (var1 == 0) {
				return var10;
			} else if (var1 == 1) {
				var6[0] = -var9[0] / var9[1];
				boolean var22 = var3 ? var2 < var24 + var6[0] : var2 < var6[0] - var24;
				boolean var23 = var5 ? var4 > var6[0] - var24 : var4 > var24 + var6[0];
				var10 = var22 && var23 ? 1 : 0;
				if (var10 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var10;
			} else {
				class429 var11 = new class429(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = (float)var13 * var9[var13];
				}

				float[] var21 = new float[var1 + 1];
				int var14 = method7520(var12, var1 - 1, var2, false, var4, false, var21);
				if (var14 == -1) {
					return 0;
				} else {
					boolean var15 = false;
					float var17 = 0.0F;
					float var18 = 0.0F;
					float var19 = 0.0F;

					for (int var20 = 0; var20 <= var14; ++var20) {
						if (var10 > var1) {
							return var10;
						}

						float var16;
						if (var20 == 0) {
							var16 = var2;
							var18 = class388.method7523(var9, var1, var2);
							if (Math.abs(var18) <= var24 && var3) {
								var6[var10++] = var2;
							}
						} else {
							var16 = var19;
							var18 = var17;
						}

						if (var20 == var14) {
							var19 = var4;
							var15 = false;
						} else {
							var19 = var21[var20];
						}

						var17 = class388.method7523(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var24) {
							if (var20 != var14 || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							var6[var10++] = WorldMapDecoration.method6189(var11, var16, var19, 0.0F);
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var24) {
								var6[var10 - 2] = (var6[var10 - 2] + var6[var10 - 1]) * 0.5F;
								--var10;
							}
						}
					}

					return var10;
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "72"
	)
	static final void method7519(String var0) {
		PacketBufferNode var1 = class141.getPacketBufferNode(ClientPacket.field3381, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(class536.stringCp1252NullTerminatedByteSize(var0));
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}
}
