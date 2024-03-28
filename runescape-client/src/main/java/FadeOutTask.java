import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	MusicSong field4644;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 314155859
	)
	int field4642;

	@ObfuscatedSignature(
		descriptor = "(Lqc;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4644 = null;
		this.field4642 = 0;
		super.field4651 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class321.field3500.size()) {
				this.field4644 = (MusicSong)class321.field3500.get(var2);
			} else if (!var3 && var2 < class321.musicSongs.size()) {
				this.field4644 = (MusicSong)class321.musicSongs.get(var2);
			}

			this.field4642 = var4;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		if (this.field4644 != null && this.field4644.midiPcmStream != null) {
			this.field4644.field3604 = true;

			try {
				if (this.field4644.field3608 > 0.0F && this.field4644.midiPcmStream.isReady()) {
					float var1 = this.field4642 == 0 ? (float)this.field4642 : (float)this.field4644.musicTrackVolume / (float)this.field4642;
					MusicSong var10000 = this.field4644;
					var10000.field3608 -= 0.0F == var1 ? (float)this.field4644.musicTrackVolume : var1;
					if (this.field4644.field3608 < 0.0F) {
						this.field4644.field3608 = 0.0F;
					}

					this.field4644.midiPcmStream.setPcmStreamVolume((int)this.field4644.field3608);
					return false;
				}
			} catch (Exception var3) {
				this.method7844(var3.getMessage());
				return true;
			}

			this.field4644.field3604 = false;
			return true;
		} else {
			return true;
		}
	}
}
