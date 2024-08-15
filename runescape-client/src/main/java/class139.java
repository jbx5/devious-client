import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
final class class139 implements ThreadFactory {
	@ObfuscatedName("ww")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	public static class399 field1622;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	public static AbstractArchive field1624;
	@ObfuscatedName("aa")
	static String[] field1625;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "-5"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class414.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Lkr;IIIZB)V",
		garbageValue = "-64"
	)
	static void method3253(SequenceDefinition var0, int var1, int var2, int var3, boolean var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.field2868 != null && var0.field2868.containsKey(var1)) {
				Sound var5 = (Sound)var0.field2868.get(var1);
				if (var5 != null) {
					int var6 = var5.field2727 & 31;
					if ((var6 <= 0 || TileItem.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var6 != 0 || TileItem.clientPreferences.getSoundEffectsVolume() != 0)) {
						MusicPatchNode.method6473(var5, var2, var3, var4);
					}
				}
			}
		}
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIIII)Ldg;",
		garbageValue = "-2058525462"
	)
	static final PendingSpawn method3254(WorldView var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.pendingSpawns.last(); var5 != null; var5 = (PendingSpawn)var0.pendingSpawns.previous()) {
			if (var5.plane == var1 && var2 == var5.x && var3 == var5.y && var4 == var5.type) {
				return var5;
			}
		}

		return null;
	}
}
