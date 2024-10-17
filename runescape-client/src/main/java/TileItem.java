import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1119456901
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1423952523
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1776238929
	)
	@Export("visibleTime")
	int visibleTime;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1942930379
	)
	@Export("despawnTime")
	int despawnTime;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1139570287
	)
	@Export("ownership")
	int ownership;
	@ObfuscatedName("ay")
	@Export("isPrivate")
	boolean isPrivate;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 204108455
	)
	@Export("flag")
	int flag;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lgz;"
	)
	PlayerCompositionColorTextureOverride field1409;

	TileItem() {
		this.flag = 31;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "35877037"
	)
	@Export("setFlag")
	void setFlag(int var1) {
		this.flag = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1387747084"
	)
	boolean method3055(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.flag & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lgz;B)V",
		garbageValue = "-72"
	)
	void method3054(PlayerCompositionColorTextureOverride var1) {
		this.field1409 = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lgz;",
		garbageValue = "-1989455167"
	)
	PlayerCompositionColorTextureOverride method3050() {
		return this.field1409;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-204046417"
	)
	void method3056() {
		this.field1409 = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljy;",
		garbageValue = "1885718735"
	)
	@Export("getModel")
	protected final Model getModel() {
		ItemComposition var1 = Bounds.ItemDefinition_get(this.id);
		return this.field1409 == null ? var1.getModel(this.quantity) : var1.method4295(this.field1409);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfv;FFFFFFFFI)V",
		garbageValue = "-130623416"
	)
	static void method3065(class137 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			var0.field1598 = var1;
			float var9 = var4 - var1;
			float var10 = var8 - var5;
			float var11 = var2 - var1;
			float var12 = 0.0F;
			float var13 = 0.0F;
			if (var11 != 0.0F) {
				var12 = (var6 - var5) / var11;
			}

			var11 = var4 - var3;
			if (var11 != 0.0F) {
				var13 = (var8 - var7) / var11;
			}

			float var14 = 1.0F / (var9 * var9);
			float var15 = var9 * var12;
			float var16 = var13 * var9;
			var0.field1600 = (var16 + var15 - var10 - var10) * var14 / var9;
			var0.field1601 = (var10 + var10 + var10 - var15 - var15 - var16) * var14;
			var0.field1592 = var12;
			var0.field1603 = var5;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "470341851"
	)
	static void method3067(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "57"
	)
	static final void method3066(boolean var0) {
		class149.method3569();
		++Client.packetWriter.pendingWrites;
		if (Client.packetWriter.pendingWrites >= 50 || var0) {
			Client.packetWriter.pendingWrites = 0;
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
				PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var1);

				try {
					Client.packetWriter.flush();
				} catch (IOException var3) {
					Client.hadNetworkError = true;
				}
			}

		}
	}
}
