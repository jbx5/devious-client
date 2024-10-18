import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class353 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1282670187
	)
	public int field3794;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1451237455
	)
	public int field3793;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1714296733
	)
	public int field3795;

	class353() {
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			class167.method3766(0, 0);
		} else if (var0 != -1 && !Frames.method5267(var0) && TaskHandler.clientPreferences.getMusicVolume() != 0) {
			ArrayList var1 = new ArrayList();
			var1.add(new MusicSong(MouseHandler.archive6, var0, 0, TaskHandler.clientPreferences.getMusicVolume(), false));
			if (Client.playingJingle) {
				class254.method5316(var1, 0, 100, 100, 0);
			} else {
				ParamComposition.method4154(var1, 0, 100, 100, 0, false);
			}
		}

	}
}
