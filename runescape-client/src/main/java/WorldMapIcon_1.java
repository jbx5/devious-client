import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jh")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1450931479
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -448614677
	)
	@Export("element")
	int element;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkm;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -229828633
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1283382419
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnl;Lnl;ILjc;)V"
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
		garbageValue = "-232242674"
	)
	@Export("init")
	void init() {
		this.element = HttpRequest.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class165.WorldMapElement_get(this.element));
		WorldMapElement var1 = class165.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "45"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Lkm;",
		garbageValue = "-1023557554"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2127260294"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1490832213"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "403847596"
	)
	public static void method4578() {
		class330.field3585.clear();
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1183965945"
	)
	static String method4580(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}
}
