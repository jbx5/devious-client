import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class7 {
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("az")
	ExecutorService field20;
	@ObfuscatedName("ah")
	Future field22;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	final Buffer field19;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class3 field18;

	@ObfuscatedSignature(
		descriptor = "(Lur;Lat;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field20 = Executors.newSingleThreadExecutor();
		this.field19 = var1;
		this.field18 = var2;
		this.method48();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-17070"
	)
	public boolean method46() {
		return this.field22.isDone();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "18832"
	)
	public void method59() {
		this.field20.shutdown();
		this.field20 = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Lur;",
		garbageValue = "-10"
	)
	public Buffer method58() {
		try {
			return (Buffer)this.field22.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "107"
	)
	void method48() {
		this.field22 = this.field20.submit(new class1(this, this.field19, this.field18));
	}

	@ObfuscatedName("ah")
	public static int method60(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "266384949"
	)
	static void method44() {
		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (NPC.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = NPC.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}
}
