import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(3, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(0, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(2, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("TOKEN")
	TOKEN(1, 3),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	field1472(4, 4);

	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -636253437
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1971092133
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int schemeId, int packetId) {
		this.schemeId = schemeId;
		this.packetId = packetId;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}
}
