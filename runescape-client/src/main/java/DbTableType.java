import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ut")
@Implements("DbTableType")
public class DbTableType extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static AbstractArchive field5279;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("DBTableType_cache")
	static EvictingDualNodeHashTable DBTableType_cache;
	@ObfuscatedName("aj")
	@Export("types")
	public int[][] types;
	@ObfuscatedName("az")
	@Export("defaultValues")
	public Object[][] defaultValues;

	static {
		DBTableType_cache = new EvictingDualNodeHashTable(64);
	}

	DbTableType() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "209942218"
	)
	void method9532(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method9537(var1, var2);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "-325571558"
	)
	void method9537(Buffer var1, int var2) {
		if (var2 == 1) {
			int var3 = var1.readUnsignedByte();
			if (this.types == null) {
				this.types = new int[var3][];
			}

			for (int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
				int var5 = var4 & 127;
				boolean var6 = (var4 & 128) != 0;
				int[] var7 = new int[var1.readUnsignedByte()];

				for (int var8 = 0; var8 < var7.length; ++var8) {
					var7[var8] = var1.readUShortSmart();
				}

				this.types[var5] = var7;
				if (var6) {
					if (this.defaultValues == null) {
						this.defaultValues = new Object[this.types.length][];
					}

					Object[][] var17 = this.defaultValues;
					int var11 = var1.readUShortSmart();
					Object[] var12 = new Object[var7.length * var11];

					for (int var13 = 0; var13 < var11; ++var13) {
						for (int var14 = 0; var14 < var7.length; ++var14) {
							int var15 = var14 + var7.length * var13;
							class533 var16 = WorldMapIcon_1.method5497(var7[var14]);
							var12[var15] = var16.method9508(var1);
						}
					}

					var17[var5] = var12;
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "886548584"
	)
	void method9534() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-150416972"
	)
	public static boolean method9548(char var0) {
		if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class412.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}
}
