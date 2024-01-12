import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("RestClientThreadFactory")
public class RestClientThreadFactory implements ThreadFactory {
	@ObfuscatedName("am")
	final ThreadGroup field72;
	@ObfuscatedName("ap")
	final AtomicInteger field69;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	final AsyncRestClient this$0;

	@ObfuscatedSignature(
		descriptor = "(Law;)V"
	)
	RestClientThreadFactory(AsyncRestClient var1) {
		this.this$0 = var1;
		this.field69 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field72 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field72, var1, this.this$0.threadNamePrefix + "-rest-request-" + this.field69.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-507831292"
	)
	static boolean method220() {
		return (Client.drawPlayerNames & 2) != 0;
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-12"
	)
	static void method219() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "([Lnn;Lnn;ZI)V",
		garbageValue = "1410391386"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width;
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height;
		class428.resizeInterface(var0, var1.id, var3, var4, var2);
		if (var1.children != null) {
			class428.resizeInterface(var1.children, var1.id, var3, var4, var2);
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id);
		if (var5 != null) {
			int var6 = var5.group;
			if (class380.widgetDefinition.loadInterface(var6)) {
				class428.resizeInterface(class380.widgetDefinition.Widget_interfaceComponents[var6], -1, var3, var4, var2);
			}
		}

		if (var1.contentType == 1337) {
		}

	}
}
