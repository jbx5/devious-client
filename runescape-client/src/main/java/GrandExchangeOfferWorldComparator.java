import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("lm")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llj;Llj;B)I", garbageValue = "90")
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : var2.world == var1.world ? 0 : 1;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("fj")
	@ObfuscatedSignature(descriptor = "(Lgc;IIIB)V", garbageValue = "7")
	static void method5997(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class19.clientPreferences.method2262() != 0) {
			if (var0.field2172 != null && var0.field2172.containsKey(var1)) {
				int var4 = ((Integer) (var0.field2172.get(var1)));
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