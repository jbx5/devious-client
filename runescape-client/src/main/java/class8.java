import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
public class class8 {
	@ObfuscatedName("ak")
	final int field27;
	@ObfuscatedName("al")
	final int field26;
	@ObfuscatedName("aj")
	final String field25;

	@ObfuscatedSignature(
		descriptor = "(Lua;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field27 = var1;
		this.field26 = var2;
		this.field25 = var3;
	}

	@ObfuscatedName("ak")
	String method59() {
		return Integer.toHexString(this.field27) + Integer.toHexString(this.field26) + this.field25;
	}

	@ObfuscatedName("al")
	int method62() {
		return this.field26;
	}
}
