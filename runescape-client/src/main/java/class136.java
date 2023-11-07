import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("fb")
final class class136 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}
}
