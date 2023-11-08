import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class240 implements WorldMapSection {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1222193481
	)
	int field2515;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1538647535
	)
	int field2512;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1275308633
	)
	int field2519;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 169195253
	)
	int field2514;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1569962609
	)
	int field2513;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 71945279
	)
	int field2516;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -505666393
	)
	int field2518;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2008797759
	)
	int field2517;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 985964181
	)
	int field2520;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -341717279
	)
	int field2521;

	class240() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljv;B)V",
		garbageValue = "16"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2513) {
			var1.regionLowX = this.field2513;
		}

		if (var1.regionHighX < this.field2513) {
			var1.regionHighX = this.field2513;
		}

		if (var1.regionLowY > this.field2516) {
			var1.regionLowY = this.field2516;
		}

		if (var1.regionHighY < this.field2516) {
			var1.regionHighY = this.field2516;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "2"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2515 && var1 < this.field2512 + this.field2515) {
			return var2 >= (this.field2519 << 6) + (this.field2518 << 3) && var2 <= (this.field2519 << 6) + (this.field2518 << 3) + 7 && var3 >= (this.field2514 << 6) + (this.field2517 << 3) && var3 <= (this.field2514 << 6) + (this.field2517 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "542110974"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2513 << 6) + (this.field2520 << 3) && var1 <= (this.field2513 << 6) + (this.field2520 << 3) + 7 && var2 >= (this.field2516 << 6) + (this.field2521 << 3) && var2 <= (this.field2516 << 6) + (this.field2521 << 3) + 7;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIS)[I",
		garbageValue = "12300"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2513 * 64 - this.field2519 * 64 + var2 + (this.field2520 * 8 - this.field2518 * 8), var3 + (this.field2516 * 64 - this.field2514 * 64) + (this.field2521 * 8 - this.field2517 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)Lmh;",
		garbageValue = "-1535299153"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2519 * 64 - this.field2513 * 64 + (this.field2518 * 8 - this.field2520 * 8) + var1;
			int var4 = this.field2514 * 64 - this.field2516 * 64 + var2 + (this.field2517 * 8 - this.field2521 * 8);
			return new Coord(this.field2515, var3, var4);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "-10"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2515 = var1.readUnsignedByte();
		this.field2512 = var1.readUnsignedByte();
		this.field2519 = var1.readUnsignedShort();
		this.field2518 = var1.readUnsignedByte();
		this.field2514 = var1.readUnsignedShort();
		this.field2517 = var1.readUnsignedByte();
		this.field2513 = var1.readUnsignedShort();
		this.field2520 = var1.readUnsignedByte();
		this.field2516 = var1.readUnsignedShort();
		this.field2521 = var1.readUnsignedByte();
		this.method4805();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	void method4805() {
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-976406979"
	)
	static final int method4829(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-28"
	)
	static void method4808(int var0) {
		SequenceDefinition var1 = DynamicObject.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			if (MouseRecorder.method2372(var1.SequenceDefinition_cachedModelId) == 2) {
				Client.field500.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
