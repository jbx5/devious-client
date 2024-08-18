import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("un")
public class class541 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -398432659
	)
	static final int field5324;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1356044823
	)
	static final int field5326;

	static {
		field5324 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field5326 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lvp;",
		garbageValue = "-68"
	)
	public static PrivateChatMode method9525(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5539, PrivateChatMode.field5536, PrivateChatMode.field5537};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field5540) {
				return var4;
			}
		}

		return null;
	}
}
