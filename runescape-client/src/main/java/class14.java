import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class14 {
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1802096197
	)
	final int field81;
	@ObfuscatedName("p")
	final String field78;
	@ObfuscatedName("f")
	final ThreadFactory field77;
	@ObfuscatedName("n")
	final ThreadPoolExecutor field79;

	public class14(String var1, int var2, int var3) {
		this.field78 = var1; // L: 15
		this.field81 = var2; // L: 16
		this.field77 = new class16(this); // L: 17
		this.field79 = this.method186(var3); // L: 18
	} // L: 19

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "1996349080"
	)
	final ThreadPoolExecutor method186(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field81), this.field77); // L: 22
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lj;I)Le;",
		garbageValue = "-923812619"
	)
	public class19 method188(class10 var1) {
		if (this.field79.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field79.getCorePoolSize() + " Queue capacity " + this.field81); // L: 27
			return new class19("Queue full"); // L: 28
		} else {
			class19 var2 = new class19(this.field79.submit(new class20(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1872867974"
	)
	public final void method192() {
		try {
			this.field79.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2047458914"
	)
	public static void method196() {
		if (NetCache.NetCache_socket != null) { // L: 199
			NetCache.NetCache_socket.close();
		}

	} // L: 200

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-577265280"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (Client.pcmPlayer1 != null) { // L: 3399
			Client.pcmPlayer1.run();
		}

		if (class241.pcmPlayer0 != null) { // L: 3400
			class241.pcmPlayer0.run();
		}

	} // L: 3401

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-2096414486"
	)
	static String method195(String var0) {
		PlayerType[] var1 = DbTableType.PlayerType_values(); // L: 12155

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12156
			PlayerType var3 = var1[var2]; // L: 12157
			if (var3.modIcon != -1 && var0.startsWith(SecureRandomFuture.method2108(var3.modIcon))) { // L: 12159 12160
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12161
				break;
			}
		}

		return var0; // L: 12168
	}
}
