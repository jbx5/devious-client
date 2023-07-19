import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
public class class8 {
	@ObfuscatedName("aw")
	final int field34;
	@ObfuscatedName("ay")
	final int field33;
	@ObfuscatedName("ar")
	final String field35;

	@ObfuscatedSignature(
		descriptor = "(Lty;)V"
	)
	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field34 = var1;
		this.field33 = var2;
		this.field35 = var3;
	}

	@ObfuscatedName("aw")
	String method65() {
		return Integer.toHexString(this.field34) + Integer.toHexString(this.field33) + this.field35;
	}

	@ObfuscatedName("ay")
	int method64() {
		return this.field33;
	}
}
