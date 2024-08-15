import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class133 implements Callable {
	@ObfuscatedName("ar")
	@Export("osNameLowercase")
	public static String osNameLowercase;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	final class134 field1549;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class135 field1550;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	final class136 field1551;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 952950779
	)
	final int field1552;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfq;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfq;Lfb;Lff;Lfe;I)V"
	)
	class133(class142 var1, class134 var2, class135 var3, class136 var4, int var5) {
		this.this$0 = var1;
		this.field1549 = var2;
		this.field1550 = var3;
		this.field1551 = var4;
		this.field1552 = var5;
	}

	public Object call() {
		this.field1549.method3187();
		class134[][] var1;
		if (this.field1550 == class135.field1586) {
			var1 = this.this$0.field1637;
		} else {
			var1 = this.this$0.field1630;
		}

		var1[this.field1552][this.field1551.method3243()] = this.field1549;
		return null;
	}
}
