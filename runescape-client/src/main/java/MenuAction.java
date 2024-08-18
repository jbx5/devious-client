import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("os")
	@ObfuscatedGetter(
		intValue = -1333532253
	)
	@Export("selectedSpellWidget")
	static int selectedSpellWidget;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -539411559
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1143228203
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1560287337
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -120521443
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -68271659
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 302393583
	)
	@Export("worldViewId")
	int worldViewId;
	@ObfuscatedName("am")
	@Export("action")
	String action;
	@ObfuscatedName("ac")
	@Export("target")
	String target;

	MenuAction() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "2018535564"
	)
	static long method2179(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}
}
