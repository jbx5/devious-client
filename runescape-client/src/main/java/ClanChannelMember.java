import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("ba")
	static String field1701;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ak")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 533400535
	)
	@Export("world")
	public int world;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;I)V",
		garbageValue = "744854381"
	)
	public static void method3250(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1965308881"
	)
	static int method3248(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1927900868"
	)
	public static String method3246(String var0) {
		return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "2009375285"
	)
	public static String method3249(CharSequence var0) {
		return ItemLayer.method4585('*', var0.length());
	}

	@ObfuscatedName("of")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1347756915"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		LoginScreenAnimation.method2501();
		class203.method3931();
		int var1 = class249.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					Rasterizer3D.method4681(0.9D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.9D);
					if (class6.worldMap != null) {
						class6.worldMap.method9228();
					}

					ClanSettings.method3331();
					class459.clientPreferences.updateBrightness(0.9D);
				}

				if (var2 == 2) {
					Rasterizer3D.method4681(0.8D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.8D);
					if (class6.worldMap != null) {
						class6.worldMap.method9228();
					}

					ClanSettings.method3331();
					class459.clientPreferences.updateBrightness(0.8D);
				}

				if (var2 == 3) {
					Rasterizer3D.method4681(0.7D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.7D);
					if (class6.worldMap != null) {
						class6.worldMap.method9228();
					}

					ClanSettings.method3331();
					class459.clientPreferences.updateBrightness(0.7D);
				}

				if (var2 == 4) {
					Rasterizer3D.method4681(0.6D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.6D);
					if (class6.worldMap != null) {
						class6.worldMap.method9228();
					}

					ClanSettings.method3331();
					class459.clientPreferences.updateBrightness(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					Coord.setMusicVolume(255);
				}

				if (var2 == 1) {
					Coord.setMusicVolume(192);
				}

				if (var2 == 2) {
					Coord.setMusicVolume(128);
				}

				if (var2 == 3) {
					Coord.setMusicVolume(64);
				}

				if (var2 == 4) {
					Coord.setMusicVolume(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					class31.method449(127);
				}

				if (var2 == 1) {
					class31.method449(96);
				}

				if (var2 == 2) {
					class31.method449(64);
				}

				if (var2 == 3) {
					class31.method449(32);
				}

				if (var2 == 4) {
					class31.method449(0);
				}
			}

			if (var1 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var1 == 6) {
				Client.chatEffects = var2;
			}

			if (var1 == 9) {
			}

			if (var1 == 10) {
				if (var2 == 0) {
					Client.method1809(127);
				}

				if (var2 == 1) {
					Client.method1809(96);
				}

				if (var2 == 2) {
					Client.method1809(64);
				}

				if (var2 == 3) {
					Client.method1809(32);
				}

				if (var2 == 4) {
					Client.method1809(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)MenuAction.findEnumerated(LoginScreenAnimation.method2502(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var1 == 22) {
				AttackOption[] var3 = new AttackOption[]{AttackOption.field1390, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1385};
				Client.npcAttackOption = (AttackOption)MenuAction.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
