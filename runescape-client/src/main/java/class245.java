import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jj")
public class class245 implements WorldMapSection {
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 1542107475
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1001272725
	)
	int field2575;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1735762615
	)
	int field2566;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -372995971
	)
	int field2570;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1884895917
	)
	int field2568;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1508655163
	)
	int field2567;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1258010375
	)
	int field2565;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1029919583
	)
	int field2569;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -104426759
	)
	int field2572;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -687013449
	)
	int field2573;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1155635929
	)
	int field2574;

	class245() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljw;I)V",
		garbageValue = "1490465463"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2567) {
			var1.regionLowX = this.field2567;
		}

		if (var1.regionHighX < this.field2567) {
			var1.regionHighX = this.field2567;
		}

		if (var1.regionLowY > this.field2565) {
			var1.regionLowY = this.field2565;
		}

		if (var1.regionHighY < this.field2565) {
			var1.regionHighY = this.field2565;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1956662927"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2575 && var1 < this.field2575 + this.field2566) {
			return var2 >= (this.field2570 << 6) + (this.field2569 << 3) && var2 <= (this.field2570 << 6) + (this.field2569 << 3) + 7 && var3 >= (this.field2568 << 6) + (this.field2572 << 3) && var3 <= (this.field2568 << 6) + (this.field2572 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-677960221"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2567 << 6) + (this.field2573 << 3) && var1 <= (this.field2567 << 6) + (this.field2573 << 3) + 7 && var2 >= (this.field2565 << 6) + (this.field2574 << 3) && var2 <= (this.field2565 << 6) + (this.field2574 << 3) + 7;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1252911580"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2567 * 64 - this.field2570 * 64 + var2 + (this.field2573 * 8 - this.field2569 * 8), var3 + (this.field2565 * 64 - this.field2568 * 64) + (this.field2574 * 8 - this.field2572 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Lns;",
		garbageValue = "-1671728396"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2570 * 64 - this.field2567 * 64 + (this.field2569 * 8 - this.field2573 * 8) + var1;
			int var4 = this.field2568 * 64 - this.field2565 * 64 + var2 + (this.field2572 * 8 - this.field2574 * 8);
			return new Coord(this.field2575, var3, var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "-1659975265"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2575 = var1.readUnsignedByte();
		this.field2566 = var1.readUnsignedByte();
		this.field2570 = var1.readUnsignedShort();
		this.field2569 = var1.readUnsignedByte();
		this.field2568 = var1.readUnsignedShort();
		this.field2572 = var1.readUnsignedByte();
		this.field2567 = var1.readUnsignedShort();
		this.field2573 = var1.readUnsignedByte();
		this.field2565 = var1.readUnsignedShort();
		this.field2574 = var1.readUnsignedByte();
		this.method4941();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1575864257"
	)
	void method4941() {
	}
}
