import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1981894979
	)
	@Export("x")
	int x;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -553869971
	)
	@Export("y")
	int y;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -613105557
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 741168960
	)
	int field1175;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 861061275
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -57288001
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 398756119
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -789848963
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1684928235
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1616831875
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -226477313
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -734962931
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 2065564805
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -1465035877
	)
	int field1187;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 838906559
	)
	int field1186;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1263006309
	)
	int field1218;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 533777497
	)
	int field1188;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -2071850175
	)
	int field1178;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 438747425
	)
	int field1190;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -1346806619
	)
	int field1191;
	@ObfuscatedName("bo")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cg")
	boolean field1202;
	@ObfuscatedName("cb")
	boolean field1194;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 922797311
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1069021353
	)
	int field1185;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -1015873939
	)
	int field1197;
	@ObfuscatedName("cp")
	int[] field1198;
	@ObfuscatedName("cl")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cs")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cc")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cd")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cu")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("co")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 2082686177
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ch")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -270277227
	)
	int field1208;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1481859161
	)
	int field1213;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -582178951
	)
	int field1210;
	@ObfuscatedName("ck")
	boolean field1211;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 431142937
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1588769625
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -290182791
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1691490063
	)
	int field1196;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -70627403
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 125822657
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -56884747
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -1260773255
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1322171187
	)
	int field1220;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 734589831
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = -977458449
	)
	int field1223;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 2101143253
	)
	int field1224;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 2137160791
	)
	int field1225;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 67797235
	)
	int field1226;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 614984107
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -1821967681
	)
	int field1228;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 559101335
	)
	int field1173;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 987336325
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1152309747
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -780782197
	)
	int field1180;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -1319111797
	)
	int field1233;
	@ObfuscatedName("dk")
	byte field1234;
	@ObfuscatedName("df")
	byte field1193;
	@ObfuscatedName("do")
	byte field1204;
	@ObfuscatedName("dx")
	byte field1237;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1049998599
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1997571179
	)
	int field1239;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 246420971
	)
	int field1240;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 6573123
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dy")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dl")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("el")
	@ObfuscatedSignature(
		descriptor = "[Lir;"
	)
	@Export("pathTraversed")
	class231[] pathTraversed;
	@ObfuscatedName("et")
	@ObfuscatedGetter(
		intValue = -759355775
	)
	int field1245;
	@ObfuscatedName("eo")
	@ObfuscatedGetter(
		intValue = 854159423
	)
	int field1215;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = -1711073399
	)
	int field1192;

	Actor() {
		this.isWalking = false;
		this.field1175 = 64;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1187 = -1;
		this.field1186 = -1;
		this.field1218 = -1;
		this.field1188 = -1;
		this.field1178 = -1;
		this.field1190 = -1;
		this.field1191 = -1;
		this.overheadText = null;
		this.field1194 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1185 = 0;
		this.field1197 = 0;
		this.field1198 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1208 = -1;
		this.field1213 = -1;
		this.field1210 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1196 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1220 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1180 = -1;
		this.field1233 = -1;
		this.field1239 = 0;
		this.field1240 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class231[10];
		this.field1245 = 0;
		this.field1215 = 0;
		this.field1192 = -1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-4"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-100546177"
	)
	final void method2468() {
		this.pathLength = 0;
		this.field1215 = 0;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "374247798"
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
			HitSplatDefinition var12 = class192.method3790(var1);
			var10 = var12.field2071;
			var11 = var12.field2069;
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

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "908555621"
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
			var8.field1887 = var1;
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
			if (var13.definition.field1887 == var8.field1887) {
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
		garbageValue = "10"
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
			var3.field1887 = var1;
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1361275855"
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

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I)Ltb;",
		garbageValue = "-1558428240"
	)
	IterableNodeHashTable method2455() {
		return this.spotAnimations;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "50"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9062(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)Lko;",
		garbageValue = "1947094872"
	)
	Model method2486(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2993;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method9062(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = class151.SpotAnimationDefinition_get(var7.spotAnimation).method3795();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5635(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method9062(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = class151.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method5635(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "529168059"
	)
	void method2460() {
		this.field1211 = false;
		this.field1208 = -1;
		this.field1213 = -1;
		this.field1210 = -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1459386223"
	)
	public static void method2488(int var0, int var1) {
		WorldMapRectangle.method5019(var0, var1, 0, 0);
		class319.field3466.clear();
		class319.field3462.clear();
		if (class319.musicSongs.isEmpty() || var0 == 0 && var1 == 0) {
			class150.method3304();
		} else {
			class319.field3462.add(new DelayFadeTask((SongTask)null, class319.musicPlayerStatus));
			class319.field3462.add(new FadeOutTask((SongTask)null, 0, false, class319.field3464));
			ArrayList var3 = new ArrayList();
			Iterator var4 = class319.musicSongs.iterator();

			while (var4.hasNext()) {
				MusicSong var5 = (MusicSong)var4.next();
				var3.add(var5);
			}

			class319.field3462.add(new class417((SongTask)null, var3));
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "526299186"
	)
	static void method2489(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}
}
