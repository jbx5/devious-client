import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
public class class78 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1805721740")

	protected static final void method2098() {
		class4.clock.mark();

		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}

		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}

		class134.gameCyclesToDo = 0;
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"126")

	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		SceneTilePaint.method4499();

		for (ObjectSound var1 = ((ObjectSound) (ObjectSound.objectSounds.last())); var1 != null; var1 = ((ObjectSound) (ObjectSound.objectSounds.previous()))) {
			if (var1.obj != null) {
				var1.set();
			}
		}

		int var3 = SoundCache.VarpDefinition_get(var0).type;
		if (var3 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var3 == 1) {
				if (var2 == 1) {
					class175.method3439(0.9);
				}

				if (var2 == 2) {
					class175.method3439(0.8);
				}

				if (var2 == 3) {
					class175.method3439(0.7);
				}

				if (var2 == 4) {
					class175.method3439(0.6);
				}
			}

			if (var3 == 3) {
				if (var2 == 0) {
					Tiles.method2040(255);
				}

				if (var2 == 1) {
					Tiles.method2040(192);
				}

				if (var2 == 2) {
					Tiles.method2040(128);
				}

				if (var2 == 3) {
					Tiles.method2040(64);
				}

				if (var2 == 4) {
					Tiles.method2040(0);
				}
			}

			if (var3 == 4) {
				if (var2 == 0) {
					class28.method424(127);
				}

				if (var2 == 1) {
					class28.method424(96);
				}

				if (var2 == 2) {
					class28.method424(64);
				}

				if (var2 == 3) {
					class28.method424(32);
				}

				if (var2 == 4) {
					class28.method424(0);
				}
			}

			if (var3 == 5) {
				Client.leftClickOpensMenu = var2;
			}

			if (var3 == 6) {
				Client.chatEffects = var2;
			}

			if (var3 == 9) {
				Client.field655 = var2;
			}

			if (var3 == 10) {
				if (var2 == 0) {
					class21.method334(127);
				}

				if (var2 == 1) {
					class21.method334(96);
				}

				if (var2 == 2) {
					class21.method334(64);
				}

				if (var2 == 3) {
					class21.method334(32);
				}

				if (var2 == 4) {
					class21.method334(0);
				}
			}

			if (var3 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var3 == 18) {
				Client.playerAttackOption = ((AttackOption) (ChatChannel.findEnumerated(SoundSystem.method789(), var2)));
				if (Client.playerAttackOption == null) {
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var3 == 19) {
				if (var2 == (-1)) {
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047;
				}
			}

			if (var3 == 22) {
				Client.npcAttackOption = ((AttackOption) (ChatChannel.findEnumerated(SoundSystem.method789(), var2)));
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}