import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("lc")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("t")
	@Export("Archive_crc")
	static CRC32 Archive_crc;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lnd;")
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lnd;")
	@Export("masterDisk")
	ArchiveDisk masterDisk;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1616385301)
	@Export("index")
	int index;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 1061047975)
	volatile int field3981;

	@ObfuscatedName("i")
	boolean field3979;

	@ObfuscatedName("s")
	@Export("validGroups")
	volatile boolean[] validGroups;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 2100182859)
	@Export("indexCrc")
	int indexCrc;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -121372543)
	@Export("indexVersion")
	int indexVersion;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 735655197)
	int field3989;

	@ObfuscatedName("k")
	boolean field3990;

	static {
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(descriptor = "(Lnd;Lnd;IZZZZ)V")
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5);
		this.field3981 = 0;
		this.field3979 = false;
		this.field3989 = -1;
		this.field3990 = false;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3979 = var6;
		this.field3990 = var7;
		class93.method2403(this, this.index);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1214739037")
	public boolean method5795() {
		return this.field3981 == 1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1116863257")
	@Export("percentage")
	public int percentage() {
		if (this.field3981 != 1 && (!this.field3990 || this.field3981 != 2)) {
			if (super.groups != null) {
				return 99;
			} else {
				int var2 = this.index;
				long var3 = ((long) (var2 + 16711680));
				int var1;
				if (Buddy.NetCache_currentResponse != null && Buddy.NetCache_currentResponse.key == var3) {
					var1 = ObjectSound.NetCache_responseArchiveBuffer.offset * 99 / (ObjectSound.NetCache_responseArchiveBuffer.array.length - Buddy.NetCache_currentResponse.padding) + 1;
				} else {
					var1 = 0;
				}
				int var5 = var1;
				if (var1 >= 100) {
					var5 = 99;
				}
				return var5;
			}
		} else {
			return 100;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "20")
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		FloorOverlayDefinition.method3808(this.index, var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "22")
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) {
			ClientPacket.method5191(var1, this.archiveDisk, this);
		} else {
			ClanChannel.requestNetFile(this, this.index, var1, super.groupCrcs[var1], ((byte) (2)), true);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-927514602")
	void method5822() {
		this.field3981 = 2;
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0];
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "28")
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			ClientPacket.method5191(this.index, this.masterDisk, this);
		} else {
			ClanChannel.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I[BZZI)V", garbageValue = "757512896")
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3981 == 1) {
				throw new RuntimeException();
			}
			if (this.masterDisk != null) {
				class432.method7576(this.index, var2, this.masterDisk);
			}
			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = ((byte) (super.groupVersions[var1] >> 8));
			var2[var2.length - 1] = ((byte) (super.groupVersions[var1]));
			if (this.archiveDisk != null) {
				class432.method7576(var1, var2, this.archiveDisk);
				this.validGroups[var1] = true;
			}
			if (var4) {
				super.groups[var1] = WorldMapArea.method4621(var2, false);
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lnd;I[BZI)V", garbageValue = "667811563")
	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3981 == 1) {
				throw new RuntimeException();
			}
			if (var3 == null) {
				ClanChannel.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}
			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = ((int) (Archive_crc.getValue()));
			if (var5 != this.indexCrc) {
				ClanChannel.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}
			Buffer var9 = new Buffer(SoundSystem.decompressBytes(var3));
			int var7 = var9.readUnsignedByte();
			if (var7 != 5 && var7 != 6) {
				throw new RuntimeException(var7 + "," + this.index + "," + var2);
			}
			int var8 = 0;
			if (var7 >= 6) {
				var8 = var9.readInt();
			}
			if (var8 != this.indexVersion) {
				ClanChannel.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}
			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if (!var4 && var2 == this.field3989) {
				this.field3981 = 1;
			}
			if (var3 == null || var3.length <= 2) {
				this.validGroups[var2] = false;
				if (this.field3979 || var4) {
					ClanChannel.requestNetFile(this, this.index, var2, super.groupCrcs[var2], ((byte) (2)), var4);
				}
				return;
			}
			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = ((int) (Archive_crc.getValue()));
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) {
				this.validGroups[var2] = false;
				if (this.field3979 || var4) {
					ClanChannel.requestNetFile(this, this.index, var2, super.groupCrcs[var2], ((byte) (2)), var4);
				}
				return;
			}
			this.validGroups[var2] = true;
			if (var4) {
				super.groups[var2] = WorldMapArea.method4621(var3, false);
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1883328836")
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
			this.field3989 = -1;
			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					class305.method5764(var1, this.archiveDisk, this);
					this.field3989 = var1;
				}
			}
			if (this.field3989 == -1) {
				this.field3981 = 1;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-227114003")
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else if (this.validGroups[var1]) {
			return 100;
		} else {
			int var3 = this.index;
			long var4 = ((long) ((var3 << 16) + var1));
			int var2;
			if (Buddy.NetCache_currentResponse != null && Buddy.NetCache_currentResponse.key == var4) {
				var2 = ObjectSound.NetCache_responseArchiveBuffer.offset * 99 / (ObjectSound.NetCache_responseArchiveBuffer.array.length - Buddy.NetCache_currentResponse.padding) + 1;
			} else {
				var2 = 0;
			}
			return var2;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "1110096171")
	public boolean method5805(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "2097935878")
	public boolean method5806(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1832230483")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "47")
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(descriptor = "([Lkb;II)V", garbageValue = "1365503093")
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !Frames.isComponentHidden(var3))) {
				int var5;
				if (var3.type == 0) {
					if (!var3.isIf3 && Frames.isComponentHidden(var3) && var3 != Language.mousedOverWidgetIf1) {
						continue;
					}
					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}
					InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var3.id)))));
					if (var4 != null) {
						var5 = var4.group;
						if (WorldMapSection2.loadInterface(var5)) {
							drawModelComponents(SoundCache.Widget_interfaceComponents[var5], -1);
						}
					}
				}
				if (var3.type == 6) {
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var7 = ObjectSound.runCs1(var3);
						if (var7) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}
						if (var5 != -1) {
							SequenceDefinition var6 = ScriptFrame.SequenceDefinition_get(var5);
							for (var3.modelFrameCycle += Client.field555; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; ChatChannel.invalidateWidget(var3)) {
								var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
								++var3.modelFrame;
								if (var3.modelFrame >= var6.frameIds.length) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame = 0;
									}
								}
							}
						}
					}
					if (var3.field3373 != 0 && !var3.isIf3) {
						int var8 = var3.field3373 >> 16;
						var5 = var3.field3373 << 16 >> 16;
						var8 *= Client.field555;
						var5 *= Client.field555;
						var3.modelAngleX = var8 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						ChatChannel.invalidateWidget(var3);
					}
				}
			}
		}
	}
}