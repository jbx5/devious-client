import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.IOException;
import java.io.File;
import net.runelite.mapping.Export;
@ObfuscatedName("cs")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("ev")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive10")
	static Archive archive10;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = -537607707)
	@Export("x")
	int x;

	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 1991451267)
	@Export("y")
	int y;

	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = -317366093)
	@Export("rotation")
	int rotation;

	@ObfuscatedName("al")
	@Export("isWalking")
	boolean isWalking = false;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 111124851)
	int field1202 = 1;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = 946653701)
	@Export("playerCycle")
	int playerCycle;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 316067523)
	@Export("idleSequence")
	int idleSequence = -1;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = -1426265509)
	@Export("turnLeftSequence")
	int turnLeftSequence = -1;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = 178789113)
	@Export("turnRightSequence")
	int turnRightSequence = -1;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = -1203812637)
	@Export("walkSequence")
	int walkSequence = -1;

	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = -1440191925)
	@Export("walkBackSequence")
	int walkBackSequence = -1;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = -882598583)
	@Export("walkLeftSequence")
	int walkLeftSequence = -1;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = -536883565)
	@Export("walkRightSequence")
	int walkRightSequence = -1;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = -1357076803)
	@Export("runSequence")
	int runSequence = -1;

	@ObfuscatedName("av")
	@ObfuscatedGetter(intValue = 960352449)
	int field1199 = -1;

	@ObfuscatedName("ae")
	@ObfuscatedGetter(intValue = -502200883)
	int field1143 = -1;

	@ObfuscatedName("ay")
	@ObfuscatedGetter(intValue = -899005579)
	int field1144 = -1;

	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = 1618623663)
	int field1145 = -1;

	@ObfuscatedName("ao")
	@ObfuscatedGetter(intValue = -1908795387)
	int field1146 = -1;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = -1003186567)
	int field1147 = -1;

	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = -1078883857)
	int field1148 = -1;

	@ObfuscatedName("az")
	@Export("overheadText")
	String overheadText = null;

	@ObfuscatedName("bz")
	@Export("isAutoChatting")
	boolean isAutoChatting;

	@ObfuscatedName("bs")
	boolean field1151 = false;

	@ObfuscatedName("bg")
	@ObfuscatedGetter(intValue = 1475462461)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining = 100;

	@ObfuscatedName("bv")
	@ObfuscatedGetter(intValue = 535581087)
	@Export("overheadTextColor")
	int overheadTextColor = 0;

	@ObfuscatedName("ba")
	@ObfuscatedGetter(intValue = 626036729)
	@Export("overheadTextEffect")
	int overheadTextEffect = 0;

	@ObfuscatedName("bf")
	@Export("hitSplatCount")
	byte hitSplatCount = 0;

	@ObfuscatedName("bu")
	@Export("hitSplatTypes")
	int[] hitSplatTypes = new int[4];

	@ObfuscatedName("bk")
	@Export("hitSplatValues")
	int[] hitSplatValues = new int[4];

	@ObfuscatedName("bq")
	@Export("hitSplatCycles")
	int[] hitSplatCycles = new int[4];

	@ObfuscatedName("bj")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2 = new int[4];

	@ObfuscatedName("bt")
	@Export("hitSplatValues2")
	int[] hitSplatValues2 = new int[4];

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "Lln;")
	@Export("healthBars")
	IterableNodeDeque healthBars = new IterableNodeDeque();

	@ObfuscatedName("br")
	@ObfuscatedGetter(intValue = -766757299)
	@Export("targetIndex")
	int targetIndex = -1;

	@ObfuscatedName("be")
	@Export("false0")
	boolean false0 = false;

	@ObfuscatedName("bx")
	@ObfuscatedGetter(intValue = 1521222287)
	int field1164 = -1;

	@ObfuscatedName("bb")
	boolean field1152;

	@ObfuscatedName("by")
	@ObfuscatedGetter(intValue = 1451144151)
	@Export("movementSequence")
	int movementSequence = -1;

	@ObfuscatedName("bh")
	@ObfuscatedGetter(intValue = -1998267769)
	@Export("movementFrame")
	int movementFrame = 0;

	@ObfuscatedName("bc")
	@ObfuscatedGetter(intValue = -135575699)
	@Export("movementFrameCycle")
	int movementFrameCycle = 0;

	@ObfuscatedName("bo")
	@ObfuscatedGetter(intValue = 553173281)
	int field1141 = 0;

	@ObfuscatedName("bw")
	@ObfuscatedGetter(intValue = -1833058195)
	@Export("sequence")
	int sequence = -1;

	@ObfuscatedName("bm")
	@ObfuscatedGetter(intValue = -773219201)
	@Export("sequenceFrame")
	int sequenceFrame = 0;

	@ObfuscatedName("bl")
	@ObfuscatedGetter(intValue = 1435045029)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle = 0;

	@ObfuscatedName("bn")
	@ObfuscatedGetter(intValue = 1141471647)
	@Export("sequenceDelay")
	int sequenceDelay = 0;

	@ObfuscatedName("bi")
	@ObfuscatedGetter(intValue = 143630735)
	int field1174 = 0;

	@ObfuscatedName("ch")
	@ObfuscatedGetter(intValue = -1452307989)
	@Export("spotAnimation")
	int spotAnimation = -1;

	@ObfuscatedName("cd")
	@ObfuscatedGetter(intValue = 2035761433)
	@Export("spotAnimationFrame")
	int spotAnimationFrame = 0;

	@ObfuscatedName("ci")
	@ObfuscatedGetter(intValue = 217193265)
	int spotAnimationFrameCycle = 0;

	@ObfuscatedName("cp")
	@ObfuscatedGetter(intValue = 1536058191)
	int field1178;

	@ObfuscatedName("cg")
	@ObfuscatedGetter(intValue = -70635727)
	int spotAnimationHeight;

	@ObfuscatedName("cj")
	@ObfuscatedGetter(intValue = -104406783)
	int field1177;

	@ObfuscatedName("cz")
	@ObfuscatedGetter(intValue = -315753795)
	int field1188;

	@ObfuscatedName("ck")
	@ObfuscatedGetter(intValue = 270849611)
	int field1182;

	@ObfuscatedName("cs")
	@ObfuscatedGetter(intValue = -1487251973)
	int field1183;

	@ObfuscatedName("ca")
	@ObfuscatedGetter(intValue = -1502544871)
	int field1194;

	@ObfuscatedName("cq")
	@ObfuscatedGetter(intValue = -104818359)
	int field1166;

	@ObfuscatedName("cy")
	@ObfuscatedGetter(intValue = 217964137)
	int field1186;

	@ObfuscatedName("cw")
	@ObfuscatedGetter(intValue = 329688161)
	@Export("npcCycle")
	int npcCycle = 0;

	@ObfuscatedName("co")
	@ObfuscatedGetter(intValue = 1700146063)
	@Export("defaultHeight")
	int defaultHeight = 200;

	@ObfuscatedName("cr")
	@ObfuscatedGetter(intValue = -1545212437)
	int field1189 = -1;

	@ObfuscatedName("ct")
	@ObfuscatedGetter(intValue = 370010675)
	int field1136 = -1;

	@ObfuscatedName("cl")
	byte field1191;

	@ObfuscatedName("cn")
	byte field1168;

	@ObfuscatedName("cu")
	byte field1193;

	@ObfuscatedName("ce")
	byte field1184;

	@ObfuscatedName("cv")
	@ObfuscatedGetter(intValue = 877961797)
	@Export("orientation")
	int orientation;

	@ObfuscatedName("cx")
	@ObfuscatedGetter(intValue = -450622021)
	int field1196 = 0;

	@ObfuscatedName("cc")
	@ObfuscatedGetter(intValue = 1399167525)
	int field1197 = 32;

	@ObfuscatedName("cm")
	@ObfuscatedGetter(intValue = -1581137343)
	@Export("pathLength")
	int pathLength = 0;

	@ObfuscatedName("cb")
	@Export("pathX")
	int[] pathX = new int[10];

	@ObfuscatedName("cf")
	@Export("pathY")
	int[] pathY = new int[10];

	@ObfuscatedName("dz")
	@ObfuscatedSignature(descriptor = "[Lgl;")
	@Export("pathTraversed")
	class192[] pathTraversed = new class192[10];

	@ObfuscatedName("dc")
	@ObfuscatedGetter(intValue = 532547773)
	int field1142 = 0;

	@ObfuscatedName("dh")
	@ObfuscatedGetter(intValue = -960978771)
	int field1203 = 0;

	@ObfuscatedName("dt")
	@ObfuscatedGetter(intValue = -2087702069)
	int field1204 = -1;

	Actor() {
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2042091468")
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1025814898")
	final void method2252() {
		this.pathLength = 0;
		this.field1203 = 0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "(IIIIIIB)V", garbageValue = "-60")
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
			HitSplatDefinition var12 = GrandExchangeOfferOwnWorldComparator.method1095(var1);
			var10 = var12.field2007;
			var11 = var12.field2014;
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

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "(IIIIIII)V", garbageValue = "-954749131")
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
			if (var13.definition.field1879 == var8.field1879) {
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-15")
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lpi;", garbageValue = "-727013578")
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(UserComparator10.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}
		String var4 = "";
		if (KeyHandler.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (KeyHandler.cacheGamebuild == 34) {
			var4 = "_wip";
		}
		File var5 = new File(JagexCache.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}
		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "-1387002026")
	static int method2268(int var0, int var1, int var2) {
		if ((Tiles.Tiles_renderFlags[var0][var1][var2] & 8) != 0) {
			return 0;
		} else {
			return var0 > 0 && (Tiles.Tiles_renderFlags[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
		}
	}
}