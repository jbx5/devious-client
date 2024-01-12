import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("na")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 985416757
	)
	public static int field3856;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-623604699"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1406915885"
	)
	@Export("set")
	abstract void set(byte[] var1);
}
