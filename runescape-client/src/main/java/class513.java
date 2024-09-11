import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public class class513 extends class515 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1601532897
	)
	int field5175;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1761213211
	)
	int field5176;

	public class513(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5175 = 0;
		this.field5176 = 0;
		this.field5175 = var1;
		this.field5176 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "253"
	)
	public int method9306() {
		double var1 = this.method9323();
		return (int)Math.round(var1 * (double)(this.field5176 - this.field5175) + (double)this.field5175);
	}
}
