import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
public class class195 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lob;III)Lvc;",
		garbageValue = "-1629405083"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !class415.method7697(var0, var1, var2) ? null : class335.method6428();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "2"
	)
	static int method4210(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "33"
	)
	static final void method4206(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		TileItem.clientPreferences.updateSoundEffectVolume(var0);
	}
}
