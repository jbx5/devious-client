import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("im")
public class class229 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("field1913")
	static EvictingDualNodeHashTable field1913;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-411720969"
	)
	public static int method4771(int var0) {
		return var0 >>> 4 & class541.field5326;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1181530745"
	)
	public static void method4772() {
		VarbitComposition.VarbitDefinition_cached.clear();
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Ldd;B)V",
		garbageValue = "1"
	)
	static void method4770(NPC var0) {
		var0.field1183 = var0.definition.size;
		var0.field1221 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2580;
		var0.field1251 = var0.definition.field2579;
		var0.field1194 = var0.definition.field2582;
		var0.field1195 = var0.definition.field2596;
		var0.field1196 = var0.definition.field2584;
		var0.field1197 = var0.definition.field2585;
		var0.field1188 = var0.definition.field2586;
		var0.field1199 = var0.definition.field2587;
	}
}
