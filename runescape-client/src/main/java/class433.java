import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
public class class433 extends AbstractQueue {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	class431[] field4770;
	@ObfuscatedName("ae")
	Map field4764;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 153901763
	)
	int field4767;
	@ObfuscatedName("am")
	final Comparator field4765;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 90524677
	)
	int field4768;

	public class433(int var1, Comparator var2) {
		this.field4768 = 0;
		this.field4770 = new class431[var1];
		this.field4764 = new HashMap();
		this.field4765 = var2;
	}

	public class433(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1754453743"
	)
	void method8243() {
		int var1 = (this.field4770.length << 1) + 1;
		this.field4770 = (class431[])((class431[])Arrays.copyOf(this.field4770, var1));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1181630450"
	)
	void method8258(int var1) {
		class431 var2;
		int var3;
		for (var2 = this.field4770[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class431 var4 = this.field4770[var3];
			if (this.field4765 != null) {
				if (this.field4765.compare(var2.field4758, var4.field4758) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4758).compareTo(var4.field4758) >= 0) {
				break;
			}

			this.field4770[var1] = var4;
			this.field4770[var1].field4759 = var1;
		}

		this.field4770[var1] = var2;
		this.field4770[var1].field4759 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-654673380"
	)
	void method8248(int var1) {
		class431 var2 = this.field4770[var1];

		int var8;
		for (int var3 = this.field4767 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class431 var5 = this.field4770[var4];
			int var6 = (var1 << 1) + 2;
			class431 var7 = this.field4770[var6];
			if (this.field4765 != null) {
				if (var6 < this.field4767 && this.field4765.compare(var5.field4758, var7.field4758) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4767 && ((Comparable)var5.field4758).compareTo(var7.field4758) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4765 != null) {
				if (this.field4765.compare(var2.field4758, this.field4770[var8].field4758) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4758).compareTo(this.field4770[var8].field4758) <= 0) {
				break;
			}

			this.field4770[var1] = this.field4770[var8];
			this.field4770[var1].field4759 = var1;
		}

		this.field4770[var1] = var2;
		this.field4770[var1].field4759 = var1;
	}

	public boolean remove(Object var1) {
		class431 var2 = (class431)this.field4764.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4768;
			--this.field4767;
			if (this.field4767 == var2.field4759) {
				this.field4770[this.field4767] = null;
				return true;
			} else {
				class431 var3 = this.field4770[this.field4767];
				this.field4770[this.field4767] = null;
				this.field4770[var2.field4759] = var3;
				this.field4770[var2.field4759].field4759 = var2.field4759;
				this.method8248(var2.field4759);
				if (var3 == this.field4770[var2.field4759]) {
					this.method8258(var2.field4759);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4767 == 0 ? null : this.field4770[0].field4758;
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4765 != null) {
			Arrays.sort(var1, this.field4765);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Object poll() {
		if (this.field4767 == 0) {
			return null;
		} else {
			++this.field4768;
			Object var1 = this.field4770[0].field4758;
			this.field4764.remove(var1);
			--this.field4767;
			if (this.field4767 == 0) {
				this.field4770[this.field4767] = null;
			} else {
				this.field4770[0] = this.field4770[this.field4767];
				this.field4770[0].field4759 = 0;
				this.field4770[this.field4767] = null;
				this.method8248(0);
			}

			return var1;
		}
	}

	public boolean contains(Object var1) {
		return this.field4764.containsKey(var1);
	}

	public Iterator iterator() {
		return new class432(this);
	}

	public int size() {
		return this.field4767;
	}

	public boolean offer(Object var1) {
		if (this.field4764.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4768;
			int var2 = this.field4767;
			if (var2 >= this.field4770.length) {
				this.method8243();
			}

			++this.field4767;
			if (var2 == 0) {
				this.field4770[0] = new class431(var1, 0);
				this.field4764.put(var1, this.field4770[0]);
			} else {
				this.field4770[var2] = new class431(var1, var2);
				this.field4764.put(var1, this.field4770[var2]);
				this.method8258(var2);
			}

			return true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1059025896"
	)
	static void method8269(int var0, int var1, int var2, int var3) {
		class334.musicPlayerStatus = var0;
		class334.field3614 = var1;
		class334.field3624 = var2;
		class334.field3625 = var3;
	}
}
