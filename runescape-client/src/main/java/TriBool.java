import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ra")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("vd")
	@ObfuscatedGetter(
		intValue = -1581283721
	)
	static int field4718;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}
}
