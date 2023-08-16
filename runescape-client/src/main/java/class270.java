import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
public class class270 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class270 field3036;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	static final class270 field3039;
	@ObfuscatedName("fb")
	@ObfuscatedGetter(
		longValue = -8732969090401109105L
	)
	static long field3042;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1287567465
	)
	@Export("value")
	final int value;

	static {
		field3036 = new class270(0);
		field3039 = new class270(1);
	}

	class270(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;ZI)V",
		garbageValue = "544527881"
	)
	static void method5492(ArrayList var0, boolean var1) {
		if (!var1) {
			class305.field3405.clear();
		}

		Iterator var2 = var0.iterator();

		while (var2.hasNext()) {
			MusicSong var3 = (MusicSong)var2.next();
			if (var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
				if (!var1) {
					class305.field3405.add(var3);
				}

				class305.field3411.add(var3);
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2087422796"
	)
	public static void method5491(int var0, int var1, int var2, int var3) {
		class305.musicPlayerStatus = var0;
		class305.field3409 = var1;
		class305.field3410 = var2;
		class305.field3401 = var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CII)Ljava/lang/String;",
		garbageValue = "1203600347"
	)
	public static String method5493(char var0, int var1) {
		char[] var2 = new char[var1];

		for (int var3 = 0; var3 < var1; ++var3) {
			var2[var3] = var0;
		}

		return new String(var2);
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "340629836"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field756 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (class218.getWindowedMode() == 1) {
			class219.client.setMaxCanvasSize(765, 503);
		} else {
			class219.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25) {
			Message.method1217();
		}

	}
}
