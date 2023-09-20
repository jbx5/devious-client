import java.util.Arrays;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("fz")
	public static String field4000;
	@ObfuscatedName("kv")
	public static String field4188;
	@ObfuscatedName("kx")
	public static String field4024;
	@ObfuscatedName("kt")
	public static String field4213;

	static {
		field4000 = "Please visit the support page for assistance.";
		field4188 = "";
		field4024 = "Page has opened in the browser.";
		field4213 = "";
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "5563087"
	)
	public static boolean method6819() {
		if (!class319.field3435.isEmpty()) {
			return true;
		} else {
			return !class319.musicSongs.isEmpty() && class319.musicSongs.get(0) != null && ((MusicSong)class319.musicSongs.get(0)).midiPcmStream != null ? ((MusicSong)class319.musicSongs.get(0)).midiPcmStream.isReady() : false;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lnm;Lni;ZB)V",
		garbageValue = "-63"
	)
	public static void method6820(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7;
		var0.field3734 = new PlayerComposition(var1);
		if (!var2) {
			var0.field3734.equipment = Arrays.copyOf(var0.field3734.field3619, var0.field3734.field3619.length);
			var0.field3734.method6291();
		}

	}
}
