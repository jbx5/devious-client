import java.io.IOException;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kq")
public class class277 implements Comparator {
	@ObfuscatedName("vk")
	@ObfuscatedSignature(
		descriptor = "Lcc;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;

	class277() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lka;Lka;I)I",
		garbageValue = "580052140"
	)
	int method5506(class269 var1, class269 var2) {
		return var1.method5420() - var2.method5420();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method5506((class269)var1, (class269)var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-41"
	)
	public static byte[] method5512() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}
}
