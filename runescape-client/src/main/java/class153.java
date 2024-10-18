import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class153 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -4854828430501300759L
	)
	long field1720;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1577243479
	)
	public int field1715;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	IterableNodeDeque field1716;

	@ObfuscatedSignature(
		descriptor = "(Lvl;)V"
	)
	public class153(Buffer var1) {
		this.field1715 = -1;
		this.field1716 = new IterableNodeDeque();
		this.method3589(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "84"
	)
	void method3589(Buffer var1) {
		this.field1720 = var1.readLong();
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
				var3 = new Sound(this);
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

			((class150)var3).vmethod3822(var1);
			this.field1716.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;B)V",
		garbageValue = "3"
	)
	public void method3596(ClanSettings var1) {
		if (this.field1720 == var1.field1781 && this.field1715 == var1.field1767) {
			for (class150 var2 = (class150)this.field1716.last(); var2 != null; var2 = (class150)this.field1716.previous()) {
				var2.vmethod3821(var1);
			}

			++var1.field1767;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "41"
	)
	static int method3590(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIII)V",
		garbageValue = "-2089746484"
	)
	static void method3597(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64;
		var2 = var2 * 128 + 64;
		var3 = var3 * 128 + 64;
		var4 = var4 * 128 + 64;
		Projectile var14 = new Projectile(var6, var0, var1, var2, ScriptFrame.getTileHeight(class344.worldView, var1, var2, var0) - var7, var9 + Client.cycle, var10 + Client.cycle, var11, var12, var13, var5, var8);
		var14.setDestination(var3, var4, ScriptFrame.getTileHeight(class344.worldView, var3, var4, var0) - var8, var9 + Client.cycle);
		class344.worldView.projectiles.addFirst(var14);
	}

	@ObfuscatedName("mm")
	@ObfuscatedSignature(
		descriptor = "(Lng;II)I",
		garbageValue = "-1729391053"
	)
	static final int method3600(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
			try {
				int[] var2 = var0.cs1Instructions[var1];
				int var3 = 0;
				int var4 = 0;
				byte var5 = 0;

				while (true) {
					int var6 = var2[var4++];
					int var7 = 0;
					byte var8 = 0;
					if (var6 == 0) {
						return var3;
					}

					if (var6 == 1) {
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) {
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) {
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class416.widgetDefinition.method6911(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!Bounds.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) {
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) {
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) {
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) {
						var7 = SpriteMask.localPlayer.combatLevel;
					}

					if (var6 == 9) {
						for (var9 = 0; var9 < 25; ++var9) {
							if (Skills.Skills_enabled[var9]) {
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) {
						var9 = var2[var4++] << 16;
						var9 += var2[var4++];
						var10 = class416.widgetDefinition.method6911(var9);
						var11 = var2[var4++];
						if (var11 != -1 && (!Bounds.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) {
								if (var11 + 1 == var10.itemIds[var12]) {
									var7 = 999999999;
									break;
								}
							}
						}
					}

					if (var6 == 11) {
						var7 = Client.runEnergy;
					}

					if (var6 == 12) {
						var7 = Client.weight;
					}

					if (var6 == 13) {
						var9 = Varps.Varps_main[var2[var4++]];
						int var13 = var2[var4++];
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
					}

					if (var6 == 14) {
						var9 = var2[var4++];
						var7 = Projectile.getVarbit(var9);
					}

					if (var6 == 15) {
						var8 = 1;
					}

					if (var6 == 16) {
						var8 = 2;
					}

					if (var6 == 17) {
						var8 = 3;
					}

					if (var6 == 18) {
						var7 = (SpriteMask.localPlayer.x >> 7) + class198.topLevelWorldView.baseX;
					}

					if (var6 == 19) {
						var7 = (SpriteMask.localPlayer.y >> 7) + class198.topLevelWorldView.baseY;
					}

					if (var6 == 20) {
						var7 = var2[var4++];
					}

					if (var8 == 0) {
						if (var5 == 0) {
							var3 += var7;
						}

						if (var5 == 1) {
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) {
							var3 /= var7;
						}

						if (var5 == 3) {
							var3 *= var7;
						}

						var5 = 0;
					} else {
						var5 = var8;
					}
				}
			} catch (Exception var14) {
				return -1;
			}
		} else {
			return -2;
		}
	}

	@ObfuscatedName("me")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1241504117"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}

	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "(Lch;B)V",
		garbageValue = "-105"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (class346.loginState != var0) {
			class346.loginState = var0;
		}
	}
}
