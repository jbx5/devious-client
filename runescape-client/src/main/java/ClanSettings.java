import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("c")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("i")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("f")
	@ObfuscatedGetter(longValue = 
	-3394018459000773741L)

	long field1586;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-401549063)

	int field1583;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	801648797)

	int field1589;
	@ObfuscatedName("l")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("q")
	public byte field1591;
	@ObfuscatedName("o")
	public byte field1592;
	@ObfuscatedName("r")
	public byte field1593;
	@ObfuscatedName("p")
	public byte field1606;
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 
	-547296945)

	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("k")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("d")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("m")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("u")
	int[] field1599;
	@ObfuscatedName("t")
	public int[] field1600;
	@ObfuscatedName("g")
	public boolean[] field1601;
	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 
	1213693909)

	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	1803569685)

	public int field1604;
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 
	94812735)

	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("j")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("e")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("z")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lpt;")

	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(descriptor = 
	"(Lpi;)V")

	public ClanSettings(Buffer var1) {
		this.field1583 = 0;
		this.name = null;
		this.field1589 = 0;
		this.currentOwner = -1;
		this.field1604 = -1;
		this.method2961(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-82")

	void method2953(int var1) {
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

		if (this.field1599 != null) {
			System.arraycopy(this.field1599, 0, this.field1599 = new int[var1], 0, this.memberCount);
		} else {
			this.field1599 = new int[var1];
		}

		if (this.field1600 != null) {
			System.arraycopy(this.field1600, 0, this.field1600 = new int[var1], 0, this.memberCount);
		} else {
			this.field1600 = new int[var1];
		}

		if (this.field1601 != null) {
			System.arraycopy(this.field1601, 0, this.field1601 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1601 = new boolean[var1];
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"28")

	void method2954(int var1) {
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)I", garbageValue = 
	"35363585")

	public int method2955(String var1) {
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(IIII)I", garbageValue = 
	"-1723451340")

	public int method2956(int var1, int var2, int var3) {
		int var4 = (var3 == 31) ? -1 : (1 << (var3 + 1)) - 1;
		return (this.field1599[var1] & var4) >>> var2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(II)Ljava/lang/Integer;", garbageValue = 
	"1275001332")

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
	"33")

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
			class433.method7605(var1, var3, 0, var1.length - 1);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(JLjava/lang/String;II)V", garbageValue = 
	"1216847947")

	void method2959(long var1, String var3, int var4) {
		if ((var3 != null) && (var3.length() == 0)) {
			var3 = null;
		}

		if ((var1 > 0L) != this.useHashes) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (((var1 > 0L) && ((this.memberHashes == null) || (this.memberCount >= this.memberHashes.length))) || ((var3 != null) && ((this.memberNames == null) || (this.memberCount >= this.memberNames.length)))) {
				this.method2953(this.memberCount + 5);
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

			this.field1599[this.memberCount] = 0;
			this.field1600[this.memberCount] = var4;
			this.field1601[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"831178976")

	void method2960(int var1) {
		if ((var1 >= 0) && (var1 < this.memberCount)) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1599 = null;
				this.field1600 = null;
				this.field1601 = null;
				this.currentOwner = -1;
				this.field1604 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1599, var1 + 1, this.field1599, var1, this.memberCount - var1);
				System.arraycopy(this.field1600, var1 + 1, this.field1600, var1, this.memberCount - var1);
				System.arraycopy(this.field1601, var1 + 1, this.field1601, var1, this.memberCount - var1);
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-131657821")

	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1604 = -1;
		} else {
			this.currentOwner = -1;
			this.field1604 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];

			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1604 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if ((this.field1604 == (-1)) && (this.memberRanks[var3] == 125)) {
					this.field1604 = var3;
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != (-1)) {
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(JLjava/lang/String;B)V", garbageValue = 
	"17")

	void method2996(long var1, String var3) {
		if ((var3 != null) && (var3.length() == 0)) {
			var3 = null;
		}

		if (this.useHashes != (var1 > 0L)) {
			throw new RuntimeException("");
		} else if ((var3 != null) != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (((var1 > 0L) && ((this.bannedMemberHashes == null) || (this.bannedMemberCount >= this.bannedMemberHashes.length))) || ((var3 != null) && ((this.bannedMemberNames == null) || (this.bannedMemberCount >= this.bannedMemberNames.length)))) {
				this.method2954(this.bannedMemberCount + 5);
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-1100183884")

	void method2963(int var1) {
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(IBB)I", garbageValue = 
	"-48")

	int method2964(int var1, byte var2) {
		if ((var2 != 126) && (var2 != 127)) {
			if ((this.currentOwner == var1) && ((this.field1604 == (-1)) || (this.memberRanks[this.field1604] < 125))) {
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"-1731928616")

	boolean method2965(int var1) {
		if ((this.currentOwner != var1) && (this.memberRanks[var1] != 126)) {
			this.memberRanks[this.currentOwner] = 125;
			this.field1604 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(IZI)I", garbageValue = 
	"1433245156")

	int method3027(int var1, boolean var2) {
		if (this.field1601[var1] == var2) {
			return -1;
		} else {
			this.field1601[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(IIIIB)I", garbageValue = 
	"-122")

	int method2967(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = (var4 == 31) ? -1 : (1 << (var4 + 1)) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1599[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1599[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(III)Z", garbageValue = 
	"-827323017")

	boolean method2968(int var1, int var2) {
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(IIIIB)Z", garbageValue = 
	"42")

	boolean method2969(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("t")
	boolean method2978(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get(((long) (var1)));
			if (var4 != null) {
				if (var4 instanceof class406) {
					class406 var5 = ((class406) (var4));
					if (var2 == var5.field4407) {
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(ILjava/lang/String;B)Z", garbageValue = 
	"49")

	boolean method2971(int var1, String var2) {
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-1262320600")

	void method2961(Buffer var1) {
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

			this.field1583 = var1.readInt();
			this.field1589 = var1.readInt();
			if ((var2 <= 3) && (this.field1589 != 0)) {
				this.field1589 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field1591 = var1.readByte();
			this.field1592 = var1.readByte();
			this.field1593 = var1.readByte();
			this.field1606 = var1.readByte();
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

				if ((this.field1599 == null) || (this.field1599.length < this.memberCount)) {
					this.field1599 = new int[this.memberCount];
				}

				if ((this.field1600 == null) || (this.field1600.length < this.memberCount)) {
					this.field1600 = new int[this.memberCount];
				}

				if ((this.field1601 == null) || (this.field1601.length < this.memberCount)) {
					this.field1601 = new boolean[this.memberCount];
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
						this.field1599[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.field1600[var4] = var1.readUnsignedShort();
					} else {
						this.field1600[var4] = 0;
					}

					if (var2 >= 6) {
						this.field1601[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1601[var4] = false;
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
					this.parameters = new IterableNodeHashTable(var4 < 16 ? class67.method1909(var4) : 16);

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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lch;B)V", garbageValue = 
	"28")

	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		Interpreter.runScript(var0, 500000, 475000);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1975517919")

	static final void method3031() {
		class149.method3138("You can't add yourself to your own friend list");
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(IIB)I", garbageValue = 
	"-26")

	static final int method3028(int var0, int var1) {
		if (var0 == (-2)) {
			return 12345678;
		} else if (var0 == (-1)) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = ((var0 & 127) * var1) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(ZB)V", garbageValue = 
	"-89")

	public static void method3033(boolean var0) {
		if (var0 != DevicePcmPlayerProvider.ItemDefinition_inMembersWorld) {
			ItemComposition.ItemDefinition_cached.clear();
			ItemComposition.ItemDefinition_cachedModels.clear();
			ItemComposition.ItemDefinition_cachedSprites.clear();
			DevicePcmPlayerProvider.ItemDefinition_inMembersWorld = var0;
		}

	}
}