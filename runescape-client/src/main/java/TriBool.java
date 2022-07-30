import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nm")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lnm;")
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown = new TriBool();

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lnm;")
	@Export("TriBool_true")
	public static final TriBool TriBool_true = new TriBool();

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lnm;")
	@Export("TriBool_false")
	public static final TriBool TriBool_false = new TriBool();

	TriBool() {
	}
}