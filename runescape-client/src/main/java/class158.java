import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class158 extends class143 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 3065353145974537921L
	)
	long field1773;
	@ObfuscatedName("ae")
	String field1768;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 2053663157
	)
	int field1769;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class158(class146 var1) {
		this.this$0 = var1;
		this.field1773 = -1L;
		this.field1768 = null;
		this.field1769 = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1773 = var1.readLong();
		}

		this.field1768 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1769 = var1.readUnsignedShort();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.method3223(this.field1773, this.field1768, this.field1769);
	}
}
