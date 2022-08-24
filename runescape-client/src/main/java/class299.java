import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("kr")
public class class299 {
	@ObfuscatedName("ex")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("archive8")
	static Archive archive8;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IB)Lqi;", garbageValue = "7")
	public static PrivateChatMode method5660(int var0) {
		PrivateChatMode[] var1 = new PrivateChatMode[]{ PrivateChatMode.field4825, PrivateChatMode.field4823, PrivateChatMode.field4826 };
		PrivateChatMode[] var2 = var1;
		for (int var3 = 0; var3 < var2.length; ++var3) {
			PrivateChatMode var4 = var2[var3];
			if (var0 == var4.field4824) {
				return var4;
			}
		}
		return null;
	}
}