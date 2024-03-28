import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -490510203
	)
	static int field1338;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2065997293
	)
	static int field1337;
	@ObfuscatedName("vr")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhk;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ah")
	String field1330;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1354592777
	)
	int field1329;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	class535 field1333;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("modelOverrides")
	NpcOverrides modelOverrides;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("chatheadOverrides")
	NpcOverrides chatheadOverrides;

	static {
		field1338 = 1;
		field1337 = 1;
	}

	NPC() {
		this.field1330 = "";
		this.field1329 = 31;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "96"
	)
	void method2626(String var1) {
		this.field1330 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljn;",
		garbageValue = "1157175232"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? DevicePcmPlayerProvider.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.movementSequence != super.idleSequence || var1 == null) ? DevicePcmPlayerProvider.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = null;
			if (this.modelOverrides != null && this.modelOverrides.useLocalPlayer) {
				var3 = class133.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.modelOverrides);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2401(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1265 != 0 && Client.cycle >= super.field1260 && Client.cycle < super.field1236) {
					var3.overrideHue = super.field1261;
					var3.overrideSaturation = super.field1263;
					var3.overrideLuminance = super.field1235;
					var3.overrideAmount = super.field1265;
					var3.field2784 = (short)var4;
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
		garbageValue = "1048286403"
	)
	void method2582(int var1) {
		this.field1329 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1030439759"
	)
	boolean method2583(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1329 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-320312084"
	)
	final String method2584() {
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILiu;B)V",
		garbageValue = "-109"
	)
	final void method2585(int var1, class233 var2) {
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

		if (super.sequence != -1 && DevicePcmPlayerProvider.SequenceDefinition_get(super.sequence).field2399 == 1) {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1011455227"
	)
	final void method2633(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && DevicePcmPlayerProvider.SequenceDefinition_get(super.sequence).field2399 == 1) {
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
				super.pathTraversed[0] = class233.field2486;
				return;
			}
		}

		super.pathLength = 0;
		super.field1274 = 0;
		super.field1257 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1249 * 64 + super.pathX[0] * 128;
		super.y = super.field1249 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1373488414"
	)
	int[] method2612() {
		return this.field1333 != null ? this.field1333.method9525() : this.definition.method3872();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "1952944038"
	)
	short[] method2589() {
		return this.field1333 != null ? this.field1333.method9518() : this.definition.method3874();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "2081850946"
	)
	void method2595(int var1, int var2, short var3) {
		if (this.field1333 == null) {
			this.field1333 = new class535(this.definition);
		}

		this.field1333.method9519(var1, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "895532300"
	)
	void method2591(int[] var1, short[] var2) {
		if (this.field1333 == null) {
			this.field1333 = new class535(this.definition);
		}

		this.field1333.method9520(var1, var2);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1140721085"
	)
	void method2590() {
		this.field1333 = null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)V",
		garbageValue = "1701922563"
	)
	void method2593(NpcOverrides var1) {
		this.chatheadOverrides = var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lhg;",
		garbageValue = "1929211686"
	)
	NpcOverrides method2594() {
		return this.chatheadOverrides;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhg;I)V",
		garbageValue = "-703603240"
	)
	void method2586(NpcOverrides var1) {
		this.modelOverrides = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "951800784"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-98649516"
	)
	void method2625() {
		this.chatheadOverrides = null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "737995189"
	)
	void method2597() {
		this.modelOverrides = null;
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	static void method2650() {
		if (Client.renderSelf) {
			class167.addPlayerToScene(class133.localPlayer, false);
		}

	}
}
