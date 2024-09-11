import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class167 {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1847636365
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -8778605944052578383L
	)
	long field1818;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 3924644622254876697L
	)
	public long field1814;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	IterableNodeDeque field1815;

	@ObfuscatedSignature(
		descriptor = "(Lvf;)V"
	)
	public class167(Buffer var1) {
		this.field1814 = -1L;
		this.field1815 = new IterableNodeDeque();
		this.method3694(var1);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "556675772"
	)
	void method3694(Buffer var1) {
		this.field1818 = var1.readLong();
		this.field1814 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class162(this);
			} else if (var2 == 4) {
				var3 = new class173(this);
			} else if (var2 == 3) {
				var3 = new class158(this);
			} else if (var2 == 2) {
				var3 = new class156(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class163(this);
			}

			((class166)var3).vmethod3761(var1);
			this.field1815.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)V",
		garbageValue = "146526489"
	)
	public void method3696(ClanChannel var1) {
		if (var1.key == this.field1818 && this.field1814 == var1.field1837) {
			for (class166 var2 = (class166)this.field1815.last(); var2 != null; var2 = (class166)this.field1815.previous()) {
				var2.vmethod3762(var1);
			}

			++var1.field1837;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CLpx;B)C",
		garbageValue = "111"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}
}
