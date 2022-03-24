import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("f")
public class class7 {
	@ObfuscatedName("bf")
	@ObfuscatedGetter(intValue = 
	1881203141)

	static int field27;
	@ObfuscatedName("v")
	ExecutorService field25;
	@ObfuscatedName("o")
	Future field24;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lpd;")

	final Buffer field23;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lg;")

	final class3 field26;

	@ObfuscatedSignature(descriptor = 
	"(Lpd;Lg;)V")

	public class7(Buffer var1, class3 var2) {
		this.field25 = Executors.newSingleThreadExecutor();
		this.field23 = var1;
		this.field26 = var2;
		this.method51();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"521214923")

	public boolean method42() {
		return this.field24.isDone();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"979398206")

	public void method43() {
		this.field25.shutdown();
		this.field25 = null;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)Lpd;", garbageValue = 
	"-2131615831")

	public Buffer method44() {
		try {
			return ((Buffer) (this.field24.get()));
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1341828538")

	void method51() {
		this.field24 = this.field25.submit(new class1(this, this.field23, this.field26));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"-184151325")

	public static int method53(int var0, int var1) {
		int var2 = var0 >>> 31;
		return ((var0 + var2) / var1) - var2;
	}
}