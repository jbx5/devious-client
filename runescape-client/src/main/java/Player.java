import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1181672555
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1473193873
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("aa")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1989491569
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1346184075
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -364235779
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1240607451
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -276492539
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -945585951
	)
	int field1145;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -59454839
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1258235987
	)
	int field1154;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1883337735
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1995509191
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1258225711
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1900830555
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aw")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1205493335
	)
	@Export("team")
	int team;
	@ObfuscatedName("ai")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1273931853
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1451120567
	)
	@Export("index")
	int index;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bo")
	boolean field1161;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -393423257
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1697985689
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
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
		this.field1161 = false;
		this.worldView = class358.topLevelWorldView;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lkb;",
		garbageValue = "-852782106"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? FaceNormal.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : FaceNormal.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2451(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field1145 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1154 * 4096 - super.y);
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

						var5.offsetBy(super.x - this.field1145 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1154 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1270 != 0 && Client.cycle >= super.field1265 && Client.cycle < super.field1266) {
					var3.overrideHue = super.field1267;
					var3.overrideSaturation = super.field1268;
					var3.overrideLuminance = super.field1269;
					var3.overrideAmount = super.field1270;
					var3.field2891 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-235564747"
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
					var9 = KeyHandler.ItemDefinition_get(var5[var6] - 512).team;
					if (var9 != 0) {
						this.team = var9;
					}
				}
			}
		}

		int[] var26 = new int[12];

		for (var7 = 0; var7 < 12; ++var7) {
			var8 = var1.readUnsignedByte();
			if (var8 == 0) {
				var26[var7] = 0;
			} else {
				var9 = var1.readUnsignedByte();
				var26[var7] = var9 + (var8 << 8);
			}
		}

		int[] var27 = new int[5];

		for (var8 = 0; var8 < 5; ++var8) {
			var9 = var1.readUnsignedByte();
			if (var9 < 0 || var9 >= AddRequestTask.field4780[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class236.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2366();
		if (this == class17.localPlayer) {
			GZipDecompressor.field5486 = this.username.getName();
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

		byte var29 = var1.readByte();
		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method6597(var26, var5, var28, var30, var27, var2, var4, var29);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2142454980"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-984974924"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class33.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-47"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "115"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class108.friendsChat != null && class108.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2082111608"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3340(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-708463975"
	)
	void method2366() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-323933033"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class134.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IILjv;B)V",
		garbageValue = "-60"
	)
	final void method2370(WorldView var1, int var2, int var3, class237 var4) {
		if (super.sequence != -1 && FaceNormal.SequenceDefinition_get(super.sequence).field2422 == 1) {
			super.sequence = -1;
		}

		this.method2447();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == class237.field2529) {
					class141.method3184(var1, this, var2, var3, class237.field2529);
				}

				this.method2372(var2, var3, var4);
			} else {
				this.resetPath(var2, var3);
			}
		} else {
			this.resetPath(var2, var3);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1894965155"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1226 = 0;
		super.field1278 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILjv;I)V",
		garbageValue = "-1589929454"
	)
	final void method2372(int var1, int var2, class237 var3) {
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1899153369"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "1"
	)
	static char method2406(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IB)V",
		garbageValue = "1"
	)
	public static void method2383(Widget var0, int var1) {
		ItemComposition var2 = KeyHandler.ItemDefinition_get(var1);
		var0.field3902.equipment[var2.maleModel] = var1 + 512;
		if (var2.maleModel1 != -1) {
			var0.field3902.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			var0.field3902.equipment[var2.maleModel2] = 0;
		}

		var0.field3902.method6576();
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BIB)I",
		garbageValue = "1"
	)
	public static int method2407(byte[] var0, int var1) {
		int var3 = -1;

		for (int var4 = 0; var4 < var1; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5344[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
