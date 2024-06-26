import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("an")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("ItemDefinition_modelArchive")
	static AbstractArchive ItemDefinition_modelArchive;
	@ObfuscatedName("aq")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("ad")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-847803201"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-390046423"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/security/SecureRandom;",
		garbageValue = "128"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var2) {
			return class401.method7407();
		}
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-66"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class31.method462();
		class237.method4496();
		int var1 = MilliClock.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					InvDefinition.method3555(0.9D);
				}

				if (var2 == 2) {
					InvDefinition.method3555(0.8D);
				}

				if (var2 == 3) {
					InvDefinition.method3555(0.7D);
				}

				if (var2 == 4) {
					InvDefinition.method3555(0.6D);
				}
			}

			if (var1 == 3) {
				if (var2 == 0) {
					Script.setMusicVolume(255);
				}

				if (var2 == 1) {
					Script.setMusicVolume(192);
				}

				if (var2 == 2) {
					Script.setMusicVolume(128);
				}

				if (var2 == 3) {
					Script.setMusicVolume(64);
				}

				if (var2 == 4) {
					Script.setMusicVolume(0);
				}
			}

			if (var1 == 4) {
				if (var2 == 0) {
					class105.method2785(127);
				}

				if (var2 == 1) {
					class105.method2785(96);
				}

				if (var2 == 2) {
					class105.method2785(64);
				}

				if (var2 == 3) {
					class105.method2785(32);
				}

				if (var2 == 4) {
					class105.method2785(0);
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
					class148.method3278(127);
				}

				if (var2 == 1) {
					class148.method3278(96);
				}

				if (var2 == 2) {
					class148.method3278(64);
				}

				if (var2 == 3) {
					class148.method3278(32);
				}

				if (var2 == 4) {
					class148.method3278(0);
				}
			}

			if (var1 == 17) {
				Client.followerIndex = var2 & 65535;
			}

			if (var1 == 18) {
				AttackOption[] var3 = new AttackOption[]{AttackOption.AttackOption_alwaysRightClick, AttackOption.field1384, AttackOption.field1385, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden};
				Client.playerAttackOption = (AttackOption)class210.findEnumerated(var3, var2);
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
				Client.npcAttackOption = (AttackOption)class210.findEnumerated(class142.method3233(), var2);
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	}
}
