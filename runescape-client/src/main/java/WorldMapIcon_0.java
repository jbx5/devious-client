import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hz")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("iz")
	@ObfuscatedGetter(intValue = 2063269649)
	@Export("selectedItemId")
	static int selectedItemId;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -717867737)
	@Export("element")
	final int element;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("label")
	final WorldMapLabel label;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -466218723)
	@Export("subWidth")
	final int subWidth;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1083440853)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(descriptor = "(Lkd;Lkd;ILiz;)V")
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = class432.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "781292504")
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Liz;", garbageValue = "1473728")
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1263012412")
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-34")
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(descriptor = "(Lkb;I)Ljava/lang/String;", garbageValue = "-1970746569")
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (WorldMapID.Widget_unpackTargetMask(class124.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}