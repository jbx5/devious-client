import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cj")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 769982607
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1099171469
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1768966103
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -899309113
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1062677145
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("ar")
	@Export("action")
	String action;
	@ObfuscatedName("ag")
	@Export("target")
	String target;

	MenuAction() {
	}
}
