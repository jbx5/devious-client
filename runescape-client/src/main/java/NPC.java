import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2105113725
	)
	static int field1341;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2005979199
	)
	static int field1343;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2007331691
	)
	@Export("canvasWidth")
	public static int canvasWidth;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljm;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ay")
	String field1345;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -2090621991
	)
	int field1338;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	class549 field1337;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljl;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1341 = 1;
		field1343 = 1;
	}

	NPC() {
		this.field1345 = "";
		this.field1338 = 31;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lhr;",
		garbageValue = "-1547633874"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class182.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.movementSequence != super.idleSequence || var1 == null) ? class182.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = class253.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2567(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1220 != 0 && Client.cycle >= super.field1244 && Client.cycle < super.field1241) {
					var3.overrideHue = super.field1242;
					var3.overrideSaturation = super.field1243;
					var3.overrideLuminance = super.field1240;
					var3.overrideAmount = super.field1220;
					var3.field2227 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1810260998"
	)
	void method2747(String var1) {
		this.field1345 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-683391447"
	)
	void method2748(int var1) {
		this.field1338 = var1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2052457413"
	)
	boolean method2749(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1338 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1844509891"
	)
	final String method2750() {
		if (!this.field1345.isEmpty()) {
			return this.field1345;
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILko;I)V",
		garbageValue = "-1478247444"
	)
	final void method2778(int var1, MoveSpeed var2) {
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

		if (super.sequence != -1 && class182.SequenceDefinition_get(super.sequence).field2885 == 1) {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "70"
	)
	final void method2752(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class182.SequenceDefinition_get(super.sequence).field2885 == 1) {
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
				super.pathTraversed[0] = MoveSpeed.field2983;
				return;
			}
		}

		super.pathLength = 0;
		super.field1255 = 0;
		super.field1253 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1183 * 64 + super.pathX[0] * 128;
		super.y = super.field1183 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1279556921"
	)
	int[] method2755() {
		return this.field1337 != null ? this.field1337.method9859() : this.definition.method4950();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-526171262"
	)
	short[] method2757() {
		return this.field1337 != null ? this.field1337.method9860() : this.definition.method4930();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-1554588572"
	)
	void method2751(int var1, int var2, short var3) {
		if (this.field1337 == null) {
			this.field1337 = new class549(this.definition);
		}

		this.field1337.method9863(var1, var2, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1095625507"
	)
	void method2758(int[] var1, short[] var2) {
		if (this.field1337 == null) {
			this.field1337 = new class549(this.definition);
		}

		this.field1337.method9862(var1, var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1531788047"
	)
	void method2759() {
		this.field1337 = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljl;I)V",
		garbageValue = "-570745027"
	)
	void method2760(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljl;",
		garbageValue = "48"
	)
	NpcOverrides method2783() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Ljl;I)V",
		garbageValue = "-797177324"
	)
	void method2770(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "804082803"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2085906608"
	)
	void method2782() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	void method2764() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "249718421"
	)
	int vmethod2812() {
		return this.definition.field2583 == -1 ? super.defaultHeight : this.definition.field2583;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "4"
	)
	static final float method2815(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (var1 * 1.0075567F - 75.56675F) / var1;
	}

	@ObfuscatedName("mj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)I",
		garbageValue = "-124"
	)
	static final int method2813(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
		return NpcOverrides.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false, -1);
	}
}
