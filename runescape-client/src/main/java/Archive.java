import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("lu")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("n")
	@Export("Archive_crc")
	static CRC32 Archive_crc = new CRC32();

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("masterDisk")
	ArchiveDisk masterDisk;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1917196565)
	@Export("index")
	int index;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1314569981)
	volatile int field4001 = 0;

	@ObfuscatedName("a")
	boolean field3998 = false;

	@ObfuscatedName("d")
	@Export("validGroups")
	volatile boolean[] validGroups;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 925636457)
	@Export("indexCrc")
	int indexCrc;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 2094383779)
	@Export("indexVersion")
	int indexVersion;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 372843791)
	int field4006 = -1;

	@ObfuscatedName("b")
	boolean field3994 = false;

	@ObfuscatedSignature(descriptor = "(Lng;Lng;IZZZZ)V")
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5);
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3998 = var6;
		this.field3994 = var7;
		class151.method3144(this, this.index);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1700609792")
	public boolean method5802() {
		return this.field4001 == 1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-26876338")
	@Export("percentage")
	public int percentage() {
		if (this.field4001 == 1 || this.field3994 && this.field4001 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = class263.method5194(255, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}
			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-335585852")
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		int var2 = this.index;
		long var3 = ((long) ((var2 << 16) + var1));
		NetFileRequest var5 = ((NetFileRequest) (NetCache.NetCache_pendingWrites.get(var3)));
		if (var5 != null) {
			NetCache.NetCache_pendingWritesQueue.addLast(var5);
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "586524231")
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			ArchiveDisk var2 = this.archiveDisk;
			byte[] var4 = null;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
				for (ArchiveDiskAction var6 = ((ArchiveDiskAction) (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last())); var6 != null; var6 = ((ArchiveDiskAction) (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()))) {
					if (((long) (var1)) == var6.key && var2 == var6.archiveDisk && var6.type == 0) {
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
			class181.requestNetFile(this, this.index, var1, super.groupCrcs[var1], ((byte) (2)), true);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1713679762")
	void method5816() {
		this.field4001 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1220318907")
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			UserComparator4.method2647(this.index, this.masterDisk, this);
		} else {
			class181.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I[BZZB)V", garbageValue = "1")
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4001 == 1) {
				throw new RuntimeException();
			}
			if (this.masterDisk != null) {
				WallDecoration.method4515(this.index, var2, this.masterDisk);
			}
			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = ((byte) (super.groupVersions[var1] >> 8));
			var2[var2.length - 1] = ((byte) (super.groupVersions[var1]));
			if (this.archiveDisk != null) {
				WallDecoration.method4515(var1, var2, this.archiveDisk);
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

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lng;I[BZI)V", garbageValue = "-734271793")
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4001 == 1) {
				throw new RuntimeException();
			}
			if (var3 == null) {
				class181.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}
			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = ((int) (Archive_crc.getValue()));
			if (var5 != this.indexCrc) {
				class181.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}
			Buffer var11 = new Buffer(WorldMapDecorationType.decompressBytes(var3));
			int var12 = var11.readUnsignedByte();
			if (var12 != 5 && var12 != 6) {
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}
			int var8 = 0;
			if (var12 >= 6) {
				var8 = var11.readInt();
			}
			if (var8 != this.indexVersion) {
				class181.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}
			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4006) {
				this.field4001 = 1;
			}
			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field3998 || var4) {
					class181.requestNetFile(this, this.index, var2, super.groupCrcs[var2], ((byte) (2)), var4);
				}
				return;
			}
			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = ((int) (Archive_crc.getValue()));
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field3998 || var4) {
					class181.requestNetFile(this, this.index, var2, super.groupCrcs[var2], ((byte) (2)), var4);
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1288431140")
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];
		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}
		if (this.archiveDisk == null) {
			this.field4001 = 1;
		} else {
			this.field4006 = -1;
			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					ArchiveDisk var2 = this.archiveDisk;
					ArchiveDiskAction var4 = new ArchiveDiskAction();
					var4.type = 1;
					var4.key = ((long) (var1));
					var4.archiveDisk = var2;
					var4.archive = this;
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
					}
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
						if (ArchiveDiskActionHandler.field3991 == 0) {
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setDaemon(true);
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.start();
							ArchiveDiskActionHandler.ArchiveDiskActionHandler_thread.setPriority(5);
						}
						ArchiveDiskActionHandler.field3991 = 600;
					}
					this.field4006 = var1;
				}
			}
			if (this.field4006 == -1) {
				this.field4001 = 1;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1212522629")
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : class263.method5194(this.index, var1);
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "11")
	public boolean method5812(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "44")
	public boolean method5813(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2142440427")
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;", garbageValue = "721380110")
	public static String method5850(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;
			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}
			StringBuilder var8 = new StringBuilder(var4);
			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}
			return var8.toString();
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(descriptor = "(Lku;Lge;IIZI)V", garbageValue = "816915237")
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if (var5 != null && var5[var3] != null) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}
			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}
		if (var6 != -1 && var7 != null) {
			ViewportMouse.insertMenuItem(var7, class82.colorStartTag(16748608) + var1.name, var6, 0, var2, var0.id, var1.id, var4);
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-823191393")
	static void method5847() {
		if (class302.field3596 != null) {
			Client.field773 = Client.cycle;
			class302.field3596.method6055();
			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					class302.field3596.method6058(class300.baseX * 8 + (Client.players[var0].x >> 7), Message.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}
	}
}