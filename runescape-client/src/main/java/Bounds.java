import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -527805095
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -102290081
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1823233217
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -61485673
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "950647486"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-260511510"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-8"
	)
	public boolean method8284(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lrx;I)V",
		garbageValue = "1323786426"
	)
	public void method8306(Bounds var1, Bounds var2) {
		this.method8276(var1, var2);
		this.method8277(var1, var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lrx;B)V",
		garbageValue = "-1"
	)
	void method8276(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method8297() > var1.method8297()) {
			var2.highX -= var2.method8297() - var1.method8297();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lrx;Lrx;I)V",
		garbageValue = "1489153236"
	)
	void method8277(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method8279() > var1.method8279()) {
			var2.highY -= var2.method8279() - var1.method8279();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2139192788"
	)
	int method8297() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-49"
	)
	int method8279() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}
}
