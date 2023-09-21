import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public final class class438 {
	@ObfuscatedName("ac")
	final Comparator field4655;
	@ObfuscatedName("al")
	final Map field4656;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	final class407 field4657;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	final class407 field4658;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = -532511501764566889L
	)
	final long field4659;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqs;"
	)
	final class436 field4662;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 893487917
	)
	final int field4660;

	@ObfuscatedSignature(
		descriptor = "(JILqs;)V"
	)
	class438(long var1, int var3, class436 var4) {
		this.field4655 = new class437(this);
		this.field4659 = var1;
		this.field4660 = var3;
		this.field4662 = var4;
		if (this.field4660 == -1) {
			this.field4656 = new HashMap(64);
			this.field4657 = new class407(64, this.field4655);
			this.field4658 = null;
		} else {
			if (this.field4662 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4656 = new HashMap(this.field4660);
			this.field4657 = new class407(this.field4660, this.field4655);
			this.field4658 = new class407(this.field4660);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILqs;)V"
	)
	public class438(int var1, class436 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "111"
	)
	boolean method7927() {
		return this.field4660 != -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1480842854"
	)
	public Object method7937(Object var1) {
		synchronized(this) {
			if (this.field4659 != -1L) {
				this.method7930();
			}

			class439 var3 = (class439)this.field4656.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method7941(var3, false);
				return var3.field4666;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-496116903"
	)
	public Object method7928(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4659 != -1L) {
				this.method7930();
			}

			class439 var4 = (class439)this.field4656.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4666;
				var4.field4666 = var2;
				this.method7941(var4, false);
				return var8;
			} else {
				class439 var5;
				if (this.method7927() && this.field4656.size() == this.field4660) {
					var5 = (class439)this.field4658.remove();
					this.field4656.remove(var5.field4664);
					this.field4657.remove(var5);
				}

				var5 = new class439(var2, var1);
				this.field4656.put(var1, var5);
				this.method7941(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqd;ZI)V",
		garbageValue = "396560222"
	)
	void method7941(class439 var1, boolean var2) {
		if (!var2) {
			this.field4657.remove(var1);
			if (this.method7927() && !this.field4658.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4665 = System.currentTimeMillis();
		if (this.method7927()) {
			switch(this.field4662.field4650) {
			case 0:
				++var1.field4663;
				break;
			case 1:
				var1.field4663 = var1.field4665;
			}

			this.field4658.add(var1);
		}

		this.field4657.add(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	void method7930() {
		long var1 = System.currentTimeMillis() - this.field4659;

		while (!this.field4657.isEmpty()) {
			class439 var3 = (class439)this.field4657.peek();
			if (var3.field4665 >= var1) {
				return;
			}

			this.field4656.remove(var3.field4664);
			this.field4657.remove(var3);
			if (this.method7927()) {
				this.field4658.remove(var3);
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4656.clear();
			this.field4657.clear();
			if (this.method7927()) {
				this.field4658.clear();
			}

		}
	}
}
