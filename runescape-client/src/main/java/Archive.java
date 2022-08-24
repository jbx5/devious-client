import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("ln")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("a")
	@Export("Archive_crc")
	static CRC32 Archive_crc = new CRC32();

	@ObfuscatedName("hj")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lnk;")
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lnk;")
	@Export("masterDisk")
	ArchiveDisk masterDisk;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -485058211)
	@Export("index")
	int index;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1666198691)
	volatile int field3981 = 0;

	@ObfuscatedName("n")
	boolean field3989 = false;

	@ObfuscatedName("d")
	@Export("validGroups")
	volatile boolean[] validGroups;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 2011863653)
	@Export("indexCrc")
	int indexCrc;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1947826101)
	@Export("indexVersion")
	int indexVersion;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = -1638662051)
	int field3984 = -1;

	@ObfuscatedName("z")
	boolean field3988 = false;

	@ObfuscatedSignature(descriptor = "(Lnk;Lnk;IZZZZ)V")
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5);
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3989 = var6;
		this.field3988 = var7;
		int var9 = this.index;
		if (this.field3988) {
			if (var9 <= NetCache.field4031) {
				throw new RuntimeException("");
			}
			if (var9 < NetCache.field4015) {
				NetCache.field4015 = var9;
			}
		} else {
			if (var9 >= NetCache.field4015) {
				throw new RuntimeException("");
			}
			if (var9 > NetCache.field4031) {
				NetCache.field4031 = var9;
			}
		}
		if (UserComparator3.field1385 != null) {
			UserComparator3.field1385.offset = var9 * 8 + 5;
			if (UserComparator3.field1385.offset >= UserComparator3.field1385.array.length) {
				if (!this.field3988) {
					throw new RuntimeException("");
				}
				this.method5729();
			} else {
				int var10 = UserComparator3.field1385.readInt();
				int var11 = UserComparator3.field1385.readInt();
				this.loadIndex(var10, var11);
			}
		} else {
			StudioGame.requestNetFile(((Archive) (null)), 255, 255, 0, ((byte) (0)), true);
			NetCache.NetCache_archives[var9] = this;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "104")
	public boolean method5710() {
		return this.field3981 == 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-14263237")
	@Export("percentage")
	public int percentage() {
		if (this.field3981 == 1 || this.field3988 && this.field3981 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = PlayerComposition.method5528(255, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}
			return var1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "31")
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		int var2 = this.index;
		long var3 = ((long) ((var2 << 16) + var1));
		NetFileRequest var5 = ((NetFileRequest) (NetCache.NetCache_pendingWrites.get(var3)));
		if (var5 != null) {
			NetCache.NetCache_pendingWritesQueue.addLast(var5);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-115")
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			AbstractUserComparator.method6637(var1, this.archiveDisk, this);
		} else {
			StudioGame.requestNetFile(this, this.index, var1, super.groupCrcs[var1], ((byte) (2)), true);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "93")
	void method5729() {
		this.field3981 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-341729986")
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			AbstractUserComparator.method6637(this.index, this.masterDisk, this);
		} else {
			StudioGame.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I[BZZI)V", garbageValue = "-238018615")
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3981 == 1) {
				throw new RuntimeException();
			}
			if (this.masterDisk != null) {
				int var5 = this.index;
				ArchiveDisk var6 = this.masterDisk;
				ArchiveDiskAction var7 = new ArchiveDiskAction();
				var7.type = 0;
				var7.key = ((long) (var5));
				var7.data = var2;
				var7.archiveDisk = var6;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7);
				}
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
					if (ArchiveDiskActionHandler.field3970 == 0) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
					}
					ArchiveDiskActionHandler.field3970 = 600;
				}
			}
			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = ((byte) (super.groupVersions[var1] >> 8));
			var2[var2.length - 1] = ((byte) (super.groupVersions[var1]));
			if (this.archiveDisk != null) {
				ArchiveDisk var13 = this.archiveDisk;
				ArchiveDiskAction var19 = new ArchiveDiskAction();
				var19.type = 0;
				var19.key = ((long) (var1));
				var19.data = var2;
				var19.archiveDisk = var13;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var19);
				}
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
					if (ArchiveDiskActionHandler.field3970 == 0) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
					}
					ArchiveDiskActionHandler.field3970 = 600;
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lnk;I[BZB)V", garbageValue = "51")
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3981 == 1) {
				throw new RuntimeException();
			}
			if (var3 == null) {
				StudioGame.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}
			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = ((int) (Archive_crc.getValue()));
			if (var5 != this.indexCrc) {
				StudioGame.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}
			Buffer var11 = new Buffer(class305.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 != 5 && var12 != 6) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}
			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}
			if (var8 != this.indexVersion) {
				StudioGame.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}
			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field3984) {
				this.field3981 = 1;
			}
			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field3989 || var4) {
					StudioGame.requestNetFile(this, this.index, var2, super.groupCrcs[var2], ((byte) (2)), var4);
				}
				return;
			}
			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = ((int) (Archive_crc.getValue()));
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field3989 || var4) {
					StudioGame.requestNetFile(this, this.index, var2, super.groupCrcs[var2], ((byte) (2)), var4);
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "19")
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];
		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}
		if (this.archiveDisk == null) {
			this.field3981 = 1;
		} else {
			this.field3984 = -1;
			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					class360.method6484(var1, this.archiveDisk, this);
					this.field3984 = var1;
				}
			}
			if (this.field3984 == -1) {
				this.field3981 = 1;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1701347881")
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : PlayerComposition.method5528(this.index, var1);
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-699044905")
	public boolean method5719(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "185534608")
	public boolean method5722(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-54")
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IB)Lpu;", garbageValue = "19")
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = ((DbTableType) (DbTableType.DBTableType_cache.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbTableType.field4669.takeFile(39, var0);
			var1 = new DbTableType();
			if (var2 != null) {
				var1.method7532(new Buffer(var2));
			}
			var1.method7523();
			DbTableType.DBTableType_cache.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IZB)Ljava/lang/String;", garbageValue = "-75")
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;
				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}
				char[] var6 = new char[var4];
				var6[0] = '+';
				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = ((char) (var9 + 87));
					} else {
						var6[var7] = ((char) (var9 + 48));
					}
				}
				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}
			return var2;
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1228918690")
	static void method5750() {
		Iterator var0 = Messages.Messages_hashTable.iterator();
		while (var0.hasNext()) {
			Message var1 = ((Message) (var0.next()));
			var1.clearIsFromFriend();
		} 
	}
}