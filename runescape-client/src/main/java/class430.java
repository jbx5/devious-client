import java.awt.Component;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
public class class430 extends AbstractQueue {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lqn;"
	)
	class428[] field4735;
	@ObfuscatedName("ad")
	Map field4736;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1209740451
	)
	int field4737;
	@ObfuscatedName("ak")
	final Comparator field4738;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -628628359
	)
	int field4739;

	public class430(int var1, Comparator var2) {
		this.field4739 = 0;
		this.field4735 = new class428[var1];
		this.field4736 = new HashMap();
		this.field4738 = var2;
	}

	public class430(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-992745058"
	)
	void method7887() {
		int var1 = (this.field4735.length << 1) + 1;
		this.field4735 = (class428[])((class428[])Arrays.copyOf(this.field4735, var1));
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "115"
	)
	void method7890(int var1) {
		class428 var2;
		int var3;
		for (var2 = this.field4735[var1]; var1 > 0; var1 = var3) {
			var3 = var1 - 1 >>> 1;
			class428 var4 = this.field4735[var3];
			if (this.field4738 != null) {
				if (this.field4738.compare(var2.field4730, var4.field4730) >= 0) {
					break;
				}
			} else if (((Comparable)var2.field4730).compareTo(var4.field4730) >= 0) {
				break;
			}

			this.field4735[var1] = var4;
			this.field4735[var1].field4727 = var1;
		}

		this.field4735[var1] = var2;
		this.field4735[var1].field4727 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-10"
	)
	void method7891(int var1) {
		class428 var2 = this.field4735[var1];

		int var8;
		for (int var3 = this.field4737 >>> 1; var1 < var3; var1 = var8) {
			int var4 = (var1 << 1) + 1;
			class428 var5 = this.field4735[var4];
			int var6 = (var1 << 1) + 2;
			class428 var7 = this.field4735[var6];
			if (this.field4738 != null) {
				if (var6 < this.field4737 && this.field4738.compare(var5.field4730, var7.field4730) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field4737 && ((Comparable)var5.field4730).compareTo(var7.field4730) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}

			if (this.field4738 != null) {
				if (this.field4738.compare(var2.field4730, this.field4735[var8].field4730) <= 0) {
					break;
				}
			} else if (((Comparable)var2.field4730).compareTo(this.field4735[var8].field4730) <= 0) {
				break;
			}

			this.field4735[var1] = this.field4735[var8];
			this.field4735[var1].field4727 = var1;
		}

		this.field4735[var1] = var2;
		this.field4735[var1].field4727 = var1;
	}

	public boolean remove(Object var1) {
		class428 var2 = (class428)this.field4736.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4739;
			--this.field4737;
			if (this.field4737 == var2.field4727) {
				this.field4735[this.field4737] = null;
				return true;
			} else {
				class428 var3 = this.field4735[this.field4737];
				this.field4735[this.field4737] = null;
				this.field4735[var2.field4727] = var3;
				this.field4735[var2.field4727].field4727 = var2.field4727;
				this.method7891(var2.field4727);
				if (var3 == this.field4735[var2.field4727]) {
					this.method7890(var2.field4727);
				}

				return true;
			}
		}
	}

	public Object peek() {
		return this.field4737 == 0 ? null : this.field4735[0].field4730;
	}

	public boolean contains(Object var1) {
		return this.field4736.containsKey(var1);
	}

	public boolean offer(Object var1) {
		if (this.field4736.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4739;
			int var2 = this.field4737;
			if (var2 >= this.field4735.length) {
				this.method7887();
			}

			++this.field4737;
			if (var2 == 0) {
				this.field4735[0] = new class428(var1, 0);
				this.field4736.put(var1, this.field4735[0]);
			} else {
				this.field4735[var2] = new class428(var1, var2);
				this.field4736.put(var1, this.field4735[var2]);
				this.method7890(var2);
			}

			return true;
		}
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4738 != null) {
			Arrays.sort(var1, this.field4738);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class429(this);
	}

	public Object poll() {
		if (this.field4737 == 0) {
			return null;
		} else {
			++this.field4739;
			Object var1 = this.field4735[0].field4730;
			this.field4736.remove(var1);
			--this.field4737;
			if (this.field4737 == 0) {
				this.field4735[this.field4737] = null;
			} else {
				this.field4735[0] = this.field4735[this.field4737];
				this.field4735[0].field4727 = 0;
				this.field4735[this.field4737] = null;
				this.method7891(0);
			}

			return var1;
		}
	}

	public int size() {
		return this.field4737;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;I)V",
		garbageValue = "2036764897"
	)
	static void method7909(Component var0) {
		var0.addMouseListener(MouseHandler.MouseHandler_instance);
		var0.addMouseMotionListener(MouseHandler.MouseHandler_instance);
		var0.addFocusListener(MouseHandler.MouseHandler_instance);
	}
}
