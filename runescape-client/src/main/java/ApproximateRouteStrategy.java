import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIILko;I)Z",
		garbageValue = "1947951630"
	)
	@Export("hasArrived")
	protected boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;I)V",
		garbageValue = "258656331"
	)
	public static void method1262(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "290577893"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;Ljava/lang/String;Ljava/lang/String;I)Lqi;",
		garbageValue = "-685706408"
	)
	public static Font method1264(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		if (!var0.isValidFileName(var2, var3)) {
			return null;
		} else {
			int var4 = var0.getGroupId(var2);
			int var5 = var0.getFileId(var4, var3);
			return SecureRandomFuture.method2435(var0, var1, var4, var5);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1670529351"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(Lcr;III)V",
		garbageValue = "-2048475485"
	)
	static final void method1258(MenuAction var0, int var1, int var2) {
		if (var0 != null) {
			class276.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.worldViewId, var0.action, var0.target, var1, var2);
		}

	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "68273016"
	)
	@Export("drawWidgets")
	static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (class416.widgetDefinition.loadInterface(var0)) {
			HttpRequest.field40 = null;
			class166.drawInterface(class416.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
			if (HttpRequest.field40 != null) {
				class166.drawInterface(HttpRequest.field40, -1412584499, var1, var2, var3, var4, FriendLoginUpdate.field5002, class230.field2465, var7);
				HttpRequest.field40 = null;
			}

		} else {
			if (var7 != -1) {
				Client.validRootWidgets[var7] = true;
			} else {
				for (int var8 = 0; var8 < 100; ++var8) {
					Client.validRootWidgets[var8] = true;
				}
			}

		}
	}

	@ObfuscatedName("nu")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "256"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class113.getPacketBufferNode(ClientPacket.field3409, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
