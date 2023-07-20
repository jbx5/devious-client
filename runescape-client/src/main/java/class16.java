import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class16 implements ThreadFactory {
	@ObfuscatedName("aw")
	final ThreadGroup field85;
	@ObfuscatedName("ay")
	final AtomicInteger field86;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Laa;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1;
		this.field86 = new AtomicInteger(1);
		SecurityManager var2 = System.getSecurityManager();
		this.field85 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
	}

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field85, var1, this.this$0.field74 + "-rest-request-" + this.field86.getAndIncrement(), 0L);
		var2.setDaemon(true);
		var2.setPriority(5);
		return var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "-1561438911"
	)
	static Date method215() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var0.setLenient(false);
		StringBuilder var1 = new StringBuilder();
		String[] var2 = Login.field953;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			String var4 = var2[var3];
			if (var4 == null) {
				class328.method6115(7);
				Actor.setLoginResponseString("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var1.append(var4);
		}

		var1.append("12");
		return var0.parse(var1.toString());
	}
}
