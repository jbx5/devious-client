import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(2, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(3, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	@Export("TOKEN")
	TOKEN(4, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	field1550(1, 4);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lvt;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2005023865
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1179469489
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}
}
