import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("sp")
	@ObfuscatedGetter(intValue = 
	1198231863)

	static int field1608;
	@ObfuscatedName("ov")
	@ObfuscatedSignature(descriptor = 
	"[Lkn;")

	static Widget[] field1622;
	@ObfuscatedName("o")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("h")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("g")
	@ObfuscatedGetter(longValue = 
	3945145856419995181L)

	long field1607;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	618465929)

	int field1598;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-1783912821)

	int field1594;
	@ObfuscatedName("f")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("u")
	public byte field1602;
	@ObfuscatedName("r")
	public byte field1603;
	@ObfuscatedName("k")
	public byte field1604;
	@ObfuscatedName("x")
	public byte field1613;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	1908103089)

	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("j")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("p")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("s")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("b")
	int[] field1610;
	@ObfuscatedName("w")
	public int[] field1611;
	@ObfuscatedName("a")
	public boolean[] field1600;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	1818610271)

	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-1447317987)

	public int field1614;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	1779654551)

	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("z")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("e")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("t")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lpq;")

	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(descriptor = 
	"(Lpd;)V")

	public ClanSettings(Buffer var1) {
		this.field1598 = 0;
		this.name = null;
		this.field1594 = 0;
		this.currentOwner = -1;
		this.field1614 = -1;
		this.method2931(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-123")

	void method2913(int var1) {
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

		if (this.field1610 != null) {
			System.arraycopy(this.field1610, 0, this.field1610 = new int[var1], 0, this.memberCount);
		} else {
			this.field1610 = new int[var1];
		}

		if (this.field1611 != null) {
			System.arraycopy(this.field1611, 0, this.field1611 = new int[var1], 0, this.memberCount);
		} else {
			this.field1611 = new int[var1];
		}

		if (this.field1600 != null) {
			System.arraycopy(this.field1600, 0, this.field1600 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1600 = new boolean[var1];
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"9")

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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)I", garbageValue = 
	"-1580381638")

	public int method2979(String var1) {
		if ((var1 != null) && (var1.length() != 0)) {
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(IIII)I", garbageValue = 
	"1226760366")

	public int method2915(int var1, int var2, int var3) {
		int var4 = (var3 == 31) ? -1 : (1 << (var3 + 1)) - 1;
		return (this.field1610[var1] & var4) >>> var2;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(IB)Ljava/lang/Integer;", garbageValue = 
	"-18")

	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get(((long) (var1)));
			return (var2 != null) && (var2 instanceof IntegerNode) ? new Integer(((IntegerNode) (var2)).integer) : null;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(B)[I", garbageValue = 
	"11")

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

			int[] var3 = this.sortedMembers;
			WorldMapData_0.method4518(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(JLjava/lang/String;II)V", garbageValue = 
	"1792170403")

	void method2918(long var1, String var3, int var4) {
		if ((var3 != null) && (var3.length() == 0)) {
			var3 = null;
		}

		if (this.useHashes != (var1 > 0L)) {
			throw new RuntimeException("");
		} else if ((var3 != null) != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (((var1 > 0L) && ((this.memberHashes == null) || (this.memberCount >= this.memberHashes.length))) || ((var3 != null) && ((this.memberNames == null) || (this.memberCount >= this.memberNames.length)))) {
				this.method2913(this.memberCount + 5);
			}

			if (this.memberHashes != null) {
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) {
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == (-1)) {
				this.currentOwner = this.memberCount;
				this.memberRanks[this.memberCount] = 126;
			} else {
				this.memberRanks[this.memberCount] = 0;
			}

			this.field1610[this.memberCount] = 0;
			this.field1611[this.memberCount] = var4;
			this.field1600[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"0")

	void method2919(int var1) {
		if ((var1 >= 0) && (var1 < this.memberCount)) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1610 = null;
				this.field1611 = null;
				this.field1600 = null;
				this.currentOwner = -1;
				this.field1614 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1610, var1 + 1, this.field1610, var1, this.memberCount - var1);
				System.arraycopy(this.field1611, var1 + 1, this.field1611, var1, this.memberCount - var1);
				System.arraycopy(this.field1600, var1 + 1, this.field1600, var1, this.memberCount - var1);
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"56399515")

	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1614 = -1;
		} else {
			this.currentOwner = -1;
			this.field1614 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];

			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1614 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if ((this.field1614 == (-1)) && (this.memberRanks[var3] == 125)) {
					this.field1614 = var3;
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != (-1)) {
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(JLjava/lang/String;B)V", garbageValue = 
	"94")

	void method2912(long var1, String var3) {
		if ((var3 != null) && (var3.length() == 0)) {
			var3 = null;
		}

		if (this.useHashes != (var1 > 0L)) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (((var1 > 0L) && ((this.bannedMemberHashes == null) || (this.bannedMemberCount >= this.bannedMemberHashes.length))) || ((var3 != null) && ((this.bannedMemberNames == null) || (this.bannedMemberCount >= this.bannedMemberNames.length)))) {
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"2044582624")

	void method2922(int var1) {
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(IBI)I", garbageValue = 
	"2038770318")

	int method2940(int var1, byte var2) {
		if ((var2 != 126) && (var2 != 127)) {
			if ((this.currentOwner == var1) && ((this.field1614 == (-1)) || (this.memberRanks[this.field1614] < 125))) {
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"-190759888")

	boolean method2924(int var1) {
		if ((this.currentOwner != var1) && (this.memberRanks[var1] != 126)) {
			this.memberRanks[this.currentOwner] = 125;
			this.field1614 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(IZI)I", garbageValue = 
	"-606065608")

	int method2925(int var1, boolean var2) {
		if (this.field1600[var1] == var2) {
			return -1;
		} else {
			this.field1600[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(IIIIS)I", garbageValue = 
	"23318")

	int method2926(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = (var4 == 31) ? -1 : (1 << (var4 + 1)) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1610[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1610[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(IIB)Z", garbageValue = 
	"0")

	boolean method2927(int var1, int var2) {
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(IIIIB)Z", garbageValue = 
	"-101")

	boolean method2928(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = (var4 == 31) ? -1 : (1 << (var4 + 1)) - 1;
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

	@ObfuscatedName("w")
	boolean method2938(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get(((long) (var1)));
			if (var4 != null) {
				if (var4 instanceof class406) {
					class406 var5 = ((class406) (var4));
					if (var5.field4407 == var2) {
						return false;
					}

					var5.field4407 = var2;
					return true;
				}

				var4.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new class406(var2), ((long) (var1)));
		return true;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;I)Z", garbageValue = 
	"-529235235")

	boolean method2956(int var1, String var2) {
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"18266587")

	void method2931(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 >= 1) && (var2 <= 6)) {
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

			this.field1598 = var1.readInt();
			this.field1594 = var1.readInt();
			if ((var2 <= 3) && (this.field1594 != 0)) {
				this.field1594 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field1602 = var1.readByte();
			this.field1603 = var1.readByte();
			this.field1604 = var1.readByte();
			this.field1613 = var1.readByte();
			int var4;
			if (this.memberCount > 0) {
				if (this.useHashes && ((this.memberHashes == null) || (this.memberHashes.length < this.memberCount))) {
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && ((this.memberNames == null) || (this.memberNames.length < this.memberCount))) {
					this.memberNames = new String[this.memberCount];
				}

				if ((this.memberRanks == null) || (this.memberRanks.length < this.memberCount)) {
					this.memberRanks = new byte[this.memberCount];
				}

				if ((this.field1610 == null) || (this.field1610.length < this.memberCount)) {
					this.field1610 = new int[this.memberCount];
				}

				if ((this.field1611 == null) || (this.field1611.length < this.memberCount)) {
					this.field1611 = new int[this.memberCount];
				}

				if ((this.field1600 == null) || (this.field1600.length < this.memberCount)) {
					this.field1600 = new boolean[this.memberCount];
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
						this.field1610[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.field1611[var4] = var1.readUnsignedShort();
					} else {
						this.field1611[var4] = 0;
					}

					if (var2 >= 6) {
						this.field1600[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1600[var4] = false;
					}
				}

				this.updateOwner();
			}

			if (this.bannedMemberCount > 0) {
				if (this.useHashes && ((this.bannedMemberHashes == null) || (this.bannedMemberHashes.length < this.bannedMemberCount))) {
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && ((this.bannedMemberNames == null) || (this.bannedMemberNames.length < this.bannedMemberCount))) {
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
					this.parameters = new IterableNodeHashTable(var4 < 16 ? Login.method1894(var4) : 16);

					while ((var4--) > 0) {
						int var5 = var1.readInt();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var12 = var1.readInt();
							this.parameters.put(new IntegerNode(var12), ((long) (var6)));
						} else if (var7 == 1) {
							long var10 = var1.readLong();
							this.parameters.put(new class406(var10), ((long) (var6)));
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lpq;III)I", garbageValue = 
	"1431232639")

	static int method2976(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = ((IntegerNode) (var0.get(((long) (var1)))));
			return var3 == null ? var2 : var3.integer;
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(descriptor = 
	"([Lkn;II)V", garbageValue = 
	"1847121175")

	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var3.id)))));
					if (var4 != null) {
						MouseHandler.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if ((var1 == 0) && (var3.onDialogAbort != null)) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					class1.runScriptEvent(var5);
				}

				if ((var1 == 1) && (var3.onSubChange != null)) {
					if (var3.childIndex >= 0) {
						Widget var6 = HorizontalAlignment.getWidget(var3.id);
						if ((((var6 == null) || (var6.children == null)) || (var3.childIndex >= var6.children.length)) || (var3 != var6.children[var3.childIndex])) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					class1.runScriptEvent(var5);
				}
			}
		}

	}
}