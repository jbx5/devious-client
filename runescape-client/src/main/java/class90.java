import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
public enum class90 implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1090(0, -1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1087(1, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1089(2, 3),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1096(3, 4),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1091(4, 5),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	field1092(5, 6);

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -881189761
	)
	final int field1093;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1952545437
	)
	final int field1094;

	class90(int var3, int var4) {
		this.field1093 = var3;
		this.field1094 = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1094;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BI)Ldd;",
		garbageValue = "850593587"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script();
		Buffer var2 = new Buffer(var0);
		var2.offset = var2.array.length - 2;
		int var3 = var2.readUnsignedShort();
		int var4 = var2.array.length - 2 - var3 - 12;
		var2.offset = var4;
		int var5 = var2.readInt();
		var1.localIntCount = var2.readUnsignedShort();
		var1.localStringCount = var2.readUnsignedShort();
		var1.intArgumentCount = var2.readUnsignedShort();
		var1.stringArgumentCount = var2.readUnsignedShort();
		int var6 = var2.readUnsignedByte();
		int var7;
		int var8;
		if (var6 > 0) {
			var1.switches = var1.newIterableNodeHashTable(var6);

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var2.readUnsignedShort();
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? ItemContainer.method2347(var8) : 1);
				var1.switches[var7] = var9;

				while (var8-- > 0) {
					int var10 = var2.readInt();
					int var11 = var2.readInt();
					var9.put(new IntegerNode(var11), (long)var10);
				}
			}
		}

		var2.offset = 0;
		var1.field979 = var2.readStringCp1252NullTerminatedOrNull();
		var1.opcodes = new int[var5];
		var1.intOperands = new int[var5];
		var1.stringOperands = new String[var5];

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) {
			var8 = var2.readUnsignedShort();
			if (var8 == 3) {
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte();
			}
		}

		return var1;
	}
}
