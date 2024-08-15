import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	MusicSong field4788;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 651325117
	)
	int field4787;

	@ObfuscatedSignature(
		descriptor = "(Lrm;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4788 = null;
		this.field4787 = 0;
		super.field4796 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class332.field3563.size()) {
				this.field4788 = (MusicSong)class332.field3563.get(var2);
			} else if (!var3 && var2 < class332.musicSongs.size()) {
				this.field4788 = (MusicSong)class332.musicSongs.get(var2);
			}

			this.field4787 = var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "734274820"
	)
	public boolean vmethod8342() {
		if (this.field4788 != null && this.field4788.midiPcmStream != null) {
			this.field4788.field3680 = true;

			try {
				if (this.field4788.field3676 < (float)this.field4788.musicTrackVolume && this.field4788.midiPcmStream.isReady()) {
					float var1 = this.field4787 == 0 ? (float)this.field4787 : (float)this.field4788.musicTrackVolume / (float)this.field4787;
					MusicSong var10000 = this.field4788;
					var10000.field3676 += 0.0F == var1 ? (float)this.field4788.musicTrackVolume : var1;
					if (this.field4788.field3676 > (float)this.field4788.musicTrackVolume) {
						this.field4788.field3676 = (float)this.field4788.musicTrackVolume;
					}

					this.field4788.midiPcmStream.setPcmStreamVolume((int)this.field4788.field3676);
					return false;
				}
			} catch (Exception var3) {
				this.method8325(var3.getMessage());
				return true;
			}

			this.field4788.field3680 = false;
			return true;
		} else {
			return true;
		}
	}
}
