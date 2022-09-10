import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public class class153 extends class129 {
	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static StudioGame field1729;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -876261227
	)
	int field1728;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		longValue = 830089251142411387L
	)
	long field1731;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	final class132 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leo;)V"
	)
	class153(class132 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-41"
	)
	void vmethod3320(Buffer var1) {
		this.field1728 = var1.readInt(); // L: 310
		this.field1731 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;I)V",
		garbageValue = "-538131930"
	)
	void vmethod3313(ClanSettings var1) {
		var1.method3128(this.field1728, this.field1731); // L: 315
	} // L: 316

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;II)Ljx;",
		garbageValue = "1881963859"
	)
	static MusicPatch method3312(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1); // L: 21
		return var2 == null ? null : new MusicPatch(var2); // L: 22
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "562512628"
	)
	public static boolean method3318() {
		ReflectionCheck var0 = (ReflectionCheck)class33.reflectionChecks.last(); // L: 24
		return var0 != null; // L: 25
	}
}
