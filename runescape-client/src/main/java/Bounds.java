import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1135336181
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 649036843
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1160059855
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -171794869
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "273817637"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1491123169"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-456576134"
	)
	public boolean method7773(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lqi;I)V",
		garbageValue = "701702269"
	)
	public void method7765(Bounds var1, Bounds var2) {
		this.method7766(var1, var2);
		this.method7767(var1, var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lqi;B)V",
		garbageValue = "42"
	)
	void method7766(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method7768() > var1.method7768()) {
			var2.highX -= var2.method7768() - var1.method7768();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lqi;B)V",
		garbageValue = "-12"
	)
	void method7767(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method7769() > var1.method7769()) {
			var2.highY -= var2.method7769() - var1.method7769();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-36"
	)
	int method7768() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "417392416"
	)
	int method7769() {
		return this.lowY + this.highY;
	}

	public String toString() {
		return null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-838824770"
	)
	static void method7788(File var0) {
		class327.FileSystem_cacheDir = var0;
		if (!class327.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}
}
