import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1488779815
	)
	public static int field4422;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 351496297
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1627346609
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 54983627
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1537853667
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4);
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1233929932"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-964537863"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1931286639"
	)
	public boolean method7113(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.lowX + this.highX && var2 >= this.lowY && var2 < this.highY + this.lowY; // L: 29
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Lnk;B)V",
		garbageValue = "2"
	)
	public void method7096(Bounds var1, Bounds var2) {
		this.method7097(var1, var2); // L: 37
		this.method7098(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Lnk;I)V",
		garbageValue = "-929205205"
	)
	void method7097(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method7117() > var1.method7117()) { // L: 48
			var2.highX -= var2.method7117() - var1.method7117(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lnk;Lnk;B)V",
		garbageValue = "25"
	)
	void method7098(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method7105() > var1.method7105()) { // L: 61
			var2.highY -= var2.method7105() - var1.method7105(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-511168866"
	)
	int method7117() {
		return this.lowX + this.highX; // L: 68
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1102543624"
	)
	int method7105() {
		return this.highY + this.lowY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "32"
	)
	public static int method7118(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0; // L: 12 13 15
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lrr;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) { // L: 100
			var2 = (RunException)var0; // L: 101
			var2.message = var2.message + ' ' + var1; // L: 102
		} else {
			var2 = new RunException(var0, var1); // L: 104
		}

		return var2; // L: 105
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1903687902"
	)
	static final int method7094(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1; // L: 959
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16); // L: 960
	}
}
