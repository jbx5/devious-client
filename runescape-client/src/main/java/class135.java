import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class135 implements class125 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;IZB)Lko;",
		garbageValue = "1"
	)
	public static Frames method3151(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "112"
	)
	static void method3152(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				WorldMapRenderer.method4769(0, 0);
			} else if (var5 != -1) {
				boolean var6;
				if (class316.field3424.isEmpty()) {
					var6 = false;
				} else {
					MusicSong var7 = (MusicSong)class316.field3424.get(0);
					var6 = var7 != null && var5 == var7.musicTrackGroupId;
				}

				if (!var6 && WorldMapIcon_1.clientPreferences.getMusicVolume() != 0) {
					ArrayList var9 = new ArrayList();

					for (int var8 = 0; var8 < var0.size(); ++var8) {
						var9.add(new MusicSong(class514.archive6, (Integer)var0.get(var8), 0, WorldMapIcon_1.clientPreferences.getMusicVolume(), false));
					}

					if (Client.playingJingle) {
						class316.field3424.clear();
						class316.field3424.addAll(var9);
						EnumComposition.method3678(var1, var2, var3, var4);
					} else {
						PendingSpawn.method2459(var9, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}
}
