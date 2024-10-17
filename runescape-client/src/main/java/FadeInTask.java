import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	MusicSong field4880;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -168594113
	)
	int field4879;

	@ObfuscatedSignature(
		descriptor = "(Lra;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4880 = null;
		this.field4879 = 0;
		super.field4881 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class333.field3625.size()) {
				this.field4880 = (MusicSong)class333.field3625.get(var2);
			} else if (!var3 && var2 < class333.musicSongs.size()) {
				this.field4880 = (MusicSong)class333.musicSongs.get(var2);
			}

			this.field4879 = var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "343486624"
	)
	public boolean vmethod8740() {
		if (this.field4880 != null && this.field4880.midiPcmStream != null) {
			this.field4880.field3751 = true;

			try {
				if (this.field4880.field3749 < (float)this.field4880.musicTrackVolume && this.field4880.midiPcmStream.isReady()) {
					float var1 = this.field4879 == 0 ? (float)this.field4879 : (float)this.field4880.musicTrackVolume / (float)this.field4879;
					MusicSong var10000 = this.field4880;
					var10000.field3749 += 0.0F == var1 ? (float)this.field4880.musicTrackVolume : var1;
					if (this.field4880.field3749 > (float)this.field4880.musicTrackVolume) {
						this.field4880.field3749 = (float)this.field4880.musicTrackVolume;
					}

					this.field4880.midiPcmStream.setPcmStreamVolume((int)this.field4880.field3749);
					return false;
				}
			} catch (Exception var3) {
				this.method8725(var3.getMessage());
				return true;
			}

			this.field4880.field3751 = false;
			return true;
		} else {
			return true;
		}
	}
}
