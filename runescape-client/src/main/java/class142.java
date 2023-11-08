import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
public class class142 extends class144 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -8949315075629659099L
	)
	long field1629;
	@ObfuscatedName("ah")
	String field1630;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class142(class147 var1) {
		this.this$0 = var1;
		this.field1629 = -1L;
		this.field1630 = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1629 = var1.readLong();
		}

		this.field1630 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3327(this.field1629, this.field1630, 0);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	static int method3220(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field852 - 7.0D) * 256.0D);
	}
}
