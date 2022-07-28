import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fa")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("ua")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("masterDisk")
	static ArchiveDisk masterDisk;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("f")
	@Export("inputType")
	public char inputType;

	@ObfuscatedName("u")
	@Export("outputType")
	public char outputType;

	@ObfuscatedName("c")
	@Export("defaultStr")
	public String defaultStr = "null";

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1507640233)
	@Export("defaultInt")
	public int defaultInt;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -289473215)
	@Export("outputCount")
	public int outputCount = 0;

	@ObfuscatedName("j")
	@Export("keys")
	public int[] keys;

	@ObfuscatedName("h")
	@Export("intVals")
	public int[] intVals;

	@ObfuscatedName("a")
	@Export("strVals")
	public String[] strVals;

	EnumComposition() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "217482290")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "2103700141")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = ((char) (var1.readUnsignedByte()));
		} else if (var2 == 2) {
			this.outputType = ((char) (var1.readUnsignedByte()));
		} else if (var2 == 3) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.defaultInt = var1.readInt();
		} else {
			int var3;
			if (var2 == 5) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.strVals = new String[this.outputCount];
				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.strVals[var3] = var1.readStringCp1252NullTerminated();
				}
			} else if (var2 == 6) {
				this.outputCount = var1.readUnsignedShort();
				this.keys = new int[this.outputCount];
				this.intVals = new int[this.outputCount];
				for (var3 = 0; var3 < this.outputCount; ++var3) {
					this.keys[var3] = var1.readInt();
					this.intVals[var3] = var1.readInt();
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-67")
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "2")
	static void method3461(int var0) {
		IgnoreList.field4293 = var0;
		class388.field4409 = new class388[var0];
		class259.field2903 = 0;
	}
}