import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("aj")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full");
		FontName_plain12 = new FontName("p12_full");
		FontName_bold12 = new FontName("b12_full");
		FontName_verdana11 = new FontName("verdana_11pt_regular");
		FontName_verdana13 = new FontName("verdana_13pt_regular");
		FontName_verdana15 = new FontName("verdana_15pt_regular");
	}

	FontName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[Lty;",
		garbageValue = "93"
	)
	public static FontName[] method9217() {
		return new FontName[]{FontName_bold12, FontName_plain11, FontName_verdana13, FontName_verdana11, FontName_plain12, FontName_verdana15};
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "1418695647"
	)
	public static void method9220(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class330.field3587.clear();
			class330.field3581.clear();
			MusicSong var7;
			if (var5) {
				Iterator var12 = class330.musicSongs.iterator();

				label65:
				while (true) {
					do {
						if (!var12.hasNext()) {
							class330.musicSongs.clear();
							break label65;
						}

						var7 = (MusicSong)var12.next();
					} while(var7 == null);

					var7.midiPcmStream.clear();
					var7.midiPcmStream.method6190();
					var7.midiPcmStream.setPcmStreamVolume(0);
					var7.midiPcmStream.field3627 = 0;
					int var13 = var7.musicTrackGroupId;
					int var9 = var7.musicTrackFileId;
					Iterator var10 = class330.field3588.iterator();

					while (var10.hasNext()) {
						class336 var11 = (class336)var10.next();
						var11.vmethod6382(var13, var9);
					}
				}
			} else {
				for (int var6 = 0; var6 < class330.musicSongs.size(); ++var6) {
					var7 = (MusicSong)class330.musicSongs.get(var6);
					if (var7 == null) {
						class330.musicSongs.remove(var6);
						--var6;
					} else if (var7.field3712) {
						if (var7.midiPcmStream.field3627 > 0) {
							--var7.midiPcmStream.field3627;
						}

						var7.midiPcmStream.clear();
						var7.midiPcmStream.method6190();
						var7.midiPcmStream.setPcmStreamVolume(0);
						class330.musicSongs.remove(var6);
						--var6;
					} else {
						var7.field3712 = true;
					}
				}
			}

			class131.method3071(var0, var5);
			if (!class330.field3587.isEmpty()) {
				class33.method476(var1, var2, var3, var4);
				class330.field3581.add(new AddRequestTask((SongTask)null));
				class330.field3581.add(new class446((SongTask)null, class330.field3583, class330.field3579, class330.field3591));
				ArrayList var15 = new ArrayList();
				var15.add(new class441(new FadeInTask((SongTask)null, 0, true, class330.field3586)));
				if (!class330.musicSongs.isEmpty()) {
					ArrayList var14 = new ArrayList();
					var14.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var15), class330.field3590));
					ArrayList var8 = LoginScreenAnimation.method2564();
					var14.add(new DelayFadeTask(new FadeOutTask(new class439((SongTask)null, var8), 0, false, class330.field3589), class330.musicPlayerStatus));
					class330.field3581.add(new ConcurrentMidiTask((SongTask)null, var14));
				} else {
					class330.field3581.add(new DelayFadeTask((SongTask)null, class330.field3590));
					class330.field3581.add(new ConcurrentMidiTask((SongTask)null, var15));
				}

			}
		}
	}

	@ObfuscatedName("pb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1361976443"
	)
	static String method9219(String var0) {
		PlayerType[] var1 = class136.PlayerType_values();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PlayerType var3 = var1[var2];
			if (var3.modIcon != -1 && var0.startsWith(class385.method7175(var3.modIcon))) {
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length());
				break;
			}
		}

		return var0;
	}
}
