import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("en")
public class class150 extends class128 {
	@ObfuscatedName("o")
	@ObfuscatedGetter(longValue = -5552334129573370025L)
	long field1691;

	@ObfuscatedName("q")
	String field1689;

	@ObfuscatedSignature(descriptor = "Lec;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lec;)V")
	class150(class131 var1) {
		this.this$0 = var1;
		this.field1691 = -1L;
		this.field1689 = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-423569520")
	void vmethod3155(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1691 = var1.readLong();
		}
		this.field1689 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lez;I)V", garbageValue = "-1755436064")
	void vmethod3154(ClanSettings var1) {
		var1.method2987(this.field1691, this.field1689);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "700719603")
	public static int method3143(String var0) {
		return var0.length() + 2;
	}
}