import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -563542583
	)
	static int field1364;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -556420941
	)
	static int field1366;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("al")
	String field1365;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1321693809
	)
	int field1361;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvs;"
	)
	class546 field1362;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1364 = 1;
		field1366 = 1;
	}

	NPC() {
		this.field1365 = "";
		this.field1361 = 31;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lkb;",
		garbageValue = "-852782106"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? FaceNormal.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : FaceNormal.SequenceDefinition_get(super.movementSequence);
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = class17.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2451(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1270 != 0 && Client.cycle >= super.field1265 && Client.cycle < super.field1266) {
					var3.overrideHue = super.field1267;
					var3.overrideSaturation = super.field1268;
					var3.overrideLuminance = super.field1269;
					var3.overrideAmount = super.field1270;
					var3.field2891 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "18"
	)
	void method2653(String var1) {
		this.field1365 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "517591977"
	)
	void method2678(int var1) {
		this.field1361 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-253209929"
	)
	boolean method2693(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1361 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1815081977"
	)
	final String method2656() {
		if (!this.field1365.isEmpty()) {
			return this.field1365;
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjv;I)V",
		garbageValue = "-1257539379"
	)
	final void method2657(int var1, class237 var2) {
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

		if (super.sequence != -1 && FaceNormal.SequenceDefinition_get(super.sequence).field2422 == 1) {
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
		descriptor = "(IIZI)V",
		garbageValue = "-1209588403"
	)
	final void method2658(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && FaceNormal.SequenceDefinition_get(super.sequence).field2422 == 1) {
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
				super.pathTraversed[0] = class237.field2525;
				return;
			}
		}

		super.pathLength = 0;
		super.field1226 = 0;
		super.field1278 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1208 * 64 + super.pathX[0] * 128;
		super.y = super.field1208 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-19"
	)
	int[] method2661() {
		return this.field1362 != null ? this.field1362.method9898() : this.definition.method3962();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "487823525"
	)
	short[] method2662() {
		return this.field1362 != null ? this.field1362.method9895() : this.definition.method3977();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "1284521968"
	)
	void method2663(int var1, int var2, short var3) {
		if (this.field1362 == null) {
			this.field1362 = new class546(this.definition);
		}

		this.field1362.method9896(var1, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-990182938"
	)
	void method2664(int[] var1, short[] var2) {
		if (this.field1362 == null) {
			this.field1362 = new class546(this.definition);
		}

		this.field1362.method9897(var1, var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1216332290"
	)
	void method2665() {
		this.field1362 = null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)V",
		garbageValue = "259624253"
	)
	void method2692(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)Lio;",
		garbageValue = "128"
	)
	NpcOverrides method2667() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lio;I)V",
		garbageValue = "1478714438"
	)
	void method2668(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1899153369"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1516009994"
	)
	void method2669() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method2688() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ltu;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "3"
	)
	static String method2726(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1);
			return var3 == null ? var2 : (String)var3.obj;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfx;",
		garbageValue = "-63636975"
	)
	static class142[] method2725() {
		return new class142[]{class142.field1658, class142.field1668, class142.field1659, class142.field1660, class142.field1664, class142.field1662, class142.field1663, class142.field1666, class142.field1657};
	}
}
