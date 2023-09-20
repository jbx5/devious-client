import java.util.ArrayList;
import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class1 implements Callable {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	final Buffer field2;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lab;Lul;Lax;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field2 = var2;
		this.field1 = var3;
	}

	public Object call() {
		return this.field1.vmethod13(this.field2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;Lom;Lom;Ljava/util/ArrayList;B)Z",
		garbageValue = "-86"
	)
	public static boolean method9(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, ArrayList var3) {
		class319.field3439 = var0;
		class319.field3429 = var1;
		class319.field3432 = var2;
		class319.field3431 = var3;
		return true;
	}
}
