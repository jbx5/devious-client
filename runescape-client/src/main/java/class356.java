import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class356 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	UrlRequest field3807;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	SpritePixels field3804;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lex;)V"
	)
	class356(String var1, UrlRequester var2) {
		try {
			this.field3807 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3807 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class356(UrlRequest var1) {
		this.field3807 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "246420416"
	)
	SpritePixels method6920() {
		if (this.field3804 == null && this.field3807 != null && this.field3807.isDone()) {
			if (this.field3807.getResponse() != null) {
				this.field3804 = ClanMate.readSpritePixelsFromBytes(this.field3807.getResponse());
			}

			this.field3807 = null;
		}

		return this.field3804;
	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1599864392"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		PacketWriter.method3202();
		DevicePcmPlayerProvider.method320();
		int var1 = ReflectionCheck.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					FriendSystem.method2071(0.9D);
				}

				if (var2 == 2) {
					FriendSystem.method2071(0.8D);
				}

				if (var2 == 3) {
					FriendSystem.method2071(0.7D);
				}

				if (var2 == 4) {
					FriendSystem.method2071(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					class437.setMusicVolume(255);
				}

				if (var2 == 1) {
					class437.setMusicVolume(192);
				}

				if (var2 == 2) {
					class437.setMusicVolume(128);
				}

				if (var2 == 3) {
					class437.setMusicVolume(64);
				}

				if (var2 == 4) {
					class437.setMusicVolume(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					PlayerComposition.method7003(127);
				}

				if (var2 == 1) {
					PlayerComposition.method7003(96);
				}

				if (var2 == 2) {
					PlayerComposition.method7003(64);
				}

				if (var2 == 3) {
					PlayerComposition.method7003(32);
				}

				if (var2 == 4) {
					PlayerComposition.method7003(0);
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
					class182.method3869(127);
				}

				if (var2 == 1) {
					class182.method3869(96);
				}

				if (var2 == 2) {
					class182.method3869(64);
				}

				if (var2 == 3) {
					class182.method3869(32);
				}

				if (var2 == 4) {
					class182.method3869(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			AttackOption[] var3;
			if (var1 == 18) {
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1396, AttackOption.field1395};
				Client.playerAttackOption = (AttackOption)class177.findEnumerated(var3, var2);
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
				var3 = new AttackOption[]{AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1396, AttackOption.field1395};
				Client.npcAttackOption = (AttackOption)class177.findEnumerated(var3, var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
