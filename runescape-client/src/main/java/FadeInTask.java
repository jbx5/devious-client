import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	MusicSong field4791;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -482428221
	)
	int field4792;

	@ObfuscatedSignature(
		descriptor = "(Lre;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4791 = null;
		this.field4792 = 0;
		super.field4793 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class329.field3576.size()) {
				this.field4791 = (MusicSong)class329.field3576.get(var2);
			} else if (!var3 && var2 < class329.musicSongs.size()) {
				this.field4791 = (MusicSong)class329.musicSongs.get(var2);
			}

			this.field4792 = var4;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1230726323"
	)
	public boolean vmethod8329() {
		if (this.field4791 != null && this.field4791.midiPcmStream != null) {
			this.field4791.field3696 = true;

			try {
				if (this.field4791.field3688 < (float)this.field4791.musicTrackVolume && this.field4791.midiPcmStream.isReady()) {
					float var1 = this.field4792 == 0 ? (float)this.field4792 : (float)this.field4791.musicTrackVolume / (float)this.field4792;
					MusicSong var10000 = this.field4791;
					var10000.field3688 += 0.0F == var1 ? (float)this.field4791.musicTrackVolume : var1;
					if (this.field4791.field3688 > (float)this.field4791.musicTrackVolume) {
						this.field4791.field3688 = (float)this.field4791.musicTrackVolume;
					}

					this.field4791.midiPcmStream.setPcmStreamVolume((int)this.field4791.field3688);
					return false;
				}
			} catch (Exception var3) {
				this.method8305(var3.getMessage());
				return true;
			}

			this.field4791.field3696 = false;
			return true;
		} else {
			return true;
		}
	}
}
