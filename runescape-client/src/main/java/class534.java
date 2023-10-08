import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uh")
public class class534 implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	public static final class534 field5199;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	public static final class534 field5192;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	static final class534 field5193;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	static final class534 field5194;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	static final class534 field5196;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Luh;"
	)
	static final class534 field5191;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 489327063
	)
	final int field5197;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1780220637
	)
	final int field5195;

	static {
		field5199 = new class534(5, 0);
		field5192 = new class534(2, 2);
		field5193 = new class534(1, 5);
		field5194 = new class534(3, 6);
		field5196 = new class534(4, 7);
		field5191 = new class534(0, 8);
	}

	class534(int var1, int var2) {
		this.field5197 = var1;
		this.field5195 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5195;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "91579028"
	)
	public boolean method9506() {
		return this == field5192;
	}
}
