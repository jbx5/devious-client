import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2119585379
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1564918481
	)
	@Export("element")
	int element;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 444287351
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -663490299
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lns;Lns;ILjt;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "254378295"
	)
	@Export("init")
	void init() {
		this.element = class127.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class139.WorldMapElement_get(this.element));
		WorldMapElement var1 = class139.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "15490"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lja;",
		garbageValue = "422193319"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2018557821"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "264064121"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}
}
