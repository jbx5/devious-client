import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1282067951
	)
	static int field1325;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -643167983
	)
	static int field1333;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ae")
	String field1330;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -111138695
	)
	int field1328;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	class515 field1329;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1325 = 1;
		field1333 = 1;
	}

	NPC() {
		this.field1330 = "";
		this.field1328 = 31;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1576222812"
	)
	void method2569(String var1) {
		this.field1330 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljr;",
		garbageValue = "798227647"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? EnumComposition.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? EnumComposition.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = VarbitComposition.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2379(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1250 != 0 && Client.cycle >= super.field1258 && Client.cycle < super.field1200) {
					var3.overrideHue = super.field1260;
					var3.overrideSaturation = super.field1218;
					var3.overrideLuminance = super.field1212;
					var3.overrideAmount = super.field1250;
					var3.field2778 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-979887943"
	)
	void method2570(int var1) {
		this.field1328 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1720448953"
	)
	boolean method2571(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1328 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1406418583"
	)
	final String method2572() {
		if (!this.field1330.isEmpty()) {
			return this.field1330;
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILin;I)V",
		garbageValue = "1389933188"
	)
	final void method2573(int var1, class217 var2) {
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

		if (super.sequence != -1 && EnumComposition.SequenceDefinition_get(super.sequence).field2326 == 1) {
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2120679358"
	)
	final void method2574(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && EnumComposition.SequenceDefinition_get(super.sequence).field2326 == 1) {
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
				super.pathTraversed[0] = class217.field2410;
				return;
			}
		}

		super.pathLength = 0;
		super.field1261 = 0;
		super.field1271 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1201 * -876008384 + super.pathX[0] * 128;
		super.y = super.field1201 * -876008384 + super.pathY[0] * 128;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2108949560"
	)
	int[] method2577() {
		return this.field1329 != null ? this.field1329.method9299() : this.definition.method3698();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)[S",
		garbageValue = "17216"
	)
	short[] method2597() {
		return this.field1329 != null ? this.field1329.method9300() : this.definition.method3700();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-1331637163"
	)
	void method2623(int var1, int var2, short var3) {
		if (this.field1329 == null) {
			this.field1329 = new class515(this.definition);
		}

		this.field1329.method9301(var1, var2, var3);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "1783936038"
	)
	void method2580(int[] var1, short[] var2) {
		if (this.field1329 == null) {
			this.field1329 = new class515(this.definition);
		}

		this.field1329.method9302(var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "707622194"
	)
	void method2581() {
		this.field1329 = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)V",
		garbageValue = "244947071"
	)
	void method2608(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lhq;",
		garbageValue = "1386769503"
	)
	NpcOverrides method2583() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhq;B)V",
		garbageValue = "-37"
	)
	void method2584(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "381940201"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1283231682"
	)
	void method2582() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	void method2586() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1698780109"
	)
	public static int method2636(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIB)V",
		garbageValue = "-51"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (SongTask.isWorldMapEvent(var0.type)) {
			GrandExchangeOfferOwnWorldComparator.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = class138.WorldMapElement_get(GrandExchangeOfferOwnWorldComparator.worldMapEvent.mapElement);
			var4 = GrandExchangeOfferWorldComparator.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = class133.getScript(var5);
		}

		if (var4 != null) {
			class147.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-59"
	)
	public static void method2637(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3134, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByteNeg(var2);
		var4.packetBuffer.writeShort(var1);
		var4.packetBuffer.writeIntIME(var3 ? Client.field626 : 0);
		var4.packetBuffer.writeShortAdd(var0);
		Client.packetWriter.addNode(var4);
	}
}
