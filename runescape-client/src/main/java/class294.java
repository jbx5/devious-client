import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class294 {
	@ObfuscatedName("wa")
	static Iterator field3210;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	static final class294 field3209;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	static final class294 field3206;
	@ObfuscatedName("gt")
	@ObfuscatedGetter(
		intValue = 1892474103
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1517353289
	)
	@Export("value")
	final int value;

	static {
		field3209 = new class294(0);
		field3206 = new class294(1);
	}

	class294(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1548623766"
	)
	public static int method5940(int var0) {
		return class228.method4382(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	static void method5939() {
		ParamComposition.updateLoginIndex(24);
		WorldMapSection2.setLoginResponseString("", "You were disconnected from the server.", "");
	}
}
