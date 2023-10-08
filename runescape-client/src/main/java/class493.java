import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
public class class493 extends class495 {
	@ObfuscatedName("ra")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	@Export("mouseWheel")
	static class176 mouseWheel;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 987703111
	)
	int field4916;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -253591915
	)
	int field4914;

	public class493(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field4916 = 0;
		this.field4914 = 0;
		this.field4916 = var1;
		this.field4914 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-502803957"
	)
	public int method8611() {
		double var1 = this.method8628();
		return (int)Math.round((double)this.field4916 + var1 * (double)(this.field4914 - this.field4916));
	}
}
