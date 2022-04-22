import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public final class class361 {
	@ObfuscatedName("k")
	static int[] field4213;
	@ObfuscatedName("v")
	final Comparator field4217;
	@ObfuscatedName("c")
	final Map field4218;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lmn;")

	final class342 field4214;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lmn;")

	final class342 field4215;
	@ObfuscatedName("b")
	@ObfuscatedGetter(longValue = 
	-1677392653166540809L)

	final long field4219;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lmx;")

	final class359 field4216;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	1491932339)

	final int field4212;

	@ObfuscatedSignature(descriptor = 
	"(JILmx;)V")

	class361(long var1, int var3, class359 var4) {
		this.field4217 = new class360(this);
		this.field4219 = var1;
		this.field4212 = var3;
		this.field4216 = var4;
		if (this.field4212 == (-1)) {
			this.field4218 = new HashMap(64);
			this.field4214 = new class342(64, this.field4217);
			this.field4215 = null;
		} else {
			if (this.field4216 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4218 = new HashMap(this.field4212);
			this.field4214 = new class342(this.field4212, this.field4217);
			this.field4215 = new class342(this.field4212);
		}

	}

	@ObfuscatedSignature(descriptor = 
	"(ILmx;)V")

	public class361(int var1, class359 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-157414931")

	boolean method6594() {
		return this.field4212 != (-1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue = 
	"-2019489642")

	public Object method6601(Object var1) {
		synchronized(this) {
			if ((-1L) != this.field4219) {
				this.method6598();
			}

			class362 var3 = ((class362) (this.field4218.get(var1)));
			if (var3 == null) {
				return null;
			} else {
				this.method6600(var3, false);
				return var3.field4221;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue = 
	"-1186698319")

	public Object method6596(Object var1, Object var2) {
		synchronized(this) {
			if ((-1L) != this.field4219) {
				this.method6598();
			}

			class362 var4 = ((class362) (this.field4218.get(var1)));
			if (var4 != null) {
				Object var8 = var4.field4221;
				var4.field4221 = var2;
				this.method6600(var4, false);
				return var8;
			} else {
				class362 var5;
				if (this.method6594() && (this.field4218.size() == this.field4212)) {
					var5 = ((class362) (this.field4215.remove()));
					this.field4218.remove(var5.field4224);
					this.field4214.remove(var5);
				}

				var5 = new class362(var2, var1);
				this.field4218.put(var1, var5);
				this.method6600(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lmv;ZI)V", garbageValue = 
	"1250273542")

	void method6600(class362 var1, boolean var2) {
		if (!var2) {
			this.field4214.remove(var1);
			if (this.method6594() && (!this.field4215.remove(var1))) {
				throw new IllegalStateException("");
			}
		}

		var1.field4222 = System.currentTimeMillis();
		if (this.method6594()) {
			switch (this.field4216.field4206) {
				case 0 :
					++var1.field4223;
					break;
				case 1 :
					var1.field4223 = var1.field4222;}


			this.field4215.add(var1);
		}

		this.field4214.add(var1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1192700638")

	void method6598() {
		if ((-1L) == this.field4219) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4219;

			while (!this.field4214.isEmpty()) {
				class362 var3 = ((class362) (this.field4214.peek()));
				if (var3.field4222 >= var1) {
					return;
				}

				this.field4218.remove(var3.field4224);
				this.field4214.remove(var3);
				if (this.method6594()) {
					this.field4215.remove(var3);
				}
			} 

		}
	}
}