import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field1976(2, 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(0, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	field1970(1, 2);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	static ClanChannel field1973;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1640852387
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1968910549
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "-1336022419"
	)
	public static final void method3698(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) {
			PcmPlayer.field263 = var0;
			SecureRandomFuture.PcmPlayer_stereo = var1;
			class379.field4434 = var2;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
