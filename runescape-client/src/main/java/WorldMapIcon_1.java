import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("wt")
	@ObfuscatedSignature(
		descriptor = "Ldl;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 819296275
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -949927081
	)
	@Export("element")
	int element;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -2079223453
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 331046403
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmh;Lmh;ILjl;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-450829681"
	)
	@Export("init")
	void init() {
		this.element = WorldMapSection2.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class141.WorldMapElement_get(this.element));
		WorldMapElement var1 = class141.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "574784276"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljk;",
		garbageValue = "-49"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "472460923"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-653051141"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-26"
	)
	static void method4514(int var0) {
		Client.oculusOrbState = var0;
	}
}
