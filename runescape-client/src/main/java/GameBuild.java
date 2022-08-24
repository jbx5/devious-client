import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kt")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lkt;")
	@Export("LIVE")
	static final GameBuild LIVE = new GameBuild("LIVE", 0);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lkt;")
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lkt;")
	@Export("RC")
	static final GameBuild RC = new GameBuild("RC", 1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lkt;")
	@Export("WIP")
	static final GameBuild WIP = new GameBuild("WIP", 2);

	@ObfuscatedName("lj")
	@ObfuscatedSignature(descriptor = "Lhl;")
	@Export("textureProvider")
	static TextureProvider textureProvider;

	@ObfuscatedName("c")
	@Export("name")
	public final String name;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1346396169)
	@Export("buildId")
	final int buildId;

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}
}