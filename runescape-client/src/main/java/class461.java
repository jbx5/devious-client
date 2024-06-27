import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
public final class class461 {
	@ObfuscatedName("aq")
	final Comparator field4903;
	@ObfuscatedName("ad")
	final Map field4900;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	final class430 field4901;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqq;"
	)
	final class430 field4902;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -5794576060614590681L
	)
	final long field4899;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	final class459 field4904;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2114201521
	)
	final int field4905;

	@ObfuscatedSignature(
		descriptor = "(JILrd;)V"
	)
	class461(long var1, int var3, class459 var4) {
		this.field4903 = new class460(this);
		this.field4899 = var1;
		this.field4905 = var3;
		this.field4904 = var4;
		if (this.field4905 == -1) {
			this.field4900 = new HashMap(64);
			this.field4901 = new class430(64, this.field4903);
			this.field4902 = null;
		} else {
			if (this.field4904 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4900 = new HashMap(this.field4905);
			this.field4901 = new class430(this.field4905, this.field4903);
			this.field4902 = new class430(this.field4905);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILrd;)V"
	)
	public class461(int var1, class459 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "794985736"
	)
	boolean method8429() {
		return this.field4905 != -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "6"
	)
	public Object method8418(Object var1) {
		synchronized(this) {
			if (this.field4899 != -1L) {
				this.method8433();
			}

			class462 var3 = (class462)this.field4900.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method8420(var3, false);
				return var3.field4910;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "1"
	)
	public Object method8419(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field4899) {
				this.method8433();
			}

			class462 var4 = (class462)this.field4900.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4910;
				var4.field4910 = var2;
				this.method8420(var4, false);
				return var8;
			} else {
				class462 var5;
				if (this.method8429() && this.field4900.size() == this.field4905) {
					var5 = (class462)this.field4902.remove();
					this.field4900.remove(var5.field4908);
					this.field4901.remove(var5);
				}

				var5 = new class462(var2, var1);
				this.field4900.put(var1, var5);
				this.method8420(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lre;ZI)V",
		garbageValue = "-724193621"
	)
	void method8420(class462 var1, boolean var2) {
		if (!var2) {
			this.field4901.remove(var1);
			if (this.method8429() && !this.field4902.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4907 = System.currentTimeMillis();
		if (this.method8429()) {
			switch(this.field4904.field4896) {
			case 0:
				var1.field4909 = var1.field4907;
				break;
			case 1:
				++var1.field4909;
			}

			this.field4902.add(var1);
		}

		this.field4901.add(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method8433() {
		if (-1L == this.field4899) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4899;

			while (!this.field4901.isEmpty()) {
				class462 var3 = (class462)this.field4901.peek();
				if (var3.field4907 >= var1) {
					return;
				}

				this.field4900.remove(var3.field4908);
				this.field4901.remove(var3);
				if (this.method8429()) {
					this.field4902.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-44"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4900.clear();
			this.field4901.clear();
			if (this.method8429()) {
				this.field4902.clear();
			}

		}
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-1950621406"
	)
	static int method8438(int var0, Script var1, boolean var2) {
		return 2;
	}
}
