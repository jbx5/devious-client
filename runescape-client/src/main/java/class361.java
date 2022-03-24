import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public final class class361 {
	@ObfuscatedName("v")
	final Comparator field4230;
	@ObfuscatedName("o")
	final Map field4226;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lmj;")

	final class342 field4228;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lmj;")

	final class342 field4227;
	@ObfuscatedName("l")
	@ObfuscatedGetter(longValue = 
	-4912309807257080405L)

	final long field4231;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lmh;")

	final class359 field4229;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	2090341153)

	final int field4232;

	@ObfuscatedSignature(descriptor = 
	"(JILmh;)V")

	class361(long var1, int var3, class359 var4) {
		this.field4230 = new class360(this);
		this.field4231 = var1;
		this.field4232 = var3;
		this.field4229 = var4;
		if (this.field4232 == (-1)) {
			this.field4226 = new HashMap(64);
			this.field4228 = new class342(64, this.field4230);
			this.field4227 = null;
		} else {
			if (this.field4229 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4226 = new HashMap(this.field4232);
			this.field4228 = new class342(this.field4232, this.field4230);
			this.field4227 = new class342(this.field4232);
		}

	}

	@ObfuscatedSignature(descriptor = 
	"(ILmh;)V")

	public class361(int var1, class359 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"1")

	boolean method6645() {
		return this.field4232 != (-1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue = 
	"-1900663720")

	public Object method6639(Object var1) {
		synchronized(this) {
			if ((-1L) != this.field4231) {
				this.method6642();
			}

			class362 var3 = ((class362) (this.field4226.get(var1)));
			if (var3 == null) {
				return null;
			} else {
				this.method6641(var3, false);
				return var3.field4235;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", garbageValue = 
	"1970853535")

	public Object method6640(Object var1, Object var2) {
		synchronized(this) {
			if ((-1L) != this.field4231) {
				this.method6642();
			}

			class362 var4 = ((class362) (this.field4226.get(var1)));
			if (var4 != null) {
				Object var8 = var4.field4235;
				var4.field4235 = var2;
				this.method6641(var4, false);
				return var8;
			} else {
				class362 var5;
				if (this.method6645() && (this.field4226.size() == this.field4232)) {
					var5 = ((class362) (this.field4227.remove()));
					this.field4226.remove(var5.field4234);
					this.field4228.remove(var5);
				}

				var5 = new class362(var2, var1);
				this.field4226.put(var1, var5);
				this.method6641(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Lmv;ZI)V", garbageValue = 
	"-911621571")

	void method6641(class362 var1, boolean var2) {
		if (!var2) {
			this.field4228.remove(var1);
			if (this.method6645() && (!this.field4227.remove(var1))) {
				throw new IllegalStateException("");
			}
		}

		var1.field4236 = System.currentTimeMillis();
		if (this.method6645()) {
			switch (this.field4229.field4219) {
				case 0 :
					++var1.field4237;
					break;
				case 1 :
					var1.field4237 = var1.field4236;}


			this.field4227.add(var1);
		}

		this.field4228.add(var1);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"961475175")

	void method6642() {
		if (this.field4231 == (-1L)) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4231;

			while (!this.field4228.isEmpty()) {
				class362 var3 = ((class362) (this.field4228.peek()));
				if (var3.field4236 >= var1) {
					return;
				}

				this.field4226.remove(var3.field4234);
				this.field4228.remove(var3);
				if (this.method6645()) {
					this.field4227.remove(var3);
				}
			} 

		}
	}
}