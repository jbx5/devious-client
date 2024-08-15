import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
class class137 implements Callable {
	@ObfuscatedName("ab")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("ji")
	static int[][] field1615;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	final class142 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lfg;"
	)
	final class133[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfq;II[Lfg;)V"
	)
	class137(class142 var1, int var2, int var3, class133[] var4) {
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
}
