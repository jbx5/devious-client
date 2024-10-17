import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dw")
@Implements("Actor")
public abstract class Actor extends Renderable implements Entity {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1517174943
	)
	@Export("x")
	int x;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 669935203
	)
	@Export("y")
	int y;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 162348401
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1738213809
	)
	int field1220;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -288768005
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1825212243
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -488843473
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 929814349
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 230944687
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1120140271
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1607314093
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1711353447
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -424879037
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -23959615
	)
	int field1290;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -2089902749
	)
	int field1231;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 555026245
	)
	int field1232;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 386808161
	)
	int field1288;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 149085503
	)
	int field1224;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -823766241
	)
	int field1257;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -357411695
	)
	int field1236;
	@ObfuscatedName("bl")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("be")
	boolean field1238;
	@ObfuscatedName("cq")
	boolean field1239;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = -965596719
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1443985383
	)
	int field1241;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -1714468319
	)
	int field1242;
	@ObfuscatedName("cn")
	int[] field1243;
	@ObfuscatedName("cf")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cl")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cp")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cv")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cy")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("cu")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = 2051443375
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cx")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -576083883
	)
	int field1253;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 1821422805
	)
	int field1254;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -945097699
	)
	int field1258;
	@ObfuscatedName("cc")
	boolean field1256;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -1311335863
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = -1495720647
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 493332693
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1864378741
	)
	int field1260;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1489920319
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = 860313855
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = 224894203
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -965286275
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = 1911206699
	)
	int field1237;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lum;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -2053681327
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = 823410393
	)
	int field1268;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 1989536543
	)
	int field1286;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 1975083573
	)
	int field1228;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = -1323970747
	)
	int field1271;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = -1375768957
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 1654975057
	)
	int field1273;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 835957775
	)
	int field1223;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 878282627
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -890437199
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = -1276576339
	)
	int field1277;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = -991193773
	)
	int field1278;
	@ObfuscatedName("db")
	byte field1276;
	@ObfuscatedName("dv")
	byte field1280;
	@ObfuscatedName("dj")
	byte field1281;
	@ObfuscatedName("dp")
	byte field1282;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		intValue = 1155547371
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = 151347215
	)
	int field1284;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 657193545
	)
	int field1285;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1746074449
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dz")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("di")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "[Lkk;"
	)
	@Export("pathTraversed")
	MoveSpeed[] pathTraversed;
	@ObfuscatedName("eg")
	@ObfuscatedGetter(
		intValue = -312175609
	)
	int field1263;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = -322726623
	)
	int field1291;
	@ObfuscatedName("eh")
	@ObfuscatedGetter(
		intValue = 43361635
	)
	int field1292;

	Actor() {
		this.isWalking = false;
		this.field1220 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1290 = -1;
		this.field1231 = -1;
		this.field1232 = -1;
		this.field1288 = -1;
		this.field1224 = -1;
		this.field1257 = -1;
		this.field1236 = -1;
		this.overheadText = null;
		this.field1239 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1241 = 0;
		this.field1242 = 0;
		this.field1243 = null;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1253 = -1;
		this.field1254 = -1;
		this.field1258 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1260 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1237 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1277 = -1;
		this.field1278 = -1;
		this.field1284 = 0;
		this.field1285 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new MoveSpeed[10];
		this.field1263 = 0;
		this.field1291 = 0;
		this.field1292 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "86"
	)
	@Export("getX")
	public int getX() {
		return this.x;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-968853557"
	)
	@Export("getY")
	public int getY() {
		return this.y;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	@Export("getPlane")
	public int getPlane() {
		return class198.topLevelWorldView.plane;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1413118539"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("ca")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	final void method2715() {
		this.pathLength = 0;
		this.field1291 = 0;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-2"
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
			HitSplatDefinition var12 = class551.method10024(var1);
			var10 = var12.field2145;
			var11 = var12.field2151;
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
		garbageValue = "82"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class219.method4507(var1);
		HealthBarConfig var8 = null;
		HealthBarConfig var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBarConfig var12;
		for (var12 = (HealthBarConfig)this.healthBars.last(); var12 != null; var12 = (HealthBarConfig)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1951 == var7.field1951) {
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

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "147710705"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class219.method4507(var1);

		for (HealthBarConfig var3 = (HealthBarConfig)this.healthBars.last(); var3 != null; var3 = (HealthBarConfig)this.healthBars.previous()) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}

	}

	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-974042279"
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

	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "(S)Lum;",
		garbageValue = "4035"
	)
	IterableNodeHashTable method2721() {
		return this.spotAnimations;
	}

	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1464571844"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method9745(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("da")
	@ObfuscatedSignature(
		descriptor = "(Ljy;B)Ljy;",
		garbageValue = "-56"
	)
	Model method2731(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2832;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method9745(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = class362.SpotAnimationDefinition_get(var7.spotAnimation).method4068();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5392(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method9745(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = class362.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method5392(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("dr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2111354740"
	)
	void method2724() {
		this.field1256 = false;
		this.field1253 = -1;
		this.field1254 = -1;
		this.field1258 = -1;
	}

	@ObfuscatedName("dh")
	@ObfuscatedSignature(
		descriptor = "(Ldn;B)Lnn;",
		garbageValue = "-1"
	)
	Coord method2727(WorldView var1) {
		if (var1 == class198.topLevelWorldView) {
			return new Coord(this.getPlane(), this.getX(), this.getY());
		} else {
			WorldEntity var2 = class198.topLevelWorldView.worldEntities[var1.id];
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
				double var10 = (double)(-var2.method9147()) * 3.141592653589793D / 1024.0D;
				double var12 = Math.cos(var10);
				double var14 = Math.sin(var10);
				int var16 = var3 + (int)(var12 * (double)var8 - var14 * (double)var9);
				int var17 = var4 + (int)(var12 * (double)var9 + var14 * (double)var8);
				return new Coord(var5, var16, var17);
			}
		}
	}

	@ObfuscatedName("dg")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1402095723"
	)
	int vmethod2981() {
		return this.defaultHeight;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-69860981"
	)
	static void method2730() {
		Iterator var0 = class333.musicSongs.iterator();

		while (true) {
			MusicSong var1;
			do {
				if (!var0.hasNext()) {
					class333.musicSongs.clear();
					return;
				}

				var1 = (MusicSong)var0.next();
			} while(var1 == null);

			var1.midiPcmStream.clear();
			var1.midiPcmStream.method6606();
			var1.midiPcmStream.setPcmStreamVolume(0);
			var1.midiPcmStream.field3647 = 0;
			int var2 = var1.musicTrackGroupId;
			int var3 = var1.musicTrackFileId;
			Iterator var4 = class333.field3627.iterator();

			while (var4.hasNext()) {
				class339 var5 = (class339)var4.next();
				var5.vmethod6782(var2, var3);
			}
		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "603461933"
	)
	static final void method2771() {
		for (PendingSpawn var0 = (PendingSpawn)class198.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)class198.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				PcmPlayer.method838(class198.topLevelWorldView, var0);
			} else {
				var0.remove();
			}
		}

	}

	@ObfuscatedName("ma")
	@ObfuscatedSignature(
		descriptor = "([Lng;II)V",
		garbageValue = "1993562781"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id);
					if (var4 != null) {
						AbstractUserComparator.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					Ignored.runScriptEvent(var5);
				}

				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = class416.widgetDefinition.method6911(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					Ignored.runScriptEvent(var5);
				}
			}
		}

	}
}
