import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class411 extends AbstractQueue {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lpz;"
	)
	class409[] field4562;
	@ObfuscatedName("aw")
	Map field4564;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1785638983
	)
	int field4563;
	@ObfuscatedName("ai")
	final Comparator field4565;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1500214837
	)
	int field4561;

	public class411(int var1, Comparator var2) {
		this.field4561 = 0;
		this.field4562 = new class409[var1];
		this.field4564 = new HashMap();
		this.field4565 = var2;
	}

	public class411(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	void method7667() {
		int var1 = (this.field4562.length << 1) + 1;
		this.field4562 = (class409[])((class409[])Arrays.copyOf(this.field4562, var1));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-6"
	)
	void method7659(int var1) {
		class409 var2;
		int var3;
		for (var2 = this.field4562[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class409 var4 = this.field4562[var3];
			if (this.field4565 != null) {
				if (this.field4565.compare(var2.field4554, var4.field4554) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4554).compareTo(var4.field4554) >= 0) {
				break;
			}

			this.field4562[var1] = var4;
			this.field4562[var1].field4553 = var1;
		}

		this.field4562[var1] = var2;
		this.field4562[var1].field4553 = var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-716869550"
	)
	void method7674(int var1) {
		class409 var2 = this.field4562[var1];

		int var8;
		for (int var3 = this.field4563 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class409 var5 = this.field4562[var4];
			int var6 = (var1 << 1) + 2;
			class409 var7 = this.field4562[var6];
			if (this.field4565 != null) {
				if (var6 < this.field4563 && this.field4565.compare(var5.field4554, var7.field4554) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4563 && ((Comparable)var5.field4554).compareTo(var7.field4554) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4565 != null) {
				if (this.field4565.compare(var2.field4554, this.field4562[var8].field4554) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4554).compareTo(this.field4562[var8].field4554) <= 0) {
				break;
			}

			this.field4562[var1] = this.field4562[var8];
			this.field4562[var1].field4553 = var1;
		}

		this.field4562[var1] = var2;
		this.field4562[var1].field4553 = var1;
	}

	public boolean remove(Object var1) {
		class409 var2 = (class409)this.field4564.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4561;
			--this.field4563;
			if (this.field4563 == var2.field4553) {
				this.field4562[this.field4563] = null;
				return true;
			} else {
				class409 var3 = this.field4562[this.field4563];
				this.field4562[this.field4563] = null;
				this.field4562[var2.field4553] = var3;
				this.field4562[var2.field4553].field4553 = var2.field4553;
				this.method7674(var2.field4553);
				if (var3 == this.field4562[var2.field4553]) {
					this.method7659(var2.field4553);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4563 == 0 ? null : this.field4562[0].field4554;
	}

	public int size() {
		return this.field4563;
	}

	public boolean offer(Object var1) {
		if (this.field4564.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4561;
			int var2 = this.field4563;
			if (var2 >= this.field4562.length) {
				this.method7667();
			}

			++this.field4563;
			if (var2 == 0) {
				this.field4562[0] = new class409(var1, 0);
				this.field4564.put(var1, this.field4562[0]);
			} else {
				this.field4562[var2] = new class409(var1, var2);
				this.field4564.put(var1, this.field4562[var2]);
				this.method7659(var2);
			}

			return true;
		}
	}

	public Object poll() {
		if (this.field4563 == 0) {
			return null;
		} else {
			++this.field4561;
			Object var1 = this.field4562[0].field4554;
			this.field4564.remove(var1);
			--this.field4563;
			if (this.field4563 == 0) {
				this.field4562[this.field4563] = null;
			} else {
				this.field4562[0] = this.field4562[this.field4563];
				this.field4562[0].field4553 = 0;
				this.field4562[this.field4563] = null;
				this.method7674(0);
			}

			return var1;
		}
	}

	public boolean contains(Object var1) {
		return this.field4564.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4565 != null) {
			Arrays.sort(var1, this.field4565);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class410(this);
	}
}
