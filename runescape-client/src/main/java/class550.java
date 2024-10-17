import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vi")
public class class550 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 572120553
	)
	static final int field5408;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1578977977
	)
	static final int field5411;
	@ObfuscatedName("ay")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;

	static {
		field5408 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field5411 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lwl;",
		garbageValue = "-612413635"
	)
	public static PrivateChatMode method10014(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5620, PrivateChatMode.field5621, PrivateChatMode.field5619};
		PrivateChatMode[] var2 = var1;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field5618) {
				return var4;
			}
		}

		return null;
	}
}
