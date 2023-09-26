import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rh")
@Implements("DefaultsGroup")
public class DefaultsGroup {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lrh;"
	)
	static final DefaultsGroup field4747;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1604849899
	)
	@Export("group")
	final int group;

	static {
		field4747 = new DefaultsGroup(3);
	}

	DefaultsGroup(int var1) {
		this.group = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhj;",
		garbageValue = "-1"
	)
	public static HealthBarDefinition method8264(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			var1.field1982 = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1882017485"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field756.method4232();
			}

			if (Client.gameState == 0) {
				class159.client.method514();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class409.method7554(0);
				Client.field555 = 0;
				Client.field732 = 0;
				Client.timer.method7833(var0);
				if (var0 != 20) {
					UserComparator6.method2942(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class11.field59 != null) {
				class11.field59.close();
				class11.field59 = null;
			}

			if (Client.gameState == 25) {
				Client.field545 = 0;
				Client.field588 = 0;
				Client.field589 = 1;
				Client.field590 = 0;
				Client.field591 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var3 = Client.gameState == 11 ? 4 : 0;
					ScriptEvent.method2328(class190.archive10, class199.archive8, false, var3);
				} else if (var0 == 11) {
					ScriptEvent.method2328(class190.archive10, class199.archive8, false, 4);
				} else if (var0 == 50) {
					AbstractWorldMapIcon.setLoginResponseString("", "Updating date of birth...", "");
					ScriptEvent.method2328(class190.archive10, class199.archive8, false, 7);
				} else if (Login.clearLoginScreen) {
					Login.titleboxSprite = null;
					VarcInt.titlebuttonSprite = null;
					Login.runesSprite = null;
					PcmPlayer.leftTitleSprite = null;
					Login.rightTitleSprite = null;
					Login.logoSprite = null;
					Login.title_muteSprite = null;
					class519.options_buttons_0Sprite = null;
					class534.options_buttons_2Sprite = null;
					SecureRandomCallable.worldSelectBackSprites = null;
					PendingSpawn.worldSelectFlagSprites = null;
					ModelData0.worldSelectArrows = null;
					TaskHandler.worldSelectStars = null;
					Varcs.field1405 = null;
					class544.loginScreenRunesAnimation.method2464();
					ItemComposition.method4136(0, 100);
					class13.method167().method7000(true);
					Login.clearLoginScreen = false;
				}
			} else {
				boolean var1 = class91.clientPreferences.method2562() >= Client.field717;
				int var2 = var1 ? 0 : 12;
				ScriptEvent.method2328(class190.archive10, class199.archive8, true, var2);
			}

			Client.gameState = var0;
		}
	}
}
