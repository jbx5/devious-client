import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 227380837
	)
	static int field1306;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 704938651
	)
	static int field1302;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ap")
	String field1300;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1939318851
	)
	int field1301;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	class531 field1304;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1306 = 1;
		field1302 = 1;
	}

	NPC() {
		this.field1300 = "";
		this.field1301 = 31;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-9179"
	)
	void method2657(String var1) {
		this.field1300 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-714420560"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? HttpMethod.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : HttpMethod.SequenceDefinition_get(super.movementSequence);
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = KeyHandler.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2486(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1237 != 0 && Client.cycle >= super.field1180 && Client.cycle < super.field1233) {
					var3.overrideHue = super.field1234;
					var3.overrideSaturation = super.field1193;
					var3.overrideLuminance = super.field1204;
					var3.overrideAmount = super.field1237;
					var3.field2995 = (short)var4;
				} else {
					var3.overrideAmount = 0;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "7344261"
	)
	void method2710(int var1) {
		this.field1301 = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-6"
	)
	boolean method2659(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1301 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "946081125"
	)
	final String method2688() {
		if (!this.field1300.isEmpty()) {
			return this.field1300;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILir;I)V",
		garbageValue = "-861226584"
	)
	final void method2661(int var1, class231 var2) {
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

		if (super.sequence != -1 && HttpMethod.SequenceDefinition_get(super.sequence).field2226 == 1) {
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
		garbageValue = "-242237152"
	)
	final void method2658(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && HttpMethod.SequenceDefinition_get(super.sequence).field2226 == 1) {
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
				super.pathTraversed[0] = class231.field2458;
				return;
			}
		}

		super.pathLength = 0;
		super.field1215 = 0;
		super.field1245 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1175 * 423432192 + super.pathX[0] * 128;
		super.y = super.field1175 * 423432192 + super.pathY[0] * 128;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1130323337"
	)
	int[] method2665() {
		return this.field1304 != null ? this.field1304.method9626() : this.definition.method3775();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "123"
	)
	short[] method2686() {
		return this.field1304 != null ? this.field1304.method9641() : this.definition.method3722();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IISS)V",
		garbageValue = "15528"
	)
	void method2692(int var1, int var2, short var3) {
		if (this.field1304 == null) {
			this.field1304 = new class531(this.definition);
		}

		this.field1304.method9629(var1, var2, var3);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "71"
	)
	void method2668(int[] var1, short[] var2) {
		if (this.field1304 == null) {
			this.field1304 = new class531(this.definition);
		}

		this.field1304.method9630(var1, var2);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-70950580"
	)
	void method2669() {
		this.field1304 = null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhb;I)V",
		garbageValue = "-192349719"
	)
	void method2670(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lhb;",
		garbageValue = "1033276556"
	)
	NpcOverrides method2671() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhb;I)V",
		garbageValue = "585018689"
	)
	void method2664(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1763065685"
	)
	void method2673() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "426726658"
	)
	void method2674() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)J",
		garbageValue = "1013786616"
	)
	public static long method2718(int var0) {
		if (var0 > 63) {
			throw new class405("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(Lnn;Lnz;ZI)V",
		garbageValue = "-1941551229"
	)
	public static void method2717(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7;
		var0.field3759 = new PlayerComposition(var1);
		if (!var2) {
			var0.field3759.equipment = Arrays.copyOf(var0.field3759.field3643, var0.field3759.field3643.length);
			var0.field3759.method6383();
		}

	}
}
