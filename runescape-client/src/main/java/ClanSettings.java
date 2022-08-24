import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("eh")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("h")
	@Export("useHashes")
	boolean useHashes;

	@ObfuscatedName("w")
	@Export("useNames")
	boolean useNames;

	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = -6876764368805247545L)
	long field1602;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1040141595)
	int field1603 = 0;

	@ObfuscatedName("q")
	@Export("name")
	public String name = null;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -1527353311)
	int field1605 = 0;

	@ObfuscatedName("k")
	@Export("allowGuests")
	public boolean allowGuests;

	@ObfuscatedName("o")
	public byte field1606;

	@ObfuscatedName("n")
	public byte field1599;

	@ObfuscatedName("d")
	public byte field1615;

	@ObfuscatedName("a")
	public byte field1610;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = -1915205487)
	@Export("memberCount")
	public int memberCount;

	@ObfuscatedName("u")
	@Export("memberHashes")
	long[] memberHashes;

	@ObfuscatedName("l")
	@Export("memberRanks")
	public byte[] memberRanks;

	@ObfuscatedName("z")
	@Export("sortedMembers")
	int[] sortedMembers;

	@ObfuscatedName("r")
	int[] field1617;

	@ObfuscatedName("y")
	public int[] field1616;

	@ObfuscatedName("p")
	public boolean[] field1619;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 857724597)
	@Export("currentOwner")
	public int currentOwner = -1;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = -275598333)
	public int field1608 = -1;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -756344105)
	@Export("bannedMemberCount")
	public int bannedMemberCount;

	@ObfuscatedName("f")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;

	@ObfuscatedName("t")
	@Export("memberNames")
	public String[] memberNames;

	@ObfuscatedName("j")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lpm;")
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(descriptor = "(Lqr;)V")
	public ClanSettings(Buffer var1) {
		this.method2918(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "45")
	void method2899(int var1) {
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
		if (this.field1617 != null) {
			System.arraycopy(this.field1617, 0, this.field1617 = new int[var1], 0, this.memberCount);
		} else {
			this.field1617 = new int[var1];
		}
		if (this.field1616 != null) {
			System.arraycopy(this.field1616, 0, this.field1616 = new int[var1], 0, this.memberCount);
		} else {
			this.field1616 = new int[var1];
		}
		if (this.field1619 != null) {
			System.arraycopy(this.field1619, 0, this.field1619 = new boolean[var1], 0, this.memberCount);
		} else {
			this.field1619 = new boolean[var1];
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-480172131")
	void method2900(int var1) {
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I", garbageValue = "-86")
	public int method2901(String var1) {
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIIB)I", garbageValue = "115")
	public int method2915(int var1, int var2, int var3) {
		int var4 = (var3 == 31) ? -1 : (1 << var3 + 1) - 1;
		return (this.field1617[var1] & var4) >>> var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/Integer;", garbageValue = "-862731127")
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) {
			return null;
		} else {
			Node var2 = this.parameters.get(((long) (var1)));
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode) (var2)).integer) : null;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)[I", garbageValue = "1735554841")
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
			PlayerType.method5694(var1, var3, 0, var1.length - 1);
		}
		return this.sortedMembers;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(JLjava/lang/String;II)V", garbageValue = "1531827343")
	void method2955(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}
		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) {
				this.method2899(this.memberCount + 5);
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
			this.field1617[this.memberCount] = 0;
			this.field1616[this.memberCount] = var4;
			this.field1619[this.memberCount] = false;
			++this.memberCount;
			this.sortedMembers = null;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-307358890")
	void method2906(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) {
			--this.memberCount;
			this.sortedMembers = null;
			if (this.memberCount == 0) {
				this.memberHashes = null;
				this.memberNames = null;
				this.memberRanks = null;
				this.field1617 = null;
				this.field1616 = null;
				this.field1619 = null;
				this.currentOwner = -1;
				this.field1608 = -1;
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
				System.arraycopy(this.field1617, var1 + 1, this.field1617, var1, this.memberCount - var1);
				System.arraycopy(this.field1616, var1 + 1, this.field1616, var1, this.memberCount - var1);
				System.arraycopy(this.field1619, var1 + 1, this.field1619, var1, this.memberCount - var1);
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "1")
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) {
			this.currentOwner = -1;
			this.field1608 = -1;
		} else {
			this.currentOwner = -1;
			this.field1608 = -1;
			int var1 = 0;
			byte var2 = this.memberRanks[0];
			for (int var3 = 1; var3 < this.memberCount; ++var3) {
				if (this.memberRanks[var3] > var2) {
					if (var2 == 125) {
						this.field1608 = var1;
					}
					var1 = var3;
					var2 = this.memberRanks[var3];
				} else if (this.field1608 == -1 && this.memberRanks[var3] == 125) {
					this.field1608 = var3;
				}
			}
			this.currentOwner = var1;
			if (this.currentOwner != -1) {
				this.memberRanks[this.currentOwner] = 126;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(JLjava/lang/String;I)V", garbageValue = "-1575850225")
	void method2908(long var1, String var3) {
		if (var3 != null && var3.length() == 0) {
			var3 = null;
		}
		if (var1 > 0L != this.useHashes) {
			throw new RuntimeException("");
		} else if (var3 != null != this.useNames) {
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) {
				this.method2900(this.bannedMemberCount + 5);
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
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-791090337")
	void method2942(int var1) {
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(IBI)I", garbageValue = "292758535")
	int method2910(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) {
			if (this.currentOwner == var1 && (this.field1608 == -1 || this.memberRanks[this.field1608] < 125)) {
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "694670194")
	boolean method2935(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) {
			this.memberRanks[this.currentOwner] = 125;
			this.field1608 = this.currentOwner;
			this.memberRanks[var1] = 126;
			this.currentOwner = var1;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IZI)I", garbageValue = "1021729166")
	int method2913(int var1, boolean var2) {
		if (this.field1619[var1] == var2) {
			return -1;
		} else {
			this.field1619[var1] = var2;
			return var1;
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(IIIII)I", garbageValue = "-433175497")
	int method2937(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1;
		int var6 = (var4 == 31) ? -1 : (1 << var4 + 1) - 1;
		int var7 = var6 ^ var5;
		var2 <<= var3;
		var2 &= var7;
		int var8 = this.field1617[var1];
		if ((var8 & var7) == var2) {
			return -1;
		} else {
			var8 &= ~var7;
			this.field1617[var1] = var8 | var2;
			return var1;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(IIB)Z", garbageValue = "-14")
	boolean method2914(int var1, int var2) {
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(IIIII)Z", garbageValue = "-1944379283")
	boolean method2960(int var1, int var2, int var3, int var4) {
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
	boolean method2916(int var1, long var2) {
		if (this.parameters != null) {
			Node var4 = this.parameters.get(((long) (var1)));
			if (var4 != null) {
				if (var4 instanceof class408) {
					class408 var5 = ((class408) (var4));
					if (var5.field4465 == var2) {
						return false;
					}
					var5.field4465 = var2;
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)Z", garbageValue = "87")
	boolean method2966(int var1, String var2) {
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "1388510046")
	void method2918(Buffer var1) {
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
			this.field1603 = var1.readInt();
			this.field1605 = var1.readInt();
			if (var2 <= 3 && this.field1605 != 0) {
				this.field1605 += 16912800;
			}
			this.memberCount = var1.readUnsignedShort();
			this.bannedMemberCount = var1.readUnsignedByte();
			this.name = var1.readStringCp1252NullTerminated();
			if (var2 >= 4) {
				var1.readInt();
			}
			this.allowGuests = var1.readUnsignedByte() == 1;
			this.field1606 = var1.readByte();
			this.field1599 = var1.readByte();
			this.field1615 = var1.readByte();
			this.field1610 = var1.readByte();
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
				if (this.field1617 == null || this.field1617.length < this.memberCount) {
					this.field1617 = new int[this.memberCount];
				}
				if (this.field1616 == null || this.field1616.length < this.memberCount) {
					this.field1616 = new int[this.memberCount];
				}
				if (this.field1619 == null || this.field1619.length < this.memberCount) {
					this.field1619 = new boolean[this.memberCount];
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
						this.field1617[var4] = var1.readInt();
					}
					if (var2 >= 5) {
						this.field1616[var4] = var1.readUnsignedShort();
					} else {
						this.field1616[var4] = 0;
					}
					if (var2 >= 6) {
						this.field1619[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1619[var4] = false;
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
					this.parameters = new IterableNodeHashTable(var4 < 16 ? WorldMapDecoration.method4914(var4) : 16);
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1219209452")
	public static int method2909(int var0) {
		return var0 >>> 4 & class439.field4687;
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "23663686")
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field706 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}
		if (Canvas.getWindowedMode() == 1) {
			AbstractByteArrayCopier.client.setMaxCanvasSize(765, 503);
		} else {
			AbstractByteArrayCopier.client.setMaxCanvasSize(7680, 2160);
		}
		if (Client.gameState >= 25) {
			PacketBufferNode var1 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(Canvas.getWindowedMode());
			var1.packetBuffer.writeShort(class7.canvasWidth);
			var1.packetBuffer.writeShort(WallDecoration.canvasHeight);
			Client.packetWriter.addNode(var1);
		}
	}
}