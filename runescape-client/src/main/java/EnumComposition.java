import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fs")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("i")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("f")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("b")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1966559045)

	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	1434238149)

	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("l")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("q")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("o")
	@Export("strVals")
	public String[] strVals;
	static 
	{
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"-91")

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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"-2119565699")

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

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"1")

	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lky;IIII)V", garbageValue = 
	"-585894477")

	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3417 == null) {
			throw new RuntimeException();
		} else {
			var0.field3417[var1] = var2;
			var0.field3418[var1] = var3;
		}
	}
}