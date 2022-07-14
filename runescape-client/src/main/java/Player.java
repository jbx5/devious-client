import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ci")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("ug")
	@ObfuscatedSignature(descriptor = "Lbl;")
	@Export("friendSystem")
	public static FriendSystem friendSystem;

	@ObfuscatedName("mu")
	@ObfuscatedGetter(intValue = 1878220187)
	@Export("menuHeight")
	static int menuHeight;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lqa;")
	@Export("username")
	Username username;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lkt;")
	@Export("appearance")
	PlayerComposition appearance;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1076287933)
	@Export("headIconPk")
	int headIconPk;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1720053255)
	@Export("headIconPrayer")
	int headIconPrayer;

	@ObfuscatedName("e")
	@Export("actions")
	String[] actions;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1534122855)
	@Export("combatLevel")
	int combatLevel;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 351433381)
	@Export("skillLevel")
	int skillLevel;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 1504708523)
	@Export("tileHeight")
	int tileHeight;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -1066412829)
	@Export("animationCycleStart")
	int animationCycleStart;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 2100929431)
	@Export("animationCycleEnd")
	int animationCycleEnd;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -1217050523)
	int field1095;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 363139371)
	@Export("tileHeight2")
	int tileHeight2;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -1513637527)
	int field1108;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lhy;")
	@Export("model0")
	Model model0;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 458056289)
	@Export("minX")
	int minX;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 872094215)
	@Export("minY")
	int minY;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -863733713)
	@Export("maxX")
	int maxX;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = -381044703)
	@Export("maxY")
	int maxY;

	@ObfuscatedName("a")
	@Export("isUnanimated")
	boolean isUnanimated;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 9198677)
	@Export("team")
	int team;

	@ObfuscatedName("b")
	@Export("isHidden")
	boolean isHidden;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -1115427467)
	@Export("plane")
	int plane;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1343839549)
	@Export("index")
	int index;

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Lnt;")
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lnt;")
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "Lnt;")
	@Export("isInClanChat")
	TriBool isInClanChat;

	@ObfuscatedName("ak")
	boolean field1088;

	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = -335116009)
	@Export("tileX")
	int tileX;

	@ObfuscatedName("ao")
	@ObfuscatedGetter(intValue = 1610456875)
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
		this.field1088 = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "2050981456")
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0;
		int var2 = var1.readUnsignedByte();
		this.headIconPk = var1.readByte();
		this.headIconPrayer = var1.readByte();
		int var3 = -1;
		this.team = 0;
		int[] var4 = new int[12];
		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < 12; ++var5) {
			var6 = var1.readUnsignedByte();
			if (var6 == 0) {
				var4[var5] = 0;
			} else {
				var7 = var1.readUnsignedByte();
				var4[var5] = var7 + (var6 << 8);
				if (var5 == 0 && var4[0] == 65535) {
					var3 = var1.readUnsignedShort();
					break;
				}
				if (var4[var5] >= 512) {
					var8 = EnumComposition.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}
		int[] var11 = new int[5];
		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= PlayerComposition.field3342[var6].length) {
				var7 = 0;
			}
			var11[var6] = var7;
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
		this.username = new Username(var1.readStringCp1252NullTerminated(), HealthBarDefinition.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2135();
		if (this == class101.localPlayer) {
			RunException.localPlayerName = this.username.getName();
		}
		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}
		PlayerCompositionColorTextureOverride[] var12 = null;
		boolean var13 = false;
		var8 = var1.readUnsignedShort();
		var13 = (var8 >> 15 & 1) == 1;
		int var9;
		if (var8 > 0 && var8 != 32768) {
			var12 = new PlayerCompositionColorTextureOverride[12];
			for (var9 = 0; var9 < 12; ++var9) {
				int var10 = var8 >> 12 - var9 & 1;
				if (var10 == 1) {
					var12[var9] = UserComparator10.method2609(var4[var9] - 512, var1);
				}
			}
		}
		if (var1.offset < var1.array.length) {
			for (var9 = 0; var9 < 3; ++var9) {
				this.actions[var9] = var1.readStringCp1252NullTerminated();
			}
		}
		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}
		this.appearance.method5566(var4, var12, var13, var11, var2 == 1, var3);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Lhy;", garbageValue = "1081110576")
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = (super.sequence != -1 && super.sequenceDelay == 0) ? ScriptFrame.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = (super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null) ? null : ScriptFrame.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var4 = ObjectSound.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.spotAnimationHeight, 0);
						var5 = new Model[]{ var3, var4 };
						var3 = new Model(var5, 2);
					}
				}
				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}
					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						var4 = this.model0;
						var4.offsetBy(this.field1095 - super.x, this.tileHeight2 - this.tileHeight, this.field1108 - super.y);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
						}
						var5 = new Model[]{ var3, var4 };
						var3 = new Model(var5, 2);
						if (super.orientation == 512) {
							var4.rotateY90Ccw();
						} else if (super.orientation == 1024) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						} else if (super.orientation == 1536) {
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
							var4.rotateY90Ccw();
						}
						var4.offsetBy(super.x - this.field1095, this.tileHeight - this.tileHeight2, super.y - this.field1108);
					}
				}
				var3.isSingleTile = true;
				if (super.field1133 != 0 && Client.cycle >= super.field1189 && Client.cycle < super.field1135) {
					var3.overrideHue = super.field1191;
					var3.overrideSaturation = super.field1192;
					var3.overrideLuminance = super.field1193;
					var3.overrideAmount = super.field1133;
				} else {
					var3.overrideAmount = 0;
				}
				return var3;
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "541693037")
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}
		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-842597449")
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "82")
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = (friendSystem.isFriendAndHasWorld(this.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1871762564")
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}
		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1664103781")
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1421965855")
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = (Huffman.friendsChat != null && Huffman.friendsChat.contains(this.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1544435810")
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2991(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}
		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2144863199")
	void method2135() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2071495153")
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}
		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "20")
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? BuddyRankComparator.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IILgn;S)V", garbageValue = "26658")
	final void method2139(int var1, int var2, class192 var3) {
		if (super.sequence != -1 && ScriptFrame.SequenceDefinition_get(super.sequence).field2188 == 1) {
			super.sequence = -1;
		}
		super.field1165 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == class192.field2211) {
					class306.method5765(this, var1, var2, class192.field2211);
				}
				this.method2141(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "3")
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1203 = 0;
		super.field1202 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IILgn;I)V", garbageValue = "829621719")
	final void method2141(int var1, int var2, class192 var3) {
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "9013641")
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}
}