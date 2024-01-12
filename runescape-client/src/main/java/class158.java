import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class158 extends class143 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 2245788515684681757L
	)
	long field1740;
	@ObfuscatedName("ap")
	String field1738;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2050490777
	)
	int field1739;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class158(class146 var1) {
		this.this$0 = var1;
		this.field1740 = -1L;
		this.field1738 = null;
		this.field1739 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1740 = var1.readLong();
		}

		this.field1738 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1739 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3344(this.field1740, this.field1738, this.field1739);
	}
}
