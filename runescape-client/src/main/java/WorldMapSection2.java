import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1291837709
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -732253953
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 736836567
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1082511595
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 969449269
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1690860691
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1244835227
	)
	int field2878;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 119416349
	)
	int field2877;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1555354181
	)
	int field2880;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1693791291
	)
	int field2875;

	WorldMapSection2() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "104966018"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2878) {
			var1.regionLowX = this.field2878;
		}

		if (var1.regionHighX < this.field2880) {
			var1.regionHighX = this.field2880;
		}

		if (var1.regionLowY > this.field2877) {
			var1.regionLowY = this.field2877;
		}

		if (var1.regionHighY < this.field2875) {
			var1.regionHighY = this.field2875;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "37"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
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
		return var1 >> 6 >= this.field2878 && var1 >> 6 <= this.field2880 && var2 >> 6 >= this.field2877 && var2 >> 6 <= this.field2875;
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
			int[] var4 = new int[]{this.field2878 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2877 * 64 - this.regionStartY * 64)};
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
			int var3 = this.regionStartX * 64 - this.field2878 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field2877 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "706418314"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2878 = var1.readUnsignedShort();
		this.field2877 = var1.readUnsignedShort();
		this.field2880 = var1.readUnsignedShort();
		this.field2875 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1492337341"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/security/SecureRandom;",
		garbageValue = "63"
	)
	static SecureRandom method5134() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}
}
