import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qm")
public class class426 extends RuntimeException {
	public class426(String var1, Object[] var2) {
		super(String.format(var1, var2));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;III)[Lvl;",
		garbageValue = "472650430"
	)
	public static IndexedSprite[] method7950(AbstractArchive var0, int var1, int var2) {
		return !class108.method2769(var0, var1, var2) ? null : class92.method2357();
	}

	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2083628143"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
