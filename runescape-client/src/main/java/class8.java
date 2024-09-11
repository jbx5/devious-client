import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("au")
public class class8 {
	@ObfuscatedName("ac")
	final int field25;
	@ObfuscatedName("ae")
	final int field23;
	@ObfuscatedName("ag")
	final String field24;

	@ObfuscatedSignature(
		descriptor = "(Lvf;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field25 = var1;
		this.field23 = var2;
		this.field24 = var3;
	}

	@ObfuscatedName("ac")
	String method62() {
		return Integer.toHexString(this.field25) + Integer.toHexString(this.field23) + this.field24;
	}

	@ObfuscatedName("ae")
	int method63() {
		return this.field23;
	}
}
