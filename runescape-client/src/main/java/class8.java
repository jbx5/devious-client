import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class8 {
	@ObfuscatedName("au")
	final int field27;
	@ObfuscatedName("ae")
	final int field28;
	@ObfuscatedName("ao")
	final String field29;

	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field27 = var1;
		this.field28 = var2;
		this.field29 = var3;
	}

	@ObfuscatedName("au")
	String method56() {
		return Integer.toHexString(this.field27) + Integer.toHexString(this.field28) + this.field29;
	}

	@ObfuscatedName("ae")
	int method54() {
		return this.field28;
	}
}
