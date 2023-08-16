import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
public class class31 {
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = -2034353787
	)
	static int field173;
	@ObfuscatedName("au")
	static Applet field170;
	@ObfuscatedName("ae")
	static String field169;

	static {
		field170 = null;
		field169 = "";
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1834627338"
	)
	static final void method466(String var0) {
		UserComparator8.method2870(var0 + " is already on your ignore list");
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lbw;I)V",
		garbageValue = "-1174367966"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZS)I",
		garbageValue = "385"
	)
	static int method461(int var0, Script var1, boolean var2) {
		return 2;
	}
}
