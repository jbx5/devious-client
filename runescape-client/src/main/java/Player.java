




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("Player")
public final class Player extends Actor {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lqb;")

	@Export("username")
	Username username;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lkp;")

	@Export("appearance")
	PlayerComposition appearance;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-340980975)

	@Export("headIconPk")
	int headIconPk;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-2075940565)

	@Export("headIconPrayer")
	int headIconPrayer;
	@ObfuscatedName("n")
	@Export("actions")
	String[] actions;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	940198705)

	@Export("combatLevel")
	int combatLevel;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1876948275)

	@Export("skillLevel")
	int skillLevel;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	1793810743)

	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1130612929)

	@Export("animationCycleStart")
	int animationCycleStart;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	38935459)

	@Export("animationCycleEnd")
	int animationCycleEnd;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	249721451)

	int field1080;
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 
	-1209305495)

	@Export("tileHeight2")
	int tileHeight2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-1724112821)

	int field1082;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Liq;")

	@Export("model0")
	Model model0;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	593217569)

	@Export("minX")
	int minX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	-1371594921)

	@Export("minY")
	int minY;
	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 
	-1538239)

	@Export("maxX")
	int maxX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-1112469711)

	@Export("maxY")
	int maxY;
	@ObfuscatedName("x")
	@Export("isUnanimated")
	boolean isUnanimated;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	-1892679033)

	@Export("team")
	int team;
	@ObfuscatedName("y")
	@Export("isHidden")
	boolean isHidden;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	-181716259)

	@Export("plane")
	int plane;
	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	-567529937)

	@Export("index")
	int index;
	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("isFriendTriBool")
	TriBool isFriendTriBool;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("isInFriendsChat")
	TriBool isInFriendsChat;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"Lni;")

	@Export("isInClanChat")
	TriBool isInClanChat;
	@ObfuscatedName("aq")
	boolean field1070;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = 
	-1041685371)

	@Export("tileX")
	int tileX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 
	-1747269173)

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
		this.field1070 = false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-1242087125")

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
				if ((var5 == 0) && (var4[0] == 65535)) {
					var3 = var1.readUnsignedShort();
					break;
				}

				if (var4[var5] >= 512) {
					var8 = class19.ItemDefinition_get(var4[var5] - 512).team;
					if (var8 != 0) {
						this.team = var8;
					}
				}
			}
		}

		int[] var11 = new int[5];

		for (var6 = 0; var6 < 5; ++var6) {
			var7 = var1.readUnsignedByte();
			if ((var7 < 0) || (var7 >= class144.field1629[var6].length)) {
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

		this.username = new Username(var1.readStringCp1252NullTerminated(), class122.loginType);
		this.clearIsFriend();
		this.clearIsInFriendsChat();
		this.method2121();
		if (this == GrandExchangeEvents.localPlayer) {
			RunException.localPlayerName = this.username.getName();
		}

		this.combatLevel = var1.readUnsignedByte();
		this.skillLevel = var1.readUnsignedShort();
		this.isHidden = var1.readUnsignedByte() == 1;
		if ((Client.gameBuild == 0) && (Client.staffModLevel >= 2)) {
			this.isHidden = false;
		}

		class168[] var12 = null;
		boolean var13 = false;
		if (var1.offset < var1.array.length) {
			var8 = var1.readUnsignedShort();
			var13 = ((var8 >> 15) & 1) == 1;
			if ((var8 > 0) && (var8 != 32768)) {
				var12 = new class168[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					int var10 = (var8 >> (12 - var9)) & 1;
					if (var10 == 1) {
						var12[var9] = class349.method6509(var4[var9] - 512, var1);
					}
				}
			}
		}

		if (this.appearance == null) {
			this.appearance = new PlayerComposition();
		}

		this.appearance.method5570(var4, var12, var13, var11, var2 == 1, var3);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)Liq;", garbageValue = 
	"103")

	@Export("getModel")
	protected final Model getModel() {
		if (this.appearance == null) {
			return null;
		} else {
			SequenceDefinition var1 = ((super.sequence != (-1)) && (super.sequenceDelay == 0)) ? class163.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = (((super.movementSequence == (-1)) || this.isUnanimated) || ((super.movementSequence == super.idleSequence) && (var1 != null))) ? null : class163.SequenceDefinition_get(super.movementSequence);
			Model var3 = this.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				Model var4;
				Model[] var5;
				if (((!this.isUnanimated) && (super.spotAnimation != (-1))) && (super.spotAnimationFrame != (-1))) {
					var4 = ClientPreferences.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.spotAnimationHeight, 0);
						var5 = new Model[]{ var3, var4 };
						var3 = new Model(var5, 2);
					}
				}

				if ((!this.isUnanimated) && (this.model0 != null)) {
					if (Client.cycle >= this.animationCycleEnd) {
						this.model0 = null;
					}

					if ((Client.cycle >= this.animationCycleStart) && (Client.cycle < this.animationCycleEnd)) {
						var4 = this.model0;
						var4.offsetBy(this.field1080 - super.x, this.tileHeight2 - this.tileHeight, this.field1082 - super.y);
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

						var4.offsetBy(super.x - this.field1080, this.tileHeight - this.tileHeight2, super.y - this.field1082);
					}
				}

				var3.isSingleTile = true;
				if (((super.field1122 != 0) && (Client.cycle >= super.field1167)) && (Client.cycle < super.field1168)) {
					var3.overrideHue = super.field1169;
					var3.overrideSaturation = super.field1114;
					var3.overrideLuminance = super.field1171;
					var3.overrideAmount = super.field1122;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-2114149890")

	@Export("isFriend")
	boolean isFriend() {
		if (this.isFriendTriBool == TriBool.TriBool_unknown) {
			this.checkIsFriend();
		}

		return this.isFriendTriBool == TriBool.TriBool_true;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-187822721")

	@Export("clearIsFriend")
	void clearIsFriend() {
		this.isFriendTriBool = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-111")

	@Export("checkIsFriend")
	void checkIsFriend() {
		this.isFriendTriBool = (Decimator.friendSystem.isFriendAndHasWorld(this.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"28")

	@Export("isFriendsChatMember")
	boolean isFriendsChatMember() {
		if (this.isInFriendsChat == TriBool.TriBool_unknown) {
			this.updateIsInFriendsChat();
		}

		return this.isInFriendsChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"374589634")

	@Export("clearIsInFriendsChat")
	void clearIsInFriendsChat() {
		this.isInFriendsChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"119")

	@Export("updateIsInFriendsChat")
	void updateIsInFriendsChat() {
		this.isInFriendsChat = ((ClientPacket.friendsChat != null) && ClientPacket.friendsChat.contains(this.username)) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-935029357")

	@Export("updateIsInClanChat")
	void updateIsInClanChat() {
		for (int var1 = 0; var1 < 3; ++var1) {
			if (((Client.currentClanSettings[var1] != null) && (Client.currentClanSettings[var1].method2955(this.username.getName()) != (-1))) && (var1 != 2)) {
				this.isInClanChat = TriBool.TriBool_true;
				return;
			}
		}

		this.isInClanChat = TriBool.TriBool_false;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1132300918")

	void method2121() {
		this.isInClanChat = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1003316934")

	@Export("isClanMember")
	boolean isClanMember() {
		if (this.isInClanChat == TriBool.TriBool_unknown) {
			this.updateIsInClanChat();
		}

		return this.isInClanChat == TriBool.TriBool_true;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-119")

	@Export("transformedSize")
	int transformedSize() {
		return (this.appearance != null) && (this.appearance.npcTransformId != (-1)) ? KeyHandler.getNpcDefinition(this.appearance.npcTransformId).size : 1;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(IILgm;I)V", garbageValue = 
	"626817443")

	final void method2125(int var1, int var2, class193 var3) {
		if ((super.sequence != (-1)) && (class163.SequenceDefinition_get(super.sequence).field2158 == 1)) {
			super.sequence = -1;
		}

		super.field1121 = -1;
		if ((((var1 >= 0) && (var1 < 104)) && (var2 >= 0)) && (var2 < 104)) {
			if ((((super.pathX[0] >= 0) && (super.pathX[0] < 104)) && (super.pathY[0] >= 0)) && (super.pathY[0] < 104)) {
				if (var3 == class193.field2187) {
					class341.method6279(this, var1, var2, class193.field2187);
				}

				this.method2127(var1, var2, var3);
			} else {
				this.resetPath(var1, var2);
			}
		} else {
			this.resetPath(var1, var2);
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"1757316857")

	@Export("resetPath")
	void resetPath(int var1, int var2) {
		super.pathLength = 0;
		super.field1170 = 0;
		super.field1179 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		int var3 = this.transformedSize();
		super.x = (var3 * 64) + (super.pathX[0] * 128);
		super.y = (var3 * 64) + (super.pathY[0] * 128);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(IILgm;B)V", garbageValue = 
	"71")

	final void method2127(int var1, int var2, class193 var3) {
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-323504433")

	@Export("isVisible")
	final boolean isVisible() {
		return this.appearance != null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZB)I", garbageValue = 
	"1")

	static int method2112(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var13 == 0) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var13 == 2) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var13 == 5) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var13 == 1) ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (class83.grandExchangeEvents != null) {
						class83.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (class83.grandExchangeEvents != null) {
						class83.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					Interpreter.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
					if (class83.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						class83.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (class83.grandExchangeEvents != null) {
						class83.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (class83.grandExchangeEvents != null) {
						class83.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class83.grandExchangeEvents == null) ? 0 : class83.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class83.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class83.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class83.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class83.grandExchangeEvents.events.get(var3)));
						long var5 = (class136.method2931() - WorldMapID.field2388) - var4.age;
						int var7 = ((int) (var5 / 3600000L));
						int var8 = ((int) ((var5 - ((long) (var7 * 3600000))) / 60000L));
						int var9 = ((int) (((var5 - ((long) (var7 * 3600000))) - ((long) (var8 * 60000))) / 1000L));
						String var10 = (((((var7 + ":") + (var8 / 10)) + (var8 % 10)) + ":") + (var9 / 10)) + (var9 % 10);
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class83.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class83.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = ((GrandExchangeEvent) (class83.grandExchangeEvents.events.get(var3)));
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}