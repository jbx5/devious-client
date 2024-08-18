import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("LIVE")
	static final GameBuild LIVE;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("RC")
	static final GameBuild RC;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("WIP")
	static final GameBuild WIP;
	@ObfuscatedName("ax")
	@Export("name")
	public final String name;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -939414837
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

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(Ldq;I)V",
		garbageValue = "-1400534599"
	)
	static void method7155(class94 var0) {
		if (Client.field779 != var0) {
			Client.field779 = var0;
		}
	}
}
