import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dr")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 51908093
	)
	@Export("x")
	int x;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 450111749
	)
	@Export("y")
	int y;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -2096450799
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bm")
	int field1201;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 1874078453
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 249266279
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1789894491
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 332775185
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -2026712891
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1194661635
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1748061929
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -1321306909
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -21157331
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1110338289
	)
	int field1211;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1887405783
	)
	int field1252;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 1436242459
	)
	int field1213;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -205209549
	)
	int field1214;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 39304363
	)
	int field1215;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = -928383205
	)
	int field1216;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1651956753
	)
	int field1246;
	@ObfuscatedName("bg")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cw")
	boolean field1219;
	@ObfuscatedName("cf")
	boolean field1220;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1984260023
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1670480919
	)
	int field1222;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1372248375
	)
	int field1223;
	@ObfuscatedName("cx")
	int[] field1264;
	@ObfuscatedName("cd")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("ce")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cq")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cp")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cv")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("co")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 1926646529
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ch")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 2068155445
	)
	int field1234;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = 1967176287
	)
	int field1235;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -1617326933
	)
	int field1236;
	@ObfuscatedName("cg")
	boolean field1237;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -74098563
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1996741795
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -15077673
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1925148019
	)
	int field1241;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -1553687919
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = -1662504155
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 136905603
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 4675371
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 84726575
	)
	int field1224;
	@ObfuscatedName("du")
	@ObfuscatedSignature(
		descriptor = "Lsf;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 2127035337
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -1757389903
	)
	int field1249;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1365204549
	)
	int field1247;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 1398290153
	)
	int field1251;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -1177123047
	)
	int field1217;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1999731983
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1021724449
	)
	int field1254;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = -1945888581
	)
	int field1255;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = -902113611
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -610695377
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		intValue = 572723283
	)
	int field1258;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = -132963355
	)
	int field1200;
	@ObfuscatedName("dv")
	byte field1260;
	@ObfuscatedName("dr")
	byte field1218;
	@ObfuscatedName("do")
	byte field1212;
	@ObfuscatedName("db")
	byte field1250;
	@ObfuscatedName("dp")
	@ObfuscatedGetter(
		intValue = -609801851
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = -1514745499
	)
	int field1239;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1789885949
	)
	int field1266;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1388670275
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("de")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dc")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "[Lin;"
	)
	@Export("pathTraversed")
	class217[] pathTraversed;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 703114731
	)
	int field1271;
	@ObfuscatedName("ey")
	@ObfuscatedGetter(
		intValue = 1678896513
	)
	int field1261;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		intValue = -611368101
	)
	int field1273;

	Actor() {
		this.isWalking = false;
		this.field1201 = -1462459311;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1211 = -1;
		this.field1252 = -1;
		this.field1213 = -1;
		this.field1214 = -1;
		this.field1215 = -1;
		this.field1216 = -1;
		this.field1246 = -1;
		this.overheadText = null;
		this.field1220 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1222 = 0;
		this.field1223 = 0;
		this.field1264 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1234 = -1;
		this.field1235 = -1;
		this.field1236 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1241 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1224 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1258 = -1;
		this.field1200 = -1;
		this.field1239 = 0;
		this.field1266 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class217[10];
		this.field1271 = 0;
		this.field1261 = 0;
		this.field1273 = -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "381940201"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-71"
	)
	final void method2373() {
		this.pathLength = 0;
		this.field1261 = 0;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1923884006"
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
			HitSplatDefinition var12 = WorldMapCacheName.method5560(var1);
			var10 = var12.field2154;
			var11 = var12.field2161;
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

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1229115524"
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
			var8.field1994 = var1;
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
			if (var13.definition.field1994 == var8.field1994) {
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

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-711075108"
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
			var3.field1994 = var1;
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

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
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
		descriptor = "(I)Lsf;",
		garbageValue = "-343795604"
	)
	IterableNodeHashTable method2377() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-28624"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8713(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(Ljr;I)Ljr;",
		garbageValue = "-787093925"
	)
	Model method2379(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2723;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method8713(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = StructComposition.SpotAnimationDefinition_get(var7.spotAnimation).method3750();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method4842(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method8713(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = StructComposition.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method4842(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	void method2393() {
		this.field1237 = false;
		this.field1234 = -1;
		this.field1235 = -1;
		this.field1236 = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lto;I)V",
		garbageValue = "-1660235487"
	)
	@Export("updatePlayer")
	static final void updatePlayer(PacketBuffer var0) {
		var0.importIndex();
		int var1 = Client.localPlayerIndex;
		Player var2 = VarbitComposition.localPlayer = Client.players[var1] = new Player();
		var2.index = var1;
		int var3 = var0.readBits(30);
		byte var4 = (byte)(var3 >> 28);
		int var5 = var3 >> 14 & 16383;
		int var6 = var3 & 16383;
		var2.pathX[0] = var5 - UrlRequester.baseX * 64;
		var2.x = (var2.pathX[0] << 7) + (var2.transformedSize() << 6);
		var2.pathY[0] = var6 - class47.baseY * 64;
		var2.y = (var2.pathY[0] << 7) + (var2.transformedSize() << 6);
		HealthBar.Client_plane = var2.plane = var4;
		if (Players.field1388[var1] != null) {
			var2.read(Players.field1388[var1]);
		}

		Players.Players_count = 0;
		Players.Players_indices[++Players.Players_count - 1] = var1;
		Players.field1387[var1] = 0;
		Players.Players_emptyIdxCount = 0;

		for (int var7 = 1; var7 < 2048; ++var7) {
			if (var7 != var1) {
				int var8 = var0.readBits(18);
				int var9 = var8 >> 16;
				int var10 = var8 >> 8 & 597;
				int var11 = var8 & 597;
				Players.Players_regions[var7] = (var10 << 14) + var11 + (var9 << 28);
				Players.Players_orientations[var7] = 0;
				Players.Players_targetIndices[var7] = -1;
				Players.Players_emptyIndices[++Players.Players_emptyIdxCount - 1] = var7;
				Players.field1387[var7] = 0;
			}
		}

		var0.exportIndex();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lon;IB)Lly;",
		garbageValue = "38"
	)
	public static PacketBufferNode method2407(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		int var7 = 0;
		byte[] var8 = null;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var6.startsWith("rainbow:")) {
			var7 = 12;
			var1 = var1.substring("rainbow:".length());
		} else if (var6.startsWith("pattern")) {
			var8 = Interpreter.method2049(var6);
			if (var8 != null) {
				var7 = var8.length + 12;
				var1 = var1.substring("pattern".length() + var8.length + 1);
			}
		}

		var6 = var1.toLowerCase();
		byte var9 = 0;
		if (var6.startsWith("wave:")) {
			var9 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var9 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var9 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var9 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var9 = 5;
			var1 = var1.substring("slide:".length());
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var9);
		if (var8 != null && Client.revision >= 214) {
			for (int var10 = 0; var10 < var8.length; ++var10) {
				var4.packetBuffer.writeByte(var8[var10]);
			}
		}

		class216.method4235(var4.packetBuffer, var1);
		if (var0 == class339.field3821.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.writeLengthByte(var4.packetBuffer.offset - var5);
		return var4;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)Z",
		garbageValue = "-1903392375"
	)
	static boolean method2406(PlayerComposition var0) {
		if (var0.equipment[0] < 512) {
			return false;
		} else {
			ItemComposition var1 = InvDefinition.ItemDefinition_get(var0.equipment[0] - 512);
			return var1.maleModel1 != class209.field2339.field2334 && var1.maleModel2 != class209.field2339.field2334;
		}
	}
}
