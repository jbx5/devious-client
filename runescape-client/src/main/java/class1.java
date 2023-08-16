import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class1 implements Callable {
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	final Buffer field4;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class3 field1;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lap;Ltm;Lat;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1;
		this.field4 = var2;
		this.field1 = var3;
	}

	public Object call() {
		return this.field1.vmethod9(this.field4);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-262419719"
	)
	static int method7() {
		return class28.KeyHandler_keyCodes.length;
	}
}
