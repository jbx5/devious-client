import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnz;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -921814889
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1481513959
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("ar")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1935891595
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1126279289
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1058938029
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2071788451
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1490413641
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 851961207
	)
	int field1108;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 135135043
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -671106327
	)
	int field1120;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1153009523
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -786714259
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1457659035
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 863174019
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ab")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 178945067
	)
	@Export("team")
	int team;
	@ObfuscatedName("ai")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -48389209
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1689585943
	)
	@Export("index")
	int index;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("bg")
	boolean field1124;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1160516255
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1099359221
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-605345143"
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
					var9 = class341.ItemDefinition_get(var5[var6] - 512).team;
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
			if (var9 < 0 || var9 >= PlayerComposition.field3646[var8].length) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), UserComparator10.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2395();
		if (this == KeyHandler.localPlayer) {
			RunException.field5335 = this.username.getName();
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
					var15[var11] = class399.method7487(var5[var11] - 512, var1);
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

		this.appearance.method6372(var13, var5, var15, var17, var14, var2, var4, var16);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-714420560"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? HttpMethod.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.movementSequence == super.idleSequence && var1 != null ? null : HttpMethod.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				if (!this.isUnanimated) {
					var3 = this.method2486(var3);
				}

				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						Model var5 = this.model0;
						var5.offsetBy(this.field1108 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1120 * 4096 - super.y);
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

						var5.offsetBy(super.x - this.field1108 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1120 * 4096);
					}
				}

				var3.isSingleTile = true;
				if (super.field1237 != 0 && Client.cycle >= super.field1180 && Client.cycle < super.field1233) {
					var3.overrideHue = super.field1234;
					var3.overrideSaturation = super.field1193;
					var3.overrideLuminance = super.field1204;
					var3.overrideAmount = super.field1237;
					var3.field2995 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-19048"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "914914524"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-724517082"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = class332.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1011953784"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "48"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-629118534"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = ClientPreferences.friendsChat != null && ClientPreferences.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-83"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3389(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "116"
	)
	void method2395() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1687985056"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2013630593"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? Script.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IILir;I)V",
		garbageValue = "1528416684"
	)
	final void method2429(int var1, int var2, class231 var3) {
		if (super.sequence != -1 && HttpMethod.SequenceDefinition_get(super.sequence).field2226 == 1) {
			super.sequence = -1;
		}

		this.method2460();
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == class231.field2459) {
					GraphicsObject.method2132(this, var1, var2, class231.field2459);
				}

				this.method2415(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "118"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1215 = 0;
		super.field1245 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IILir;B)V",
		garbageValue = "-36"
	)
	final void method2415(int var1, int var2, class231 var3) {
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
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "-47"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	public static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Low;II)Lut;",
		garbageValue = "149210421"
	)
	public static IndexedSprite method2438(AbstractArchive var0, int var1) {
		return !FillMode.method9805(var0, var1) ? null : class464.method8511();
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1886102075"
	)
	static void method2436() {
		WallDecoration.compass = null;
		class149.redHintArrowSprite = null;
		WorldMapLabelSize.mapSceneSprites = null;
		Actor.headIconPkSprites = null;
		class13.headIconPrayerSprites = null;
		GrandExchangeOfferOwnWorldComparator.headIconHintSprites = null;
		class365.mapDotSprites = null;
		Players.crossSprites = null;
		class142.field1634 = null;
		class359.scrollBarSprites = null;
		HttpResponse.field104 = null;
	}
}
