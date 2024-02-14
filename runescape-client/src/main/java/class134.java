import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fj")
public class class134 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1595;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1607;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1596;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1613;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1598;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1599;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1600;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1601;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1602;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1603;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1608;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1605;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1606;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1594;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1609;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1604;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	static final class134 field1610;
	@ObfuscatedName("gf")
	@Export("gameSessionServiceBaseUrl")
	static String gameSessionServiceBaseUrl;
	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1953087335
	)
	final int field1611;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -895136985
	)
	final int field1612;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1661970145
	)
	final int field1615;

	static {
		field1595 = new class134(0, 0, (String)null, -1, -1);
		field1607 = new class134(1, 1, (String)null, 0, 2);
		field1596 = new class134(2, 2, (String)null, 1, 2);
		field1613 = new class134(3, 3, (String)null, 2, 2);
		field1598 = new class134(4, 4, (String)null, 3, 1);
		field1599 = new class134(5, 5, (String)null, 4, 1);
		field1600 = new class134(6, 6, (String)null, 5, 1);
		field1601 = new class134(7, 7, (String)null, 6, 3);
		field1602 = new class134(8, 8, (String)null, 7, 3);
		field1603 = new class134(9, 9, (String)null, 8, 3);
		field1608 = new class134(10, 10, (String)null, 0, 7);
		field1605 = new class134(11, 11, (String)null, 1, 7);
		field1606 = new class134(12, 12, (String)null, 2, 7);
		field1594 = new class134(13, 13, (String)null, 3, 7);
		field1609 = new class134(14, 14, (String)null, 4, 7);
		field1604 = new class134(15, 15, (String)null, 5, 7);
		field1610 = new class134(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class134(int var1, int var2, String var3, int var4, int var5) {
		this.field1611 = var1;
		this.field1612 = var2;
		this.field1615 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1612;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "87"
	)
	int method3124() {
		return this.field1615;
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "104"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class30.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			Client.field554[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
