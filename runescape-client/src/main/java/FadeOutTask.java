import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qa")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("ae")
	static int[][] field4590;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lma;"
	)
	MusicSong field4588;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1848218251
	)
	int field4589;

	@ObfuscatedSignature(
		descriptor = "(Lqd;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4588 = null;
		this.field4589 = 0;
		super.field4597 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class319.field3461.size()) {
				this.field4588 = (MusicSong)class319.field3461.get(var2);
			} else if (!var3 && var2 < class319.musicSongs.size()) {
				this.field4588 = (MusicSong)class319.musicSongs.get(var2);
			}

			this.field4589 = var4;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2012801823"
	)
	public boolean vmethod7975() {
		if (this.field4588 != null && this.field4588.midiPcmStream != null) {
			this.field4588.field3580 = true;

			try {
				if (this.field4588.field3576 > 0.0F && this.field4588.midiPcmStream.isReady()) {
					float var1 = this.field4589 == 0 ? (float)this.field4589 : (float)this.field4588.musicTrackVolume / (float)this.field4589;
					MusicSong var10000 = this.field4588;
					var10000.field3576 -= 0.0F == var1 ? (float)this.field4588.musicTrackVolume : var1;
					if (this.field4588.field3576 < 0.0F) {
						this.field4588.field3576 = 0.0F;
					}

					this.field4588.midiPcmStream.setPcmStreamVolume((int)this.field4588.field3576);
					return false;
				}
			} catch (Exception var3) {
				this.method7954(var3.getMessage());
				return true;
			}

			this.field4588.field3580 = false;
			return true;
		} else {
			return true;
		}
	}
}
