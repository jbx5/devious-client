import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	MusicSong field4567;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1941779921
	)
	int field4566;

	@ObfuscatedSignature(
		descriptor = "(Lqm;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4567 = null;
		this.field4566 = 0;
		super.field4572 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class319.field3428.size()) {
				this.field4567 = (MusicSong)class319.field3428.get(var2);
			} else if (!var3 && var2 < class319.musicSongs.size()) {
				this.field4567 = (MusicSong)class319.musicSongs.get(var2);
			}

			this.field4566 = var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		if (this.field4567 != null && this.field4567.midiPcmStream != null) {
			this.field4567.field3546 = true;

			try {
				if (this.field4567.field3542 > 0.0F && this.field4567.midiPcmStream.isReady()) {
					float var1 = this.field4566 == 0 ? (float)this.field4566 : (float)this.field4567.musicTrackVolume / (float)this.field4566;
					MusicSong var10000 = this.field4567;
					var10000.field3542 -= var1 == 0.0F ? (float)this.field4567.musicTrackVolume : var1;
					if (this.field4567.field3542 < 0.0F) {
						this.field4567.field3542 = 0.0F;
					}

					this.field4567.midiPcmStream.setPcmStreamVolume((int)this.field4567.field3542);
					return false;
				}
			} catch (Exception var3) {
				this.method7773(var3.getMessage());
				return true;
			}

			this.field4567.field3546 = false;
			return true;
		} else {
			return true;
		}
	}
}
