import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class16 implements ThreadFactory {
	@ObfuscatedName("eo")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("v")
	final ThreadGroup field77;
	@ObfuscatedName("c")
	final AtomicInteger field78;

	@ObfuscatedSignature(descriptor = 
	"Ld;")

	final class14 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Ld;)V")

	class16(class14 var1) {
		this.this$0 = var1;
		this.field78 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field77 = (var2 != null) ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field77, var1, (this.this$0.field69 + "-rest-request-") + this.field78.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/io/File;Ljava/io/File;I)V", garbageValue = 
	"2082256408")

	static void method194(File var0, File var1) {
		try {
			AccessFile var2 = new AccessFile(class28.JagexCache_locationFile, "rw", 10000L);
			Buffer var3 = new Buffer(500);
			var3.writeByte(3);
			var3.writeByte(var1 != null ? 1 : 0);
			var3.writeCESU8(var0.getPath());
			if (var1 != null) {
				var3.writeCESU8("");
			}

			var2.write(var3.array, 0, var3.offset);
			var2.close();
		} catch (IOException var4) {
			var4.printStackTrace();
		}

	}

	@ObfuscatedName("fb")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"1157813230")

	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		ItemLayer.logOut();
		switch (var0) {
			case 1 :
				Ignored.method6828(24);
				class4.setLoginResponseString("", "You were disconnected from the server.", "");
				break;
			case 2 :
				Ignored.method6828(24);
				class4.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");}


	}
}