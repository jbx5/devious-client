import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public class class325 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2128733355
	)
	int field3540;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	class53 field3541;

	@ObfuscatedSignature(
		descriptor = "(ILch;)V"
	)
	class325(int var1, class53 var2) {
		this.field3540 = var1;
		this.field3541 = var2;
	}

	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1804688495"
	)
	static void method6326() {
		for (class227 var0 = (class227)Client.field744.last(); var0 != null; var0 = (class227)Client.field744.previous()) {
			var0.remove();
		}

	}
}
