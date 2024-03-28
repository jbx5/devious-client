import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("sd")
	@Export("ClanChat_inClanChat")
	static boolean ClanChat_inClanChat;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvx;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 46156721
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 332926417
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ab")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 855640211
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 425547539
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -334031367
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 776784083
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1197034193
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1206390989
	)
	int field1140;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 859475615
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1152903659
	)
	int field1137;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2040749959
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -236006143
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1348847329
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 444465337
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aa")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -847135969
	)
	@Export("team")
	int team;
	@ObfuscatedName("am")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -722233805
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1363721471
	)
	@Export("index")
	int index;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bc")
	boolean field1147;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1258938525
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 47364053
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
		this.field1147 = false;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1406213924"
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
					var9 = HttpRequest.ItemDefinition_get(var5[var6] - 512).team;
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
			if (var9 < 0 || var9 >= UrlRequester.field1454[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class127.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2338();
		if (this == class133.localPlayer) {
			RunException.field5389 = this.username.getName();
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

		this.appearance.method6321(var26, var5, var28, var30, var27, var2, var4, var29);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "1157175232"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? DevicePcmPlayerProvider.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : DevicePcmPlayerProvider.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2401(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field1140 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1137 * 4096 - super.y);
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

						var5.offsetBy(super.x - this.field1140 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1137 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1265 != 0 && Client.cycle >= super.field1260 && Client.cycle < super.field1236) {
					var3.overrideHue = super.field1261;
					var3.overrideSaturation = super.field1263;
					var3.overrideLuminance = super.field1235;
					var3.overrideAmount = super.field1265;
					var3.field2784 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "94"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-326732208"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1103762697"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class334.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1463803481"
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
		descriptor = "(I)V",
		garbageValue = "-1706967366"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class143.friendsChat != null && class143.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3242(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-580824656"
	)
	void method2338() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "33"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1724182257"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? UserComparator10.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IILiu;B)V",
		garbageValue = "39"
	)
	final void method2342(int var1, int var2, class233 var3) {
		if (super.sequence != -1 && DevicePcmPlayerProvider.SequenceDefinition_get(super.sequence).field2399 == 1) {
			super.sequence = -1;
		}

		this.method2419();
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == class233.field2485) {
					class1.method11(this, var1, var2, class233.field2485);
				}

				this.method2344(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "70706499"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1274 = 0;
		super.field1257 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IILiu;I)V",
		garbageValue = "468458923"
	)
	final void method2344(int var1, int var2, class233 var3) {
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "951800784"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Loc;IIB)[Lvg;",
		garbageValue = "30"
	)
	public static SpritePixels[] method2379(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			HttpQueryParams.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : TextureProvider.method4930();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "201430276"
	)
	@Export("randomDatData2")
	public static byte[] randomDatData2() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	static final boolean method2361() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}
}
