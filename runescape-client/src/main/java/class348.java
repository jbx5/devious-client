import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
import java.util.AbstractQueue;
import java.util.Map;
import java.util.Arrays;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("mh")
public class class348 extends AbstractQueue {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "[Lmg;")
	class346[] field4191;

	@ObfuscatedName("q")
	Map field4192;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 567101989)
	int field4193;

	@ObfuscatedName("u")
	final Comparator field4195;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1721325885)
	int field4194;

	public class348(int var1, Comparator var2) {
		this.field4194 = 0;
		this.field4191 = new class346[var1];
		this.field4192 = new HashMap();
		this.field4195 = var2;
	}

	public class348(int var1) {
		this(var1, ((Comparator) (null)));
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "123472587")
	void method6372() {
		int var1 = (this.field4191.length << 1) + 1;
		this.field4191 = ((class346[]) ((class346[]) (Arrays.copyOf(this.field4191, var1))));
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2118557604")
	void method6366(int var1) {
		class346 var2;
		int var3;
		for (var2 = this.field4191[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class346 var4 = this.field4191[var3];
			if (this.field4195 != null) {
				if (this.field4195.compare(var2.field4185, var4.field4185) >= 0) {
					break;
				}
			} else if (((Comparable) (var2.field4185)).compareTo(var4.field4185) >= 0) {
				break;
			}
			this.field4191[var1] = var4;
			this.field4191[var1].field4184 = var1;
		}
		this.field4191[var1] = var2;
		this.field4191[var1].field4184 = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-61")
	void method6367(int var1) {
		class346 var2 = this.field4191[var1];
		int var8;
		for (int var3 = this.field4193 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class346 var5 = this.field4191[var4];
			int var6 = (var1 << 1) + 2;
			class346 var7 = this.field4191[var6];
			if (this.field4195 != null) {
				if (var6 < this.field4193 && this.field4195.compare(var5.field4185, var7.field4185) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4193 && ((Comparable) (var5.field4185)).compareTo(var7.field4185) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}
			if (this.field4195 != null) {
				if (this.field4195.compare(var2.field4185, this.field4191[var8].field4185) <= 0) {
					break;
				}
			} else if (((Comparable) (var2.field4185)).compareTo(this.field4191[var8].field4185) <= 0) {
				break;
			}
			this.field4191[var1] = this.field4191[var8];
			this.field4191[var1].field4184 = var1;
		}
		this.field4191[var1] = var2;
		this.field4191[var1].field4184 = var1;
	}

	public boolean remove(Object var1) {
		class346 var2 = ((class346) (this.field4192.remove(var1)));
		if (var2 == null) {
			return false;
		} else {
			++this.field4194;
			--this.field4193;
			if (var2.field4184 == this.field4193) {
				this.field4191[this.field4193] = null;
				return true;
			} else {
				class346 var3 = this.field4191[this.field4193];
				this.field4191[this.field4193] = null;
				this.field4191[var2.field4184] = var3;
				this.field4191[var2.field4184].field4184 = var2.field4184;
				this.method6367(var2.field4184);
				if (var3 == this.field4191[var2.field4184]) {
					this.method6366(var2.field4184);
				}
				return true;
			}
		}
	}

	public Object peek() {
		return this.field4193 == 0 ? null : this.field4191[0].field4185;
	}

	public Object poll() {
		if (this.field4193 == 0) {
			return null;
		} else {
			++this.field4194;
			Object var1 = this.field4191[0].field4185;
			this.field4192.remove(var1);
			--this.field4193;
			if (this.field4193 == 0) {
				this.field4191[this.field4193] = null;
			} else {
				this.field4191[0] = this.field4191[this.field4193];
				this.field4191[0].field4184 = 0;
				this.field4191[this.field4193] = null;
				this.method6367(0);
			}
			return var1;
		}
	}

	public int size() {
		return this.field4193;
	}

	public boolean offer(Object var1) {
		if (this.field4192.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4194;
			int var2 = this.field4193;
			if (var2 >= this.field4191.length) {
				this.method6372();
			}
			++this.field4193;
			if (var2 == 0) {
				this.field4191[0] = new class346(var1, 0);
				this.field4192.put(var1, this.field4191[0]);
			} else {
				this.field4191[var2] = new class346(var1, var2);
				this.field4192.put(var1, this.field4191[var2]);
				this.method6366(var2);
			}
			return true;
		}
	}

	public Iterator iterator() {
		return new class347(this);
	}

	public boolean contains(Object var1) {
		return this.field4192.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4195 != null) {
			Arrays.sort(var1, this.field4195);
		} else {
			Arrays.sort(var1);
		}
		return var1;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "1891573413")
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);
		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}
		if (var1.length() > 9) {
			return " " + class82.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + class82.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class82.colorStartTag(16776960) + var1 + "</col>";
		}
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(descriptor = "(Lku;IIII)V", garbageValue = "-748933635")
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false);
		if (var4 != null) {
			if (Client.minimapState < 3) {
				class21.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
			}
		}
	}
}