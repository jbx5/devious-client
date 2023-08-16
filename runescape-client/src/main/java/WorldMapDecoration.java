import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -152771529
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1156952409
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1761099397
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)I",
		garbageValue = "1522435265"
	)
	static int method5480(Widget var0) {
		if (var0.type != 11) {
			--class137.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var0.method6406(var1);
			return 1;
		}
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class113.method2843();

		for (ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var3 = ApproximateRouteStrategy.VarpDefinition_get(var0).type;
		if (var3 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var3 == 1) {
				if (var2 == 1) {
					Rasterizer3D.method4377(0.9D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.9D);
					UrlRequester.method2832();
					class449.clientPreferences.method2516(0.9D);
				}

				if (var2 == 2) {
					Rasterizer3D.method4377(0.8D);
					((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(0.8D);
					UrlRequester.method2832();
					class449.clientPreferences.method2516(0.8D);
				}

				if (var2 == 3) {
					HealthBarUpdate.method2410(0.7D);
				}

				if (var2 == 4) {
					HealthBarUpdate.method2410(0.6D);
				}
			}

			if (var3 == 3) {
				if (var2 == 0) {
					WorldMapEvent.setMusicVolume(255);
				}

				if (var2 == 1) {
					WorldMapEvent.setMusicVolume(192);
				}

				if (var2 == 2) {
					WorldMapEvent.setMusicVolume(128);
				}

				if (var2 == 3) {
					WorldMapEvent.setMusicVolume(64);
				}

				if (var2 == 4) {
					WorldMapEvent.setMusicVolume(0);
				}
			}

			if (var3 == 4) {
				if (var2 == 0) {
					class385.method7164(127);
				}

				if (var2 == 1) {
					class385.method7164(96);
				}

				if (var2 == 2) {
					class385.method7164(64);
				}

				if (var2 == 3) {
					class385.method7164(32);
				}

				if (var2 == 4) {
					class385.method7164(0);
				}
			}

			if (var3 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}

			if (var3 == 6) {
				Client.chatEffects = var2;
			}

			if (var3 == 9) {
			}

			if (var3 == 10) {
				if (var2 == 0) {
					class14.method161(127);
				}

				if (var2 == 1) {
					class14.method161(96);
				}

				if (var2 == 2) {
					class14.method161(64);
				}

				if (var2 == 3) {
					class14.method161(32);
				}

				if (var2 == 4) {
					class14.method161(0);
				}
			}

			if (var3 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var3 == 18) {
				Client.playerAttackOption = (AttackOption)KeyHandler.findEnumerated(JagNetThread.method6821(), var2);
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) {
				if (var2 == -1) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var3 == 22) {
				Client.npcAttackOption = (AttackOption)KeyHandler.findEnumerated(JagNetThread.method6821(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
