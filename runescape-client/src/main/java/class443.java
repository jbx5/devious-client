import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
public final class class443 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field4751;
	@ObfuscatedName("az")
	final Comparator field4753;
	@ObfuscatedName("ah")
	final Map field4758;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	final class412 field4752;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpt;"
	)
	final class412 field4754;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = 7545653809512582065L
	)
	final long field4755;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	final class441 field4756;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 832179613
	)
	final int field4757;

	@ObfuscatedSignature(
		descriptor = "(JILqj;)V"
	)
	class443(long var1, int var3, class441 var4) {
		this.field4753 = new class442(this);
		this.field4755 = var1;
		this.field4757 = var3;
		this.field4756 = var4;
		if (this.field4757 == -1) {
			this.field4758 = new HashMap(64);
			this.field4752 = new class412(64, this.field4753);
			this.field4754 = null;
		} else {
			if (this.field4756 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4758 = new HashMap(this.field4757);
			this.field4752 = new class412(this.field4757, this.field4753);
			this.field4754 = new class412(this.field4757);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILqj;)V"
	)
	public class443(int var1, class441 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1689132783"
	)
	boolean method8007() {
		return this.field4757 != -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "2106112126"
	)
	public Object method8015(Object var1) {
		synchronized(this) {
			if (this.field4755 != -1L) {
				this.method8010();
			}

			class444 var3 = (class444)this.field4758.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method8014(var3, false);
				return var3.field4762;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "460192275"
	)
	public Object method8008(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field4755) {
				this.method8010();
			}

			class444 var4 = (class444)this.field4758.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4762;
				var4.field4762 = var2;
				this.method8014(var4, false);
				return var8;
			} else {
				class444 var5;
				if (this.method8007() && this.field4758.size() == this.field4757) {
					var5 = (class444)this.field4754.remove();
					this.field4758.remove(var5.field4761);
					this.field4752.remove(var5);
				}

				var5 = new class444(var2, var1);
				this.field4758.put(var1, var5);
				this.method8014(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrv;ZI)V",
		garbageValue = "2043331255"
	)
	void method8014(class444 var1, boolean var2) {
		if (!var2) {
			this.field4752.remove(var1);
			if (this.method8007() && !this.field4754.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4760 = System.currentTimeMillis();
		if (this.method8007()) {
			switch(this.field4756.field4747) {
			case 0:
				++var1.field4763;
				break;
			case 1:
				var1.field4763 = var1.field4760;
			}

			this.field4754.add(var1);
		}

		this.field4752.add(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1383267868"
	)
	void method8010() {
		if (this.field4755 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4755;

			while (!this.field4752.isEmpty()) {
				class444 var3 = (class444)this.field4752.peek();
				if (var3.field4760 >= var1) {
					return;
				}

				this.field4758.remove(var3.field4761);
				this.field4752.remove(var3);
				if (this.method8007()) {
					this.field4754.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-30"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4758.clear();
			this.field4752.clear();
			if (this.method8007()) {
				this.field4754.clear();
			}

		}
	}
}
