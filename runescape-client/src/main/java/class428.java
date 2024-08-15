import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class428 extends RuntimeException {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;

	public class428(String var1, Object[] var2) {
		super(String.format(var1, var2));
	}
}
