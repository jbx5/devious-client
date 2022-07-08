import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ns")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 517285011)
	@Export("lowX")
	public int lowX;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -423053517)
	@Export("lowY")
	public int lowY;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 140797543)
	@Export("highX")
	public int highX;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1996835867)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1051510315")
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1045599332")
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIB)Z", garbageValue = "4")
	public boolean method6894(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lns;Lns;I)V", garbageValue = "-1054483070")
	public void method6895(Bounds var1, Bounds var2) {
		this.method6909(var1, var2);
		this.method6918(var1, var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lns;Lns;I)V", garbageValue = "-261568568")
	void method6909(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX = (var2.highX * 1517770071 - (var1.lowX * 1517770071 - this.lowX * 1517770071)) * 140797543;
			var2.lowX = var1.lowX;
		}
		if (var2.method6898() > var1.method6898()) {
			var2.highX -= var2.method6898() - var1.method6898();
		}
		if (var2.highX < 0) {
			var2.highX = 0;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lns;Lns;I)V", garbageValue = "-1779613636")
	void method6918(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY = (var2.highY * -1363956205 - (var1.lowY * -1363956205 - this.lowY * -1363956205)) * 1996835867;
			var2.lowY = var1.lowY;
		}
		if (var2.method6903() > var1.method6903()) {
			var2.highY -= var2.method6903() - var1.method6903();
		}
		if (var2.highY < 0) {
			var2.highY = 0;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-78")
	int method6898() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-91")
	int method6903() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "2")
	static int method6922(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;
			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}
			return var3;
		}
	}
}