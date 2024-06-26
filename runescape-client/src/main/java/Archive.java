import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("au")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("ch")
	static String field4493;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsq;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2143589993
	)
	@Export("index")
	int index;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1659451215
	)
	volatile int field4483;
	@ObfuscatedName("ai")
	boolean field4484;
	@ObfuscatedName("ae")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 979037821
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1545053861
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1527771595
	)
	int field4489;
	@ObfuscatedName("ac")
	boolean field4490;
	@ObfuscatedName("al")
	boolean field4488;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	JagNetThread field4492;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(
		descriptor = "(Lsq;Lsq;Loe;IZZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, JagNetThread var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
		super(var5, var6);
		this.field4483 = 0;
		this.field4484 = false;
		this.field4489 = -1;
		this.field4490 = false;
		this.field4488 = false;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var4;
		this.field4484 = var7;
		this.field4490 = var8;
		this.field4488 = var9;
		this.field4492 = var3;
		this.field4492.method7273(this, this.index);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1673749871"
	)
	public boolean method7128() {
		return this.field4483 == 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1800800765"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4483 == 1 || this.field4490 && this.field4483 == 2) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var1 = this.field4492.method7285(class385.field4513.field4518, this.index);
			if (var1 >= 100) {
				var1 = 99;
			}

			return var1;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "4"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		this.field4492.method7279(this.index, var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1323657806"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			class343.method6442(var1, this.archiveDisk, this);
		} else {
			this.field4492.method7275(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "749652693"
	)
	void method7132() {
		this.field4483 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-127643900"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			class343.method6442(this.index, this.masterDisk, this);
		} else {
			this.field4492.method7275(this, class385.field4513.field4518, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "-1903422880"
	)
	@Export("write")
	void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field4483 == 1) {
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

				synchronized(ArchiveDiskActionHandler.field4472) {
					if (ArchiveDiskActionHandler.field4468 == 0) {
						class261.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
						class261.ArchiveDiskActionHandler_thread.setDaemon(true);
						class261.ArchiveDiskActionHandler_thread.start();
						class261.ArchiveDiskActionHandler_thread.setPriority(5);
					}

					ArchiveDiskActionHandler.field4468 = 600;
					ArchiveDiskActionHandler.field4470 = false;
				}
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8);
			var2[var2.length - 1] = (byte)super.groupVersions[var1];
			if (this.archiveDisk != null) {
				ArchiveDisk var13 = this.archiveDisk;
				ArchiveDiskAction var18 = new ArchiveDiskAction();
				var18.type = 0;
				var18.key = (long)var1;
				var18.data = var2;
				var18.archiveDisk = var13;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var18);
				}

				synchronized(ArchiveDiskActionHandler.field4472) {
					if (ArchiveDiskActionHandler.field4468 == 0) {
						class261.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler());
						class261.ArchiveDiskActionHandler_thread.setDaemon(true);
						class261.ArchiveDiskActionHandler_thread.start();
						class261.ArchiveDiskActionHandler_thread.setPriority(5);
					}

					ArchiveDiskActionHandler.field4468 = 600;
					ArchiveDiskActionHandler.field4470 = false;
				}

				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = class324.method6114(var2, false);
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lsq;I[BZS)V",
		garbageValue = "27798"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field4483 == 1) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				this.field4492.method7275(this, class385.field4513.field4518, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = (int)Archive_crc.getValue();
			if (var5 != this.indexCrc) {
				this.field4492.method7275(this, class385.field4513.field4518, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			Buffer var9 = new Buffer(class226.decompressBytes(var3));
			int var7 = var9.readUnsignedByte();
			if (var7 != 5 && var7 != 6) {
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}

			int var8 = 0;
			if (var7 >= 6) {
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) {
				this.field4492.method7275(this, class385.field4513.field4518, this.index, this.indexCrc, (byte)0, true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field4489) {
				this.field4483 = 1;
			}

			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field4484 || var4) {
					this.field4492.method7275(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = (int)Archive_crc.getValue();
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field4484 || var4) {
					this.field4492.method7275(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				super.groups[var2] = class324.method6114(var3, false);
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field4483 = 1;
		} else {
			this.field4489 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					WorldMapData_1.method4885(var1, this.archiveDisk, this);
					this.field4489 = var1;
				}
			}

			if (this.field4489 == -1) {
				this.field4483 = 1;
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-591085154"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : this.field4492.method7285(this.index, var1);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1252560989"
	)
	public boolean method7138(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1177366355"
	)
	public boolean method7148(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1169612876"
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

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(IIIILvg;Lnw;I)V",
		garbageValue = "348135043"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method10078(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
