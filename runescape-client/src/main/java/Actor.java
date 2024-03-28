import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	static AbstractSocket field1277;
	@ObfuscatedName("tz")
	@ObfuscatedGetter(
		intValue = -1219967507
	)
	static int field1276;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1862821053
	)
	@Export("x")
	int x;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 985421299
	)
	@Export("y")
	int y;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 8499943
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -2103652723
	)
	int field1249;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -682106097
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 1478474189
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1883369341
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 313622405
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1949350247
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 998928211
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -174129813
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 220265917
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 899381017
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -2057224975
	)
	int field1213;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1139744979
	)
	int field1214;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 737935349
	)
	int field1215;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 402357639
	)
	int field1264;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 547048533
	)
	int field1269;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -980380777
	)
	int field1218;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1857553201
	)
	int field1226;
	@ObfuscatedName("bg")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cb")
	boolean field1252;
	@ObfuscatedName("cj")
	boolean field1222;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1723863083
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 328219357
	)
	int field1224;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 260735143
	)
	int field1225;
	@ObfuscatedName("cl")
	int[] field1262;
	@ObfuscatedName("ci")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ct")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cm")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cd")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cc")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cn")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 1323133659
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cu")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1710238225
	)
	int field1272;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1633594777
	)
	int field1237;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1077681299
	)
	int field1216;
	@ObfuscatedName("co")
	boolean field1239;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -736904749
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 361836319
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -270358857
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 641905945
	)
	int field1243;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -1037212889
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1332788851
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1127621139
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 2011747125
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -2087063199
	)
	int field1248;
	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1837002709
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -591572193
	)
	int field1251;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -235809
	)
	int field1258;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 795656539
	)
	int field1238;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1114212247
	)
	int field1253;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -781644513
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 1902776145
	)
	int field1256;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 991529221
	)
	int field1203;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 65821175
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 393857127
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1876849975
	)
	int field1260;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 940209169
	)
	int field1236;
	@ObfuscatedName("dy")
	byte field1261;
	@ObfuscatedName("dt")
	byte field1263;
	@ObfuscatedName("de")
	byte field1235;
	@ObfuscatedName("dz")
	byte field1265;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -250909065
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -826008939
	)
	int field1267;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -110650303
	)
	int field1268;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -1259578643
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("du")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dc")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ej")
	@ObfuscatedSignature(
		descriptor = "[Liu;"
	)
	@Export("pathTraversed")
	class233[] pathTraversed;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -1186026863
	)
	int field1257;
	@ObfuscatedName("en")
	@ObfuscatedGetter(
		intValue = -623530183
	)
	int field1274;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = -1972614327
	)
	int field1275;

	Actor() {
		this.isWalking = false;
		this.field1249 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1213 = -1;
		this.field1214 = -1;
		this.field1215 = -1;
		this.field1264 = -1;
		this.field1269 = -1;
		this.field1218 = -1;
		this.field1226 = -1;
		this.overheadText = null;
		this.field1222 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1224 = 0;
		this.field1225 = 0;
		this.field1262 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1272 = -1;
		this.field1237 = -1;
		this.field1216 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1243 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1248 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1260 = -1;
		this.field1236 = -1;
		this.field1267 = 0;
		this.field1268 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class233[10];
		this.field1257 = 0;
		this.field1274 = 0;
		this.field1275 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "951800784"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "71"
	)
	final void method2393() {
		this.pathLength = 0;
		this.field1274 = 0;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-275518772"
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
			HitSplatDefinition var12 = class193.method3723(var1);
			var10 = var12.field2229;
			var11 = var12.field2227;
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-427923599"
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
			var8.field2061 = var1;
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
			if (var13.definition.field2061 == var8.field2061) {
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
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
			var3.field2061 = var1;
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

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1044792612"
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
		descriptor = "(B)Lto;",
		garbageValue = "-37"
	)
	IterableNodeHashTable method2399() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-356157819"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8943(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(Ljn;I)Ljn;",
		garbageValue = "1979045598"
	)
	Model method2401(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2829;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method8943(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = UserComparator3.SpotAnimationDefinition_get(var7.spotAnimation).method3940();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5058(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method8943(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = UserComparator3.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method5058(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1848872872"
	)
	void method2419() {
		this.field1239 = false;
		this.field1272 = -1;
		this.field1237 = -1;
		this.field1216 = -1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-2088786442"
	)
	static int method2392(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "1179769137"
	)
	public static void method2413(Widget var0, int var1) {
		ItemComposition var2 = HttpRequest.ItemDefinition_get(var1);
		var0.field3801.equipment[var2.maleModel] = var1 + 512;
		if (var2.maleModel1 != -1) {
			var0.field3801.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			var0.field3801.equipment[var2.maleModel2] = 0;
		}

		var0.field3801.method6332();
	}
}
