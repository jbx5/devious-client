import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "Lkq;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1682415597
	)
	@Export("x")
	int x;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 261390341
	)
	@Export("y")
	int y;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1769179749
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -906487817
	)
	int field1212;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1653856533
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1005587195
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 596527443
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 256643485
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 245214983
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1199032719
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -529748857
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1475508573
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1293406329
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -386329313
	)
	int field1219;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -909248759
	)
	int field1220;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1576876033
	)
	int field1221;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1765727881
	)
	int field1222;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1796982345
	)
	int field1216;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1022136029
	)
	int field1224;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1008518259
	)
	int field1225;
	@ObfuscatedName("bx")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cs")
	boolean field1228;
	@ObfuscatedName("ch")
	boolean field1205;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1526300639
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 92402267
	)
	int field1208;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 108337669
	)
	int field1231;
	@ObfuscatedName("cn")
	int[] field1226;
	@ObfuscatedName("ci")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cl")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cm")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cx")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cw")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cy")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1046435177
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cv")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -2134481181
	)
	int field1242;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -758837295
	)
	int field1243;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1874899127
	)
	int field1244;
	@ObfuscatedName("ca")
	boolean field1245;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 509789123
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 2022919199
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 2017854917
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1854379435
	)
	int field1232;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1049413981
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 1430383743
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -2143902041
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -2057820411
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -803318257
	)
	int field1254;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1919601901
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -834807045
	)
	int field1257;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1348271175
	)
	int field1258;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 397933817
	)
	int field1259;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1896744821
	)
	int field1248;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1925697223
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -941694955
	)
	int field1271;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 1676030111
	)
	int field1223;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1493658757
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -825642877
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -379331335
	)
	int field1262;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1667653559
	)
	int field1278;
	@ObfuscatedName("ds")
	byte field1268;
	@ObfuscatedName("dy")
	byte field1269;
	@ObfuscatedName("dz")
	byte field1276;
	@ObfuscatedName("dp")
	byte field1255;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1409684201
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1528983473
	)
	int field1227;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -359528855
	)
	int field1249;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 614875555
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dn")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dr")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	@Export("pathTraversed")
	class233[] pathTraversed;
	@ObfuscatedName("ej")
	@ObfuscatedGetter(
		intValue = 796262365
	)
	int field1279;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -991708375
	)
	int field1280;
	@ObfuscatedName("ei")
	@ObfuscatedGetter(
		intValue = -764561221
	)
	int field1270;

	Actor() {
		this.isWalking = false;
		this.field1212 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1219 = -1;
		this.field1220 = -1;
		this.field1221 = -1;
		this.field1222 = -1;
		this.field1216 = -1;
		this.field1224 = -1;
		this.field1225 = -1;
		this.overheadText = null;
		this.field1205 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1208 = 0;
		this.field1231 = 0;
		this.field1226 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1242 = -1;
		this.field1243 = -1;
		this.field1244 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1232 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1254 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1262 = -1;
		this.field1278 = -1;
		this.field1227 = 0;
		this.field1249 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class233[10];
		this.field1279 = 0;
		this.field1280 = 0;
		this.field1270 = -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "16409"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "709886252"
	)
	final void method2462() {
		this.pathLength = 0;
		this.field1280 = 0;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1723210572"
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
			HitSplatDefinition var12 = Language.method7357(var1);
			var10 = var12.field2084;
			var11 = var12.field2092;
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

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1922704024"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = VarcInt.method3595(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1918 == var7.field1918) {
				var12.put(var2 + var4, var5, var6, var3);
				return;
			}

			if (var12.definition.int1 <= var7.int1) {
				var8 = var12;
			}

			if (var12.definition.int2 > var10) {
				var9 = var12;
				var10 = var12.definition.int2;
			}
		}

		if (var9 != null || var11 < 4) {
			var12 = new HealthBar(var7);
			if (var8 == null) {
				this.healthBars.addLast(var12);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var12, var8);
			}

			var12.put(var2 + var4, var5, var6, var3);
			if (var11 >= 4) {
				var9.remove();
			}

		}
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1919875371"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = VarcInt.method3595(var1);

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1566666540"
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

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(B)Lta;",
		garbageValue = "-43"
	)
	IterableNodeHashTable method2475() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "230480918"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9127(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(Lkz;B)Lkz;",
		garbageValue = "1"
	)
	Model method2469(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2991;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method9127(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = VarbitComposition.SpotAnimationDefinition_get(var7.spotAnimation).method3787();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5683(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method9127(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = VarbitComposition.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method5683(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "811106472"
	)
	void method2470() {
		this.field1245 = false;
		this.field1242 = -1;
		this.field1243 = -1;
		this.field1244 = -1;
	}
}
