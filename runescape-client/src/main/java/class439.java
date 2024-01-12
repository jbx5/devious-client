import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qj")
public final class class439 {
	@ObfuscatedName("ut")
	@ObfuscatedGetter(
		intValue = -1723638141
	)
	static int field4690;
	@ObfuscatedName("am")
	final Comparator field4686;
	@ObfuscatedName("ap")
	final Map field4683;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	final class408 field4687;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	final class408 field4689;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 3213162539382768437L
	)
	final long field4684;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	final class437 field4685;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1679721967
	)
	final int field4688;

	@ObfuscatedSignature(
		descriptor = "(JILqu;)V"
	)
	class439(long var1, int var3, class437 var4) {
		this.field4686 = new class438(this);
		this.field4684 = var1;
		this.field4688 = var3;
		this.field4685 = var4;
		if (this.field4688 == -1) {
			this.field4683 = new HashMap(64);
			this.field4687 = new class408(64, this.field4686);
			this.field4689 = null;
		} else {
			if (this.field4685 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4683 = new HashMap(this.field4688);
			this.field4687 = new class408(this.field4688, this.field4686);
			this.field4689 = new class408(this.field4688);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILqu;)V"
	)
	public class439(int var1, class437 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "241187348"
	)
	boolean method8144() {
		return this.field4688 != -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "-37"
	)
	public Object method8139(Object var1) {
		synchronized(this) {
			if (this.field4684 != -1L) {
				this.method8142();
			}

			class440 var3 = (class440)this.field4683.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method8141(var3, false);
				return var3.field4693;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "-959045434"
	)
	public Object method8146(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field4684) {
				this.method8142();
			}

			class440 var4 = (class440)this.field4683.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4693;
				var4.field4693 = var2;
				this.method8141(var4, false);
				return var8;
			} else {
				class440 var5;
				if (this.method8144() && this.field4683.size() == this.field4688) {
					var5 = (class440)this.field4689.remove();
					this.field4683.remove(var5.field4692);
					this.field4687.remove(var5);
				}

				var5 = new class440(var2, var1);
				this.field4683.put(var1, var5);
				this.method8141(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lqm;ZB)V",
		garbageValue = "-85"
	)
	void method8141(class440 var1, boolean var2) {
		if (!var2) {
			this.field4687.remove(var1);
			if (this.method8144() && !this.field4689.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4694 = System.currentTimeMillis();
		if (this.method8144()) {
			switch(this.field4685.field4679) {
			case 0:
				++var1.field4691;
				break;
			case 1:
				var1.field4691 = var1.field4694;
			}

			this.field4689.add(var1);
		}

		this.field4687.add(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2039841049"
	)
	void method8142() {
		if (this.field4684 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4684;

			while (!this.field4687.isEmpty()) {
				class440 var3 = (class440)this.field4687.peek();
				if (var3.field4694 >= var1) {
					return;
				}

				this.field4683.remove(var3.field4692);
				this.field4687.remove(var3);
				if (this.method8144()) {
					this.field4689.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-588866192"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4683.clear();
			this.field4687.clear();
			if (this.method8144()) {
				this.field4689.clear();
			}

		}
	}
}
