import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rw")
public final class class442 {
	@ObfuscatedName("aq")
	final Comparator field4720;
	@ObfuscatedName("aw")
	final Map field4718;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	final class411 field4716;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpj;"
	)
	final class411 field4717;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -5769429091078843289L
	)
	final long field4714;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	final class440 field4719;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1008373307
	)
	final int field4715;

	@ObfuscatedSignature(
		descriptor = "(JILqb;)V"
	)
	class442(long var1, int var3, class440 var4) {
		this.field4720 = new class441(this);
		this.field4714 = var1;
		this.field4715 = var3;
		this.field4719 = var4;
		if (this.field4715 == -1) {
			this.field4718 = new HashMap(64);
			this.field4716 = new class411(64, this.field4720);
			this.field4717 = null;
		} else {
			if (this.field4719 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4718 = new HashMap(this.field4715);
			this.field4716 = new class411(this.field4715, this.field4720);
			this.field4717 = new class411(this.field4715);
		}

	}

	@ObfuscatedSignature(
		descriptor = "(ILqb;)V"
	)
	public class442(int var1, class440 var2) {
		this(-1L, var1, var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-35"
	)
	boolean method8199() {
		return this.field4715 != -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;B)Ljava/lang/Object;",
		garbageValue = "-60"
	)
	public Object method8198(Object var1) {
		synchronized(this) {
			if (-1L != this.field4714) {
				this.method8210();
			}

			class443 var3 = (class443)this.field4718.get(var1);
			if (var3 == null) {
				return null;
			} else {
				this.method8202(var3, false);
				return var3.field4722;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;",
		garbageValue = "238417323"
	)
	public Object method8201(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field4714) {
				this.method8210();
			}

			class443 var4 = (class443)this.field4718.get(var1);
			if (var4 != null) {
				Object var8 = var4.field4722;
				var4.field4722 = var2;
				this.method8202(var4, false);
				return var8;
			} else {
				class443 var5;
				if (this.method8199() && this.field4718.size() == this.field4715) {
					var5 = (class443)this.field4717.remove();
					this.field4718.remove(var5.field4721);
					this.field4716.remove(var5);
				}

				var5 = new class443(var2, var1);
				this.field4718.put(var1, var5);
				this.method8202(var5, true);
				return null;
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrq;ZB)V",
		garbageValue = "-1"
	)
	void method8202(class443 var1, boolean var2) {
		if (!var2) {
			this.field4716.remove(var1);
			if (this.method8199() && !this.field4717.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4723 = System.currentTimeMillis();
		if (this.method8199()) {
			switch(this.field4719.field4711) {
			case 0:
				var1.field4724 = var1.field4723;
				break;
			case 1:
				++var1.field4724;
			}

			this.field4717.add(var1);
		}

		this.field4716.add(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method8210() {
		if (this.field4714 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var1 = System.currentTimeMillis() - this.field4714;

			while (!this.field4716.isEmpty()) {
				class443 var3 = (class443)this.field4716.peek();
				if (var3.field4723 >= var1) {
					return;
				}

				this.field4718.remove(var3.field4721);
				this.field4716.remove(var3);
				if (this.method8199()) {
					this.field4717.remove(var3);
				}
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1682413099"
	)
	@Export("clearFiles")
	public void clearFiles() {
		synchronized(this) {
			this.field4718.clear();
			this.field4716.clear();
			if (this.method8199()) {
				this.field4717.clear();
			}

		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1623528561"
	)
	static void method8216() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			class475.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

	}
}
