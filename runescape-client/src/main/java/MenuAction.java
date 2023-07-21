import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 111037751
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1776571377
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1823377325
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 163193161
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -292471689
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("aj")
	@Export("action")
	String action;
	@ObfuscatedName("ag")
	@Export("target")
	String target;

	MenuAction() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfg;",
		garbageValue = "-994330440"
	)
	static class132[] method2085() {
		return new class132[]{class132.field1575, class132.field1571, class132.field1572, class132.field1573, class132.field1582, class132.field1584, class132.field1570, class132.field1577, class132.field1578, class132.field1579, class132.field1580, class132.field1586, class132.field1576, class132.field1583, class132.field1581, class132.field1585, class132.field1592};
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "4"
	)
	static int method2084(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1834048836"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		DbRowType.method9006();
		class19.method277();
		int var1 = class158.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					Rasterizer3D.method4405(0.9D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.9D);
					HealthBar.method2579();
					class150.clientPreferences.method2475(0.9D);
				}

				if (var2 == 2) {
					Rasterizer3D.method4405(0.8D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.8D);
					HealthBar.method2579();
					class150.clientPreferences.method2475(0.8D);
				}

				if (var2 == 3) {
					Rasterizer3D.method4405(0.7D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.7D);
					HealthBar.method2579();
					class150.clientPreferences.method2475(0.7D);
				}

				if (var2 == 4) {
					Rasterizer3D.method4405(0.6D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.6D);
					HealthBar.method2579();
					class150.clientPreferences.method2475(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					StudioGame.setMusicVolume(255);
				}

				if (var2 == 1) {
					StudioGame.setMusicVolume(192);
				}

				if (var2 == 2) {
					StudioGame.setMusicVolume(128);
				}

				if (var2 == 3) {
					StudioGame.setMusicVolume(64);
				}

				if (var2 == 4) {
					StudioGame.setMusicVolume(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					ClanMate.method7938(127);
				}

				if (var2 == 1) {
					ClanMate.method7938(96);
				}

				if (var2 == 2) {
					ClanMate.method7938(64);
				}

				if (var2 == 3) {
					ClanMate.method7938(32);
				}

				if (var2 == 4) {
					ClanMate.method7938(0);
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
					Interpreter.method1966(127);
				}

				if (var2 == 1) {
					Interpreter.method1966(96);
				}

				if (var2 == 2) {
					Interpreter.method1966(64);
				}

				if (var2 == 3) {
					Interpreter.method1966(32);
				}

				if (var2 == 4) {
					Interpreter.method1966(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				Client.playerAttackOption = (AttackOption)ClientPreferences.findEnumerated(ItemLayer.method4293(), var2);
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
				Client.npcAttackOption = (AttackOption)ClientPreferences.findEnumerated(ItemLayer.method4293(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
