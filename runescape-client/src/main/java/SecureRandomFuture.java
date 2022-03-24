import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	624688943)

	public static int field949;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-586498373)

	@Export("cacheGamebuild")
	public static int cacheGamebuild;
	@ObfuscatedName("v")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("o")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-56")

	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-71")

	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/security/SecureRandom;", garbageValue = 
	"168688514")

	@Export("get")
	SecureRandom get() {
		try {
			return ((SecureRandom) (this.future.get()));
		} catch (Exception var2) {
			return NPC.method2364();
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/String;IIIII)V", garbageValue = 
	"1166774684")

	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		DynamicObject.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1463991550")

	static final void method1968() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.method2143();
		}

	}
}