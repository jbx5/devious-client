import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("AttackOption")
public enum AttackOption implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1396(2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	field1395(4);

	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -517768429
	)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Ljava/lang/String;Ljava/lang/String;I)Lvc;",
		garbageValue = "-1770095722"
	)
	@Export("SpriteBuffer_getIndexedSpriteByName")
	public static IndexedSprite SpriteBuffer_getIndexedSpriteByName(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			IndexedSprite var5;
			if (!class53.method1110(var0, var3, var4)) {
				var5 = null;
			} else {
				var5 = Client.method1956();
			}

			return var5;
		}
	}
}
