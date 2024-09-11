import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = -761379489
	)
	static int field1170;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lwf;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1461964219
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2025139131
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("aq")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2108888891
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -321980531
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -218428953
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1307930885
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1542756869
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1503696427
	)
	int field1152;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -799762841
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 819382657
	)
	int field1150;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 633273673
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 741953663
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1485432659
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 564670867
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("as")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2064933455
	)
	@Export("team")
	int team;
	@ObfuscatedName("aj")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1019353099
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 2036704335
	)
	@Export("index")
	int index;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -176101077
	)
	final int field1154;

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
		this.worldView = ClientPreferences.topLevelWorldView;
		this.field1154 = class548.field5407 < 224 ? 512 : 2048;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "-75"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? HealthBarUpdate.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : HealthBarUpdate.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2649(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field1152 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1150 * 4096 - super.y);
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

						var5.offsetBy(super.x - this.field1152 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1150 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1285 != 0 && Client.cycle >= super.field1284 && Client.cycle < super.field1258) {
					var3.overrideHue = super.field1259;
					var3.overrideSaturation = super.field1287;
					var3.overrideLuminance = super.field1288;
					var3.overrideAmount = super.field1285;
					var3.field2834 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "2046743859"
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

				if (this.method2549(var5[var6])) {
					var9 = this.method2564(var5[var6]).team;
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
			if (var9 < 0 || var9 >= Projection.field2769[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class28.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2555();
		if (this == AddRequestTask.localPlayer) {
			class436.field4791 = this.username.getName();
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
					int var16 = var5[var11] - this.field1154;
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

		this.appearance.method6912(var26, var5, var28, var30, var27, var2, var4, var29);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "255"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2123373112"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1445082530"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class425.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "129256943"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class168.friendsChat != null && class168.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1768343223"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3605(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2045275478"
	)
	void method2555() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1995543091"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1056091399"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class168.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IILkk;I)V",
		garbageValue = "-947479970"
	)
	final void method2559(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.sequence != -1 && HealthBarUpdate.SequenceDefinition_get(super.sequence).field2327 == 1) {
			super.sequence = -1;
		}

		this.method2670();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field3039) {
					Player var5 = this;
					MoveSpeed var6 = MoveSpeed.field3039;
					int var7 = super.pathX[0];
					int var8 = super.pathY[0];
					int var9 = this.transformedSize();
					CollisionMap var10 = var1.collisionMaps[this.plane];
					if (var7 >= var9 && var7 < var10.xSize - var9 && var8 >= var9 && var8 < var10.ySize - var9 && var2 >= var9 && var2 < var10.xSize - var9 && var3 >= var9 && var3 < var10.ySize - var9) {
						int var11 = Client.field810.method5713(var7, var8, this.transformedSize(), class169.method3710(var2, var3), var10, true, Client.field691, Client.field817);
						if (var11 >= 1) {
							for (int var12 = 0; var12 < var11 - 1; ++var12) {
								var5.method2601(Client.field691[var12], Client.field817[var12], var6);
							}
						}
					}
				}

				this.method2601(var2, var3, var4);
			} else {
				this.resetPath(var2, var3);
			}
		} else {
			this.resetPath(var2, var3);
		}

	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-14378"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1298 = 0;
		super.field1290 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IILkk;B)V",
		garbageValue = "108"
	)
	final void method2601(int var1, int var2, MoveSpeed var3) {
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "960965429"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "876247980"
	)
	boolean method2549(int var1) {
		return var1 >= this.field1154;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)Lis;",
		garbageValue = "-1749537748"
	)
	ItemComposition method2564(int var1) {
		return MouseRecorder.ItemDefinition_get(var1 - this.field1154);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lib;",
		garbageValue = "-55444692"
	)
	public static class225 method2610() {
		return class225.field2424;
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "40"
	)
	static final void method2609(int var0, int var1, int var2) {
		if (class301.cameraX < var0) {
			class301.cameraX = (var0 - class301.cameraX) * class27.field117 / 1000 + class301.cameraX + ObjectComposition.field2214;
			if (class301.cameraX > var0) {
				class301.cameraX = var0;
			}
		}

		if (class301.cameraX > var0) {
			class301.cameraX -= (class301.cameraX - var0) * class27.field117 / 1000 + ObjectComposition.field2214;
			if (class301.cameraX < var0) {
				class301.cameraX = var0;
			}
		}

		if (ArchiveLoader.cameraY < var1) {
			ArchiveLoader.cameraY = (var1 - ArchiveLoader.cameraY) * class27.field117 / 1000 + ArchiveLoader.cameraY + ObjectComposition.field2214;
			if (ArchiveLoader.cameraY > var1) {
				ArchiveLoader.cameraY = var1;
			}
		}

		if (ArchiveLoader.cameraY > var1) {
			ArchiveLoader.cameraY -= (ArchiveLoader.cameraY - var1) * class27.field117 / 1000 + ObjectComposition.field2214;
			if (ArchiveLoader.cameraY < var1) {
				ArchiveLoader.cameraY = var1;
			}
		}

		if (class33.cameraZ < var2) {
			class33.cameraZ = (var2 - class33.cameraZ) * class27.field117 / 1000 + class33.cameraZ + ObjectComposition.field2214;
			if (class33.cameraZ > var2) {
				class33.cameraZ = var2;
			}
		}

		if (class33.cameraZ > var2) {
			class33.cameraZ -= (class33.cameraZ - var2) * class27.field117 / 1000 + ObjectComposition.field2214;
			if (class33.cameraZ < var2) {
				class33.cameraZ = var2;
			}
		}

	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "423085171"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < class167.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = MouseRecorder.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					WorldMapArea.foundItemIdCount = -1;
					class165.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class165.foundItemIds = var2;
		class139.foundItemIndex = 0;
		WorldMapArea.foundItemIdCount = var3;
		String[] var8 = new String[WorldMapArea.foundItemIdCount];

		for (int var5 = 0; var5 < WorldMapArea.foundItemIdCount; ++var5) {
			var8[var5] = MouseRecorder.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = class165.foundItemIds;
		class6.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
