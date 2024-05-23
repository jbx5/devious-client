import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	MusicSong field4788;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 122087209
	)
	int field4790;

	@ObfuscatedSignature(
		descriptor = "(Lre;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4788 = null;
		this.field4790 = 0;
		super.field4793 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class329.field3576.size()) {
				this.field4788 = (MusicSong)class329.field3576.get(var2);
			} else if (!var3 && var2 < class329.musicSongs.size()) {
				this.field4788 = (MusicSong)class329.musicSongs.get(var2);
			}

			this.field4790 = var4;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1230726323"
	)
	public boolean vmethod8329() {
		if (this.field4788 != null && this.field4788.midiPcmStream != null) {
			this.field4788.field3696 = true;

			try {
				if (this.field4788.field3688 > 0.0F && this.field4788.midiPcmStream.isReady()) {
					float var1 = this.field4790 == 0 ? (float)this.field4790 : (float)this.field4788.musicTrackVolume / (float)this.field4790;
					MusicSong var10000 = this.field4788;
					var10000.field3688 -= 0.0F == var1 ? (float)this.field4788.musicTrackVolume : var1;
					if (this.field4788.field3688 < 0.0F) {
						this.field4788.field3688 = 0.0F;
					}

					this.field4788.midiPcmStream.setPcmStreamVolume((int)this.field4788.field3688);
					return false;
				}
			} catch (Exception var3) {
				this.method8305(var3.getMessage());
				return true;
			}

			this.field4788.field3696 = false;
			return true;
		} else {
			return true;
		}
	}
}
