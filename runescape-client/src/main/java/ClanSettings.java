import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("nj")
	@ObfuscatedGetter(
		intValue = 1324480919
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("p")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("f")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = 7566432724483654547L
	)
	long field1626;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -932928373
	)
	int field1630;
	@ObfuscatedName("w")
	@Export("name")
	public String name;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 521774671
	)
	int field1646;
	@ObfuscatedName("q")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("m")
	public byte field1631;
	@ObfuscatedName("x")
	public byte field1632;
	@ObfuscatedName("j")
	public byte field1633;
	@ObfuscatedName("v")
	public byte field1634;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1576004075
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("t")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("u")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("d")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("b")
	int[] field1629;
	@ObfuscatedName("a")
	public int[] field1640;
	@ObfuscatedName("l")
	public boolean[] field1642;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1472859357
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 310521131
	)
	public int field1643;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1919519021
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("i")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("r")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("z")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lqq;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1630 = 0; // L: 14
		this.name = null; // L: 15
		this.field1646 = 0; // L: 16
		this.currentOwner = -1; // L: 29
		this.field1643 = -1; // L: 30
		this.method3130(var1); // L: 43
	} // L: 44

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "19"
	)
	void method3111(int var1) {
		if (this.useHashes) { // L: 47
			if (this.memberHashes != null) { // L: 48
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1]; // L: 49
			}
		}

		if (this.useNames) { // L: 51
			if (this.memberNames != null) { // L: 52
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1]; // L: 53
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount); // L: 55
		} else {
			this.memberRanks = new byte[var1]; // L: 56
		}

		if (this.field1629 != null) { // L: 57
			System.arraycopy(this.field1629, 0, this.field1629 = new int[var1], 0, this.memberCount);
		} else {
			this.field1629 = new int[var1]; // L: 58
		}

		if (this.field1640 != null) { // L: 59
			System.arraycopy(this.field1640, 0, this.field1640 = new int[var1], 0, this.memberCount);
		} else {
			this.field1640 = new int[var1]; // L: 60
		}

		if (this.field1642 != null) { // L: 61
			System.arraycopy(this.field1642, 0, this.field1642 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1642 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1226282598"
	)
	void method3124(int var1) {
		if (this.useHashes) { // L: 66
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount); // L: 67
			} else {
				this.bannedMemberHashes = new long[var1]; // L: 68
			}
		}

		if (this.useNames) { // L: 70
			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount); // L: 71
			} else {
				this.bannedMemberNames = new String[var1]; // L: 72
			}
		}

	} // L: 74

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-719556115"
	)
	public int method3134(String var1) {
		if (var1 != null && var1.length() != 0) { // L: 77
			for (int var2 = 0; var2 < this.memberCount; ++var2) { // L: 78
				if (this.memberNames[var2].equals(var1)) { // L: 79
					return var2;
				}
			}

			return -1; // L: 81
		} else {
			return -1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-640575618"
	)
	public int method3149(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1629[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "-1472451813"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) { // L: 90
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1); // L: 91
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null; // L: 92 93
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1232294683"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 97
			String[] var1 = new String[this.memberCount]; // L: 98
			this.sortedMembers = new int[this.memberCount]; // L: 99

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) { // L: 100 103
				var1[var2] = this.memberNames[var2]; // L: 101
				if (var1[var2] != null) { // L: 102
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			HealthBar.method2495(var1, this.sortedMembers); // L: 105
		}

		return this.sortedMembers; // L: 107
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;IB)V",
		garbageValue = "-62"
	)
	void method3117(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 111
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 112
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 113
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 114
				this.method3111(this.memberCount + 5);
			}

			if (this.memberHashes != null) { // L: 115
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) { // L: 116
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) { // L: 117
				this.currentOwner = this.memberCount; // L: 118
				this.memberRanks[this.memberCount] = 126; // L: 119
			} else {
				this.memberRanks[this.memberCount] = 0; // L: 122
			}

			this.field1629[this.memberCount] = 0; // L: 124
			this.field1640[this.memberCount] = var4; // L: 125
			this.field1642[this.memberCount] = false; // L: 126
			++this.memberCount; // L: 127
			this.sortedMembers = null; // L: 128
		}
	} // L: 129

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2094091099"
	)
	void method3146(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 132
			--this.memberCount; // L: 133
			this.sortedMembers = null; // L: 134
			if (this.memberCount == 0) { // L: 135
				this.memberHashes = null; // L: 136
				this.memberNames = null; // L: 137
				this.memberRanks = null; // L: 138
				this.field1629 = null; // L: 139
				this.field1640 = null; // L: 140
				this.field1642 = null; // L: 141
				this.currentOwner = -1; // L: 142
				this.field1643 = -1; // L: 143
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 146
				System.arraycopy(this.field1629, var1 + 1, this.field1629, var1, this.memberCount - var1); // L: 147
				System.arraycopy(this.field1640, var1 + 1, this.field1640, var1, this.memberCount - var1); // L: 148
				System.arraycopy(this.field1642, var1 + 1, this.field1642, var1, this.memberCount - var1); // L: 149
				if (this.memberHashes != null) { // L: 150
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) { // L: 151
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner(); // L: 152
			}

		} else {
			throw new RuntimeException("");
		}
	} // L: 154

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1432320371"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 157
			this.currentOwner = -1; // L: 158
			this.field1643 = -1; // L: 159
		} else {
			this.currentOwner = -1; // L: 162
			this.field1643 = -1; // L: 163
			int var1 = 0; // L: 164
			byte var2 = this.memberRanks[0]; // L: 165

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 166
				if (this.memberRanks[var3] > var2) { // L: 167
					if (var2 == 125) { // L: 168
						this.field1643 = var1;
					}

					var1 = var3; // L: 169
					var2 = this.memberRanks[var3]; // L: 170
				} else if (this.field1643 == -1 && this.memberRanks[var3] == 125) { // L: 172
					this.field1643 = var3; // L: 173
				}
			}

			this.currentOwner = var1; // L: 176
			if (this.currentOwner != -1) { // L: 177
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 160 178

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "-513965302"
	)
	void method3110(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 181
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) { // L: 182
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) { // L: 183
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 184
				this.method3124(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) { // L: 185
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) { // L: 186
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount; // L: 187
		}
	} // L: 188

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "25"
	)
	void method3121(int var1) {
		--this.bannedMemberCount; // L: 191
		if (this.bannedMemberCount == 0) { // L: 192
			this.bannedMemberHashes = null; // L: 193
			this.bannedMemberNames = null; // L: 194
		} else {
			if (this.bannedMemberHashes != null) { // L: 197
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1); // L: 198
			}
		}

	} // L: 200

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "-1625878834"
	)
	int method3151(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 203
			if (this.currentOwner == var1 && (this.field1643 == -1 || this.memberRanks[this.field1643] < 125)) { // L: 204
				return -1;
			} else if (this.memberRanks[var1] == var2) {
				return -1; // L: 205
			} else {
				this.memberRanks[var1] = var2; // L: 206
				this.updateOwner(); // L: 207
				return var1; // L: 208
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "16776960"
	)
	boolean method3123(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 212
			this.memberRanks[this.currentOwner] = 125; // L: 213
			this.field1643 = this.currentOwner; // L: 214
			this.memberRanks[var1] = 126; // L: 215
			this.currentOwner = var1; // L: 216
			return true; // L: 217
		} else {
			return false;
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "202463510"
	)
	int method3170(int var1, boolean var2) {
		if (this.field1642[var1] == var2) { // L: 221
			return -1;
		} else {
			this.field1642[var1] = var2; // L: 222
			return var1; // L: 223
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "331840261"
	)
	int method3125(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 227
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 228
		int var7 = var6 ^ var5; // L: 229
		var2 <<= var3; // L: 230
		var2 &= var7; // L: 231
		int var8 = this.field1629[var1]; // L: 232
		if ((var8 & var7) == var2) {
			return -1; // L: 233
		} else {
			var8 &= ~var7; // L: 234
			this.field1629[var1] = var8 | var2; // L: 235
			return var1; // L: 236
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1724333055"
	)
	boolean method3126(int var1, int var2) {
		if (this.parameters != null) { // L: 240
			Node var3 = this.parameters.get((long)var1); // L: 241
			if (var3 != null) { // L: 242
				if (var3 instanceof IntegerNode) { // L: 243
					IntegerNode var4 = (IntegerNode)var3; // L: 244
					if (var2 == var4.integer) { // L: 245
						return false;
					}

					var4.integer = var2; // L: 246
					return true; // L: 247
				}

				var3.remove(); // L: 249
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 252
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 253
		return true; // L: 254
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-2107514164"
	)
	boolean method3160(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 258
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 259
		int var7 = var6 ^ var5; // L: 260
		var2 <<= var3; // L: 261
		var2 &= var7; // L: 262
		if (this.parameters != null) { // L: 263
			Node var8 = this.parameters.get((long)var1); // L: 264
			if (var8 != null) { // L: 265
				if (var8 instanceof IntegerNode) { // L: 266
					IntegerNode var9 = (IntegerNode)var8; // L: 267
					if ((var9.integer & var7) == var2) { // L: 268
						return false;
					}

					var9.integer &= ~var7; // L: 269
					var9.integer |= var2; // L: 270
					return true; // L: 271
				}

				var8.remove(); // L: 273
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 276
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 277
		return true; // L: 278
	}

	@ObfuscatedName("a")
	boolean method3128(int var1, long var2) {
		if (this.parameters != null) { // L: 282
			Node var4 = this.parameters.get((long)var1); // L: 283
			if (var4 != null) { // L: 284
				if (var4 instanceof class409) { // L: 285
					class409 var5 = (class409)var4; // L: 286
					if (var5.field4501 == var2) { // L: 287
						return false;
					}

					var5.field4501 = var2; // L: 288
					return true; // L: 289
				}

				var4.remove(); // L: 291
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 294
		}

		this.parameters.put(new class409(var2), (long)var1); // L: 295
		return true; // L: 296
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "-1240810922"
	)
	boolean method3129(int var1, String var2) {
		if (var2 == null) { // L: 300
			var2 = "";
		} else if (var2.length() > 80) { // L: 301
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) { // L: 302
			Node var3 = this.parameters.get((long)var1); // L: 303
			if (var3 != null) { // L: 304
				if (var3 instanceof ObjectNode) { // L: 305
					ObjectNode var4 = (ObjectNode)var3; // L: 306
					if (var4.obj instanceof String) { // L: 307
						if (var2.equals(var4.obj)) { // L: 308
							return false;
						}

						var4.remove(); // L: 309
						this.parameters.put(new ObjectNode(var2), var4.key); // L: 310
						return true; // L: 311
					}
				}

				var3.remove(); // L: 314
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 317
		}

		this.parameters.put(new ObjectNode(var2), (long)var1); // L: 318
		return true; // L: 319
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "1484016465"
	)
	void method3130(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 323
		if (var2 >= 1 && var2 <= 6) { // L: 324
			int var3 = var1.readUnsignedByte(); // L: 325
			if ((var3 & 1) != 0) { // L: 326
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) { // L: 327
				this.useNames = true;
			}

			if (!this.useHashes) { // L: 328
				this.memberHashes = null; // L: 329
				this.bannedMemberHashes = null; // L: 330
			}

			if (!this.useNames) { // L: 332
				this.memberNames = null; // L: 333
				this.bannedMemberNames = null; // L: 334
			}

			this.field1630 = var1.readInt(); // L: 336
			this.field1646 = var1.readInt(); // L: 337
			if (var2 <= 3 && this.field1646 != 0) { // L: 338
				this.field1646 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 339
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 340
			this.name = var1.readStringCp1252NullTerminated(); // L: 341
			if (var2 >= 4) { // L: 342
				var1.readInt(); // L: 343
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 345
			this.field1631 = var1.readByte(); // L: 346
			this.field1632 = var1.readByte(); // L: 347
			this.field1633 = var1.readByte(); // L: 348
			this.field1634 = var1.readByte(); // L: 349
			int var4;
			if (this.memberCount > 0) { // L: 350
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) { // L: 351
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) { // L: 352
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) { // L: 353
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1629 == null || this.field1629.length < this.memberCount) { // L: 354
					this.field1629 = new int[this.memberCount];
				}

				if (this.field1640 == null || this.field1640.length < this.memberCount) { // L: 355
					this.field1640 = new int[this.memberCount];
				}

				if (this.field1642 == null || this.field1642.length < this.memberCount) { // L: 356
					this.field1642 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) { // L: 357
					if (this.useHashes) { // L: 358
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 359
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte(); // L: 360
					if (var2 >= 2) { // L: 361
						this.field1629[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 362
						this.field1640[var4] = var1.readUnsignedShort();
					} else {
						this.field1640[var4] = 0; // L: 363
					}

					if (var2 >= 6) { // L: 364
						this.field1642[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1642[var4] = false; // L: 365
					}
				}

				this.updateOwner(); // L: 367
			}

			if (this.bannedMemberCount > 0) { // L: 369
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) { // L: 370
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) { // L: 371
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) { // L: 372
					if (this.useHashes) { // L: 373
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 374
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) { // L: 377
				var4 = var1.readUnsignedShort(); // L: 378
				if (var4 > 0) { // L: 379
					this.parameters = new IterableNodeHashTable(var4 < 16 ? ClanChannel.method3285(var4) : 16); // L: 380

					while (var4-- > 0) { // L: 381
						int var5 = var1.readInt(); // L: 382
						int var6 = var5 & 1073741823; // L: 383
						int var7 = var5 >>> 30; // L: 384
						if (var7 == 0) { // L: 385
							int var12 = var1.readInt(); // L: 386
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 387
						} else if (var7 == 1) { // L: 389
							long var10 = var1.readLong(); // L: 390
							this.parameters.put(new class409(var10), (long)var6); // L: 391
						} else if (var7 == 2) { // L: 393
							String var8 = var1.readStringCp1252NullTerminated(); // L: 394
							this.parameters.put(new ObjectNode(var8), (long)var6); // L: 395
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 400
}
