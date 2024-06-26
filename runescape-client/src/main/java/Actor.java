import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("Actor")
public abstract class Actor extends Renderable implements class67 {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1263197461
	)
	@Export("x")
	int x;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1883460543
	)
	@Export("y")
	int y;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1878862993
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1333056533
	)
	int field1194;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1086586153
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -493190143
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -990054803
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -63394617
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1724349177
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1421034027
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -216563089
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -786090101
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -569488431
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -667662995
	)
	int field1262;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 649568089
	)
	int field1219;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1337698405
	)
	int field1202;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -104225353
	)
	int field1205;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -591542115
	)
	int field1208;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 173481527
	)
	int field1249;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 35925141
	)
	int field1210;
	@ObfuscatedName("cf")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cv")
	boolean field1212;
	@ObfuscatedName("cl")
	boolean field1213;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -2071720493
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -874874295
	)
	int field1226;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1800912803
	)
	int field1216;
	@ObfuscatedName("cn")
	int[] field1217;
	@ObfuscatedName("co")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ch")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("ct")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cd")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("ck")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cq")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 871522609
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cy")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -600541897
	)
	int field1227;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 51660803
	)
	int field1252;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1955977733
	)
	int field1225;
	@ObfuscatedName("cr")
	boolean field1230;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 449533137
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1662201195
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 2107627165
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -237232541
	)
	int field1234;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -614178723
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 965082429
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -582427341
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1189537915
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -248982931
	)
	int field1214;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1325812199
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -2105255121
	)
	int field1242;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1219906741
	)
	int field1243;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 449410347
	)
	int field1244;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -1659660813
	)
	int field1245;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 25524425
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -223640757
	)
	int field1260;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -2041449087
	)
	int field1248;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -382042739
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1167369591
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 4956849
	)
	int field1251;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = -381863317
	)
	int field1215;
	@ObfuscatedName("dc")
	byte field1223;
	@ObfuscatedName("dy")
	byte field1254;
	@ObfuscatedName("dw")
	byte field1255;
	@ObfuscatedName("dh")
	byte field1239;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 669357539
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1550329101
	)
	int field1258;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -208913377
	)
	int field1259;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -6991657
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dx")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("eg")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("es")
	@ObfuscatedSignature(
		descriptor = "[Ljb;"
	)
	@Export("pathTraversed")
	class238[] pathTraversed;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -703076279
	)
	int field1264;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -1473501671
	)
	int field1265;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = -950858021
	)
	int field1266;

	Actor() {
		this.isWalking = false;
		this.field1194 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1262 = -1;
		this.field1219 = -1;
		this.field1202 = -1;
		this.field1205 = -1;
		this.field1208 = -1;
		this.field1249 = -1;
		this.field1210 = -1;
		this.overheadText = null;
		this.field1213 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1226 = 0;
		this.field1216 = 0;
		this.field1217 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1227 = -1;
		this.field1252 = -1;
		this.field1225 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1234 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1214 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1251 = -1;
		this.field1215 = -1;
		this.field1258 = 0;
		this.field1259 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class238[10];
		this.field1264 = 0;
		this.field1265 = 0;
		this.field1266 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1094315846"
	)
	public int vmethod8670() {
		return this.x;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1560683435"
	)
	public int vmethod8671() {
		return this.y;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1219894600"
	)
	public int vmethod8672() {
		return class511.topLevelWorldView.plane;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1756478951"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2073381833"
	)
	final void method2483() {
		this.pathLength = 0;
		this.field1265 = 0;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "996611359"
	)
	@Export("addHitSplat")
	final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > var5) {
				var7 = false;
			} else {
				var8 = false;
			}
		}

		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (var1 >= 0) {
			HitSplatDefinition var12 = WorldMapSectionType.method4961(var1);
			var10 = var12.field2140;
			var11 = var12.field2131;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= var5) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			this.hitSplatTypes[var9] = var1;
			this.hitSplatValues[var9] = var2;
			this.hitSplatTypes2[var9] = var3;
			this.hitSplatValues2[var9] = var4;
			this.hitSplatCycles[var9] = var5 + var11 + var6;
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "11"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			var8.field1941 = var1;
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field1941 == var8.field1941) {
				var13.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) {
				var10 = var13;
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(var2 + var4, var5, var6, var3);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "40"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			var3.field1941 = var1;
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
			var2 = var3;
		}

		var3 = var2;

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1627901308"
	)
	@Export("updateSpotAnimation")
	void updateSpotAnimation(int var1, int var2, int var3, int var4) {
		int var5 = var4 + Client.cycle;
		ActorSpotAnim var6 = (ActorSpotAnim)this.spotAnimations.get((long)var1);
		if (var6 != null) {
			var6.remove();
			--this.graphicsCount;
		}

		if (var2 != 65535 && var2 != -1) {
			byte var7 = 0;
			if (var4 > 0) {
				var7 = -1;
			}

			this.spotAnimations.put(new ActorSpotAnim(var2, var3, var5, var7), (long)var1);
			++this.graphicsCount;
		}
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(B)Lth;",
		garbageValue = "14"
	)
	IterableNodeHashTable method2482() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-214221363"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9230(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(Llv;I)Llv;",
		garbageValue = "-2118997962"
	)
	Model method2476(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field3155;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method9230(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = class178.SpotAnimationDefinition_get(var7.spotAnimation).method3770();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5759(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method9230(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = class178.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method5759(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "29395"
	)
	void method2485() {
		this.field1230 = false;
		this.field1227 = -1;
		this.field1252 = -1;
		this.field1225 = -1;
	}

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)Lnl;",
		garbageValue = "7"
	)
	Coord method2488(WorldView var1) {
		if (var1 == class511.topLevelWorldView) {
			return new Coord(this.vmethod8672(), this.vmethod8670(), this.vmethod8671());
		} else {
			WorldEntity var2 = class511.topLevelWorldView.worldEntities[var1.id];
			if (var2 == null) {
				return new Coord(this.vmethod8672(), this.vmethod8670(), this.vmethod8671());
			} else {
				int var3 = var2.vmethod8670();
				int var4 = var2.vmethod8671();
				int var5 = var2.vmethod8672();
				int var6 = var2.worldView.sizeX / 2 * 128;
				int var7 = var2.worldView.sizeY / 2 * 128;
				int var8 = this.vmethod8670() - var6;
				int var9 = this.vmethod8671() - var7;
				double var10 = (double)(-var2.field4970) * 3.141592653589793D / 1024.0D;
				double var12 = Math.cos(var10);
				double var14 = Math.sin(var10);
				int var16 = var3 + (int)((double)var8 * var12 - var14 * (double)var9);
				int var17 = var4 + (int)(var14 * (double)var8 + (double)var9 * var12);
				return new Coord(var5, var16, var17);
			}
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-30"
	)
	int vmethod2708() {
		return this.defaultHeight;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Liz;",
		garbageValue = "1830290077"
	)
	static class233[] method2477() {
		return new class233[]{class233.field2477, class233.field2479, class233.field2484, class233.field2478, class233.field2480, class233.field2476, class233.field2481};
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "2079099484"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}
}
