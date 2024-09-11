import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("coord2")
	public final Coord coord2;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("coord1")
	public final Coord coord1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 546900797
	)
	@Export("screenX")
	int screenX;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2045810419
	)
	@Export("screenY")
	int screenY;

	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;)V"
	)
	AbstractWorldMapIcon(Coord var1, Coord var2) {
		this.coord1 = var1;
		this.coord2 = var2;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1570517373"
	)
	@Export("getElement")
	public abstract int getElement();

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lls;",
		garbageValue = "43"
	)
	@Export("getLabel")
	abstract WorldMapLabel getLabel();

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-288166594"
	)
	@Export("getSubWidth")
	abstract int getSubWidth();

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1390628388"
	)
	@Export("getSubHeight")
	abstract int getSubHeight();

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-576384506"
	)
	@Export("fitsScreen")
	boolean fitsScreen(int var1, int var2) {
		if (this.elementFitsScreen(var1, var2)) {
			return true;
		} else {
			return this.labelFitsScreen(var1, var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-48"
	)
	@Export("hasValidElement")
	boolean hasValidElement() {
		return this.getElement() >= 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-2039535952"
	)
	@Export("elementFitsScreen")
	boolean elementFitsScreen(int var1, int var2) {
		if (!this.hasValidElement()) {
			return false;
		} else {
			WorldMapElement var3 = class142.WorldMapElement_get(this.getElement());
			int var4 = this.getSubWidth();
			int var5 = this.getSubHeight();
			switch(var3.horizontalAlignment.value) {
			case 0:
				if (var1 >= this.screenX && var1 < var4 + this.screenX) {
					break;
				}

				return false;
			case 1:
				if (var1 > this.screenX - var4 && var1 <= this.screenX) {
					break;
				}

				return false;
			case 2:
				if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
					return false;
				}
			}

			switch(var3.verticalAlignment.value) {
			case 0:
				if (var2 >= this.screenY - var5 / 2 && var2 <= var5 / 2 + this.screenY) {
					break;
				}

				return false;
			case 1:
				if (var2 > this.screenY - var5 && var2 <= this.screenY) {
					break;
				}

				return false;
			case 2:
				if (var2 < this.screenY || var2 >= var5 + this.screenY) {
					return false;
				}
			}

			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-10"
	)
	@Export("labelFitsScreen")
	boolean labelFitsScreen(int var1, int var2) {
		WorldMapLabel var3 = this.getLabel();
		if (var3 == null) {
			return false;
		} else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
			return var2 >= this.screenY && var2 <= var3.height + this.screenY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpo;I)V",
		garbageValue = "1919190771"
	)
	public static void method6255(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "64"
	)
	public static void method6257(int var0, int var1) {
		class433.method8269(var0, var1, 0, 0);
		class334.field3619.clear();
		class334.field3620.clear();
		if (class334.musicSongs.isEmpty() || var0 == 0 && var1 == 0) {
			class60.method1192();
		} else {
			class334.field3620.add(new DelayFadeTask((SongTask)null, class334.musicPlayerStatus));
			class334.field3620.add(new FadeOutTask((SongTask)null, 0, false, class334.field3614));
			ArrayList var3 = new ArrayList();
			Iterator var4 = class334.musicSongs.iterator();

			while (var4.hasNext()) {
				MusicSong var5 = (MusicSong)var4.next();
				var3.add(var5);
			}

			class334.field3620.add(new class442((SongTask)null, var3));
		}

	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1172208687"
	)
	static boolean method6237() {
		return (Client.drawPlayerNames & 8) != 0;
	}
}
