import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class434 extends AbstractQueue {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lqx;"
	)
	class432[] field4814;
	@ObfuscatedName("aw")
	Map field4811;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1757030441
	)
	int field4813;
	@ObfuscatedName("aj")
	final Comparator field4812;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1198880865
	)
	int field4815;

	public class434(int var1, Comparator var2) {
		this.field4815 = 0;
		this.field4814 = new class432[var1];
		this.field4811 = new HashMap();
		this.field4812 = var2;
	}

	public class434(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	void method8372() {
		int var1 = (this.field4814.length << 1) + 1;
		this.field4814 = (class432[])((class432[])Arrays.copyOf(this.field4814, var1));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-69"
	)
	void method8374(int var1) {
		class432 var2;
		int var3;
		for (var2 = this.field4814[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class432 var4 = this.field4814[var3];
			if (this.field4812 != null) {
				if (this.field4812.compare(var2.field4802, var4.field4802) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4802).compareTo(var4.field4802) >= 0) {
				break;
			}

			this.field4814[var1] = var4;
			this.field4814[var1].field4803 = var1;
		}

		this.field4814[var1] = var2;
		this.field4814[var1].field4803 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	void method8375(int var1) {
		class432 var2 = this.field4814[var1];

		int var8;
		for (int var3 = this.field4813 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class432 var5 = this.field4814[var4];
			int var6 = (var1 << 1) + 2;
			class432 var7 = this.field4814[var6];
			if (this.field4812 != null) {
				if (var6 < this.field4813 && this.field4812.compare(var5.field4802, var7.field4802) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4813 && ((Comparable)var5.field4802).compareTo(var7.field4802) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4812 != null) {
				if (this.field4812.compare(var2.field4802, this.field4814[var8].field4802) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4802).compareTo(this.field4814[var8].field4802) <= 0) {
				break;
			}

			this.field4814[var1] = this.field4814[var8];
			this.field4814[var1].field4803 = var1;
		}

		this.field4814[var1] = var2;
		this.field4814[var1].field4803 = var1;
	}

	public boolean remove(Object var1) {
		class432 var2 = (class432)this.field4811.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4815;
			--this.field4813;
			if (var2.field4803 == this.field4813) {
				this.field4814[this.field4813] = null;
				return true;
			} else {
				class432 var3 = this.field4814[this.field4813];
				this.field4814[this.field4813] = null;
				this.field4814[var2.field4803] = var3;
				this.field4814[var2.field4803].field4803 = var2.field4803;
				this.method8375(var2.field4803);
				if (var3 == this.field4814[var2.field4803]) {
					this.method8374(var2.field4803);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4813 == 0 ? null : this.field4814[0].field4802;
	}

	public int size() {
		return this.field4813;
	}

	public Object poll() {
		if (this.field4813 == 0) {
			return null;
		} else {
			++this.field4815;
			Object var1 = this.field4814[0].field4802;
			this.field4811.remove(var1);
			--this.field4813;
			if (this.field4813 == 0) {
				this.field4814[this.field4813] = null;
			} else {
				this.field4814[0] = this.field4814[this.field4813];
				this.field4814[0].field4803 = 0;
				this.field4814[this.field4813] = null;
				this.method8375(0);
			}

			return var1;
		}
	}

	public boolean contains(Object var1) {
		return this.field4811.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4812 != null) {
			Arrays.sort(var1, this.field4812);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class433(this);
	}

	public boolean offer(Object var1) {
		if (this.field4811.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4815;
			int var2 = this.field4813;
			if (var2 >= this.field4814.length) {
				this.method8372();
			}

			++this.field4813;
			if (var2 == 0) {
				this.field4814[0] = new class432(var1, 0);
				this.field4811.put(var1, this.field4814[0]);
			} else {
				this.field4814[var2] = new class432(var1, var2);
				this.field4811.put(var1, this.field4814[var2]);
				this.method8374(var2);
			}

			return true;
		}
	}

	@ObfuscatedName("gq")
	@ObfuscatedSignature(
		descriptor = "(Ldj;B)V",
		garbageValue = "-29"
	)
	static void method8371(class95 var0) {
		if (Client.field536 != var0) {
			Client.field536 = var0;
		}
	}
}
