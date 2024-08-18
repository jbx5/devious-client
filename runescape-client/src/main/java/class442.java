import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
public class class442 extends SongTask {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lja;"
	)
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;

	@ObfuscatedSignature(
		descriptor = "(Lrm;)V"
	)
	public class442(SongTask var1) {
		super(var1);
		super.field4796 = "StartSongTask";
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "734274820"
	)
	public boolean vmethod8342() {
		Iterator var1 = class332.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			if (var2 != null && !var2.field3679 && var2.midiPcmStream != null) {
				try {
					var2.midiPcmStream.method6246();
					var2.midiPcmStream.setPcmStreamVolume(0);
					if (var2.field3684 != null) {
						var2.midiPcmStream.setMusicTrack(var2.field3684, var2.musicTrackBoolean);
					}

					var2.field3684 = null;
					var2.field3683 = null;
					var2.musicTrackArchive = null;
					var2.field3679 = true;
				} catch (Exception var4) {
					Script.RunException_sendStackTrace((String)null, var4);
					this.method8325(var4.getMessage());
					return true;
				}
			}
		}

		super.field4792 = true;
		return true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([BI)Lqe;",
		garbageValue = "1228902219"
	)
	static Font method8313(byte[] var0) {
		if (var0 == null) {
			return null;
		} else {
			Font var1 = new Font(var0, class149.SpriteBuffer_xOffsets, class563.SpriteBuffer_yOffsets, class563.SpriteBuffer_spriteWidths, class372.SpriteBuffer_spriteHeights, RouteStrategy.SpriteBuffer_spritePalette, class563.SpriteBuffer_pixels);
			class149.SpriteBuffer_xOffsets = null;
			class563.SpriteBuffer_yOffsets = null;
			class563.SpriteBuffer_spriteWidths = null;
			class372.SpriteBuffer_spriteHeights = null;
			RouteStrategy.SpriteBuffer_spritePalette = null;
			class563.SpriteBuffer_pixels = null;
			return var1;
		}
	}
}
