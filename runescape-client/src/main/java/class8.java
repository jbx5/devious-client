import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public class class8 {
	@ObfuscatedName("aq")
	final int field30;
	@ObfuscatedName("ad")
	final int field31;
	@ObfuscatedName("ag")
	final String field32;

	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field30 = var1;
		this.field31 = var2;
		this.field32 = var3;
	}

	@ObfuscatedName("aq")
	String method61() {
		return Integer.toHexString(this.field30) + Integer.toHexString(this.field31) + this.field32;
	}

	@ObfuscatedName("ad")
	int method60() {
		return this.field31;
	}
}
