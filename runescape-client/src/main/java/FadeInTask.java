import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	MusicSong field4810;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1023172221
	)
	int field4809;

	@ObfuscatedSignature(
		descriptor = "(Lro;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4810 = null;
		this.field4809 = 0;
		super.field4814 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class330.field3587.size()) {
				this.field4810 = (MusicSong)class330.field3587.get(var2);
			} else if (!var3 && var2 < class330.musicSongs.size()) {
				this.field4810 = (MusicSong)class330.musicSongs.get(var2);
			}

			this.field4809 = var4;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		if (this.field4810 != null && this.field4810.midiPcmStream != null) {
			this.field4810.field3715 = true;

			try {
				if (this.field4810.field3704 < (float)this.field4810.musicTrackVolume && this.field4810.midiPcmStream.isReady()) {
					float var1 = this.field4809 == 0 ? (float)this.field4809 : (float)this.field4810.musicTrackVolume / (float)this.field4809;
					MusicSong var10000 = this.field4810;
					var10000.field3704 += 0.0F == var1 ? (float)this.field4810.musicTrackVolume : var1;
					if (this.field4810.field3704 > (float)this.field4810.musicTrackVolume) {
						this.field4810.field3704 = (float)this.field4810.musicTrackVolume;
					}

					this.field4810.midiPcmStream.setPcmStreamVolume((int)this.field4810.field3704);
					return false;
				}
			} catch (Exception var3) {
				this.method8253(var3.getMessage());
				return true;
			}

			this.field4810.field3715 = false;
			return true;
		} else {
			return true;
		}
	}
}
