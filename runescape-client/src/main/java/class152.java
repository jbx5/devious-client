import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class152 extends class143 {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -31458575
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("am")
	String field1685;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class152(class146 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1685 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.name = this.field1685;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)Z",
		garbageValue = "-1055641095"
	)
	static boolean method3324(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = class137.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "194226215"
	)
	static void method3320(int var0, int var1, int var2, boolean var3) {
		if (var0 != 0) {
			int var4 = var0 & 15;
			int var5;
			int var6;
			if (var4 == 0) {
				if (!var3) {
					return;
				}

				Client.soundLocations[Client.soundEffectCount] = 0;
			} else {
				var5 = (var1 - 64) / 128;
				var6 = (var2 - 64) / 128;
				Client.soundLocations[Client.soundEffectCount] = var4 + (var6 << 8) + (var5 << 16);
			}

			var5 = var0 >> 8;
			var6 = var0 >> 4 & 7;
			Client.soundEffectIds[Client.soundEffectCount] = var5;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
			Client.soundEffects[Client.soundEffectCount] = null;
			++Client.soundEffectCount;
		}
	}
}
