import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
public class class401 {
	@ObfuscatedName("r")
	static final int[] field4398;
	@ObfuscatedName("k")
	static final int[] field4393;
	static 
	{
		field4398 = new int[2048];
		field4393 = new int[2048];
		double var0 = 0.0030679615757712823;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4398[var2] = ((int) (65536.0 * Math.sin(((double) (var2)) * var0)));
			field4393[var2] = ((int) (65536.0 * Math.cos(((double) (var2)) * var0)));
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"298301940")

	public static int method7247(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("fe")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"2145917637")

	@Export("playSong")
	static void playSong(int var0) {
		if ((var0 == (-1)) && (!Client.field731)) {
			WorldMapEvent.midiPcmStream.clear();
			class273.musicPlayerStatus = 1;
			class147.musicTrackArchive = null;
		} else if ((((var0 != (-1)) && (var0 != Client.currentTrackGroupId)) && (Interpreter.clientPreferences.method2288() != 0)) && (!Client.field731)) {
			Archive var1 = ArchiveLoader.archive6;
			int var2 = Interpreter.clientPreferences.method2288();
			class273.musicPlayerStatus = 1;
			class147.musicTrackArchive = var1;
			ArchiveLoader.musicTrackGroupId = var0;
			class273.musicTrackFileId = 0;
			DevicePcmPlayerProvider.musicTrackVolume = var2;
			class260.musicTrackBoolean = false;
			class273.pcmSampleLength = 2;
		}

		Client.currentTrackGroupId = var0;
	}
}