import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ce")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("gq")
	static String field1164;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1041677133
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1623549859
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -853907471
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("ak")
	int field1131;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1957403439
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -595475907
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1619429821
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1278311795
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2064937793
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1460692157
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 558080795
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -680657199
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 136397527
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1551823215
	)
	int field1189;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1469200361
	)
	int field1193;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 27746573
	)
	int field1143;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1804058957
	)
	int field1144;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1345091061
	)
	int field1179;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -807066259
	)
	int field1182;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1619265253
	)
	int field1171;
	@ObfuscatedName("au")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("bg")
	@Export("isAutoChatting")
	boolean isAutoChatting;
	@ObfuscatedName("bw")
	boolean field1150;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1333604775
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -664621931
	)
	@Export("overheadTextColor")
	int overheadTextColor;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1743206661
	)
	@Export("overheadTextEffect")
	int overheadTextEffect;
	@ObfuscatedName("by")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("bz")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("bo")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("br")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("bp")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("bd")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1336513003
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("bh")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -871785757
	)
	int field1163;
	@ObfuscatedName("be")
	boolean field1141;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 276791825
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1288086573
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 238768931
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 1617908651
	)
	int field1168;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1069042073
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -579241143
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1190504043
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -162328707
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1720247151
	)
	int field1173;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 330017977
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1153122297
	)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1830362223
	)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1632557087
	)
	int field1147;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 287498913
	)
	@Export("spotAnimationHeight")
	int spotAnimationHeight;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -774122863
	)
	int field1192;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1362945189
	)
	int field1180;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1883558077
	)
	int field1181;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1326253047
	)
	int field1140;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 127615547
	)
	int field1183;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -785397471
	)
	int field1136;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1761409573
	)
	int field1185;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -497664845
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1921853011
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 981930685
	)
	int field1188;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 2012041551
	)
	int field1158;
	@ObfuscatedName("cq")
	byte field1190;
	@ObfuscatedName("cp")
	byte field1191;
	@ObfuscatedName("ck")
	byte field1169;
	@ObfuscatedName("ci")
	byte field1194;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 572152345
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 743919699
	)
	int field1195;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1509004959
	)
	int field1196;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -157413117
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("cc")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("cm")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "[Lga;"
	)
	@Export("pathTraversed")
	class193[] pathTraversed;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1377547959
	)
	int field1201;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -614769655
	)
	int field1202;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1423849969
	)
	int field1203;

	Actor() {
		this.isWalking = false; // L: 13
		this.field1131 = 235857927; // L: 14
		this.idleSequence = -1; // L: 16
		this.turnLeftSequence = -1; // L: 17
		this.turnRightSequence = -1; // L: 18
		this.walkSequence = -1; // L: 19
		this.walkBackSequence = -1; // L: 20
		this.walkLeftSequence = -1; // L: 21
		this.walkRightSequence = -1; // L: 22
		this.runSequence = -1; // L: 23
		this.field1189 = -1; // L: 24
		this.field1193 = -1; // L: 25
		this.field1143 = -1; // L: 26
		this.field1144 = -1; // L: 27
		this.field1179 = -1; // L: 28
		this.field1182 = -1; // L: 29
		this.field1171 = -1; // L: 30
		this.overheadText = null; // L: 31
		this.field1150 = false; // L: 33
		this.overheadTextCyclesRemaining = 100; // L: 34
		this.overheadTextColor = 0; // L: 35
		this.overheadTextEffect = 0; // L: 36
		this.hitSplatCount = 0; // L: 38
		this.hitSplatTypes = new int[4]; // L: 39
		this.hitSplatValues = new int[4]; // L: 40
		this.hitSplatCycles = new int[4]; // L: 41
		this.hitSplatTypes2 = new int[4]; // L: 42
		this.hitSplatValues2 = new int[4]; // L: 43
		this.healthBars = new IterableNodeDeque(); // L: 44
		this.targetIndex = -1; // L: 45
		this.false0 = false; // L: 46
		this.field1163 = -1; // L: 47
		this.movementSequence = -1; // L: 49
		this.movementFrame = 0; // L: 50
		this.movementFrameCycle = 0; // L: 51
		this.field1168 = 0; // L: 52
		this.sequence = -1; // L: 53
		this.sequenceFrame = 0; // L: 54
		this.sequenceFrameCycle = 0; // L: 55
		this.sequenceDelay = 0; // L: 56
		this.field1173 = 0; // L: 57
		this.spotAnimation = -1; // L: 58
		this.spotAnimationFrame = 0; // L: 59
		this.spotAnimationFrameCycle = 0; // L: 60
		this.npcCycle = 0; // L: 70
		this.defaultHeight = 200; // L: 71
		this.field1188 = -1; // L: 72
		this.field1158 = -1; // L: 73
		this.field1195 = 0; // L: 79
		this.field1196 = 32; // L: 80
		this.pathLength = 0; // L: 81
		this.pathX = new int[10]; // L: 82
		this.pathY = new int[10]; // L: 83
		this.pathTraversed = new class193[10]; // L: 84
		this.field1201 = 0; // L: 85
		this.field1202 = 0; // L: 86
		this.field1203 = -1; // L: 87
	} // L: 89

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-77"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false; // L: 97
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-613135881"
	)
	final void method2331() {
		this.pathLength = 0; // L: 92
		this.field1202 = 0; // L: 93
	} // L: 94

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "90761703"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true; // L: 101
		boolean var8 = true; // L: 102

		int var9;
		for (var9 = 0; var9 < 4; ++var9) { // L: 103
			if (this.hitSplatCycles[var9] > var5) { // L: 104
				var7 = false;
			} else {
				var8 = false; // L: 105
			}
		}

		var9 = -1; // L: 107
		int var10 = -1; // L: 108
		int var11 = 0; // L: 109
		if (var1 >= 0) { // L: 110
			HitSplatDefinition var12 = class126.method2973(var1); // L: 111
			var10 = var12.field2060; // L: 112
			var11 = var12.field2051; // L: 113
		}

		int var14;
		if (var8) { // L: 115
			if (var10 == -1) { // L: 116
				return;
			}

			var9 = 0; // L: 117
			var14 = 0; // L: 118
			if (var10 == 0) { // L: 119
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) { // L: 120
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) { // L: 121
				if (var10 == 0) { // L: 122
					if (this.hitSplatCycles[var13] < var14) { // L: 123
						var9 = var13; // L: 124
						var14 = this.hitSplatCycles[var13]; // L: 125
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) { // L: 128 129
					var9 = var13; // L: 130
					var14 = this.hitSplatValues[var13]; // L: 131
				}
			}

			if (var10 == 1 && var14 >= var2) { // L: 135
				return;
			}
		} else {
			if (var7) { // L: 138
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) { // L: 139
				byte var15 = this.hitSplatCount; // L: 140
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4); // L: 141
				if (this.hitSplatCycles[var15] <= var5) { // L: 142
					var9 = var15; // L: 143
					break; // L: 144
				}
			}
		}

		if (var9 >= 0) { // L: 148
			this.hitSplatTypes[var9] = var1; // L: 149
			this.hitSplatValues[var9] = var2; // L: 150
			this.hitSplatTypes2[var9] = var3; // L: 151
			this.hitSplatValues2[var9] = var4; // L: 152
			this.hitSplatCycles[var9] = var5 + var11 + var6; // L: 153
		}
	} // L: 154

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "4"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 159
		HealthBarDefinition var7;
		if (var8 != null) { // L: 160
			var7 = var8; // L: 161
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 164
			var8 = new HealthBarDefinition(); // L: 165
			if (var9 != null) { // L: 166
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1); // L: 167
			var7 = var8; // L: 168
		}

		var8 = var7; // L: 170
		HealthBar var14 = null; // L: 171
		HealthBar var10 = null; // L: 172
		int var11 = var7.int2; // L: 173
		int var12 = 0; // L: 174

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) { // L: 175
			++var12; // L: 176
			if (var13.definition.field1889 == var8.field1889) { // L: 177
				var13.put(var2 + var4, var5, var6, var3); // L: 178
				return; // L: 179
			}

			if (var13.definition.int1 <= var8.int1) { // L: 181
				var14 = var13;
			}

			if (var13.definition.int2 > var11) { // L: 182
				var10 = var13; // L: 183
				var11 = var13.definition.int2; // L: 184
			}
		}

		if (var10 != null || var12 < 4) { // L: 187
			var13 = new HealthBar(var8); // L: 188
			if (var14 == null) { // L: 189
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14); // L: 190
			}

			var13.put(var2 + var4, var5, var6, var3); // L: 191
			if (var12 >= 4) { // L: 192
				var10.remove();
			}

		}
	} // L: 193

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "27011"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1); // L: 198
		HealthBarDefinition var2;
		if (var3 != null) { // L: 199
			var2 = var3; // L: 200
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1); // L: 203
			var3 = new HealthBarDefinition(); // L: 204
			if (var4 != null) { // L: 205
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1); // L: 206
			var2 = var3; // L: 207
		}

		var3 = var2; // L: 209

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) { // L: 210
			if (var3 == var5.definition) { // L: 211
				var5.remove(); // L: 212
				return; // L: 213
			}
		}

	} // L: 216

	@ObfuscatedName("gr")
	@ObfuscatedSignature(
		descriptor = "(Lgd;IIII)V",
		garbageValue = "478596180"
	)
	static void method2348(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Player.clientPreferences.method2474() != 0) { // L: 3496
			if (var0.field2201 != null && var0.field2201.containsKey(var1)) { // L: 3497
				int var4 = (Integer)var0.field2201.get(var1); // L: 3498
				if (var4 != 0) { // L: 3502
					int var7 = var4 >> 8; // L: 3503
					int var8 = var4 >> 4 & 7; // L: 3504
					int var9 = var4 & 15; // L: 3505
					Client.soundEffectIds[Client.soundEffectCount] = var7; // L: 3506
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8; // L: 3507
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0; // L: 3508
					Client.soundEffects[Client.soundEffectCount] = null; // L: 3509
					int var10 = (var2 - 64) / 128; // L: 3510
					int var11 = (var3 - 64) / 128; // L: 3511
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16); // L: 3512
					++Client.soundEffectCount; // L: 3513
				}

			}
		}
	} // L: 3515
}
