import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
public class class211 {
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = -1846023185
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	public UrlRequest field2311;
	@ObfuscatedName("aw")
	public float[] field2309;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lit;)V"
	)
	class211(class221 var1) {
		this.this$0 = var1;
		this.field2309 = new float[4];
	}
}
