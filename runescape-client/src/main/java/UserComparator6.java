import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("et")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Luj;"
	)
	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("bw")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("tu")
	@ObfuscatedGetter(
		intValue = 525324647
	)
	static int field1525;
	@ObfuscatedName("ap")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsv;Lsv;I)I",
		garbageValue = "-285857537"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhb;",
		garbageValue = "36"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	static int method3350() {
		return Login.loginIndex;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V",
		garbageValue = "-1308009410"
	)
	static final void method3351(Actor var0) {
		var0.movementSequence = var0.idleSequence;
		if (var0.pathLength == 0) {
			var0.field1263 = 0;
		} else {
			if (var0.sequence != -1 && var0.sequenceDelay == 0) {
				SequenceDefinition var1 = Widget.SequenceDefinition_get(var0.sequence);
				if (var0.field1291 > 0 && var1.field2325 == 0) {
					++var0.field1263;
					return;
				}

				if (var0.field1291 <= 0 && var1.field2327 == 0) {
					++var0.field1263;
					return;
				}
			}

			int var10 = var0.x;
			int var2 = var0.y;
			int var3 = var0.pathX[var0.pathLength - 1] * 128 + var0.field1220 * 64;
			int var4 = var0.pathY[var0.pathLength - 1] * 128 + var0.field1220 * 64;
			if (var10 < var3) {
				if (var2 < var4) {
					var0.orientation = 1280;
				} else if (var2 > var4) {
					var0.orientation = 1792;
				} else {
					var0.orientation = 1536;
				}
			} else if (var10 > var3) {
				if (var2 < var4) {
					var0.orientation = 768;
				} else if (var2 > var4) {
					var0.orientation = 256;
				} else {
					var0.orientation = 512;
				}
			} else if (var2 < var4) {
				var0.orientation = 1024;
			} else if (var2 > var4) {
				var0.orientation = 0;
			}

			MoveSpeed var5 = var0.pathTraversed[var0.pathLength - 1];
			if (var3 - var10 <= 256 && var3 - var10 >= -256 && var4 - var2 <= 256 && var4 - var2 >= -256) {
				int var6 = var0.orientation - var0.rotation & 2047;
				if (var6 > 1024) {
					var6 -= 2048;
				}

				int var7 = var0.walkBackSequence;
				if (var6 >= -256 && var6 <= 256) {
					var7 = var0.walkSequence;
				} else if (var6 >= 256 && var6 < 768) {
					var7 = var0.walkRightSequence;
				} else if (var6 >= -768 && var6 <= -256) {
					var7 = var0.walkLeftSequence;
				}

				if (var7 == -1) {
					var7 = var0.walkSequence;
				}

				var0.movementSequence = var7;
				int var8 = 4;
				boolean var9 = true;
				if (var0 instanceof NPC) {
					var9 = ((NPC)var0).definition.isClipped;
				}

				if (var9) {
					if (var0.rotation != var0.orientation && var0.targetIndex == -1 && var0.field1285 != 0) {
						var8 = 2;
					}

					if (var0.pathLength > 2) {
						var8 = 6;
					}

					if (var0.pathLength > 3) {
						var8 = 8;
					}

					if (var0.field1263 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1263;
					}
				} else {
					if (var0.pathLength > 1) {
						var8 = 6;
					}

					if (var0.pathLength > 2) {
						var8 = 8;
					}

					if (var0.field1263 > 0 && var0.pathLength > 1) {
						var8 = 8;
						--var0.field1263;
					}
				}

				if (var5 == MoveSpeed.field3057) {
					var8 <<= 1;
				} else if (var5 == MoveSpeed.field3046) {
					var8 >>= 1;
				}

				if (var8 >= 8) {
					if (var0.walkSequence == var0.movementSequence && var0.runSequence != -1) {
						var0.movementSequence = var0.runSequence;
					} else if (var0.walkBackSequence == var0.movementSequence && var0.field1290 != -1) {
						var0.movementSequence = var0.field1290;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1231 != -1) {
						var0.movementSequence = var0.field1231;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1232 != -1) {
						var0.movementSequence = var0.field1232;
					}
				} else if (var8 <= 2) {
					if (var0.movementSequence == var0.walkSequence && var0.field1288 != -1) {
						var0.movementSequence = var0.field1288;
					} else if (var0.movementSequence == var0.walkBackSequence && var0.field1224 != -1) {
						var0.movementSequence = var0.field1224;
					} else if (var0.movementSequence == var0.walkLeftSequence && var0.field1257 != -1) {
						var0.movementSequence = var0.field1257;
					} else if (var0.walkRightSequence == var0.movementSequence && var0.field1236 != -1) {
						var0.movementSequence = var0.field1236;
					}
				}

				if (var10 != var3 || var4 != var2) {
					if (var10 < var3) {
						var0.x += var8;
						if (var0.x > var3) {
							var0.x = var3;
						}
					} else if (var10 > var3) {
						var0.x -= var8;
						if (var0.x < var3) {
							var0.x = var3;
						}
					}

					if (var2 < var4) {
						var0.y += var8;
						if (var0.y > var4) {
							var0.y = var4;
						}
					} else if (var2 > var4) {
						var0.y -= var8;
						if (var0.y < var4) {
							var0.y = var4;
						}
					}
				}

				if (var3 == var0.x && var4 == var0.y) {
					--var0.pathLength;
					if (var0.field1291 > 0) {
						--var0.field1291;
					}
				}

			} else {
				var0.x = var3;
				var0.y = var4;
				--var0.pathLength;
				if (var0.field1291 > 0) {
					--var0.field1291;
				}

			}
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ldv;IIIII)V",
		garbageValue = "-874567063"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3, int var4) {
		if (var0.index != Client.localPlayerIndex) {
			if (Client.menu.menuOptionsCount < 400) {
				String var5;
				int var8;
				if (var0.skillLevel == 0) {
					String var6 = var0.actions[0] + var0.username + var0.actions[1];
					var8 = var0.combatLevel;
					int var9 = SpriteMask.localPlayer.combatLevel;
					int var10 = var9 - var8;
					String var7;
					if (var10 < -9) {
						var7 = class204.colorStartTag(16711680);
					} else if (var10 < -6) {
						var7 = class204.colorStartTag(16723968);
					} else if (var10 < -3) {
						var7 = class204.colorStartTag(16740352);
					} else if (var10 < 0) {
						var7 = class204.colorStartTag(16756736);
					} else if (var10 > 9) {
						var7 = class204.colorStartTag(65280);
					} else if (var10 > 6) {
						var7 = class204.colorStartTag(4259584);
					} else if (var10 > 3) {
						var7 = class204.colorStartTag(8453888);
					} else if (var10 > 0) {
						var7 = class204.colorStartTag(12648192);
					} else {
						var7 = class204.colorStartTag(16776960);
					}

					var5 = var6 + var7 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var5 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var11;
				if (Client.isItemSelected == 1) {
					AsyncRestClient.insertMenuItem("Use", Client.field659 + " " + "->" + " " + class204.colorStartTag(16777215) + var5, 14, var1, var2, var3, -1, false, var4);
				} else if (Client.isSpellSelected) {
					if ((class373.selectedSpellFlags & 8) == 8) {
						AsyncRestClient.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + class204.colorStartTag(16777215) + var5, 15, var1, var2, var3, -1, false, var4);
					}
				} else {
					for (var11 = 7; var11 >= 0; --var11) {
						if (Client.playerMenuActions[var11] != null) {
							short var12 = 0;
							if (Client.playerMenuActions[var11].equalsIgnoreCase("Attack")) {
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) {
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > SpriteMask.localPlayer.combatLevel) {
									var12 = 2000;
								}

								if (SpriteMask.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == SpriteMask.localPlayer.team) {
										var12 = 2000;
									} else {
										var12 = 0;
									}
								} else if (AttackOption.field1395 == Client.playerAttackOption && var0.isClanMember()) {
									var12 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var11]) {
								var12 = 2000;
							}

							boolean var13 = false;
							var8 = Client.playerMenuOpcodes[var11] + var12;
							AsyncRestClient.insertMenuItem(Client.playerMenuActions[var11], class204.colorStartTag(16777215) + var5, var8, var1, var2, var3, -1, false, var4);
						}
					}
				}

				for (var11 = 0; var11 < Client.menu.menuOptionsCount; ++var11) {
					if (Client.menu.menuOpcodes[var11] == 23) {
						Client.menu.menuTargets[var11] = class204.colorStartTag(16777215) + var5;
						break;
					}
				}

			}
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "([Lng;IB)V",
		garbageValue = "45"
	)
	@Export("drawModelComponents")
	static final void drawModelComponents(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null && var3.parentId == var1 && (!var3.isIf3 || !SecureRandomFuture.isComponentHidden(var3))) {
				if (var3.type == 0) {
					if (!var3.isIf3 && SecureRandomFuture.isComponentHidden(var3) && var3 != PcmPlayer.mousedOverWidgetIf1) {
						continue;
					}

					drawModelComponents(var0, var3.id);
					if (var3.children != null) {
						drawModelComponents(var3.children, var3.id);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						class53.method1114(var4.group);
					}
				}

				if (var3.type == 6) {
					int var5;
					if (var3.sequenceId != -1 || var3.sequenceId2 != -1) {
						boolean var8 = class147.runCs1(var3);
						if (var8) {
							var5 = var3.sequenceId2;
						} else {
							var5 = var3.sequenceId;
						}

						if (var5 != -1) {
							SequenceDefinition var6 = Widget.SequenceDefinition_get(var5);
							if (!var6.isCachedModelIdSet()) {
								for (var3.modelFrameCycle += Client.graphicsCycle; var3.modelFrameCycle > var6.frameLengths[var3.modelFrame]; class110.invalidateWidget(var3)) {
									var3.modelFrameCycle -= var6.frameLengths[var3.modelFrame];
									++var3.modelFrame;
									if (var3.modelFrame >= var6.frameIds.length) {
										var3.modelFrame -= var6.frameCount;
										if (var3.modelFrame < 0 || var3.modelFrame >= var6.frameIds.length) {
											var3.modelFrame = 0;
										}
									}
								}
							} else {
								var3.modelFrame += Client.graphicsCycle;
								int var7 = var6.method4367();
								if (var3.modelFrame >= var7) {
									var3.modelFrame -= var6.frameCount;
									if (var3.modelFrame < 0 || var3.modelFrame >= var7) {
										var3.modelFrame = 0;
									}
								}

								class110.invalidateWidget(var3);
							}
						}
					}

					if (var3.field3905 != 0 && !var3.isIf3) {
						int var9 = var3.field3905 >> 16;
						var5 = var3.field3905 << 16 >> 16;
						var9 *= Client.graphicsCycle;
						var5 *= Client.graphicsCycle;
						var3.modelAngleX = var9 + var3.modelAngleX & 2047;
						var3.modelAngleY = var5 + var3.modelAngleY & 2047;
						class110.invalidateWidget(var3);
					}
				}
			}
		}

	}
}
