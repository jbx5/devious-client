import java.math.BigInteger;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class75 {
	@ObfuscatedName("aq")
	static final BigInteger field934;
	@ObfuscatedName("aw")
	static final BigInteger field935;

	static {
		field934 = new BigInteger("10001", 16);
		field935 = new BigInteger("b24a3d5e440eca7e467297f5a5e00a73a0c4750320d889a908dcc343591afb1ab975a16df1793c49e66afc0e94fd73e24d95f54db980e1be37b4043a6c767468275b2833763bda1dfc52e06aafc845ac84391df571d0d79e239393079e8d8c37019be639457e2a32158b876f8c7256de733e38a909bbf1104d830746fbc597e3", 16);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lte;I)I",
		garbageValue = "1678088189"
	)
	static final int method2120(LoginType var0) {
		if (var0 == null) {
			return 12;
		} else {
			switch(var0.field5092) {
			case 5:
				return 20;
			default:
				return 12;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Luq;[II)[Ljava/lang/Object;",
		garbageValue = "-1281861605"
	)
	static Object[] method2123(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart();
		Object[] var3 = new Object[var1.length * var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			for (int var5 = 0; var5 < var1.length; ++var5) {
				int var6 = var1.length * var4 + var5;
				class521 var7 = class297.method5966(var1[var5]);
				var3[var6] = var7.method9323(var0);
			}
		}

		return var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1228894690"
	)
	public static void method2121(int var0, int var1, int var2, int var3) {
		if (class321.musicSongs.size() > 1 && class321.musicSongs.get(0) != null && ((MusicSong)class321.musicSongs.get(0)).midiPcmStream.isReady() && class321.musicSongs.get(1) != null && ((MusicSong)class321.musicSongs.get(1)).midiPcmStream.isReady()) {
			ScriptFrame.method1158(var0, var1, var2, var3);
			class321.field3481.add(new SwapSongTask((SongTask)null));
			ArrayList var4 = new ArrayList();
			var4.add(new DelayFadeTask(new FadeInTask((SongTask)null, 1, false, class321.field3486), class321.field3485));
			var4.add(new DelayFadeTask(new FadeOutTask((SongTask)null, 0, false, class321.field3476), class321.musicPlayerStatus));
			class321.field3481.add(new ConcurrentMidiTask((SongTask)null, var4));
			if (class321.field3484.get(0) != null && class321.field3484.get(1) != null) {
				MusicSong var5 = (MusicSong)class321.field3484.get(0);
				class321.field3484.set(0, class321.musicSongs.get(1));
				class321.field3484.set(1, var5);
			}
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	@Export("SpriteBuffer_reset")
	static void SpriteBuffer_reset() {
		JagexCache.method4224(24);
		SecureUrlRequester.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}
}
