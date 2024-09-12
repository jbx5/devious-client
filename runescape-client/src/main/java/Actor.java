import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("dy")
@Implements("Actor")
public abstract class Actor extends Renderable implements Entity {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1125889549
	)
	@Export("x")
	int x;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1650600853
	)
	@Export("y")
	int y;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 898237617
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -282866751
	)
	int field1227;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 278248629
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 26734717
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1377979069
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -487483529
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1191497365
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1834502147
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1938792471
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1796812871
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1399093363
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -567359311
	)
	int field1237;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -5540665
	)
	int field1238;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -537618993
	)
	int field1280;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1057053467
	)
	int field1286;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -1911661983
	)
	int field1240;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1986001845
	)
	int field1241;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -511505321
	)
	int field1243;
	@ObfuscatedName("be")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("bc")
	boolean field1279;
	@ObfuscatedName("cn")
	boolean field1275;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 489867143
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 1002301433
	)
	int field1297;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -1738725263
	)
	int field1223;
	@ObfuscatedName("cm")
	int[] field1250;
	@ObfuscatedName("cx")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ci")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cy")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("co")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cv")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cg")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 1608353943
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cc")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -37577261
	)
	int field1260;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 986251397
	)
	int field1261;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1121928293
	)
	int field1262;
	@ObfuscatedName("cl")
	boolean field1263;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1002586171
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -427295501
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 139459383
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1263592367
	)
	int field1267;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 1036457443
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = 1256288093
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 612738273
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1972322021
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1977720109
	)
	int field1272;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -211526915
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 828528659
	)
	int field1257;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -139175881
	)
	int field1276;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 223119945
	)
	int field1248;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1273799413
	)
	int field1231;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 971681271
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1776272851
	)
	int field1233;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -205199025
	)
	int field1291;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -28643081
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 20342703
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 614899427
	)
	int field1284;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -146266363
	)
	int field1258;
	@ObfuscatedName("dq")
	byte field1259;
	@ObfuscatedName("di")
	byte field1287;
	@ObfuscatedName("da")
	byte field1288;
	@ObfuscatedName("dz")
	byte field1285;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1822086613
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1672427867
	)
	int field1249;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = -695206717
	)
	int field1292;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 166438615
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dn")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("du")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "[Lkk;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -631828717
	)
	int field1290;
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = 1437743483
	)
	int field1298;
	@ObfuscatedName("ez")
	@ObfuscatedGetter(
		intValue = 664101649
	)
	int field1239;

	Actor() {
		this.isWalking = false;
		this.field1227 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1237 = -1;
		this.field1238 = -1;
		this.field1280 = -1;
		this.field1286 = -1;
		this.field1240 = -1;
		this.field1241 = -1;
		this.field1243 = -1;
		this.overheadText = null;
		this.field1275 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1297 = 0;
		this.field1223 = 0;
		this.field1250 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1260 = -1;
		this.field1261 = -1;
		this.field1262 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1267 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1272 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1284 = -1;
		this.field1258 = -1;
		this.field1249 = 0;
		this.field1292 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1290 = 0;
		this.field1298 = 0;
		this.field1239 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2084253353"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "18679"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "371855163"
	)
	@Export("getPlane")
	public int getPlane() {
		return ClientPreferences.topLevelWorldView.plane;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "960965429"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	final void method2635() {
		this.pathLength = 0;
		this.field1298 = 0;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-112"
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
			HitSplatDefinition var13 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var1);
			HitSplatDefinition var12;
			if (var13 != null) {
				var12 = var13;
			} else {
				byte[] var14 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var1);
				var13 = new HitSplatDefinition();
				if (var14 != null) {
					var13.decode(new Buffer(var14));
				}

				HitSplatDefinition.HitSplatDefinition_cached.put(var13, (long)var1);
				var12 = var13;
			}

			var10 = var12.field2139;
			var11 = var12.field2147;
		}

		int var15;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var15 = 0;
			if (var10 == 0) {
				var15 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var15 = this.hitSplatValues[0];
			}

			for (int var16 = 1; var16 < 4; ++var16) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var16] < var15) {
						var9 = var16;
						var15 = this.hitSplatCycles[var16];
					}
				} else if (var10 == 1 && this.hitSplatValues[var16] < var15) {
					var9 = var16;
					var15 = this.hitSplatValues[var16];
				}
			}

			if (var10 == 1 && var15 >= var2) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var15 = 0; var15 < 4; ++var15) {
				byte var17 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var17] <= var5) {
					var9 = var17;
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-2120414915"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = ClanSettings.method3604(var1);
		HealthBarConfig var8 = null;
		HealthBarConfig var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBarConfig var12;
		for (var12 = (HealthBarConfig)this.healthBars.last(); var12 != null; var12 = (HealthBarConfig)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1945 == var7.field1945) {
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
			var12 = new HealthBarConfig(var7);
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "16777215"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = ClanSettings.method3604(var1);

		for (HealthBarConfig var3 = (HealthBarConfig)this.healthBars.last(); var3 != null; var3 = (HealthBarConfig)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2121722710"
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

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(I)Lui;",
		garbageValue = "-1368487073"
	)
	IterableNodeHashTable method2644() {
		return this.spotAnimations;
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-197001658"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9565(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)Ljm;",
		garbageValue = "-185717028"
	)
	Model method2649(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2817;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method9565(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = VarcInt.SpotAnimationDefinition_get(var7.spotAnimation).method4033();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5346(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method9565(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = VarcInt.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method5346(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("dt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-451056736"
	)
	void method2670() {
		this.field1263 = false;
		this.field1260 = -1;
		this.field1261 = -1;
		this.field1262 = -1;
	}

	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)Lnm;",
		garbageValue = "931998056"
	)
	Coord method2646(WorldView var1) {
		if (var1 == ClientPreferences.topLevelWorldView) {
			return new Coord(this.getPlane(), this.getX(), this.getY());
		} else {
			WorldEntity var2 = ClientPreferences.topLevelWorldView.worldEntities[var1.id];
			if (var2 == null) {
				return new Coord(this.getPlane(), this.getX(), this.getY());
			} else {
				int var3 = var2.getX();
				int var4 = var2.getY();
				int var5 = var2.getPlane();
				int var6 = var2.worldView.sizeX / 2 * 128;
				int var7 = var2.worldView.sizeY / 2 * 128;
				int var8 = this.getX() - var6;
				int var9 = this.getY() - var7;
				double var10 = (double)(-var2.currentRotationAngle) * 3.141592653589793D / 1024.0D;
				double var12 = Math.cos(var10);
				double var14 = Math.sin(var10);
				int var16 = var3 + (int)(var12 * (double)var8 - var14 * (double)var9);
				int var17 = var4 + (int)(var12 * (double)var9 + (double)var8 * var14);
				return new Coord(var5, var16, var17);
			}
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1338439449"
	)
	int vmethod2891() {
		return this.defaultHeight;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1806471959"
	)
	public static boolean method2687(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class416.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-772157234"
	)
	static final void method2689(String var0) {
		class419.method8013(var0 + " is already on your friend list");
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2134902598"
	)
	static void method2650(String var0) {
		HttpJsonRequestBody.field5091 = var0;

		try {
			String var1 = class1.client.getParameter(Integer.toString(18));
			String var2 = class1.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			String var5;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = WorldMapElement.method3843() + 94608000000L;
				Calendar.Calendar_calendar.setTime(new Date(var6));
				int var8 = Calendar.Calendar_calendar.get(7);
				int var9 = Calendar.Calendar_calendar.get(5);
				int var10 = Calendar.Calendar_calendar.get(2);
				int var11 = Calendar.Calendar_calendar.get(1);
				int var12 = Calendar.Calendar_calendar.get(11);
				int var13 = Calendar.Calendar_calendar.get(12);
				int var14 = Calendar.Calendar_calendar.get(13);
				var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
				var3 = var4 + var5 + "; Max-Age=" + 94608000L;
			}

			Client var16 = class1.client;
			var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var16).eval(var5);
		} catch (Throwable var15) {
		}

	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1073560894"
	)
	static void method2688() {
		if (Client.oculusOrbState == 1) {
			Client.field619 = true;
		}

	}
}
