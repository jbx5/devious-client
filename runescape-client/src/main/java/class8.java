import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("y")
public class class8 {
	@ObfuscatedName("c")
	final int field27;

	@ObfuscatedName("v")
	final int field26;

	@ObfuscatedName("q")
	final String field28;

	@ObfuscatedSignature(descriptor = "(Lqt;)V")
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field27 = var1;
		this.field26 = var2;
		this.field28 = var3;
	}

	@ObfuscatedName("c")
	String method57() {
		return Integer.toHexString(this.field27) + Integer.toHexString(this.field26) + this.field28;
	}

	@ObfuscatedName("v")
	int method55() {
		return this.field26;
	}
}