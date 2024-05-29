import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("ab")
	@Export("Tiles_hue")
	static int[] Tiles_hue;
	@ObfuscatedName("aj")
	@Export("type")
	char type;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1594880197
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("af")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("aa")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1455246752"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-1126022040"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lua;IB)V",
		garbageValue = "0"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.type = class155.method3301(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-902815203"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[Loq;",
		garbageValue = "1097587513"
	)
	static class371[] method4110() {
		return new class371[]{class371.field4044, class371.field4043};
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2009298215"
	)
	@Export("updateLoginIndex")
	static void updateLoginIndex(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}
}
