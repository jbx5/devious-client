import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dc")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -263924091
	)
	static int field1324;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1957934343
	)
	static int field1326;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("al")
	String field1319;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1047105089
	)
	int field1318;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	class530 field1322;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1324 = 1;
		field1326 = 1;
	}

	NPC() {
		this.field1319 = "";
		this.field1318 = 31;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "218528952"
	)
	void method2621(String var1) {
		this.field1319 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljn;",
		garbageValue = "0"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class36.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : class36.SequenceDefinition_get(super.movementSequence);
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = TextureProvider.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2448(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1252 != 0 && Client.cycle >= super.field1247 && Client.cycle < super.field1248) {
					var3.overrideHue = super.field1249;
					var3.overrideSaturation = super.field1250;
					var3.overrideLuminance = super.field1251;
					var3.overrideAmount = super.field1252;
					var3.field2801 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1833659778"
	)
	void method2622(int var1) {
		this.field1318 = var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "113824049"
	)
	boolean method2623(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1318 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-29"
	)
	final String method2672() {
		if (!this.field1319.isEmpty()) {
			return this.field1319;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILip;B)V",
		garbageValue = "-1"
	)
	final void method2625(int var1, class231 var2) {
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

		if (super.sequence != -1 && class36.SequenceDefinition_get(super.sequence).field2339 == 1) {
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-358090235"
	)
	final void method2681(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class36.SequenceDefinition_get(super.sequence).field2339 == 1) {
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
				super.pathTraversed[0] = class231.field2428;
				return;
			}
		}

		super.pathLength = 0;
		super.field1261 = 0;
		super.field1233 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1189 * 64 + super.pathX[0] * 128;
		super.y = super.field1189 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "0"
	)
	int[] method2629() {
		return this.field1322 != null ? this.field1322.method9454() : this.definition.method3791();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-288846359"
	)
	short[] method2635() {
		return this.field1322 != null ? this.field1322.method9455() : this.definition.method3802();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IISS)V",
		garbageValue = "-15144"
	)
	void method2666(int var1, int var2, short var3) {
		if (this.field1322 == null) {
			this.field1322 = new class530(this.definition);
		}

		this.field1322.method9456(var1, var2, var3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "8"
	)
	void method2653(int[] var1, short[] var2) {
		if (this.field1322 == null) {
			this.field1322 = new class530(this.definition);
		}

		this.field1322.method9457(var1, var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-432488525"
	)
	void method2633() {
		this.field1322 = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)V",
		garbageValue = "-1403637183"
	)
	void method2634(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Lhe;",
		garbageValue = "905115149"
	)
	NpcOverrides method2646() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)V",
		garbageValue = "463654606"
	)
	void method2636(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-64"
	)
	void method2637() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "257879915"
	)
	void method2638() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-965276822"
	)
	static void method2641(int var0) {
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	static final int method2684(int var0) {
		return Math.abs(var0 - WallDecoration.cameraYaw) > 1024 ? 2048 * (var0 < WallDecoration.cameraYaw ? 1 : -1) + var0 : var0;
	}

	@ObfuscatedName("ok")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)V",
		garbageValue = "101752739"
	)
	static void method2643(Buffer var0, int var1) {
		class266.method5210(var0.array, var1);
		HealthBar.method2617(var0, var1);
	}
}
