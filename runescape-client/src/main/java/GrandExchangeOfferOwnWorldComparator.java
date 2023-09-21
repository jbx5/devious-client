import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("fv")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field515;
	@ObfuscatedName("va")
	@ObfuscatedGetter(
		intValue = 44170089
	)
	static int field516;
	@ObfuscatedName("ac")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lod;Lod;S)I",
		garbageValue = "255"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) {
			return 0;
		} else {
			if (this.filterWorlds) {
				if (Client.worldId == var1.world) {
					return -1;
				}

				if (var2.world == Client.worldId) {
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2097816691"
	)
	public static int method1242(int var0) {
		return SecureRandomFuture.Entity_unpackID(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/lang/Object;",
		garbageValue = "29"
	)
	static Object method1241(int var0) {
		return ItemContainer.method2290((class517)SequenceDefinition.findEnumerated(class517.method9047(), var0));
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Ldw;I)V",
		garbageValue = "-1344994052"
	)
	static final void method1237(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = class10.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = class10.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = class10.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = class10.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) {
			int var6 = class10.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = SecureRandomFuture.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1176 = var4;
		var0.field1178 = var5;
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "81"
	)
	static final void method1240() {
		PacketBufferNode var0 = ClanChannelMember.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field883 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				ArchiveDisk.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			ClanChannelMember.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field883 = false;
	}
}
