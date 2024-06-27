import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("ap")
	@Export("name")
	public final String name;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 43822321
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
