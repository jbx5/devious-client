import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("af")
	@Export("name")
	public final String name;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -405984643
	)
	@Export("buildId")
	final int buildId;

	static {
		LIVE = new GameBuild("LIVE", 0);
		BUILDLIVE = new GameBuild("BUILDLIVE", 3);
		RC = new GameBuild("RC", 1);
		WIP = new GameBuild("WIP", 2);
	}

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}
}
