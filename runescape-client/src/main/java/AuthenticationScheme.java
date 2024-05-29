import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(2, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(3, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(4, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	@Export("TOKEN")
	TOKEN(0, 3),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	field1674(1, 4);

	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -510503497
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1684075565
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}
}
