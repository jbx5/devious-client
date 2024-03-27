import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class145 extends class144 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1742224277
	)
	int field1678;
	@ObfuscatedName("ah")
	boolean field1677;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class145(class147 var1) {
		this.this$0 = var1;
		this.field1678 = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1678 = var1.readUnsignedShort();
		this.field1677 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3253(this.field1678, this.field1677);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "61"
	)
	static void method3156(String var0, String var1, String var2) {
		class210.method3930(7);
		class59.setLoginResponseString(var0, var1, var2);
	}
}
