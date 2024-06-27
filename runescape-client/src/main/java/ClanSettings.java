import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("ad")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("ag")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -3246048372211759241L
	)
	long field1761;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -484263669
	)
	public int field1762;
	@ObfuscatedName("an")
	@Export("name")
	public String name;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1385578651
	)
	int field1780;
	@ObfuscatedName("av")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("ab")
	public byte field1766;
	@ObfuscatedName("ai")
	public byte field1767;
	@ObfuscatedName("ae")
	public byte field1768;
	@ObfuscatedName("au")
	public byte field1769;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1500532859
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("az")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("ax")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("ac")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("al")
	int[] field1783;
	@ObfuscatedName("ay")
	@Export("memberJoinDates")
	public int[] memberJoinDates;
	@ObfuscatedName("ao")
	public boolean[] field1776;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -481044237
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 196306029
	)
	public int field1784;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -53757351
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("at")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("af")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("am")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1762 = 0;
		this.name = null;
		this.field1780 = 0;
		this.currentOwner = -1;
		this.field1784 = -1;
		this.method3368(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	void method3349(int var1) {
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

		if (this.field1783 != null) {
			System.arraycopy(this.field1783, 0, this.field1783 = new int[var1], 0, this.memberCount);
		} else {
			this.field1783 = new int[var1];
		}

		if (this.memberJoinDates != null) {
			System.arraycopy(this.memberJoinDates, 0, this.memberJoinDates = new int[var1], 0, this.memberCount);
		} else {
			this.memberJoinDates = new int[var1];
		}

		if (this.field1776 != null) {
			System.arraycopy(this.field1776, 0, this.field1776 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1776 = new boolean[var1];
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "912447472"
	)
	void method3400(int var1) {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1466774188"
	)
	public int method3409(String var1) {
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "984884395"
	)
	public int method3352(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
		return (this.field1783[var1] & var4) >>> var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Integer;",
		garbageValue = "124"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1);
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-600541897"
	)
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

			VarcInt.method3622(var1, this.sortedMembers);
		}

		return this.sortedMembers;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;II)V",
		garbageValue = "-1425776835"
	)
	void method3378(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method3349(this.memberCount + 5);
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

			this.field1783[this.memberCount] = 0;
			this.memberJoinDates[this.memberCount] = var4;
			this.field1776[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1767433643"
	)
	void method3390(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1783 = null;
				this.memberJoinDates = null;
				this.field1776 = null;
				this.currentOwner = -1;
				this.field1784 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1783, var1 + 1, this.field1783, var1, this.memberCount - var1);
				System.arraycopy(this.memberJoinDates, var1 + 1, this.memberJoinDates, var1, this.memberCount - var1);
				System.arraycopy(this.field1776, var1 + 1, this.field1776, var1, this.memberCount - var1);
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1508663532"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1784 = -1;
		} else {
			this.currentOwner = -1;
			this.field1784 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];

			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1784 = var1;
					}

					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if (this.field1784 == -1 && this.memberRanks[var3] == 125) {
					this.field1784 = var3;
				}
			}

			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "-775605005"
	)
	void method3358(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) {
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method3400(this.bannedMemberCount + 5);
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1361843074"
	)
	void method3359(int var1) {
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IBB)I",
		garbageValue = "0"
	)
	int method3360(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.currentOwner == var1 && (this.field1784 == -1 || this.memberRanks[this.field1784] < 125)) {
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1754060365"
	)
	boolean method3369(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
			this.memberRanks[this.currentOwner] = 125;
			this.field1784 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1337873398"
	)
	int method3348(int var1, boolean var2) {
		if (this.field1776[var1] == var2) {
			return -1;
		} else {
			this.field1776[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1838665076"
	)
	int method3363(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1783[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1783[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "6"
	)
	boolean method3364(int var1, int var2) {
		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof IntegerNode) {
					IntegerNode var4 = (IntegerNode)var3;
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

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "-1315727361"
	)
	boolean method3365(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		if (this.parameters != null) {
			Node var8 = this.parameters.get((long)var1);
			if (var8 != null) {
				if (var8 instanceof IntegerNode) {
					IntegerNode var9 = (IntegerNode)var8;
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

		this.parameters.put(new IntegerNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("ay")
	boolean method3366(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get((long)var1);
			if (var4 != null) {
				if (var4 instanceof class502) {
					class502 var5 = (class502)var4;
					if (var5.field5078 == var2) {
						return false;
					}

					var5.field5078 = var2;
					return true;
				}

				var4.remove();
			}
		} else {
			this.parameters = new IterableNodeHashTable(4);
		}

		this.parameters.put(new class502(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)Z",
		garbageValue = "32"
	)
	boolean method3367(int var1, String var2) {
		if (var2 == null) {
			var2 = "";
		} else if (var2.length() > 80) {
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) {
			Node var3 = this.parameters.get((long)var1);
			if (var3 != null) {
				if (var3 instanceof ObjectNode) {
					ObjectNode var4 = (ObjectNode)var3;
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

		this.parameters.put(new ObjectNode(var2), (long)var1);
		return true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "1738111883"
	)
	void method3368(Buffer var1) {
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

			this.field1762 = var1.readInt();
			this.field1780 = var1.readInt();
			if (var2 <= 3 && this.field1780 != 0) {
				this.field1780 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}

			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field1766 = var1.readByte();
			this.field1767 = var1.readByte();
			this.field1768 = var1.readByte();
			this.field1769 = var1.readByte();
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

				if (this.field1783 == null || this.field1783.length < this.memberCount) {
					this.field1783 = new int[this.memberCount];
				}

				if (this.memberJoinDates == null || this.memberJoinDates.length < this.memberCount) {
					this.memberJoinDates = new int[this.memberCount];
				}

				if (this.field1776 == null || this.field1776.length < this.memberCount) {
					this.field1776 = new boolean[this.memberCount];
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
						this.field1783[var4] = var1.readInt();
					}

					if (var2 >= 5) {
						this.memberJoinDates[var4] = var1.readUnsignedShort();
					} else {
						this.memberJoinDates[var4] = 0;
					}

					if (var2 >= 6) {
						this.field1776[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1776[var4] = false;
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
					this.parameters = new IterableNodeHashTable(var4 < 16 ? ModeWhere.method7432(var4) : 16);

					while (var4-- > 0) {
						int var5 = var1.readInt();
						int var6 = var5 & 1073741823;
						int var7 = var5 >>> 30;
						if (var7 == 0) {
							int var12 = var1.readInt();
							this.parameters.put(new IntegerNode(var12), (long)var6);
						} else if (var7 == 1) {
							long var10 = var1.readLong();
							this.parameters.put(new class502(var10), (long)var6);
						} else if (var7 == 2) {
							String var8 = var1.readStringCp1252NullTerminated();
							this.parameters.put(new ObjectNode(var8), (long)var6);
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	}

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1362825433"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class170.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeIntME(var0);
		var2.packetBuffer.writeShortAddLE(var1);
		Client.packetWriter.addNode(var2);
	}
}
