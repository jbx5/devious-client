import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rj")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	MusicSong field4840;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1879131809
	)
	int field4839;

	@ObfuscatedSignature(
		descriptor = "(Lri;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4840 = null;
		this.field4839 = 0;
		super.field4843 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class334.field3621.size()) {
				this.field4840 = (MusicSong)class334.field3621.get(var2);
			} else if (!var3 && var2 < class334.musicSongs.size()) {
				this.field4840 = (MusicSong)class334.musicSongs.get(var2);
			}

			this.field4839 = var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1411718299"
	)
	public boolean vmethod8618() {
		if (this.field4840 != null && this.field4840.midiPcmStream != null) {
			this.field4840.field3734 = true;

			try {
				if (this.field4840.field3730 < (float)this.field4840.musicTrackVolume && this.field4840.midiPcmStream.isReady()) {
					float var1 = this.field4839 == 0 ? (float)this.field4839 : (float)this.field4840.musicTrackVolume / (float)this.field4839;
					MusicSong var10000 = this.field4840;
					var10000.field3730 += var1 == 0.0F ? (float)this.field4840.musicTrackVolume : var1;
					if (this.field4840.field3730 > (float)this.field4840.musicTrackVolume) {
						this.field4840.field3730 = (float)this.field4840.musicTrackVolume;
					}

					this.field4840.midiPcmStream.setPcmStreamVolume((int)this.field4840.field3730);
					return false;
				}
			} catch (Exception var3) {
				this.method8609(var3.getMessage());
				return true;
			}

			this.field4840.field3734 = false;
			return true;
		} else {
			return true;
		}
	}
}
