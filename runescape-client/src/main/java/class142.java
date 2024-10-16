import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
final class class142 implements ThreadFactory {
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field1656;
	@ObfuscatedName("ok")
	@ObfuscatedGetter(
		intValue = -833448613
	)
	static int field1655;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}
}
