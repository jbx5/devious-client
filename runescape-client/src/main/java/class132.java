import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class132 implements Callable {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class133 field1577;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class134 field1574;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class135 field1575;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 106186067
	)
	final int field1576;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfo;"
	)
	final class141 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfo;Lfm;Lfr;Lfz;I)V"
	)
	class132(class141 var1, class133 var2, class134 var3, class135 var4, int var5) {
		this.this$0 = var1;
		this.field1577 = var2;
		this.field1574 = var3;
		this.field1575 = var4;
		this.field1576 = var5;
	}

	public Object call() {
		this.field1577.method3091();
		class133[][] var1;
		if (this.field1574 == class134.field1604) {
			var1 = this.this$0.field1647;
		} else {
			var1 = this.this$0.field1653;
		}

		var1[this.field1576][this.field1575.method3120()] = this.field1577;
		return null;
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lcj;III)V",
		garbageValue = "-1443572211"
	)
	static final void method3076(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			PacketWriter.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.worldViewId, var0.action, var0.target, var1, var2);
		}

	}
}
