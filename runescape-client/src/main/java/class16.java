import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.Iterator;
import net.runelite.mapping.Export;
@ObfuscatedName("l")
public class class16 implements ThreadFactory {
	@ObfuscatedName("qd")
	@ObfuscatedSignature(descriptor = "Lft;")
	@Export("mouseWheel")
	static class158 mouseWheel;

	@ObfuscatedName("o")
	final ThreadGroup field93;

	@ObfuscatedName("q")
	final AtomicInteger field92;

	@ObfuscatedSignature(descriptor = "Lp;")
	final class14 this$0;

	@ObfuscatedSignature(descriptor = "(Lp;)V")
	class16(class14 var1) {
		this.this$0 = var1;
		this.field92 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field93 = (var2 != null) ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field93, var1, this.this$0.field75 + "-rest-request-" + this.field92.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "1")
	static final void method214(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field610[var4] = true;
			}
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "182")
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1811585689")
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator();
		while (var0.hasNext()) {
			Message var1 = ((Message) (var0.next()));
			var1.clearIsFromIgnored();
		} 
		if (class13.friendsChat != null) {
			class13.friendsChat.invalidateIgnoreds();
		}
	}
}