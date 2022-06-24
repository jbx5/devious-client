import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.concurrent.Callable;
@ObfuscatedName("by")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	SecureRandomCallable() {
	}

	public Object call() {
		return NetFileRequest.method5843();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "1552029421")
	static String method2066(int var0) {
		return "<img=" + var0 + ">";
	}
}