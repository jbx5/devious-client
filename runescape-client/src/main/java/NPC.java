import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1582882849
	)
	static int field1349;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2050335803
	)
	static int field1351;
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -982531667
	)
	static int field1350;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ad")
	String field1344;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -782127427
	)
	int field1345;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvi;"
	)
	class547 field1352;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1349 = 1;
		field1351 = 1;
	}

	NPC() {
		this.field1344 = "";
		this.field1345 = 31;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Llv;",
		garbageValue = "-543123602"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class353.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? class353.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = SoundCache.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2476(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1239 != 0 && Client.cycle >= super.field1251 && Client.cycle < super.field1215) {
					var3.overrideHue = super.field1223;
					var3.overrideSaturation = super.field1254;
					var3.overrideLuminance = super.field1255;
					var3.overrideAmount = super.field1239;
					var3.field3156 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "382991979"
	)
	void method2698(String var1) {
		this.field1344 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-13"
	)
	void method2700(int var1) {
		this.field1345 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "4"
	)
	boolean method2752(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1345 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1556267325"
	)
	final String method2702() {
		if (!this.field1344.isEmpty()) {
			return this.field1344;
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILjb;B)V",
		garbageValue = "31"
	)
	final void method2703(int var1, class238 var2) {
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

		if (super.sequence != -1 && class353.SequenceDefinition_get(super.sequence).field2283 == 1) {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-122"
	)
	final void method2704(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class353.SequenceDefinition_get(super.sequence).field2283 == 1) {
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
				super.pathTraversed[0] = class238.field2519;
				return;
			}
		}

		super.pathLength = 0;
		super.field1265 = 0;
		super.field1264 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1194 * 64 + super.pathX[0] * 128;
		super.y = super.field1194 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-509525809"
	)
	int[] method2707() {
		return this.field1352 != null ? this.field1352.method9802() : this.definition.method3713();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)[S",
		garbageValue = "19445"
	)
	short[] method2720() {
		return this.field1352 != null ? this.field1352.method9811() : this.definition.method3715();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "16"
	)
	void method2709(int var1, int var2, short var3) {
		if (this.field1352 == null) {
			this.field1352 = new class547(this.definition);
		}

		this.field1352.method9804(var1, var2, var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "429368392"
	)
	void method2710(int[] var1, short[] var2) {
		if (this.field1352 == null) {
			this.field1352 = new class547(this.definition);
		}

		this.field1352.method9805(var1, var2);
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-41"
	)
	void method2723() {
		this.field1352 = null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)V",
		garbageValue = "-740821724"
	)
	void method2712(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)Lhh;",
		garbageValue = "1"
	)
	NpcOverrides method2762() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lhh;I)V",
		garbageValue = "-549252376"
	)
	void method2714(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1756478951"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method2715() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1090831740"
	)
	void method2729() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-30"
	)
	int vmethod2708() {
		return this.definition.field2030 == -1 ? super.defaultHeight : this.definition.field2030;
	}

	@ObfuscatedName("pk")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1326777473"
	)
	public static void method2713(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = class170.getPacketBufferNode(ClientPacket.field3338, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeShortLE(var0);
		var4.packetBuffer.writeShortAdd(var1);
		var4.packetBuffer.writeByteNeg(var2);
		var4.packetBuffer.writeIntLE(var3 ? Client.revision : 0);
		Client.packetWriter.addNode(var4);
	}
}
