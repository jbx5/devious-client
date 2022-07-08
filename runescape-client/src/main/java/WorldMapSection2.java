import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ht")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1337709959)
	@Export("minPlane")
	int minPlane;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -2041431669)
	@Export("planes")
	int planes;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 313441815)
	@Export("regionStartX")
	int regionStartX;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1342474779)
	@Export("regionStartY")
	int regionStartY;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1683492737)
	@Export("regionEndX")
	int regionEndX;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -966327777)
	@Export("regionEndY")
	int regionEndY;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -578189287)
	int field2693;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 306558807)
	int field2689;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 2143624865)
	int field2695;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1064831407)
	int field2687;

	WorldMapSection2() {
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lhg;I)V", garbageValue = "1585435431")
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2693) {
			var1.regionLowX = this.field2693;
		}
		if (var1.regionHighX < this.field2695) {
			var1.regionHighX = this.field2695;
		}
		if (var1.regionLowY > this.field2689) {
			var1.regionLowY = this.field2689;
		}
		if (var1.regionHighY < this.field2687) {
			var1.regionHighY = this.field2687;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIII)Z", garbageValue = "-929111713")
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-47549823")
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field2693 && var1 >> 6 <= this.field2695 && var2 >> 6 >= this.field2689 && var2 >> 6 <= this.field2687;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIII)[I", garbageValue = "-561571792")
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{ var2 + (this.field2693 * 64 - this.regionStartX * 64), var3 + (this.field2689 * 64 - this.regionStartY * 64) };
			return var4;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(III)Lkd;", garbageValue = "531454030")
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field2693 * 64 + var1;
			int var4 = var2 + (this.regionStartY * 64 - this.field2689 * 64);
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "-27")
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field2693 = var1.readUnsignedShort();
		this.field2689 = var1.readUnsignedShort();
		this.field2695 = var1.readUnsignedShort();
		this.field2687 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "20")
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "692019623")
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (class228.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!MusicPatchPcmStream.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = MusicPatchPcmStream.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				class228.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (SoundCache.Widget_interfaceComponents[var0] == null) {
					SoundCache.Widget_interfaceComponents[var0] = new Widget[var1];
				}
				for (int var2 = 0; var2 < var1; ++var2) {
					if (SoundCache.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = MusicPatchPcmStream.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							SoundCache.Widget_interfaceComponents[var0][var2] = new Widget();
							SoundCache.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								SoundCache.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								SoundCache.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}
				class228.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}
}