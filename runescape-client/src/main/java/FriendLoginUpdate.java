import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 910859569
	)
	public int field4683;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("ar")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lvj;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4683 = (int)(SpotAnimationDefinition.method3775() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Lhx;IIILdf;B)V",
		garbageValue = "-64"
	)
	static void method8127(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.field2212 != null && var0.field2212.containsKey(var1)) {
				int var5 = (Integer)var0.field2212.get(var1) & 15;
				if ((var5 <= 0 || WorldMapIcon_1.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var5 != 0 || WorldMapIcon_1.clientPreferences.getSoundEffectsVolume() != 0)) {
					int var6 = (Integer)var0.field2212.get(var1);
					boolean var9 = var4 == class229.localPlayer;
					if (var6 != 0) {
						int var10 = var6 & 15;
						int var11;
						int var12;
						if (var10 == 0) {
							if (!var9) {
								return;
							}

							Client.soundLocations[Client.soundEffectCount] = 0;
						} else {
							var11 = (var2 - 64) / 128;
							var12 = (var3 - 64) / 128;
							Client.soundLocations[Client.soundEffectCount] = var10 + (var12 << 8) + (var11 << 16);
						}

						var11 = var6 >> 8;
						var12 = var6 >> 4 & 7;
						Client.soundEffectIds[Client.soundEffectCount] = var11;
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var12;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
						Client.soundEffects[Client.soundEffectCount] = null;
						++Client.soundEffectCount;
					}

				}
			}
		}
	}
}
