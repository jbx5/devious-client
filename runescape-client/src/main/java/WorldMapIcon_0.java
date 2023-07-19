import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kf")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 1871628579
	)
	static int field2956;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -305934713
	)
	@Export("element")
	final int element;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lka;"
	)
	@Export("label")
	final WorldMapLabel label;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -525157045
	)
	@Export("subWidth")
	final int subWidth;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1245590647
	)
	@Export("subHeight")
	final int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmr;Lmr;ILka;)V"
	)
	WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
		super(var1, var2);
		this.element = var3;
		this.label = var4;
		WorldMapElement var5 = SequenceDefinition.WorldMapElement_get(this.getElement());
		SpritePixels var6 = var5.getSpriteBool(false);
		if (var6 != null) {
			this.subWidth = var6.subWidth;
			this.subHeight = var6.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1799088869"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Lka;",
		garbageValue = "8220"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "81"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-565304787"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}
}
