import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("ft")
public class class160 {
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -942095737)
	@Export("pcmSampleLength")
	public static int pcmSampleLength;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 128601363)
	static int field1744;

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Lib;")
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;

	@ObfuscatedName("fz")
	@ObfuscatedGetter(intValue = -975943677)
	static int field1751;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lcv;")
	public UrlRequest field1749;

	@ObfuscatedName("h")
	public float[] field1748;

	@ObfuscatedSignature(descriptor = "Leu;")
	final class155 this$0;

	@ObfuscatedSignature(descriptor = "(Leu;)V")
	class160(class155 var1) {
		this.this$0 = var1;
		this.field1748 = new float[4];
	}
}