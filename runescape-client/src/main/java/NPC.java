import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("fp")
	@ObfuscatedGetter(
		intValue = -1899913385
	)
	@Export("worldPort")
	static int worldPort;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("p")
	String field1254;

	NPC() {
		this.field1254 = ""; // L: 11
	} // L: 13

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-76109777"
	)
	void method2513(String var1) {
		this.field1254 = var1 == null ? "" : var1; // L: 16
	} // L: 17

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Lha;",
		garbageValue = "13"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 96
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class4.SequenceDefinition_get(super.sequence) : null; // L: 97
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : class4.SequenceDefinition_get(super.movementSequence); // L: 98
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 99
			if (var3 == null) { // L: 100
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 101
				super.defaultHeight = var3.height; // L: 102
				int var4 = var3.indicesCount; // L: 103
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 104
					Model var5 = class308.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 105
					if (var5 != null) { // L: 106
						var5.offsetBy(0, -super.spotAnimationHeight, 0); // L: 107
						Model[] var6 = new Model[]{var3, var5}; // L: 108
						var3 = new Model(var6, 2); // L: 109
					}
				}

				if (this.definition.size == 1) { // L: 112
					var3.isSingleTile = true;
				}

				if (super.field1194 != 0 && Client.cycle >= super.field1188 && Client.cycle < super.field1158) { // L: 113
					var3.overrideHue = super.field1190; // L: 114
					var3.overrideSaturation = super.field1191; // L: 115
					var3.overrideLuminance = super.field1169; // L: 116
					var3.overrideAmount = super.field1194; // L: 117
					var3.field2618 = (short)var4; // L: 118
				} else {
					var3.overrideAmount = 0; // L: 121
				}

				return var3; // L: 123
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1787135628"
	)
	final String method2505() {
		if (!this.field1254.isEmpty()) { // L: 20
			return this.field1254; // L: 21
		} else {
			NPCComposition var1 = this.definition; // L: 23
			if (var1.transforms != null) { // L: 24
				var1 = var1.transform(); // L: 25
				if (var1 == null) { // L: 26
					var1 = this.definition; // L: 27
				}
			}

			return var1.name; // L: 30
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(ILga;I)V",
		garbageValue = "2110529559"
	)
	final void method2510(int var1, class193 var2) {
		int var3 = super.pathX[0]; // L: 34
		int var4 = super.pathY[0]; // L: 35
		if (var1 == 0) { // L: 36
			--var3; // L: 37
			++var4; // L: 38
		}

		if (var1 == 1) { // L: 40
			++var4;
		}

		if (var1 == 2) { // L: 41
			++var3; // L: 42
			++var4; // L: 43
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) { // L: 46
			++var3;
		}

		if (var1 == 5) {
			--var3; // L: 48
			--var4; // L: 49
		}

		if (var1 == 6) { // L: 51
			--var4;
		}

		if (var1 == 7) { // L: 52
			++var3; // L: 53
			--var4; // L: 54
		}

		if (super.sequence != -1 && class4.SequenceDefinition_get(super.sequence).field2218 == 1) { // L: 56
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 57
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 58
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 59
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 60
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 61
		}

		super.pathX[0] = var3; // L: 63
		super.pathY[0] = var4; // L: 64
		super.pathTraversed[0] = var2; // L: 65
	} // L: 66

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-40"
	)
	final void method2507(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class4.SequenceDefinition_get(super.sequence).field2218 == 1) { // L: 69
			super.sequence = -1;
		}

		if (!var3) { // L: 70
			int var4 = var1 - super.pathX[0]; // L: 71
			int var5 = var2 - super.pathY[0]; // L: 72
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 73
				if (super.pathLength < 9) { // L: 74
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 75
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 76
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 77
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 78
				}

				super.pathX[0] = var1; // L: 80
				super.pathY[0] = var2; // L: 81
				super.pathTraversed[0] = class193.field2246; // L: 82
				return; // L: 83
			}
		}

		super.pathLength = 0; // L: 86
		super.field1202 = 0; // L: 87
		super.field1201 = 0; // L: 88
		super.pathX[0] = var1; // L: 89
		super.pathY[0] = var2; // L: 90
		super.x = super.field1131 * 738291136 + super.pathX[0] * 128; // L: 91
		super.y = super.field1131 * 738291136 + super.pathY[0] * 128; // L: 92
	} // L: 93

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-77"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 127
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-5"
	)
	static void method2528() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 44
			if (var0.obj != null) { // L: 45
				var0.set();
			}
		}

	} // L: 47

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1983499596"
	)
	static final void method2511(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255); // L: 11593
		if (var0 != Player.clientPreferences.method2402()) { // L: 11594
			if (Player.clientPreferences.method2402() == 0 && Client.currentTrackGroupId != -1) { // L: 11595
				Message.method1164(class14.archive6, Client.currentTrackGroupId, 0, var0, false); // L: 11596
				Client.playingJingle = false; // L: 11597
			} else if (var0 == 0) { // L: 11599
				class17.method267(); // L: 11600
				Client.playingJingle = false; // L: 11601
			} else if (class274.musicPlayerStatus != 0) { // L: 11604
				class269.musicTrackVolume = var0;
			} else {
				class139.midiPcmStream.setPcmStreamVolume(var0); // L: 11605
			}

			Player.clientPreferences.method2449(var0); // L: 11607
		}

	} // L: 11609
}
