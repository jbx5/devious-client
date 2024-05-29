import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
final class class138 implements ThreadFactory {
	@ObfuscatedName("fr")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("archive10")
	static Archive archive10;

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/Socket;III)Lsm;",
		garbageValue = "-165593459"
	)
	public static AbstractSocket method3132(Socket var0, int var1, int var2) throws IOException {
		return new BufferedNetSocket(var0, var1, var2);
	}
}
