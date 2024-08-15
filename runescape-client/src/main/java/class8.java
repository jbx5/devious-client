import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ae")
public class class8 {
	@ObfuscatedName("ab")
	final int field23;
	@ObfuscatedName("ay")
	final int field24;
	@ObfuscatedName("an")
	final String field22;

	@ObfuscatedSignature(
		descriptor = "(Lvg;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field23 = var1;
		this.field24 = var2;
		this.field22 = var3;
	}

	@ObfuscatedName("ab")
	String method62() {
		return Integer.toHexString(this.field23) + Integer.toHexString(this.field24) + this.field22;
	}

	@ObfuscatedName("ay")
	int method56() {
		return this.field24;
	}
}
