import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cq")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("rq")
	@ObfuscatedSignature(descriptor = "Lqi;")
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lqy;")
	@Export("username")
	Username username;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lkk;")
	@Export("appearance")
	PlayerComposition appearance;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -339690919)
	@Export("headIconPk")
	int headIconPk = -1;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1767225387)
	@Export("headIconPrayer")
	int headIconPrayer = -1;

	@ObfuscatedName("q")
	@Export("actions")
	String[] actions = new String[3];

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 295884031)
	@Export("combatLevel")
	int combatLevel;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 412407165)
	@Export("skillLevel")
	int skillLevel;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -705296317)
	@Export("tileHeight")
	int tileHeight;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 1109822011)
	@Export("animationCycleStart")
	int animationCycleStart;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 544334885)
	@Export("animationCycleEnd")
	int animationCycleEnd;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -1362904281)
	int field1093;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 2036186281)
	@Export("tileHeight2")
	int tileHeight2;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -472748625)
	int field1097;

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Lhp;")
	@Export("model0")
	Model model0;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1915037801)
	@Export("minX")
	int minX;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 2110454417)
	@Export("minY")
	int minY;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -447071197)
	@Export("maxX")
	int maxX;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 1319610801)
	@Export("maxY")
	int maxY;

	@ObfuscatedName("e")
	@Export("isUnanimated")
	boolean isUnanimated;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = -1985723861)
	@Export("team")
	int team;

	@ObfuscatedName("x")
	@Export("isHidden")
	boolean isHidden;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1670935727)
	@Export("plane")
	int plane;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -1637139185)
	@Export("index")
	int index;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("isInClanChat")
	TriBool isInClanChat;

	@ObfuscatedName("aq")
	boolean field1111;

	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = -1622070341)
	@Export("tileX")
	int tileX;

	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = -1343320041)
	@Export("tileY")
	int tileY;

	Player() {
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
		this.field1111 = false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-1877482907")
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
					var8 = AttackOption.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}
		int[] var11 = new int[5];
		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= FloorDecoration.field2275[var6].length) {
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
		this.username = new Username(var1.readStringCp1252NullTerminated(), StructComposition.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2134();
		if (this == ScriptFrame.localPlayer) {
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
					var12[var9] = UserComparator8.method2551(var4[var9] - 512, var1);
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
		this.appearance.method5494(var4, var12, var13, var11, var2 == 1, var3);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)Lhp;", garbageValue = "4")
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = (super.sequence != -1 && super.sequenceDelay == 0) ? ByteArrayPool.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = (super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null) ? null : ByteArrayPool.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				Model var5;
				Model[] var6;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					var5 = ArchiveDisk.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var5 != null) {
						var5.offsetBy(0, -super.spotAnimationHeight, 0);
						var6 = new Model[]{ var3, var5 };
						var3 = new Model(var6, 2);
					}
				}
				if (!this.isUnanimated && this.model0 != null) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}
					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) {
						var5 = this.model0;
						var5.offsetBy(this.field1093 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1097 * 4096 - super.y);
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
						var6 = new Model[]{ var3, var5 };
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
						var5.offsetBy(super.x - this.field1093 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1097 * 4096);
					}
				}
				var3.isSingleTile = true;
				if (super.field1192 != 0 && Client.cycle >= super.field1187 && Client.cycle < super.field1188) {
					var3.overrideHue = super.field1189;
					var3.overrideSaturation = super.field1131;
					var3.overrideLuminance = super.field1191;
					var3.overrideAmount = super.field1192;
					var3.field2527 = ((short) (var4));
				} else {
					var3.overrideAmount = 0;
				}
				return var3;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "1")
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}
		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "19668")
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "689286")
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = (class321.friendSystem.isFriendAndHasWorld(this.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "365465151")
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}
		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2010863403")
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "122")
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = (class19.friendsChat != null && class19.friendsChat.contains(this.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-154264181")
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method2901(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}
		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-309302132")
	void method2134() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-268947223")
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}
		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-83725541")
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class119.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(IILgi;I)V", garbageValue = "646320028")
	final void method2131(int var1, int var2, class192 var3) {
		if (super.sequence != -1 && ByteArrayPool.SequenceDefinition_get(super.sequence).field2180 == 1) {
			super.sequence = -1;
		}
		super.field1162 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == class192.field2207) {
					Player var4 = this;
					class192 var5 = class192.field2207;
					int var6 = super.pathX[0];
					int var7 = super.pathY[0];
					int var8 = this.transformedSize();
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) {
						int var10 = this.transformedSize();
						RouteStrategy var11 = class13.method164(var1, var2);
						CollisionMap var12 = Client.collisionMaps[this.plane];
						int[] var13 = Client.field547;
						int[] var14 = Client.field771;
						int var15 = 0;
						label863 : while (true) {
							int var16;
							if (var15 >= 128) {
								int var17;
								int var18;
								byte var19;
								byte var20;
								int var21;
								int var22;
								byte var23;
								int var24;
								int[][] var25;
								int var26;
								int var27;
								int var28;
								int var29;
								boolean var35;
								boolean var36;
								int var37;
								int var38;
								int var40;
								if (var10 == 1) {
									var17 = var6;
									var18 = var7;
									var19 = 64;
									var20 = 64;
									var21 = var6 - var19;
									var22 = var7 - var20;
									class193.directions[var19][var20] = 99;
									class193.distances[var19][var20] = 0;
									var23 = 0;
									var24 = 0;
									class193.bufferX[var23] = var6;
									var40 = var23 + 1;
									class193.bufferY[var23] = var7;
									var25 = var12.flags;
									while (true) {
										if (var24 == var40) {
											Huffman.field3288 = var17;
											class193.field2212 = var18;
											var36 = false;
											break;
										}
										var17 = class193.bufferX[var24];
										var18 = class193.bufferY[var24];
										var24 = var24 + 1 & 4095;
										var37 = var17 - var21;
										var38 = var18 - var22;
										var26 = var17 - var12.xInset;
										var27 = var18 - var12.yInset;
										if (var11.hasArrived(1, var17, var18, var12)) {
											Huffman.field3288 = var17;
											class193.field2212 = var18;
											var36 = true;
											break;
										}
										var28 = class193.distances[var37][var38] + 1;
										if (var37 > 0 && class193.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136776) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38] = 2;
											class193.distances[var37 - 1][var38] = var28;
										}
										if (var37 < 127 && class193.directions[var37 + 1][var38] == 0 && (var25[var26 + 1][var27] & 19136896) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38] = 8;
											class193.distances[var37 + 1][var38] = var28;
										}
										if (var38 > 0 && class193.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class193.bufferX[var40] = var17;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37][var38 - 1] = 1;
											class193.distances[var37][var38 - 1] = var28;
										}
										if (var38 < 127 && class193.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class193.bufferX[var40] = var17;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37][var38 + 1] = 4;
											class193.distances[var37][var38 + 1] = var28;
										}
										if (var37 > 0 && var38 > 0 && class193.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38 - 1] = 3;
											class193.distances[var37 - 1][var38 - 1] = var28;
										}
										if (var37 < 127 && var38 > 0 && class193.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 - 1] & 19136770) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38 - 1] = 9;
											class193.distances[var37 + 1][var38 - 1] = var28;
										}
										if (var37 > 0 && var38 < 127 && class193.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0 && (var25[var26 - 1][var27] & 19136776) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38 + 1] = 6;
											class193.distances[var37 - 1][var38 + 1] = var28;
										}
										if (var37 < 127 && var38 < 127 && class193.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 1] & 19136992) == 0 && (var25[var26 + 1][var27] & 19136896) == 0 && (var25[var26][var27 + 1] & 19136800) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38 + 1] = 12;
											class193.distances[var37 + 1][var38 + 1] = var28;
										}
									} 
									var35 = var36;
								} else if (var10 == 2) {
									var17 = var6;
									var18 = var7;
									var19 = 64;
									var20 = 64;
									var21 = var6 - var19;
									var22 = var7 - var20;
									class193.directions[var19][var20] = 99;
									class193.distances[var19][var20] = 0;
									var23 = 0;
									var24 = 0;
									class193.bufferX[var23] = var6;
									var40 = var23 + 1;
									class193.bufferY[var23] = var7;
									var25 = var12.flags;
									while (true) {
										if (var40 == var24) {
											Huffman.field3288 = var17;
											class193.field2212 = var18;
											var36 = false;
											break;
										}
										var17 = class193.bufferX[var24];
										var18 = class193.bufferY[var24];
										var24 = var24 + 1 & 4095;
										var37 = var17 - var21;
										var38 = var18 - var22;
										var26 = var17 - var12.xInset;
										var27 = var18 - var12.yInset;
										if (var11.hasArrived(2, var17, var18, var12)) {
											Huffman.field3288 = var17;
											class193.field2212 = var18;
											var36 = true;
											break;
										}
										var28 = class193.distances[var37][var38] + 1;
										if (var37 > 0 && class193.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var27 + 1] & 19136824) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38] = 2;
											class193.distances[var37 - 1][var38] = var28;
										}
										if (var37 < 126 && class193.directions[var37 + 1][var38] == 0 && (var25[var26 + 2][var27] & 19136899) == 0 && (var25[var26 + 2][var27 + 1] & 19136992) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38] = 8;
											class193.distances[var37 + 1][var38] = var28;
										}
										if (var38 > 0 && class193.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var26 + 1][var27 - 1] & 19136899) == 0) {
											class193.bufferX[var40] = var17;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37][var38 - 1] = 1;
											class193.distances[var37][var38 - 1] = var28;
										}
										if (var38 < 126 && class193.directions[var37][var38 + 1] == 0 && (var25[var26][var27 + 2] & 19136824) == 0 && (var25[var26 + 1][var27 + 2] & 19136992) == 0) {
											class193.bufferX[var40] = var17;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37][var38 + 1] = 4;
											class193.distances[var37][var38 + 1] = var28;
										}
										if (var37 > 0 && var38 > 0 && class193.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27] & 19136830) == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0 && (var25[var26][var27 - 1] & 19136911) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38 - 1] = 3;
											class193.distances[var37 - 1][var38 - 1] = var28;
										}
										if (var37 < 126 && var38 > 0 && class193.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + 1][var27 - 1] & 19136911) == 0 && (var25[var26 + 2][var27 - 1] & 19136899) == 0 && (var25[var26 + 2][var27] & 19136995) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18 - 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38 - 1] = 9;
											class193.distances[var37 + 1][var38 - 1] = var28;
										}
										if (var37 > 0 && var38 < 126 && class193.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var27 + 1] & 19136830) == 0 && (var25[var26 - 1][var27 + 2] & 19136824) == 0 && (var25[var26][var27 + 2] & 19137016) == 0) {
											class193.bufferX[var40] = var17 - 1;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 - 1][var38 + 1] = 6;
											class193.distances[var37 - 1][var38 + 1] = var28;
										}
										if (var37 < 126 && var38 < 126 && class193.directions[var37 + 1][var38 + 1] == 0 && (var25[var26 + 1][var27 + 2] & 19137016) == 0 && (var25[var26 + 2][var27 + 2] & 19136992) == 0 && (var25[var26 + 2][var27 + 1] & 19136995) == 0) {
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38 + 1] = 12;
											class193.distances[var37 + 1][var38 + 1] = var28;
										}
									} 
									var35 = var36;
								} else {
									var17 = var6;
									var18 = var7;
									var19 = 64;
									var20 = 64;
									var21 = var6 - var19;
									var22 = var7 - var20;
									class193.directions[var19][var20] = 99;
									class193.distances[var19][var20] = 0;
									var23 = 0;
									var24 = 0;
									class193.bufferX[var23] = var6;
									var40 = var23 + 1;
									class193.bufferY[var23] = var7;
									var25 = var12.flags;
									label849 : while (true) {
										label847 : while (true) {
											do {
												do {
													do {
														label824 : do {
															if (var40 == var24) {
																Huffman.field3288 = var17;
																class193.field2212 = var18;
																var36 = false;
																break label849;
															}
															var17 = class193.bufferX[var24];
															var18 = class193.bufferY[var24];
															var24 = var24 + 1 & 4095;
															var37 = var17 - var21;
															var38 = var18 - var22;
															var26 = var17 - var12.xInset;
															var27 = var18 - var12.yInset;
															if (var11.hasArrived(var10, var17, var18, var12)) {
																Huffman.field3288 = var17;
																class193.field2212 = var18;
																var36 = true;
																break label849;
															}
															var28 = class193.distances[var37][var38] + 1;
															if (var37 > 0 && class193.directions[var37 - 1][var38] == 0 && (var25[var26 - 1][var27] & 19136782) == 0 && (var25[var26 - 1][var10 + var27 - 1] & 19136824) == 0) {
																var29 = 1;
																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17 - 1;
																		class193.bufferY[var40] = var18;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37 - 1][var38] = 2;
																		class193.distances[var37 - 1][var38] = var28;
																		break;
																	}
																	if ((var25[var26 - 1][var29 + var27] & 19136830) != 0) {
																		break;
																	}
																	++var29;
																} 
															}
															if (var37 < 128 - var10 && class193.directions[var37 + 1][var38] == 0 && (var25[var10 + var26][var27] & 19136899) == 0 && (var25[var10 + var26][var10 + var27 - 1] & 19136992) == 0) {
																var29 = 1;
																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17 + 1;
																		class193.bufferY[var40] = var18;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37 + 1][var38] = 8;
																		class193.distances[var37 + 1][var38] = var28;
																		break;
																	}
																	if ((var25[var10 + var26][var27 + var29] & 19136995) != 0) {
																		break;
																	}
																	++var29;
																} 
															}
															if (var38 > 0 && class193.directions[var37][var38 - 1] == 0 && (var25[var26][var27 - 1] & 19136782) == 0 && (var25[var10 + var26 - 1][var27 - 1] & 19136899) == 0) {
																var29 = 1;
																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17;
																		class193.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37][var38 - 1] = 1;
																		class193.distances[var37][var38 - 1] = var28;
																		break;
																	}
																	if ((var25[var29 + var26][var27 - 1] & 19136911) != 0) {
																		break;
																	}
																	++var29;
																} 
															}
															if (var38 < 128 - var10 && class193.directions[var37][var38 + 1] == 0 && (var25[var26][var10 + var27] & 19136824) == 0 && (var25[var26 + var10 - 1][var10 + var27] & 19136992) == 0) {
																var29 = 1;
																while (true) {
																	if (var29 >= var10 - 1) {
																		class193.bufferX[var40] = var17;
																		class193.bufferY[var40] = var18 + 1;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37][var38 + 1] = 4;
																		class193.distances[var37][var38 + 1] = var28;
																		break;
																	}
																	if ((var25[var29 + var26][var10 + var27] & 19137016) != 0) {
																		break;
																	}
																	++var29;
																} 
															}
															if (var37 > 0 && var38 > 0 && class193.directions[var37 - 1][var38 - 1] == 0 && (var25[var26 - 1][var27 - 1] & 19136782) == 0) {
																var29 = 1;
																while (true) {
																	if (var29 >= var10) {
																		class193.bufferX[var40] = var17 - 1;
																		class193.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37 - 1][var38 - 1] = 3;
																		class193.distances[var37 - 1][var38 - 1] = var28;
																		break;
																	}
																	if ((var25[var26 - 1][var29 + (var27 - 1)] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var27 - 1] & 19136911) != 0) {
																		break;
																	}
																	++var29;
																} 
															}
															if (var37 < 128 - var10 && var38 > 0 && class193.directions[var37 + 1][var38 - 1] == 0 && (var25[var26 + var10][var27 - 1] & 19136899) == 0) {
																var29 = 1;
																while (true) {
																	if (var29 >= var10) {
																		class193.bufferX[var40] = var17 + 1;
																		class193.bufferY[var40] = var18 - 1;
																		var40 = var40 + 1 & 4095;
																		class193.directions[var37 + 1][var38 - 1] = 9;
																		class193.distances[var37 + 1][var38 - 1] = var28;
																		break;
																	}
																	if ((var25[var26 + var10][var29 + (var27 - 1)] & 19136995) != 0 || (var25[var29 + var26][var27 - 1] & 19136911) != 0) {
																		break;
																	}
																	++var29;
																} 
															}
															if (var37 > 0 && var38 < 128 - var10 && class193.directions[var37 - 1][var38 + 1] == 0 && (var25[var26 - 1][var10 + var27] & 19136824) == 0) {
																for (var29 = 1; var29 < var10; ++var29) {
																	if ((var25[var26 - 1][var27 + var29] & 19136830) != 0 || (var25[var29 + (var26 - 1)][var10 + var27] & 19137016) != 0) {
																		continue label824;
																	}
																}
																class193.bufferX[var40] = var17 - 1;
																class193.bufferY[var40] = var18 + 1;
																var40 = var40 + 1 & 4095;
																class193.directions[var37 - 1][var38 + 1] = 6;
																class193.distances[var37 - 1][var38 + 1] = var28;
															}
														} while (var37 >= 128 - var10 );
													} while (var38 >= 128 - var10 );
												} while (class193.directions[var37 + 1][var38 + 1] != 0 );
											} while ((var25[var26 + var10][var10 + var27] & 19136992) != 0 );
											for (var29 = 1; var29 < var10; ++var29) {
												if ((var25[var29 + var26][var10 + var27] & 19137016) != 0 || (var25[var26 + var10][var29 + var27] & 19136995) != 0) {
													continue label847;
												}
											}
											class193.bufferX[var40] = var17 + 1;
											class193.bufferY[var40] = var18 + 1;
											var40 = var40 + 1 & 4095;
											class193.directions[var37 + 1][var38 + 1] = 12;
											class193.distances[var37 + 1][var38 + 1] = var28;
										} 
									} 
									var35 = var36;
								}
								int var9;
								label906 : {
									var16 = var6 - 64;
									var17 = var7 - 64;
									var18 = Huffman.field3288;
									var37 = class193.field2212;
									if (!var35) {
										var38 = Integer.MAX_VALUE;
										var21 = Integer.MAX_VALUE;
										byte var39 = 10;
										var40 = var11.approxDestinationX;
										var24 = var11.approxDestinationY;
										int var34 = var11.approxDestinationSizeX;
										var26 = var11.approxDestinationSizeY;
										for (var27 = var40 - var39; var27 <= var40 + var39; ++var27) {
											for (var28 = var24 - var39; var28 <= var39 + var24; ++var28) {
												var29 = var27 - var16;
												int var30 = var28 - var17;
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class193.distances[var29][var30] < 100) {
													int var31 = 0;
													if (var27 < var40) {
														var31 = var40 - var27;
													} else if (var27 > var40 + var34 - 1) {
														var31 = var27 - (var40 + var34 - 1);
													}
													int var32 = 0;
													if (var28 < var24) {
														var32 = var24 - var28;
													} else if (var28 > var26 + var24 - 1) {
														var32 = var28 - (var26 + var24 - 1);
													}
													int var33 = var32 * var32 + var31 * var31;
													if (var33 < var38 || var38 == var33 && class193.distances[var29][var30] < var21) {
														var38 = var33;
														var21 = class193.distances[var29][var30];
														var18 = var27;
														var37 = var28;
													}
												}
											}
										}
										if (var38 == Integer.MAX_VALUE) {
											var9 = -1;
											break label906;
										}
									}
									if (var18 == var6 && var7 == var37) {
										var13[0] = var18;
										var14[0] = var37;
										var9 = 0;
									} else {
										var20 = 0;
										class193.bufferX[var20] = var18;
										var38 = var20 + 1;
										class193.bufferY[var20] = var37;
										for (var21 = var22 = class193.directions[var18 - var16][var37 - var17]; var18 != var6 || var37 != var7; var21 = class193.directions[var18 - var16][var37 - var17]) {
											if (var21 != var22) {
												var22 = var21;
												class193.bufferX[var38] = var18;
												class193.bufferY[var38++] = var37;
											}
											if ((var21 & 2) != 0) {
												++var18;
											} else if ((var21 & 8) != 0) {
												--var18;
											}
											if ((var21 & 1) != 0) {
												++var37;
											} else if ((var21 & 4) != 0) {
												--var37;
											}
										}
										var40 = 0;
										while (var38-- > 0) {
											var13[var40] = class193.bufferX[var38];
											var14[var40++] = class193.bufferY[var38];
											if (var40 >= var13.length) {
												break;
											}
										} 
										var9 = var40;
									}
								}
								var15 = var9;
								if (var9 < 1) {
									break;
								}
								var16 = 0;
								while (true) {
									if (var16 >= var15 - 1) {
										break label863;
									}
									var4.method2106(Client.field547[var16], Client.field771[var16], var5);
									++var16;
								} 
							}
							for (var16 = 0; var16 < 128; ++var16) {
								class193.directions[var15][var16] = 0;
								class193.distances[var15][var16] = 99999999;
							}
							++var15;
						} 
					}
				}
				this.method2106(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1321665391")
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1201 = 0;
		super.field1200 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = super.pathX[0] * 128 + var3 * 64;
		super.y = var3 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(IILgi;B)V", garbageValue = "1")
	final void method2106(int var1, int var2, class192 var3) {
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-18")
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIILgc;II)V", garbageValue = "1711611133")
	static void method2147(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 16384;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}
		var5.maxX = (var6 + var1) * 16384;
		var5.maxY = (var7 + var2) * 16384;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field812 = var3.int7 * 128;
		var5.field807 = var3.int5;
		var5.field811 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}
		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field815 = var5.field807 + ((int) (Math.random() * ((double) (var5.field811 - var5.field807))));
		}
	}
}