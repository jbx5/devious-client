import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("fx")
	@ObfuscatedGetter(
		intValue = 1366507483
	)
	static int field464;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1591927667
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("f")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("n")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1; // L: 5
	} // L: 9

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "1"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2]; // L: 114
		int var4 = 0; // L: 115

		for (int var5 = 0; var5 < var2; ++var5) { // L: 116
			int var6 = var0[var5 + var1] & 255; // L: 117
			if (var6 != 0) { // L: 118
				if (var6 >= 128 && var6 < 160) { // L: 119
					char var7 = class342.cp1252AsciiExtension[var6 - 128]; // L: 120
					if (var7 == 0) { // L: 121
						var7 = '?';
					}

					var6 = var7; // L: 122
				}

				var3[var4++] = (char)var6; // L: 124
			}
		}

		return new String(var3, 0, var4); // L: 126
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-585468309"
	)
	static final void method1133() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 7680 7681 7687
			if (var0.hitpoints == -1) { // L: 7682
				var0.delay = 0; // L: 7683
				class20.method302(var0); // L: 7684
			} else {
				var0.remove(); // L: 7686
			}
		}

	} // L: 7689

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Lkw;B)V",
		garbageValue = "23"
	)
	static final void method1134(Widget var0) {
		int var1 = var0.contentType; // L: 11675
		if (var1 == 324) { // L: 11676
			if (Client.field566 == -1) { // L: 11677
				Client.field566 = var0.spriteId2; // L: 11678
				Client.field715 = var0.spriteId; // L: 11679
			}

			if (Client.playerAppearance.isFemale) { // L: 11681
				var0.spriteId2 = Client.field566;
			} else {
				var0.spriteId2 = Client.field715; // L: 11682
			}

		} else if (var1 == 325) { // L: 11685
			if (Client.field566 == -1) { // L: 11686
				Client.field566 = var0.spriteId2; // L: 11687
				Client.field715 = var0.spriteId; // L: 11688
			}

			if (Client.playerAppearance.isFemale) { // L: 11690
				var0.spriteId2 = Client.field715;
			} else {
				var0.spriteId2 = Client.field566; // L: 11691
			}

		} else if (var1 == 327) { // L: 11694
			var0.modelAngleX = 150; // L: 11695
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11696
			var0.modelType = 5; // L: 11697
			var0.modelId = 0; // L: 11698
		} else if (var1 == 328) { // L: 11701
			var0.modelAngleX = 150; // L: 11702
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 11703
			var0.modelType = 5; // L: 11704
			var0.modelId = 1; // L: 11705
		}
	} // L: 11683 11692 11699 11706 11708
}
