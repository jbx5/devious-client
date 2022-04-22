import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class214 {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lhr;")

	static final class214 field2380;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lhr;")

	static final class214 field2378;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-1627101547)

	@Export("value")
	final int value;
	static 
	{
		field2380 = new class214(0);
		field2378 = new class214(1);
	}

	class214(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;Lpt;I)Lpt;", garbageValue = 
	"-175600425")

	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = class67.method1909(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put(((Node) (var6)), ((long) (var5)));
		}

		return var1;
	}
}