import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fx")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(4, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(0, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(1, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("TOKEN")
	TOKEN(2, 3),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	field1660(3, 4);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 158462547
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 579504551
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}
}
