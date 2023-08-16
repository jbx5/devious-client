import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public final class class423 {
	@ObfuscatedName("au")
	final Comparator field4619;
	@ObfuscatedName("ae")
	final Map field4613;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	final class392 field4614;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	final class392 field4615;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 1657733685024468239L
	)
	final long field4616;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	final class421 field4617;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -139737171
	)
	final int field4618;

	@ObfuscatedSignature(
		descriptor = "(JILqm;)V"
	)
	class423(long var1, int var3, class421 var4) {
		this.field4619 = new class422(this);
		this.field4616 = var1;
		this.field4618 = var3;
		this.field4617 = var4;
		if (this.field4618 == -1) {
			this.field4613 = new HashMap(64);
			this.field4614 = new class392(64, this.field4619);
			this.field4615 = null;
		} else {
			if (this.field4617 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4613 = new HashMap(this.field4618);
			this.field4614 = new class392(this.field4618, this.field4619);
			this.field4615 = new class392(this.field4618);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILqm;)V"
	)
	public class423(int var1, class421 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1594986015"
	)
	boolean method7780() {
		return this.field4618 != -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "-31"
	)
	public Object method7781(Object var1) {
		synchronized(this) {
			if (this.field4616 != -1L) {
				this.method7783();
			}

			class424 var3 = (class424)this.field4613.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method7784(var3, false);
				return var3.field4620;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-396691149"
	)
	public Object method7782(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4616 != -1L) {
				this.method7783();
			}

			class424 var4 = (class424)this.field4613.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4620;
				var4.field4620 = var2;
				this.method7784(var4, false);
				return var8;
			} else {
				class424 var5;
				if (this.method7780() && this.field4613.size() == this.field4618) {
					var5 = (class424)this.field4615.remove();
					this.field4613.remove(var5.field4621);
					this.field4614.remove(var5);
				}

				var5 = new class424(var2, var1);
				this.field4613.put(var1, var5);
				this.method7784(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqj;ZB)V",
		garbageValue = "16"
	)
	void method7784(class424 var1, boolean var2) {
		if (!var2) {
			this.field4614.remove(var1);
			if (this.method7780() && !this.field4615.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4622 = System.currentTimeMillis();
		if (this.method7780()) {
			switch(this.field4617.field4607) {
			case 0:
				var1.field4623 = var1.field4622;
				break;
			case 1:
				++var1.field4623;
			}

			this.field4615.add(var1);
		}

		this.field4614.add(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1791287945"
	)
	void method7783() {
		if (this.field4616 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4616;

			while (!this.field4614.isEmpty()) {
				class424 var3 = (class424)this.field4614.peek();
				if (var3.field4622 >= var1) {
					return;
				}

				this.field4613.remove(var3.field4621);
				this.field4614.remove(var3);
				if (this.method7780()) {
					this.field4615.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	public void method7779() {
		synchronized(this) {
			this.field4613.clear();
			this.field4614.clear();
			if (this.method7780()) {
				this.field4615.clear();
			}

		}
	}
}
