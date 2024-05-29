import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public class class429 extends AbstractQueue {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lqq;"
	)
	class427[] field4723;
	@ObfuscatedName("al")
	Map field4720;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2142862631
	)
	int field4721;
	@ObfuscatedName("az")
	final Comparator field4719;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -2033455181
	)
	int field4722;

	public class429(int var1, Comparator var2) {
		this.field4722 = 0;
		this.field4723 = new class427[var1];
		this.field4720 = new HashMap();
		this.field4719 = var2;
	}

	public class429(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	void method7967() {
		int var1 = (this.field4723.length << 1) + 1;
		this.field4723 = (class427[])((class427[])Arrays.copyOf(this.field4723, var1));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-91"
	)
	void method7983(int var1) {
		class427 var2;
		int var3;
		for (var2 = this.field4723[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class427 var4 = this.field4723[var3];
			if (this.field4719 != null) {
				if (this.field4719.compare(var2.field4713, var4.field4713) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4713).compareTo(var4.field4713) >= 0) {
				break;
			}

			this.field4723[var1] = var4;
			this.field4723[var1].field4714 = var1;
		}

		this.field4723[var1] = var2;
		this.field4723[var1].field4714 = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1766406530"
	)
	void method7974(int var1) {
		class427 var2 = this.field4723[var1];

		int var8;
		for (int var3 = this.field4721 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class427 var5 = this.field4723[var4];
			int var6 = (var1 << 1) + 2;
			class427 var7 = this.field4723[var6];
			if (this.field4719 != null) {
				if (var6 < this.field4721 && this.field4719.compare(var5.field4713, var7.field4713) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4721 && ((Comparable)var5.field4713).compareTo(var7.field4713) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4719 != null) {
				if (this.field4719.compare(var2.field4713, this.field4723[var8].field4713) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4713).compareTo(this.field4723[var8].field4713) <= 0) {
				break;
			}

			this.field4723[var1] = this.field4723[var8];
			this.field4723[var1].field4714 = var1;
		}

		this.field4723[var1] = var2;
		this.field4723[var1].field4714 = var1;
	}

	public boolean remove(Object var1) {
		class427 var2 = (class427)this.field4720.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4722;
			--this.field4721;
			if (this.field4721 == var2.field4714) {
				this.field4723[this.field4721] = null;
				return true;
			} else {
				class427 var3 = this.field4723[this.field4721];
				this.field4723[this.field4721] = null;
				this.field4723[var2.field4714] = var3;
				this.field4723[var2.field4714].field4714 = var2.field4714;
				this.method7974(var2.field4714);
				if (var3 == this.field4723[var2.field4714]) {
					this.method7983(var2.field4714);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4721 == 0 ? null : this.field4723[0].field4713;
	}

	public Object poll() {
		if (this.field4721 == 0) {
			return null;
		} else {
			++this.field4722;
			Object var1 = this.field4723[0].field4713;
			this.field4720.remove(var1);
			--this.field4721;
			if (this.field4721 == 0) {
				this.field4723[this.field4721] = null;
			} else {
				this.field4723[0] = this.field4723[this.field4721];
				this.field4723[0].field4714 = 0;
				this.field4723[this.field4721] = null;
				this.method7974(0);
			}

			return var1;
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4719 != null) {
			Arrays.sort(var1, this.field4719);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class428(this);
	}

	public boolean contains(Object var1) {
		return this.field4720.containsKey(var1);
	}

	public int size() {
		return this.field4721;
	}

	public boolean offer(Object var1) {
		if (this.field4720.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4722;
			int var2 = this.field4721;
			if (var2 >= this.field4723.length) {
				this.method7967();
			}

			++this.field4721;
			if (var2 == 0) {
				this.field4723[0] = new class427(var1, 0);
				this.field4720.put(var1, this.field4723[0]);
			} else {
				this.field4723[var2] = new class427(var1, var2);
				this.field4720.put(var1, this.field4723[var2]);
				this.method7983(var2);
			}

			return true;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "522997657"
	)
	static final int method7981(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}
