import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("av")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1444760097
	)
	@Export("index")
	int index;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -72427953
	)
	volatile int field4460;
	@ObfuscatedName("ao")
	boolean field4461;
	@ObfuscatedName("ah")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -102184105
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 586636185
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1082476167
	)
	int field4457;
	@ObfuscatedName("ax")
	boolean field4462;
	@ObfuscatedName("ay")
	boolean field4468;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	JagNetThread field4469;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lsf;Lsf;Loj;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4460 = 0;
		this.field4461 = false;
		this.field4457 = -1;
		this.field4462 = false;
		this.field4468 = false;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4461 = var7;
		this.field4462 = var8;
		this.field4468 = var9;
		this.field4469 = var3;
		this.field4469.method7324(this, this.index);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "24"
	)
	public boolean method7177() {
		return this.field4460 == 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1900560981"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4460 == 1 || this.field4462 && this.field4460 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4469.method7328(class384.field4473.field4493, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "29"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4469.method7334(this.index, var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2024456757"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			Calendar.method7101(var1, this.archiveDisk, this);
		} else {
			this.field4469.method7326(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1614246159"
	)
	void method7181() {
		this.field4460 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "4"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			Calendar.method7101(this.index, this.masterDisk, this);
		} else {
			this.field4469.method7326(this, class384.field4473.field4493, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-1891496772"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4460 == 1) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				int var5 = this.index;
				ArchiveDisk var6 = this.masterDisk;
				ArchiveDiskAction var7 = new ArchiveDiskAction();
				var7.type = 0;
				var7.key = (long)var5;
				var7.data = var2;
				var7.archiveDisk = var6;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7);
				}

				synchronized(ArchiveDiskActionHandler.field4447) {
					if (ArchiveDiskActionHandler.field4445 == 0) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
					}

					ArchiveDiskActionHandler.field4445 = 600;
					ArchiveDiskActionHandler.field4448 = false;
				}
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				ArchiveDisk var13 = this.archiveDisk;
				ArchiveDiskAction var19 = new ArchiveDiskAction();
				var19.type = 0;
				var19.key = (long)var1;
				var19.data = var2;
				var19.archiveDisk = var13;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var19);
				}

				synchronized(ArchiveDiskActionHandler.field4447) {
					if (ArchiveDiskActionHandler.field4445 == 0) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
					}

					ArchiveDiskActionHandler.field4445 = 600;
					ArchiveDiskActionHandler.field4448 = false;
				}

				this.validGroups[var1] = true;
			}

			if (var4) {
				Object[] var21 = super.groups;
				Object var20;
				if (var2 == null) {
					var20 = null;
				} else if (var2.length > 136) {
					DirectByteArrayCopier var8 = new DirectByteArrayCopier();
					var8.set(var2);
					var20 = var8;
				} else {
					var20 = var2;
				}

				var21[var1] = var20;
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsf;I[BZB)V",
		garbageValue = "0"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4460 == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4469.method7326(this, class384.field4473.field4493, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4469.method7326(this, class384.field4473.field4493, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var11 = new Buffer(JagexCache.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 != 5 && var12 != 6) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) {
				this.field4469.method7326(this, class384.field4473.field4493, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4457) {
				this.field4460 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field4461 || var4) {
					this.field4469.method7326(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field4461 || var4) {
					this.field4469.method7326(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "357485046"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4460 = 1;
		} else {
			this.field4457 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					ArchiveDisk var2 = this.archiveDisk;
					ArchiveDiskAction var4 = new ArchiveDiskAction();
					var4.type = 1;
					var4.key = (long)var1;
					var4.archiveDisk = var2;
					var4.archive = this;
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
					}

					synchronized(ArchiveDiskActionHandler.field4447) {
						if (ArchiveDiskActionHandler.field4445 == 0) {
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
						}

						ArchiveDiskActionHandler.field4445 = 600;
						ArchiveDiskActionHandler.field4448 = false;
					}

					this.field4457 = var1;
				}
			}

			if (this.field4457 == -1) {
				this.field4460 = 1;
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4469.method7328(this.index, var1);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1471560038"
	)
	public boolean method7187(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1535880310"
	)
	public boolean method7176(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1920969216"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;B)V",
		garbageValue = "-116"
	)
	public static void method7224(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0;
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(B)Lis;",
		garbageValue = "16"
	)
	static IndexCheck method7223() {
		return Client.indexCheck;
	}
}
