import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class8 {
	@ObfuscatedName("ap")
	final int field22;
	@ObfuscatedName("aw")
	final int field23;
	@ObfuscatedName("ak")
	final String field24;

	@ObfuscatedSignature(
		descriptor = "(Lvl;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field22 = var1;
		this.field23 = var2;
		this.field24 = var3;
	}

	@ObfuscatedName("ap")
	String method60() {
		return Integer.toHexString(this.field22) + Integer.toHexString(this.field23) + this.field24;
	}

	@ObfuscatedName("aw")
	int method61() {
		return this.field23;
	}
}
