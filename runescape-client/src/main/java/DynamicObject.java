import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("bo")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Lqu;")
	static IndexedSprite field979;

	@ObfuscatedName("iw")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1798375219)
	@Export("id")
	int id;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1429314391)
	@Export("type")
	int type;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1262653635)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1960172765)
	@Export("plane")
	int plane;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1525281289)
	@Export("x")
	int x;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1977706273)
	@Export("y")
	int y;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Lgc;")
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 896150091)
	@Export("frame")
	int frame;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 1038078247)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(descriptor = "(IIIIIIIZLgj;)V")
	DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
		this.id = var1;
		this.type = var2;
		this.orientation = var3;
		this.plane = var4;
		this.x = var5;
		this.y = var6;
		if (var7 != -1) {
			this.sequenceDefinition = ScriptFrame.SequenceDefinition_get(var7);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.field2174 == 0 && var9 != null && var9 instanceof DynamicObject) {
				DynamicObject var10 = ((DynamicObject) (var9));
				if (this.sequenceDefinition == var10.sequenceDefinition) {
					this.frame = var10.frame;
					this.cycleStart = var10.cycleStart;
					return;
				}
			}
			if (var8 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = ((int) (Math.random() * ((double) (this.sequenceDefinition.frameIds.length))));
					this.cycleStart -= ((int) (Math.random() * ((double) (this.sequenceDefinition.frameLengths[this.frame]))));
				} else {
					this.frame = ((int) (Math.random() * ((double) (this.sequenceDefinition.method3835()))));
				}
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Lhy;", garbageValue = "1081110576")
	@Export("getModel")
	protected final Model getModel() {
		int var2;
		if (this.sequenceDefinition != null) {
			int var1 = Client.cycle - this.cycleStart;
			if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
				var1 = 100;
			}
			if (this.sequenceDefinition.isCachedModelIdSet()) {
				var2 = this.sequenceDefinition.method3835();
				this.frame += var1;
				var1 = 0;
				if (this.frame >= var2) {
					this.frame = var2 - this.sequenceDefinition.frameCount;
					if (this.frame < 0 || this.frame > var2) {
						this.sequenceDefinition = null;
					}
				}
			} else {
				label79 : {
					do {
						do {
							if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
								break label79;
							}
							var1 -= this.sequenceDefinition.frameLengths[this.frame];
							++this.frame;
						} while (this.frame < this.sequenceDefinition.frameIds.length );
						this.frame -= this.sequenceDefinition.frameCount;
					} while (this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length );
					this.sequenceDefinition = null;
				}
			}
			this.cycleStart = Client.cycle - var1;
		}
		ObjectComposition var12 = class162.getObjectDefinition(this.id);
		if (var12.transforms != null) {
			var12 = var12.transform();
		}
		if (var12 == null) {
			return null;
		} else {
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var12.sizeX;
				var3 = var12.sizeY;
			} else {
				var2 = var12.sizeY;
				var3 = var12.sizeX;
			}
			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = Tiles.Tiles_heights[this.plane];
			int var9 = var8[var5][var6] + var8[var4][var6] + var8[var4][var7] + var8[var5][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("c")
	public static final void method1991(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				GrandExchangeOfferAgeComparator.method5989(var0 - 1L);
				try {
					Thread.sleep(1L);
				} catch (InterruptedException var4) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var3) {
				}
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-313188539")
	static int method1987(int var0, Script var1, boolean var2) {
		Widget var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var3.modelTransparency) ? 1 : 0;
			return 1;
		} else if (var0 != 2615 && var0 != 2616) {
			return 2;
		} else {
			++class446.Interpreter_intStackSize;
			return 1;
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(descriptor = "(Lci;IIII)V", garbageValue = "-902983167")
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class101.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = class101.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = class122.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = class122.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = class122.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = class122.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = class122.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = class122.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = class122.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = class122.colorStartTag(12648192);
					} else {
						var6 = class122.colorStartTag(16776960);
					}
					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}
				int var10;
				if (Client.isItemSelected == 1) {
					class4.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + class122.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((HealthBar.selectedSpellFlags & 8) == 8) {
						class4.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class122.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}
								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class101.localPlayer.combatLevel) {
									var11 = 2000;
								}
								if (class101.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class101.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (Client.playerAttackOption == AttackOption.field1294 && var0.isClanMember()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}
							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							class4.insertMenuItemNoShift(Client.playerMenuActions[var10], class122.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}
				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = class122.colorStartTag(16777215) + var4;
						break;
					}
				}
			}
		}
	}
}