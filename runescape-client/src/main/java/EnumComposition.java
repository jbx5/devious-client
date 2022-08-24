import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("fn")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("EnumDefinition_cached")
	static EvictingDualNodeHashTable EnumDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("jk")
	@ObfuscatedGetter(intValue = 35416535)
	static int field1891;

	@ObfuscatedName("ng")
	@ObfuscatedSignature(descriptor = "Lkn;")
	static Widget field1890;

	@ObfuscatedName("w")
	@Export("inputType")
	public char inputType;

	@ObfuscatedName("v")
	@Export("outputType")
	public char outputType;

	@ObfuscatedName("c")
	@Export("defaultStr")
	public String defaultStr = "null";

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -19231955)
	@Export("defaultInt")
	public int defaultInt;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -633508893)
	@Export("outputCount")
	public int outputCount = 0;

	@ObfuscatedName("k")
	@Export("keys")
	public int[] keys;

	@ObfuscatedName("o")
	@Export("intVals")
	public int[] intVals;

	@ObfuscatedName("n")
	@Export("strVals")
	public String[] strVals;

	EnumComposition() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "-687932105")
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqr;IB)V", garbageValue = "32")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2141311437")
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(II)Lfy;", garbageValue = "1248940994")
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}
}