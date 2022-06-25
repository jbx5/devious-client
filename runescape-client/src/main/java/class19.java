import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
@ObfuscatedName("a")
public class class19 {
	@ObfuscatedName("up")
	@ObfuscatedSignature(descriptor = "Lcv;")
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;

	@ObfuscatedName("c")
	Future field107;

	@ObfuscatedName("v")
	String field106;

	class19(Future var1) {
		this.field107 = var1;
	}

	class19(String var1) {
		this.method243(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "1161369831")
	void method243(String var1) {
		if (var1 == null) {
			var1 = "";
		}
		this.field106 = var1;
		if (this.field107 != null) {
			this.field107.cancel(true);
			this.field107 = null;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-688611992")
	public final String method244() {
		return this.field106;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "731102059")
	public boolean method251() {
		return this.field106 != null || this.field107 == null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1151479385")
	public final boolean method246() {
		return this.method251() ? true : this.field107.isDone();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(S)Lb;", garbageValue = "-5003")
	public final class21 method249() {
		if (this.method251()) {
			return new class21(this.field106);
		} else if (!this.method246()) {
			return null;
		} else {
			try {
				return ((class21) (this.field107.get()));
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method243(var2);
				return new class21(var2);
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(II)Ldt;", garbageValue = "234177073")
	static class119 method254(int var0) {
		class119 var1 = ((class119) (Actor.findEnumerated(UserComparator9.method2599(), var0)));
		if (var1 == null) {
			var1 = class119.field1497;
		}
		return var1;
	}
}