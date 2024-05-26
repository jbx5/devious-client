import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1428899307
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1836164871
	)
	@Export("element")
	int element;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llh;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1038049103
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 91279571
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnj;Lnj;ILks;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "202"
	)
	@Export("init")
	void init() {
		this.element = HitSplatDefinition.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(WorldMapElement.WorldMapElement_get(this.element));
		WorldMapElement var1 = WorldMapElement.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "117980127"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Llh;",
		garbageValue = "48"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-601586149"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1569951837"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Luy;",
		garbageValue = "-834018017"
	)
	public static class533 method5497(int var0) {
		int var1 = class531.field5260[var0];
		if (var1 == 1) {
			return class533.field5263;
		} else if (var1 == 2) {
			return class533.field5267;
		} else {
			return var1 == 3 ? class533.field5266 : null;
		}
	}
}
