import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1766410589
	)
	@Export("x")
	int x;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1556616227
	)
	@Export("y")
	int y;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 1594942263
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -1748580133
	)
	int field1223;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -88027347
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 690241029
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 190803943
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -121091159
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1501618131
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1132330219
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1584060379
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 771169105
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -787306259
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1563977323
	)
	int field1194;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1081941851
	)
	int field1197;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1538712951
	)
	int field1198;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1380842751
	)
	int field1211;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1448312691
	)
	int field1200;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 91635021
	)
	int field1201;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1188504687
	)
	int field1202;
	@ObfuscatedName("bj")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("ct")
	boolean field1204;
	@ObfuscatedName("cf")
	boolean field1192;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 1809405787
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 559722085
	)
	int field1207;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = 1943627225
	)
	int field1208;
	@ObfuscatedName("cj")
	int[] field1189;
	@ObfuscatedName("cw")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ce")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cq")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cm")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("ca")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cx")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = -222805781
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cr")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1129335637
	)
	int field1219;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1575237503
	)
	int field1220;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -2038244283
	)
	int field1221;
	@ObfuscatedName("cl")
	boolean field1222;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = 898222983
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -7108387
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -567357867
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -2008098921
	)
	int field1193;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 1584912307
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 512786407
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = 1666737641
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -665241399
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1779633697
	)
	int field1199;
	@ObfuscatedName("dj")
	@ObfuscatedSignature(
		descriptor = "Lsa;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 697829181
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -124938771
	)
	int field1234;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 260123841
	)
	int field1196;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1666423841
	)
	int field1236;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = -1261182483
	)
	int field1224;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -287971117
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -609952917
	)
	int field1239;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -1252810341
	)
	int field1232;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -868708075
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 357335143
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -530524667
	)
	int field1183;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 1527917085
	)
	int field1244;
	@ObfuscatedName("dz")
	byte field1245;
	@ObfuscatedName("dx")
	byte field1238;
	@ObfuscatedName("dp")
	byte field1247;
	@ObfuscatedName("ds")
	byte field1248;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 2136410599
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dv")
	@ObfuscatedGetter(
		intValue = 1121995239
	)
	int field1250;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -215065449
	)
	int field1251;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1181401597
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("db")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dw")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "[Lio;"
	)
	@Export("pathTraversed")
	class218[] pathTraversed;
	@ObfuscatedName("em")
	@ObfuscatedGetter(
		intValue = 122518907
	)
	int field1256;
	@ObfuscatedName("ec")
	@ObfuscatedGetter(
		intValue = 1669409601
	)
	int field1257;
	@ObfuscatedName("el")
	@ObfuscatedGetter(
		intValue = 1655690669
	)
	int field1258;

	Actor() {
		this.isWalking = false;
		this.field1223 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1194 = -1;
		this.field1197 = -1;
		this.field1198 = -1;
		this.field1211 = -1;
		this.field1200 = -1;
		this.field1201 = -1;
		this.field1202 = -1;
		this.overheadText = null;
		this.field1192 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1207 = 0;
		this.field1208 = 0;
		this.field1189 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1219 = -1;
		this.field1220 = -1;
		this.field1221 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1193 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1199 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1183 = -1;
		this.field1244 = -1;
		this.field1250 = 0;
		this.field1251 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class218[10];
		this.field1256 = 0;
		this.field1257 = 0;
		this.field1258 = -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "179353417"
	)
	final void method2400() {
		this.pathLength = 0;
		this.field1257 = 0;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "114"
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
			HitSplatDefinition var12 = class177.method3541(var1);
			var10 = var12.field2131;
			var11 = var12.field2123;
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-730054495"
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
			var8.field1962 = var1;
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
			if (var13.definition.field1962 == var8.field1962) {
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "281579888"
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
			var3.field1962 = var1;
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

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "921981147"
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

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Lsa;",
		garbageValue = "655512297"
	)
	IterableNodeHashTable method2388() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1776103193"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8761(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(Ljo;I)Ljo;",
		garbageValue = "1288995708"
	)
	Model method2391(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2683;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method8761(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = NPCComposition.SpotAnimationDefinition_get(var7.spotAnimation).method3778();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method4810(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method8761(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = NPCComposition.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method4810(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "110"
	)
	void method2392() {
		this.field1222 = false;
		this.field1219 = -1;
		this.field1220 = -1;
		this.field1221 = -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "-19"
	)
	public static void method2413(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method2413(var0, var1, var2, var5 - 1);
			method2413(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V",
		garbageValue = "-4545"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("gk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	static void method2418() {
		class20.field114 = System.getenv("JX_ACCESS_TOKEN");
		Script.field1003 = System.getenv("JX_REFRESH_TOKEN");
		class11.field65 = System.getenv("JX_SESSION_ID");
		Login.field960 = System.getenv("JX_CHARACTER_ID");
		String var0 = System.getenv("JX_DISPLAY_NAME");
		String var1;
		if (var0 != null && !var0.isEmpty() && var0.charAt(0) != '#') {
			var1 = var0;
		} else {
			var1 = "";
		}

		Login.field940 = var1;
	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-2105376256"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = class113.fontPlain12.lineWidth(var0, 250);
			int var6 = class113.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6, 16777215);
			class113.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			Skeleton.method4553(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var2 + var6);
			if (var1) {
				class156.rasterProvider.drawFull(0, 0);
			} else {
				int var7 = var3;
				int var8 = var4;
				int var9 = var5;
				int var10 = var6;

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
					if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetHeights[var11] + Client.rootWidgetYs[var11] > var8 && Client.rootWidgetYs[var11] < var10 + var8) {
						Client.field735[var11] = true;
					}
				}
			}

		}
	}

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(Ldn;ZI)V",
		garbageValue = "1063629203"
	)
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = (int)var0.key;
		var0.remove();
		if (var1 && var2 != -1 && Widget.Widget_loadedInterfaces[var2]) {
			ArchiveLoader.Widget_archive.clearFilesGroup(var2);
			if (ArchiveLoader.Widget_interfaceComponents[var2] != null) {
				for (int var4 = 0; var4 < ArchiveLoader.Widget_interfaceComponents[var2].length; ++var4) {
					if (ArchiveLoader.Widget_interfaceComponents[var2][var4] != null) {
						ArchiveLoader.Widget_interfaceComponents[var2][var4] = null;
					}
				}

				ArchiveLoader.Widget_interfaceComponents[var2] = null;
				Widget.Widget_loadedInterfaces[var2] = false;
			}
		}

		for (IntegerNode var5 = (IntegerNode)Client.widgetFlags.first(); var5 != null; var5 = (IntegerNode)Client.widgetFlags.next()) {
			if ((var5.key >> 48 & 65535L) == (long)var2) {
				var5.remove();
			}
		}

		Widget var6 = VarbitComposition.getWidget(var3);
		if (var6 != null) {
			class200.invalidateWidget(var6);
		}

		if (Client.rootInterface != -1) {
			ChatChannel.runIntfCloseListeners(Client.rootInterface, 1);
		}

	}
}
