import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("hr")
	static SecureRandom field3044;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 291747763
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 511247127
	)
	@Export("element")
	int element;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2054761841
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1788164067
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnv;Lnv;ILkv;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1224680378"
	)
	@Export("init")
	void init() {
		this.element = class222.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class104.WorldMapElement_get(this.element));
		WorldMapElement var1 = class104.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Llk;",
		garbageValue = "-1430269717"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-48"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "16609"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}
}
