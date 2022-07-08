import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ce")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lce;")
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lce;")
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lce;")
	field1288(2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lce;")
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lce;")
	field1294(4);
	@ObfuscatedName("sx")
	@ObfuscatedSignature(descriptor = "Lar;")
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1078797137)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llh;IIIZI)V", garbageValue = "-2127504965")
	public static void method2410(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class272.musicPlayerStatus = 1;
		class272.musicTrackArchive = var0;
		class272.musicTrackGroupId = var1;
		class151.musicTrackFileId = var2;
		class272.musicTrackVolume = var3;
		class11.musicTrackBoolean = var4;
		class272.pcmSampleLength = 10000;
	}
}