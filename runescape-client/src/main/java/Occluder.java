import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jf")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1025240969
	)
	int field2821;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1453570063
	)
	int field2813;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 469225541
	)
	int field2814;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 279556457
	)
	int field2826;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -831024831
	)
	int field2818;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 2010056849
	)
	int field2817;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -69169141
	)
	int field2815;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -313400937
	)
	int field2828;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 373936233
	)
	int field2820;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -569242405
	)
	int field2812;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -402547651
	)
	int field2822;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -61929801
	)
	int field2823;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 455234887
	)
	int field2824;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1532708701
	)
	int field2825;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 695254481
	)
	int field2819;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 929221857
	)
	int field2827;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1200935641
	)
	int field2816;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1142527599
	)
	int field2829;

	Occluder() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-957401312"
	)
	static final void method5112(String var0) {
		StringBuilder var10000 = new StringBuilder();
		Object var10001 = null;
		var10000 = var10000.append("Please remove ").append(var0);
		var10001 = null;
		String var1 = var10000.append(" from your friend list first").toString();
		UrlRequest.addGameMessage(30, "", var1);
	}
}
