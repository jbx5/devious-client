import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("gd")
	@Export("characterId")
	static String characterId;
	@ObfuscatedName("ty")
	static boolean field1052;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2029858409
	)
	@Export("group")
	int group;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 198246779
	)
	@Export("type")
	int type;
	@ObfuscatedName("ar")
	boolean field1047;

	InterfaceParent() {
		this.field1047 = false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmf;I)V",
		garbageValue = "-919285791"
	)
	public static void method2353(class322 var0) {
		class316.field3420.remove(var0);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1759271664"
	)
	public static int method2351() {
		return ++MouseHandler.MouseHandler_idleCycles - 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "94"
	)
	public static void method2352() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}
}
