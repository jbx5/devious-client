import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("td")
final class class518 implements class517 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luq;S)V",
		garbageValue = "25989"
	)
	public void vmethod9339(Object var1, Buffer var2) {
		this.method9293((Integer)var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)Ljava/lang/Object;",
		garbageValue = "-1139404213"
	)
	public Object vmethod9338(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Luq;B)V",
		garbageValue = "10"
	)
	void method9293(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1184828130"
	)
	static void method9298() {
		if (Client.field625 && VarpDefinition.localPlayer != null) {
			int var0 = VarpDefinition.localPlayer.pathX[0];
			int var1 = VarpDefinition.localPlayer.pathY[0];
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
				return;
			}

			Friend.oculusOrbFocalPointX = VarpDefinition.localPlayer.x;
			int var2 = class272.getTileHeight(VarpDefinition.localPlayer.x, VarpDefinition.localPlayer.y, class473.Client_plane) - Client.camFollowHeight;
			if (var2 < GrandExchangeOfferWorldComparator.field4449) {
				GrandExchangeOfferWorldComparator.field4449 = var2;
			}

			class59.oculusOrbFocalPointY = VarpDefinition.localPlayer.y;
			Client.field625 = false;
		}

	}
}
