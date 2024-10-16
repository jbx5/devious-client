import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -432555287
	)
	@Export("oldZ")
	int oldZ;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1265509527
	)
	@Export("newZ")
	int newZ;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 561382393
	)
	@Export("oldX")
	int oldX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 453232819
	)
	@Export("oldY")
	int oldY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1699514911
	)
	@Export("newX")
	int newX;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 800659713
	)
	@Export("newY")
	int newY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -460910995
	)
	@Export("oldChunkXLow")
	int oldChunkXLow;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 466620029
	)
	@Export("oldChunkYLow")
	int oldChunkYLow;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 978049819
	)
	@Export("oldChunkXHigh")
	int oldChunkXHigh;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1895387971
	)
	@Export("oldChunkYHigh")
	int oldChunkYHigh;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1591019951
	)
	@Export("newChunkXLow")
	int newChunkXLow;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -136889867
	)
	@Export("newChunkYLow")
	int newChunkYLow;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1593670785
	)
	@Export("newChunkXHigh")
	int newChunkXHigh;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -180249501
	)
	@Export("newChunkYHigh")
	int newChunkYHigh;

	WorldMapSection0() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkp;I)V",
		garbageValue = "-1801855578"
	)
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1302944886"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
			return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-75"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "114"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Lnn;",
		garbageValue = "-246633808"
	)
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "2108862730"
	)
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1587677171"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)V",
		garbageValue = "-1334786950"
	)
	static void method6243(Widget var0) {
		var0.method7324();
		var0.method7304().method7067(new class110(var0));
		var0.method7304().method7055(new class111(var0));
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(Liu;IIIZB)V",
		garbageValue = "1"
	)
	static void method6223(SequenceDefinition var0, int var1, int var2, int var3, boolean var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.field2310 != null && var0.field2310.containsKey(var1)) {
				ArrayList var5 = (ArrayList)var0.field2310.get(var1);
				if (!var5.isEmpty()) {
					int var6 = 0;
					int var8;
					if (var5.size() > 1) {
						int var7 = 1 + (int)(Math.random() * 100.0D);
						var8 = 0;

						for (Iterator var9 = var5.iterator(); var9.hasNext(); ++var6) {
							class208 var10 = (class208)var9.next();
							int var11 = var8;
							var8 += var10.field2166;
							if (var11 <= var7 && var7 < var8) {
								break;
							}
						}

						if (var6 >= var5.size()) {
							return;
						}
					}

					class208 var15 = (class208)var5.get(var6);
					var8 = var15.field2165 & 31;
					if ((var8 <= 0 || TaskHandler.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var8 != 0 || TaskHandler.clientPreferences.getSoundEffectsVolume() != 0)) {
						if (var15 != null) {
							if (var15.field2165 == 0) {
								if (!var4) {
									return;
								}

								Client.soundLocations[Client.soundEffectCount] = 0;
							} else {
								int var13 = (var2 - 64) / 128;
								int var14 = (var3 - 64) / 128;
								Client.soundLocations[Client.soundEffectCount] = (var14 << 8) + (var13 << 16) + var15.field2165;
							}

							Client.soundEffectIds[Client.soundEffectCount] = var15.field2171;
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var15.field2167;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.field573[Client.soundEffectCount] = var15.field2169;
							++Client.soundEffectCount;
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2108574366"
	)
	static final void method6229(int var0, int var1, int var2, int var3) {
		AbstractUserComparator.method9037();
	}
}
