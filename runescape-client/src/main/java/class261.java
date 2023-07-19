import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
public class class261 implements WorldMapSection {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -90734549
	)
	int field2940;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2126667309
	)
	int field2938;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1294943143
	)
	int field2939;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1104404675
	)
	int field2946;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1985708413
	)
	int field2941;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 268701175
	)
	int field2947;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1439558903
	)
	int field2942;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -417063245
	)
	int field2944;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1217366249
	)
	int field2945;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1550977391
	)
	int field2948;

	class261() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "104966018"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2941) {
			var1.regionLowX = this.field2941;
		}

		if (var1.regionHighX < this.field2941) {
			var1.regionHighX = this.field2941;
		}

		if (var1.regionLowY > this.field2947) {
			var1.regionLowY = this.field2947;
		}

		if (var1.regionHighY < this.field2947) {
			var1.regionHighY = this.field2947;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "37"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2940 && var1 < this.field2940 + this.field2938) {
			return var2 >= (this.field2939 << 6) + (this.field2942 << 3) && var2 <= (this.field2939 << 6) + (this.field2942 << 3) + 7 && var3 >= (this.field2946 << 6) + (this.field2944 << 3) && var3 <= (this.field2946 << 6) + (this.field2944 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1055724816"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2941 << 6) + (this.field2945 << 3) && var1 <= (this.field2941 << 6) + (this.field2945 << 3) + 7 && var2 >= (this.field2947 << 6) + (this.field2948 << 3) && var2 <= (this.field2947 << 6) + (this.field2948 << 3) + 7;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1968685542"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2941 * 64 - this.field2939 * 64 + var2 + (this.field2945 * 8 - this.field2942 * 8), var3 + (this.field2947 * 64 - this.field2946 * 64) + (this.field2948 * 8 - this.field2944 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lmr;",
		garbageValue = "119"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2939 * 64 - this.field2941 * 64 + (this.field2942 * 8 - this.field2945 * 8) + var1;
			int var4 = this.field2946 * 64 - this.field2947 * 64 + var2 + (this.field2944 * 8 - this.field2948 * 8);
			return new Coord(this.field2940, var3, var4);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "706418314"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2940 = var1.readUnsignedByte();
		this.field2938 = var1.readUnsignedByte();
		this.field2939 = var1.readUnsignedShort();
		this.field2942 = var1.readUnsignedByte();
		this.field2946 = var1.readUnsignedShort();
		this.field2944 = var1.readUnsignedByte();
		this.field2941 = var1.readUnsignedShort();
		this.field2945 = var1.readUnsignedByte();
		this.field2947 = var1.readUnsignedShort();
		this.field2948 = var1.readUnsignedByte();
		this.method5404();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "522198435"
	)
	void method5404() {
	}
}
