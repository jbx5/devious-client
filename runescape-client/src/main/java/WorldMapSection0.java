import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hz")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1559912723)
	@Export("oldZ")
	int oldZ;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -905584681)
	@Export("newZ")
	int newZ;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1705774317)
	@Export("oldX")
	int oldX;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -930417029)
	@Export("oldY")
	int oldY;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 930056203)
	@Export("newX")
	int newX;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -972908557)
	@Export("newY")
	int newY;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -2061702557)
	@Export("oldChunkXLow")
	int oldChunkXLow;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 41773063)
	@Export("oldChunkYLow")
	int oldChunkYLow;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1451833721)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 868829807)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 959882011)
	@Export("newChunkXLow")
	int newChunkXLow;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 959698909)
	@Export("newChunkYLow")
	int newChunkYLow;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -2022921505)
	@Export("newChunkXHigh")
	int newChunkXHigh;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -722495117)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lhw;B)V", garbageValue = "11")
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.newX) {
			var1.regionLowX = this.newX;
		}
		if (var1.regionHighX < this.newX) {
			var1.regionHighX = this.newX;
		}
		if (var1.regionLowY > this.newY) {
			var1.regionLowY = this.newY;
		}
		if (var1.regionHighY < this.newY) {
			var1.regionHighY = this.newY;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIII)Z", garbageValue = "-1974716574")
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.newZ + this.oldZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "819062651")
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIIB)[I", garbageValue = "24")
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{ this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8) };
			return var4;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)Lkp;", garbageValue = "-711503187")
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
			int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
			return new Coord(this.oldZ, var3, var4);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "84")
	@Export("read")
	public void read(Buffer var1) {
		this.oldZ = var1.readUnsignedByte();
		this.newZ = var1.readUnsignedByte();
		this.oldX = var1.readUnsignedShort();
		this.oldChunkXLow = var1.readUnsignedByte();
		this.oldChunkXHigh = var1.readUnsignedByte();
		this.oldY = var1.readUnsignedShort();
		this.oldChunkYLow = var1.readUnsignedByte();
		this.oldChunkYHigh = var1.readUnsignedByte();
		this.newX = var1.readUnsignedShort();
		this.newChunkXLow = var1.readUnsignedByte();
		this.newChunkXHigh = var1.readUnsignedByte();
		this.newY = var1.readUnsignedShort();
		this.newChunkYLow = var1.readUnsignedByte();
		this.newChunkYHigh = var1.readUnsignedByte();
		this.postRead();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1581062019")
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(descriptor = "(IIIIIIIII)V", garbageValue = "1372426617")
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (ReflectionCheck.loadInterface(var0)) {
			class120.field1486 = null;
			ApproximateRouteStrategy.drawInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (class120.field1486 != null) {
				ApproximateRouteStrategy.drawInterface(class120.field1486, -1412584499, var1, var2, var3, var4, class124.field1525, WorldMapLabelSize.field2667, var7);
				class120.field1486 = null;
			}
		} else if (var7 != -1) {
			Client.field610[var7] = true;
		} else {
			for (int var8 = 0; var8 < 100; ++var8) {
				Client.field610[var8] = true;
			}
		}
	}
}