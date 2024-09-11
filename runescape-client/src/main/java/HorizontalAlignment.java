import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	field1984(1, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(2, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	field1985(0, 2);

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lvt;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("archive6")
	static Archive archive6;
	@ObfuscatedName("uu")
	@ObfuscatedGetter(
		intValue = 306709445
	)
	static int field1989;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1047412351
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1120544733
	)
	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpo;Lpo;I)V",
		garbageValue = "227743359"
	)
	public static void method3957(AbstractArchive var0, AbstractArchive var1) {
		SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
		SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lpo;II)V",
		garbageValue = "-1780316495"
	)
	static void method3960(AbstractArchive var0, int var1) {
		if ((var1 & class545.field5393.rsOrdinal()) != 0) {
			UserComparator8.logoSprite = Buddy.SpriteBuffer_getIndexedSpriteByName(var0, "logo_deadman_mode", "");
		} else if ((var1 & class545.field5376.rsOrdinal()) != 0) {
			UserComparator8.logoSprite = Buddy.SpriteBuffer_getIndexedSpriteByName(var0, "logo_seasonal_mode", "");
		} else if ((var1 & class545.field5372.rsOrdinal()) != 0) {
			UserComparator8.logoSprite = Buddy.SpriteBuffer_getIndexedSpriteByName(var0, "logo_speedrunning", "");
		} else {
			UserComparator8.logoSprite = Buddy.SpriteBuffer_getIndexedSpriteByName(var0, "logo", "");
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1891253869"
	)
	static final boolean method3958(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-97"
	)
	static int method3953(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = MidiPcmStream.method6507() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
