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

@ObfuscatedName("qc")
public class class431 extends AbstractQueue {
	@ObfuscatedName("ao")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lql;"
	)
	class429[] field4720;
	@ObfuscatedName("ay")
	Map field4717;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 380592563
	)
	int field4718;
	@ObfuscatedName("au")
	final Comparator field4721;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -714136655
	)
	int field4719;

	public class431(int var1, Comparator var2) {
		this.field4719 = 0;
		this.field4720 = new class429[var1];
		this.field4717 = new HashMap();
		this.field4721 = var2;
	}

	public class431(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1230462451"
	)
	void method7980() {
		int var1 = (this.field4720.length << 1) + 1;
		this.field4720 = (class429[])((class429[])Arrays.copyOf(this.field4720, var1));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-28152475"
	)
	void method7981(int var1) {
		class429 var2;
		int var3;
		for (var2 = this.field4720[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class429 var4 = this.field4720[var3];
			if (this.field4721 != null) {
				if (this.field4721.compare(var2.field4710, var4.field4710) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4710).compareTo(var4.field4710) >= 0) {
				break;
			}

			this.field4720[var1] = var4;
			this.field4720[var1].field4709 = var1;
		}

		this.field4720[var1] = var2;
		this.field4720[var1].field4709 = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1720105093"
	)
	void method7983(int var1) {
		class429 var2 = this.field4720[var1];

		int var8;
		for (int var3 = this.field4718 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class429 var5 = this.field4720[var4];
			int var6 = (var1 << 1) + 2;
			class429 var7 = this.field4720[var6];
			if (this.field4721 != null) {
				if (var6 < this.field4718 && this.field4721.compare(var5.field4710, var7.field4710) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4718 && ((Comparable)var5.field4710).compareTo(var7.field4710) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4721 != null) {
				if (this.field4721.compare(var2.field4710, this.field4720[var8].field4710) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4710).compareTo(this.field4720[var8].field4710) <= 0) {
				break;
			}

			this.field4720[var1] = this.field4720[var8];
			this.field4720[var1].field4709 = var1;
		}

		this.field4720[var1] = var2;
		this.field4720[var1].field4709 = var1;
	}

	public boolean remove(Object var1) {
		class429 var2 = (class429)this.field4717.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4719;
			--this.field4718;
			if (var2.field4709 == this.field4718) {
				this.field4720[this.field4718] = null;
				return true;
			} else {
				class429 var3 = this.field4720[this.field4718];
				this.field4720[this.field4718] = null;
				this.field4720[var2.field4709] = var3;
				this.field4720[var2.field4709].field4709 = var2.field4709;
				this.method7983(var2.field4709);
				if (var3 == this.field4720[var2.field4709]) {
					this.method7981(var2.field4709);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4718 == 0 ? null : this.field4720[0].field4710;
	}

	public int size() {
		return this.field4718;
	}

	public boolean offer(Object var1) {
		if (this.field4717.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4719;
			int var2 = this.field4718;
			if (var2 >= this.field4720.length) {
				this.method7980();
			}

			++this.field4718;
			if (var2 == 0) {
				this.field4720[0] = new class429(var1, 0);
				this.field4717.put(var1, this.field4720[0]);
			} else {
				this.field4720[var2] = new class429(var1, var2);
				this.field4717.put(var1, this.field4720[var2]);
				this.method7981(var2);
			}

			return true;
		}
	}

	public Object poll() {
		if (this.field4718 == 0) {
			return null;
		} else {
			++this.field4719;
			Object var1 = this.field4720[0].field4710;
			this.field4717.remove(var1);
			--this.field4718;
			if (this.field4718 == 0) {
				this.field4720[this.field4718] = null;
			} else {
				this.field4720[0] = this.field4720[this.field4718];
				this.field4720[0].field4709 = 0;
				this.field4720[this.field4718] = null;
				this.method7983(0);
			}

			return var1;
		}
	}

	public boolean contains(Object var1) {
		return this.field4717.containsKey(var1);
	}

	public Iterator iterator() {
		return new class430(this);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4721 != null) {
			Arrays.sort(var1, this.field4721);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}
}
