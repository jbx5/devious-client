import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qt")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmt;"
	)
	MusicSong field4550;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -204248099
	)
	int field4549;

	@ObfuscatedSignature(
		descriptor = "(Lql;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4550 = null;
		this.field4549 = 0;
		super.field4552 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class316.field3416.size()) {
				this.field4550 = (MusicSong)class316.field3416.get(var2);
			} else if (!var3 && var2 < class316.musicSongs.size()) {
				this.field4550 = (MusicSong)class316.musicSongs.get(var2);
			}

			this.field4549 = var4;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-799935345"
	)
	public boolean vmethod7858() {
		if (this.field4550 != null && this.field4550.midiPcmStream != null) {
			this.field4550.field3530 = true;

			try {
				if (this.field4550.field3528 < (float)this.field4550.musicTrackVolume && this.field4550.midiPcmStream.isReady()) {
					float var1 = this.field4549 == 0 ? (float)this.field4549 : (float)this.field4550.musicTrackVolume / (float)this.field4549;
					MusicSong var10000 = this.field4550;
					var10000.field3528 += var1 == 0.0F ? (float)this.field4550.musicTrackVolume : var1;
					if (this.field4550.field3528 > (float)this.field4550.musicTrackVolume) {
						this.field4550.field3528 = (float)this.field4550.musicTrackVolume;
					}

					this.field4550.midiPcmStream.setPcmStreamVolume((int)this.field4550.field3528);
					return false;
				}
			} catch (Exception var3) {
				this.method7840(var3.getMessage());
				return true;
			}

			this.field4550.field3530 = false;
			return true;
		} else {
			return true;
		}
	}
}
