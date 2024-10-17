import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rs")
public final class class465 {
	@ObfuscatedName("ap")
	final Comparator field4968;
	@ObfuscatedName("aw")
	final Map field4964;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	final class434 field4963;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqr;"
	)
	final class434 field4965;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 1177077145111222367L
	)
	final long field4967;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	final class463 field4966;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -286364035
	)
	final int field4969;

	@ObfuscatedSignature(
		descriptor = "(JILrm;)V"
	)
	class465(long var1, int var3, class463 var4) {
		this.field4968 = new class464(this);
		this.field4967 = var1;
		this.field4969 = var3;
		this.field4966 = var4;
		if (this.field4969 == -1) {
			this.field4964 = new HashMap(64);
			this.field4963 = new class434(64, this.field4968);
			this.field4965 = null;
		} else {
			if (this.field4966 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4964 = new HashMap(this.field4969);
			this.field4963 = new class434(this.field4969, this.field4968);
			this.field4965 = new class434(this.field4969);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILrm;)V"
	)
	public class465(int var1, class463 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1131205793"
	)
	boolean method8894() {
		return this.field4969 != -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;S)Ljava/lang/Object;",
		garbageValue = "20852"
	)
	public Object method8892(Object var1) {
		synchronized(this) {
			if (this.field4967 != -1L) {
				this.method8897();
			}

			class466 var3 = (class466)this.field4964.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method8896(var3, false);
				return var3.field4970;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "34078720"
	)
	public Object method8895(Object var1, Object var2) {
		synchronized(this) {
			if (this.field4967 != -1L) {
				this.method8897();
			}

			class466 var4 = (class466)this.field4964.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4970;
				var4.field4970 = var2;
				this.method8896(var4, false);
				return var8;
			} else {
				class466 var5;
				if (this.method8894() && this.field4964.size() == this.field4969) {
					var5 = (class466)this.field4965.remove();
					this.field4964.remove(var5.field4971);
					this.field4963.remove(var5);
				}

				var5 = new class466(var2, var1);
				this.field4964.put(var1, var5);
				this.method8896(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lrw;ZI)V",
		garbageValue = "2002522661"
	)
	void method8896(class466 var1, boolean var2) {
		if (!var2) {
			this.field4963.remove(var1);
			if (this.method8894()) {
			}
		}

		var1.field4974 = System.currentTimeMillis();
		if (this.method8894()) {
			switch(this.field4966.field4959) {
			case 0:
				++var1.field4973;
				break;
			case 1:
				var1.field4973 = var1.field4974;
			}

			this.field4965.add(var1);
		}

		this.field4963.add(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1128795586"
	)
	void method8897() {
		if (-1L == this.field4967) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4967;

			while (!this.field4963.isEmpty()) {
				class466 var3 = (class466)this.field4963.peek();
				if (var3.field4974 >= var1) {
					return;
				}

				this.field4964.remove(var3.field4971);
				this.field4963.remove(var3);
				if (this.method8894()) {
					this.field4965.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-629173137"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4964.clear();
			this.field4963.clear();
			if (this.method8894()) {
				this.field4965.clear();
			}

		}
	}
}
