import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rc")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	MusicSong field4837;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1545354245
	)
	int field4836;

	@ObfuscatedSignature(
		descriptor = "(Lri;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4837 = null;
		this.field4836 = 0;
		super.field4843 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class334.field3621.size()) {
				this.field4837 = (MusicSong)class334.field3621.get(var2);
			} else if (!var3 && var2 < class334.musicSongs.size()) {
				this.field4837 = (MusicSong)class334.musicSongs.get(var2);
			}

			this.field4836 = var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1411718299"
	)
	public boolean vmethod8618() {
		if (this.field4837 != null && this.field4837.midiPcmStream != null) {
			this.field4837.field3734 = true;

			try {
				if (this.field4837.field3730 > 0.0F && this.field4837.midiPcmStream.isReady()) {
					float var1 = this.field4836 == 0 ? (float)this.field4836 : (float)this.field4837.musicTrackVolume / (float)this.field4836;
					MusicSong var10000 = this.field4837;
					var10000.field3730 -= 0.0F == var1 ? (float)this.field4837.musicTrackVolume : var1;
					if (this.field4837.field3730 < 0.0F) {
						this.field4837.field3730 = 0.0F;
					}

					this.field4837.midiPcmStream.setPcmStreamVolume((int)this.field4837.field3730);
					return false;
				}
			} catch (Exception var3) {
				this.method8609(var3.getMessage());
				return true;
			}

			this.field4837.field3734 = false;
			return true;
		} else {
			return true;
		}
	}
}
