import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("jd")
public class class271 {
	@ObfuscatedName("ta")
	@ObfuscatedGetter(intValue = -293795815)
	static int field3186;

	@ObfuscatedName("ud")
	@Export("foundItemIds")
	static short[] foundItemIds;

	@ObfuscatedName("s")
	static int[] field3185;

	@ObfuscatedName("ef")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("archive4")
	static Archive archive4;

	static {
		new Object();
		field3185 = new int[33];
		field3185[0] = 0;
		int var0 = 2;
		for (int var1 = 1; var1 < 33; ++var1) {
			field3185[var1] = var0 - 1;
			var0 += var0;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lls;Lls;IZI)Ldk;", garbageValue = "269488385")
	public static class122 method5169(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.getFile(var2 >> 16 & '￿', var2 & '￿');
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0);
			}
			if (var7 == null) {
				var4 = false;
			}
			if (!var4) {
				return null;
			} else {
				try {
					return new class122(var0, var1, var2, var3);
				} catch (Exception var9) {
					return null;
				}
			}
		}
	}

	@ObfuscatedName("jh")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "112")
	static final void method5170() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsFriend();
		}
		Archive.method5750();
		if (class19.friendsChat != null) {
			class19.friendsChat.clearFriends();
		}
	}
}