import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1496433009)

	@Export("lowX")
	public int lowX;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	1348899275)

	@Export("lowY")
	public int lowY;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	2132855023)

	@Export("highX")
	public int highX;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1258662357)

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
	"691768070")

	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"1684494436")

	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(III)Z", garbageValue = 
	"2065555787")

	public boolean method6944(int var1, int var2) {
		return (((var1 >= this.lowX) && (var1 < (this.lowX + this.highX))) && (var2 >= this.lowY)) && (var2 < (this.highY + this.lowY));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lnm;Lnm;I)V", garbageValue = 
	"1872281468")

	public void method6945(Bounds var1, Bounds var2) {
		this.method6946(var1, var2);
		this.method6947(var1, var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Lnm;Lnm;S)V", garbageValue = 
	"3154")

	void method6946(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX = ((var2.highX * 1363895823) - ((var1.lowX * 1363895823) - (this.lowX * 1363895823))) * 2132855023;
			var2.lowX = var1.lowX;
		}

		if (var2.method6965() > var1.method6965()) {
			var2.highX -= var2.method6965() - var1.method6965();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lnm;Lnm;B)V", garbageValue = 
	"0")

	void method6947(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY = ((var2.highY * 446318461) - ((var1.lowY * 446318461) - (this.lowY * 446318461))) * 1258662357;
			var2.lowY = var1.lowY;
		}

		if (var2.method6949() > var1.method6949()) {
			var2.highY -= var2.method6949() - var1.method6949();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"44")

	int method6965() {
		return this.highX + this.lowX;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1934877561")

	int method6949() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lln;I)V", garbageValue = 
	"1725122550")

	public static void method6969(AbstractArchive var0) {
	}
}