import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1703078717
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 476220859
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1482046621
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1192362423
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1901856087
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("w")
	@Export("action")
	String action;
	@ObfuscatedName("s")
	@Export("target")
	String target;

	MenuAction() {
	} // L: 12250

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "87"
	)
	public static boolean method2030(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 25
	}
}
