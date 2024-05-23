import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class177 {
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("archive8")
	static Archive archive8;

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-2000150769"
	)
	public static int method3601(CharSequence var0) {
		return WorldMapSectionType.method5895(var0, 10, true);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "664099821"
	)
	public static void method3602() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIII)Ldk;",
		garbageValue = "50358831"
	)
	static final PendingSpawn method3603(class101 var0, int var1, int var2, int var3, int var4) {
		for (PendingSpawn var5 = (PendingSpawn)var0.field1342.last(); var5 != null; var5 = (PendingSpawn)var0.field1342.previous()) {
			if (var5.field1200 == var1 && var2 == var5.field1192 && var3 == var5.field1196 && var4 == var5.field1191) {
				return var5;
			}
		}

		return null;
	}
}
