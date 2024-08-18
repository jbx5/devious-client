import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(4, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(2, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(3, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	@Export("TOKEN")
	TOKEN(0, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	field1655(1, 4);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1948868211
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -576778695
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "23"
	)
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "342446280"
	)
	public static int method3313(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public static void method3309() {
		NPCComposition.NpcDefinition_cached.clear();
		NPCComposition.NpcDefinition_cachedModels.clear();
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1909798753"
	)
	static final void method3312() {
		Client.field803 = Client.cycleCntr;
		WorldMapIcon_0.field3124 = true;
	}
}
