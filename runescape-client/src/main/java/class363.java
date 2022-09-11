import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public final class class363 {
	@ObfuscatedName("c")
	final Comparator field4312;
	@ObfuscatedName("p")
	final Map field4309;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	final class349 field4307;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	final class349 field4308;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -2535260607380577403L
	)
	final long field4305;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lmq;"
	)
	final class361 field4310;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1693667935
	)
	final int field4311;

	@ObfuscatedSignature(
		descriptor = "(JILmq;)V"
	)
	class363(long var1, int var3, class361 var4) {
		this.field4312 = new class362(this); // L: 7
		this.field4305 = var1; // L: 34
		this.field4311 = var3; // L: 35
		this.field4310 = var4; // L: 36
		if (this.field4311 == -1) { // L: 37
			this.field4309 = new HashMap(64); // L: 38
			this.field4307 = new class349(64, this.field4312); // L: 39
			this.field4308 = null; // L: 40
		} else {
			if (this.field4310 == null) { // L: 43
				throw new IllegalArgumentException("");
			}

			this.field4309 = new HashMap(this.field4311); // L: 44
			this.field4307 = new class349(this.field4311, this.field4312); // L: 45
			this.field4308 = new class349(this.field4311); // L: 46
		}

	} // L: 48

	@ObfuscatedSignature(
		descriptor = "(ILmq;)V"
	)
	public class363(int var1, class361 var2) {
		this(-1L, var1, var2); // L: 30
	} // L: 31

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "776562823"
	)
	boolean method6747() {
		return this.field4311 != -1; // L: 51
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1302830563"
	)
	public Object method6758(Object var1) {
		synchronized(this) { // L: 55
			if (this.field4305 != -1L) { // L: 56
				this.method6749();
			}

			class364 var3 = (class364)this.field4309.get(var1); // L: 57
			if (var3 == null) { // L: 58
				return null;
			} else {
				this.method6748(var3, false); // L: 59
				return var3.field4319; // L: 60
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "904640996"
	)
	public Object method6750(Object var1, Object var2) {
		synchronized(this) { // L: 65
			if (-1L != this.field4305) { // L: 66
				this.method6749();
			}

			class364 var4 = (class364)this.field4309.get(var1); // L: 67
			if (var4 != null) { // L: 68
				Object var8 = var4.field4319; // L: 69
				var4.field4319 = var2; // L: 70
				this.method6748(var4, false); // L: 71
				return var8; // L: 72
			} else {
				class364 var5;
				if (this.method6747() && this.field4309.size() == this.field4311) { // L: 74
					var5 = (class364)this.field4308.remove(); // L: 75
					this.field4309.remove(var5.field4316); // L: 76
					this.field4307.remove(var5); // L: 77
				}

				var5 = new class364(var2, var1); // L: 79
				this.field4309.put(var1, var5); // L: 80
				this.method6748(var5, true); // L: 81
				return null; // L: 82
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lns;ZI)V",
		garbageValue = "1053593547"
	)
	void method6748(class364 var1, boolean var2) {
		if (!var2) { // L: 88
			this.field4307.remove(var1); // L: 89
			if (this.method6747() && !this.field4308.remove(var1)) { // L: 90 91
				throw new IllegalStateException("");
			}
		}

		var1.field4317 = System.currentTimeMillis(); // L: 94
		if (this.method6747()) { // L: 95
			switch(this.field4310.field4302) { // L: 96
			case 0:
				var1.field4318 = var1.field4317; // L: 101
				break;
			case 1:
				++var1.field4318; // L: 98
			}

			this.field4308.add(var1); // L: 104
		}

		this.field4307.add(var1); // L: 106
	} // L: 107

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	void method6749() {
		if (this.field4305 == -1L) { // L: 111
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4305; // L: 112

			while (!this.field4307.isEmpty()) { // L: 113
				class364 var3 = (class364)this.field4307.peek(); // L: 114
				if (var3.field4317 >= var1) { // L: 115
					return; // L: 120
				}

				this.field4309.remove(var3.field4316); // L: 116
				this.field4307.remove(var3); // L: 117
				if (this.method6747()) { // L: 118
					this.field4308.remove(var3);
				}
			}

		}
	} // L: 122
}
