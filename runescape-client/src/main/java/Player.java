import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -122925453
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -462991035
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("am")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 592782235
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1142518761
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -489670735
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1765215337
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 966500205
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 697146017
	)
	int field1109;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1454848917
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 152583421
	)
	int field1117;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 347435953
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 372682577
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1072974743
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 633841231
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ar")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1594016951
	)
	@Export("team")
	int team;
	@ObfuscatedName("ak")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1933717783
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -881787729
	)
	@Export("index")
	int index;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bj")
	boolean field1128;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 207027531
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1350307129
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -939756003
	)
	final int field1113;

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
		this.field1128 = false;
		this.worldView = ConcurrentMidiTask.topLevelWorldView;
		this.field1113 = class546.field5371 < 224 ? 512 : 2048;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lhr;",
		garbageValue = "-1547633874"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class182.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : class182.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2567(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field1109 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1117 * 4096 - super.y);
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

						var5.offsetBy(super.x - this.field1109 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1117 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1220 != 0 && Client.cycle >= super.field1244 && Client.cycle < super.field1241) {
					var3.overrideHue = super.field1242;
					var3.overrideSaturation = super.field1243;
					var3.overrideLuminance = super.field1240;
					var3.overrideAmount = super.field1220;
					var3.field2227 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "-42"
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
		for (int var6 = 0; var6 < var5.length; ++var6) {
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

				if (this.method2451(var5[var6])) {
					var9 = this.method2463(var5[var6]).team;
					if (var9 != 0) {
						this.team = var9;
					}
				}
			}
		}

		int[] var26 = new int[12];

		for (var7 = 0; var7 < var26.length; ++var7) {
			var8 = var1.readUnsignedByte();
			if (var8 == 0) {
				var26[var7] = 0;
			} else {
				var9 = var1.readUnsignedByte();
				var26[var7] = var9 + (var8 << 8);
			}
		}

		int[] var27 = new int[5];

		for (var8 = 0; var8 < var27.length; ++var8) {
			var9 = var1.readUnsignedByte();
			if (var9 < 0 || var9 >= HorizontalAlignment.field2553[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), ObjectSound.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2446();
		if (this == class253.localPlayer) {
			class490.field5021 = this.username.getName();
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

			for (var11 = 0; var11 < var28.length; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) {
					int var16 = var5[var11] - this.field1113;
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

		this.appearance.method6576(var26, var5, var28, var30, var27, var2, var4, var29);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "943598"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-690278152"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "85"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class277.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1838308221"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "251422339"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1757699416"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = HttpRequestTask.friendsChat != null && HttpRequestTask.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-569412365"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3438(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1584634497"
	)
	void method2446() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "207052349"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2091537484"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? UserComparator8.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IILko;I)V",
		garbageValue = "-1235185625"
	)
	final void method2458(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.sequence != -1 && class182.SequenceDefinition_get(super.sequence).field2885 == 1) {
			super.sequence = -1;
		}

		this.method2528();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field2984) {
					ActorSpotAnim.method8769(var1, this, var2, var3, MoveSpeed.field2984);
				}

				this.method2509(var2, var3, var4);
			} else {
				this.resetPath(var2, var3);
			}
		} else {
			this.resetPath(var2, var3);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "70"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1255 = 0;
		super.field1253 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IILko;B)V",
		garbageValue = "3"
	)
	final void method2509(int var1, int var2, MoveSpeed var3) {
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "804082803"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-780155115"
	)
	boolean method2451(int var1) {
		return var1 >= this.field1113;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)Lkm;",
		garbageValue = "-2145734842"
	)
	ItemComposition method2463(int var1) {
		return ItemDefinition_get(var1 - this.field1113);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkm;",
		garbageValue = "0"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!class241.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) {
					var1.name = var1.name + " (Members)";
				}

				var1.examine = "Login to a members' server to use this object.";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						if (var1.field2824 != null) {
							var1.field2824[var3] = null;
						}

						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = ObjectSound.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
