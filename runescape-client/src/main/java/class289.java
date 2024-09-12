import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
public class class289 implements WorldMapSection {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -113897223
	)
	int field3157;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 748843479
	)
	int field3158;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -577507789
	)
	int field3149;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 295692027
	)
	int field3152;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1425950757
	)
	int field3151;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 113648275
	)
	int field3154;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 216426421
	)
	int field3155;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -208250525
	)
	int field3156;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -325756581
	)
	int field3153;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 218288225
	)
	int field3150;

	class289() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "-1991951399"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3151) {
			var1.regionLowX = this.field3151;
		}

		if (var1.regionHighX < this.field3151) {
			var1.regionHighX = this.field3151;
		}

		if (var1.regionLowY > this.field3154) {
			var1.regionLowY = this.field3154;
		}

		if (var1.regionHighY < this.field3154) {
			var1.regionHighY = this.field3154;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-644828112"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field3157 && var1 < this.field3158 + this.field3157) {
			return var2 >= (this.field3149 << 6) + (this.field3155 << 3) && var2 <= (this.field3149 << 6) + (this.field3155 << 3) + 7 && var3 >= (this.field3152 << 6) + (this.field3156 << 3) && var3 <= (this.field3152 << 6) + (this.field3156 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2038421096"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field3151 << 6) + (this.field3153 << 3) && var1 <= (this.field3151 << 6) + (this.field3153 << 3) + 7 && var2 >= (this.field3154 << 6) + (this.field3150 << 3) && var2 <= (this.field3154 << 6) + (this.field3150 << 3) + 7;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "1"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3151 * 64 - this.field3149 * 64 + var2 + (this.field3153 * 8 - this.field3155 * 8), var3 + (this.field3154 * 64 - this.field3152 * 64) + (this.field3150 * 8 - this.field3156 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Lnm;",
		garbageValue = "1877296615"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field3149 * 64 - this.field3151 * 64 + (this.field3155 * 8 - this.field3153 * 8) + var1;
			int var4 = this.field3152 * 64 - this.field3154 * 64 + var2 + (this.field3156 * 8 - this.field3150 * 8);
			return new Coord(this.field3157, var3, var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "814828591"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field3157 = var1.readUnsignedByte();
		this.field3158 = var1.readUnsignedByte();
		this.field3149 = var1.readUnsignedShort();
		this.field3155 = var1.readUnsignedByte();
		this.field3152 = var1.readUnsignedShort();
		this.field3156 = var1.readUnsignedByte();
		this.field3151 = var1.readUnsignedShort();
		this.field3153 = var1.readUnsignedByte();
		this.field3154 = var1.readUnsignedShort();
		this.field3150 = var1.readUnsignedByte();
		this.method6067();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-58"
	)
	void method6067() {
	}

	@ObfuscatedName("ae")
	static double method6069(double var0, double var2, double var4) {
		return class354.method6859((var0 - var2) / var4) / var4;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIILid;II)V",
		garbageValue = "171358687"
	)
	@Export("createObjectSound")
	static void createObjectSound(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 16384;
		var5.maxY = (var7 + var2) * 16384;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field857 = var3.int7 * 128;
		var5.field864 = Math.max(var3.int8 * 128 - 128, 0);
		var5.field861 = var3.int5;
		var5.field862 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field860 = var5.field861 + (int)(Math.random() * (double)(var5.field862 - var5.field861));
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "26"
	)
	public static int method6083(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)Lny;",
		garbageValue = "-1899901768"
	)
	static Widget method6090(Widget var0) {
		Widget var2 = var0;
		int var3 = class149.method3465(class310.getWidgetFlags(var0));
		Widget var1;
		if (var3 == 0) {
			var1 = null;
		} else {
			int var4 = 0;

			while (true) {
				if (var4 >= var3) {
					var1 = var2;
					break;
				}

				var2 = TaskHandler.widgetDefinition.method6841(var2.parentId);
				if (var2 == null) {
					var1 = null;
					break;
				}

				++var4;
			}
		}

		Widget var5 = var1;
		if (var1 == null) {
			var5 = var0.parent;
		}

		return var5;
	}
}
