import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
import java.util.AbstractQueue;
import java.util.Map;
import java.util.Arrays;
import java.util.Comparator;
@ObfuscatedName("mo")
public class class347 extends AbstractQueue {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "[Lmn;")
	class345[] field4166;

	@ObfuscatedName("v")
	Map field4167;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1349227939)
	int field4165;

	@ObfuscatedName("f")
	final Comparator field4168;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 500600827)
	int field4169;

	public class347(int var1, Comparator var2) {
		this.field4169 = 0;
		this.field4166 = new class345[var1];
		this.field4167 = new HashMap();
		this.field4168 = var2;
	}

	public class347(int var1) {
		this(var1, ((Comparator) (null)));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "111")
	void method6341() {
		int var1 = (this.field4166.length << 1) + 1;
		this.field4166 = ((class345[]) ((class345[]) (Arrays.copyOf(this.field4166, var1))));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1035999073")
	void method6342(int var1) {
		class345 var2;
		int var3;
		for (var2 = this.field4166[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class345 var4 = this.field4166[var3];
			if (this.field4168 != null) {
				if (this.field4168.compare(var2.field4159, var4.field4159) >= 0) {
					break;
				}
			} else if (((Comparable) (var2.field4159)).compareTo(var4.field4159) >= 0) {
				break;
			}
			this.field4166[var1] = var4;
			this.field4166[var1].field4158 = var1;
		}
		this.field4166[var1] = var2;
		this.field4166[var1].field4158 = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1952216372")
	void method6354(int var1) {
		class345 var2 = this.field4166[var1];
		int var8;
		for (int var3 = this.field4165 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class345 var5 = this.field4166[var4];
			int var6 = (var1 << 1) + 2;
			class345 var7 = this.field4166[var6];
			if (this.field4168 != null) {
				if (var6 < this.field4165 && this.field4168.compare(var5.field4159, var7.field4159) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4165 && ((Comparable) (var5.field4159)).compareTo(var7.field4159) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}
			if (this.field4168 != null) {
				if (this.field4168.compare(var2.field4159, this.field4166[var8].field4159) <= 0) {
					break;
				}
			} else if (((Comparable) (var2.field4159)).compareTo(this.field4166[var8].field4159) <= 0) {
				break;
			}
			this.field4166[var1] = this.field4166[var8];
			this.field4166[var1].field4158 = var1;
		}
		this.field4166[var1] = var2;
		this.field4166[var1].field4158 = var1;
	}

	public boolean remove(Object var1) {
		class345 var2 = ((class345) (this.field4167.remove(var1)));
		if (var2 == null) {
			return false;
		} else {
			++this.field4169;
			--this.field4165;
			if (var2.field4158 == this.field4165) {
				this.field4166[this.field4165] = null;
				return true;
			} else {
				class345 var3 = this.field4166[this.field4165];
				this.field4166[this.field4165] = null;
				this.field4166[var2.field4158] = var3;
				this.field4166[var2.field4158].field4158 = var2.field4158;
				this.method6354(var2.field4158);
				if (var3 == this.field4166[var2.field4158]) {
					this.method6342(var2.field4158);
				}
				return true;
			}
		}
	}

	public Object peek() {
		return this.field4165 == 0 ? null : this.field4166[0].field4159;
	}

	public int size() {
		return this.field4165;
	}

	public boolean offer(Object var1) {
		if (this.field4167.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4169;
			int var2 = this.field4165;
			if (var2 >= this.field4166.length) {
				this.method6341();
			}
			++this.field4165;
			if (var2 == 0) {
				this.field4166[0] = new class345(var1, 0);
				this.field4167.put(var1, this.field4166[0]);
			} else {
				this.field4166[var2] = new class345(var1, var2);
				this.field4167.put(var1, this.field4166[var2]);
				this.method6342(var2);
			}
			return true;
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4168 != null) {
			Arrays.sort(var1, this.field4168);
		} else {
			Arrays.sort(var1);
		}
		return var1;
	}

	public Object poll() {
		if (this.field4165 == 0) {
			return null;
		} else {
			++this.field4169;
			Object var1 = this.field4166[0].field4159;
			this.field4167.remove(var1);
			--this.field4165;
			if (this.field4165 == 0) {
				this.field4166[this.field4165] = null;
			} else {
				this.field4166[0] = this.field4166[this.field4165];
				this.field4166[0].field4158 = 0;
				this.field4166[this.field4165] = null;
				this.method6354(0);
			}
			return var1;
		}
	}

	public boolean contains(Object var1) {
		return this.field4167.containsKey(var1);
	}

	public Iterator iterator() {
		return new class346(this);
	}
}