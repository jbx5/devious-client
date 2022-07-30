import net.runelite.mapping.ObfuscatedName;
import java.io.RandomAccessFile;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("ez")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("eh")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive20")
	static Archive archive20;

	@ObfuscatedName("q")
	@Export("useHashes")
	boolean useHashes;

	@ObfuscatedName("f")
	@Export("useNames")
	boolean useNames;

	@ObfuscatedName("u")
	@ObfuscatedGetter(longValue = -1249798400676784157L)
	long field1613;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1438563393)
	int field1614 = 0;

	@ObfuscatedName("w")
	@Export("name")
	public String name = null;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -160458011)
	int field1628 = 0;

	@ObfuscatedName("j")
	@Export("allowGuests")
	public boolean allowGuests;

	@ObfuscatedName("h")
	public byte field1631;

	@ObfuscatedName("a")
	public byte field1619;

	@ObfuscatedName("d")
	public byte field1632;

	@ObfuscatedName("n")
	public byte field1621;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 8584863)
	@Export("memberCount")
	public int memberCount;

	@ObfuscatedName("g")
	@Export("memberHashes")
	long[] memberHashes;

	@ObfuscatedName("p")
	@Export("memberRanks")
	public byte[] memberRanks;

	@ObfuscatedName("b")
	@Export("sortedMembers")
	int[] sortedMembers;

	@ObfuscatedName("l")
	int[] field1626;

	@ObfuscatedName("y")
	public int[] field1627;

	@ObfuscatedName("k")
	public boolean[] field1622;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 499170237)
	@Export("currentOwner")
	public int currentOwner = -1;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -1651175749)
	public int field1630 = -1;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -998247179)
	@Export("bannedMemberCount")
	public int bannedMemberCount;

	@ObfuscatedName("s")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;

	@ObfuscatedName("i")
	@Export("memberNames")
	public String[] memberNames;

	@ObfuscatedName("r")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Lpl;")
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(descriptor = "(Lqw;)V")
	public ClanSettings(Buffer var1) {
		this.method2991(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1318167530")
	void method2972(int var1) {
		if (this.useHashes) {
			if (this.memberHashes != null) {
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1];
			}
		}
		if (this.useNames) {
			if (this.memberNames != null) {
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1];
			}
		}
		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
		} else {
			this.memberRanks = new byte[var1];
		}
		if (this.field1626 != null) {
			System.arraycopy(this.field1626, 0, this.field1626 = new int[var1], 0, this.memberCount);
		} else {
			this.field1626 = new int[var1];
		}
		if (this.field1627 != null) {
			System.arraycopy(this.field1627, 0, this.field1627 = new int[var1], 0, this.memberCount);
		} else {
			this.field1627 = new int[var1];
		}
		if (this.field1622 != null) {
			System.arraycopy(this.field1622, 0, this.field1622 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1622 = new boolean[var1];
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IS)V", garbageValue = "426")
	void method2973(int var1) {
		if (this.useHashes) {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberHashes = new long[var1];
			}
		}
		if (this.useNames) {
			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1];
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "1623968459")
	public int method3042(String var1) {
		if (var1 != null && var1.length() != 0) {
			for (int var2 = 0; var2 < this.memberCount; ++var2) {
				if (this.memberNames[var2].equals(var1)) {
					return var2;
				}
			}
			return -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "-714384166")
	public int method2975(int var1, int var2, int var3) {
		int var4 = (var3 == 31) ? -1 : (1 << var3 + 1) - 1;
		return (this.field1626[var1] & var4) >>> var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/Integer;", garbageValue = "-1955488610")
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get(((long) (var1)));
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode) (var2)).integer) : null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)[I", garbageValue = "1646879206")
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.memberCount];
			this.sortedMembers = new int[this.memberCount];
			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) {
				var1[var2] = this.memberNames[var2];
				if (var1[var2] != null) {
					var1[var2] = var1[var2].toLowerCase();
				}
			}
			class390.method7091(var1, this.sortedMembers);
		}
		return this.sortedMembers;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(JLjava/lang/String;IB)V", garbageValue = "83")
	void method3031(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}
		if (this.useHashes != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method2972(this.memberCount + 5);
			}
			if (this.memberHashes != null) {
				this.memberHashes[this.memberCount] = var1;
			}
			if (this.memberNames != null) {
				this.memberNames[this.memberCount] = var3;
			}
			if (this.currentOwner == -1) {
				this.currentOwner = this.memberCount;
				this.memberRanks[this.memberCount] = 126;
			} else {
				this.memberRanks[this.memberCount] = 0;
			}
			this.field1626[this.memberCount] = 0;
			this.field1627[this.memberCount] = var4;
			this.field1622[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-283696886")
	void method2979(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1626 = null;
				this.field1627 = null;
				this.field1622 = null;
				this.currentOwner = -1;
				this.field1630 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1626, var1 + 1, this.field1626, var1, this.memberCount - var1);
				System.arraycopy(this.field1627, var1 + 1, this.field1627, var1, this.memberCount - var1);
				System.arraycopy(this.field1622, var1 + 1, this.field1622, var1, this.memberCount - var1);
				if (this.memberHashes != null) {
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}
				if (this.memberNames != null) {
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}
				this.updateOwner();
			}
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "21")
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1630 = -1;
		} else {
			this.currentOwner = -1;
			this.field1630 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];
			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1630 = var1;
					}
					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if (this.field1630 == -1 && this.memberRanks[var3] == 125) {
					this.field1630 = var3;
				}
			}
			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(JLjava/lang/String;I)V", garbageValue = "427836240")
	void method2987(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}
		if (this.useHashes != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method2973(this.bannedMemberCount + 5);
			}
			if (this.bannedMemberHashes != null) {
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}
			if (this.bannedMemberNames != null) {
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}
			++this.bannedMemberCount;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "23")
	void method2982(int var1) {
		--this.bannedMemberCount;
		if (this.bannedMemberCount == 0) {
			this.bannedMemberHashes = null;
			this.bannedMemberNames = null;
		} else {
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}
			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1);
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(IBI)I", garbageValue = "299978303")
	int method2983(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.currentOwner == var1 && (this.field1630 == -1 || this.memberRanks[this.field1630] < 125)) {
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1;
			} else {
				this.memberRanks[var1] = var2;
				this.updateOwner();
				return var1;
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "125")
	boolean method3040(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
			this.memberRanks[this.currentOwner] = 125;
			this.field1630 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(IZI)I", garbageValue = "1675998830")
	int method2974(int var1, boolean var2) {
		if (this.field1622[var1] == var2) {
			return -1;
		} else {
			this.field1622[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(IIIIS)I", garbageValue = "321")
	int method2986(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = (var4 == 31) ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1626[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1626[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-1002453709")
	boolean method2992(int var1, int var2) {
		if (this.parameters != null) {
			Node var3 = this.parameters.get(((long) (var1)));
			if (var3 != null) {
				if (var3 instanceof IntegerNode) {
					IntegerNode var4 = ((IntegerNode) (var3));
					if (var2 == var4.integer) {
						return false;
					}
					var4.integer = var2;
					return true;
				}
				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}
		this.parameters.put(new IntegerNode(var2), ((long) (var1)));
		return true;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(IIIII)Z", garbageValue = "509038177")
	boolean method2988(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = (var4 == 31) ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		if (this.parameters != null) {
			Node var8 = this.parameters.get(((long) (var1)));
			if (var8 != null) {
				if (var8 instanceof IntegerNode) {
					IntegerNode var9 = ((IntegerNode) (var8));
					if ((var9.integer & var7) == var2) {
						return false;
					}
					var9.integer &= ~var7;
					var9.integer |= var2;
					return true;
				}
				var8.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}
		this.parameters.put(new IntegerNode(var2), ((long) (var1)));
		return true;
	}

	@ObfuscatedName("y")
	boolean method2989(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get(((long) (var1)));
			if (var4 != null) {
				if (var4 instanceof class408) {
					class408 var5 = ((class408) (var4));
					if (var5.field4474 == var2) {
						return false;
					}
					var5.field4474 = var2;
					return true;
				}
				var4.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}
		this.parameters.put(new class408(var2), ((long) (var1)));
		return true;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Z", garbageValue = "438505582")
	boolean method2990(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}
		if (this.parameters != null) {
			Node var3 = this.parameters.get(((long) (var1)));
			if (var3 != null) {
				if (var3 instanceof ObjectNode) {
					ObjectNode var4 = ((ObjectNode) (var3));
					if (var4.obj instanceof String) {
						if (var2.equals(var4.obj)) {
							return false;
						}
						var4.remove();
						this.parameters.put(new ObjectNode(var2), var4.key);
						return true;
					}
				}
				var3.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}
		this.parameters.put(new ObjectNode(var2), ((long) (var1)));
		return true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "791495604")
	void method2991(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 >= 1 && var2 <= 6) {
			int var3 = var1.readUnsignedByte();
			if ((var3 & 1) != 0) {
				this.useHashes = true;
			}
			if ((var3 & 2) != 0) {
				this.useNames = true;
			}
			if (!this.useHashes) {
				this.memberHashes = null;
				this.bannedMemberHashes = null;
			}
			if (!this.useNames) {
				this.memberNames = null;
				this.bannedMemberNames = null;
			}
			this.field1614 = var1.readInt();
			this.field1628 = var1.readInt();
			if (var2 <= 3 && this.field1628 != 0) {
				this.field1628 += 16912800;
			}
			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}
			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field1631 = var1.readByte();
			this.field1619 = var1.readByte();
			this.field1632 = var1.readByte();
			this.field1621 = var1.readByte();
			int var4;
			if (this.memberCount > 0) {
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) {
					this.memberHashes = new long[this.memberCount];
				}
				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) {
					this.memberNames = new String[this.memberCount];
				}
				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) {
					this.memberRanks = new byte[this.memberCount];
				}
				if (this.field1626 == null || this.field1626.length < this.memberCount) {
					this.field1626 = new int[this.memberCount];
				}
				if (this.field1627 == null || this.field1627.length < this.memberCount) {
					this.field1627 = new int[this.memberCount];
				}
				if (this.field1622 == null || this.field1622.length < this.memberCount) {
					this.field1622 = new boolean[this.memberCount];
				}
				for (var4 = 0; var4 < this.memberCount; ++var4) {
					if (this.useHashes) {
						this.memberHashes[var4] = var1.readLong();
					}
					if (this.useNames) {
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
					this.memberRanks[var4] = var1.readByte();
					if (var2 >= 2) {
						this.field1626[var4] = var1.readInt();
					}
					if (var2 >= 5) {
						this.field1627[var4] = var1.readUnsignedShort();
					} else {
						this.field1627[var4] = 0;
					}
					if (var2 >= 6) {
						this.field1622[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1622[var4] = false;
					}
				}
				this.updateOwner();
			}
			if (this.bannedMemberCount > 0) {
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) {
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}
				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) {
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}
				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) {
					if (this.useHashes) {
						this.bannedMemberHashes[var4] = var1.readLong();
					}
					if (this.useNames) {
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}
			if (var2 >= 3) {
				var4 = var1.readUnsignedShort();
				if (var4 > 0) {
					this.parameters = new IterableNodeHashTable(var4 < 16 ? FloorOverlayDefinition.method3800(var4) : 16);
					while (var4-- > 0) {
						int var5 = var1.readInt();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var12 = var1.readInt();
							this.parameters.put(new IntegerNode(var12), ((long) (var6)));
						} else if (var7 == 1) {
							long var10 = var1.readLong();
							this.parameters.put(new class408(var10), ((long) (var6)));
						} else if (var7 == 2) {
							String var8 = var1.readStringCp1252NullTerminated();
							this.parameters.put(new ObjectNode(var8), ((long) (var6)));
						}
					} 
				}
			}
		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "1064254718")
	public static int method3043(int var0, int var1) {
		return ((int) (Math.round(Math.atan2(((double) (var0)), ((double) (var1))) * 2607.5945876176133))) & 16383;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/io/File;ZB)Z", garbageValue = "1")
	public static boolean method3006(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw");
			int var3 = var2.read();
			var2.seek(0L);
			var2.write(var3);
			var2.seek(0L);
			var2.close();
			if (var1) {
				var0.delete();
			}
			return true;
		} catch (Exception var4) {
			return false;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(CI)C", garbageValue = "-1194739881")
	static char method2993(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return ((char) (var0 == 339 ? 'e' : '\u0000'));
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "209801067")
	static int method2978(int var0, Script var1, boolean var2) {
		Widget var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var3.modelTransparency) ? 1 : 0;
			return 1;
		} else if (var0 != 2615 && var0 != 2616) {
			return 2;
		} else {
			++TaskHandler.Interpreter_intStackSize;
			return 1;
		}
	}
}