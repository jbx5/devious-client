import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fe")
public class class130 implements Callable {
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -237128359
	)
	@Export("otpMedium")
	static int otpMedium;
	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1521;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	final class131 field1526;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class132 field1524;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class133 field1522;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1840918815
	)
	final int field1523;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfu;"
	)
	final class138 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfu;Lfx;Lff;Lfv;I)V"
	)
	class130(class138 var1, class131 var2, class132 var3, class133 var4, int var5) {
		this.this$0 = var1;
		this.field1526 = var2;
		this.field1524 = var3;
		this.field1522 = var4;
		this.field1523 = var5;
	}

	public Object call() {
		this.field1526.method3085();
		class131[][] var1;
		if (this.field1524 == class132.field1553) {
			var1 = this.this$0.field1599;
		} else {
			var1 = this.this$0.field1598;
		}

		var1[this.field1523][this.field1522.method3131()] = this.field1526;
		return null;
	}
}
