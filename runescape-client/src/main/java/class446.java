import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rk")
public class class446 extends SongTask {
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	static SpritePixels[] field4821;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field4818;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field4819;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field4820;

	@ObfuscatedSignature(
		descriptor = "(Lro;Lok;Lok;Lok;)V"
	)
	public class446(SongTask var1, AbstractArchive var2, AbstractArchive var3, AbstractArchive var4) {
		super(var1);
		this.field4818 = var2;
		this.field4819 = var3;
		this.field4820 = var4;
		super.field4814 = "LoadSongTask";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-4307"
	)
	public boolean vmethod8276() {
		int var1 = 0;
		Iterator var2 = class330.musicSongs.iterator();

		while (true) {
			while (var2.hasNext()) {
				MusicSong var3 = (MusicSong)var2.next();
				if (var3 != null && var3.midiPcmStream.field3627 > 1 && var3.midiPcmStream.method6194()) {
					this.method8253("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var3 != null && !var3.field3709) {
					try {
						if (var3.musicTrackArchive != null && var3.musicTrackGroupId != -1 && var3.musicTrackFileId != -1) {
							if (var3.field3703 == null) {
								var3.field3703 = MusicTrack.readTrack(var3.musicTrackArchive, var3.musicTrackGroupId, var3.musicTrackFileId);
								if (var3.field3703 == null) {
									continue;
								}
							}

							if (var3.field3714 == null) {
								var3.field3714 = new SoundCache(this.field4820, this.field4819);
							}

							if (var3.midiPcmStream.method6188(var3.field3703, this.field4818, var3.field3714)) {
								++var1;
								var3.field3709 = true;
								var3.midiPcmStream.method6189();
							}
						} else {
							++var1;
						}
					} catch (Exception var5) {
						FriendsChat.RunException_sendStackTrace((String)null, var5);
						this.method8253(var5.getMessage());
						return true;
					}
				} else {
					++var1;
				}
			}

			if (var1 == class330.musicSongs.size()) {
				return true;
			}

			return false;
		}
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "(B)Ltr;",
		garbageValue = "27"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return class28.platformInfo;
	}
}
