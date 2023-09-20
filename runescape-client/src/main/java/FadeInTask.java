import java.io.IOException;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
@Implements("FadeInTask")
public class FadeInTask extends SongTask {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	MusicSong field4571;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 941678669
	)
	int field4570;

	@ObfuscatedSignature(
		descriptor = "(Lqm;IZI)V"
	)
	public FadeInTask(SongTask var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field4571 = null;
		this.field4570 = 0;
		super.field4572 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class319.field3428.size()) {
				this.field4571 = (MusicSong)class319.field3428.get(var2);
			} else if (!var3 && var2 < class319.musicSongs.size()) {
				this.field4571 = (MusicSong)class319.musicSongs.get(var2);
			}

			this.field4570 = var4;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-90"
	)
	public boolean vmethod7780() {
		if (this.field4571 != null && this.field4571.midiPcmStream != null) {
			this.field4571.field3546 = true;

			try {
				if (this.field4571.field3542 < (float)this.field4571.musicTrackVolume && this.field4571.midiPcmStream.isReady()) {
					float var1 = this.field4570 == 0 ? (float)this.field4570 : (float)this.field4571.musicTrackVolume / (float)this.field4570;
					MusicSong var10000 = this.field4571;
					var10000.field3542 += 0.0F == var1 ? (float)this.field4571.musicTrackVolume : var1;
					if (this.field4571.field3542 > (float)this.field4571.musicTrackVolume) {
						this.field4571.field3542 = (float)this.field4571.musicTrackVolume;
					}

					this.field4571.midiPcmStream.setPcmStreamVolume((int)this.field4571.field3542);
					return false;
				}
			} catch (Exception var3) {
				this.method7773(var3.getMessage());
				return true;
			}

			this.field4571.field3546 = false;
			return true;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ldy;",
		garbageValue = "1147627487"
	)
	static ClientPreferences method7759() {
		AccessFile var0 = null;
		ClientPreferences var1 = new ClientPreferences();

		try {
			var0 = class17.getPreferencesFile("", UrlRequester.field1436.name, false);
			byte[] var2 = new byte[(int)var0.length()];

			int var4;
			for (int var3 = 0; var3 < var2.length; var3 += var4) {
				var4 = var0.read(var2, var3, var2.length - var3);
				if (var4 == -1) {
					throw new IOException();
				}
			}

			var1 = new ClientPreferences(new Buffer(var2));
		} catch (Exception var6) {
		}

		try {
			if (var0 != null) {
				var0.close();
			}
		} catch (Exception var5) {
		}

		return var1;
	}
}
