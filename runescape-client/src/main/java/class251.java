import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ja")
public class class251 implements WorldMapSection {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1210346411
	)
	int field2625;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1445981505
	)
	int field2622;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 205314157
	)
	int field2623;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1625304123
	)
	int field2627;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1224971547
	)
	int field2629;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1113536653
	)
	int field2626;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1438919263
	)
	int field2621;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1179156949
	)
	int field2628;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 566969525
	)
	int field2624;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1756336939
	)
	int field2630;

	class251() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "1568670940"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field2629) {
			var1.regionLowX = this.field2629;
		}

		if (var1.regionHighX < this.field2629) {
			var1.regionHighX = this.field2629;
		}

		if (var1.regionLowY > this.field2626) {
			var1.regionLowY = this.field2626;
		}

		if (var1.regionHighY < this.field2626) {
			var1.regionHighY = this.field2626;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "115"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.field2625 && var1 < this.field2622 + this.field2625) {
			return var2 >= (this.field2623 << 6) + (this.field2621 << 3) && var2 <= (this.field2623 << 6) + (this.field2621 << 3) + 7 && var3 >= (this.field2627 << 6) + (this.field2628 << 3) && var3 <= (this.field2627 << 6) + (this.field2628 << 3) + 7;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-898385408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >= (this.field2629 << 6) + (this.field2624 << 3) && var1 <= (this.field2629 << 6) + (this.field2624 << 3) + 7 && var2 >= (this.field2626 << 6) + (this.field2630 << 3) && var2 <= (this.field2626 << 6) + (this.field2630 << 3) + 7;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-35"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field2629 * 64 - this.field2623 * 64 + var2 + (this.field2624 * 8 - this.field2621 * 8), var3 + (this.field2626 * 64 - this.field2627 * 64) + (this.field2630 * 8 - this.field2628 * 8)};
			return var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Lnl;",
		garbageValue = "-55064754"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.field2623 * 64 - this.field2629 * 64 + (this.field2621 * 8 - this.field2624 * 8) + var1;
			int var4 = this.field2627 * 64 - this.field2626 * 64 + var2 + (this.field2628 * 8 - this.field2630 * 8);
			return new Coord(this.field2625, var3, var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "301668137"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.field2625 = var1.readUnsignedByte();
		this.field2622 = var1.readUnsignedByte();
		this.field2623 = var1.readUnsignedShort();
		this.field2621 = var1.readUnsignedByte();
		this.field2627 = var1.readUnsignedShort();
		this.field2628 = var1.readUnsignedByte();
		this.field2629 = var1.readUnsignedShort();
		this.field2624 = var1.readUnsignedByte();
		this.field2626 = var1.readUnsignedShort();
		this.field2630 = var1.readUnsignedByte();
		this.method4910();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1191601603"
	)
	void method4910() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/io/File;",
		garbageValue = "4"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) {
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0);
			if (var1 != null) {
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0);
				RandomAccessFile var3 = null;

				try {
					File var4 = new File(var2.getParent());
					if (!var4.exists()) {
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw");
						int var5 = var3.read();
						var3.seek(0L);
						var3.write(var5);
						var3.seek(0L);
						var3.close();
						FileSystem.FileSystem_cacheFiles.put(var0, var2);
						return var2;
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) {
							var3.close();
							var3 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}
}
