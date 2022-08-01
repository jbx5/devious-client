import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("lc")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "Lqu;")
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor = new GZipDecompressor();

	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = -766441787)
	static int field4016 = 0;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 1108975405)
	@Export("groupCount")
	int groupCount;

	@ObfuscatedName("k")
	@Export("groupIds")
	int[] groupIds;

	@ObfuscatedName("v")
	@Export("groupNameHashes")
	int[] groupNameHashes;

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Lqa;")
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;

	@ObfuscatedName("e")
	@Export("groupCrcs")
	int[] groupCrcs;

	@ObfuscatedName("s")
	@Export("groupVersions")
	int[] groupVersions;

	@ObfuscatedName("i")
	@Export("fileCounts")
	int[] fileCounts;

	@ObfuscatedName("r")
	@Export("fileIds")
	int[][] fileIds;

	@ObfuscatedName("m")
	@Export("fileNameHashes")
	int[][] fileNameHashes;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "[Lqa;")
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;

	@ObfuscatedName("ar")
	@Export("groups")
	Object[] groups;

	@ObfuscatedName("aj")
	@Export("files")
	Object[][] files;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = 1499874975)
	@Export("hash")
	public int hash;

	@ObfuscatedName("as")
	@Export("releaseGroups")
	boolean releaseGroups;

	@ObfuscatedName("ab")
	@Export("shallowFiles")
	boolean shallowFiles;

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-335585852")
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "586524231")
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1212522629")
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "([BI)V", garbageValue = "740141823")
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length;
		int var5 = -1;
		int var6;
		for (var6 = 0; var6 < var3; ++var6) {
			var5 = var5 >>> 8 ^ Buffer.crc32Table[(var5 ^ var1[var6]) & 255];
		}
		var5 = ~var5;
		this.hash = var5;
		Buffer var15 = new Buffer(WorldMapDecorationType.decompressBytes(var1));
		var5 = var15.readUnsignedByte();
		if (var5 >= 5 && var5 <= 7) {
			if (var5 >= 6) {
				var15.readInt();
			}
			var6 = var15.readUnsignedByte();
			if (var5 >= 7) {
				this.groupCount = var15.readLargeSmart();
			} else {
				this.groupCount = var15.readUnsignedShort();
			}
			int var7 = 0;
			int var8 = -1;
			this.groupIds = new int[this.groupCount];
			int var9;
			if (var5 >= 7) {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					this.groupIds[var9] = var7 += var15.readLargeSmart();
					if (this.groupIds[var9] > var8) {
						var8 = this.groupIds[var9];
					}
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					this.groupIds[var9] = var7 += var15.readUnsignedShort();
					if (this.groupIds[var9] > var8) {
						var8 = this.groupIds[var9];
					}
				}
			}
			this.groupCrcs = new int[var8 + 1];
			this.groupVersions = new int[var8 + 1];
			this.fileCounts = new int[var8 + 1];
			this.fileIds = new int[var8 + 1][];
			this.groups = new Object[var8 + 1];
			this.files = new Object[var8 + 1][];
			if (var6 != 0) {
				this.groupNameHashes = new int[var8 + 1];
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					this.groupNameHashes[this.groupIds[var9]] = var15.readInt();
				}
				this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
			}
			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.groupCrcs[this.groupIds[var9]] = var15.readInt();
			}
			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.groupVersions[this.groupIds[var9]] = var15.readInt();
			}
			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.fileCounts[this.groupIds[var9]] = var15.readUnsignedShort();
			}
			int var10;
			int var11;
			int var12;
			int var13;
			int var14;
			if (var5 >= 7) {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					var10 = this.groupIds[var9];
					var11 = this.fileCounts[var10];
					var7 = 0;
					var12 = -1;
					this.fileIds[var10] = new int[var11];
					for (var13 = 0; var13 < var11; ++var13) {
						var14 = this.fileIds[var10][var13] = var7 += var15.readLargeSmart();
						if (var14 > var12) {
							var12 = var14;
						}
					}
					this.files[var10] = new Object[var12 + 1];
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					var10 = this.groupIds[var9];
					var11 = this.fileCounts[var10];
					var7 = 0;
					var12 = -1;
					this.fileIds[var10] = new int[var11];
					for (var13 = 0; var13 < var11; ++var13) {
						var14 = this.fileIds[var10][var13] = var7 += var15.readUnsignedShort();
						if (var14 > var12) {
							var12 = var14;
						}
					}
					this.files[var10] = new Object[var12 + 1];
				}
			}
			if (var6 != 0) {
				this.fileNameHashes = new int[var8 + 1][];
				this.fileNameHashTables = new IntHashTable[var8 + 1];
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					var10 = this.groupIds[var9];
					var11 = this.fileCounts[var10];
					this.fileNameHashes[var10] = new int[this.files[var10].length];
					for (var12 = 0; var12 < var11; ++var12) {
						this.fileNameHashes[var10][this.fileIds[var10][var12]] = var15.readInt();
					}
					this.fileNameHashTables[var10] = new IntHashTable(this.fileNameHashes[var10]);
				}
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(IIB)[B", garbageValue = "-4")
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, ((int[]) (null)));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(II[II)[B", garbageValue = "-304157516")
	@Export("takeFileEncrypted")
	public byte[] takeFileEncrypted(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] == null) {
				boolean var4 = this.buildFiles(var1, var3);
				if (!var4) {
					this.loadGroup(var1);
					var4 = this.buildFiles(var1, var3);
					if (!var4) {
						return null;
					}
				}
			}
			byte[] var5 = class20.method291(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}
			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-653603810")
	@Export("tryLoadFile")
	public boolean tryLoadFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] != null) {
				return true;
			} else if (this.groups[var1] != null) {
				return true;
			} else {
				this.loadGroup(var1);
				return this.groups[var1] != null;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-70")
	public boolean method5927(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "1989359863")
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) {
			return true;
		} else {
			this.loadGroup(var1);
			return this.groups[var1] != null;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-86")
	@Export("isFullyLoaded")
	public boolean isFullyLoaded() {
		boolean var1 = true;
		for (int var2 = 0; var2 < this.groupIds.length; ++var2) {
			int var3 = this.groupIds[var2];
			if (this.groups[var3] == null) {
				this.loadGroup(var3);
				if (this.groups[var3] == null) {
					var1 = false;
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "(IB)[B", garbageValue = "-1")
	@Export("takeFileFlat")
	public byte[] takeFileFlat(int var1) {
		if (this.files.length == 1) {
			return this.takeFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.takeFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "(IIB)[B", garbageValue = "95")
	@Export("getFile")
	public byte[] getFile(int var1, int var2) {
		if (var1 >= 0 && var1 < this.files.length && this.files[var1] != null && var2 >= 0 && var2 < this.files[var1].length) {
			if (this.files[var1][var2] == null) {
				boolean var3 = this.buildFiles(var1, ((int[]) (null)));
				if (!var3) {
					this.loadGroup(var1);
					var3 = this.buildFiles(var1, ((int[]) (null)));
					if (!var3) {
						return null;
					}
				}
			}
			byte[] var4 = class20.method291(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "(IB)[B", garbageValue = "1")
	@Export("getFileFlat")
	public byte[] getFileFlat(int var1) {
		if (this.files.length == 1) {
			return this.getFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.getFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "(II)[I", garbageValue = "1125413052")
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "113911321")
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "66")
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1783649041")
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "(IS)V", garbageValue = "12667")
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "66")
	@Export("clearFiles")
	public void clearFiles() {
		for (int var1 = 0; var1 < this.files.length; ++var1) {
			if (this.files[var1] != null) {
				for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
					this.files[var1][var2] = null;
				}
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(descriptor = "(I[IB)Z", garbageValue = "43")
	@Export("buildFiles")
	boolean buildFiles(int var1, int[] var2) {
		if (this.groups[var1] == null) {
			return false;
		} else {
			int var3 = this.fileCounts[var1];
			int[] var4 = this.fileIds[var1];
			Object[] var5 = this.files[var1];
			boolean var6 = true;
			for (int var7 = 0; var7 < var3; ++var7) {
				if (var5[var4[var7]] == null) {
					var6 = false;
					break;
				}
			}
			if (var6) {
				return true;
			} else {
				byte[] var21;
				if (var2 != null && (var2[0] != 0 || var2[1] != 0 || var2[2] != 0 || var2[3] != 0)) {
					var21 = class20.method291(this.groups[var1], true);
					Buffer var8 = new Buffer(var21);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				} else {
					var21 = class20.method291(this.groups[var1], false);
				}
				byte[] var25 = WorldMapDecorationType.decompressBytes(var21);
				if (this.releaseGroups) {
					this.groups[var1] = null;
				}
				int var10;
				if (var3 > 1) {
					int var22 = var25.length;
					--var22;
					var10 = var25[var22] & 255;
					var22 -= var10 * var3 * 4;
					Buffer var11 = new Buffer(var25);
					int[] var12 = new int[var3];
					var11.offset = var22;
					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) {
						var14 = 0;
						for (var15 = 0; var15 < var3; ++var15) {
							var14 += var11.readInt();
							var12[var15] += var14;
						}
					}
					byte[][] var23 = new byte[var3][];
					for (var14 = 0; var14 < var3; ++var14) {
						var23[var14] = new byte[var12[var14]];
						var12[var14] = 0;
					}
					var11.offset = var22;
					var14 = 0;
					int var17;
					for (var15 = 0; var15 < var10; ++var15) {
						int var24 = 0;
						for (var17 = 0; var17 < var3; ++var17) {
							var24 += var11.readInt();
							System.arraycopy(var25, var14, var23[var17], var12[var17], var24);
							var12[var17] += var24;
							var14 += var24;
						}
					}
					for (var15 = 0; var15 < var3; ++var15) {
						if (!this.shallowFiles) {
							var17 = var4[var15];
							byte[] var19 = var23[var15];
							Object var18;
							if (var19 == null) {
								var18 = null;
							} else if (var19.length > 136) {
								DirectByteArrayCopier var20 = new DirectByteArrayCopier();
								var20.set(var19);
								var18 = var20;
							} else {
								var18 = var19;
							}
							var5[var17] = var18;
						} else {
							var5[var4[var15]] = var23[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var10 = var4[0];
					Object var26;
					if (var25 == null) {
						var26 = null;
					} else if (var25.length > 136) {
						DirectByteArrayCopier var27 = new DirectByteArrayCopier();
						var27.set(var25);
						var26 = var27;
					} else {
						var26 = var25;
					}
					var5[var10] = var26;
				} else {
					var5[var4[0]] = var25;
				}
				return true;
			}
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "1752133542")
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1));
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)I", garbageValue = "59")
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(ArchiveDiskActionHandler.hashString(var2));
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", garbageValue = "251984031")
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(ArchiveDiskActionHandler.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B", garbageValue = "1285225709")
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(ArchiveDiskActionHandler.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", garbageValue = "849258773")
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(ArchiveDiskActionHandler.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z", garbageValue = "-115701314")
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-2048850474")
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "-340005039")
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(ArchiveDiskActionHandler.hashString(var1));
		return this.groupLoadPercent(var2);
	}
}