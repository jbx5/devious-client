import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("iv")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 172936477)
	@Export("width")
	int width;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1149493653)
	@Export("height")
	int height;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1711487245)
	@Export("x")
	int x;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1262950775)
	@Export("y")
	int y;

	@ObfuscatedSignature(descriptor = "Lhw;")
	final WorldMapManager this$0;

	@ObfuscatedSignature(descriptor = "(Lhw;)V")
	WorldMapRectangle(WorldMapManager var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ed")
	@ObfuscatedSignature(descriptor = "(Lgh;IIII)V", garbageValue = "-2019802998")
	static void method4912(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && ClanMate.clientPreferences.method2226() != 0) {
			if (var0.field2174 != null && var0.field2174.containsKey(var1)) {
				int var4 = ((Integer) (var0.field2174.get(var1)));
				if (var4 != 0) {
					int var7 = var4 >> 8;
					int var8 = var4 >> 4 & 7;
					int var9 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var7;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var10 = (var2 - 64) / 128;
					int var11 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16);
					++Client.soundEffectCount;
				}
			}
		}
	}
}