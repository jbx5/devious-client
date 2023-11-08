import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rv")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 174589721
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1766053499
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1385823071
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -453294997
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "20"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1923662926"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "375775673"
	)
	public boolean method8373(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.highY + this.lowY;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lrv;Lrv;I)V",
		garbageValue = "-1398838147"
	)
	public void method8375(Bounds var1, Bounds var2) {
		this.method8376(var1, var2);
		this.method8377(var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lrv;Lrv;I)V",
		garbageValue = "497587597"
	)
	void method8376(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method8389() > var1.method8389()) {
			var2.highX -= var2.method8389() - var1.method8389();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lrv;Lrv;I)V",
		garbageValue = "1262928810"
	)
	void method8377(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method8379() > var1.method8379()) {
			var2.highY -= var2.method8379() - var1.method8379();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-222138556"
	)
	int method8389() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "578775229"
	)
	int method8379() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}
}
