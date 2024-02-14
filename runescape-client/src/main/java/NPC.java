import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1907913849
	)
	static int field1336;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1186841139
	)
	static int field1338;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("aw")
	String field1331;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1087694615
	)
	int field1333;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	class534 field1335;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1336 = 1;
		field1338 = 1;
	}

	NPC() {
		this.field1331 = "";
		this.field1333 = 31;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1862297226"
	)
	void method2655(String var1) {
		this.field1331 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1036754463"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? MilliClock.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? MilliClock.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = VarpDefinition.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2469(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1255 != 0 && Client.cycle >= super.field1262 && Client.cycle < super.field1278) {
					var3.overrideHue = super.field1268;
					var3.overrideSaturation = super.field1269;
					var3.overrideLuminance = super.field1276;
					var3.overrideAmount = super.field1255;
					var3.field3059 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "10"
	)
	void method2656(int var1) {
		this.field1333 = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1259360590"
	)
	boolean method2663(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1333 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-10354"
	)
	final String method2670() {
		if (!this.field1331.isEmpty()) {
			return this.field1331;
		} else {
			NPCComposition var1 = this.definition;
			if (var1.transforms != null) {
				var1 = var1.transform();
				if (var1 == null) {
					var1 = this.definition;
				}
			}

			return var1.name;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILip;B)V",
		garbageValue = "-37"
	)
	final void method2659(int var1, class233 var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && MilliClock.SequenceDefinition_get(super.sequence).field2273 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-36"
	)
	final void method2654(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && MilliClock.SequenceDefinition_get(super.sequence).field2273 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = class233.field2470;
				return;
			}
		}

		super.pathLength = 0;
		super.field1280 = 0;
		super.field1279 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1212 * 64 + super.pathX[0] * 128;
		super.y = super.field1212 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1562647560"
	)
	int[] method2715() {
		return this.field1335 != null ? this.field1335.method9715() : this.definition.method3700();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1297485115"
	)
	short[] method2722() {
		return this.field1335 != null ? this.field1335.method9708() : this.definition.method3743();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-475468119"
	)
	void method2665(int var1, int var2, short var3) {
		if (this.field1335 == null) {
			this.field1335 = new class534(this.definition);
		}

		this.field1335.method9709(var1, var2, var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1715910336"
	)
	void method2666(int[] var1, short[] var2) {
		if (this.field1335 == null) {
			this.field1335 = new class534(this.definition);
		}

		this.field1335.method9710(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-733260413"
	)
	void method2667() {
		this.field1335 = null;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "1917572256"
	)
	void method2713(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lht;",
		garbageValue = "0"
	)
	NpcOverrides method2669() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)V",
		garbageValue = "-29"
	)
	void method2703(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "16409"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-661178984"
	)
	void method2671() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1024972526"
	)
	void method2672() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	static final void method2711() {
		SecureRandomCallable.method2319("You can't add yourself to your own ignore list");
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "63808758"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class30.clientPreferences.updateRoofsHidden(!class30.clientPreferences.isRoofsHidden());
			if (class30.clientPreferences.isRoofsHidden()) {
				class209.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				class209.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = class129.method3066(var0.substring(5).trim()) == 1;
			class193.client.method471(var1);
			Rasterizer3D.method5278(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class30.clientPreferences.toggleDisplayFps();
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
				Tiles.worldMap.showCoord = !Tiles.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class30.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class30.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				Huffman.method6966();
			}
		}

		PacketBufferNode var2 = ViewportMouse.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(var0.length() + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}
}
