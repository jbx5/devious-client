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

@ObfuscatedName("pt")
public class class412 extends AbstractQueue {
	@ObfuscatedName("dd")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lpi;"
	)
	class410[] field4584;
	@ObfuscatedName("ah")
	Map field4578;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 26940847
	)
	int field4580;
	@ObfuscatedName("at")
	final Comparator field4581;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1456283695
	)
	int field4582;

	public class412(int var1, Comparator var2) {
		this.field4582 = 0;
		this.field4584 = new class410[var1];
		this.field4578 = new HashMap();
		this.field4581 = var2;
	}

	public class412(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "887913874"
	)
	void method7493() {
		int var1 = (this.field4584.length << 1) + 1;
		this.field4584 = (class410[])((class410[])Arrays.copyOf(this.field4584, var1));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2091204403"
	)
	void method7475(int var1) {
		class410 var2;
		int var3;
		for (var2 = this.field4584[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class410 var4 = this.field4584[var3];
			if (this.field4581 != null) {
				if (this.field4581.compare(var2.field4573, var4.field4573) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4573).compareTo(var4.field4573) >= 0) {
				break;
			}

			this.field4584[var1] = var4;
			this.field4584[var1].field4572 = var1;
		}

		this.field4584[var1] = var2;
		this.field4584[var1].field4572 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	void method7476(int var1) {
		class410 var2 = this.field4584[var1];

		int var8;
		for (int var3 = this.field4580 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class410 var5 = this.field4584[var4];
			int var6 = (var1 << 1) + 2;
			class410 var7 = this.field4584[var6];
			if (this.field4581 != null) {
				if (var6 < this.field4580 && this.field4581.compare(var5.field4573, var7.field4573) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4580 && ((Comparable)var5.field4573).compareTo(var7.field4573) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4581 != null) {
				if (this.field4581.compare(var2.field4573, this.field4584[var8].field4573) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4573).compareTo(this.field4584[var8].field4573) <= 0) {
				break;
			}

			this.field4584[var1] = this.field4584[var8];
			this.field4584[var1].field4572 = var1;
		}

		this.field4584[var1] = var2;
		this.field4584[var1].field4572 = var1;
	}

	public boolean remove(Object var1) {
		class410 var2 = (class410)this.field4578.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4582;
			--this.field4580;
			if (var2.field4572 == this.field4580) {
				this.field4584[this.field4580] = null;
				return true;
			} else {
				class410 var3 = this.field4584[this.field4580];
				this.field4584[this.field4580] = null;
				this.field4584[var2.field4572] = var3;
				this.field4584[var2.field4572].field4572 = var2.field4572;
				this.method7476(var2.field4572);
				if (var3 == this.field4584[var2.field4572]) {
					this.method7475(var2.field4572);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4580 == 0 ? null : this.field4584[0].field4573;
	}

	public Object poll() {
		if (this.field4580 == 0) {
			return null;
		} else {
			++this.field4582;
			Object var1 = this.field4584[0].field4573;
			this.field4578.remove(var1);
			--this.field4580;
			if (this.field4580 == 0) {
				this.field4584[this.field4580] = null;
			} else {
				this.field4584[0] = this.field4584[this.field4580];
				this.field4584[0].field4572 = 0;
				this.field4584[this.field4580] = null;
				this.method7476(0);
			}

			return var1;
		}
	}

	public boolean offer(Object var1) {
		if (this.field4578.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4582;
			int var2 = this.field4580;
			if (var2 >= this.field4584.length) {
				this.method7493();
			}

			++this.field4580;
			if (var2 == 0) {
				this.field4584[0] = new class410(var1, 0);
				this.field4578.put(var1, this.field4584[0]);
			} else {
				this.field4584[var2] = new class410(var1, var2);
				this.field4578.put(var1, this.field4584[var2]);
				this.method7475(var2);
			}

			return true;
		}
	}

	public int size() {
		return this.field4580;
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4581 != null) {
			Arrays.sort(var1, this.field4581);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class411(this);
	}

	public boolean contains(Object var1) {
		return this.field4578.containsKey(var1);
	}
}
