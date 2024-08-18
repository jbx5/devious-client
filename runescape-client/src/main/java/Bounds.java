import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1726680023
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2128003761
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 505902183
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1815063733
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "124"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1413761052"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "1"
	)
	public boolean method7772(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Lqw;I)V",
		garbageValue = "-1584901122"
	)
	public void method7774(Bounds var1, Bounds var2) {
		this.method7790(var1, var2);
		this.method7775(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Lqw;I)V",
		garbageValue = "-2134702622"
	)
	void method7790(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method7777() > var1.method7777()) {
			var2.highX -= var2.method7777() - var1.method7777();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqw;Lqw;I)V",
		garbageValue = "1921902789"
	)
	void method7775(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method7800() > var1.method7800()) {
			var2.highY -= var2.method7800() - var1.method7800();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "43"
	)
	int method7777() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1494290757"
	)
	int method7800() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
