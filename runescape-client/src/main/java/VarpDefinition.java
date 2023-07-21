import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 775233713
	)
	public static int field1904;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("hr")
	static String field1910;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1122888819
	)
	@Export("type")
	public int type;

	static {
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "1223419566"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "512935442"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Ldh;IIIB)V",
		garbageValue = "33"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3) {
		NPCComposition var4 = var0.definition;
		if (Client.menuOptionsCount < 400) {
			if (var4.transforms != null) {
				var4 = var4.transform();
			}

			if (var4 != null) {
				if (var4.isInteractable) {
					if (!var4.isFollower || Client.followerIndex == var1) {
						String var5 = var0.method2591();
						int var6;
						int var9;
						if (var4.combatLevel != 0 && var0.field1258 != 0) {
							var6 = var0.field1258 != -1 ? var0.field1258 : var4.combatLevel;
							var9 = class136.localPlayer.combatLevel;
							int var10 = var9 - var6;
							String var8;
							if (var10 < -9) {
								var8 = MusicPatchPcmStream.colorStartTag(16711680);
							} else if (var10 < -6) {
								var8 = MusicPatchPcmStream.colorStartTag(16723968);
							} else if (var10 < -3) {
								var8 = MusicPatchPcmStream.colorStartTag(16740352);
							} else if (var10 < 0) {
								var8 = MusicPatchPcmStream.colorStartTag(16756736);
							} else if (var10 > 9) {
								var8 = MusicPatchPcmStream.colorStartTag(65280);
							} else if (var10 > 6) {
								var8 = MusicPatchPcmStream.colorStartTag(4259584);
							} else if (var10 > 3) {
								var8 = MusicPatchPcmStream.colorStartTag(8453888);
							} else if (var10 > 0) {
								var8 = MusicPatchPcmStream.colorStartTag(12648192);
							} else {
								var8 = MusicPatchPcmStream.colorStartTag(16776960);
							}

							var5 = var5 + var8 + " " + " (" + "level-" + var6 + ")";
						}

						if (var4.isFollower && Client.followerOpsLowPriority) {
							JagexCache.insertMenuItemNoShift("Examine", MusicPatchPcmStream.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
						}

						if (Client.isItemSelected == 1) {
							JagexCache.insertMenuItemNoShift("Use", Client.field557 + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16776960) + var5, 7, var1, var2, var3);
						} else if (Client.isSpellSelected) {
							if ((PcmPlayer.selectedSpellFlags & 2) == 2) {
								JagexCache.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + MusicPatchPcmStream.colorStartTag(16776960) + var5, 8, var1, var2, var3);
							}
						} else {
							var6 = var4.isFollower && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var7 = var4.actions;
							int var11;
							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var0.method2590(var11) && var7[var11] != null && !var7[var11].equalsIgnoreCase("Attack")) {
										var9 = 0;
										if (var11 == 0) {
											var9 = var6 + 9;
										}

										if (var11 == 1) {
											var9 = var6 + 10;
										}

										if (var11 == 2) {
											var9 = var6 + 11;
										}

										if (var11 == 3) {
											var9 = var6 + 12;
										}

										if (var11 == 4) {
											var9 = var6 + 13;
										}

										JagexCache.insertMenuItemNoShift(var7[var11], MusicPatchPcmStream.colorStartTag(16776960) + var5, var9, var1, var2, var3);
									}
								}
							}

							if (var7 != null) {
								for (var11 = 4; var11 >= 0; --var11) {
									if (var0.method2590(var11) && var7[var11] != null && var7[var11].equalsIgnoreCase("Attack")) {
										short var12 = 0;
										if (AttackOption.AttackOption_hidden != Client.npcAttackOption) {
											if (Client.npcAttackOption == AttackOption.AttackOption_alwaysRightClick || Client.npcAttackOption == AttackOption.AttackOption_dependsOnCombatLevels && var4.combatLevel > class136.localPlayer.combatLevel) {
												var12 = 2000;
											}

											var9 = 0;
											if (var11 == 0) {
												var9 = var12 + 9;
											}

											if (var11 == 1) {
												var9 = var12 + 10;
											}

											if (var11 == 2) {
												var9 = var12 + 11;
											}

											if (var11 == 3) {
												var9 = var12 + 12;
											}

											if (var11 == 4) {
												var9 = var12 + 13;
											}

											JagexCache.insertMenuItemNoShift(var7[var11], MusicPatchPcmStream.colorStartTag(16776960) + var5, var9, var1, var2, var3);
										}
									}
								}
							}

							if (!var4.isFollower || !Client.followerOpsLowPriority) {
								JagexCache.insertMenuItemNoShift("Examine", MusicPatchPcmStream.colorStartTag(16776960) + var5, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
