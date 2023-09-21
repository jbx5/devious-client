import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("ap")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1750424013
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -258476373
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1857265465
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1525288227
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -493683467
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -33872161
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1580229287
	)
	int field2925;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -260284343
	)
	int field2926;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1155867775
	)
	int field2923;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 2141296325
	)
	int field2928;

	WorldMapSection2() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "1844466074"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2925) {
			var1.regionLowX = this.field2925;
		}

		if (var1.regionHighX < this.field2923) {
			var1.regionHighX = this.field2923;
		}

		if (var1.regionLowY > this.field2926) {
			var1.regionLowY = this.field2926;
		}

		if (var1.regionHighY < this.field2928) {
			var1.regionHighY = this.field2928;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1135530948"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1124460333"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2925 && var1 >> 6 <= this.field2923 && var2 >> 6 >= this.field2926 && var2 >> 6 <= this.field2928;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "557011185"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2925 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2926 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)Lmo;",
		garbageValue = "-1670709360"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field2925 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field2926 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-801073373"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2925 = var1.readUnsignedShort();
		this.field2926 = var1.readUnsignedShort();
		this.field2923 = var1.readUnsignedShort();
		this.field2928 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "20489"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1323346942"
	)
	static void method5264() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			class28.KeyHandler_keyCodes[186] = 57;
			class28.KeyHandler_keyCodes[187] = 27;
			class28.KeyHandler_keyCodes[188] = 71;
			class28.KeyHandler_keyCodes[189] = 26;
			class28.KeyHandler_keyCodes[190] = 72;
			class28.KeyHandler_keyCodes[191] = 73;
			class28.KeyHandler_keyCodes[192] = 58;
			class28.KeyHandler_keyCodes[219] = 42;
			class28.KeyHandler_keyCodes[220] = 74;
			class28.KeyHandler_keyCodes[221] = 43;
			class28.KeyHandler_keyCodes[222] = 59;
			class28.KeyHandler_keyCodes[223] = 28;
		} else {
			class28.KeyHandler_keyCodes[44] = 71;
			class28.KeyHandler_keyCodes[45] = 26;
			class28.KeyHandler_keyCodes[46] = 72;
			class28.KeyHandler_keyCodes[47] = 73;
			class28.KeyHandler_keyCodes[59] = 57;
			class28.KeyHandler_keyCodes[61] = 27;
			class28.KeyHandler_keyCodes[91] = 42;
			class28.KeyHandler_keyCodes[92] = 74;
			class28.KeyHandler_keyCodes[93] = 43;
			class28.KeyHandler_keyCodes[192] = 28;
			class28.KeyHandler_keyCodes[222] = 58;
			class28.KeyHandler_keyCodes[520] = 59;
		}

	}
}
