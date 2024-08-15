import java.util.HashMap;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("pe")
public class class402 {
	static {
		new HashMap();
	}

	@ObfuscatedName("ab")
	public static boolean method7489(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1;
			var2 = !var3;
		}

		return var2;
	}
}
