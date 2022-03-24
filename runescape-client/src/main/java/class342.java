import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class342 extends AbstractQueue {
	@ObfuscatedName("f")
	@Export("soundSystemExecutor")
	static ScheduledExecutorService soundSystemExecutor;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"[Lmt;")

	class340[] field4121;
	@ObfuscatedName("o")
	Map field4116;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	205859761)

	int field4117;
	@ObfuscatedName("g")
	final Comparator field4118;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-116505453)

	int field4115;

	public class342(int var1, Comparator var2) {
		this.field4115 = 0;
		this.field4121 = new class340[var1];
		this.field4116 = new HashMap();
		this.field4118 = var2;
	}

	public class342(int var1) {
		this(var1, ((Comparator) (null)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1358753820")

	void method6346() {
		int var1 = (this.field4121.length << 1) + 1;
		this.field4121 = ((class340[]) ((class340[]) (Arrays.copyOf(this.field4121, var1))));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-385967727")

	void method6365(int var1) {
		class340 var2;
		int var3;
		for (var2 = this.field4121[var1]; var1 > 0; var1 = var3) {
			var3 = (var1 - 1) >>> 1;
			class340 var4 = this.field4121[var3];
			if (this.field4118 != null) {
				if (this.field4118.compare(var2.field4107, var4.field4107) >= 0) {
					break;
				}
			} else if (((Comparable) (var2.field4107)).compareTo(var4.field4107) >= 0) {
				break;
			}

			this.field4121[var1] = var4;
			this.field4121[var1].field4108 = var1;
		}

		this.field4121[var1] = var2;
		this.field4121[var1].field4108 = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-2077762464")

	void method6351(int var1) {
		class340 var2 = this.field4121[var1];

		int var8;
		for (int var3 = this.field4117 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class340 var5 = this.field4121[var4];
			int var6 = (var1 << 1) + 2;
			class340 var7 = this.field4121[var6];
			if (this.field4118 != null) {
				if ((var6 < this.field4117) && (this.field4118.compare(var5.field4107, var7.field4107) > 0)) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if ((var6 < this.field4117) && (((Comparable) (var5.field4107)).compareTo(var7.field4107) > 0)) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4118 != null) {
				if (this.field4118.compare(var2.field4107, this.field4121[var8].field4107) <= 0) {
					break;
				}
			} else if (((Comparable) (var2.field4107)).compareTo(this.field4121[var8].field4107) <= 0) {
				break;
			}

			this.field4121[var1] = this.field4121[var8];
			this.field4121[var1].field4108 = var1;
		}

		this.field4121[var1] = var2;
		this.field4121[var1].field4108 = var1;
	}

	public boolean remove(Object var1) {
		class340 var2 = ((class340) (this.field4116.remove(var1)));
		if (var2 == null) {
			return false;
		} else {
			++this.field4115;
			--this.field4117;
			if (var2.field4108 == this.field4117) {
				this.field4121[this.field4117] = null;
				return true;
			} else {
				class340 var3 = this.field4121[this.field4117];
				this.field4121[this.field4117] = null;
				this.field4121[var2.field4108] = var3;
				this.field4121[var2.field4108].field4108 = var2.field4108;
				this.method6351(var2.field4108);
				if (var3 == this.field4121[var2.field4108]) {
					this.method6365(var2.field4108);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4117 == 0 ? null : this.field4121[0].field4107;
	}

	public int size() {
		return this.field4117;
	}

	public boolean contains(Object var1) {
		return this.field4116.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4118 != null) {
			Arrays.sort(var1, this.field4118);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class341(this);
	}

	public Object poll() {
		if (this.field4117 == 0) {
			return null;
		} else {
			++this.field4115;
			Object var1 = this.field4121[0].field4107;
			this.field4116.remove(var1);
			--this.field4117;
			if (this.field4117 == 0) {
				this.field4121[this.field4117] = null;
			} else {
				this.field4121[0] = this.field4121[this.field4117];
				this.field4121[0].field4108 = 0;
				this.field4121[this.field4117] = null;
				this.method6351(0);
			}

			return var1;
		}
	}

	public boolean offer(Object var1) {
		if (this.field4116.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4115;
			int var2 = this.field4117;
			if (var2 >= this.field4121.length) {
				this.method6346();
			}

			++this.field4117;
			if (var2 == 0) {
				this.field4121[0] = new class340(var1, 0);
				this.field4116.put(var1, this.field4121[0]);
			} else {
				this.field4121[var2] = new class340(var1, var2);
				this.field4116.put(var1, this.field4121[var2]);
				this.method6365(var2);
			}

			return true;
		}
	}
}