import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("if")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1371988127)
	@Export("objectDefinitionId")
	final int objectDefinitionId;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -761624157)
	@Export("decoration")
	final int decoration;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -863337605)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1361182691")
	public static int method4914(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("kv")
	@ObfuscatedSignature(descriptor = "(Lkn;B)Ljava/lang/String;", garbageValue = "87")
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}