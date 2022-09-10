import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("TriBool")
public class TriBool {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("TriBool_unknown")
	public static final TriBool TriBool_unknown;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("TriBool_true")
	public static final TriBool TriBool_true;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	@Export("TriBool_false")
	public static final TriBool TriBool_false;
	@ObfuscatedName("j")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;

	static {
		TriBool_unknown = new TriBool(); // L: 4
		TriBool_true = new TriBool(); // L: 5
		TriBool_false = new TriBool(); // L: 6
	}

	TriBool() {
	} // L: 8
}
