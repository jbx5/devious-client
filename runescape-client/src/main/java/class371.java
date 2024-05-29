import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oq")
public class class371 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	static final class371 field4044;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loq;"
	)
	static final class371 field4043;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 684695629
	)
	final int field4045;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -153254801
	)
	final int field4046;

	static {
		field4044 = new class371(51, 27, 800, 0, 16, 16);
		field4043 = new class371(25, 28, 800, 656, 40, 40);
	}

	class371(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field4045 = var5;
		this.field4046 = var6;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V",
		garbageValue = "-2088348581"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		class144.runScript(var0, 500000, 475000);
	}
}
