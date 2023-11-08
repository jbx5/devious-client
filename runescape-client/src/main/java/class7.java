import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class class7 {
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lrv;"
	)
	static Bounds field21;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	static Archive field25;
	@ObfuscatedName("at")
	ExecutorService field24;
	@ObfuscatedName("ah")
	Future field18;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	final Buffer field19;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	final class3 field20;

	@ObfuscatedSignature(
		descriptor = "(Luj;Lao;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field24 = Executors.newSingleThreadExecutor();
		this.field19 = var1;
		this.field20 = var2;
		this.method56();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1139388423"
	)
	public boolean method51() {
		return this.field18.isDone();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-85"
	)
	public void method62() {
		this.field24.shutdown();
		this.field24 = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Luj;",
		garbageValue = "1719469539"
	)
	public Buffer method52() {
		try {
			return (Buffer)this.field18.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "670467057"
	)
	void method56() {
		this.field18 = this.field24.submit(new class1(this, this.field19, this.field20));
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}
}
