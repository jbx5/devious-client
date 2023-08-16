import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mu")
@Implements("MusicSong")
public class MusicSong {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("musicTrackArchive")
	public AbstractArchive musicTrackArchive;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1168215327
	)
	@Export("musicTrackGroupId")
	public int musicTrackGroupId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -109873503
	)
	@Export("musicTrackFileId")
	public int musicTrackFileId;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 982072253
	)
	@Export("musicTrackVolume")
	public int musicTrackVolume;
	@ObfuscatedName("ac")
	public float field3510;
	@ObfuscatedName("ai")
	@Export("musicTrackBoolean")
	public boolean musicTrackBoolean;
	@ObfuscatedName("az")
	public boolean field3516;
	@ObfuscatedName("ap")
	public boolean field3518;
	@ObfuscatedName("aa")
	public boolean field3524;
	@ObfuscatedName("af")
	public boolean field3519;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Llf;"
	)
	@Export("midiPcmStream")
	public MidiPcmStream midiPcmStream;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	public SoundCache field3521;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public MusicTrack field3522;

	@ObfuscatedSignature(
		descriptor = "(Lnu;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public MusicSong(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3510 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3524 = false;
		this.field3519 = false;
		this.musicTrackGroupId = var1.getGroupId(var2);
		this.musicTrackFileId = var1.getFileId(this.musicTrackGroupId, var3);
		this.method6016(var1, this.musicTrackGroupId, this.musicTrackFileId, var4, var5);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnu;IIIZ)V"
	)
	public MusicSong(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackGroupId = -1;
		this.musicTrackFileId = -1;
		this.musicTrackVolume = 0;
		this.field3510 = 0.0F;
		this.musicTrackBoolean = false;
		this.field3524 = false;
		this.field3519 = false;
		this.method6016(var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;IIIZB)V",
		garbageValue = "28"
	)
	void method6016(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.musicTrackArchive = var1;
		this.musicTrackGroupId = var2;
		this.musicTrackFileId = var3;
		this.musicTrackVolume = var4;
		this.musicTrackBoolean = var5;
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-79"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field765.method4092();
			}

			if (Client.gameState == 0) {
				class219.client.method658();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class316.method6012(0);
				Client.field541 = 0;
				Client.field592 = 0;
				Client.timer.method7685(var0);
				if (var0 != 20) {
					PendingSpawn.method2368(false);
				}
			}

			if (var0 != 20 && var0 != 40 && AbstractSocket.field4675 != null) {
				AbstractSocket.field4675.close();
				AbstractSocket.field4675 = null;
			}

			if (Client.gameState == 25) {
				Client.field600 = 0;
				Client.field596 = 0;
				Client.field630 = 1;
				Client.field598 = 0;
				Client.field599 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var3 = Client.gameState == 11 ? 4 : 0;
					Timer.method7688(class141.archive10, PcmPlayer.archive8, false, var3);
				} else if (var0 == 11) {
					Timer.method7688(class141.archive10, PcmPlayer.archive8, false, 4);
				} else if (var0 == 50) {
					class318.setLoginResponseString("", "Updating date of birth...", "");
					Timer.method7688(class141.archive10, PcmPlayer.archive8, false, 7);
				} else if (class403.clearLoginScreen) {
					Login.titleboxSprite = null;
					class219.titlebuttonSprite = null;
					Login.runesSprite = null;
					Login.leftTitleSprite = null;
					Bounds.rightTitleSprite = null;
					SoundSystem.logoSprite = null;
					class13.title_muteSprite = null;
					Login.options_buttons_0Sprite = null;
					UserComparator6.options_buttons_2Sprite = null;
					class74.worldSelectBackSprites = null;
					SoundCache.worldSelectFlagSprites = null;
					MusicPatchPcmStream.worldSelectArrows = null;
					SecureRandomCallable.worldSelectStars = null;
					VarcInt.field1966 = null;
					class139.loginScreenRunesAnimation.method2415();
					Script.method2180(0, 100);
					CollisionMap.method4177().method6793(true);
					class403.clearLoginScreen = false;
				}
			} else {
				boolean var1 = class449.clientPreferences.method2468() >= Client.field531;
				int var2 = var1 ? 0 : 12;
				Timer.method7688(class141.archive10, PcmPlayer.archive8, true, var2);
			}

			Client.gameState = var0;
		}
	}
}
