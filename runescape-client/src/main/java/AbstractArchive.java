import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("lh")
@Implements("AbstractArchive")
public abstract class AbstractArchive {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "Lqj;")
	@Export("gzipDecompressor")
	static GZipDecompressor gzipDecompressor;

	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = 1922333433)
	static int field4012;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 1192407369)
	@Export("groupCount")
	int groupCount;

	@ObfuscatedName("l")
	@Export("groupIds")
	int[] groupIds;

	@ObfuscatedName("a")
	@Export("groupNameHashes")
	int[] groupNameHashes;

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lqz;")
	@Export("groupNameHashTable")
	IntHashTable groupNameHashTable;

	@ObfuscatedName("b")
	@Export("groupCrcs")
	int[] groupCrcs;

	@ObfuscatedName("n")
	@Export("groupVersions")
	int[] groupVersions;

	@ObfuscatedName("o")
	@Export("fileCounts")
	int[] fileCounts;

	@ObfuscatedName("m")
	@Export("fileIds")
	int[][] fileIds;

	@ObfuscatedName("d")
	@Export("fileNameHashes")
	int[][] fileNameHashes;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "[Lqz;")
	@Export("fileNameHashTables")
	IntHashTable[] fileNameHashTables;

	@ObfuscatedName("ak")
	@Export("groups")
	Object[] groups;

	@ObfuscatedName("al")
	@Export("files")
	Object[][] files;

	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 944556193)
	@Export("hash")
	public int hash;

	@ObfuscatedName("ap")
	@Export("releaseGroups")
	boolean releaseGroups;

	@ObfuscatedName("ac")
	@Export("shallowFiles")
	boolean shallowFiles;

	static {
		gzipDecompressor = new GZipDecompressor();
		field4012 = 0;
	}

	AbstractArchive(boolean var1, boolean var2) {
		this.releaseGroups = var1;
		this.shallowFiles = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "20")
	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "22")
	@Export("loadGroup")
	void loadGroup(int var1) {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-227114003")
	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		return this.groups[var1] != null ? 100 : 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "([BB)V", garbageValue = "16")
	@Export("decodeIndex")
	void decodeIndex(byte[] var1) {
		int var3 = var1.length;
		int var2 = class93.method2404(var1, 0, var3);
		this.hash = var2;
		Buffer var4 = new Buffer(SoundSystem.decompressBytes(var1));
		int var5 = var4.readUnsignedByte();
		if (var5 >= 5 && var5 <= 7) {
			if (var5 >= 6) {
				var4.readInt();
			}
			int var6 = var4.readUnsignedByte();
			if (var5 >= 7) {
				this.groupCount = var4.readLargeSmart();
			} else {
				this.groupCount = var4.readUnsignedShort();
			}
			int var7 = 0;
			int var8 = -1;
			this.groupIds = new int[this.groupCount];
			int var9;
			if (var5 >= 7) {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					this.groupIds[var9] = var7 += var4.readLargeSmart();
					if (this.groupIds[var9] > var8) {
						var8 = this.groupIds[var9];
					}
				}
			} else {
				for (var9 = 0; var9 < this.groupCount; ++var9) {
					this.groupIds[var9] = var7 += var4.readUnsignedShort();
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
					this.groupNameHashes[this.groupIds[var9]] = var4.readInt();
				}
				this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
			}
			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.groupCrcs[this.groupIds[var9]] = var4.readInt();
			}
			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.groupVersions[this.groupIds[var9]] = var4.readInt();
			}
			for (var9 = 0; var9 < this.groupCount; ++var9) {
				this.fileCounts[this.groupIds[var9]] = var4.readUnsignedShort();
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
						var14 = this.fileIds[var10][var13] = var7 += var4.readLargeSmart();
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
						var14 = this.fileIds[var10][var13] = var7 += var4.readUnsignedShort();
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
						this.fileNameHashes[var10][this.fileIds[var10][var12]] = var4.readInt();
					}
					this.fileNameHashTables[var10] = new IntHashTable(this.fileNameHashes[var10]);
				}
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(IIB)[B", garbageValue = "-78")
	@Export("takeFile")
	public byte[] takeFile(int var1, int var2) {
		return this.takeFileEncrypted(var1, var2, ((int[]) (null)));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(II[II)[B", garbageValue = "-1612440449")
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
			byte[] var5 = Varps.method5530(this.files[var1][var2], false);
			if (this.shallowFiles) {
				this.files[var1][var2] = null;
			}
			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "1723804313")
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-1576123903")
	public boolean method5849(int var1) {
		if (this.files.length == 1) {
			return this.tryLoadFile(0, var1);
		} else if (this.files[var1].length == 1) {
			return this.tryLoadFile(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "75")
	@Export("tryLoadGroup")
	public boolean tryLoadGroup(int var1) {
		if (this.groups[var1] != null) {
			return true;
		} else {
			this.loadGroup(var1);
			return this.groups[var1] != null;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-445061509")
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
	@ObfuscatedSignature(descriptor = "(II)[B", garbageValue = "-1760059338")
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(IIB)[B", garbageValue = "-45")
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
			byte[] var4 = Varps.method5530(this.files[var1][var2], false);
			return var4;
		} else {
			return null;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "(II)[B", garbageValue = "1079005200")
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "(IB)[I", garbageValue = "55")
	@Export("getGroupFileIds")
	public int[] getGroupFileIds(int var1) {
		return var1 >= 0 && var1 < this.fileIds.length ? this.fileIds[var1] : null;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "416756426")
	@Export("getGroupFileCount")
	public int getGroupFileCount(int var1) {
		return this.files[var1].length;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1142795127")
	@Export("getGroupCount")
	public int getGroupCount() {
		return this.files.length;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1890355813")
	@Export("clearGroups")
	public void clearGroups() {
		for (int var1 = 0; var1 < this.groups.length; ++var1) {
			this.groups[var1] = null;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-624686545")
	@Export("clearFilesGroup")
	public void clearFilesGroup(int var1) {
		for (int var2 = 0; var2 < this.files[var1].length; ++var2) {
			this.files[var1][var2] = null;
		}
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2144599637")
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(descriptor = "(I[II)Z", garbageValue = "78803986")
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
				byte[] var18;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
					var18 = Varps.method5530(this.groups[var1], false);
				} else {
					var18 = Varps.method5530(this.groups[var1], true);
					Buffer var8 = new Buffer(var18);
					var8.xteaDecrypt(var2, 5, var8.array.length);
				}
				byte[] var20 = SoundSystem.decompressBytes(var18);
				if (this.releaseGroups) {
					this.groups[var1] = null;
				}
				if (var3 > 1) {
					int var9 = var20.length;
					--var9;
					int var10 = var20[var9] & 255;
					var9 -= var3 * var10 * 4;
					Buffer var11 = new Buffer(var20);
					int[] var12 = new int[var3];
					var11.offset = var9;
					int var14;
					int var15;
					for (int var13 = 0; var13 < var10; ++var13) {
						var14 = 0;
						for (var15 = 0; var15 < var3; ++var15) {
							var14 += var11.readInt();
							var12[var15] += var14;
						}
					}
					byte[][] var19 = new byte[var3][];
					for (var14 = 0; var14 < var3; ++var14) {
						var19[var14] = new byte[var12[var14]];
						var12[var14] = 0;
					}
					var11.offset = var9;
					var14 = 0;
					for (var15 = 0; var15 < var10; ++var15) {
						int var16 = 0;
						for (int var17 = 0; var17 < var3; ++var17) {
							var16 += var11.readInt();
							System.arraycopy(var20, var14, var19[var17], var12[var17], var16);
							var12[var17] += var16;
							var14 += var16;
						}
					}
					for (var15 = 0; var15 < var3; ++var15) {
						if (!this.shallowFiles) {
							var5[var4[var15]] = WorldMapArea.method4621(var19[var15], false);
						} else {
							var5[var4[var15]] = var19[var15];
						}
					}
				} else if (!this.shallowFiles) {
					var5[var4[0]] = WorldMapArea.method4621(var20, false);
				} else {
					var5[var4[0]] = var20;
				}
				return true;
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "-563529152")
	@Export("getGroupId")
	public int getGroupId(String var1) {
		var1 = var1.toLowerCase();
		return this.groupNameHashTable.get(class357.hashString(var1));
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)I", garbageValue = "1086643666")
	@Export("getFileId")
	public int getFileId(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.fileNameHashTables[var1].get(class357.hashString(var2));
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", garbageValue = "-2145340278")
	@Export("isValidFileName")
	public boolean isValidFileName(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class357.hashString(var1));
		if (var3 < 0) {
			return false;
		} else {
			int var4 = this.fileNameHashTables[var3].get(class357.hashString(var2));
			return var4 >= 0;
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B", garbageValue = "56")
	@Export("takeFileByNames")
	public byte[] takeFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class357.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class357.hashString(var2));
		return this.takeFile(var3, var4);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", garbageValue = "-1940545619")
	@Export("tryLoadFileByNames")
	public boolean tryLoadFileByNames(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var3 = this.groupNameHashTable.get(class357.hashString(var1));
		int var4 = this.fileNameHashTables[var3].get(class357.hashString(var2));
		return this.tryLoadFile(var3, var4);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Z", garbageValue = "-613590995")
	@Export("tryLoadGroupByName")
	public boolean tryLoadGroupByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class357.hashString(var1));
		return this.tryLoadGroup(var2);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "2089361999")
	@Export("loadRegionFromName")
	public void loadRegionFromName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class357.hashString(var1));
		if (var2 >= 0) {
			this.loadRegionFromGroup(var2);
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "671301219")
	@Export("groupLoadPercentByName")
	public int groupLoadPercentByName(String var1) {
		var1 = var1.toLowerCase();
		int var2 = this.groupNameHashTable.get(class357.hashString(var1));
		return this.groupLoadPercent(var2);
	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-1227202994")
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) {
			NPC var2 = Client.npcs[Client.npcIndices[var1]];
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) {
				int var3 = var2.x >> 7;
				int var4 = var2.y >> 7;
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
					if (var2.field1205 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) {
							continue;
						}
						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount;
					}
					long var5 = TaskHandler.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]);
					var2.playerCycle = Client.cycle;
					class356.scene.drawEntity(PacketWriter.Client_plane, var2.x, var2.y, SceneTilePaint.getTileHeight(var2.field1205 * 64 - 64 + var2.x, var2.field1205 * 64 - 64 + var2.y, PacketWriter.Client_plane), var2.field1205 * 64 - 64 + 60, var2, var2.rotation, var5, var2.isWalking);
				}
			}
		}
	}
}