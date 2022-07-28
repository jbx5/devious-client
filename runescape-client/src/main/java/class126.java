import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("dq")
public class class126 extends class128 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1969765153)
	static int field1537;

	@ObfuscatedName("o")
	@ObfuscatedGetter(longValue = -3487830023525652295L)
	long field1536;

	@ObfuscatedName("q")
	String field1535;

	@ObfuscatedSignature(descriptor = "Lec;")
	final class131 this$0;

	@ObfuscatedSignature(descriptor = "(Lec;)V")
	class126(class131 var1) {
		this.this$0 = var1;
		this.field1536 = -1L;
		this.field1535 = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-423569520")
	void vmethod3155(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1536 = var1.readLong();
		}
		this.field1535 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lez;I)V", garbageValue = "-1755436064")
	void vmethod3154(ClanSettings var1) {
		var1.method3031(this.field1536, this.field1535, 0);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;B)Z", garbageValue = "-3")
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return class306.method5768(var0, 10, true);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lgy;", garbageValue = "-1399722612")
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = ((StructComposition) (StructComposition.StructDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class295.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}
}