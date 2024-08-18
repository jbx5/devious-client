import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public enum class132 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1540(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1545(1, 1),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1542(2, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1543(3, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1544(4, 4);

	@ObfuscatedName("th")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1850990691
	)
	final int field1541;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1561855163
	)
	final int field1546;

	class132(int var3, int var4) {
		this.field1541 = var3;
		this.field1546 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1546;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1710418171"
	)
	static final int method3183(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lcf;I)V",
		garbageValue = "2043360595"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			class108.method2859(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			Archive var1 = class59.archive8;
			int var2 = var0.properties;
			if ((var2 & class543.field5357.rsOrdinal()) != 0) {
				FillMode.logoSprite = class109.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var2 & class543.field5358.rsOrdinal()) != 0) {
				FillMode.logoSprite = class109.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var2 & class543.field5336.rsOrdinal()) != 0) {
				FillMode.logoSprite = class109.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else {
				FillMode.logoSprite = class109.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}
		}

		class498.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		CollisionMap.field2948 = var0.field810;
		SoundCache.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class253.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		VarpDefinition.currentPort = SoundCache.worldPort;
	}
}
