import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("wi")
	static List field3056;
	@ObfuscatedName("ah")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("ax")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("aa")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(Lty;Lty;IZB)V",
		garbageValue = "-92"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3);
		int var5 = var2.readUnsignedShort();
		this.worldMapData0Set = new HashSet(var5);

		int var6;
		for (var6 = 0; var6 < var5; ++var6) {
			WorldMapData_0 var7 = new WorldMapData_0();

			try {
				var7.init(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.worldMapData0Set.add(var7);
		}

		var6 = var2.readUnsignedShort();
		this.worldMapData1Set = new HashSet(var6);

		for (int var10 = 0; var10 < var6; ++var10) {
			WorldMapData_1 var8 = new WorldMapData_1();

			try {
				var8.init(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.worldMapData1Set.add(var8);
		}

		this.initIconsList(var2, var4);
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(Lty;ZB)V",
		garbageValue = "7"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList();
		int var3 = var1.readUnsignedShort();

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = var1.readNullableLargeSmart();
			Coord var6 = new Coord(var1.readInt());
			boolean var7 = var1.readUnsignedByte() == 1;
			if (var2 || !var7) {
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null));
			}
		}

	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ldf;IIIS)V",
		garbageValue = "10482"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class136.localPlayer != var0) {
			if (Client.menuOptionsCount < 400) {
				String var4;
				int var7;
				if (var0.skillLevel == 0) {
					String var5 = var0.actions[0] + var0.username + var0.actions[1];
					var7 = var0.combatLevel;
					int var8 = class136.localPlayer.combatLevel;
					int var9 = var8 - var7;
					String var6;
					if (var9 < -9) {
						var6 = MusicPatchPcmStream.colorStartTag(16711680);
					} else if (var9 < -6) {
						var6 = MusicPatchPcmStream.colorStartTag(16723968);
					} else if (var9 < -3) {
						var6 = MusicPatchPcmStream.colorStartTag(16740352);
					} else if (var9 < 0) {
						var6 = MusicPatchPcmStream.colorStartTag(16756736);
					} else if (var9 > 9) {
						var6 = MusicPatchPcmStream.colorStartTag(65280);
					} else if (var9 > 6) {
						var6 = MusicPatchPcmStream.colorStartTag(4259584);
					} else if (var9 > 3) {
						var6 = MusicPatchPcmStream.colorStartTag(8453888);
					} else if (var9 > 0) {
						var6 = MusicPatchPcmStream.colorStartTag(12648192);
					} else {
						var6 = MusicPatchPcmStream.colorStartTag(16776960);
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2];
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2];
				}

				int var10;
				if (Client.isItemSelected == 1) {
					JagexCache.insertMenuItemNoShift("Use", Client.field557 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16777215) + var4, 14, var1, var2, var3);
				} else if (Client.isSpellSelected) {
					if ((PcmPlayer.selectedSpellFlags & 8) == 8) {
						JagexCache.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16777215) + var4, 15, var1, var2, var3);
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) {
						if (Client.playerMenuActions[var10] != null) {
							short var11 = 0;
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) {
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) {
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.playerAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var0.combatLevel > class136.localPlayer.combatLevel) {
									var11 = 2000;
								}

								if (class136.localPlayer.team != 0 && var0.team != 0) {
									if (var0.team == class136.localPlayer.team) {
										var11 = 2000;
									} else {
										var11 = 0;
									}
								} else if (AttackOption.field1340 == Client.playerAttackOption && var0.isClanMember()) {
									var11 = 2000;
								}
							} else if (Client.playerOptionsPriorities[var10]) {
								var11 = 2000;
							}

							boolean var12 = false;
							var7 = Client.playerMenuOpcodes[var10] + var11;
							JagexCache.insertMenuItemNoShift(Client.playerMenuActions[var10], MusicPatchPcmStream.colorStartTag(16777215) + var4, var7, var1, var2, var3);
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) {
					if (Client.menuOpcodes[var10] == 23) {
						Client.menuTargets[var10] = MusicPatchPcmStream.colorStartTag(16777215) + var4;
						break;
					}
				}

			}
		}
	}
}
