import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kf")
@Implements("GameBuild")
public class GameBuild {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lkf;")
	@Export("LIVE")
	static final GameBuild LIVE = new GameBuild("LIVE", 0);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lkf;")
	@Export("BUILDLIVE")
	static final GameBuild BUILDLIVE = new GameBuild("BUILDLIVE", 3);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lkf;")
	@Export("RC")
	static final GameBuild RC = new GameBuild("RC", 1);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lkf;")
	@Export("WIP")
	static final GameBuild WIP = new GameBuild("WIP", 2);

	@ObfuscatedName("c")
	@Export("name")
	public final String name;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 825558575)
	@Export("buildId")
	final int buildId;

	GameBuild(String var1, int var2) {
		this.name = var1;
		this.buildId = var2;
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-2142697491")
	static void method5758(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}
}