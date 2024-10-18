import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class268 extends Node {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	static IndexedSprite field2981;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -121992435
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1238518655
	)
	public int field2977;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1022403081
	)
	public int field2978;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 386345073
	)
	public int field2979;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	public Widget field2980;

	@ObfuscatedSignature(
		descriptor = "(IIILng;)V"
	)
	public class268(int var1, int var2, int var3, Widget var4) {
		this.field2979 = var1;
		this.field2977 = var2;
		this.field2978 = var3;
		this.field2980 = var4;
	}
}
