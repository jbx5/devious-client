import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rg")
@Implements("FadeOutTask")
public class FadeOutTask extends SongTask {
	@ObfuscatedName("ap")
	@Export("osName")
	static String osName;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1528992943
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	MusicSong field4783;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 356439387
	)
	int field4785;

	@ObfuscatedSignature(
		descriptor = "(Lrm;IZI)V"
	)
	public FadeOutTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4783 = null;
		this.field4785 = 0;
		super.field4796 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class332.field3563.size()) {
				this.field4783 = (MusicSong)class332.field3563.get(var2);
			} else if (!var3 && var2 < class332.musicSongs.size()) {
				this.field4783 = (MusicSong)class332.musicSongs.get(var2);
			}

			this.field4785 = var4;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "734274820"
	)
	public boolean vmethod8342() {
		if (this.field4783 != null && this.field4783.midiPcmStream != null) {
			this.field4783.field3680 = true;

			try {
				if (this.field4783.field3676 > 0.0F && this.field4783.midiPcmStream.isReady()) {
					float var1 = this.field4785 == 0 ? (float)this.field4785 : (float)this.field4783.musicTrackVolume / (float)this.field4785;
					MusicSong var10000 = this.field4783;
					var10000.field3676 -= var1 == 0.0F ? (float)this.field4783.musicTrackVolume : var1;
					if (this.field4783.field3676 < 0.0F) {
						this.field4783.field3676 = 0.0F;
					}

					this.field4783.midiPcmStream.setPcmStreamVolume((int)this.field4783.field3676);
					return false;
				}
			} catch (Exception var3) {
				this.method8325(var3.getMessage());
				return true;
			}

			this.field4783.field3680 = false;
			return true;
		} else {
			return true;
		}
	}
}
