import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("uv")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqo;"
	)
	@Export("username")
	Username username;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lke;"
	)
	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -735871189
	)
	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 146218787
	)
	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("w")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -121558489
	)
	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -322700721
	)
	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1264926313
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 434736947
	)
	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1265833721
	)
	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -693023053
	)
	int field1106;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -804495425
	)
	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1664895721
	)
	int field1096;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("model0")
	Model model0;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 990797689
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -238809261
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1079075195
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1370658303
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("e")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1049846371
	)
	@Export("team")
	int team;
	@ObfuscatedName("y")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1679440569
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1338774963
	)
	@Export("index")
	int index;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("ac")
	boolean field1103;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1166558487
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1558610431
	)
	@Export("tileY")
	int tileY;

	Player() {
		this.headIconPk = -1; // L: 20
		this.headIconPrayer = -1; // L: 21
		this.actions = new String[3]; // L: 23

		for (int var1 = 0; var1 < 3; ++var1) { // L: 26
			this.actions[var1] = "";
		}

		this.combatLevel = 0; // L: 29
		this.skillLevel = 0; // L: 30
		this.animationCycleStart = 0; // L: 32
		this.animationCycleEnd = 0; // L: 33
		this.isUnanimated = false; // L: 42
		this.team = 0; // L: 43
		this.isHidden = false; // L: 44
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 47
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 48
		this.isInClanChat = TriBool.TriBool_unknown; // L: 49
		this.field1103 = false; // L: 50
	} // L: 54

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;S)V",
		garbageValue = "-25477"
	)
	@Export("read")
	final void read(Buffer var1) {
		var1.offset = 0; // L: 57
		int var2 = var1.readUnsignedByte(); // L: 58
		this.headIconPk = var1.readByte(); // L: 59
		this.headIconPrayer = var1.readByte(); // L: 60
		int var3 = -1; // L: 61
		this.team = 0; // L: 62
		int[] var4 = new int[12]; // L: 63

		int var6;
		int var7;
		int var8;
		for (int var5 = 0; var5 < 12; ++var5) { // L: 64
			var6 = var1.readUnsignedByte(); // L: 65
			if (var6 == 0) { // L: 66
				var4[var5] = 0; // L: 67
			} else {
				var7 = var1.readUnsignedByte(); // L: 70
				var4[var5] = var7 + (var6 << 8); // L: 71
				if (var5 == 0 && var4[0] == 65535) { // L: 72
					var3 = var1.readUnsignedShort(); // L: 73
					break;
				}

				if (var4[var5] >= 512) { // L: 76
					var8 = UserComparator3.ItemDefinition_get(var4[var5] - 512).team; // L: 77
					if (var8 != 0) { // L: 78
						this.team = var8;
					}
				}
			}
		}

		int[] var24 = new int[5]; // L: 81

		for (var6 = 0; var6 < 5; ++var6) { // L: 82
			var7 = var1.readUnsignedByte(); // L: 83
			if (var7 < 0 || var7 >= class358.field4279[var6].length) { // L: 84
				var7 = 0;
			}

			var24[var6] = var7; // L: 85
		}

		super.idleSequence = var1.readUnsignedShort(); // L: 87
		if (super.idleSequence == 65535) { // L: 88
			super.idleSequence = -1;
		}

		super.turnLeftSequence = var1.readUnsignedShort(); // L: 89
		if (super.turnLeftSequence == 65535) { // L: 90
			super.turnLeftSequence = -1;
		}

		super.turnRightSequence = super.turnLeftSequence; // L: 91
		super.walkSequence = var1.readUnsignedShort(); // L: 92
		if (super.walkSequence == 65535) { // L: 93
			super.walkSequence = -1;
		}

		super.walkBackSequence = var1.readUnsignedShort(); // L: 94
		if (super.walkBackSequence == 65535) { // L: 95
			super.walkBackSequence = -1;
		}

		super.walkLeftSequence = var1.readUnsignedShort(); // L: 96
		if (super.walkLeftSequence == 65535) { // L: 97
			super.walkLeftSequence = -1;
		}

		super.walkRightSequence = var1.readUnsignedShort(); // L: 98
		if (super.walkRightSequence == 65535) { // L: 99
			super.walkRightSequence = -1;
		}

		super.runSequence = var1.readUnsignedShort(); // L: 100
		if (super.runSequence == 65535) { // L: 101
			super.runSequence = -1;
		}

		this.username = new Username(var1.readStringCp1252NullTerminated(), Players.loginType); // L: 102
		this.clearIsFriend(); // L: 103
		this.clearIsInFriendsChat(); // L: 104
		this.method2278(); // L: 105
		if (this == class67.localPlayer) { // L: 106
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte(); // L: 107
		this.skillLevel = var1.readUnsignedShort(); // L: 108
		this.isHidden = var1.readUnsignedByte() == 1; // L: 109
		if (Client.gameBuild == 0 && Client.staffModLevel >= 2) { // L: 110
			this.isHidden = false;
		}

		PlayerCompositionColorTextureOverride[] var25 = null; // L: 111
		boolean var26 = false; // L: 112
		var8 = var1.readUnsignedShort(); // L: 113
		var26 = (var8 >> 15 & 1) == 1; // L: 114
		int var9;
		if (var8 > 0 && var8 != 32768) { // L: 115
			var25 = new PlayerCompositionColorTextureOverride[12]; // L: 116

			for (var9 = 0; var9 < 12; ++var9) { // L: 117
				int var10 = var8 >> 12 - var9 & 1; // L: 118
				if (var10 == 1) { // L: 119
					int var14 = var4[var9] - 512; // L: 123
					int var15 = var1.readUnsignedByte(); // L: 125
					boolean var16 = (var15 & 1) != 0; // L: 126
					boolean var17 = (var15 & 2) != 0; // L: 127
					PlayerCompositionColorTextureOverride var18 = new PlayerCompositionColorTextureOverride(var14); // L: 128
					int var19;
					int[] var20;
					boolean var21;
					int var22;
					short var23;
					if (var16) { // L: 129
						var19 = var1.readUnsignedByte(); // L: 130
						var20 = new int[]{var19 & 15, var19 >> 4 & 15}; // L: 131 132 133
						var21 = var18.playerCompositionRecolorTo != null && var20.length == var18.playerCompositionRecolorTo.length; // L: 134

						for (var22 = 0; var22 < 2; ++var22) { // L: 135
							if (var20[var22] != 15) { // L: 136
								var23 = (short)var1.readUnsignedShort(); // L: 137
								if (var21) { // L: 138
									var18.playerCompositionRecolorTo[var20[var22]] = var23; // L: 139
								}
							}
						}
					}

					if (var17) { // L: 144
						var19 = var1.readUnsignedByte(); // L: 145
						var20 = new int[]{var19 & 15, var19 >> 4 & 15}; // L: 146 147 148
						var21 = var18.playerCompositionRetextureTo != null && var20.length == var18.playerCompositionRetextureTo.length; // L: 149

						for (var22 = 0; var22 < 2; ++var22) { // L: 150
							if (var20[var22] != 15) { // L: 151
								var23 = (short)var1.readUnsignedShort(); // L: 152
								if (var21) { // L: 153
									var18.playerCompositionRetextureTo[var20[var22]] = var23; // L: 154
								}
							}
						}
					}

					var25[var9] = var18; // L: 161
				}
			}
		}

		if (var1.offset < var1.array.length) { // L: 165
			for (var9 = 0; var9 < 3; ++var9) { // L: 166
				this.actions[var9] = var1.readStringCp1252NullTerminated(); // L: 167
			}
		}

		if (this.appearance == null) { // L: 170
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5727(var4, var25, var26, var24, var2 == 1, var3); // L: 171
	} // L: 172

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Lha;",
		garbageValue = "13"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) { // L: 235
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class4.SequenceDefinition_get(super.sequence) : null; // L: 236
			SequenceDefinition var2 = super.movementSequence == -1 || this.isUnanimated || super.idleSequence == super.movementSequence && var1 != null ? null : class4.SequenceDefinition_get(super.movementSequence); // L: 237
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 238
			if (var3 == null) { // L: 239
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 240
				super.defaultHeight = var3.height; // L: 241
				int var4 = var3.indicesCount; // L: 242
				Model var5;
				Model[] var6;
				if (!this.isUnanimated && super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 243
					var5 = class308.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 244
					if (var5 != null) { // L: 245
						var5.offsetBy(0, -super.spotAnimationHeight, 0); // L: 246
						var6 = new Model[]{var3, var5}; // L: 247
						var3 = new Model(var6, 2); // L: 248
					}
				}

				if (!this.isUnanimated && this.model0 != null) { // L: 251
					if (Client.cycle >= this.animationCycleEnd) { // L: 252
						this.model0 = null;
					}

					if (Client.cycle >= this.animationCycleStart && Client.cycle < this.animationCycleEnd) { // L: 253
						var5 = this.model0; // L: 254
						var5.offsetBy(this.field1106 * 4096 - super.x, this.tileHeight2 - this.tileHeight, this.field1096 * 4096 - super.y); // L: 255
						if (super.orientation == 512) { // L: 256
							var5.rotateY90Ccw(); // L: 257
							var5.rotateY90Ccw(); // L: 258
							var5.rotateY90Ccw(); // L: 259
						} else if (super.orientation == 1024) { // L: 261
							var5.rotateY90Ccw(); // L: 262
							var5.rotateY90Ccw(); // L: 263
						} else if (super.orientation == 1536) { // L: 265
							var5.rotateY90Ccw();
						}

						var6 = new Model[]{var3, var5}; // L: 266
						var3 = new Model(var6, 2); // L: 267
						if (super.orientation == 512) { // L: 268
							var5.rotateY90Ccw();
						} else if (super.orientation == 1024) { // L: 269
							var5.rotateY90Ccw(); // L: 270
							var5.rotateY90Ccw(); // L: 271
						} else if (super.orientation == 1536) { // L: 273
							var5.rotateY90Ccw(); // L: 274
							var5.rotateY90Ccw(); // L: 275
							var5.rotateY90Ccw(); // L: 276
						}

						var5.offsetBy(super.x - this.field1106 * 4096, this.tileHeight - this.tileHeight2, super.y - this.field1096 * 4096); // L: 278
					}
				}

				var3.isSingleTile = true;
				if (super.field1194 != 0 && Client.cycle >= super.field1188 && Client.cycle < super.field1158) { // L: 282
					var3.overrideHue = super.field1190;
					var3.overrideSaturation = super.field1191;
					var3.overrideLuminance = super.field1169; // L: 285
					var3.overrideAmount = super.field1194;
					var3.field2618 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2136490279"
	)
	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) { // L: 175
			this.checkIsFriend(); // L: 176
		}

		return this.isFriendTriBool == TriBool.TriBool_true; // L: 178
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-637129255"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown; // L: 182
	} // L: 183

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = Varps.friendSystem.isFriendAndHasWorld(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 186
	} // L: 187

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1351288382"
	)
	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) { // L: 190
			this.updateIsInFriendsChat(); // L: 191
		}

		return this.isInFriendsChat == TriBool.TriBool_true; // L: 193
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-852374348"
	)
	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown; // L: 197
	} // L: 198

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-653943417"
	)
	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = class145.friendsChat != null && class145.friendsChat.contains(this.username) ? TriBool.TriBool_true : TriBool.TriBool_false; // L: 201
	} // L: 202

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "86"
	)
	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 4; ++var1) { // L: 205
			if (Client.currentClanSettings[var1] != null && Client.currentClanSettings[var1].method3134(this.username.getName()) != -1 && var1 != 2) { // L: 206 207
				this.isInClanChat = TriBool.TriBool_true; // L: 208
				return; // L: 209
			}
		}

		this.isInClanChat = TriBool.TriBool_false; // L: 213
	} // L: 214

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "270390520"
	)
	void method2278() {
		this.isInClanChat = TriBool.TriBool_unknown; // L: 217
	} // L: 218

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) { // L: 221
			this.updateIsInClanChat(); // L: 222
		}

		return this.isInClanChat == TriBool.TriBool_true; // L: 224
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-940037059"
	)
	@Export("transformedSize")
	int transformedSize() {
		return this.appearance != null && this.appearance.npcTransformId != -1 ? class193.getNpcDefinition(this.appearance.npcTransformId).size : 1; // L: 228 229 231
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IILga;B)V",
		garbageValue = "62"
	)
	final void method2282(int var1, int var2, class193 var3) {
		if (super.sequence != -1 && class4.SequenceDefinition_get(super.sequence).field2218 == 1) { // L: 296
			super.sequence = -1;
		}

		super.field1163 = -1; // L: 297
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) { // L: 298
			if (super.pathX[0] >= 0 && super.pathX[0] < 104 && super.pathY[0] >= 0 && super.pathY[0] < 104) { // L: 299
				if (var3 == class193.field2247) { // L: 301
					Player var4 = this; // L: 302
					class193 var5 = class193.field2247; // L: 303
					int var6 = super.pathX[0]; // L: 305
					int var7 = super.pathY[0]; // L: 306
					int var8 = this.transformedSize(); // L: 307
					if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && var1 >= var8 && var1 < 104 - var8 && var2 >= var8 && var2 < 104 - var8) { // L: 308 309
						int var10 = this.transformedSize(); // L: 311
						RouteStrategy var11 = Client.method1724(var1, var2); // L: 312
						CollisionMap var12 = Client.collisionMaps[this.plane]; // L: 313
						int[] var13 = Client.field787; // L: 314
						int[] var14 = Client.field788; // L: 315
						int var15 = 0;

						label242:
						while (true) {
							int var16;
							if (var15 >= 128) {
								boolean var34;
								if (var10 == 1) { // L: 324
									var34 = class19.method287(var6, var7, var11, var12);
								} else if (var10 == 2) { // L: 325
									var34 = TaskHandler.method3431(var6, var7, var11, var12);
								} else {
									var34 = class271.method5376(var6, var7, var10, var11, var12); // L: 326
								}

								int var9;
								label263: {
									var16 = var6 - 64; // L: 327
									int var17 = var7 - 64; // L: 328
									int var18 = Bounds.field4422; // L: 329
									int var19 = class347.field4205; // L: 330
									int var20;
									int var21;
									int var23;
									if (!var34) { // L: 331
										var20 = Integer.MAX_VALUE; // L: 333
										var21 = Integer.MAX_VALUE; // L: 334
										byte var22 = 10; // L: 335
										var23 = var11.approxDestinationX; // L: 336
										int var24 = var11.approxDestinationY; // L: 337
										int var25 = var11.approxDestinationSizeX; // L: 338
										int var26 = var11.approxDestinationSizeY; // L: 339

										for (int var27 = var23 - var22; var27 <= var22 + var23; ++var27) { // L: 340
											for (int var28 = var24 - var22; var28 <= var24 + var22; ++var28) { // L: 341
												int var29 = var27 - var16; // L: 342
												int var30 = var28 - var17; // L: 343
												if (var29 >= 0 && var30 >= 0 && var29 < 128 && var30 < 128 && class194.distances[var29][var30] < 100) { // L: 344 345
													int var31 = 0; // L: 346
													if (var27 < var23) { // L: 347
														var31 = var23 - var27;
													} else if (var27 > var23 + var25 - 1) { // L: 348
														var31 = var27 - (var23 + var25 - 1);
													}

													int var32 = 0; // L: 349
													if (var28 < var24) { // L: 350
														var32 = var24 - var28;
													} else if (var28 > var24 + var26 - 1) { // L: 351
														var32 = var28 - (var26 + var24 - 1);
													}

													int var33 = var32 * var32 + var31 * var31; // L: 352
													if (var33 < var20 || var33 == var20 && class194.distances[var29][var30] < var21) { // L: 353
														var20 = var33; // L: 354
														var21 = class194.distances[var29][var30]; // L: 355
														var18 = var27; // L: 356
														var19 = var28; // L: 357
													}
												}
											}
										}

										if (var20 == Integer.MAX_VALUE) { // L: 363
											var9 = -1; // L: 364
											break label263;
										}
									}

									if (var6 == var18 && var19 == var7) { // L: 373
										var13[0] = var18; // L: 374
										var14[0] = var19; // L: 375
										var9 = 0; // L: 376
									} else {
										byte var36 = 0; // L: 379
										class194.bufferX[var36] = var18; // L: 382
										var20 = var36 + 1;
										class194.bufferY[var36] = var19; // L: 383

										int var37;
										for (var21 = var37 = class194.directions[var18 - var16][var19 - var17]; var6 != var18 || var19 != var7; var21 = class194.directions[var18 - var16][var19 - var17]) { // L: 384 385 395
											if (var37 != var21) { // L: 386
												var37 = var21; // L: 387
												class194.bufferX[var20] = var18; // L: 388
												class194.bufferY[var20++] = var19; // L: 389
											}

											if ((var21 & 2) != 0) { // L: 391
												++var18;
											} else if ((var21 & 8) != 0) { // L: 392
												--var18;
											}

											if ((var21 & 1) != 0) { // L: 393
												++var19;
											} else if ((var21 & 4) != 0) { // L: 394
												--var19;
											}
										}

										var23 = 0; // L: 397

										while (var20-- > 0) { // L: 398
											var13[var23] = class194.bufferX[var20]; // L: 399
											var14[var23++] = class194.bufferY[var20]; // L: 400
											if (var23 >= var13.length) { // L: 401
												break;
											}
										}

										var9 = var23; // L: 403
									}
								}

								var15 = var9; // L: 405
								if (var9 < 1) { // L: 406
									break;
								}

								var16 = 0; // L: 407

								while (true) {
									if (var16 >= var15 - 1) {
										break label242;
									}

									var4.method2287(Client.field787[var16], Client.field788[var16], var5);
									++var16;
								}
							}

							for (var16 = 0; var16 < 128; ++var16) { // L: 318
								class194.directions[var15][var16] = 0; // L: 319
								class194.distances[var15][var16] = 99999999; // L: 320
							}

							++var15; // L: 317
						}
					}
				}

				this.method2287(var1, var2, var3); // L: 410
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	} // L: 412

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-3"
	)
	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0; // L: 415
		super.field1202 = 0; // L: 416
		super.field1201 = 0; // L: 417
		super.pathX[0] = var1; // L: 418
		super.pathY[0] = var2; // L: 419
		int var3 = this.transformedSize(); // L: 420
		super.x = var3 * 64 + super.pathX[0] * 128; // L: 421
		super.y = var3 * 64 + super.pathY[0] * 128; // L: 422
	} // L: 423

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IILga;B)V",
		garbageValue = "72"
	)
	final void method2287(int var1, int var2, class193 var3) {
		if (super.pathLength < 9) { // L: 426
			++super.pathLength;
		}

		for (int var4 = super.pathLength; var4 > 0; --var4) { // L: 427
			super.pathX[var4] = super.pathX[var4 - 1]; // L: 428
			super.pathY[var4] = super.pathY[var4 - 1]; // L: 429
			super.pathTraversed[var4] = super.pathTraversed[var4 - 1]; // L: 430
		}

		super.pathX[0] = var1; // L: 432
		super.pathY[0] = var2; // L: 433
		super.pathTraversed[0] = var3; // L: 434
	} // L: 435

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-77"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null; // L: 438
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-1682167537"
	)
	static void method2324(File var0) {
		FileSystem.FileSystem_cacheDir = var0; // L: 16
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Llv;IS)V",
		garbageValue = "256"
	)
	static void method2322(AbstractArchive var0, int var1) {
		if ((var1 & 536870912) != 0) { // L: 280
			MilliClock.logoSprite = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", ""); // L: 281
		} else if ((var1 & 1073741824) != 0) { // L: 283
			MilliClock.logoSprite = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", ""); // L: 284
		} else if ((var1 & 256) != 0) { // L: 286
			MilliClock.logoSprite = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", ""); // L: 287
		} else {
			MilliClock.logoSprite = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var0, "logo", ""); // L: 290
		}

	} // L: 292
}
