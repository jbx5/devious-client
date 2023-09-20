import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ac")
	@Export("text")
	String text;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 549349419
	)
	@Export("width")
	int width;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1069492799
	)
	@Export("height")
	int height;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILka;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1591685204"
	)
	public static int method5653(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-26"
	)
	static int method5654(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(Ldc;I)V",
		garbageValue = "-1071136907"
	)
	static void method5655(NPC var0) {
		var0.field1189 = var0.definition.size;
		var0.field1216 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2059;
		var0.field1217 = var0.definition.field2060;
		var0.field1202 = var0.definition.field2061;
		var0.field1201 = var0.definition.field2088;
		var0.field1196 = var0.definition.field2063;
		var0.field1203 = var0.definition.field2064;
		var0.field1219 = var0.definition.field2065;
		var0.field1205 = var0.definition.field2074;
	}
}
