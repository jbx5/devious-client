import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fp")
public class class136 implements Callable {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class137 field1600;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class138 field1596;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class139 field1597;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -993785003
	)
	final int field1598;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfo;Lfr;Lfg;Lfu;I)V"
	)
	class136(class145 var1, class137 var2, class138 var3, class139 var4, int var5) {
		this.this$0 = var1;
		this.field1600 = var2;
		this.field1596 = var3;
		this.field1597 = var4;
		this.field1598 = var5;
	}

	public Object call() {
		this.field1600.method3330();
		class137[][] var1;
		if (this.field1596 == class138.field1631) {
			var1 = this.this$0.field1674;
		} else {
			var1 = this.this$0.field1672;
		}

		var1[this.field1598][this.field1597.method3365()] = this.field1600;
		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ldt;",
		garbageValue = "1"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class187.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = class187.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = class160.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}
}
