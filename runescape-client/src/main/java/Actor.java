import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cx")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = 1627221919)
	@Export("x")
	int x;

	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 1229064101)
	@Export("y")
	int y;

	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = 859314757)
	@Export("rotation")
	int rotation;

	@ObfuscatedName("au")
	@Export("isWalking")
	boolean isWalking = false;

	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = 1116880781)
	int field1190 = 1;

	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 1586754657)
	@Export("playerCycle")
	int playerCycle;

	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = 202365461)
	@Export("idleSequence")
	int idleSequence = -1;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = -443851925)
	@Export("turnLeftSequence")
	int turnLeftSequence = -1;

	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = -1050697865)
	@Export("turnRightSequence")
	int turnRightSequence = -1;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = 831500559)
	@Export("walkSequence")
	int walkSequence = -1;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = -363813803)
	@Export("walkBackSequence")
	int walkBackSequence = -1;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = -48519097)
	@Export("walkLeftSequence")
	int walkLeftSequence = -1;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = 1481502379)
	@Export("walkRightSequence")
	int walkRightSequence = -1;

	@ObfuscatedName("az")
	@ObfuscatedGetter(intValue = -1744329137)
	@Export("runSequence")
	int runSequence = -1;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = 973353207)
	int field1140 = -1;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 85122549)
	int field1141 = -1;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = 1023655065)
	int field1149 = -1;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = -1595589709)
	int field1143 = -1;

	@ObfuscatedName("ao")
	@ObfuscatedGetter(intValue = -1230784115)
	int field1170 = -1;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = -121606743)
	int field1145 = -1;

	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = 561395115)
	int field1150 = -1;

	@ObfuscatedName("ac")
	@Export("overheadText")
	String overheadText = null;

	@ObfuscatedName("bq")
	@Export("isAutoChatting")
	boolean isAutoChatting;

	@ObfuscatedName("bn")
	boolean field1164 = false;

	@ObfuscatedName("bl")
	@ObfuscatedGetter(intValue = 620000609)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining = 100;

	@ObfuscatedName("bv")
	@ObfuscatedGetter(intValue = -1029513379)
	@Export("overheadTextColor")
	int overheadTextColor = 0;

	@ObfuscatedName("bu")
	@ObfuscatedGetter(intValue = 1684740929)
	@Export("overheadTextEffect")
	int overheadTextEffect = 0;

	@ObfuscatedName("bt")
	@Export("hitSplatCount")
	byte hitSplatCount = 0;

	@ObfuscatedName("bw")
	@Export("hitSplatTypes")
	int[] hitSplatTypes = new int[4];

	@ObfuscatedName("bd")
	@Export("hitSplatValues")
	int[] hitSplatValues = new int[4];

	@ObfuscatedName("bg")
	@Export("hitSplatCycles")
	int[] hitSplatCycles = new int[4];

	@ObfuscatedName("by")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2 = new int[4];

	@ObfuscatedName("bs")
	@Export("hitSplatValues2")
	int[] hitSplatValues2 = new int[4];

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "Llx;")
	@Export("healthBars")
	IterableNodeDeque healthBars = new IterableNodeDeque();

	@ObfuscatedName("bx")
	@ObfuscatedGetter(intValue = 209400023)
	@Export("targetIndex")
	int targetIndex = -1;

	@ObfuscatedName("ba")
	@Export("false0")
	boolean false0 = false;

	@ObfuscatedName("bh")
	@ObfuscatedGetter(intValue = 1111975469)
	int field1162 = -1;

	@ObfuscatedName("bc")
	boolean field1163;

	@ObfuscatedName("bm")
	@ObfuscatedGetter(intValue = -1722266545)
	@Export("movementSequence")
	int movementSequence = -1;

	@ObfuscatedName("bp")
	@ObfuscatedGetter(intValue = -476097555)
	@Export("movementFrame")
	int movementFrame = 0;

	@ObfuscatedName("bz")
	@ObfuscatedGetter(intValue = 1156174571)
	@Export("movementFrameCycle")
	int movementFrameCycle = 0;

	@ObfuscatedName("bo")
	@ObfuscatedGetter(intValue = 1992697237)
	int field1167 = 0;

	@ObfuscatedName("bi")
	@ObfuscatedGetter(intValue = 317961021)
	@Export("sequence")
	int sequence = -1;

	@ObfuscatedName("bj")
	@ObfuscatedGetter(intValue = 950342315)
	@Export("sequenceFrame")
	int sequenceFrame = 0;

	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = -628849645)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle = 0;

	@ObfuscatedName("bk")
	@ObfuscatedGetter(intValue = -850715395)
	@Export("sequenceDelay")
	int sequenceDelay = 0;

	@ObfuscatedName("bf")
	@ObfuscatedGetter(intValue = 192722969)
	int field1172 = 0;

	@ObfuscatedName("ce")
	@ObfuscatedGetter(intValue = -2060788623)
	@Export("spotAnimation")
	int spotAnimation = -1;

	@ObfuscatedName("cb")
	@ObfuscatedGetter(intValue = 1267076011)
	@Export("spotAnimationFrame")
	int spotAnimationFrame = 0;

	@ObfuscatedName("co")
	@ObfuscatedGetter(intValue = 2064742585)
	@Export("spotAnimationFrameCycle")
	int spotAnimationFrameCycle = 0;

	@ObfuscatedName("cl")
	@ObfuscatedGetter(intValue = 1095735453)
	int field1176;

	@ObfuscatedName("cf")
	@ObfuscatedGetter(intValue = 1225658055)
	@Export("spotAnimationHeight")
	int spotAnimationHeight;

	@ObfuscatedName("ch")
	@ObfuscatedGetter(intValue = 1030903563)
	int field1178;

	@ObfuscatedName("cq")
	@ObfuscatedGetter(intValue = -1105142705)
	int field1179;

	@ObfuscatedName("ci")
	@ObfuscatedGetter(intValue = -347010529)
	int field1127;

	@ObfuscatedName("cx")
	@ObfuscatedGetter(intValue = 679512859)
	int field1181;

	@ObfuscatedName("cc")
	@ObfuscatedGetter(intValue = -1885865357)
	int field1182;

	@ObfuscatedName("cm")
	@ObfuscatedGetter(intValue = -1486525213)
	int field1183;

	@ObfuscatedName("cn")
	@ObfuscatedGetter(intValue = -1765855905)
	int field1136;

	@ObfuscatedName("cj")
	@ObfuscatedGetter(intValue = 1904328571)
	@Export("npcCycle")
	int npcCycle = 0;

	@ObfuscatedName("ct")
	@ObfuscatedGetter(intValue = -622538989)
	@Export("defaultHeight")
	int defaultHeight = 200;

	@ObfuscatedName("cp")
	@ObfuscatedGetter(intValue = 300576935)
	int field1187 = -1;

	@ObfuscatedName("cr")
	@ObfuscatedGetter(intValue = -719314241)
	int field1188 = -1;

	@ObfuscatedName("cs")
	byte field1189;

	@ObfuscatedName("cy")
	byte field1131;

	@ObfuscatedName("cw")
	byte field1191;

	@ObfuscatedName("cg")
	byte field1192;

	@ObfuscatedName("cd")
	@ObfuscatedGetter(intValue = 577155807)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("cz")
	@ObfuscatedGetter(intValue = -1510192509)
	int field1194 = 0;

	@ObfuscatedName("cu")
	@ObfuscatedGetter(intValue = 535616333)
	int field1180 = 32;

	@ObfuscatedName("ca")
	@ObfuscatedGetter(intValue = -2007282911)
	@Export("pathLength")
	int pathLength = 0;

	@ObfuscatedName("cv")
	@Export("pathX")
	int[] pathX = new int[10];

	@ObfuscatedName("ck")
	@Export("pathY")
	int[] pathY = new int[10];

	@ObfuscatedName("du")
	@ObfuscatedSignature(descriptor = "[Lgi;")
	@Export("pathTraversed")
	class192[] pathTraversed = new class192[10];

	@ObfuscatedName("di")
	@ObfuscatedGetter(intValue = -1185667037)
	int field1200 = 0;

	@ObfuscatedName("dw")
	@ObfuscatedGetter(intValue = 1063461451)
	int field1201 = 0;

	@ObfuscatedName("dy")
	@ObfuscatedGetter(intValue = -1123890181)
	int field1202 = -1;

	Actor() {
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-18")
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-114112856")
	final void method2149() {
		this.pathLength = 0;
		this.field1201 = 0;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(IIIIIII)V", garbageValue = "1265149339")
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
			HitSplatDefinition var12 = HealthBar.method2311(var1);
			var10 = var12.field2032;
			var11 = var12.field2019;
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

	@ObfuscatedName("by")
	@ObfuscatedSignature(descriptor = "(IIIIIIB)V", garbageValue = "5")
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var8 = ((HealthBarDefinition) (HealthBarDefinition.HealthBarDefinition_cached.get(((long) (var1)))));
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			byte[] var9 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var8 = new HealthBarDefinition();
			if (var9 != null) {
				var8.decode(new Buffer(var9));
			}
			HealthBarDefinition.HealthBarDefinition_cached.put(var8, ((long) (var1)));
			var7 = var8;
		}
		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;
		HealthBar var13;
		for (var13 = ((HealthBar) (this.healthBars.last())); var13 != null; var13 = ((HealthBar) (this.healthBars.previous()))) {
			++var12;
			if (var13.definition.field1862 == var8.field1862) {
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "2")
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = ((HealthBarDefinition) (HealthBarDefinition.HealthBarDefinition_cached.get(((long) (var1)))));
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var1);
			var3 = new HealthBarDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}
			HealthBarDefinition.HealthBarDefinition_cached.put(var3, ((long) (var1)));
			var2 = var3;
		}
		var3 = var2;
		for (HealthBar var5 = ((HealthBar) (this.healthBars.last())); var5 != null; var5 = ((HealthBar) (this.healthBars.previous()))) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2071136883")
	static final void method2163() {
		Client.field685 = Client.cycleCntr;
		DirectByteArrayCopier.ClanChat_inClanChat = true;
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(descriptor = "([BII)V", garbageValue = "-400960551")
	static void method2148(byte[] var0, int var1) {
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}
		class351.writeRandomDat(var0, var1, Client.randomDatData, 0, 24);
	}
}