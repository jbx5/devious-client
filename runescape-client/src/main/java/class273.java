import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
public class class273 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("musicPatchesArchive")
	public static AbstractArchive musicPatchesArchive;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("soundEffectsArchive")
	public static AbstractArchive soundEffectsArchive;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	1842086067)

	@Export("musicPlayerStatus")
	public static int musicPlayerStatus;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1619549501)

	@Export("musicTrackFileId")
	public static int musicTrackFileId;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	317324399)

	@Export("pcmSampleLength")
	public static int pcmSampleLength;
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"Ljs;")

	@Export("musicTrack")
	static MusicTrack musicTrack;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lan;")

	@Export("soundCache")
	static SoundCache soundCache;
	static 
	{
		musicPlayerStatus = 0;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([Ljava/lang/CharSequence;III)Ljava/lang/String;", garbageValue = 
	"2006366579")

	public static String method5271(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var10 = var0[var1];
			return var10 == null ? "null" : var10.toString();
		} else {
			int var3 = var2 + var1;
			int var4 = 0;

			for (int var5 = var1; var5 < var3; ++var5) {
				CharSequence var9 = var0[var5];
				if (var9 == null) {
					var4 += 4;
				} else {
					var4 += var9.length();
				}
			}

			StringBuilder var8 = new StringBuilder(var4);

			for (int var6 = var1; var6 < var3; ++var6) {
				CharSequence var7 = var0[var6];
				if (var7 == null) {
					var8.append("null");
				} else {
					var8.append(var7);
				}
			}

			return var8.toString();
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"1687746978")

	static boolean method5267(int var0) {
		for (int var1 = 0; var1 < Client.field713; ++var1) {
			if (Client.field568[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}