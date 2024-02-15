import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cb")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("cf")
	@Export("otp")
	static String otp;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -152157689
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 834502213
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1900928069
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -298892889
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -785738783
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("as")
	@Export("action")
	String action;
	@ObfuscatedName("aa")
	@Export("target")
	String target;

	MenuAction() {
	}
}
