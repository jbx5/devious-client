import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -227316761
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -526627409
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("aj")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -928426009
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 493218289
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1427353479
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1883916637
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -804506783
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1067051769
	)
	int field1128;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -762257201
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1969000863
	)
	int field1130;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 453202295
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 950609833
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1925049089
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1321984477
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("as")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1196811517
	)
	@Export("team")
	int team;
	@ObfuscatedName("at")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 661219069
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1676236885
	)
	@Export("index")
	int index;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("be")
	boolean field1144;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -277668463
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -222891375
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("worldView")
	WorldView worldView;

	Player() {
		this.headIconPk = -1;
		this.headIconPrayer = -1;
		this.actions = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.actions[var1] = "";
		}

		this.combatLevel = 0;
		this.skillLevel = 0;
		this.animationCycleStart = 0;
		this.animationCycleEnd = 0;
		this.isUnanimated = false;
		this.team = 0;
		this.isHidden = false;
		this.isFriendTriBool = TriBool.TriBool_unknown;
		this.isInFriendsChat = TriBool.TriBool_unknown;
		this.isInClanChat = TriBool.TriBool_unknown;
		this.field1144 = false;
		this.worldView = class511.topLevelWorldView;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class353.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : class353.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2476(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field1128 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1130 * 4096 - super.y);
						if (super.orientation == 512) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var5.rotateY90Ccw();
						}

						Model[] var6 = new Model[]{var3, var5};
						var3 = new Model(var6, 2);
						if (super.orientation == 512) {
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
							var5.rotateY90Ccw();
						}

						var5.offsetBy(super.x - this.field1128 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1130 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1239 != 0 && Client.cycle >= super.field1251 && Client.cycle < super.field1215) {
					var3.overrideHue = super.field1223;
					var3.overrideSaturation = super.field1254;
					var3.overrideLuminance = super.field1255;
					var3.overrideAmount = super.field1239;
					var3.field3156 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "572565498"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		byte var2 = var1.readByte();
		boolean var3 = true;
		this.headIconPk = var1.readByte();
		this.headIconPrayer = var1.readByte();
		int var4 = -1;
		this.team = 0;
		int[] var5 = new int[12];

		int var7;
		int var8;
		int var9;
		for (int var6 = 0; var6 < 12; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 == 0) {
				var5[var6] = 0;
			} else {
				var8 = var1.readUnsignedByte();
				var5[var6] = var8 + (var7 << 8);
				if (var6 == 0 && var5[0] == 65535) {
					var4 = var1.readUnsignedShort();
					break;
				}

				if (var5[var6] >= 512) {
					var9 = class164.ItemDefinition_get(var5[var6] - 512).team;
					if (var9 != 0) {
						this.team = var9;
					}
				}
			}
		}

		int[] var13 = new int[12];

		for (var7 = 0; var7 < 12; ++var7) {
			var8 = var1.readUnsignedByte();
			if (var8 == 0) {
				var13[var7] = 0;
			} else {
				var9 = var1.readUnsignedByte();
				var13[var7] = var9 + (var8 << 8);
			}
		}

		int[] var14 = new int[5];

		for (var8 = 0; var8 < 5; ++var8) {
			var9 = var1.readUnsignedByte();
			if (var9 < 0 || var9 >= class105.field1371[var8].length) {
				var9 = 0;
			}

			var14[var8] = var9;
		}

		super.idleSequence = var1.readUnsignedShort();
		if (super.idleSequence == 65535) {
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort();
		if (super.turnLeftSequence == 65535) {
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence;
		super.walkSequence = var1.readUnsignedShort();
		if (super.walkSequence == 65535) {
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort();
		if (super.walkBackSequence == 65535) {
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort();
		if (super.walkLeftSequence == 65535) {
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort();
		if (super.walkRightSequence == 65535) {
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort();
		if (super.runSequence == 65535) {
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), Projectile.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2412();
		if (this == SoundCache.localPlayer) {
			RunException.field5518 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		PlayerCompositionColorTextureOverride[] var15 = null;
		boolean var17 = false;
		int var10 = var1.readUnsignedShort();
		var17 = (var10 >> 15 & 1) == 1;
		int var11;
		if (var10 > 0 && var10 != 32768) {
			var15 = new PlayerCompositionColorTextureOverride[12];

			for (var11 = 0; var11 < 12; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) {
					var15[var11] = class216.method4192(var5[var11] - 512, var1);
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) {
			this.actions[var11] = var1.readStringCp1252NullTerminated();
		}

		byte var16 = var1.readByte();
		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method6572(var13, var5, var15, var17, var14, var2, var4, var16);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "24542"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-80"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1848612579"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class135.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1947378964"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1252838484"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1302191943"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = Decimator.friendsChat != null && Decimator.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "866332921"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3409(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
	)
	void method2412() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1671772168"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1621403048"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class76.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lde;IILjb;B)V",
		garbageValue = "14"
	)
	final void method2437(WorldView var1, int var2, int var3, class238 var4) {
		if (super.sequence != -1 && class353.SequenceDefinition_get(super.sequence).field2283 == 1) {
			super.sequence = -1;
		}

		this.method2485();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == class238.field2509) {
					Player var5 = this;
					class238 var6 = class238.field2509;
					int var7 = super.pathX[0];
					int var8 = super.pathY[0];
					int var9 = this.transformedSize();
					if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && var2 >= var9 && var2 < 104 - var9 && var3 >= var9 && var3 < 104 - var9) {
						int var10 = Client.field520.method4512(var7, var8, this.transformedSize(), Timer.method8348(var2, var3), var1.collisionMaps[this.plane], true, Client.field641, Client.field671);
						if (var10 >= 1) {
							for (int var11 = 0; var11 < var10 - 1; ++var11) {
								var5.method2418(Client.field641[var11], Client.field671[var11], var6);
							}
						}
					}
				}

				this.method2418(var2, var3, var4);
			} else {
				this.resetPath(var2, var3);
			}
		} else {
			this.resetPath(var2, var3);
		}

	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-17"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1265 = 0;
		super.field1264 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IILjb;B)V",
		garbageValue = "-20"
	)
	final void method2418(int var1, int var2, class238 var3) {
		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) {
			super.pathX[var4] = super.pathX[var4 - 1];
			super.pathY[var4] = super.pathY[var4 - 1];
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1];
		}

		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.pathTraversed[0] = var3;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1756478951"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BB)Ljava/lang/String;",
		garbageValue = "64"
	)
	@Export("base64Encode")
	public static String base64Encode(byte[] var0) {
		int var2 = var0.length;
		StringBuilder var3 = new StringBuilder();

		for (int var4 = 0; var4 < var2 + 0; var4 += 3) {
			int var5 = var0[var4] & 255;
			var3.append(class414.field4669[var5 >>> 2]);
			if (var4 < var2 - 1) {
				int var6 = var0[var4 + 1] & 255;
				var3.append(class414.field4669[(var5 & 3) << 4 | var6 >>> 4]);
				if (var4 < var2 - 2) {
					int var7 = var0[var4 + 2] & 255;
					var3.append(class414.field4669[(var6 & 15) << 2 | var7 >>> 6]).append(class414.field4669[var7 & 63]);
				} else {
					var3.append(class414.field4669[(var6 & 15) << 2]).append("=");
				}
			} else {
				var3.append(class414.field4669[(var5 & 3) << 4]).append("==");
			}
		}

		String var1 = var3.toString();
		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "12"
	)
	static int method2462(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-15"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4830) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4844) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4837) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4828) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field4835 < ByteArrayPool.field4839) {
				ByteArrayPool.field4843[++ByteArrayPool.field4835 - 1] = var0;
			} else {
				if (HttpRequestTask.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < class153.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == class153.ByteArrayPool_alternativeSizes[var2] && class450.ByteArrayPool_altSizeArrayCounts[var2] < HttpRequestTask.ByteArrayPool_arrays[var2].length) {
							HttpRequestTask.ByteArrayPool_arrays[var2][class450.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Lue;B)Ljava/lang/Object;",
		garbageValue = "-13"
	)
	static Object method2461(class534 var0) {
		if (var0 == null) {
			throw new IllegalStateException("popValueOfType() failure - null baseVarType");
		} else {
			switch(var0.field5287) {
			case 0:
				return Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			case 1:
				return Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type");
			}
		}
	}
}
