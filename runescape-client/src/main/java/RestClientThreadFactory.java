import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
@Implements("RestClientThreadFactory")
public class RestClientThreadFactory implements ThreadFactory {
	@ObfuscatedName("ap")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 37968869
	)
	static int field76;
	@ObfuscatedName("aq")
	final ThreadGroup field75;
	@ObfuscatedName("ad")
	final AtomicInteger field72;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	RestClientThreadFactory(AsyncRestClient var1) {
		this.this$0 = var1;
		this.field72 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field75 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field75, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field72.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(I)Ltw;",
		garbageValue = "1588228445"
	)
	@Export("getWorldMap")
	static WorldMap getWorldMap() {
		return VertexNormal.worldMap;
	}
}
