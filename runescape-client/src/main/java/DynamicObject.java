import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1563928111
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1437264679
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2076222903
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -129198571
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1080493665
	)
	@Export("x")
	final int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 289855771
	)
	@Export("y")
	final int y;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -405582099
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 302909337
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIIIIZLkt;)V"
	)
	DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
		this.worldView = var1;
		this.id = var2;
		this.type = var3;
		this.orientation = var4;
		this.plane = var5;
		this.x = var6;
		this.y = var7;
		if (var8 != -1) {
			this.sequenceDefinition = class353.SequenceDefinition_get(var8);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.restartMode == 0 && var10 instanceof DynamicObject) {
				DynamicObject var11 = (DynamicObject)var10;
				if (this.sequenceDefinition == var11.sequenceDefinition) {
					this.frame = var11.frame;
					this.cycleStart = var11.cycleStart;
					return;
				}
			}

			if (var9 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4059());
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = HttpRequest.getObjectDefinition(this.id);
		if (var1.transforms != null) {
			var1 = var1.transform();
		}

		if (var1 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var1.sizeX;
				var3 = var1.sizeY;
			} else {
				var2 = var1.sizeY;
				var3 = var1.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = this.worldView.tileHeights[this.plane];
			int var9 = var8[var5][var7] + var8[var4][var7] + var8[var5][var6] + var8[var4][var6] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			if (this.sequenceDefinition != null) {
				int var12 = Client.cycle - this.cycleStart;
				if (var12 > 100 && this.sequenceDefinition.frameCount > 0) {
					var12 = 100;
				}

				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					label61: {
						do {
							while (true) {
								if (var12 <= this.sequenceDefinition.frameLengths[this.frame]) {
									break label61;
								}

								var12 -= this.sequenceDefinition.frameLengths[this.frame];
								++this.frame;
								if (this.frame >= this.sequenceDefinition.frameIds.length) {
									this.frame -= this.sequenceDefinition.frameCount;
									break;
								}

								class188.method3684(this.sequenceDefinition, this.frame, var10, var11, false);
							}
						} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

						this.sequenceDefinition = null;
					}
				} else {
					int var13 = this.sequenceDefinition.method4059();
					this.frame += var12;
					var12 = 0;
					if (this.frame >= var13) {
						this.frame = var13 - this.sequenceDefinition.frameCount;
						if (this.frame < 0 || this.frame > var13) {
							this.sequenceDefinition = null;
						}
					}

					if (this.sequenceDefinition != null) {
						WorldMapLabelSize.method4571(this.sequenceDefinition, this.frame, var10, var11, false);
					}
				}

				this.cycleStart = Client.cycle - var12;
			}

			return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Lqi;",
		garbageValue = "72"
	)
	public static class423 method2270() {
		synchronized(class423.field4701) {
			if (class423.field4698 == 0) {
				return new class423();
			} else {
				class423.field4701[--class423.field4698].method7762();
				return class423.field4701[class423.field4698];
			}
		}
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(Ldb;IIIII)V",
		garbageValue = "2048531961"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.index != Client.localPlayerIndex) {
			if (Client.menuOptionsCount < 400) {
				String var5;
				if (var0.skillLevel == 0) {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + Sound.method3908(var0.combatLevel, SoundCache.localPlayer.combatLevel) + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var6;
				if (Client.isItemSelected == 1) {
					WorldMapArea.insertMenuItem("Use", Client.field642 + " " + "->" + " " + NpcOverrides.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((class92.selectedSpellFlags & 8) == 8) {
						WorldMapArea.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + NpcOverrides.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var6 = 7; var6 >= 0; --var6) {
						if (Client.playerMenuActions[var6] != null) {
							short var7 = 0;
							if (Client.playerMenuActions[var6].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > SoundCache.localPlayer.combatLevel) {
									var7 = 2000;
								}

								if (SoundCache.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == SoundCache.localPlayer.team) {
										var7 = 2000;
									} else {
										var7 = 0;
									}
								} else if (AttackOption.field1384 == Client.playerAttackOption && var0.isClanMember()) {
									var7 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var6]) {
								var7 = 2000;
							}

							boolean var8 = false;
							int var9 = Client.playerMenuOpcodes[var6] + var7;
							WorldMapArea.insertMenuItem(Client.playerMenuActions[var6], NpcOverrides.colorStartTag(16777215) + var5, var9, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var6 = 0; var6 < Client.menuOptionsCount; ++var6) {
					if (Client.menuOpcodes[var6] == 23) {
						Client.menuTargets[var6] = NpcOverrides.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}
}
