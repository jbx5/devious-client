import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("aq")
	@Export("Tiles_underlays2")
	static byte[][][] Tiles_underlays2;

	static {
		TriBool_unknown = new TriBool();
		TriBool_true = new TriBool();
		TriBool_false = new TriBool();
	}

	TriBool() {
	}
}
