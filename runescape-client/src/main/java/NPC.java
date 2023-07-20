import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1889468353
	)
	static int field1315;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1075939431
	)
	static int field1317;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ay")
	String field1310;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1715482361
	)
	int field1318;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	class514 field1313;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	NewStuff field1314;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	NewStuff field1316;

	static {
		field1315 = 1;
		field1317 = 1;
	}

	NPC() {
		this.field1310 = "";
		this.field1318 = 31;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-265998562"
	)
	void method2588(String var1) {
		this.field1310 = var1 == null ? "" : var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljo;",
		garbageValue = "-983173466"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class135.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.movementSequence != super.idleSequence || var1 == null) ? class135.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = null;
			if (this.field1314 != null && this.field1314.field1994) {
				var3 = class136.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			} else {
				var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.field1314);
			}

			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				int var4 = var3.indicesCount;
				var3 = this.method2391(var3);
				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				if (super.field1248 != 0 && Client.cycle >= super.field1183 && Client.cycle < super.field1244) {
					var3.overrideHue = super.field1245;
					var3.overrideSaturation = super.field1238;
					var3.overrideLuminance = super.field1247;
					var3.overrideAmount = super.field1248;
					var3.field2684 = (short)var4;
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
		garbageValue = "1401431099"
	)
	void method2601(int var1) {
		this.field1318 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1067111578"
	)
	boolean method2590(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1318 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2003079034"
	)
	final String method2591() {
		if (!this.field1310.isEmpty()) {
			return this.field1310;
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILio;I)V",
		garbageValue = "69019912"
	)
	final void method2592(int var1, class218 var2) {
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

		if (super.sequence != -1 && class135.SequenceDefinition_get(super.sequence).field2284 == 1) {
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "0"
	)
	final void method2593(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class135.SequenceDefinition_get(super.sequence).field2284 == 1) {
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
				super.pathTraversed[0] = class218.field2384;
				return;
			}
		}

		super.pathLength = 0;
		super.field1257 = 0;
		super.field1256 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1223 * 64 + super.pathX[0] * 128;
		super.y = super.field1223 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1083968241"
	)
	int[] method2596() {
		return this.field1313 != null ? this.field1313.method9349() : this.definition.method3720();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "77"
	)
	short[] method2621() {
		return this.field1313 != null ? this.field1313.method9350() : this.definition.method3750();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "0"
	)
	void method2597(int var1, int var2, short var3) {
		if (this.field1313 == null) {
			this.field1313 = new class514(this.definition);
		}

		this.field1313.method9351(var1, var2, var3);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1811218204"
	)
	void method2594(int[] var1, short[] var2) {
		if (this.field1313 == null) {
			this.field1313 = new class514(this.definition);
		}

		this.field1313.method9359(var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1565977870"
	)
	void method2625() {
		this.field1313 = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)V",
		garbageValue = "-1331713030"
	)
	void method2605(NewStuff var1) {
		this.field1316 = var1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lhs;",
		garbageValue = "-1510314469"
	)
	NewStuff method2602() {
		return this.field1316;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)V",
		garbageValue = "-1722306850"
	)
	void method2603(NewStuff var1) {
		this.field1314 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-883060880"
	)
	void method2604() {
		this.field1316 = null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1751428186"
	)
	void method2598() {
		this.field1314 = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "-9"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}

			if (class31.field176.startsWith("win")) {
				class351.method6662(var0, 0, "openjs");
			} else if (class31.field176.startsWith("mac")) {
				class351.method6662(var0, 1, "openjs");
			} else {
				class351.method6662(var0, 2, "openjs");
			}
		} else {
			class351.method6662(var0, 3, "openjs");
		}

	}
}
