import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("EnumComposition")
public class EnumComposition extends DualNode {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("EnumDefinition_archive")
	public static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("EnumDefinition_cached")
	public static EvictingDualNodeHashTable EnumDefinition_cached;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("ih")
	static SecureRandom field1896;
	@ObfuscatedName("ar")
	@Export("inputType")
	public char inputType;
	@ObfuscatedName("ao")
	@Export("outputType")
	public char outputType;
	@ObfuscatedName("ab")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1735445249
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1590765713
	)
	@Export("outputCount")
	public int outputCount;
	@ObfuscatedName("ac")
	@Export("keys")
	public int[] keys;
	@ObfuscatedName("al")
	@Export("intVals")
	public int[] intVals;
	@ObfuscatedName("az")
	@Export("strVals")
	public String[] strVals;

	static {
		EnumDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	EnumComposition() {
		this.defaultStr = "null";
		this.outputCount = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-673581219"
	)
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Luj;II)V",
		garbageValue = "225113863"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.inputType = (char)var1.readUnsignedByte();
		} else if (var2 == 2) {
			this.outputType = (char)var1.readUnsignedByte();
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1812244472"
	)
	@Export("size")
	public int size() {
		return this.outputCount;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lol;IB)Z",
		garbageValue = "120"
	)
	public static boolean method3679(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			class162.SpriteBuffer_decode(var2);
			return true;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-264971545"
	)
	public static void method3678(int var0, int var1, int var2, int var3) {
		class316.musicPlayerStatus = var0;
		class316.field3418 = var1;
		class316.field3419 = var2;
		class316.field3417 = var3;
	}
}
