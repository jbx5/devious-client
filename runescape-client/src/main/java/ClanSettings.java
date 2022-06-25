import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("en")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("v")
	@Export("useHashes")
	boolean useHashes;

	@ObfuscatedName("q")
	@Export("useNames")
	boolean useNames;

	@ObfuscatedName("f")
	@ObfuscatedGetter(longValue = -6342819695359626435L)
	long field1627;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1887905615)
	int field1628;

	@ObfuscatedName("e")
	@Export("name")
	public String name;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -481546883)
	int field1630;

	@ObfuscatedName("w")
	@Export("allowGuests")
	public boolean allowGuests;

	@ObfuscatedName("y")
	public byte field1637;

	@ObfuscatedName("i")
	public byte field1633;

	@ObfuscatedName("s")
	public byte field1634;

	@ObfuscatedName("t")
	public byte field1645;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 906149583)
	@Export("memberCount")
	public int memberCount;

	@ObfuscatedName("r")
	@Export("memberHashes")
	long[] memberHashes;

	@ObfuscatedName("u")
	@Export("memberRanks")
	public byte[] memberRanks;

	@ObfuscatedName("k")
	@Export("sortedMembers")
	int[] sortedMembers;

	@ObfuscatedName("h")
	int[] field1640;

	@ObfuscatedName("x")
	public int[] field1649;

	@ObfuscatedName("l")
	public boolean[] field1642;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 819746427)
	@Export("currentOwner")
	public int currentOwner;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 14234283)
	public int field1644;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 1427901421)
	@Export("bannedMemberCount")
	public int bannedMemberCount;

	@ObfuscatedName("n")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;

	@ObfuscatedName("o")
	@Export("memberNames")
	public String[] memberNames;

	@ObfuscatedName("m")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lpb;")
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(descriptor = "(Lqt;)V")
	public ClanSettings(Buffer var1) {
		this.field1628 = 0;
		this.name = null;
		this.field1630 = 0;
		this.currentOwner = -1;
		this.field1644 = -1;
		this.method2969(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1635442179")
	void method2950(int var1) {
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
		if (this.field1640 != null) {
			System.arraycopy(this.field1640, 0, this.field1640 = new int[var1], 0, this.memberCount);
		} else {
			this.field1640 = new int[var1];
		}
		if (this.field1649 != null) {
			System.arraycopy(this.field1649, 0, this.field1649 = new int[var1], 0, this.memberCount);
		} else {
			this.field1649 = new int[var1];
		}
		if (this.field1642 != null) {
			System.arraycopy(this.field1642, 0, this.field1642 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1642 = new boolean[var1];
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1202056039")
	void method2974(int var1) {
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "132002265")
	public int method2991(String var1) {
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIIS)I", garbageValue = "29292")
	public int method2972(int var1, int var2, int var3) {
		int var4 = (var3 == 31) ? -1 : (1 << var3 + 1) - 1;
		return (this.field1640[var1] & var4) >>> var2;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IB)Ljava/lang/Integer;", garbageValue = "1")
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get(((long) (var1)));
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode) (var2)).integer) : null;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(S)[I", garbageValue = "267")
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
			class353.method6507(var1, this.sortedMembers);
		}
		return this.sortedMembers;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(JLjava/lang/String;IB)V", garbageValue = "-60")
	void method2956(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}
		if (this.useHashes != var1 > 0L) {
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method2950(this.memberCount + 5);
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
			this.field1640[this.memberCount] = 0;
			this.field1649[this.memberCount] = var4;
			this.field1642[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-721194378")
	void method2957(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1640 = null;
				this.field1649 = null;
				this.field1642 = null;
				this.currentOwner = -1;
				this.field1644 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1640, var1 + 1, this.field1640, var1, this.memberCount - var1);
				System.arraycopy(this.field1649, var1 + 1, this.field1649, var1, this.memberCount - var1);
				System.arraycopy(this.field1642, var1 + 1, this.field1642, var1, this.memberCount - var1);
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-87")
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1644 = -1;
		} else {
			this.currentOwner = -1;
			this.field1644 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];
			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1644 = var1;
					}
					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if (this.field1644 == -1 && this.memberRanks[var3] == 125) {
					this.field1644 = var3;
				}
			}
			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(JLjava/lang/String;I)V", garbageValue = "1888589183")
	void method2959(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}
		if (this.useHashes != var1 > 0L) {
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method2974(this.bannedMemberCount + 5);
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "0")
	void method3019(int var1) {
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(IBI)I", garbageValue = "-585150872")
	int method2961(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.currentOwner == var1 && (this.field1644 == -1 || this.memberRanks[this.field1644] < 125)) {
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "1")
	boolean method3016(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
			this.memberRanks[this.currentOwner] = 125;
			this.field1644 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(IZI)I", garbageValue = "-1677088701")
	int method2963(int var1, boolean var2) {
		if (this.field1642[var1] == var2) {
			return -1;
		} else {
			this.field1642[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIIIB)I", garbageValue = "-37")
	int method2964(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = (var4 == 31) ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1640[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1640[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(IIB)Z", garbageValue = "62")
	boolean method2965(int var1, int var2) {
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IIIIB)Z", garbageValue = "71")
	boolean method3004(int var1, int var2, int var3, int var4) {
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

	@ObfuscatedName("x")
	boolean method2967(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get(((long) (var1)));
			if (var4 != null) {
				if (var4 instanceof class407) {
					class407 var5 = ((class407) (var4));
					if (var5.field4459 == var2) {
						return false;
					}
					var5.field4459 = var2;
					return true;
				}
				var4.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}
		this.parameters.put(new class407(var2), ((long) (var1)));
		return true;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Z", garbageValue = "-2147483648")
	boolean method2968(int var1, String var2) {
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "-37")
	void method2969(Buffer var1) {
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
			this.field1628 = var1.readInt();
			this.field1630 = var1.readInt();
			if (var2 <= 3 && this.field1630 != 0) {
				this.field1630 += 16912800;
			}
			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}
			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field1637 = var1.readByte();
			this.field1633 = var1.readByte();
			this.field1634 = var1.readByte();
			this.field1645 = var1.readByte();
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
				if (this.field1640 == null || this.field1640.length < this.memberCount) {
					this.field1640 = new int[this.memberCount];
				}
				if (this.field1649 == null || this.field1649.length < this.memberCount) {
					this.field1649 = new int[this.memberCount];
				}
				if (this.field1642 == null || this.field1642.length < this.memberCount) {
					this.field1642 = new boolean[this.memberCount];
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
						this.field1640[var4] = var1.readInt();
					}
					if (var2 >= 5) {
						this.field1649[var4] = var1.readUnsignedShort();
					} else {
						this.field1649[var4] = 0;
					}
					if (var2 >= 6) {
						this.field1642[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1642[var4] = false;
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
					this.parameters = new IterableNodeHashTable(var4 < 16 ? class135.method2910(var4) : 16);
					while (var4-- > 0) {
						int var5 = var1.readInt();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var12 = var1.readInt();
							this.parameters.put(new IntegerNode(var12), ((long) (var6)));
						} else if (var7 == 1) {
							long var10 = var1.readLong();
							this.parameters.put(new class407(var10), ((long) (var6)));
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
	@ObfuscatedSignature(descriptor = "(Llh;Llh;ZIS)V", garbageValue = "6367")
	static void method3020(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				WorldMapData_1.method4872(4);
			}
		} else {
			if (var3 == 0) {
				class101.method2547(var2);
			} else {
				WorldMapData_1.method4872(var3);
			}
			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			class16.leftTitleSprite = ItemLayer.method3920(var4);
			Login.rightTitleSprite = class16.leftTitleSprite.mirrorHorizontally();
			SoundSystem.method739(var1, Client.worldProperties);
			class4.titleboxSprite = class421.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class6.titlebuttonSprite = class421.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field914 = class421.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			IgnoreList.field4284 = class421.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class421.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			int var6 = var1.getGroupId("runes");
			int var7 = var1.getFileId(var6, "");
			IndexedSprite[] var5 = ClanChannelMember.method2867(var1, var6, var7);
			AbstractByteArrayCopier.runesSprite = var5;
			var7 = var1.getGroupId("title_mute");
			int var8 = var1.getFileId(var7, "");
			IndexedSprite[] var10 = ClanChannelMember.method2867(var1, var7, var8);
			class145.title_muteSprite = var10;
			class345.options_buttons_0Sprite = class421.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class113.field1427 = class421.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class228.options_buttons_2Sprite = class421.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			DynamicObject.field979 = class421.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			ReflectionCheck.field247 = class345.options_buttons_0Sprite.subWidth;
			MouseRecorder.field1064 = class345.options_buttons_0Sprite.subHeight;
			Login.loginScreenRunesAnimation = new LoginScreenAnimation(AbstractByteArrayCopier.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field911 = new String[8];
				Login.field910 = 0;
			}
			class240.field2846 = 0;
			World.otp = "";
			Login.field895 = true;
			Login.worldSelectOpen = false;
			if (!class19.clientPreferences.method2317()) {
				Archive var11 = class121.archive6;
				var8 = var11.getGroupId("scape main");
				int var9 = var11.getFileId(var8, "");
				class272.musicPlayerStatus = 1;
				class272.musicTrackArchive = var11;
				class272.musicTrackGroupId = var8;
				class151.musicTrackFileId = var9;
				class272.musicTrackVolume = 255;
				class11.musicTrackBoolean = false;
				class272.pcmSampleLength = 2;
			} else {
				class272.musicPlayerStatus = 1;
				class272.musicTrackArchive = null;
				class272.musicTrackGroupId = -1;
				class151.musicTrackFileId = -1;
				class272.musicTrackVolume = 0;
				class11.musicTrackBoolean = false;
				class272.pcmSampleLength = 2;
			}
			class115.method2693(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (Script.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			Canvas.loginBoxCenter = Login.loginBoxX + 180;
			class16.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lpq;IB)V", garbageValue = "118")
	@Export("updatePlayers")
	static final void updatePlayers(PacketBuffer var0, int var1) {
		int var2 = var0.offset;
		Players.Players_pendingUpdateCount = 0;
		int var3 = 0;
		var0.importIndex();
		int var4;
		int var6;
		int var8;
		byte[] var10000;
		int var17;
		int var20;
		for (var4 = 0; var4 < Players.Players_count; ++var4) {
			var20 = Players.Players_indices[var4];
			if ((Players.field1311[var20] & 1) == 0) {
				if (var3 > 0) {
					--var3;
					var10000 = Players.field1311;
					var10000[var20] = ((byte) (var10000[var20] | 2));
				} else {
					var6 = var0.readBits(1);
					if (var6 == 0) {
						var8 = var0.readBits(2);
						if (var8 == 0) {
							var17 = 0;
						} else if (var8 == 1) {
							var17 = var0.readBits(5);
						} else if (var8 == 2) {
							var17 = var0.readBits(8);
						} else {
							var17 = var0.readBits(11);
						}
						var3 = var17;
						var10000 = Players.field1311;
						var10000[var20] = ((byte) (var10000[var20] | 2));
					} else {
						class14.readPlayerUpdate(var0, var20);
					}
				}
			}
		}
		var0.exportIndex();
		if (var3 != 0) {
			throw new RuntimeException();
		} else {
			var0.importIndex();
			for (var4 = 0; var4 < Players.Players_count; ++var4) {
				var20 = Players.Players_indices[var4];
				if ((Players.field1311[var20] & 1) != 0) {
					if (var3 > 0) {
						--var3;
						var10000 = Players.field1311;
						var10000[var20] = ((byte) (var10000[var20] | 2));
					} else {
						var6 = var0.readBits(1);
						if (var6 == 0) {
							var8 = var0.readBits(2);
							if (var8 == 0) {
								var17 = 0;
							} else if (var8 == 1) {
								var17 = var0.readBits(5);
							} else if (var8 == 2) {
								var17 = var0.readBits(8);
							} else {
								var17 = var0.readBits(11);
							}
							var3 = var17;
							var10000 = Players.field1311;
							var10000[var20] = ((byte) (var10000[var20] | 2));
						} else {
							class14.readPlayerUpdate(var0, var20);
						}
					}
				}
			}
			var0.exportIndex();
			if (var3 != 0) {
				throw new RuntimeException();
			} else {
				var0.importIndex();
				for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
					var20 = Players.Players_emptyIndices[var4];
					if ((Players.field1311[var20] & 1) != 0) {
						if (var3 > 0) {
							--var3;
							var10000 = Players.field1311;
							var10000[var20] = ((byte) (var10000[var20] | 2));
						} else {
							var6 = var0.readBits(1);
							if (var6 == 0) {
								var8 = var0.readBits(2);
								if (var8 == 0) {
									var17 = 0;
								} else if (var8 == 1) {
									var17 = var0.readBits(5);
								} else if (var8 == 2) {
									var17 = var0.readBits(8);
								} else {
									var17 = var0.readBits(11);
								}
								var3 = var17;
								var10000 = Players.field1311;
								var10000[var20] = ((byte) (var10000[var20] | 2));
							} else if (ModelData0.updateExternalPlayer(var0, var20)) {
								var10000 = Players.field1311;
								var10000[var20] = ((byte) (var10000[var20] | 2));
							}
						}
					}
				}
				var0.exportIndex();
				if (var3 != 0) {
					throw new RuntimeException();
				} else {
					var0.importIndex();
					for (var4 = 0; var4 < Players.Players_emptyIdxCount; ++var4) {
						var20 = Players.Players_emptyIndices[var4];
						if ((Players.field1311[var20] & 1) == 0) {
							if (var3 > 0) {
								--var3;
								var10000 = Players.field1311;
								var10000[var20] = ((byte) (var10000[var20] | 2));
							} else {
								var6 = var0.readBits(1);
								if (var6 == 0) {
									var8 = var0.readBits(2);
									if (var8 == 0) {
										var17 = 0;
									} else if (var8 == 1) {
										var17 = var0.readBits(5);
									} else if (var8 == 2) {
										var17 = var0.readBits(8);
									} else {
										var17 = var0.readBits(11);
									}
									var3 = var17;
									var10000 = Players.field1311;
									var10000[var20] = ((byte) (var10000[var20] | 2));
								} else if (ModelData0.updateExternalPlayer(var0, var20)) {
									var10000 = Players.field1311;
									var10000[var20] = ((byte) (var10000[var20] | 2));
								}
							}
						}
					}
					var0.exportIndex();
					if (var3 != 0) {
						throw new RuntimeException();
					} else {
						Players.Players_count = 0;
						Players.Players_emptyIdxCount = 0;
						Player var5;
						for (var4 = 1; var4 < 2048; ++var4) {
							var10000 = Players.field1311;
							var10000[var4] = ((byte) (var10000[var4] >> 1));
							var5 = Client.players[var4];
							if (var5 != null) {
								Players.Players_indices[++Players.Players_count - 1] = var4;
							} else {
								Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var4;
							}
						}
						for (var3 = 0; var3 < Players.Players_pendingUpdateCount; ++var3) {
							var4 = Players.Players_pendingUpdateIndices[var3];
							var5 = Client.players[var4];
							var6 = var0.readUnsignedByte();
							if ((var6 & 128) != 0) {
								var6 += var0.readUnsignedByte() << 8;
							}
							byte var7 = class192.field2208.field2210;
							if ((var6 & 2048) != 0) {
								for (var8 = 0; var8 < 3; ++var8) {
									var5.actions[var8] = var0.readStringCp1252NullTerminated();
								}
							}
							int var11;
							int var12;
							int var15;
							if ((var6 & 4) != 0) {
								var8 = var0.readUnsignedShort();
								PlayerType var9 = ((PlayerType) (Actor.findEnumerated(SoundSystem.PlayerType_values(), var0.readUnsignedByteNeg())));
								boolean var10 = var0.readUnsignedByteNeg() == 1;
								var11 = var0.readUnsignedByte();
								var12 = var0.offset;
								if (var5.username != null && var5.appearance != null) {
									boolean var13 = false;
									if (var9.isUser && Player.friendSystem.isIgnored(var5.username)) {
										var13 = true;
									}
									if (!var13 && Client.field607 == 0 && !var5.isHidden) {
										Players.field1317.offset = 0;
										var0.readBytesAdd(Players.field1317.array, 0, var11);
										Players.field1317.offset = 0;
										String var14 = AbstractFont.escapeBrackets(ArchiveDiskAction.method5777(class134.method2904(Players.field1317)));
										var5.overheadText = var14.trim();
										var5.overheadTextColor = var8 >> 8;
										var5.overheadTextEffect = var8 & 255;
										var5.overheadTextCyclesRemaining = 150;
										var5.isAutoChatting = var10;
										var5.field1152 = var5 != class101.localPlayer && var9.isUser && "" != Client.field716 && var14.toLowerCase().indexOf(Client.field716) == -1;
										if (var9.isPrivileged) {
											var15 = (var10) ? 91 : 1;
										} else {
											var15 = (var10) ? 90 : 2;
										}
										if (var9.modIcon != -1) {
											class290.addGameMessage(var15, SecureRandomCallable.method2066(var9.modIcon) + var5.username.getName(), var14);
										} else {
											class290.addGameMessage(var15, var5.username.getName(), var14);
										}
									}
								}
								var0.offset = var12 + var11;
							}
							if ((var6 & 8192) != 0) {
								var5.spotAnimation = var0.readUnsignedShortAddLE();
								var8 = var0.readInt();
								var5.spotAnimationHeight = var8 >> 16;
								var5.field1178 = (var8 & 65535) + Client.cycle;
								var5.spotAnimationFrame = 0;
								var5.spotAnimationFrameCycle = 0;
								if (var5.field1178 > Client.cycle) {
									var5.spotAnimationFrame = -1;
								}
								if (var5.spotAnimation == 65535) {
									var5.spotAnimation = -1;
								}
							}
							if ((var6 & 1024) != 0) {
								var5.field1140 = var0.readByteSub();
								var5.field1182 = var0.readByte();
								var5.field1181 = var0.readByteSub();
								var5.field1183 = var0.readByteAdd();
								var5.field1184 = var0.readUnsignedShortLE() + Client.cycle;
								var5.field1194 = var0.readUnsignedShortAddLE() + Client.cycle;
								var5.field1186 = var0.readUnsignedShort();
								if (var5.field1088) {
									var5.field1140 += var5.tileX;
									var5.field1182 += var5.tileY;
									var5.field1181 += var5.tileX;
									var5.field1183 += var5.tileY;
									var5.pathLength = 0;
								} else {
									var5.field1140 += var5.pathX[0];
									var5.field1182 += var5.pathY[0];
									var5.field1181 += var5.pathX[0];
									var5.field1183 += var5.pathY[0];
									var5.pathLength = 1;
								}
								var5.field1203 = 0;
							}
							if ((var6 & 8) != 0) {
								var5.field1165 = var0.readUnsignedShortAdd();
								if (var5.pathLength == 0) {
									var5.orientation = var5.field1165;
									var5.field1165 = -1;
								}
							}
							if ((var6 & 256) != 0) {
								class192[] var16 = Players.field1304;
								class192[] var18 = new class192[]{ class192.field2212, class192.field2208, class192.field2209, class192.field2211 };
								var16[var4] = ((class192) (Actor.findEnumerated(var18, var0.readByteSub())));
							}
							if ((var6 & 1) != 0) {
								var5.overheadText = var0.readStringCp1252NullTerminated();
								if (var5.overheadText.charAt(0) == '~') {
									var5.overheadText = var5.overheadText.substring(1);
									class290.addGameMessage(2, var5.username.getName(), var5.overheadText);
								} else if (var5 == class101.localPlayer) {
									class290.addGameMessage(2, var5.username.getName(), var5.overheadText);
								}
								var5.isAutoChatting = false;
								var5.overheadTextColor = 0;
								var5.overheadTextEffect = 0;
								var5.overheadTextCyclesRemaining = 150;
							}
							if ((var6 & 2) != 0) {
								var8 = var0.readUnsignedShort();
								if (var8 == 65535) {
									var8 = -1;
								}
								var17 = var0.readUnsignedByteNeg();
								class65.performPlayerAnimation(var5, var8, var17);
							}
							if ((var6 & 32) != 0) {
								var8 = var0.readUnsignedByteSub();
								int var19;
								int var23;
								int var24;
								if (var8 > 0) {
									for (var17 = 0; var17 < var8; ++var17) {
										var11 = -1;
										var12 = -1;
										var24 = -1;
										var23 = var0.readUShortSmart();
										if (var23 == 32767) {
											var23 = var0.readUShortSmart();
											var12 = var0.readUShortSmart();
											var11 = var0.readUShortSmart();
											var24 = var0.readUShortSmart();
										} else if (var23 != 32766) {
											var12 = var0.readUShortSmart();
										} else {
											var23 = -1;
										}
										var19 = var0.readUShortSmart();
										var5.addHitSplat(var23, var12, var11, var24, Client.cycle, var19);
									}
								}
								var17 = var0.readUnsignedByteSub();
								if (var17 > 0) {
									for (var23 = 0; var23 < var17; ++var23) {
										var11 = var0.readUShortSmart();
										var12 = var0.readUShortSmart();
										if (var12 != 32767) {
											var24 = var0.readUShortSmart();
											var19 = var0.readUnsignedByteNeg();
											var15 = (var12 > 0) ? var0.readUnsignedByteNeg() : var19;
											var5.addHealthBar(var11, Client.cycle, var12, var24, var19, var15);
										} else {
											var5.removeHealthBar(var11);
										}
									}
								}
							}
							if ((var6 & 64) != 0) {
								var5.targetIndex = var0.readUnsignedShortLE();
								if (var5.targetIndex == 65535) {
									var5.targetIndex = -1;
								}
							}
							if ((var6 & 512) != 0) {
								var5.field1189 = Client.cycle + var0.readUnsignedShortLE();
								var5.field1135 = Client.cycle + var0.readUnsignedShortAddLE();
								var5.field1191 = var0.readByteNeg();
								var5.field1192 = var0.readByteSub();
								var5.field1193 = var0.readByteNeg();
								var5.field1133 = ((byte) (var0.readUnsignedByte()));
							}
							if ((var6 & 16384) != 0) {
								var7 = var0.readByteSub();
							}
							if ((var6 & 16) != 0) {
								var8 = var0.readUnsignedByte();
								byte[] var21 = new byte[var8];
								Buffer var26 = new Buffer(var21);
								var0.readBytesAdd(var21, 0, var8);
								Players.field1307[var4] = var26;
								var5.read(var26);
							}
							if (var5.field1088) {
								if (var7 == 127) {
									var5.resetPath(var5.tileX, var5.tileY);
								} else {
									class192 var25;
									if (var7 != class192.field2208.field2210) {
										class192[] var22 = new class192[]{ class192.field2212, class192.field2208, class192.field2209, class192.field2211 };
										var25 = ((class192) (Actor.findEnumerated(var22, var7)));
									} else {
										var25 = Players.field1304[var4];
									}
									var5.method2139(var5.tileX, var5.tileY, var25);
								}
							}
						}
						if (var0.offset - var2 != var1) {
							throw new RuntimeException(var0.offset - var2 + " " + var1);
						}
					}
				}
			}
		}
	}
}