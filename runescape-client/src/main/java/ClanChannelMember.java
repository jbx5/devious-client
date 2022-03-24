import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("v")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-1591925387)

	@Export("world")
	public int world;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lqy;")

	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;IZI)Z", garbageValue = 
	"1411070013")

	static boolean method2850(CharSequence var0, int var1, boolean var2) {
		if ((var1 >= 2) && (var1 <= 36)) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if ((var8 >= '0') && (var8 <= '9')) {
					var10 = var8 - '0';
				} else if ((var8 >= 'A') && (var8 <= 'Z')) {
					var10 = var8 - '7';
				} else {
					if ((var8 < 'a') || (var8 > 'z')) {
						return false;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					return false;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = (var5 * var1) + var10;
				if ((var9 / var1) != var5) {
					return false;
				}

				var5 = var9;
				var4 = true;
			}

			return var4;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}