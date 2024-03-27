import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vi")
public class class550 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lvc;",
		garbageValue = "242436982"
	)
	public static PrivateChatMode method9855(int var0) {
		PrivateChatMode[] var1 = class133.method3070();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field5374) {
				return var3;
			}
		}

		return null;
	}
}
