import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class230 {
	@ObfuscatedName("ae")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("am")
	final int[][] field2448;
	@ObfuscatedName("ap")
	final int[][] field2451;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 593487099
	)
	int field2449;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1095654145
	)
	int field2447;
	@ObfuscatedName("aq")
	final int[] field2450;
	@ObfuscatedName("ar")
	final int[] field2452;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 391128207
	)
	final int field2453;

	class230(int var1, int var2) {
		this.field2448 = new int[var1][var2];
		this.field2451 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = ItemContainer.method2347(var3 / 4);
		this.field2450 = new int[var4];
		this.field2452 = new int[var4];
		this.field2453 = var4 - 1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method4510() {
		for (int var1 = 0; var1 < this.field2448.length; ++var1) {
			for (int var2 = 0; var2 < this.field2448[var1].length; ++var2) {
				this.field2448[var1][var2] = 0;
				this.field2451[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "405413434"
	)
	void method4532(int var1, int var2) {
		this.field2449 = var1;
		this.field2447 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "203250583"
	)
	int method4513() {
		return this.field2449;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-72"
	)
	int method4534() {
		return this.field2447;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	int method4535() {
		return this.field2448.length;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1777947748"
	)
	int method4528() {
		return this.field2448[0].length;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "5"
	)
	int[][] method4517() {
		return this.field2448;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "490790935"
	)
	int[][] method4518() {
		return this.field2451;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "832064942"
	)
	int[] method4516() {
		return this.field2450;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "164"
	)
	int[] method4520() {
		return this.field2452;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2096562467"
	)
	int method4521() {
		return this.field2453;
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2045050251"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class93.clientPreferences.updateRoofsHidden(!class93.clientPreferences.isRoofsHidden());
			if (class93.clientPreferences.isRoofsHidden()) {
				GrandExchangeEvents.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				GrandExchangeEvents.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = HealthBar.method2644(var0.substring(5).trim()) == 1;
			VertexNormal.client.method513(var1);
			Rasterizer3D.method5247(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class93.clientPreferences.toggleDisplayFps();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				GrandExchangeOfferUnitPriceComparator.worldMap.showCoord = !GrandExchangeOfferUnitPriceComparator.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class93.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class93.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				Messages.method2849();
			}
		}

		PacketBufferNode var2 = class482.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var0.length() + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}
}
