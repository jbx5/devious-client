import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class153 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -8134771950445921049L
	)
	long field1718;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -223659971
	)
	public int field1715;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	IterableNodeDeque field1716;

	@ObfuscatedSignature(
		descriptor = "(Lvf;)V"
	)
	public class153(Buffer var1) {
		this.field1715 = -1;
		this.field1716 = new IterableNodeDeque();
		this.method3496(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "-158246467"
	)
	void method3496(Buffer var1) {
		this.field1718 = var1.readLong();
		this.field1715 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class172(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class165(this);
			} else if (var2 == 4) {
				var3 = new class157(this);
			} else if (var2 == 6) {
				var3 = new class164(this);
			} else if (var2 == 5) {
				var3 = new class149(this);
			} else if (var2 == 2) {
				var3 = new class154(this);
			} else if (var2 == 7) {
				var3 = new class147(this);
			} else if (var2 == 14) {
				var3 = new class151(this);
			} else if (var2 == 8) {
				var3 = new class168(this);
			} else if (var2 == 9) {
				var3 = new class174(this);
			} else if (var2 == 10) {
				var3 = new class160(this);
			} else if (var2 == 11) {
				var3 = new class155(this);
			} else if (var2 == 12) {
				var3 = new class159(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class169(this);
			}

			((class150)var3).vmethod3778(var1);
			this.field1716.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;B)V",
		garbageValue = "-22"
	)
	public void method3500(ClanSettings var1) {
		if (this.field1718 == var1.field1777 && this.field1715 == var1.field1765) {
			for (class150 var2 = (class150)this.field1716.last(); var2 != null; var2 = (class150)this.field1716.previous()) {
				var2.vmethod3771(var1);
			}

			++var1.field1765;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Ldy;I)V",
		garbageValue = "-1058692196"
	)
	static final void method3499(WorldView var0, Actor var1) {
		int var3;
		int var4;
		int var5;
		int var7;
		if (var1.targetIndex != -1) {
			Object var2 = null;
			var3 = 65536;
			if (var1.targetIndex < var3) {
				var2 = var0.npcs[var1.targetIndex];
			} else {
				var2 = var0.players[var1.targetIndex - var3];
			}

			if (var2 != null) {
				var4 = var1.x - ((Actor)var2).x;
				var5 = var1.y - ((Actor)var2).y;
				if (var4 != 0 || var5 != 0) {
					var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167D) & 2047;
					var1.orientation = var7;
				}
			} else if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		int var8;
		if (var1.pathLength == 0 || var1.field1290 > 0) {
			var8 = -1;
			if (var1.field1261 != -1 && var1.field1262 != -1) {
				var3 = Coord.method6797(var1.field1261 - ClientPreferences.topLevelWorldView.baseX);
				var4 = Coord.method6797(var1.field1262 - ClientPreferences.topLevelWorldView.baseY);
				var5 = var1.x - var3;
				int var9 = var1.y - var4;
				if (var5 != 0 || var9 != 0) {
					var7 = (int)(Math.atan2((double)var5, (double)var9) * 325.94932345220167D) & 2047;
					var8 = var7;
				}
			} else if (var1.field1260 != -1) {
				var8 = var1.field1260;
			}

			if (var8 != -1) {
				var1.orientation = var8;
				if (var1.field1263) {
					var1.rotation = var1.orientation;
				}
			}

			var1.method2670();
		}

		var8 = var1.orientation - var1.rotation & 2047;
		if (var8 != 0) {
			boolean var11 = true;
			boolean var12 = true;
			++var1.field1249;
			var5 = var8 > 1024 ? -1 : 1;
			var1.rotation += var5 * var1.field1292;
			boolean var13 = true;
			if (var8 < var1.field1292 || var8 > 2048 - var1.field1292) {
				var1.rotation = var1.orientation;
				var13 = false;
			}

			if (var1.field1292 > 0 && var1.idleSequence == var1.movementSequence && (var1.field1249 > 25 || var13)) {
				if (var5 == -1 && var1.turnLeftSequence != -1) {
					var1.movementSequence = var1.turnLeftSequence;
				} else if (var5 == 1 && var1.turnRightSequence != -1) {
					var1.movementSequence = var1.turnRightSequence;
				} else {
					var1.movementSequence = var1.walkSequence;
				}
			}

			var1.rotation &= 2047;
		} else {
			if (var1.false0) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}

			var1.field1249 = 0;
		}

	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIB)V",
		garbageValue = "-7"
	)
	static final void method3503(WorldView var0, int var1, int var2, int var3, int var4) {
		Client.overheadTextCount = 0;
		boolean var5 = false;
		int var6 = -1;
		int var7 = -1;
		int var8 = Client.playerUpdateManager.playerCount;
		int[] var9 = Client.playerUpdateManager.playerIndices;

		int var10;
		for (var10 = 0; var10 < var8 + var0.npcCount; ++var10) {
			Object var23;
			if (var10 < var8) {
				var23 = var0.players[var9[var10]];
				if (var9[var10] == Client.combatTargetPlayerIndex) {
					var5 = true;
					var6 = var10;
					continue;
				}

				if (var23 == AddRequestTask.localPlayer) {
					var7 = var10;
					continue;
				}
			} else {
				var23 = var0.npcs[var0.npcIndices[var10 - var8]];
			}

			ClanMate.drawActor2d(var0, (Actor)var23, var10, var1, var2, var3, var4);
		}

		if (Client.renderSelf && var7 != -1) {
			ClanMate.drawActor2d(var0, AddRequestTask.localPlayer, var7, var1, var2, var3, var4);
		}

		if (var5) {
			ClanMate.drawActor2d(var0, var0.players[Client.combatTargetPlayerIndex], var6, var1, var2, var3, var4);
		}

		for (var10 = 0; var10 < Client.overheadTextCount; ++var10) {
			int var11 = Client.overheadTextXs[var10];
			int var12 = Client.overheadTextYs[var10];
			int var13 = Client.overheadTextXOffsets[var10];
			int var14 = Client.overheadTextAscents[var10];
			boolean var15 = true;

			while (var15) {
				var15 = false;

				for (int var22 = 0; var22 < var10; ++var22) {
					if (var12 + 2 > Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] && var12 - var14 < Client.overheadTextYs[var22] + 2 && var11 - var13 < Client.overheadTextXOffsets[var22] + Client.overheadTextXs[var22] && var13 + var11 > Client.overheadTextXs[var22] - Client.overheadTextXOffsets[var22] && Client.overheadTextYs[var22] - Client.overheadTextAscents[var22] < var12) {
						var12 = Client.overheadTextYs[var22] - Client.overheadTextAscents[var22];
						var15 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var10];
			Client.viewportTempY = Client.overheadTextYs[var10] = var12;
			String var16 = Client.overheadText[var10];
			if (Client.chatEffects == 0) {
				int var17 = 16776960;
				if (Client.overheadTextColors[var10] < 6) {
					var17 = Client.field742[Client.overheadTextColors[var10]];
				}

				if (Client.overheadTextColors[var10] == 6) {
					var17 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var10] == 7) {
					var17 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var10] == 8) {
					var17 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var18;
				if (Client.overheadTextColors[var10] == 9) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = var18 * 1280 + 16711680;
					} else if (var18 < 100) {
						var17 = 16776960 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var10] == 10) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = var18 * 5 + 16711680;
					} else if (var18 < 100) {
						var17 = 16711935 - (var18 - 50) * 327680;
					} else if (var18 < 150) {
						var17 = (var18 - 100) * 327680 + 255 - (var18 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var10] == 11) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					if (var18 < 50) {
						var17 = 16777215 - var18 * 327685;
					} else if (var18 < 100) {
						var17 = (var18 - 50) * 327685 + 65280;
					} else if (var18 < 150) {
						var17 = 16777215 - (var18 - 100) * 327680;
					}
				}

				int var19;
				if (Client.overheadTextColors[var10] == 12 && Client.field645[var10] == null) {
					var18 = var16.length();
					Client.field645[var10] = new int[var18];

					for (var19 = 0; var19 < var18; ++var19) {
						int var20 = (int)(64.0F * ((float)var19 / (float)var18));
						int var21 = var20 << 10 | 896 | 64;
						Client.field645[var10][var19] = class501.field5105[var21];
					}
				}

				if (Client.overheadTextEffects[var10] == 0) {
					class33.fontBold12.method8465(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.field645[var10]);
				}

				if (Client.overheadTextEffects[var10] == 1) {
					class33.fontBold12.method8479(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field645[var10]);
				}

				if (Client.overheadTextEffects[var10] == 2) {
					class33.fontBold12.method8538(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, Client.field645[var10]);
				}

				if (Client.overheadTextEffects[var10] == 3) {
					class33.fontBold12.method8510(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, var17, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var10], Client.field645[var10]);
				}

				if (Client.overheadTextEffects[var10] == 4) {
					var18 = (150 - Client.overheadTextCyclesRemaining[var10]) * (class33.fontBold12.stringWidth(var16) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(Client.viewportTempX + var1 - 50, var2, Client.viewportTempX + var1 + 50, var2 + var4);
					class33.fontBold12.method8440(var16, Client.viewportTempX + var1 + 50 - var18, var2 + Client.viewportTempY, var17, 0, Client.field645[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}

				if (Client.overheadTextEffects[var10] == 5) {
					var18 = 150 - Client.overheadTextCyclesRemaining[var10];
					var19 = 0;
					if (var18 < 25) {
						var19 = var18 - 25;
					} else if (var18 > 125) {
						var19 = var18 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var1, var2 + Client.viewportTempY - class33.fontBold12.ascent - 1, var3 + var1, var2 + Client.viewportTempY + 5);
					class33.fontBold12.method8465(var16, Client.viewportTempX + var1, var19 + var2 + Client.viewportTempY, var17, 0, Client.field645[var10]);
					Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
				}
			} else {
				class33.fontBold12.drawCentered(var16, Client.viewportTempX + var1, var2 + Client.viewportTempY, 16776960, 0);
			}
		}

	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1466424961"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "952216676"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		GrandExchangeOfferTotalQuantityComparator.method7663();

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var4 = UserComparator9.VarpDefinition_get(var0).type;
		if (var4 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var4 == 1) {
				if (var2 == 1) {
					class132.method3252(0.9D);
				}

				if (var2 == 2) {
					class132.method3252(0.8D);
				}

				if (var2 == 3) {
					class132.method3252(0.7D);
				}

				if (var2 == 4) {
					class132.method3252(0.6D);
				}
			}

			if (var4 == 3) {
				if (var2 == 0) {
					class204.setMusicVolume(255);
				}

				if (var2 == 1) {
					class204.setMusicVolume(192);
				}

				if (var2 == 2) {
					class204.setMusicVolume(128);
				}

				if (var2 == 3) {
					class204.setMusicVolume(64);
				}

				if (var2 == 4) {
					class204.setMusicVolume(0);
				}
			}

			if (var4 == 4) {
				if (var2 == 0) {
					LoginState.method1279(127);
				}

				if (var2 == 1) {
					LoginState.method1279(96);
				}

				if (var2 == 2) {
					LoginState.method1279(64);
				}

				if (var2 == 3) {
					LoginState.method1279(32);
				}

				if (var2 == 4) {
					LoginState.method1279(0);
				}
			}

			if (var4 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var4 == 6) {
				Client.chatEffects = var2;
			}

			if (var4 == 9) {
			}

			if (var4 == 10) {
				if (var2 == 0) {
					GrandExchangeOfferOwnWorldComparator.method1267(127);
				}

				if (var2 == 1) {
					GrandExchangeOfferOwnWorldComparator.method1267(96);
				}

				if (var2 == 2) {
					GrandExchangeOfferOwnWorldComparator.method1267(64);
				}

				if (var2 == 3) {
					GrandExchangeOfferOwnWorldComparator.method1267(32);
				}

				if (var2 == 4) {
					GrandExchangeOfferOwnWorldComparator.method1267(0);
				}
			}

			if (var4 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			AttackOption[] var3;
			if (var4 == 18) {
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1408, AttackOption.field1413, AttackOption.AttackOption_dependsOnCombatLevels};
				Client.playerAttackOption = (AttackOption)ArchiveDiskAction.findEnumerated(var3, var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var4 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var4 == 22) {
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1408, AttackOption.field1413, AttackOption.AttackOption_dependsOnCombatLevels};
				Client.npcAttackOption = (AttackOption)ArchiveDiskAction.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
