import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pa")
public class class392 extends AbstractQueue {
	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lps;"
	)
	class390[] field4448;
	@ObfuscatedName("ae")
	Map field4447;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1031831555
	)
	int field4450;
	@ObfuscatedName("at")
	final Comparator field4449;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1450073607
	)
	int field4446;

	public class392(int var1, Comparator var2) {
		this.field4446 = 0;
		this.field4448 = new class390[var1];
		this.field4447 = new HashMap();
		this.field4449 = var2;
	}

	public class392(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method7229() {
		int var1 = (this.field4448.length << 1) + 1;
		this.field4448 = (class390[])((class390[])Arrays.copyOf(this.field4448, var1));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-119"
	)
	void method7238(int var1) {
		class390 var2;
		int var3;
		for (var2 = this.field4448[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class390 var4 = this.field4448[var3];
			if (this.field4449 != null) {
				if (this.field4449.compare(var2.field4440, var4.field4440) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4440).compareTo(var4.field4440) >= 0) {
				break;
			}

			this.field4448[var1] = var4;
			this.field4448[var1].field4439 = var1;
		}

		this.field4448[var1] = var2;
		this.field4448[var1].field4439 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-466589419"
	)
	void method7257(int var1) {
		class390 var2 = this.field4448[var1];

		int var8;
		for (int var3 = this.field4450 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class390 var5 = this.field4448[var4];
			int var6 = (var1 << 1) + 2;
			class390 var7 = this.field4448[var6];
			if (this.field4449 != null) {
				if (var6 < this.field4450 && this.field4449.compare(var5.field4440, var7.field4440) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4450 && ((Comparable)var5.field4440).compareTo(var7.field4440) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4449 != null) {
				if (this.field4449.compare(var2.field4440, this.field4448[var8].field4440) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4440).compareTo(this.field4448[var8].field4440) <= 0) {
				break;
			}

			this.field4448[var1] = this.field4448[var8];
			this.field4448[var1].field4439 = var1;
		}

		this.field4448[var1] = var2;
		this.field4448[var1].field4439 = var1;
	}

	public boolean remove(Object var1) {
		class390 var2 = (class390)this.field4447.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4446;
			--this.field4450;
			if (this.field4450 == var2.field4439) {
				this.field4448[this.field4450] = null;
				return true;
			} else {
				class390 var3 = this.field4448[this.field4450];
				this.field4448[this.field4450] = null;
				this.field4448[var2.field4439] = var3;
				this.field4448[var2.field4439].field4439 = var2.field4439;
				this.method7257(var2.field4439);
				if (var3 == this.field4448[var2.field4439]) {
					this.method7238(var2.field4439);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4450 == 0 ? null : this.field4448[0].field4440;
	}

	public boolean offer(Object var1) {
		if (this.field4447.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4446;
			int var2 = this.field4450;
			if (var2 >= this.field4448.length) {
				this.method7229();
			}

			++this.field4450;
			if (var2 == 0) {
				this.field4448[0] = new class390(var1, 0);
				this.field4447.put(var1, this.field4448[0]);
			} else {
				this.field4448[var2] = new class390(var1, var2);
				this.field4447.put(var1, this.field4448[var2]);
				this.method7238(var2);
			}

			return true;
		}
	}

	public boolean contains(Object var1) {
		return this.field4447.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4449 != null) {
			Arrays.sort(var1, this.field4449);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public int size() {
		return this.field4450;
	}

	public Iterator iterator() {
		return new class391(this);
	}

	public Object poll() {
		if (this.field4450 == 0) {
			return null;
		} else {
			++this.field4446;
			Object var1 = this.field4448[0].field4440;
			this.field4447.remove(var1);
			--this.field4450;
			if (this.field4450 == 0) {
				this.field4448[this.field4450] = null;
			} else {
				this.field4448[0] = this.field4448[this.field4450];
				this.field4448[0].field4439 = 0;
				this.field4448[this.field4450] = null;
				this.method7257(0);
			}

			return var1;
		}
	}
}
