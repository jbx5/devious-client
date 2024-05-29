import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ry")
public final class class460 {
	@ObfuscatedName("ak")
	final Comparator field4887;
	@ObfuscatedName("al")
	final Map field4883;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	final class429 field4884;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	final class429 field4885;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -1528853799806805115L
	)
	final long field4886;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	final class458 field4882;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1362734891
	)
	final int field4888;

	@ObfuscatedSignature(
		descriptor = "(JILrq;)V"
	)
	class460(long var1, int var3, class458 var4) {
		this.field4887 = new class459(this);
		this.field4886 = var1;
		this.field4888 = var3;
		this.field4882 = var4;
		if (this.field4888 == -1) {
			this.field4883 = new HashMap(64);
			this.field4884 = new class429(64, this.field4887);
			this.field4885 = null;
		} else {
			if (this.field4882 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4883 = new HashMap(this.field4888);
			this.field4884 = new class429(this.field4888, this.field4887);
			this.field4885 = new class429(this.field4888);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILrq;)V"
	)
	public class460(int var1, class458 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1131190794"
	)
	boolean method8482() {
		return this.field4888 != -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "2102811629"
	)
	public Object method8483(Object var1) {
		synchronized(this) {
			if (this.field4886 != -1L) {
				this.method8486();
			}

			class461 var3 = (class461)this.field4883.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method8496(var3, false);
				return var3.field4892;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1975381843"
	)
	public Object method8488(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field4886) {
				this.method8486();
			}

			class461 var4 = (class461)this.field4883.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4892;
				var4.field4892 = var2;
				this.method8496(var4, false);
				return var8;
			} else {
				class461 var5;
				if (this.method8482() && this.field4883.size() == this.field4888) {
					var5 = (class461)this.field4885.remove();
					this.field4883.remove(var5.field4890);
					this.field4884.remove(var5);
				}

				var5 = new class461(var2, var1);
				this.field4883.put(var1, var5);
				this.method8496(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lrp;ZI)V",
		garbageValue = "247097984"
	)
	void method8496(class461 var1, boolean var2) {
		if (!var2) {
			this.field4884.remove(var1);
			if (this.method8482() && !this.field4885.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4891 = System.currentTimeMillis();
		if (this.method8482()) {
			switch(this.field4882.field4875) {
			case 0:
				++var1.field4889;
				break;
			case 1:
				var1.field4889 = var1.field4891;
			}

			this.field4885.add(var1);
		}

		this.field4884.add(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1011180311"
	)
	void method8486() {
		if (-1L == this.field4886) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4886;

			while (!this.field4884.isEmpty()) {
				class461 var3 = (class461)this.field4884.peek();
				if (var3.field4891 >= var1) {
					return;
				}

				this.field4883.remove(var3.field4890);
				this.field4884.remove(var3);
				if (this.method8482()) {
					this.field4885.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4883.clear();
			this.field4884.clear();
			if (this.method8482()) {
				this.field4885.clear();
			}

		}
	}
}
