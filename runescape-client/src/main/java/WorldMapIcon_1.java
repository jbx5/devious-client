import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1446721503
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lld;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1684838669
	)
	@Export("element")
	int element;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -472541591
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1073787659
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnm;Lnm;ILld;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "902953011"
	)
	@Export("init")
	void init() {
		this.element = class273.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class142.WorldMapElement_get(this.element));
		WorldMapElement var1 = class142.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1570517373"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lls;",
		garbageValue = "43"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-288166594"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1390628388"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "-120"
	)
	public static void method5778(ArrayList var0, int var1, int var2, int var3, int var4) {
		class334.field3619.clear();
		class334.field3619.addAll(var0);
		class433.method8269(var1, var2, var3, var4);
	}
}
