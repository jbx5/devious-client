import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
public class class272 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lez;"
	)
	class129[] field2824;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -499072147
	)
	int field2825;

	@ObfuscatedSignature(
		descriptor = "(Luq;I)V"
	)
	class272(Buffer var1, int var2) {
		this.field2824 = new class129[var2];
		this.field2825 = var1.readUnsignedByte();

		for (int var3 = 0; var3 < this.field2824.length; ++var3) {
			class129 var4 = new class129(this.field2825, var1, false);
			this.field2824[var3] = var4;
		}

		this.method5346();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1213682834"
	)
	void method5346() {
		class129[] var1 = this.field2824;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class129 var3 = var1[var2];
			if (var3.field1528 >= 0) {
				var3.field1522 = this.field2824[var3.field1528];
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1286921639"
	)
	public int method5345() {
		return this.field2824.length;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lez;",
		garbageValue = "982767209"
	)
	class129 method5358(int var1) {
		return var1 >= this.method5345() ? null : this.field2824[var1];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)[Lez;",
		garbageValue = "378280238"
	)
	class129[] method5347() {
		return this.field2824;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lfc;II)V",
		garbageValue = "-880621741"
	)
	void method5350(class140 var1, int var2) {
		this.method5353(var1, var2, (boolean[])null, false);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I[ZZB)V",
		garbageValue = "0"
	)
	void method5353(class140 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method3155();
		int var6 = 0;
		class129[] var7 = this.method5347();

		for (int var8 = 0; var8 < var7.length; ++var8) {
			class129 var9 = var7[var8];
			if (var3 == null || var4 == var3[var6]) {
				var1.method3159(var2, var9, var6, var5);
			}

			++var6;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[Lni;",
		garbageValue = "-35"
	)
	static class363[] method5371() {
		return new class363[]{class363.field3967, class363.field3964};
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-124"
	)
	@Export("clearItemContainer")
	static void clearItemContainer(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.ids.length; ++var2) {
				var1.ids[var2] = -1;
				var1.quantities[var2] = 0;
			}

		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "80"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + var6 * Tiles.Tiles_heights[var5][var3 + 1][var4] >> 7;
			int var9 = Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] * var6 + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7;
			return var7 * var9 + var8 * (128 - var7) >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1341670447"
	)
	static final void method5372() {
		PacketBufferNode var0 = ViewportMouse.getPacketBufferNode(ClientPacket.field3243, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field894 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				SecureRandomFuture.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			UserComparator5.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field894 = false;
	}
}
