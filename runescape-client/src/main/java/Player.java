import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lwx;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 924068513
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2113682459
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ay")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2031094063
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -910277453
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1220789259
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1581699801
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 732108505
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 784064637
	)
	int field1138;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1278368565
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 414024507
	)
	int field1152;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -933956513
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 3191645
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1405690337
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -774818269
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("av")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1519057645
	)
	@Export("team")
	int team;
	@ObfuscatedName("aq")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 901808959
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1645287891
	)
	@Export("index")
	int index;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -887329531
	)
	final int field1162;

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
		this.worldView = class198.topLevelWorldView;
		this.field1162 = class555.field5457 < 224 ? 512 : 2048;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljy;",
		garbageValue = "1885718735"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? Widget.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : Widget.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2731(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field1138 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1152 * 4096 - super.y);
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

						var5.offsetBy(super.x - this.field1138 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1152 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1282 != 0 && Client.cycle >= super.field1277 && Client.cycle < super.field1278) {
					var3.overrideHue = super.field1276;
					var3.overrideSaturation = super.field1280;
					var3.overrideLuminance = super.field1281;
					var3.overrideAmount = super.field1282;
					var3.field2886 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvl;S)V",
		garbageValue = "-23818"
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

				if (this.method2614(var5[var6])) {
					var9 = this.method2613(var5[var6]).team;
					if (var9 != 0) {
						this.team = var9;
					}
				}
			}
		}

		int[] var28 = new int[12];

		for (var7 = 0; var7 < var28.length; ++var7) {
			var8 = var1.readUnsignedByte();
			if (var8 == 0) {
				var28[var7] = 0;
			} else {
				var9 = var1.readUnsignedByte();
				var28[var7] = var9 + (var8 << 8);
			}
		}

		int[] var29 = new int[5];

		for (var8 = 0; var8 < var29.length; ++var8) {
			var9 = var1.readUnsignedByte();
			if (var9 < 0 || var9 >= class190.field1981[var8].length) {
				var9 = 0;
			}

			var29[var8] = var9;
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), WorldMapScaleHandler.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2606();
		if (this == SpriteMask.localPlayer) {
			class320.field3308 = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}

		PlayerCompositionColorTextureOverride[] var30 = null;
		boolean var32 = false;
		int var10 = var1.readUnsignedShort();
		var32 = (var10 >> 15 & 1) == 1;
		int var11;
		if (var10 > 0 && var10 != 32768) {
			var30 = new PlayerCompositionColorTextureOverride[12];

			for (var11 = 0; var11 < var30.length; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) {
					int var16 = var5[var11] - this.field1162;
					int var17 = var1.readUnsignedByte();
					boolean var18 = (var17 & 1) != 0;
					boolean var19 = (var17 & 2) != 0;
					boolean var20 = (var17 & 4) != 0;
					boolean var21 = (var17 & 8) != 0;
					PlayerCompositionColorTextureOverride var22 = new PlayerCompositionColorTextureOverride(var16);
					int var23;
					int[] var24;
					boolean var25;
					int var26;
					short var27;
					if (var18) {
						var23 = var1.readUnsignedByte();
						var24 = new int[]{var23 & 15, var23 >> 4 & 15};
						var25 = var22.playerCompositionRecolorTo != null && var24.length == var22.playerCompositionRecolorTo.length;

						for (var26 = 0; var26 < 2; ++var26) {
							if (var24[var26] != 15) {
								var27 = (short)var1.readUnsignedShort();
								if (var25) {
									var22.playerCompositionRecolorTo[var24[var26]] = var27;
								}
							}
						}
					}

					if (var19) {
						var23 = var1.readUnsignedByte();
						var24 = new int[]{var23 & 15, var23 >> 4 & 15};
						var25 = var22.playerCompositionRetextureTo != null && var24.length == var22.playerCompositionRetextureTo.length;

						for (var26 = 0; var26 < 2; ++var26) {
							if (var24[var26] != 15) {
								var27 = (short)var1.readUnsignedShort();
								if (var25) {
									var22.playerCompositionRetextureTo[var24[var26]] = var27;
								}
							}
						}
					}

					if (var20) {
						var22.field1868 = var1.readUnsignedShort();
						var22.field1873 = var1.readUnsignedShort();
					}

					if (var21) {
						var22.field1874 = var1.readUnsignedShort();
						var22.field1875 = var1.readUnsignedShort();
					}

					var30[var11] = var22;
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) {
			this.actions[var11] = var1.readStringCp1252NullTerminated();
		}

		byte var31 = var1.readByte();
		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method6927(var28, var5, var30, var32, var29, var2, var4, var31);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-16539"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1136478946"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "111"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = ItemContainer.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1931744034"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-72"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1575103421"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = PendingSpawn.friendsChat != null && PendingSpawn.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1268331932"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3695(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-766960613"
	)
	void method2606() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "44"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? ActorSpotAnim.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IILkk;B)V",
		garbageValue = "5"
	)
	final void method2610(WorldView var1, int var2, int var3, MoveSpeed var4) {
		if (super.sequence != -1 && Widget.SequenceDefinition_get(super.sequence).field2327 == 1) {
			super.sequence = -1;
		}

		this.method2724();
		if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var4 == MoveSpeed.field3057) {
					VarbitComposition.method4130(var1, this, var2, var3, MoveSpeed.field3057);
				}

				this.method2612(var2, var3, var4);
			} else {
				this.resetPath(var2, var3);
			}
		} else {
			this.resetPath(var2, var3);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-76"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1291 = 0;
		super.field1263 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IILkk;B)V",
		garbageValue = "-98"
	)
	final void method2612(int var1, int var2, MoveSpeed var3) {
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1413118539"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "21286"
	)
	boolean method2614(int var1) {
		return var1 >= this.field1162;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IB)Lip;",
		garbageValue = "-12"
	)
	ItemComposition method2613(int var1) {
		return Bounds.ItemDefinition_get(var1 - this.field1162);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "2076481411"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(HttpRequestTask.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}
}
