import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
public class class211 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -927593181
	)
	@Export("KitDefinition_fileCount")
	public static int KitDefinition_fileCount;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	public UrlRequest field2339;
	@ObfuscatedName("ay")
	public float[] field2334;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	final class221 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lii;)V"
	)
	class211(class221 var1) {
		this.this$0 = var1;
		this.field2334 = new float[4];
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I)V",
		garbageValue = "601510149"
	)
	static void method4557(WorldView var0) {
		int var1 = var0.playerUpdateManager.playerCount;
		int[] var2 = var0.playerUpdateManager.playerIndices;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (var2[var3] != Client.combatTargetPlayerIndex && var2[var3] != Client.localPlayerIndex) {
				KitDefinition.addPlayerToScene(var0, var2[var3], true);
			}
		}

	}
}
