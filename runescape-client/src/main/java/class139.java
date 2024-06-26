import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
class class139 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class142 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lft;Lvp;I)V"
	)
	class139(class142 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3204(this.val$p, this.val$version);
		return null;
	}
}
