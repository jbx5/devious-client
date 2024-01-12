import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ap")
	String field979;
	@ObfuscatedName("af")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("aj")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("aq")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -165630961
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1498866603
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 634248277
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1186762681
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Ltb;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)[Ltb;",
		garbageValue = "-1812104264"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhi;",
		garbageValue = "0"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "538407903"
	)
	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CLol;I)I",
		garbageValue = "-885374361"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}
}
