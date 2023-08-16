import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1909255191
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -311203443
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1752254321
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -665302455
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1360390451
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2119149505
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 989493471
	)
	int field2900;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -171385949
	)
	int field2894;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1680318827
	)
	int field2901;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1601793997
	)
	int field2893;

	WorldMapSection2() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "-474032336"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2900) {
			var1.regionLowX = this.field2900;
		}

		if (var1.regionHighX < this.field2901) {
			var1.regionHighX = this.field2901;
		}

		if (var1.regionLowY > this.field2894) {
			var1.regionLowY = this.field2894;
		}

		if (var1.regionHighY < this.field2893) {
			var1.regionHighY = this.field2893;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "509257779"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-94"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2900 && var1 >> 6 <= this.field2901 && var2 >> 6 >= this.field2894 && var2 >> 6 <= this.field2893;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "1978048199"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2900 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2894 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)Lmc;",
		garbageValue = "-1281040923"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field2900 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field2894 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "47"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2900 = var1.readUnsignedShort();
		this.field2894 = var1.readUnsignedShort();
		this.field2901 = var1.readUnsignedShort();
		this.field2893 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "120"
	)
	static final void method5103() {
		Client.field734 = Client.cycleCntr;
		WorldMapIcon_0.field2973 = true;
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2063894036"
	)
	static void method5107() {
		if (Client.oculusOrbState == 1) {
			Client.field627 = true;
		}

	}
}
