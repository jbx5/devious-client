import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class205 {
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"9")

	public static void method4256() {
		if (KeyHandler.KeyHandler_instance != null) {
			synchronized(KeyHandler.KeyHandler_instance) {
				KeyHandler.KeyHandler_instance = null;
			}
		}

	}
}