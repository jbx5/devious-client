import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hh")
public class class229 implements WorldMapSection {
	@ObfuscatedName("cr")
	public static char field2794;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 890623543
	)
	int field2791;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -127091579
	)
	int field2786;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1060411529
	)
	int field2785;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 632643049
	)
	int field2787;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -722115847
	)
	int field2788;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -574751975
	)
	int field2789;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1379378373
	)
	int field2784;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1957778393
	)
	int field2790;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -306154069
	)
	int field2792;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 619275975
	)
	int field2793;

	class229() {
	} // L: 18

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "1697283195"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2788) { // L: 22
			var1.regionLowX = this.field2788;
		}

		if (var1.regionHighX < this.field2788) {
			var1.regionHighX = this.field2788;
		}

		if (var1.regionLowY > this.field2789) {
			var1.regionLowY = this.field2789;
		}

		if (var1.regionHighY < this.field2789) {
			var1.regionHighY = this.field2789;
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-24"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2791 && var1 < this.field2786 + this.field2791) {
			return var2 >= (this.field2785 << 6) + (this.field2784 << 3) && var2 <= (this.field2785 << 6) + (this.field2784 << 3) + 7 && var3 >= (this.field2787 << 6) + (this.field2790 << 3) && var3 <= (this.field2787 << 6) + (this.field2790 << 3) + 7; // L: 33
		} else {
			return false; // L: 31
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-428509434"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2788 << 6) + (this.field2792 << 3) && var1 <= (this.field2788 << 6) + (this.field2792 << 3) + 7 && var2 >= (this.field2789 << 6) + (this.field2793 << 3) && var2 <= (this.field2789 << 6) + (this.field2793 << 3) + 7; // L: 38
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-81"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) { // L: 43
			return null; // L: 44
		} else {
			int[] var4 = new int[]{this.field2788 * 64 - this.field2785 * 64 + var2 + (this.field2792 * 8 - this.field2784 * 8), var3 + (this.field2789 * 64 - this.field2787 * 64) + (this.field2793 * 8 - this.field2790 * 8)}; // L: 46 47 48
			return var4; // L: 49
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)Lkz;",
		garbageValue = "244140613"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) { // L: 54
			return null; // L: 55
		} else {
			int var3 = this.field2785 * 64 - this.field2788 * 64 + (this.field2784 * 8 - this.field2792 * 8) + var1; // L: 57
			int var4 = this.field2787 * 64 - this.field2789 * 64 + var2 + (this.field2790 * 8 - this.field2793 * 8); // L: 58
			return new Coord(this.field2791, var3, var4); // L: 59
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "53690591"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2791 = var1.readUnsignedByte(); // L: 64
		this.field2786 = var1.readUnsignedByte(); // L: 65
		this.field2785 = var1.readUnsignedShort(); // L: 66
		this.field2784 = var1.readUnsignedByte(); // L: 67
		this.field2787 = var1.readUnsignedShort(); // L: 68
		this.field2790 = var1.readUnsignedByte(); // L: 69
		this.field2788 = var1.readUnsignedShort(); // L: 70
		this.field2792 = var1.readUnsignedByte(); // L: 71
		this.field2789 = var1.readUnsignedShort(); // L: 72
		this.field2793 = var1.readUnsignedByte(); // L: 73
		this.method5002(); // L: 74
	} // L: 75

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "989821121"
	)
	void method5002() {
	} // L: 77

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SI)V",
		garbageValue = "1924570041"
	)
	public static void method5022(String[] var0, short[] var1) {
		class433.sortItemsByName(var0, var1, 0, var0.length - 1); // L: 9
	} // L: 10

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lpt;",
		garbageValue = "1302667977"
	)
	@Export("getDbTableType")
	public static DbTableType getDbTableType(int var0) {
		DbTableType var1 = (DbTableType)DbTableType.DBTableType_cache.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = DbTableType.field4708.takeFile(39, var0); // L: 25
			var1 = new DbTableType(); // L: 26
			if (var2 != null) { // L: 27
				var1.method7808(new Buffer(var2));
			}

			var1.method7809(); // L: 28
			DbTableType.DBTableType_cache.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-1818370618"
	)
	static int method5006(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) { // L: 3768
			Client.logoutTimer = 250; // L: 3769
			return 1; // L: 3770
		} else {
			return 2; // L: 3772
		}
	}
}
