import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
public class class225 extends Node {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -808397243
	)
	public int field2389;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -948131763
	)
	public int field2390;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 913758287
	)
	public int field2388;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	public Widget field2391;

	@ObfuscatedSignature(
		descriptor = "(IIILnn;)V"
	)
	public class225(int var1, int var2, int var3, Widget var4) {
		this.field2388 = var1;
		this.field2389 = var2;
		this.field2390 = var3;
		this.field2391 = var4;
	}
}
