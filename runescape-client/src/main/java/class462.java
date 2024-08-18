import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
public final class class462 {
	@ObfuscatedName("ab")
	final Comparator field4882;
	@ObfuscatedName("ay")
	final Map field4880;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	final class431 field4881;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	final class431 field4883;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = -6976931928973997899L
	)
	final long field4885;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrj;"
	)
	final class460 field4884;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2006117503
	)
	final int field4879;

	@ObfuscatedSignature(
		descriptor = "(JILrj;)V"
	)
	class462(long var1, int var3, class460 var4) {
		this.field4882 = new class461(this);
		this.field4885 = var1;
		this.field4879 = var3;
		this.field4884 = var4;
		if (this.field4879 == -1) {
			this.field4880 = new HashMap(64);
			this.field4881 = new class431(64, this.field4882);
			this.field4883 = null;
		} else {
			if (this.field4884 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4880 = new HashMap(this.field4879);
			this.field4881 = new class431(this.field4879, this.field4882);
			this.field4883 = new class431(this.field4879);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILrj;)V"
	)
	public class462(int var1, class460 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "303832590"
	)
	boolean method8497() {
		return this.field4879 != -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;S)Ljava/lang/Object;",
		garbageValue = "25885"
	)
	public Object method8501(Object var1) {
		synchronized(this) {
			if (this.field4885 != -1L) {
				this.method8507();
			}

			class463 var3 = (class463)this.field4880.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method8500(var3, false);
				return var3.field4889;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1103185635"
	)
	public Object method8499(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4885 != -1L) {
				this.method8507();
			}

			class463 var4 = (class463)this.field4880.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4889;
				var4.field4889 = var2;
				this.method8500(var4, false);
				return var8;
			} else {
				class463 var5;
				if (this.method8497() && this.field4880.size() == this.field4879) {
					var5 = (class463)this.field4883.remove();
					this.field4880.remove(var5.field4887);
					this.field4881.remove(var5);
				}

				var5 = new class463(var2, var1);
				this.field4880.put(var1, var5);
				this.method8500(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lrc;ZB)V",
		garbageValue = "-63"
	)
	void method8500(class463 var1, boolean var2) {
		if (!var2) {
			this.field4881.remove(var1);
			if (this.method8497() && !this.field4883.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4888 = System.currentTimeMillis();
		if (this.method8497()) {
			switch(this.field4884.field4877) {
			case 0:
				var1.field4886 = var1.field4888;
				break;
			case 1:
				++var1.field4886;
			}

			this.field4883.add(var1);
		}

		this.field4881.add(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1246962267"
	)
	void method8507() {
		if (this.field4885 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4885;

			while (!this.field4881.isEmpty()) {
				class463 var3 = (class463)this.field4881.peek();
				if (var3.field4888 >= var1) {
					return;
				}

				this.field4880.remove(var3.field4887);
				this.field4881.remove(var3);
				if (this.method8497()) {
					this.field4883.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "11812"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4880.clear();
			this.field4881.clear();
			if (this.method8497()) {
				this.field4883.clear();
			}

		}
	}
}
