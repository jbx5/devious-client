import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nj")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1559901275
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -10786693
	)
	@Export("x")
	public int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1268210065
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lnj;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "81"
	)
	@Export("packed")
	public int packed() {
		return ApproximateRouteStrategy.method1197(this.plane, this.x, this.y);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lnj;B)Z",
		garbageValue = "-91"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-99434783"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
		}
	}

	public int hashCode() {
		return this.packed();
	}

	public String toString() {
		return this.toString(",");
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-535769687"
	)
	static void method6523(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = ModeWhere.field4623.field1349[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.remove();
					break;
				}
			}

			if (var5.last() == null) {
				ModeWhere.field4623.field1349[var0][var1][var2] = null;
			}

			class349.method6551(var0, var1, var2);
		}

	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1104055563"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class459.clientPreferences.getMusicVolume()) {
			label61: {
				if (class459.clientPreferences.getMusicVolume() == 0) {
					boolean var1 = !class329.field3579.isEmpty();
					if (var1) {
						WorldMapLabel.method5938(GameObject.archive6, var0);
						Client.playingJingle = false;
						break label61;
					}
				}

				if (var0 == 0) {
					Skills.method7123(0, 0);
					Client.playingJingle = false;
				} else if (!class329.musicSongs.isEmpty()) {
					Iterator var3 = class329.musicSongs.iterator();

					while (var3.hasNext()) {
						MusicSong var2 = (MusicSong)var3.next();
						if (var2 != null) {
							var2.musicTrackVolume = var0;
						}
					}

					MusicSong var4 = (MusicSong)class329.musicSongs.get(0);
					if (var4 != null && var4.midiPcmStream != null && var4.midiPcmStream.isReady() && !var4.field3696) {
						var4.midiPcmStream.setPcmStreamVolume(var0);
						var4.field3688 = (float)var0;
					}
				}
			}

			class459.clientPreferences.updateMusicVolume(var0);
		}

	}
}
