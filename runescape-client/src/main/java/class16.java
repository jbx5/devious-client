import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("r")
public class class16 implements ThreadFactory {
	@ObfuscatedName("il")
	@ObfuscatedSignature(descriptor = "Lqn;")
	@Export("compass")
	static SpritePixels compass;

	@ObfuscatedName("jq")
	@ObfuscatedGetter(intValue = -1423106171)
	@Export("cameraX")
	static int cameraX;

	@ObfuscatedName("lk")
	@ObfuscatedSignature(descriptor = "Lkn;")
	@Export("dragInventoryWidget")
	static Widget dragInventoryWidget;

	@ObfuscatedName("s")
	final ThreadGroup field84;

	@ObfuscatedName("h")
	final AtomicInteger field83;

	@ObfuscatedSignature(descriptor = "Ll;")
	final class14 this$0;

	@ObfuscatedSignature(descriptor = "(Ll;)V")
	class16(class14 var1) {
		this.this$0 = var1;
		this.field83 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field84 = (var2 != null) ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field84, var1, this.this$0.field78 + "-rest-request-" + this.field83.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "-1187318424")
	public static boolean method204(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class341.cp1252AsciiExtension;
				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}
			return false;
		} else {
			return true;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "1866345097")
	static int method203(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}
			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}
			return (var0 & 'ﾀ') + var1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-476601149")
	public static int method205(int var0) {
		return class402.field4444[var0 & 16383];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1785411411")
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message) (var1.previousDual)).count;
		}
	}
}