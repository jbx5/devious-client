import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cj")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("hv")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = -1118070755)
	@Export("x")
	int x;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = -1646015609)
	@Export("y")
	int y;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = -972787127)
	@Export("rotation")
	int rotation;

	@ObfuscatedName("ae")
	@Export("isWalking")
	boolean isWalking;

	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = 2047436751)
	int field1205;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 1050181507)
	@Export("playerCycle")
	int playerCycle;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 2097702445)
	@Export("idleSequence")
	int idleSequence;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = -1100537755)
	@Export("turnLeftSequence")
	int turnLeftSequence;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = -1115406841)
	@Export("turnRightSequence")
	int turnRightSequence;

	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = 615118423)
	@Export("walkSequence")
	int walkSequence;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = -280732815)
	@Export("walkBackSequence")
	int walkBackSequence;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = -1801716209)
	@Export("walkLeftSequence")
	int walkLeftSequence;

	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = -207098851)
	@Export("walkRightSequence")
	int walkRightSequence;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 282222667)
	@Export("runSequence")
	int runSequence;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 372349823)
	int field1180;

	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = 1469217257)
	int field1144;

	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 1010191265)
	int field1145;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = -1730351949)
	int field1155;

	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = 756854087)
	int field1179;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 582466563)
	int field1137;

	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 373349895)
	int field1149;

	@ObfuscatedName("as")
	@Export("overheadText")
	String overheadText;

	@ObfuscatedName("be")
	@Export("isAutoChatting")
	boolean isAutoChatting;

	@ObfuscatedName("bz")
	boolean field1152;

	@ObfuscatedName("bp")
	@ObfuscatedGetter(intValue = -1340711323)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;

	@ObfuscatedName("bf")
	@ObfuscatedGetter(intValue = 1575450167)
	@Export("overheadTextColor")
	int overheadTextColor;

	@ObfuscatedName("bg")
	@ObfuscatedGetter(intValue = -182052553)
	@Export("overheadTextEffect")
	int overheadTextEffect;

	@ObfuscatedName("bn")
	@Export("hitSplatCount")
	byte hitSplatCount;

	@ObfuscatedName("bq")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;

	@ObfuscatedName("bc")
	@Export("hitSplatValues")
	int[] hitSplatValues;

	@ObfuscatedName("bl")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;

	@ObfuscatedName("bv")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;

	@ObfuscatedName("bt")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;

	@ObfuscatedName("bh")
	@ObfuscatedSignature(descriptor = "Llk;")
	@Export("healthBars")
	IterableNodeDeque healthBars;

	@ObfuscatedName("bs")
	@ObfuscatedGetter(intValue = -271055267)
	@Export("targetIndex")
	int targetIndex;

	@ObfuscatedName("bk")
	@Export("false0")
	boolean false0;

	@ObfuscatedName("bb")
	@ObfuscatedGetter(intValue = -79075039)
	int field1165;

	@ObfuscatedName("ba")
	boolean field1161;

	@ObfuscatedName("bu")
	@ObfuscatedGetter(intValue = 606824383)
	@Export("movementSequence")
	int movementSequence;

	@ObfuscatedName("bw")
	@ObfuscatedGetter(intValue = 1101086801)
	@Export("movementFrame")
	int movementFrame;

	@ObfuscatedName("bi")
	@ObfuscatedGetter(intValue = -925467467)
	@Export("movementFrameCycle")
	int movementFrameCycle;

	@ObfuscatedName("bo")
	@ObfuscatedGetter(intValue = -792237997)
	@Export("sequence")
	int sequence;

	@ObfuscatedName("bx")
	@ObfuscatedGetter(intValue = 1937149831)
	@Export("sequenceFrame")
	int sequenceFrame;

	@ObfuscatedName("bm")
	@ObfuscatedGetter(intValue = 1066271643)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;

	@ObfuscatedName("by")
	@ObfuscatedGetter(intValue = 1022517063)
	@Export("sequenceDelay")
	int sequenceDelay;

	@ObfuscatedName("bj")
	@ObfuscatedGetter(intValue = -1788834823)
	int field1190;

	@ObfuscatedName("bd")
	@ObfuscatedGetter(intValue = -2008089801)
	@Export("spotAnimation")
	int spotAnimation;

	@ObfuscatedName("cr")
	@ObfuscatedGetter(intValue = 965779263)
	@Export("spotAnimationFrame")
	int spotAnimationFrame;

	@ObfuscatedName("cq")
	@ObfuscatedGetter(intValue = -338713871)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle;

	@ObfuscatedName("cw")
	@ObfuscatedGetter(intValue = 1296382665)
	int field1178;

	@ObfuscatedName("cx")
	@ObfuscatedGetter(intValue = -1369289223)
	@Export("spotAnimationHeight")
	int spotAnimationHeight;

	@ObfuscatedName("cc")
	@ObfuscatedGetter(intValue = -1719412661)
	int field1140;

	@ObfuscatedName("cm")
	@ObfuscatedGetter(intValue = 960222749)
	int field1181;

	@ObfuscatedName("ci")
	@ObfuscatedGetter(intValue = 1156188427)
	int field1182;

	@ObfuscatedName("cg")
	@ObfuscatedGetter(intValue = 1597921931)
	int field1183;

	@ObfuscatedName("cj")
	@ObfuscatedGetter(intValue = -379199875)
	int field1184;

	@ObfuscatedName("cp")
	@ObfuscatedGetter(intValue = -777407565)
	int field1194;

	@ObfuscatedName("cf")
	@ObfuscatedGetter(intValue = -1595241739)
	int field1186;

	@ObfuscatedName("cv")
	@ObfuscatedGetter(intValue = 269273095)
	@Export("npcCycle")
	int npcCycle;

	@ObfuscatedName("cn")
	@ObfuscatedGetter(intValue = -954472933)
	@Export("defaultHeight")
	int defaultHeight;

	@ObfuscatedName("co")
	@ObfuscatedGetter(intValue = -338202467)
	int field1189;

	@ObfuscatedName("cz")
	@ObfuscatedGetter(intValue = 99787659)
	int field1135;

	@ObfuscatedName("cu")
	byte field1191;

	@ObfuscatedName("ce")
	byte field1192;

	@ObfuscatedName("cy")
	byte field1193;

	@ObfuscatedName("ca")
	byte field1133;

	@ObfuscatedName("ck")
	@ObfuscatedGetter(intValue = 1887319247)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("cb")
	@ObfuscatedGetter(intValue = 291062025)
	int field1196;

	@ObfuscatedName("cs")
	@ObfuscatedGetter(intValue = 124924459)
	int field1129;

	@ObfuscatedName("cd")
	@ObfuscatedGetter(intValue = 1161369831)
	@Export("pathLength")
	int pathLength;

	@ObfuscatedName("cl")
	@Export("pathX")
	int[] pathX;

	@ObfuscatedName("ct")
	@Export("pathY")
	int[] pathY;

	@ObfuscatedName("ch")
	@ObfuscatedSignature(descriptor = "[Lgn;")
	@Export("pathTraversed")
	class192[] pathTraversed;

	@ObfuscatedName("dm")
	@ObfuscatedGetter(intValue = 278658953)
	int field1202;

	@ObfuscatedName("dd")
	@ObfuscatedGetter(intValue = 551206327)
	int field1203;

	@ObfuscatedName("dz")
	@ObfuscatedGetter(intValue = 71404267)
	int field1204;

	Actor() {
		this.isWalking = false;
		this.field1205 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1180 = -1;
		this.field1144 = -1;
		this.field1145 = -1;
		this.field1155 = -1;
		this.field1179 = -1;
		this.field1137 = -1;
		this.field1149 = -1;
		this.overheadText = null;
		this.field1152 = false;
		this.overheadTextCyclesRemaining = 100;
		this.overheadTextColor = 0;
		this.overheadTextEffect = 0;
		this.hitSplatCount = 0;
		this.hitSplatTypes = new int[4];
		this.hitSplatValues = new int[4];
		this.hitSplatCycles = new int[4];
		this.hitSplatTypes2 = new int[4];
		this.hitSplatValues2 = new int[4];
		this.healthBars = new IterableNodeDeque();
		this.targetIndex = -1;
		this.false0 = false;
		this.field1165 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1190 = 0;
		this.spotAnimation = -1;
		this.spotAnimationFrame = 0;
		this.spotAnimationFrameCycle = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1189 = -1;
		this.field1135 = -1;
		this.field1196 = 0;
		this.field1129 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class192[10];
		this.field1202 = 0;
		this.field1203 = 0;
		this.field1204 = -1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "9013641")
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "585677791")
	final void method2182() {
		this.pathLength = 0;
		this.field1203 = 0;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(IIIIIIB)V", garbageValue = "7")
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
			HitSplatDefinition var12 = class122.method2800(var1);
			var10 = var12.field2035;
			var11 = var12.field2026;
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
				this.hitSplatCount = ((byte) ((this.hitSplatCount + 1) % 4));
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

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "(IIIIIIS)V", garbageValue = "134")
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = MusicPatchNode2.method5244(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;
		HealthBar var12;
		for (var12 = ((HealthBar) (this.healthBars.last())); var12 != null; var12 = ((HealthBar) (this.healthBars.previous()))) {
			++var11;
			if (var12.definition.field1876 == var7.field1876) {
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-330258668")
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = MusicPatchNode2.method5244(var1);
		for (HealthBar var3 = ((HealthBar) (this.healthBars.last())); var3 != null; var3 = ((HealthBar) (this.healthBars.previous()))) {
			if (var2 == var3.definition) {
				var3.remove();
				return;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "([Lla;II)Lla;", garbageValue = "822359584")
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0;
		for (int var3 = 0; var3 < var2.length; ++var3) {
			MouseWheel var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}
		return null;
	}
}