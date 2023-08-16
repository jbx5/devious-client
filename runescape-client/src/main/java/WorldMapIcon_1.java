import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1715668973
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -492354983
	)
	@Export("element")
	int element;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1339483923
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 722115699
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lmc;Lmc;ILjm;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	@Export("init")
	void init() {
		this.element = WorldMapElement.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(class138.WorldMapElement_get(this.element));
		WorldMapElement var1 = class138.WorldMapElement_get(this.getElement());
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
		garbageValue = "2135662389"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lkq;",
		garbageValue = "-2114244458"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-655814171"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-816534170"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "22"
	)
	public static int method5088(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-16"
	)
	static final void method5076() {
		PacketBufferNode var0 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field887 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class92.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class218.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field887 = false;
	}
}
