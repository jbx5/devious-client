import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmu;"
	)
	MusicSong field4517;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1221336075
	)
	int field4516;

	@ObfuscatedSignature(
		descriptor = "(Lpm;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4517 = null;
		this.field4516 = 0;
		super.field4523 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class305.field3411.size()) {
				this.field4517 = (MusicSong)class305.field3411.get(var2);
			} else if (!var3 && var2 < class305.musicSongs.size()) {
				this.field4517 = (MusicSong)class305.musicSongs.get(var2);
			}

			this.field4516 = var4;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1604030758"
	)
	public boolean vmethod7621() {
		if (this.field4517 != null && this.field4517.midiPcmStream != null) {
			this.field4517.field3524 = true;

			try {
				if (this.field4517.field3510 > 0.0F && this.field4517.midiPcmStream.isReady()) {
					float var1 = this.field4516 == 0 ? (float)this.field4516 : (float)this.field4517.musicTrackVolume / (float)this.field4516;
					MusicSong var10000 = this.field4517;
					var10000.field3510 -= var1 == 0.0F ? (float)this.field4517.musicTrackVolume : var1;
					if (this.field4517.field3510 < 0.0F) {
						this.field4517.field3510 = 0.0F;
					}

					this.field4517.midiPcmStream.setPcmStreamVolume((int)this.field4517.field3510);
					return false;
				}
			} catch (Exception var3) {
				this.method7601(var3.getMessage());
				return true;
			}

			this.field4517.field3524 = false;
			return true;
		} else {
			return true;
		}
	}
}
