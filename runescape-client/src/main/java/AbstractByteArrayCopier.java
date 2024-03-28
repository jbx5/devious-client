import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ni")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-126"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-67"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1627569807"
	)
	static String method6833(int var0) {
		return "<img=" + var0 + ">";
	}
}
