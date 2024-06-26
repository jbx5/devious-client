import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("VarbitDefinition_cached")
	static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("an")
	static final int[] field2107;
	@ObfuscatedName("us")
	@ObfuscatedGetter(
		intValue = 1654877821
	)
	static int field2102;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -403599393
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -957731269
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -989672663
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field2107 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2107[var1] = var0 - 1;
			var0 += var0;
		}

	}

	VarbitComposition() {
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvp;B)V",
		garbageValue = "109"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)V",
		garbageValue = "-2018721401"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1718879795"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		ArchiveDiskAction.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1702551401"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			class137.method3187(0, 0);
		} else if (var0 != -1 && !class237.method4469(var0) && class105.clientPreferences.getMusicVolume() != 0) {
			ArrayList var1 = new ArrayList();
			var1.add(new MusicSong(class199.archive6, var0, 0, class105.clientPreferences.getMusicVolume(), false));
			if (Client.playingJingle) {
				class157.method3343(var1, 0, 100, 100, 0);
			} else {
				FontName.method9220(var1, 0, 100, 100, 0, false);
			}
		}

	}
}
