import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
public class class1 implements Callable {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1492640615
	)
	static int field6;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	final Buffer field5;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laz;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Laz;Lty;Lam;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field5 = var2;
		this.field1 = var3;
	}

	public Object call() {
		return this.field1.vmethod12(this.field5);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldt;",
		garbageValue = "-1290744164"
	)
	static class90[] method10() {
		return new class90[]{class90.field1099, class90.field1103, class90.field1102, class90.field1107, class90.field1100, class90.field1101};
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "701566139"
	)
	protected static final int method11() {
		return GameEngine.keyHandler.method347();
	}
}
