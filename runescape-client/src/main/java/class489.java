import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sb")
public class class489 implements class494 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -669571107
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lug;"
	)
	public final class524 field5079;

	@ObfuscatedSignature(
		descriptor = "(Luh;)V"
	)
	class489(class525 var1) {
		this.field5079 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lsa;)V"
	)
	public class489(class490 var1) {
		this(new class525(var1));
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "754853309"
	)
	public int method9145(int var1) {
		return this.field5079.vmethod9622(var1);
	}
}
