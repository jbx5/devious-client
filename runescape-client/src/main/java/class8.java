import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("u")
public class class8 {
	@ObfuscatedName("v")
	final int field33;
	@ObfuscatedName("o")
	final int field32;
	@ObfuscatedName("h")
	final String field31;

	@ObfuscatedSignature(descriptor = 
	"(Lpd;)V")

	class8(Buffer var1) {
		this(var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readStringCp1252NullTerminated());
	}

	class8(int var1, int var2, String var3) {
		this.field33 = var1;
		this.field32 = var2;
		this.field31 = var3;
	}

	@ObfuscatedName("v")
	String method56() {
		return (Integer.toHexString(this.field33) + Integer.toHexString(this.field32)) + this.field31;
	}

	@ObfuscatedName("o")
	int method57() {
		return this.field32;
	}
}