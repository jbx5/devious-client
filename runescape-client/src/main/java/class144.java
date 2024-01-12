import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
public class class144 extends class143 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 869632299
	)
	int field1639;
	@ObfuscatedName("ap")
	boolean field1638;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class144(class146 var1) {
		this.this$0 = var1;
		this.field1639 = -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1639 = var1.readUnsignedShort();
		this.field1638 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3351(this.field1639, this.field1638);
	}
}
