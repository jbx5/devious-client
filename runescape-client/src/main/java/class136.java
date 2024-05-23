import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
class class136 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class141 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfy;"
	)
	final class132[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfo;II[Lfy;)V"
	)
	class136(class141 var1, int var2, int var3, class132[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "491916421"
	)
	static void method3128(int var0, int var1, int var2, int var3, int var4, int var5) {
		NodeDeque var6 = ModeWhere.field4623.field1349[var0][var1][var2];
		if (var6 != null) {
			for (TileItem var7 = (TileItem)var6.last(); var7 != null; var7 = (TileItem)var6.previous()) {
				if ((var3 & 32767) == var7.id && var4 == var7.quantity) {
					var7.quantity = var5;
					break;
				}
			}

			class349.method6551(var0, var1, var2);
		}

	}
}
