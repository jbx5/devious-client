import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ng")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown = new TriBool();

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("TriBool_true")
	public static final TriBool TriBool_true = new TriBool();

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lng;")
	@Export("TriBool_false")
	public static final TriBool TriBool_false = new TriBool();

	TriBool() {
	}
}