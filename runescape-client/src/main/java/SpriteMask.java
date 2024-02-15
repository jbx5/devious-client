import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mc")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "Lrc;"
	)
	static Bounds field3613;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2078688393
	)
	@Export("width")
	public final int width;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -527389665
	)
	@Export("height")
	public final int height;
	@ObfuscatedName("al")
	@Export("xWidths")
	public final int[] xWidths;
	@ObfuscatedName("ai")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "18"
	)
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1762638973"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class30.clientPreferences.getMusicVolume()) {
			if (class30.clientPreferences.getMusicVolume() == 0 && VarbitComposition.method3831()) {
				Interpreter.method2056(Renderable.archive6, var0);
				Client.playingJingle = false;
			} else if (var0 == 0) {
				class169.method3521(0, 0);
				Client.playingJingle = false;
			} else if (!class321.musicSongs.isEmpty()) {
				Iterator var1 = class321.musicSongs.iterator();

				while (var1.hasNext()) {
					MusicSong var2 = (MusicSong)var1.next();
					if (var2 != null) {
						var2.musicTrackVolume = var0;
					}
				}

				MusicSong var3 = (MusicSong)class321.musicSongs.get(0);
				if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3597) {
					var3.midiPcmStream.setPcmStreamVolume(var0);
					var3.field3602 = (float)var0;
				}
			}

			class30.clientPreferences.updateMusicVolume(var0);
		}

	}
}
