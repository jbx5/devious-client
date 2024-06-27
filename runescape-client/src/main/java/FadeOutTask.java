import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	MusicSong field4808;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 900520389
	)
	int field4806;

	@ObfuscatedSignature(
		descriptor = "(Lro;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4808 = null;
		this.field4806 = 0;
		super.field4814 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class330.field3587.size()) {
				this.field4808 = (MusicSong)class330.field3587.get(var2);
			} else if (!var3 && var2 < class330.musicSongs.size()) {
				this.field4808 = (MusicSong)class330.musicSongs.get(var2);
			}

			this.field4806 = var4;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		if (this.field4808 != null && this.field4808.midiPcmStream != null) {
			this.field4808.field3715 = true;

			try {
				if (this.field4808.field3704 > 0.0F && this.field4808.midiPcmStream.isReady()) {
					float var1 = this.field4806 == 0 ? (float)this.field4806 : (float)this.field4808.musicTrackVolume / (float)this.field4806;
					MusicSong var10000 = this.field4808;
					var10000.field3704 -= var1 == 0.0F ? (float)this.field4808.musicTrackVolume : var1;
					if (this.field4808.field3704 < 0.0F) {
						this.field4808.field3704 = 0.0F;
					}

					this.field4808.midiPcmStream.setPcmStreamVolume((int)this.field4808.field3704);
					return false;
				}
			} catch (Exception var3) {
				this.method8253(var3.getMessage());
				return true;
			}

			this.field4808.field3715 = false;
			return true;
		} else {
			return true;
		}
	}
}
