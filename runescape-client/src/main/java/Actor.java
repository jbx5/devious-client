import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("Actor")
public abstract class Actor extends Renderable implements Entity {
	@ObfuscatedName("fs")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("lv")
	@ObfuscatedGetter(
		intValue = -491912993
	)
	@Export("oculusOrbFocalPointZ")
	static int oculusOrbFocalPointZ;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -2036971109
	)
	@Export("x")
	int x;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 430937913
	)
	@Export("y")
	int y;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -22187659
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1083666291
	)
	int field1183;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 474736165
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -702884821
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1395681409
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 306233409
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -988064505
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -883230939
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 1865660215
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 682335479
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -869425017
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1250672595
	)
	int field1251;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 646170679
	)
	int field1194;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 932399471
	)
	int field1195;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -2988955
	)
	int field1196;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1749645927
	)
	int field1197;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -962173513
	)
	int field1188;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -2032473951
	)
	int field1199;
	@ObfuscatedName("cu")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cz")
	boolean field1201;
	@ObfuscatedName("cm")
	boolean field1208;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1956680699
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 793807799
	)
	int field1204;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 1337012151
	)
	int field1205;
	@ObfuscatedName("cr")
	int[] field1206;
	@ObfuscatedName("cg")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cp")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cq")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("ci")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("co")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cn")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -634951883
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cf")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1299043627
	)
	int field1254;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -778411515
	)
	int field1200;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -94224709
	)
	int field1218;
	@ObfuscatedName("ck")
	boolean field1219;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -324063919
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1508287513
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -924601433
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 754326685
	)
	int field1192;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 783237933
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1536067011
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 871109515
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = -1752971295
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 855487601
	)
	int field1228;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1919650487
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -921007829
	)
	int field1231;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1752846413
	)
	int field1232;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1698045907
	)
	int field1233;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 223786313
	)
	int field1234;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -2012791199
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1180821771
	)
	int field1236;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -588464671
	)
	int field1237;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -139411033
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -1292678521
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 2055478607
	)
	int field1244;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -561374893
	)
	int field1241;
	@ObfuscatedName("dg")
	byte field1242;
	@ObfuscatedName("dt")
	byte field1243;
	@ObfuscatedName("du")
	byte field1240;
	@ObfuscatedName("dk")
	byte field1220;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 304279249
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1608275069
	)
	int field1247;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 1916494895
	)
	int field1221;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1409302933
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("ep")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("et")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "[Lko;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("ed")
	@ObfuscatedGetter(
		intValue = 1375050729
	)
	int field1253;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = -867607393
	)
	int field1255;
	@ObfuscatedName("eb")
	@ObfuscatedGetter(
		intValue = 620051501
	)
	int field1213;

	Actor() {
		this.isWalking = false;
		this.field1183 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1251 = -1;
		this.field1194 = -1;
		this.field1195 = -1;
		this.field1196 = -1;
		this.field1197 = -1;
		this.field1188 = -1;
		this.field1199 = -1;
		this.overheadText = null;
		this.field1208 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1204 = 0;
		this.field1205 = 0;
		this.field1206 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1254 = -1;
		this.field1200 = -1;
		this.field1218 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1192 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1228 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1244 = -1;
		this.field1241 = -1;
		this.field1247 = 0;
		this.field1221 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1253 = 0;
		this.field1255 = 0;
		this.field1213 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-184820238"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1980644711"
	)
	@Export("getPlane")
	public int getPlane() {
		return ConcurrentMidiTask.topLevelWorldView.plane;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "804082803"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "15"
	)
	final void method2555() {
		this.pathLength = 0;
		this.field1255 = 0;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-471879648"
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
			HitSplatDefinition var12 = class499.method8944(var1);
			var10 = var12.field2718;
			var11 = var12.field2708;
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1508085053"
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
			var8.field2511 = var1;
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var8, (long)var1);
			var7 = var8;
		}

		var8 = var7;
		HealthBarConfig var14 = null;
		HealthBarConfig var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBarConfig var13;
		for (var13 = (HealthBarConfig)this.healthBars.last(); var13 != null; var13 = (HealthBarConfig)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field2511 == var8.field2511) {
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
			var13 = new HealthBarConfig(var8);
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

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1509446921"
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
			var3.field2511 = var1;
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
			var2 = var3;
		}

		var3 = var2;

		for (HealthBarConfig var5 = (HealthBarConfig)this.healthBars.last(); var5 != null; var5 = (HealthBarConfig)this.healthBars.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "11"
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

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(I)Lud;",
		garbageValue = "1363488180"
	)
	IterableNodeHashTable method2525() {
		return this.spotAnimations;
	}

	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "42"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9276(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "(Lhr;I)Lhr;",
		garbageValue = "-599829063"
	)
	Model method2567(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2173;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method9276(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = AbstractWorldMapIcon.SpotAnimationDefinition_get(var7.spotAnimation).method4985();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method4264(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method9276(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = AbstractWorldMapIcon.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method4264(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1102658937"
	)
	void method2528() {
		this.field1219 = false;
		this.field1254 = -1;
		this.field1200 = -1;
		this.field1218 = -1;
	}

	@ObfuscatedName("de")
	@ObfuscatedSignature(
		descriptor = "(Ldy;B)Lnv;",
		garbageValue = "-12"
	)
	Coord method2531(WorldView var1) {
		if (var1 == ConcurrentMidiTask.topLevelWorldView) {
			return new Coord(this.getPlane(), this.getX(), this.getY());
		} else {
			WorldEntity var2 = ConcurrentMidiTask.topLevelWorldView.worldEntities[var1.id];
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
				double var10 = 3.141592653589793D * (double)(-var2.currentRotationAngle) / 1024.0D;
				double var12 = Math.cos(var10);
				double var14 = Math.sin(var10);
				int var16 = (int)(var12 * (double)var8 - (double)var9 * var14) + var3;
				int var17 = var4 + (int)((double)var9 * var12 + (double)var8 * var14);
				return new Coord(var5, var16, var17);
			}
		}
	}

	@ObfuscatedName("df")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "249718421"
	)
	int vmethod2812() {
		return this.defaultHeight;
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "-2016653442"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (FloorUnderlayDefinition.widgetDefinition.loadInterface(var0)) {
			class94.updateInterface(FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
