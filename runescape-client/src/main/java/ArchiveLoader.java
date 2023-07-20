import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[[Lmt;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lni;"
	)
	static GameBuild field1044;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1277644673
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2051867733
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Lny;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0;
		this.archive = var1;
		this.groupCount = var1.getGroupCount();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1342854003"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0;

		for (int var1 = 0; var1 < this.groupCount; ++var1) {
			if (!this.archive.method6739(var1) || this.archive.method6715(var1)) {
				++this.loadedCount;
			}
		}

		return this.loadedCount >= this.groupCount;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1877487702"
	)
	public static void method2259(int var0, int var1, int var2, int var3) {
		class306.musicPlayerStatus = var0;
		class306.field3402 = var1;
		class306.field3403 = var2;
		class306.field3407 = var3;
	}

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1936332581"
	)
	static void method2260() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			GrandExchangeOfferNameComparator.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

	}
}
