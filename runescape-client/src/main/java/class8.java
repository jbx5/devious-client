import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ao")
public class class8 {
	@ObfuscatedName("aq")
	final int field23;
	@ObfuscatedName("aw")
	final int field22;
	@ObfuscatedName("al")
	final String field24;

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field23 = var1;
		this.field22 = var2;
		this.field24 = var3;
	}

	@ObfuscatedName("aq")
	String method56() {
		return Integer.toHexString(this.field23) + Integer.toHexString(this.field22) + this.field24;
	}

	@ObfuscatedName("aw")
	int method54() {
		return this.field22;
	}
}
