import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("hg")
	static String field1264;
	@ObfuscatedName("or")
	@ObfuscatedGetter(
		intValue = -1997964845
	)
	static int field1263;
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1919662235
	)
	@Export("x")
	int x;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 911384671
	)
	@Export("y")
	int y;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -588472147
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1427239535
	)
	int field1189;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 853525071
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1870832023
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 711329225
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 1955286379
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 2142725019
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1536012287
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1590359877
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 194641425
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -956343027
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 851255097
	)
	int field1217;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 379475913
	)
	int field1202;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 533100813
	)
	int field1201;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1964851679
	)
	int field1196;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1213518445
	)
	int field1203;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1575869773
	)
	int field1219;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1610158485
	)
	int field1205;
	@ObfuscatedName("bw")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ce")
	boolean field1207;
	@ObfuscatedName("cu")
	boolean field1246;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -446384933
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -45531341
	)
	int field1255;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1181300791
	)
	int field1211;
	@ObfuscatedName("cg")
	int[] field1194;
	@ObfuscatedName("cy")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cz")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cp")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cb")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cn")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("ck")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1482943907
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cm")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -2028645779
	)
	int field1223;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1257229145
	)
	int field1224;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = 192715273
	)
	int field1225;
	@ObfuscatedName("cx")
	boolean field1240;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1254111705
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1652738685
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 1922167537
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 83237739
	)
	int field1230;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1375718357
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1585646031
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1449210549
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -850382141
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 1090369209
	)
	int field1235;
	@ObfuscatedName("dx")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 68470013
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = 172762721
	)
	int field1238;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 905960377
	)
	int field1239;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1850051391
	)
	int field1185;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -469844753
	)
	int field1204;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1043406851
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = 1475992005
	)
	int field1243;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -518788005
	)
	int field1254;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = 1543236747
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 1697854741
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -996539833
	)
	int field1247;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 566294173
	)
	int field1248;
	@ObfuscatedName("du")
	byte field1249;
	@ObfuscatedName("dr")
	byte field1250;
	@ObfuscatedName("dw")
	byte field1251;
	@ObfuscatedName("di")
	byte field1252;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -1377423675
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 487721571
	)
	int field1212;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1597837779
	)
	int field1216;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = 609746431
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dc")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("da")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	@Export("pathTraversed")
	class231[] pathTraversed;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 162940213
	)
	int field1233;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1502128755
	)
	int field1261;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = -893205417
	)
	int field1262;

	Actor() {
		this.isWalking = false;
		this.field1189 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1217 = -1;
		this.field1202 = -1;
		this.field1201 = -1;
		this.field1196 = -1;
		this.field1203 = -1;
		this.field1219 = -1;
		this.field1205 = -1;
		this.overheadText = null;
		this.field1246 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1255 = 0;
		this.field1211 = 0;
		this.field1194 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1223 = -1;
		this.field1224 = -1;
		this.field1225 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1230 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1235 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1247 = -1;
		this.field1248 = -1;
		this.field1212 = 0;
		this.field1216 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class231[10];
		this.field1233 = 0;
		this.field1261 = 0;
		this.field1262 = -1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "188506301"
	)
	final void method2421() {
		this.pathLength = 0;
		this.field1261 = 0;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "2011213643"
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
			HitSplatDefinition var12 = class191.method3627(var1);
			var10 = var12.field2177;
			var11 = var12.field2175;
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

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "555870749"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = DefaultsGroup.method8264(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1982 == var7.field1982) {
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

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1727929675"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = DefaultsGroup.method8264(var1);

		for (HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1528136211"
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

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)Ltp;",
		garbageValue = "-113"
	)
	IterableNodeHashTable method2425() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "106644167"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8861(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(Ljn;B)Ljn;",
		garbageValue = "5"
	)
	Model method2448(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2746;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method8861(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = class406.SpotAnimationDefinition_get(var7.spotAnimation).method3863();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method4904(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method8861(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = class406.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method4904(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-57"
	)
	void method2430() {
		this.field1240 = false;
		this.field1223 = -1;
		this.field1224 = -1;
		this.field1225 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "-1751998077"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var1 = (byte)var0;
		} else if (var0 == 8364) {
			var1 = -128;
		} else if (var0 == 8218) {
			var1 = -126;
		} else if (var0 == 402) {
			var1 = -125;
		} else if (var0 == 8222) {
			var1 = -124;
		} else if (var0 == 8230) {
			var1 = -123;
		} else if (var0 == 8224) {
			var1 = -122;
		} else if (var0 == 8225) {
			var1 = -121;
		} else if (var0 == 710) {
			var1 = -120;
		} else if (var0 == 8240) {
			var1 = -119;
		} else if (var0 == 352) {
			var1 = -118;
		} else if (var0 == 8249) {
			var1 = -117;
		} else if (var0 == 338) {
			var1 = -116;
		} else if (var0 == 381) {
			var1 = -114;
		} else if (var0 == 8216) {
			var1 = -111;
		} else if (var0 == 8217) {
			var1 = -110;
		} else if (var0 == 8220) {
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) {
			var1 = -101;
		} else if (var0 == 339) {
			var1 = -100;
		} else if (var0 == 382) {
			var1 = -98;
		} else if (var0 == 376) {
			var1 = -97;
		} else {
			var1 = 63;
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1768262837"
	)
	public static void method2456() {
		StructComposition.StructDefinition_cached.clear();
	}
}
