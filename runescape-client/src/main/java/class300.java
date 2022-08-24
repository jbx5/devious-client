import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("kv")
public final class class300 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(CI)B", garbageValue = "726344746")
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = ((byte) (var0));
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}
		return var1;
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "9")
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		class327.method5979();
		UserComparator6.method2616();
		int var1 = class78.VarpDefinition_get(var0).type;
		if (var1 != 0) {
			int var2 = Varps.Varps_main[var0];
			if (var1 == 1) {
				if (var2 == 1) {
					RouteStrategy.method3811(0.9);
				}
				if (var2 == 2) {
					RouteStrategy.method3811(0.8);
				}
				if (var2 == 3) {
					RouteStrategy.method3811(0.7);
				}
				if (var2 == 4) {
					RouteStrategy.method3811(0.6);
				}
			}
			if (var1 == 3) {
				if (var2 == 0) {
					class10.method100(255);
				}
				if (var2 == 1) {
					class10.method100(192);
				}
				if (var2 == 2) {
					class10.method100(128);
				}
				if (var2 == 3) {
					class10.method100(64);
				}
				if (var2 == 4) {
					class10.method100(0);
				}
			}
			if (var1 == 4) {
				if (var2 == 0) {
					class181.method3480(127);
				}
				if (var2 == 1) {
					class181.method3480(96);
				}
				if (var2 == 2) {
					class181.method3480(64);
				}
				if (var2 == 3) {
					class181.method3480(32);
				}
				if (var2 == 4) {
					class181.method3480(0);
				}
			}
			if (var1 == 5) {
				Client.leftClickOpensMenu = var2 == 1;
			}
			if (var1 == 6) {
				Client.chatEffects = var2;
			}
			if (var1 == 9) {
				Client.field635 = var2;
			}
			if (var1 == 10) {
				if (var2 == 0) {
					class132.method2838(127);
				}
				if (var2 == 1) {
					class132.method2838(96);
				}
				if (var2 == 2) {
					class132.method2838(64);
				}
				if (var2 == 3) {
					class132.method2838(32);
				}
				if (var2 == 4) {
					class132.method2838(0);
				}
			}
			if (var1 == 17) {
				Client.followerIndex = var2 & '￿';
			}
			AttackOption[] var3;
			if (var1 == 18) {
				var3 = new AttackOption[]{ AttackOption.field1284, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1287, AttackOption.AttackOption_alwaysRightClick };
				Client.playerAttackOption = ((AttackOption) (GameEngine.findEnumerated(var3, var2)));
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
				var3 = new AttackOption[]{ AttackOption.field1284, AttackOption.AttackOption_hidden, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.field1287, AttackOption.AttackOption_alwaysRightClick };
				Client.npcAttackOption = ((AttackOption) (GameEngine.findEnumerated(var3, var2)));
				if (Client.npcAttackOption == null) {
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}
		}
	}
}