import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qc")
public final class class435 {
	@ObfuscatedName("at")
	final Comparator field4654;
	@ObfuscatedName("ah")
	final Map field4652;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	final class404 field4650;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	final class404 field4651;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 1971165188004438133L
	)
	final long field4649;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqm;"
	)
	final class433 field4653;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1741422329
	)
	final int field4648;

	@ObfuscatedSignature(
		descriptor = "(JILqm;)V"
	)
	class435(long var1, int var3, class433 var4) {
		this.field4654 = new class434(this);
		this.field4649 = var1;
		this.field4648 = var3;
		this.field4653 = var4;
		if (this.field4648 == -1) {
			this.field4652 = new HashMap(64);
			this.field4650 = new class404(64, this.field4654);
			this.field4651 = null;
		} else {
			if (this.field4653 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4652 = new HashMap(this.field4648);
			this.field4650 = new class404(this.field4648, this.field4654);
			this.field4651 = new class404(this.field4648);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILqm;)V"
	)
	public class435(int var1, class433 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "2"
	)
	boolean method8019() {
		return this.field4648 != -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "122"
	)
	public Object method8022(Object var1) {
		synchronized(this) {
			if (-1L != this.field4649) {
				this.method8023();
			}

			class436 var3 = (class436)this.field4652.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method8031(var3, false);
				return var3.field4655;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "1227309321"
	)
	public Object method8037(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4649 != -1L) {
				this.method8023();
			}

			class436 var4 = (class436)this.field4652.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4655;
				var4.field4655 = var2;
				this.method8031(var4, false);
				return var8;
			} else {
				class436 var5;
				if (this.method8019() && this.field4652.size() == this.field4648) {
					var5 = (class436)this.field4651.remove();
					this.field4652.remove(var5.field4658);
					this.field4650.remove(var5);
				}

				var5 = new class436(var2, var1);
				this.field4652.put(var1, var5);
				this.method8031(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqe;ZB)V",
		garbageValue = "14"
	)
	void method8031(class436 var1, boolean var2) {
		if (!var2) {
			this.field4650.remove(var1);
			if (this.method8019() && !this.field4651.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4657 = System.currentTimeMillis();
		if (this.method8019()) {
			switch(this.field4653.field4643) {
			case 0:
				++var1.field4656;
				break;
			case 1:
				var1.field4656 = var1.field4657;
			}

			this.field4651.add(var1);
		}

		this.field4650.add(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-704318355"
	)
	void method8023() {
		if (this.field4649 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4649;

			while (!this.field4650.isEmpty()) {
				class436 var3 = (class436)this.field4650.peek();
				if (var3.field4657 >= var1) {
					return;
				}

				this.field4652.remove(var3.field4658);
				this.field4650.remove(var3);
				if (this.method8019()) {
					this.field4651.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-189414151"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4652.clear();
			this.field4650.clear();
			if (this.method8019()) {
				this.field4651.clear();
			}

		}
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	static final void method8025() {
		if (Client.field601 != ItemLayer.Client_plane) {
			Client.field601 = ItemLayer.Client_plane;
			WorldMapDecoration.method4929(ItemLayer.Client_plane);
		}

	}
}
