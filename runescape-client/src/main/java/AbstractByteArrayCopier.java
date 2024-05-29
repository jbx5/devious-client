import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("af")
	static byte[][][] field3975;
	@ObfuscatedName("da")
	static boolean field3976;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "20"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-957801632"
	)
	@Export("set")
	public abstract void set(byte[] var1);
}
