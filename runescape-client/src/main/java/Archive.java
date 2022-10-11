import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("v")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 836085343
	)
	@Export("index")
	int index;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1728566243
	)
	volatile int field4029;
	@ObfuscatedName("x")
	boolean field4019;
	@ObfuscatedName("j")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 399254427
	)
	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1847698945
	)
	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 483979533
	)
	int field4032;
	@ObfuscatedName("d")
	boolean field4028;

	static {
		Archive_crc = new CRC32(); // L: 20
	}

	@ObfuscatedSignature(
		descriptor = "(Lnj;Lnj;IZZZZ)V"
	)
	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6, boolean var7) {
		super(var4, var5); // L: 27
		this.field4029 = 0; // L: 17
		this.field4019 = false; // L: 18
		this.field4032 = -1; // L: 23
		this.field4028 = false; // L: 24
		this.archiveDisk = var1; // L: 28
		this.masterDisk = var2; // L: 29
		this.index = var3; // L: 30
		this.field4019 = var6; // L: 31
		this.field4028 = var7; // L: 32
		class283.method5651(this, this.index); // L: 33
	} // L: 34

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "43"
	)
	public boolean method5963() {
		return this.field4029 == 1; // L: 37
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1838186974"
	)
	@Export("percentage")
	public int percentage() {
		if (this.field4029 == 1 || this.field4028 && this.field4029 == 2) { // L: 41
			return 100;
		} else if (super.groups != null) { // L: 42
			return 99;
		} else {
			int var1 = class16.method217(255, this.index); // L: 43
			if (var1 >= 100) {
				var1 = 99; // L: 44
			}

			return var1; // L: 45
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1916781454"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		int var2 = this.index; // L: 49
		long var3 = (long)((var2 << 16) + var1); // L: 51
		NetFileRequest var5 = (NetFileRequest)NetCache.NetCache_pendingWrites.get(var3); // L: 52
		if (var5 != null) { // L: 53
			NetCache.NetCache_pendingWritesQueue.addLast(var5); // L: 54
		}

	} // L: 56

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2138889748"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
		if (this.archiveDisk != null && this.validGroups != null && this.validGroups[var1]) { // L: 59
			class239.method5122(var1, this.archiveDisk, this);
		} else {
			PacketBufferNode.requestNetFile(this, this.index, var1, super.groupCrcs[var1], (byte)2, true);
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "147812235"
	)
	void method5983() {
		this.field4029 = 2; // L: 64
		super.groupIds = new int[0];
		super.groupCrcs = new int[0];
		super.groupVersions = new int[0];
		super.fileCounts = new int[0]; // L: 68
		super.fileIds = new int[0][];
		super.groups = new Object[0];
		super.files = new Object[0][];
	} // L: 72

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-16777217"
	)
	@Export("loadIndex")
	void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2; // L: 76
		if (this.masterDisk != null) {
			class239.method5122(this.index, this.masterDisk, this);
		} else {
			PacketBufferNode.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true);
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I[BZZI)V",
		garbageValue = "352767648"
	)
	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) { // L: 82
			if (this.field4029 == 1) { // L: 83
				throw new RuntimeException(); // L: 84
			}

			if (this.masterDisk != null) { // L: 86
				Login.method2041(this.index, var2, this.masterDisk);
			}

			this.decodeIndex(var2); // L: 87
			this.loadAllLocal(); // L: 88
		} else {
			var2[var2.length - 2] = (byte)(super.groupVersions[var1] >> 8); // L: 91
			var2[var2.length - 1] = (byte)super.groupVersions[var1]; // L: 92
			if (this.archiveDisk != null) { // L: 93
				Login.method2041(var1, var2, this.archiveDisk); // L: 94
				this.validGroups[var1] = true; // L: 95
			}

			if (var4) { // L: 97
				Object[] var5 = super.groups; // L: 98
				Object var7;
				if (var2 == null) { // L: 102
					var7 = null; // L: 103
				} else if (var2.length > 136) { // L: 106
					DirectByteArrayCopier var8 = new DirectByteArrayCopier(); // L: 108
					var8.set(var2); // L: 109
					var7 = var8; // L: 110
				} else {
					var7 = var2; // L: 115
				}

				var5[var1] = var7; // L: 117
			}
		}

	} // L: 120

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lnj;I[BZI)V",
		garbageValue = "-1008299525"
	)
	@Export("load")
	void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) { // L: 123
			if (this.field4029 == 1) { // L: 124
				throw new RuntimeException(); // L: 125
			}

			if (var3 == null) { // L: 127
				PacketBufferNode.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 128
				return; // L: 129
			}

			Archive_crc.reset(); // L: 131
			Archive_crc.update(var3, 0, var3.length); // L: 132
			var5 = (int)Archive_crc.getValue(); // L: 133
			if (var5 != this.indexCrc) { // L: 134
				PacketBufferNode.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 135
				return; // L: 136
			}

			Buffer var11 = new Buffer(class138.decompressBytes(var3)); // L: 138
			int var12 = var11.readUnsignedByte(); // L: 139
			if (var12 != 5 && var12 != 6) { // L: 140
				throw new RuntimeException(var12 + "," + this.index + "," + var2);
			}

			int var8 = 0; // L: 141
			if (var12 >= 6) { // L: 142
				var8 = var11.readInt();
			}

			if (var8 != this.indexVersion) { // L: 143
				PacketBufferNode.requestNetFile(this, 255, this.index, this.indexCrc, (byte)0, true); // L: 144
				return; // L: 145
			}

			this.decodeIndex(var3); // L: 147
			this.loadAllLocal(); // L: 148
		} else {
			if (!var4 && var2 == this.field4032) { // L: 151
				this.field4029 = 1; // L: 152
			}

			if (var3 == null || var3.length <= 2) { // L: 154
				this.validGroups[var2] = false; // L: 155
				if (this.field4019 || var4) { // L: 156
					PacketBufferNode.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 157
			}

			Archive_crc.reset(); // L: 159
			Archive_crc.update(var3, 0, var3.length - 2); // L: 160
			var5 = (int)Archive_crc.getValue(); // L: 161
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255); // L: 162
			if (var5 != super.groupCrcs[var2] || var6 != super.groupVersions[var2]) { // L: 163
				this.validGroups[var2] = false; // L: 164
				if (this.field4019 || var4) { // L: 165
					PacketBufferNode.requestNetFile(this, this.index, var2, super.groupCrcs[var2], (byte)2, var4);
				}

				return; // L: 166
			}

			this.validGroups[var2] = true; // L: 168
			if (var4) { // L: 169
				Object[] var7 = super.groups; // L: 170
				Object var9;
				if (var3 == null) { // L: 174
					var9 = null; // L: 175
				} else if (var3.length > 136) { // L: 178
					DirectByteArrayCopier var10 = new DirectByteArrayCopier(); // L: 180
					var10.set(var3); // L: 181
					var9 = var10; // L: 182
				} else {
					var9 = var3; // L: 187
				}

				var7[var2] = var9; // L: 189
			}
		}

	} // L: 192

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1414631234"
	)
	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length]; // L: 195

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 196
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) { // L: 197
			this.field4029 = 1; // L: 198
		} else {
			this.field4032 = -1; // L: 201

			for (var1 = 0; var1 < this.validGroups.length; ++var1) { // L: 202
				if (super.fileCounts[var1] > 0) { // L: 203
					UserComparator7.method2750(var1, this.archiveDisk, this); // L: 204
					this.field4032 = var1; // L: 205
				}
			}

			if (this.field4032 == -1) { // L: 208
				this.field4029 = 1;
			}

		}
	} // L: 199 209

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "85"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) { // L: 212
			return 100;
		} else {
			return this.validGroups[var1] ? 100 : class16.method217(this.index, var1); // L: 213 214
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1724246866"
	)
	public boolean method5972(int var1) {
		return this.validGroups[var1]; // L: 218
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1134185998"
	)
	public boolean method5973(int var1) {
		return this.getGroupFileIds(var1) != null; // L: 222
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1617840787"
	)
	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0; // L: 226
		int var2 = 0; // L: 227

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) { // L: 228
			if (super.fileCounts[var3] > 0) { // L: 229
				var1 += 100; // L: 230
				var2 += this.groupLoadPercent(var3); // L: 231
			}
		}

		if (var1 == 0) { // L: 234
			return 100;
		} else {
			var3 = var2 * 100 / var1; // L: 235
			return var3; // L: 236
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1009650617"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 60
		if (var0 < 0 || var0 >= 65536) { // L: 61
			var0 >>>= 16; // L: 62
			var1 += 16; // L: 63
		}

		if (var0 >= 256) { // L: 65
			var0 >>>= 8; // L: 66
			var1 += 8; // L: 67
		}

		if (var0 >= 16) { // L: 69
			var0 >>>= 4; // L: 70
			var1 += 4; // L: 71
		}

		if (var0 >= 4) { // L: 73
			var0 >>>= 2; // L: 74
			var1 += 2; // L: 75
		}

		if (var0 >= 1) { // L: 77
			var0 >>>= 1; // L: 78
			++var1; // L: 79
		}

		return var0 + var1; // L: 81
	}
}
