import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nz")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1730052269)
	@Export("lowX")
	public int lowX;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -1449954509)
	@Export("lowY")
	public int lowY;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1503799883)
	@Export("highX")
	public int highX;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 173238267)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1352377690")
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "64")
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIB)Z", garbageValue = "-69")
	public boolean method6950(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lnz;Lnz;B)V", garbageValue = "-1")
	public void method6937(Bounds var1, Bounds var2) {
		this.method6936(var1, var2);
		this.method6934(var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnz;Lnz;I)V", garbageValue = "1197506262")
	void method6936(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}
		if (var2.method6938() > var1.method6938()) {
			var2.highX -= var2.method6938() - var1.method6938();
		}
		if (var2.highX < 0) {
			var2.highX = 0;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lnz;Lnz;I)V", garbageValue = "-1765864758")
	void method6934(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}
		if (var2.method6939() > var1.method6939()) {
			var2.highY -= var2.method6939() - var1.method6939();
		}
		if (var2.highY < 0) {
			var2.highY = 0;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1976104485")
	int method6938() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1849066584")
	int method6939() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}
}