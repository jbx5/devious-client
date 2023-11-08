import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 814526813
	)
	static int field1311;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2039481379
	)
	static int field1305;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ah")
	String field1306;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 761785473
	)
	int field1308;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	class527 field1309;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhf;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1311 = 1;
		field1305 = 1;
	}

	NPC() {
		this.field1306 = "";
		this.field1308 = 31;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-983100224"
	)
	void method2713(String var1) {
		this.field1306 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Lka;",
		garbageValue = "1"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? DynamicObject.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : DynamicObject.SequenceDefinition_get(super.movementSequence);
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = class229.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
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

				if (super.field1237 != 0 && Client.cycle >= super.field1232 && Client.cycle < super.field1215) {
					var3.overrideHue = super.field1234;
					var3.overrideSaturation = super.field1235;
					var3.overrideLuminance = super.field1171;
					var3.overrideAmount = super.field1237;
					var3.field3006 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "804243007"
	)
	void method2660(int var1) {
		this.field1308 = var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1535698170"
	)
	boolean method2661(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1308 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	final String method2662() {
		if (!this.field1306.isEmpty()) {
			return this.field1306;
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILiz;I)V",
		garbageValue = "844868343"
	)
	final void method2664(int var1, class228 var2) {
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

		if (super.sequence != -1 && DynamicObject.SequenceDefinition_get(super.sequence).field2205 == 1) {
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "75"
	)
	final void method2702(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && DynamicObject.SequenceDefinition_get(super.sequence).field2205 == 1) {
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
				super.pathTraversed[0] = class228.field2409;
				return;
			}
		}

		super.pathLength = 0;
		super.field1220 = 0;
		super.field1245 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1198 * 64 + super.pathX[0] * 128;
		super.y = super.field1198 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "-23200"
	)
	int[] method2701() {
		return this.field1309 != null ? this.field1309.method9531() : this.definition.method3733();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "120"
	)
	short[] method2667() {
		return this.field1309 != null ? this.field1309.method9532() : this.definition.method3694();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-558766672"
	)
	void method2666(int var1, int var2, short var3) {
		if (this.field1309 == null) {
			this.field1309 = new class527(this.definition);
		}

		this.field1309.method9533(var1, var2, var3);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1790507927"
	)
	void method2669(int[] var1, short[] var2) {
		if (this.field1309 == null) {
			this.field1309 = new class527(this.definition);
		}

		this.field1309.method9534(var1, var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method2670() {
		this.field1309 = null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lhf;I)V",
		garbageValue = "-906762953"
	)
	void method2671(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Lhf;",
		garbageValue = "2"
	)
	NpcOverrides method2672() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lhf;I)V",
		garbageValue = "-977381781"
	)
	void method2673(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1221291483"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-434488190"
	)
	void method2674() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-923674269"
	)
	void method2675() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)I",
		garbageValue = "-22"
	)
	public static int method2721(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1588641318"
	)
	static final int method2719(int var0, int var1) {
		int var2 = var0 + var1 * 57;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lbk;I)V",
		garbageValue = "2109670231"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}
}
