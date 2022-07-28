import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cz")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lqi;")
	@Export("username")
	Username username;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lko;")
	@Export("appearance")
	PlayerComposition appearance;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1916232129)
	@Export("headIconPk")
	int headIconPk = -1;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1539405081)
	@Export("headIconPrayer")
	int headIconPrayer = -1;

	@ObfuscatedName("w")
	@Export("actions")
	String[] actions = new String[3];

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1575706031)
	@Export("combatLevel")
	int combatLevel;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1555394005)
	@Export("skillLevel")
	int skillLevel;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -664293957)
	@Export("tileHeight")
	int tileHeight;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -42542205)
	@Export("animationCycleStart")
	int animationCycleStart;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 2081519761)
	@Export("animationCycleEnd")
	int animationCycleEnd;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 440498461)
	int field1095;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 595380943)
	@Export("tileHeight2")
	int tileHeight2;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 637592907)
	int field1097;

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lhd;")
	@Export("model0")
	Model model0;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 471204145)
	@Export("minX")
	int minX;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 1484832955)
	@Export("minY")
	int minY;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1931117129)
	@Export("maxX")
	int maxX;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 1131943337)
	@Export("maxY")
	int maxY;

	@ObfuscatedName("v")
	@Export("isUnanimated")
	boolean isUnanimated;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 1012399969)
	@Export("team")
	int team;

	@ObfuscatedName("e")
	@Export("isHidden")
	boolean isHidden;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 634785561)
	@Export("plane")
	int plane;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -957849491)
	@Export("index")
	int index;

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "Lnm;")
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "Lnm;")
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "Lnm;")
	@Export("isInClanChat")
	TriBool isInClanChat;

	@ObfuscatedName("ar")
	boolean field1111;

	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = 1382361713)
	@Export("tileX")
	int tileX;

	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = 252189665)
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-1806202048")
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
					var8 = class258.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}
		int[] var24 = new int[5];
		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if (var7 < 0 || var7 >= DynamicObject.field986[var6].length) {
				var7 = 0;
			}
			var24[var6] = var7;
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
		this.username = new Username(var1.readStringCp1252NullTerminated(), class162.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2215();
		if (this == class28.localPlayer) {
			class392.localPlayerName = this.username.getName();
		}
		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) {
			this.isHidden = false;
		}
		PlayerCompositionColorTextureOverride[] var25 = null;
		boolean var26 = false;
		var8 = var1.readUnsignedShort();
		var26 = (var8 >> 15 & 1) == 1;
		int var9;
		if (var8 > 0 && var8 != 32768) {
			var25 = new PlayerCompositionColorTextureOverride[12];
			for (var9 = 0; var9 < 12; ++var9) {
				int var10 = var8 >> 12 - var9 & 1;
				if (var10 == 1) {
					int var14 = var4[var9] - 512;
					int var15 = var1.readUnsignedByte();
					boolean var16 = (var15 & 1) != 0;
					boolean var17 = (var15 & 2) != 0;
					PlayerCompositionColorTextureOverride var18 = new PlayerCompositionColorTextureOverride(var14);
					int var19;
					int[] var20;
					boolean var21;
					int var22;
					short var23;
					if (var16) {
						var19 = var1.readUnsignedByte();
						var20 = new int[]{ var19 & 15, var19 >> 4 & 15 };
						var21 = var18.playerCompositionRecolorTo != null && var20.length == var18.playerCompositionRecolorTo.length;
						for (var22 = 0; var22 < 2; ++var22) {
							if (var20[var22] != 15) {
								var23 = ((short) (var1.readUnsignedShort()));
								if (var21) {
									var18.playerCompositionRecolorTo[var20[var22]] = var23;
								}
							}
						}
					}
					if (var17) {
						var19 = var1.readUnsignedByte();
						var20 = new int[]{ var19 & 15, var19 >> 4 & 15 };
						var21 = var18.playerCompositionRetextureTo != null && var20.length == var18.playerCompositionRetextureTo.length;
						for (var22 = 0; var22 < 2; ++var22) {
							if (var20[var22] != 15) {
								var23 = ((short) (var1.readUnsignedShort()));
								if (var21) {
									var18.playerCompositionRetextureTo[var20[var22]] = var23;
								}
							}
						}
					}
					var25[var9] = var18;
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
		this.appearance.method5572(var4, var25, var26, var24, var2 == 1, var3);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Lhd;", garbageValue = "-842208187")
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = (super.sequence != -1 && super.sequenceDelay == 0) ? class14.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = (super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null) ? null : class14.SequenceDefinition_get(super.movementSequence);
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
					var5 = class13.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
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
						var5.offsetBy(this.field1095 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1097 * 4096 - super.y);
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
						var5.offsetBy(super.x - this.field1095 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1097 * 4096);
					}
				}
				var3.isSingleTile = true;
				if (super.field1184 != 0 && Client.cycle >= super.field1189 && Client.cycle < super.field1136) {
					var3.overrideHue = super.field1191;
					var3.overrideSaturation = super.field1168;
					var3.overrideLuminance = super.field1193;
					var3.overrideAmount = super.field1184;
					var3.field2516 = ((short) (var4));
				} else {
					var3.overrideAmount = 0;
				}
				return var3;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "1")
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}
		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "64")
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1883398531")
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = (MusicPatchPcmStream.friendSystem.isFriendAndHasWorld(this.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "524757055")
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}
		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-105974800")
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "1684")
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = (class13.friendsChat != null && class13.friendsChat.contains(this.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-31")
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) {
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3042(this.username.getName()) != -1 && var1 != 2) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}
		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "472207822")
	void method2215() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1520291256")
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}
		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-61")
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class125.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(IILgl;I)V", garbageValue = "-1350620380")
	final void method2230(int var1, int var2, class192 var3) {
		if (super.sequence != -1 && class14.SequenceDefinition_get(super.sequence).field2156 == 1) {
			super.sequence = -1;
		}
		super.field1164 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) {
				if (var3 == class192.field2197) {
					Player var4 = this;
					class192 var5 = class192.field2197;
					int var6 = super.pathX[0];
					int var7 = super.pathY[0];
					int var8 = this.transformedSize();
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) {
						int var10 = this.transformedSize();
						Client.field777.approxDestinationX = var1;
						Client.field777.approxDestinationY = var2;
						Client.field777.approxDestinationSizeX = 1;
						Client.field777.approxDestinationSizeY = 1;
						ApproximateRouteStrategy var11 = Client.field777;
						ApproximateRouteStrategy var12 = var11;
						CollisionMap var13 = Client.collisionMaps[this.plane];
						int[] var14 = Client.field778;
						int[] var15 = Client.field779;
						int var16 = 0;
						label720 : while (true) {
							int var17;
							if (var16 >= 128) {
								int var18;
								int var19;
								int var20;
								int var21;
								int var22;
								int var23;
								int var24;
								int var25;
								int var27;
								int var28;
								int var29;
								int var30;
								boolean var36;
								byte var39;
								if (var10 == 1) {
									var36 = class344.method6344(var6, var7, var11, var13);
								} else {
									int[][] var26;
									boolean var37;
									if (var10 == 2) {
										var18 = var6;
										var19 = var7;
										var20 = 64;
										var21 = 64;
										var22 = var6 - var20;
										var23 = var7 - var21;
										class193.directions[var20][var21] = 99;
										class193.distances[var20][var21] = 0;
										var24 = 0;
										var25 = 0;
										class193.bufferX[var24] = var6;
										class193.bufferY[var24++] = var7;
										var26 = var13.flags;
										while (true) {
											if (var24 == var25) {
												class352.field4222 = var18;
												DirectByteArrayCopier.field3302 = var19;
												var37 = false;
												break;
											}
											var18 = class193.bufferX[var25];
											var19 = class193.bufferY[var25];
											var25 = var25 + 1 & 4095;
											var20 = var18 - var22;
											var21 = var19 - var23;
											var27 = var18 - var13.xInset;
											var28 = var19 - var13.yInset;
											if (var12.hasArrived(2, var18, var19, var13)) {
												class352.field4222 = var18;
												DirectByteArrayCopier.field3302 = var19;
												var37 = true;
												break;
											}
											var29 = class193.distances[var20][var21] + 1;
											if (var20 > 0 && class193.directions[var20 - 1][var21] == 0 && (var26[var27 - 1][var28] & 19136782) == 0 && (var26[var27 - 1][var28 + 1] & 19136824) == 0) {
												class193.bufferX[var24] = var18 - 1;
												class193.bufferY[var24] = var19;
												var24 = var24 + 1 & 4095;
												class193.directions[var20 - 1][var21] = 2;
												class193.distances[var20 - 1][var21] = var29;
											}
											if (var20 < 126 && class193.directions[var20 + 1][var21] == 0 && (var26[var27 + 2][var28] & 19136899) == 0 && (var26[var27 + 2][var28 + 1] & 19136992) == 0) {
												class193.bufferX[var24] = var18 + 1;
												class193.bufferY[var24] = var19;
												var24 = var24 + 1 & 4095;
												class193.directions[var20 + 1][var21] = 8;
												class193.distances[var20 + 1][var21] = var29;
											}
											if (var21 > 0 && class193.directions[var20][var21 - 1] == 0 && (var26[var27][var28 - 1] & 19136782) == 0 && (var26[var27 + 1][var28 - 1] & 19136899) == 0) {
												class193.bufferX[var24] = var18;
												class193.bufferY[var24] = var19 - 1;
												var24 = var24 + 1 & 4095;
												class193.directions[var20][var21 - 1] = 1;
												class193.distances[var20][var21 - 1] = var29;
											}
											if (var21 < 126 && class193.directions[var20][var21 + 1] == 0 && (var26[var27][var28 + 2] & 19136824) == 0 && (var26[var27 + 1][var28 + 2] & 19136992) == 0) {
												class193.bufferX[var24] = var18;
												class193.bufferY[var24] = var19 + 1;
												var24 = var24 + 1 & 4095;
												class193.directions[var20][var21 + 1] = 4;
												class193.distances[var20][var21 + 1] = var29;
											}
											if (var20 > 0 && var21 > 0 && class193.directions[var20 - 1][var21 - 1] == 0 && (var26[var27 - 1][var28] & 19136830) == 0 && (var26[var27 - 1][var28 - 1] & 19136782) == 0 && (var26[var27][var28 - 1] & 19136911) == 0) {
												class193.bufferX[var24] = var18 - 1;
												class193.bufferY[var24] = var19 - 1;
												var24 = var24 + 1 & 4095;
												class193.directions[var20 - 1][var21 - 1] = 3;
												class193.distances[var20 - 1][var21 - 1] = var29;
											}
											if (var20 < 126 && var21 > 0 && class193.directions[var20 + 1][var21 - 1] == 0 && (var26[var27 + 1][var28 - 1] & 19136911) == 0 && (var26[var27 + 2][var28 - 1] & 19136899) == 0 && (var26[var27 + 2][var28] & 19136995) == 0) {
												class193.bufferX[var24] = var18 + 1;
												class193.bufferY[var24] = var19 - 1;
												var24 = var24 + 1 & 4095;
												class193.directions[var20 + 1][var21 - 1] = 9;
												class193.distances[var20 + 1][var21 - 1] = var29;
											}
											if (var20 > 0 && var21 < 126 && class193.directions[var20 - 1][var21 + 1] == 0 && (var26[var27 - 1][var28 + 1] & 19136830) == 0 && (var26[var27 - 1][var28 + 2] & 19136824) == 0 && (var26[var27][var28 + 2] & 19137016) == 0) {
												class193.bufferX[var24] = var18 - 1;
												class193.bufferY[var24] = var19 + 1;
												var24 = var24 + 1 & 4095;
												class193.directions[var20 - 1][var21 + 1] = 6;
												class193.distances[var20 - 1][var21 + 1] = var29;
											}
											if (var20 < 126 && var21 < 126 && class193.directions[var20 + 1][var21 + 1] == 0 && (var26[var27 + 1][var28 + 2] & 19137016) == 0 && (var26[var27 + 2][var28 + 2] & 19136992) == 0 && (var26[var27 + 2][var28 + 1] & 19136995) == 0) {
												class193.bufferX[var24] = var18 + 1;
												class193.bufferY[var24] = var19 + 1;
												var24 = var24 + 1 & 4095;
												class193.directions[var20 + 1][var21 + 1] = 12;
												class193.distances[var20 + 1][var21 + 1] = var29;
											}
										} 
										var36 = var37;
									} else {
										var18 = var6;
										var19 = var7;
										byte var38 = 64;
										var39 = 64;
										var22 = var6 - var38;
										var23 = var7 - var39;
										class193.directions[var38][var39] = 99;
										class193.distances[var38][var39] = 0;
										byte var41 = 0;
										var25 = 0;
										class193.bufferX[var41] = var6;
										var24 = var41 + 1;
										class193.bufferY[var41] = var7;
										var26 = var13.flags;
										label706 : while (true) {
											label704 : while (true) {
												do {
													do {
														do {
															label681 : do {
																if (var25 == var24) {
																	class352.field4222 = var18;
																	DirectByteArrayCopier.field3302 = var19;
																	var37 = false;
																	break label706;
																}
																var18 = class193.bufferX[var25];
																var19 = class193.bufferY[var25];
																var25 = var25 + 1 & 4095;
																var20 = var18 - var22;
																var21 = var19 - var23;
																var27 = var18 - var13.xInset;
																var28 = var19 - var13.yInset;
																if (var12.hasArrived(var10, var18, var19, var13)) {
																	class352.field4222 = var18;
																	DirectByteArrayCopier.field3302 = var19;
																	var37 = true;
																	break label706;
																}
																var29 = class193.distances[var20][var21] + 1;
																if (var20 > 0 && class193.directions[var20 - 1][var21] == 0 && (var26[var27 - 1][var28] & 19136782) == 0 && (var26[var27 - 1][var10 + var28 - 1] & 19136824) == 0) {
																	var30 = 1;
																	while (true) {
																		if (var30 >= var10 - 1) {
																			class193.bufferX[var24] = var18 - 1;
																			class193.bufferY[var24] = var19;
																			var24 = var24 + 1 & 4095;
																			class193.directions[var20 - 1][var21] = 2;
																			class193.distances[var20 - 1][var21] = var29;
																			break;
																		}
																		if ((var26[var27 - 1][var30 + var28] & 19136830) != 0) {
																			break;
																		}
																		++var30;
																	} 
																}
																if (var20 < 128 - var10 && class193.directions[var20 + 1][var21] == 0 && (var26[var10 + var27][var28] & 19136899) == 0 && (var26[var10 + var27][var28 + var10 - 1] & 19136992) == 0) {
																	var30 = 1;
																	while (true) {
																		if (var30 >= var10 - 1) {
																			class193.bufferX[var24] = var18 + 1;
																			class193.bufferY[var24] = var19;
																			var24 = var24 + 1 & 4095;
																			class193.directions[var20 + 1][var21] = 8;
																			class193.distances[var20 + 1][var21] = var29;
																			break;
																		}
																		if ((var26[var10 + var27][var28 + var30] & 19136995) != 0) {
																			break;
																		}
																		++var30;
																	} 
																}
																if (var21 > 0 && class193.directions[var20][var21 - 1] == 0 && (var26[var27][var28 - 1] & 19136782) == 0 && (var26[var27 + var10 - 1][var28 - 1] & 19136899) == 0) {
																	var30 = 1;
																	while (true) {
																		if (var30 >= var10 - 1) {
																			class193.bufferX[var24] = var18;
																			class193.bufferY[var24] = var19 - 1;
																			var24 = var24 + 1 & 4095;
																			class193.directions[var20][var21 - 1] = 1;
																			class193.distances[var20][var21 - 1] = var29;
																			break;
																		}
																		if ((var26[var30 + var27][var28 - 1] & 19136911) != 0) {
																			break;
																		}
																		++var30;
																	} 
																}
																if (var21 < 128 - var10 && class193.directions[var20][var21 + 1] == 0 && (var26[var27][var10 + var28] & 19136824) == 0 && (var26[var10 + var27 - 1][var28 + var10] & 19136992) == 0) {
																	var30 = 1;
																	while (true) {
																		if (var30 >= var10 - 1) {
																			class193.bufferX[var24] = var18;
																			class193.bufferY[var24] = var19 + 1;
																			var24 = var24 + 1 & 4095;
																			class193.directions[var20][var21 + 1] = 4;
																			class193.distances[var20][var21 + 1] = var29;
																			break;
																		}
																		if ((var26[var30 + var27][var28 + var10] & 19137016) != 0) {
																			break;
																		}
																		++var30;
																	} 
																}
																if (var20 > 0 && var21 > 0 && class193.directions[var20 - 1][var21 - 1] == 0 && (var26[var27 - 1][var28 - 1] & 19136782) == 0) {
																	var30 = 1;
																	while (true) {
																		if (var30 >= var10) {
																			class193.bufferX[var24] = var18 - 1;
																			class193.bufferY[var24] = var19 - 1;
																			var24 = var24 + 1 & 4095;
																			class193.directions[var20 - 1][var21 - 1] = 3;
																			class193.distances[var20 - 1][var21 - 1] = var29;
																			break;
																		}
																		if ((var26[var27 - 1][var30 + (var28 - 1)] & 19136830) != 0 || (var26[var30 + (var27 - 1)][var28 - 1] & 19136911) != 0) {
																			break;
																		}
																		++var30;
																	} 
																}
																if (var20 < 128 - var10 && var21 > 0 && class193.directions[var20 + 1][var21 - 1] == 0 && (var26[var27 + var10][var28 - 1] & 19136899) == 0) {
																	var30 = 1;
																	while (true) {
																		if (var30 >= var10) {
																			class193.bufferX[var24] = var18 + 1;
																			class193.bufferY[var24] = var19 - 1;
																			var24 = var24 + 1 & 4095;
																			class193.directions[var20 + 1][var21 - 1] = 9;
																			class193.distances[var20 + 1][var21 - 1] = var29;
																			break;
																		}
																		if ((var26[var27 + var10][var30 + (var28 - 1)] & 19136995) != 0 || (var26[var30 + var27][var28 - 1] & 19136911) != 0) {
																			break;
																		}
																		++var30;
																	} 
																}
																if (var20 > 0 && var21 < 128 - var10 && class193.directions[var20 - 1][var21 + 1] == 0 && (var26[var27 - 1][var28 + var10] & 19136824) == 0) {
																	for (var30 = 1; var30 < var10; ++var30) {
																		if ((var26[var27 - 1][var28 + var30] & 19136830) != 0 || (var26[var30 + (var27 - 1)][var10 + var28] & 19137016) != 0) {
																			continue label681;
																		}
																	}
																	class193.bufferX[var24] = var18 - 1;
																	class193.bufferY[var24] = var19 + 1;
																	var24 = var24 + 1 & 4095;
																	class193.directions[var20 - 1][var21 + 1] = 6;
																	class193.distances[var20 - 1][var21 + 1] = var29;
																}
															} while (var20 >= 128 - var10 );
														} while (var21 >= 128 - var10 );
													} while (class193.directions[var20 + 1][var21 + 1] != 0 );
												} while ((var26[var27 + var10][var10 + var28] & 19136992) != 0 );
												for (var30 = 1; var30 < var10; ++var30) {
													if ((var26[var30 + var27][var28 + var10] & 19137016) != 0 || (var26[var10 + var27][var30 + var28] & 19136995) != 0) {
														continue label704;
													}
												}
												class193.bufferX[var24] = var18 + 1;
												class193.bufferY[var24] = var19 + 1;
												var24 = var24 + 1 & 4095;
												class193.directions[var20 + 1][var21 + 1] = 12;
												class193.distances[var20 + 1][var21 + 1] = var29;
											} 
										} 
										var36 = var37;
									}
								}
								int var9;
								label761 : {
									var17 = var6 - 64;
									var18 = var7 - 64;
									var19 = class352.field4222;
									var20 = DirectByteArrayCopier.field3302;
									if (!var36) {
										var21 = Integer.MAX_VALUE;
										var22 = Integer.MAX_VALUE;
										byte var40 = 10;
										var24 = var12.approxDestinationX;
										var25 = var12.approxDestinationY;
										int var35 = var12.approxDestinationSizeX;
										var27 = var12.approxDestinationSizeY;
										for (var28 = var24 - var40; var28 <= var24 + var40; ++var28) {
											for (var29 = var25 - var40; var29 <= var40 + var25; ++var29) {
												var30 = var28 - var17;
												int var31 = var29 - var18;
												if (var30 >= 0 && var31 >= 0 && var30 < 128 && var31 < 128 && class193.distances[var30][var31] < 100) {
													int var32 = 0;
													if (var28 < var24) {
														var32 = var24 - var28;
													} else if (var28 > var35 + var24 - 1) {
														var32 = var28 - (var35 + var24 - 1);
													}
													int var33 = 0;
													if (var29 < var25) {
														var33 = var25 - var29;
													} else if (var29 > var27 + var25 - 1) {
														var33 = var29 - (var25 + var27 - 1);
													}
													int var34 = var33 * var33 + var32 * var32;
													if (var34 < var21 || var34 == var21 && class193.distances[var30][var31] < var22) {
														var21 = var34;
														var22 = class193.distances[var30][var31];
														var19 = var28;
														var20 = var29;
													}
												}
											}
										}
										if (var21 == Integer.MAX_VALUE) {
											var9 = -1;
											break label761;
										}
									}
									if (var19 == var6 && var7 == var20) {
										var14[0] = var19;
										var15[0] = var20;
										var9 = 0;
									} else {
										var39 = 0;
										class193.bufferX[var39] = var19;
										var21 = var39 + 1;
										class193.bufferY[var39] = var20;
										for (var22 = var23 = class193.directions[var19 - var17][var20 - var18]; var6 != var19 || var7 != var20; var22 = class193.directions[var19 - var17][var20 - var18]) {
											if (var22 != var23) {
												var23 = var22;
												class193.bufferX[var21] = var19;
												class193.bufferY[var21++] = var20;
											}
											if ((var22 & 2) != 0) {
												++var19;
											} else if ((var22 & 8) != 0) {
												--var19;
											}
											if ((var22 & 1) != 0) {
												++var20;
											} else if ((var22 & 4) != 0) {
												--var20;
											}
										}
										var24 = 0;
										while (var21-- > 0) {
											var14[var24] = class193.bufferX[var21];
											var15[var24++] = class193.bufferY[var21];
											if (var24 >= var14.length) {
												break;
											}
										} 
										var9 = var24;
									}
								}
								var16 = var9;
								if (var9 < 1) {
									break;
								}
								var17 = 0;
								while (true) {
									if (var17 >= var16 - 1) {
										break label720;
									}
									var4.method2205(Client.field778[var17], Client.field779[var17], var5);
									++var17;
								} 
							}
							for (var17 = 0; var17 < 128; ++var17) {
								class193.directions[var16][var17] = 0;
								class193.distances[var16][var17] = 99999999;
							}
							++var16;
						} 
					}
				}
				this.method2205(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-2061690773")
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1203 = 0;
		super.field1142 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = var3 * 64 + super.pathX[0] * 128;
		super.y = super.pathY[0] * 128 + var3 * 64;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(IILgl;I)V", garbageValue = "985982243")
	final void method2205(int var1, int var2, class192 var3) {
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

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2042091468")
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-287248166")
	static final int method2211() {
		return Client.menuOptionsCount - 1;
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "598283870")
	static final void method2248(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class260.clientPreferences.updateSoundEffectVolume(var0);
	}
}