import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tn")
public class class494 extends class496 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -153303191
	)
	public static int field4948;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1828757051
	)
	int field4946;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1050402841
	)
	int field4945;

	public class494(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field4946 = 0;
		this.field4945 = 0;
		this.field4946 = var1;
		this.field4945 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "18"
	)
	public int method8812() {
		double var1 = this.method8828();
		return (int)Math.round(var1 * (double)(this.field4945 - this.field4946) + (double)this.field4946);
	}
}
