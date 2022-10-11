import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 218105171
	)
	static int field4054;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 707451677
	)
	@Export("groupCount")
	int groupCount;
	@ObfuscatedName("l")
	@Export("groupIds")
	int[] groupIds;
	@ObfuscatedName("e")
	@Export("groupNameHashes")
	int[] groupNameHashes;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;
	@ObfuscatedName("y")
	@Export("groupCrcs")
	int[] groupCrcs;
	@ObfuscatedName("i")
	@Export("groupVersions")
	int[] groupVersions;
	@ObfuscatedName("r")
	@Export("fileCounts")
	int[] fileCounts;
	@ObfuscatedName("z")
	@Export("fileIds")
	int[][] fileIds;
	@ObfuscatedName("o")
	@Export("fileNameHashes")
	int[][] fileNameHashes;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lqh;"
	)
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;
	@ObfuscatedName("ac")
	@Export("groups")
	Object[] groups;
	@ObfuscatedName("ao")
	@Export("files")
	Object[][] files;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2139611929
	)
	@Export("hash")
	public int hash;
	@ObfuscatedName("ai")
	@Export("releaseGroups")
	boolean releaseGroups;
	@ObfuscatedName("an")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor(); // L: 23
		field4054 = 0; // L: 27
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1; // L: 32
		this.shallowFiles = var2; // L: 33
	} // L: 34

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1916781454"
	)
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	} // L: 132

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2138889748"
	)
	@Export("loadGroup")
	void loadGroup(int var1) {
	} // L: 218

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "85"
	)
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0; // L: 188 189
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1587508085"
	)
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length; // L: 38
		int var5 = -1; // L: 42

		int var6;
		for (var6 = 0; var6 < var3; ++var6) { // L: 43
			var5 = var5 >>> 8 ^ Buffer.crc32Table[(var5 ^ var1[var6]) & 255]; // L: 44
		}

		var5 = ~var5; // L: 46
		this.hash = var5; // L: 51
		Buffer var15 = new Buffer(class138.decompressBytes(var1)); // L: 52
		var5 = var15.readUnsignedByte(); // L: 53
		if (var5 >= 5 && var5 <= 7) { // L: 54
			if (var5 >= 6) { // L: 55
				var15.readInt(); // L: 56
			}

			var6 = var15.readUnsignedByte(); // L: 59
			if (var5 >= 7) { // L: 60
				this.groupCount = var15.readLargeSmart();
			} else {
				this.groupCount = var15.readUnsignedShort(); // L: 61
			}

			int var7 = 0; // L: 62
			int var8 = -1; // L: 63
			this.groupIds = new int[this.groupCount]; // L: 64
			int var9;
			if (var5 >= 7) { // L: 65
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 66
					this.groupIds[var9] = var7 += var15.readLargeSmart(); // L: 67
					if (this.groupIds[var9] > var8) { // L: 68
						var8 = this.groupIds[var9];
					}
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 72
					this.groupIds[var9] = var7 += var15.readUnsignedShort(); // L: 73
					if (this.groupIds[var9] > var8) { // L: 74
						var8 = this.groupIds[var9];
					}
				}
			}

			this.groupCrcs = new int[var8 + 1]; // L: 77
			this.groupVersions = new int[var8 + 1]; // L: 78
			this.fileCounts = new int[var8 + 1]; // L: 79
			this.fileIds = new int[var8 + 1][]; // L: 80
			this.groups = new Object[var8 + 1]; // L: 81
			this.files = new Object[var8 + 1][]; // L: 82
			if (var6 != 0) { // L: 83
				this.groupNameHashes = new int[var8 + 1]; // L: 84

				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 85
					this.groupNameHashes[this.groupIds[var9]] = var15.readInt();
				}

				this.groupNameHashTable = new IntHashTable(this.groupNameHashes); // L: 86
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 88
				this.groupCrcs[this.groupIds[var9]] = var15.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 89
				this.groupVersions[this.groupIds[var9]] = var15.readInt();
			}

			for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 90
				this.fileCounts[this.groupIds[var9]] = var15.readUnsignedShort();
			}

			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			if (var5 >= 7) { // L: 91
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 92
					var10 = this.groupIds[var9]; // L: 93
					var11 = this.fileCounts[var10]; // L: 94
					var7 = 0; // L: 95
					var12 = -1; // L: 96
					this.fileIds[var10] = new int[var11]; // L: 97

					for (var13 = 0; var13 < var11; ++var13) { // L: 98
						var14 = this.fileIds[var10][var13] = var7 += var15.readLargeSmart(); // L: 99
						if (var14 > var12) { // L: 100
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1]; // L: 102
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 106
					var10 = this.groupIds[var9]; // L: 107
					var11 = this.fileCounts[var10]; // L: 108
					var7 = 0; // L: 109
					var12 = -1; // L: 110
					this.fileIds[var10] = new int[var11]; // L: 111

					for (var13 = 0; var13 < var11; ++var13) { // L: 112
						var14 = this.fileIds[var10][var13] = var7 += var15.readUnsignedShort(); // L: 113
						if (var14 > var12) { // L: 114
							var12 = var14;
						}
					}

					this.files[var10] = new Object[var12 + 1]; // L: 116
				}
			}

			if (var6 != 0) { // L: 119
				this.fileNameHashes = new int[var8 + 1][]; // L: 120
				this.fileNameHashTables = new IntHashTable[var8 + 1]; // L: 121

				for (var9 = 0; var9 < this.groupCount; ++var9) { // L: 122
					var10 = this.groupIds[var9]; // L: 123
					var11 = this.fileCounts[var10]; // L: 124
					this.fileNameHashes[var10] = new int[this.files[var10].length]; // L: 125

					for (var12 = 0; var12 < var11; ++var12) { // L: 126
						this.fileNameHashes[var10][this.fileIds[var10][var12]] = var15.readInt();
					}

					this.fileNameHashTables[var10] = new IntHashTable(this.fileNameHashes[var10]); // L: 127
				}
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 130

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "28"
	)
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, (int[])null); // L: 135
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II[II)[B",
		garbageValue = "195901546"
	)
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 139
			if (this.files[var1][var2] == null) { // L: 140
				boolean var4 = this.buildFiles(var1, var3); // L: 141
				if (!var4) { // L: 142
					this.loadGroup(var1); // L: 143
					var4 = this.buildFiles(var1, var3); // L: 144
					if (!var4) { // L: 145
						return null;
					}
				}
			}

			byte[] var5 = class134.method3043(this.files[var1][var2], false); // L: 148
			if (this.shallowFiles) {
				this.files[var1][var2] = null; // L: 149
			}

			return var5; // L: 150
		} else {
			return null;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "93"
	)
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 154
			if (this.files[var1][var2] != null) {
				return true; // L: 155
			} else if (this.groups[var1] != null) { // L: 156
				return true;
			} else {
				this.loadGroup(var1); // L: 157
				return this.groups[var1] != null; // L: 158
			}
		} else {
			return false; // L: 159
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-324820069"
	)
	public boolean method6011(int var1) {
		if (this.files.length == 1) { // L: 163
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0); // L: 164
		} else {
			throw new RuntimeException(); // L: 165
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "178135522"
	)
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) { // L: 169
			return true;
		} else {
			this.loadGroup(var1); // L: 170
			return this.groups[var1] != null; // L: 171
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1588028755"
	)
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true; // L: 176

		for (int var2 = 0; var2 < this.groupIds.length; ++var2) { // L: 177
			int var3 = this.groupIds[var2]; // L: 178
			if (this.groups[var3] == null) { // L: 179
				this.loadGroup(var3); // L: 180
				if (this.groups[var3] == null) { // L: 181
					var1 = false;
				}
			}
		}

		return var1; // L: 184
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "10555277"
	)
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) { // L: 193
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0); // L: 194
		} else {
			throw new RuntimeException(); // L: 195
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)[B",
		garbageValue = "0"
	)
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) { // L: 199
			if (this.files[var1][var2] == null) { // L: 200
				boolean var3 = this.buildFiles(var1, (int[])null); // L: 201
				if (!var3) { // L: 202
					this.loadGroup(var1); // L: 203
					var3 = this.buildFiles(var1, (int[])null); // L: 204
					if (!var3) { // L: 205
						return null;
					}
				}
			}

			byte[] var4 = class134.method3043(this.files[var1][var2], false); // L: 208
			return var4; // L: 209
		} else {
			return null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)[B",
		garbageValue = "77"
	)
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) { // L: 213
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0); // L: 214
		} else {
			throw new RuntimeException(); // L: 215
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "307284879"
	)
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null; // L: 221 222 224
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "795428315"
	)
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length; // L: 228
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-528073104"
	)
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length; // L: 232
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1897209374"
	)
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) { // L: 236
			this.groups[var1] = null;
		}

	} // L: 237

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "15"
	)
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 240
			this.files[var1][var2] = null;
		}

	} // L: 241

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1453397224"
	)
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) { // L: 244
			if (this.files[var1] != null) { // L: 245
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) { // L: 246
					this.files[var1][var2] = null;
				}
			}
		}

	} // L: 249

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I[II)Z",
		garbageValue = "393534892"
	)
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) { // L: 252
			return false;
		} else {
			int var3 = this.fileCounts[var1]; // L: 253
			int[] var4 = this.fileIds[var1]; // L: 254
			Object[] var5 = this.files[var1]; // L: 255
			boolean var6 = true; // L: 256

			for (int var7 = 0; var7 < var3; ++var7) { // L: 257
				if (var5[var4[var7]] == null) { // L: 258
					var6 = false; // L: 259
					break;
				}
			}

			if (var6) { // L: 263
				return true;
			} else {
				byte[] var21;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) { // L: 265
					var21 = class134.method3043(this.groups[var1], false); // L: 270
				} else {
					var21 = class134.method3043(this.groups[var1], true); // L: 266
					Buffer var8 = new Buffer(var21); // L: 267
					var8.xteaDecrypt(var2, 5, var8.array.length); // L: 268
				}

				byte[] var25 = class138.decompressBytes(var21); // L: 273
				if (this.releaseGroups) { // L: 310
					this.groups[var1] = null;
				}

				int var10;
				if (var3 > 1) { // L: 311
					int var22 = var25.length; // L: 312
					--var22; // L: 313
					var10 = var25[var22] & 255;
					var22 -= var3 * var10 * 4; // L: 314
					Buffer var11 = new Buffer(var25); // L: 315
					int[] var12 = new int[var3]; // L: 316
					var11.offset = var22; // L: 317

					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) { // L: 318
						var14 = 0; // L: 319

						for (var15 = 0; var15 < var3; ++var15) { // L: 320
							var14 += var11.readInt(); // L: 321
							var12[var15] += var14; // L: 322
						}
					}

					byte[][] var23 = new byte[var3][]; // L: 325

					for (var14 = 0; var14 < var3; ++var14) { // L: 326
						var23[var14] = new byte[var12[var14]]; // L: 327
						var12[var14] = 0; // L: 328
					}

					var11.offset = var22; // L: 330
					var14 = 0; // L: 331

					int var17;
					for (var15 = 0; var15 < var10; ++var15) { // L: 332
						int var24 = 0; // L: 333

						for (var17 = 0; var17 < var3; ++var17) { // L: 334
							var24 += var11.readInt(); // L: 335
							System.arraycopy(var25, var14, var23[var17], var12[var17], var24); // L: 336
							var12[var17] += var24; // L: 337
							var14 += var24; // L: 338
						}
					}

					for (var15 = 0; var15 < var3; ++var15) { // L: 341
						if (!this.shallowFiles) { // L: 342
							var17 = var4[var15]; // L: 344
							byte[] var19 = var23[var15]; // L: 346
							Object var18;
							if (var19 == null) { // L: 348
								var18 = null; // L: 349
							} else if (var19.length > 136) { // L: 352
								DirectByteArrayCopier var20 = new DirectByteArrayCopier(); // L: 354
								var20.set(var19); // L: 355
								var18 = var20; // L: 356
							} else {
								var18 = var19; // L: 361
							}

							var5[var17] = var18; // L: 363
						} else {
							var5[var4[var15]] = var23[var15]; // L: 365
						}
					}
				} else if (!this.shallowFiles) { // L: 369
					var10 = var4[0]; // L: 371
					Object var26;
					if (var25 == null) { // L: 374
						var26 = null; // L: 375
					} else if (var25.length > 136) { // L: 378
						DirectByteArrayCopier var27 = new DirectByteArrayCopier(); // L: 380
						var27.set(var25); // L: 381
						var26 = var27; // L: 382
					} else {
						var26 = var25; // L: 387
					}

					var5[var10] = var26; // L: 389
				} else {
					var5[var4[0]] = var25; // L: 391
				}

				return true; // L: 393
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1183242039"
	)
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase(); // L: 397
		return this.groupNameHashTable.get(WorldMapIcon_0.hashString(var1)); // L: 398
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)I",
		garbageValue = "173947793"
	)
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase(); // L: 402
		return this.fileNameHashTables[var1].get(WorldMapIcon_0.hashString(var2)); // L: 403
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;S)Z",
		garbageValue = "8152"
	)
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 407
		var2 = var2.toLowerCase(); // L: 408
		int var3 = this.groupNameHashTable.get(WorldMapIcon_0.hashString(var1)); // L: 409
		if (var3 < 0) { // L: 410
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(WorldMapIcon_0.hashString(var2)); // L: 411
			return var4 >= 0; // L: 412
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B",
		garbageValue = "-269107771"
	)
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 417
		var2 = var2.toLowerCase(); // L: 418
		int var3 = this.groupNameHashTable.get(WorldMapIcon_0.hashString(var1)); // L: 419
		int var4 = this.fileNameHashTables[var3].get(WorldMapIcon_0.hashString(var2)); // L: 420
		return this.takeFile(var3, var4); // L: 421
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z",
		garbageValue = "264812786"
	)
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase(); // L: 425
		var2 = var2.toLowerCase(); // L: 426
		int var3 = this.groupNameHashTable.get(WorldMapIcon_0.hashString(var1)); // L: 427
		int var4 = this.fileNameHashTables[var3].get(WorldMapIcon_0.hashString(var2)); // L: 428
		return this.tryLoadFile(var3, var4); // L: 429
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-300392580"
	)
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase(); // L: 433
		int var2 = this.groupNameHashTable.get(WorldMapIcon_0.hashString(var1)); // L: 434
		return this.tryLoadGroup(var2); // L: 435
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-124529880"
	)
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase(); // L: 439
		int var2 = this.groupNameHashTable.get(WorldMapIcon_0.hashString(var1)); // L: 440
		if (var2 >= 0) { // L: 441
			this.loadRegionFromGroup(var2); // L: 442
		}
	} // L: 443

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-649740490"
	)
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase(); // L: 446
		int var2 = this.groupNameHashTable.get(WorldMapIcon_0.hashString(var1)); // L: 447
		return this.groupLoadPercent(var2); // L: 448
	}
}
