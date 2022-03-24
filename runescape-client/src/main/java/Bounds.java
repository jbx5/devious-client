import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("iw")
	@ObfuscatedSignature(descriptor = 
	"[Lql;")

	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1629370451)

	@Export("lowX")
	public int lowX;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1059092457)

	@Export("lowY")
	public int lowY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1428810555)

	@Export("highX")
	public int highX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	-1673451589)

	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-1528835828")

	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-1509312094")

	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IIB)Z", garbageValue = 
	"21")

	public boolean method6983(int var1, int var2) {
		return (((var1 >= this.lowX) && (var1 < (this.lowX + this.highX))) && (var2 >= this.lowY)) && (var2 < (this.lowY + this.highY));
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Lnm;Lnm;B)V", garbageValue = 
	"-1")

	public void method6985(Bounds var1, Bounds var2) {
		this.method6986(var1, var2);
		this.method7001(var1, var2);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lnm;Lnm;B)V", garbageValue = 
	"127")

	void method6986(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX = ((var2.highX * (-23049715)) - ((var1.lowX * (-23049715)) - (this.lowX * (-23049715)))) * (-1428810555);
			var2.lowX = var1.lowX;
		}

		if (var2.method6988() > var1.method6988()) {
			var2.highX -= var2.method6988() - var1.method6988();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lnm;Lnm;I)V", garbageValue = 
	"1907619314")

	void method7001(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY = ((var2.highY * 206931315) - ((var1.lowY * 206931315) - (this.lowY * 206931315))) * (-1673451589);
			var2.lowY = var1.lowY;
		}

		if (var2.method6989() > var1.method6989()) {
			var2.highY -= var2.method6989() - var1.method6989();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1510318175")

	int method6988() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"2121391140")

	int method6989() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}
}