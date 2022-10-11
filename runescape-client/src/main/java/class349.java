import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mh")
public class class349 extends AbstractQueue {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lmp;"
	)
	class347[] field4212;
	@ObfuscatedName("p")
	Map field4213;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -748861033
	)
	int field4216;
	@ObfuscatedName("n")
	final Comparator field4215;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1839339259
	)
	int field4214;

	public class349(int var1, Comparator var2) {
		this.field4214 = 0; // L: 10
		this.field4212 = new class347[var1]; // L: 17
		this.field4213 = new HashMap(); // L: 18
		this.field4215 = var2; // L: 19
	} // L: 20

	public class349(int var1) {
		this(var1, (Comparator)null); // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-45"
	)
	void method6518() {
		int var1 = (this.field4212.length << 1) + 1; // L: 23
		this.field4212 = (class347[])((class347[])Arrays.copyOf(this.field4212, var1)); // L: 24
	} // L: 25

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1583792739"
	)
	void method6520(int var1) {
		class347 var2;
		int var3;
		for (var2 = this.field4212[var1]; var1 > 0; var1 = var3) { // L: 96 97 108
			var3 = var1 - 1 >>> 1; // L: 98
			class347 var4 = this.field4212[var3]; // L: 99
			if (this.field4215 != null) { // L: 100
				if (this.field4215.compare(var2.field4204, var4.field4204) >= 0) { // L: 101
					break;
				}
			} else if (((Comparable)var2.field4204).compareTo(var4.field4204) >= 0) { // L: 104
				break;
			}

			this.field4212[var1] = var4; // L: 106
			this.field4212[var1].field4206 = var1; // L: 107
		}

		this.field4212[var1] = var2; // L: 110
		this.field4212[var1].field4206 = var1; // L: 111
	} // L: 112

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-91"
	)
	void method6521(int var1) {
		class347 var2 = this.field4212[var1]; // L: 116

		int var8;
		for (int var3 = this.field4216 >>> 1; var1 < var3; var1 = var8) { // L: 117 118 140
			int var4 = (var1 << 1) + 1; // L: 119
			class347 var5 = this.field4212[var4]; // L: 120
			int var6 = (var1 << 1) + 2; // L: 121
			class347 var7 = this.field4212[var6]; // L: 122
			if (this.field4215 != null) { // L: 124
				if (var6 < this.field4216 && this.field4215.compare(var5.field4204, var7.field4204) > 0) { // L: 125
					var8 = var6;
				} else {
					var8 = var4; // L: 126
				}
			} else if (var6 < this.field4216 && ((Comparable)var5.field4204).compareTo(var7.field4204) > 0) { // L: 129
				var8 = var6;
			} else {
				var8 = var4; // L: 130
			}

			if (this.field4215 != null) { // L: 132
				if (this.field4215.compare(var2.field4204, this.field4212[var8].field4204) <= 0) { // L: 133
					break;
				}
			} else if (((Comparable)var2.field4204).compareTo(this.field4212[var8].field4204) <= 0) { // L: 136
				break;
			}

			this.field4212[var1] = this.field4212[var8]; // L: 138
			this.field4212[var1].field4206 = var1; // L: 139
		}

		this.field4212[var1] = var2; // L: 142
		this.field4212[var1].field4206 = var1; // L: 143
	} // L: 144

	public boolean remove(Object var1) {
		class347 var2 = (class347)this.field4213.remove(var1); // L: 77
		if (var2 == null) { // L: 78
			return false;
		} else {
			++this.field4214; // L: 79
			--this.field4216; // L: 80
			if (var2.field4206 == this.field4216) { // L: 81
				this.field4212[this.field4216] = null; // L: 82
				return true; // L: 83
			} else {
				class347 var3 = this.field4212[this.field4216]; // L: 85
				this.field4212[this.field4216] = null; // L: 86
				this.field4212[var2.field4206] = var3; // L: 87
				this.field4212[var2.field4206].field4206 = var2.field4206; // L: 88
				this.method6521(var2.field4206); // L: 89
				if (var3 == this.field4212[var2.field4206]) { // L: 90
					this.method6520(var2.field4206);
				}

				return true; // L: 91
			}
		}
	}

	public Object peek() {
		return this.field4216 == 0 ? null : this.field4212[0].field4204; // L: 54 55
	}

	public int size() {
		return this.field4216; // L: 29
	}

	public boolean offer(Object var1) {
		if (this.field4213.containsKey(var1)) { // L: 34
			throw new IllegalArgumentException("");
		} else {
			++this.field4214; // L: 35
			int var2 = this.field4216; // L: 36
			if (var2 >= this.field4212.length) { // L: 37
				this.method6518();
			}

			++this.field4216; // L: 38
			if (var2 == 0) { // L: 39
				this.field4212[0] = new class347(var1, 0); // L: 40
				this.field4213.put(var1, this.field4212[0]); // L: 41
			} else {
				this.field4212[var2] = new class347(var1, var2); // L: 44
				this.field4213.put(var1, this.field4212[var2]); // L: 45
				this.method6520(var2); // L: 46
			}

			return true; // L: 48
		}
	}

	public boolean contains(Object var1) {
		return this.field4213.containsKey(var1); // L: 148
	}

	public Iterator iterator() {
		return new class348(this); // L: 162
	}

	public Object poll() {
		if (this.field4216 == 0) { // L: 61
			return null;
		} else {
			++this.field4214; // L: 62
			Object var1 = this.field4212[0].field4204; // L: 63
			this.field4213.remove(var1); // L: 64
			--this.field4216; // L: 65
			if (this.field4216 == 0) {
				this.field4212[this.field4216] = null; // L: 66
			} else {
				this.field4212[0] = this.field4212[this.field4216]; // L: 68
				this.field4212[0].field4206 = 0; // L: 69
				this.field4212[this.field4216] = null; // L: 70
				this.method6521(0); // L: 71
			}

			return var1; // L: 73
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray(); // L: 154
		if (this.field4215 != null) {
			Arrays.sort(var1, this.field4215); // L: 155
		} else {
			Arrays.sort(var1); // L: 156
		}

		return var1; // L: 157
	}
}
