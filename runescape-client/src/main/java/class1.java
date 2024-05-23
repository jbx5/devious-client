import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class1 implements Callable {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	final Buffer field1;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lab;Lua;Laz;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field1 = var2;
		this.field0 = var3;
	}

	public Object call() {
		return this.field0.vmethod11(this.field1);
	}
}
