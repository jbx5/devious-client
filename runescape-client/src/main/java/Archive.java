import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("an")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -181318597
	)
	@Export("index")
	int index;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -84195103
	)
	volatile int field4554;
	@ObfuscatedName("at")
	boolean field4547;
	@ObfuscatedName("au")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 493673657
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1414640961
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1208672547
	)
	int field4552;
	@ObfuscatedName("ab")
	boolean field4553;
	@ObfuscatedName("az")
	boolean field4542;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	JagNetThread field4555;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lsl;Lsl;Lpk;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4554 = 0;
		this.field4547 = false;
		this.field4552 = -1;
		this.field4553 = false;
		this.field4542 = false;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4547 = var7;
		this.field4553 = var8;
		this.field4542 = var9;
		this.field4555 = var3;
		this.field4555.method7708(this, this.index);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "781078990"
	)
	public boolean method7565() {
		return this.field4554 == 1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1637863264"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4554 == 1 || this.field4553 && this.field4554 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4555.method7725(class389.field4565.field4579, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1326361047"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4555.method7711(this.index, var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1703992490"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			ArchiveDisk var2 = this.archiveDisk;
			byte[] var4 = null;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
					if ((long)var1 == var6.key && var2 == var6.archiveDisk && var6.type == 0) {
						var4 = var6.data;
						break;
					}
				}
			}

			if (var4 != null) {
				this.load(var2, var1, var4, true);
			} else {
				byte[] var5 = var2.read(var1);
				this.load(var2, var1, var5, true);
			}
		} else {
			this.field4555.method7710(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method7569() {
		this.field4554 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-113045218"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			class96.method2664(this.index, this.masterDisk, this);
		} else {
			this.field4555.method7710(this, class389.field4565.field4579, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I[BZZB)V",
		garbageValue = "46"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4554 == 1) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				class241.method4920(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				class241.method4920(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = RouteStrategy.method5729(var2, false);
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lsl;I[BZB)V",
		garbageValue = "74"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4554 == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4555.method7710(this, class389.field4565.field4579, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4555.method7710(this, class389.field4565.field4579, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var9 = new Buffer(class333.decompressBytes(var3));
			int var7 = var9.readUnsignedByte();
			if (var7 != 5 && var7 != 6) {
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var7 >= 6) {
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) {
				this.field4555.method7710(this, class389.field4565.field4579, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4552) {
				this.field4554 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field4547 || var4) {
					this.field4555.method7710(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field4547 || var4) {
					this.field4555.method7710(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				super.groups[var2] = RouteStrategy.method5729(var3, false);
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "535255491"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4554 = 1;
		} else {
			this.field4552 = -1;

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

					WorldMapScaleHandler.method6437();
					this.field4552 = var1;
				}
			}

			if (this.field4552 == -1) {
				this.field4554 = 1;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "104"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4555.method7725(this.index, var1);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1894938850"
	)
	public boolean method7575(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1643321149"
	)
	public boolean method7591(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "331389624"
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

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)Lpu;",
		garbageValue = "-1779216049"
	)
	public static NodeDeque method7599() {
		return Client.scriptEvents;
	}
}
