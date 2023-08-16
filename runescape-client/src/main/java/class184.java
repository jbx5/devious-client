import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hj")
final class class184 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}
}
