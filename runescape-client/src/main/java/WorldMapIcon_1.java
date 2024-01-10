import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ju")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1750701703
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -139188615
	)
	@Export("element")
	int element;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljz;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1071349723
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1671717469
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmu;Lmu;ILjt;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "45666633"
	)
	@Export("init")
	void init() {
		this.element = class137.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(ConcurrentMidiTask.WorldMapElement_get(this.element));
		WorldMapElement var1 = ConcurrentMidiTask.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "833304324"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljz;",
		garbageValue = "1205973162"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-17"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1939845303"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1108761464"
	)
	static int method4627(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
