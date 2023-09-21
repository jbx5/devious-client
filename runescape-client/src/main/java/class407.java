import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class407 extends AbstractQueue {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lpd;"
	)
	class405[] field4502;
	@ObfuscatedName("al")
	Map field4499;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1212922095
	)
	int field4500;
	@ObfuscatedName("ax")
	final Comparator field4501;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1972894601
	)
	int field4498;

	public class407(int var1, Comparator var2) {
		this.field4498 = 0;
		this.field4502 = new class405[var1];
		this.field4499 = new HashMap();
		this.field4501 = var2;
	}

	public class407(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "677116728"
	)
	void method7425() {
		int var1 = (this.field4502.length << 1) + 1;
		this.field4502 = (class405[])((class405[])Arrays.copyOf(this.field4502, var1));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "733556183"
	)
	void method7454(int var1) {
		class405 var2;
		int var3;
		for (var2 = this.field4502[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class405 var4 = this.field4502[var3];
			if (this.field4501 != null) {
				if (this.field4501.compare(var2.field4493, var4.field4493) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4493).compareTo(var4.field4493) >= 0) {
				break;
			}

			this.field4502[var1] = var4;
			this.field4502[var1].field4494 = var1;
		}

		this.field4502[var1] = var2;
		this.field4502[var1].field4494 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1866393303"
	)
	void method7430(int var1) {
		class405 var2 = this.field4502[var1];

		int var8;
		for (int var3 = this.field4500 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class405 var5 = this.field4502[var4];
			int var6 = (var1 << 1) + 2;
			class405 var7 = this.field4502[var6];
			if (this.field4501 != null) {
				if (var6 < this.field4500 && this.field4501.compare(var5.field4493, var7.field4493) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4500 && ((Comparable)var5.field4493).compareTo(var7.field4493) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4501 != null) {
				if (this.field4501.compare(var2.field4493, this.field4502[var8].field4493) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4493).compareTo(this.field4502[var8].field4493) <= 0) {
				break;
			}

			this.field4502[var1] = this.field4502[var8];
			this.field4502[var1].field4494 = var1;
		}

		this.field4502[var1] = var2;
		this.field4502[var1].field4494 = var1;
	}

	public boolean remove(Object var1) {
		class405 var2 = (class405)this.field4499.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4498;
			--this.field4500;
			if (this.field4500 == var2.field4494) {
				this.field4502[this.field4500] = null;
				return true;
			} else {
				class405 var3 = this.field4502[this.field4500];
				this.field4502[this.field4500] = null;
				this.field4502[var2.field4494] = var3;
				this.field4502[var2.field4494].field4494 = var2.field4494;
				this.method7430(var2.field4494);
				if (var3 == this.field4502[var2.field4494]) {
					this.method7454(var2.field4494);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4500 == 0 ? null : this.field4502[0].field4493;
	}

	public int size() {
		return this.field4500;
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4501 != null) {
			Arrays.sort(var1, this.field4501);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class406(this);
	}

	public boolean contains(Object var1) {
		return this.field4499.containsKey(var1);
	}

	public Object poll() {
		if (this.field4500 == 0) {
			return null;
		} else {
			++this.field4498;
			Object var1 = this.field4502[0].field4493;
			this.field4499.remove(var1);
			--this.field4500;
			if (this.field4500 == 0) {
				this.field4502[this.field4500] = null;
			} else {
				this.field4502[0] = this.field4502[this.field4500];
				this.field4502[0].field4494 = 0;
				this.field4502[this.field4500] = null;
				this.method7430(0);
			}

			return var1;
		}
	}

	public boolean offer(Object var1) {
		if (this.field4499.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4498;
			int var2 = this.field4500;
			if (var2 >= this.field4502.length) {
				this.method7425();
			}

			++this.field4500;
			if (var2 == 0) {
				this.field4502[0] = new class405(var1, 0);
				this.field4499.put(var1, this.field4502[0]);
			} else {
				this.field4502[var2] = new class405(var1, var2);
				this.field4499.put(var1, this.field4502[var2]);
				this.method7454(var2);
			}

			return true;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-105"
	)
	public static void method7453() {
		class326.SpriteBuffer_xOffsets = null;
		ModelData0.SpriteBuffer_yOffsets = null;
		class59.SpriteBuffer_spriteWidths = null;
		class544.SpriteBuffer_spriteHeights = null;
		class372.SpriteBuffer_spritePalette = null;
		AddRequestTask.SpriteBuffer_pixels = null;
	}
}
