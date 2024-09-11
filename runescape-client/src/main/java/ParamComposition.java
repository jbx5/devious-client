import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("ag")
	@Export("type")
	char type;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -788953933
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ax")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("aq")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1761220261"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "-1076864158"
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)V",
		garbageValue = "-1765669651"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			byte var4 = var1.readByte();
			int var5 = var4 & 255;
			if (var5 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var5, 16));
			}

			if (var5 >= 128 && var5 < 160) {
				char var6 = class416.cp1252AsciiExtension[var5 - 128];
				if (var6 == 0) {
					var6 = '?';
				}

				var5 = var6;
			}

			char var3 = (char)var5;
			this.type = var3;
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-106"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1555968902"
	)
	public static void method4098(boolean var0) {
		if (var0 != class191.ItemDefinition_inMembersWorld) {
			ObjectComposition.method4194();
			class191.ItemDefinition_inMembersWorld = var0;
		}

	}
}
