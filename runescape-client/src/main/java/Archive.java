import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("al")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 947812539
	)
	@Export("index")
	int index;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2080933747
	)
	volatile int field4451;
	@ObfuscatedName("ad")
	boolean field4453;
	@ObfuscatedName("aq")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -668826357
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1714009569
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -219967133
	)
	int field4458;
	@ObfuscatedName("af")
	boolean field4459;
	@ObfuscatedName("aa")
	boolean field4445;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	JagNetThread field4461;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lsi;Lsi;Lor;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4451 = 0;
		this.field4453 = false;
		this.field4458 = -1;
		this.field4459 = false;
		this.field4445 = false;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4453 = var7;
		this.field4459 = var8;
		this.field4445 = var9;
		this.field4461 = var3;
		this.field4461.method7372(this, this.index);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1487094527"
	)
	public boolean method7194() {
		return this.field4451 == 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2137051551"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4451 == 1 || this.field4459 && this.field4451 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4461.method7356(class386.field4485.field4469, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1982151396"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4461.method7355(this.index, var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-100"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			ArchiveDisk var2 = this.archiveDisk;
			byte[] var4 = null;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				for (ArchiveDiskAction var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var6 != null; var6 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
					if (var6.key == (long)var1 && var2 == var6.archiveDisk && var6.type == 0) {
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
			this.field4461.method7354(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1562140181"
	)
	void method7198() {
		this.field4451 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1358943087"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			int var3 = this.index;
			ArchiveDisk var4 = this.masterDisk;
			byte[] var6 = null;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				for (ArchiveDiskAction var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last(); var8 != null; var8 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()) {
					if ((long)var3 == var8.key && var4 == var8.archiveDisk && var8.type == 0) {
						var6 = var8.data;
						break;
					}
				}
			}

			if (var6 != null) {
				this.load(var4, var3, var6, true);
			} else {
				byte[] var7 = var4.read(var3);
				this.load(var4, var3, var7, true);
			}
		} else {
			this.field4461.method7354(this, class386.field4485.field4469, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I[BZZB)V",
		garbageValue = "-9"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4451 == 1) {
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

				class172.method3626();
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				ArchiveDisk var11 = this.archiveDisk;
				ArchiveDiskAction var14 = new ArchiveDiskAction();
				var14.type = 0;
				var14.key = (long)var1;
				var14.data = var2;
				var14.archiveDisk = var11;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var14);
				}

				class172.method3626();
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = FloorUnderlayDefinition.method5014(var2, false);
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsi;I[BZB)V",
		garbageValue = "0"
	)
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4451 == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4461.method7354(this, class386.field4485.field4469, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4461.method7354(this, class386.field4485.field4469, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var9 = new Buffer(BoundaryObject.decompressBytes(var3));
			int var7 = var9.readUnsignedByte();
			if (var7 != 5 && var7 != 6) {
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var7 >= 6) {
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) {
				this.field4461.method7354(this, class386.field4485.field4469, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4458) {
				this.field4451 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field4453 || var4) {
					this.field4461.method7354(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field4453 || var4) {
					this.field4461.method7354(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				super.groups[var2] = FloorUnderlayDefinition.method5014(var3, false);
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-708460440"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4451 = 1;
		} else {
			this.field4458 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					Occluder.method4146(var1, this.archiveDisk, this);
					this.field4458 = var1;
				}
			}

			if (this.field4458 == -1) {
				this.field4451 = 1;
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-489947135"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4461.method7356(this.index, var1);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-404242143"
	)
	public boolean method7207(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "308102114"
	)
	public boolean method7201(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2032731954"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lud;ILjava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-815826543"
	)
	static String method7241(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}
}
