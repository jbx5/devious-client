import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2134030911"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-379413774"
	)
	@Export("set")
	public abstract void set(byte[] var1);
}
