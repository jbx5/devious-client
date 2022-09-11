import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class8 {
	@ObfuscatedName("c")
	final int field28;
	@ObfuscatedName("p")
	final int field29;
	@ObfuscatedName("f")
	final String field30;

	@ObfuscatedSignature(
		descriptor = "(Lqq;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated()); // L: 19
	} // L: 20

	class8(int var1, int var2, String var3) {
		this.field28 = var1; // L: 13
		this.field29 = var2; // L: 14
		this.field30 = var3; // L: 15
	} // L: 16

	@ObfuscatedName("c")
	String method71() {
		return Integer.toHexString(this.field28) + Integer.toHexString(this.field29) + this.field30; // L: 23
	}

	@ObfuscatedName("p")
	int method72() {
		return this.field29; // L: 27
	}
}
