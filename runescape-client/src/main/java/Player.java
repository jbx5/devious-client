import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 705058777
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -655208045
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ah")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 717357905
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1475633805
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1230774301
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1211807355
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1205139423
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1265071943
	)
	int field1128;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 427522145
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1144913977
	)
	int field1120;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 792641499
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1281314063
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1291269797
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1864918055
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aw")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2081171671
	)
	@Export("team")
	int team;
	@ObfuscatedName("az")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 76401299
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1863872583
	)
	@Export("index")
	int index;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("by")
	boolean field1124;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1065834017
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -435330525
	)
	@Export("tileY")
	int tileY;

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
		this.field1124 = false;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "16"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		int var2 = var1.readUnsignedByte();
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
					var9 = class214.ItemDefinition_get(var5[var6] - 512).team;
					if (var9 != 0) {
						this.team = var9;
					}
				}
			}
		}

		int[] var26 = null;
		if (Client.revision >= 213) {
			var26 = new int[12];

			for (var7 = 0; var7 < 12; ++var7) {
				var8 = var1.readUnsignedByte();
				if (var8 == 0) {
					var26[var7] = 0;
				} else {
					var9 = var1.readUnsignedByte();
					var26[var7] = var9 + (var8 << 8);
				}
			}
		}

		int[] var27 = new int[5];

		for (var8 = 0; var8 < 5; ++var8) {
			var9 = var1.readUnsignedByte();
			if (var9 < 0 || var9 >= class104.field1342[var8].length) {
				var9 = 0;
			}

			var27[var8] = var9;
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class166.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2396();
		if (this == TextureProvider.localPlayer) {
			RunException.field5296 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		PlayerCompositionColorTextureOverride[] var28 = null;
		boolean var30 = false;
		int var10 = var1.readUnsignedShort();
		var30 = (var10 >> 15 & 1) == 1;
		int var11;
		if (var10 > 0 && var10 != 32768) {
			var28 = new PlayerCompositionColorTextureOverride[12];

			for (var11 = 0; var11 < 12; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) {
					int var16 = var5[var11] - 512;
					int var17 = var1.readUnsignedByte();
					boolean var18 = (var17 & 1) != 0;
					boolean var19 = (var17 & 2) != 0;
					PlayerCompositionColorTextureOverride var20 = new PlayerCompositionColorTextureOverride(var16);
					int var21;
					int[] var22;
					boolean var23;
					int var24;
					short var25;
					if (var18) {
						var21 = var1.readUnsignedByte();
						var22 = new int[]{var21 & 15, var21 >> 4 & 15};
						var23 = var20.playerCompositionRecolorTo != null && var22.length == var20.playerCompositionRecolorTo.length;

						for (var24 = 0; var24 < 2; ++var24) {
							if (var22[var24] != 15) {
								var25 = (short)var1.readUnsignedShort();
								if (var23) {
									var20.playerCompositionRecolorTo[var22[var24]] = var25;
								}
							}
						}
					}

					if (var19) {
						var21 = var1.readUnsignedByte();
						var22 = new int[]{var21 & 15, var21 >> 4 & 15};
						var23 = var20.playerCompositionRetextureTo != null && var22.length == var20.playerCompositionRetextureTo.length;

						for (var24 = 0; var24 < 2; ++var24) {
							if (var22[var24] != 15) {
								var25 = (short)var1.readUnsignedShort();
								if (var23) {
									var20.playerCompositionRetextureTo[var22[var24]] = var25;
								}
							}
						}
					}

					var28[var11] = var20;
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) {
			this.actions[var11] = var1.readStringCp1252NullTerminated();
		}

		int var29 = var1.readUnsignedByte();
		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method6266(var26, var5, var28, var30, var27, var2, var4, var29);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "0"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class36.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : class36.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2448(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field1128 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1120 * 4096 - super.y);
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

						var5.offsetBy(super.x - this.field1128 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1120 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1252 != 0 && Client.cycle >= super.field1247 && Client.cycle < super.field1248) {
					var3.overrideHue = super.field1249;
					var3.overrideSaturation = super.field1250;
					var3.overrideLuminance = super.field1251;
					var3.overrideAmount = super.field1252;
					var3.field2801 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1468374152"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-16283"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = InvDefinition.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "180"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class358.friendsChat != null && class358.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1325607421"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3235(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "62"
	)
	void method2396() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "28"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-149597751"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class190.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILip;I)V",
		garbageValue = "877591570"
	)
	final void method2374(int var1, int var2, class231 var3) {
		if (super.sequence != -1 && class36.SequenceDefinition_get(super.sequence).field2339 == 1) {
			super.sequence = -1;
		}

		this.method2430();
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == class231.field2427) {
					class180.method3559(this, var1, var2, class231.field2427);
				}

				this.method2376(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-57"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1261 = 0;
		super.field1233 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILip;B)V",
		garbageValue = "-120"
	)
	final void method2376(int var1, int var2, class231 var3) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1479868908"
	)
	static int method2411(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}
}
