import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hj")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("va")
	@ObfuscatedGetter(intValue = 1383695695)
	@Export("foundItemIndex")
	static int foundItemIndex;

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Lqw;")
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;

	@ObfuscatedName("fl")
	@ObfuscatedGetter(intValue = -1433834637)
	static int field2691;

	@ObfuscatedName("ie")
	@ObfuscatedSignature(descriptor = "[Lqj;")
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1622796575)
	@Export("minPlane")
	int minPlane;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -237991141)
	@Export("planes")
	int planes;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 439211747)
	@Export("regionStartX")
	int regionStartX;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 524831955)
	@Export("regionStartY")
	int regionStartY;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1059862557)
	@Export("regionEndX")
	int regionEndX;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 769010907)
	@Export("regionEndY")
	int regionEndY;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1154211551)
	int field2681;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 415204313)
	int field2688;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1371216217)
	int field2689;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 12571677)
	int field2690;

	WorldMapSection2() {
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lhw;B)V", garbageValue = "11")
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2681) {
			var1.regionLowX = this.field2681;
		}
		if (var1.regionHighX < this.field2689) {
			var1.regionHighX = this.field2689;
		}
		if (var1.regionLowY > this.field2688) {
			var1.regionLowY = this.field2688;
		}
		if (var1.regionHighY < this.field2690) {
			var1.regionHighY = this.field2690;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIII)Z", garbageValue = "-1974716574")
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "819062651")
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2681 && var1 >> 6 <= this.field2689 && var2 >> 6 >= this.field2688 && var2 >> 6 <= this.field2690;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIIB)[I", garbageValue = "24")
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{ this.field2681 * 64 - this.regionStartX * 64 + var2, var3 + (this.field2688 * 64 - this.regionStartY * 64) };
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
			int var3 = this.regionStartX * 64 - this.field2681 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field2688 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "84")
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2681 = var1.readUnsignedShort();
		this.field2688 = var1.readUnsignedShort();
		this.field2689 = var1.readUnsignedShort();
		this.field2690 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "0")
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1225163550")
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class433.getPacketBufferNode(ClientPacket.RESUME_PAUSEBUTTON, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeShortAddLE(var1);
		var2.packetBuffer.writeInt(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(descriptor = "(IIIILqj;Lkr;I)V", garbageValue = "2057360815")
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2(((double) (var10)), ((double) (var11)));
			int var14 = var5.width / 2 - 25;
			int var15 = ((int) (Math.sin(var12) * ((double) (var14))));
			int var16 = ((int) (Math.cos(var12) * ((double) (var14))));
			byte var17 = 20;
			LoginPacket.redHintArrowSprite.method8198(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			Canvas.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}
	}
}