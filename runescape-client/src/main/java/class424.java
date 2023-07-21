import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public final class class424 {
	@ObfuscatedName("ak")
	static String field4617;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -245464635
	)
	static int field4622;
	@ObfuscatedName("aw")
	final Comparator field4614;
	@ObfuscatedName("ay")
	final Map field4618;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	final class393 field4616;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	final class393 field4615;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		longValue = 3780324665088720995L
	)
	final long field4621;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	final class422 field4619;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2116285329
	)
	final int field4620;

	@ObfuscatedSignature(
		descriptor = "(JILqu;)V"
	)
	class424(long var1, int var3, class422 var4) {
		this.field4614 = new class423(this);
		this.field4621 = var1;
		this.field4620 = var3;
		this.field4619 = var4;
		if (this.field4620 == -1) {
			this.field4618 = new HashMap(64);
			this.field4616 = new class393(64, this.field4614);
			this.field4615 = null;
		} else {
			if (this.field4619 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4618 = new HashMap(this.field4620);
			this.field4616 = new class393(this.field4620, this.field4614);
			this.field4615 = new class393(this.field4620);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILqu;)V"
	)
	public class424(int var1, class422 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-61352900"
	)
	boolean method7828() {
		return this.field4620 != -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "2120370610"
	)
	public Object method7829(Object var1) {
		synchronized(this) {
			if (-1L != this.field4621) {
				this.method7832();
			}

			class425 var3 = (class425)this.field4618.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method7831(var3, false);
				return var3.field4624;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "301709804"
	)
	public Object method7830(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field4621) {
				this.method7832();
			}

			class425 var4 = (class425)this.field4618.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4624;
				var4.field4624 = var2;
				this.method7831(var4, false);
				return var8;
			} else {
				class425 var5;
				if (this.method7828() && this.field4618.size() == this.field4620) {
					var5 = (class425)this.field4615.remove();
					this.field4618.remove(var5.field4626);
					this.field4616.remove(var5);
				}

				var5 = new class425(var2, var1);
				this.field4618.put(var1, var5);
				this.method7831(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lqr;ZI)V",
		garbageValue = "-113992548"
	)
	void method7831(class425 var1, boolean var2) {
		if (!var2) {
			this.field4616.remove(var1);
			if (this.method7828() && !this.field4615.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4625 = System.currentTimeMillis();
		if (this.method7828()) {
			switch(this.field4619.field4611) {
			case 0:
				++var1.field4623;
				break;
			case 1:
				var1.field4623 = var1.field4625;
			}

			this.field4615.add(var1);
		}

		this.field4616.add(var1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	void method7832() {
		if (-1L == this.field4621) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4621;

			while (!this.field4616.isEmpty()) {
				class425 var3 = (class425)this.field4616.peek();
				if (var3.field4625 >= var1) {
					return;
				}

				this.field4618.remove(var3.field4626);
				this.field4616.remove(var3);
				if (this.method7828()) {
					this.field4615.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2134542094"
	)
	public void method7849() {
		synchronized(this) {
			this.field4618.clear();
			this.field4616.clear();
			if (this.method7828()) {
				this.field4615.clear();
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltu;",
		garbageValue = "78"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5052.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method8995(new Buffer(var2));
			}

			var1.method9008();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
