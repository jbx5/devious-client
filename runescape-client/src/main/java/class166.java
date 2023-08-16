import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class166 extends class159 {
	@ObfuscatedName("au")
	String field1822;
	@ObfuscatedName("ae")
	byte field1820;
	@ObfuscatedName("ao")
	byte field1821;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class160 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class166(class160 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "1"
	)
	void vmethod3333(Buffer var1) {
		this.field1822 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1822 != null) {
			var1.readUnsignedByte();
			this.field1820 = var1.readByte();
			this.field1821 = var1.readByte();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "831405774"
	)
	void vmethod3332(ClanChannel var1) {
		var1.name = this.field1822;
		if (this.field1822 != null) {
			var1.field1800 = this.field1820;
			var1.field1804 = this.field1821;
		}

	}
}
