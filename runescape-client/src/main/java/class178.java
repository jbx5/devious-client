import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
public class class178 extends class181 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1585699091
	)
	int field1865;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgq;"
	)
	final class170 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgq;Ljava/lang/String;I)V"
	)
	class178(class170 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1865 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-14721"
	)
	public int vmethod3558() {
		return 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-400866400"
	)
	public int vmethod3560() {
		return this.field1865;
	}
}
