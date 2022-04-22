import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mn")
public class class342 extends AbstractQueue {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"[Lmk;")

	class340[] field4104;
	@ObfuscatedName("c")
	Map field4105;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-609081385)

	int field4106;
	@ObfuscatedName("f")
	final Comparator field4107;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	-1292007073)

	int field4108;

	public class342(int var1, Comparator var2) {
		this.field4108 = 0;
		this.field4104 = new class340[var1];
		this.field4105 = new HashMap();
		this.field4107 = var2;
	}

	public class342(int var1) {
		this(var1, ((Comparator) (null)));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1379999236")

	void method6297() {
		int var1 = (this.field4104.length << 1) + 1;
		this.field4104 = ((class340[]) ((class340[]) (Arrays.copyOf(this.field4104, var1))));
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-54903220")

	void method6285(int var1) {
		class340 var2;
		int var3;
		for (var2 = this.field4104[var1]; var1 > 0; var1 = var3) {
			var3 = (var1 - 1) >>> 1;
			class340 var4 = this.field4104[var3];
			if (this.field4107 != null) {
				if (this.field4107.compare(var2.field4096, var4.field4096) >= 0) {
					break;
				}
			} else if (((Comparable) (var2.field4096)).compareTo(var4.field4096) >= 0) {
				break;
			}

			this.field4104[var1] = var4;
			this.field4104[var1].field4095 = var1;
		}

		this.field4104[var1] = var2;
		this.field4104[var1].field4095 = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"45")

	void method6309(int var1) {
		class340 var2 = this.field4104[var1];

		int var8;
		for (int var3 = this.field4106 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class340 var5 = this.field4104[var4];
			int var6 = (var1 << 1) + 2;
			class340 var7 = this.field4104[var6];
			if (this.field4107 != null) {
				if ((var6 < this.field4106) && (this.field4107.compare(var5.field4096, var7.field4096) > 0)) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if ((var6 < this.field4106) && (((Comparable) (var5.field4096)).compareTo(var7.field4096) > 0)) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4107 != null) {
				if (this.field4107.compare(var2.field4096, this.field4104[var8].field4096) <= 0) {
					break;
				}
			} else if (((Comparable) (var2.field4096)).compareTo(this.field4104[var8].field4096) <= 0) {
				break;
			}

			this.field4104[var1] = this.field4104[var8];
			this.field4104[var1].field4095 = var1;
		}

		this.field4104[var1] = var2;
		this.field4104[var1].field4095 = var1;
	}

	public boolean remove(Object var1) {
		class340 var2 = ((class340) (this.field4105.remove(var1)));
		if (var2 == null) {
			return false;
		} else {
			++this.field4108;
			--this.field4106;
			if (var2.field4095 == this.field4106) {
				this.field4104[this.field4106] = null;
				return true;
			} else {
				class340 var3 = this.field4104[this.field4106];
				this.field4104[this.field4106] = null;
				this.field4104[var2.field4095] = var3;
				this.field4104[var2.field4095].field4095 = var2.field4095;
				this.method6309(var2.field4095);
				if (var3 == this.field4104[var2.field4095]) {
					this.method6285(var2.field4095);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4106 == 0 ? null : this.field4104[0].field4096;
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4107 != null) {
			Arrays.sort(var1, this.field4107);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Object poll() {
		if (this.field4106 == 0) {
			return null;
		} else {
			++this.field4108;
			Object var1 = this.field4104[0].field4096;
			this.field4105.remove(var1);
			--this.field4106;
			if (this.field4106 == 0) {
				this.field4104[this.field4106] = null;
			} else {
				this.field4104[0] = this.field4104[this.field4106];
				this.field4104[0].field4095 = 0;
				this.field4104[this.field4106] = null;
				this.method6309(0);
			}

			return var1;
		}
	}

	public int size() {
		return this.field4106;
	}

	public Iterator iterator() {
		return new class341(this);
	}

	public boolean offer(Object var1) {
		if (this.field4105.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4108;
			int var2 = this.field4106;
			if (var2 >= this.field4104.length) {
				this.method6297();
			}

			++this.field4106;
			if (var2 == 0) {
				this.field4104[0] = new class340(var1, 0);
				this.field4105.put(var1, this.field4104[0]);
			} else {
				this.field4104[var2] = new class340(var1, var2);
				this.field4105.put(var1, this.field4104[var2]);
				this.method6285(var2);
			}

			return true;
		}
	}

	public boolean contains(Object var1) {
		return this.field4105.containsKey(var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(II)Ldo;", garbageValue = 
	"901392143")

	static class122 method6314(int var0) {
		class122 var1 = ((class122) (SequenceDefinition.SequenceDefinition_cachedModel.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			AbstractArchive var3 = SequenceDefinition.SequenceDefinition_animationsArchive;
			AbstractArchive var4 = SequenceDefinition.SequenceDefinition_skeletonsArchive;
			boolean var5 = true;
			byte[] var6 = var3.takeFile((var0 >> 16) & 65535, var0 & 65535);
			class122 var2;
			if (var6 == null) {
				var5 = false;
				var2 = null;
			} else {
				int var7 = ((var6[1] & 255) << 8) | (var6[2] & 255);
				byte[] var8 = var4.getFile(var7, 0);
				if (var8 == null) {
					var5 = false;
				}

				if (!var5) {
					var2 = null;
				} else {
					try {
						var2 = new class122(var3, var4, var0, false);
					} catch (Exception var10) {
						var2 = null;
					}
				}
			}

			if (var2 != null) {
				SequenceDefinition.SequenceDefinition_cachedModel.put(var2, ((long) (var0)));
			}

			return var2;
		}
	}
}