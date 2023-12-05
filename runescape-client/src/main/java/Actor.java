import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("df")
@Implements("Actor")
public abstract class Actor extends Renderable {
	@ObfuscatedName("an")
	@Export("isWalking")
	boolean isWalking;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -566542991
	)
	@Export("x")
	int x;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -119015489
	)
	@Export("y")
	int y;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -1115978189
	)
	@Export("rotation")
	int rotation;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = 328670719
	)
	int field1198;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -708453853
	)
	@Export("playerCycle")
	int playerCycle;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1507626977
	)
	@Export("idleSequence")
	int idleSequence;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1755887541
	)
	@Export("turnLeftSequence")
	int turnLeftSequence;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1720527121
	)
	@Export("turnRightSequence")
	int turnRightSequence;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 403226013
	)
	@Export("walkSequence")
	int walkSequence;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -989384247
	)
	@Export("walkBackSequence")
	int walkBackSequence;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -2049900857
	)
	@Export("walkLeftSequence")
	int walkLeftSequence;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -670575641
	)
	@Export("walkRightSequence")
	int walkRightSequence;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 273209973
	)
	@Export("runSequence")
	int runSequence;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 388785657
	)
	int field1185;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -2004441427
	)
	int field1186;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 660078083
	)
	int field1233;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1801934665
	)
	int field1188;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -586042643
	)
	int field1189;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1911959473
	)
	int field1190;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1857432021
	)
	int field1239;
	@ObfuscatedName("bq")
	@Export("overheadText")
	String overheadText;
	@ObfuscatedName("cf")
	boolean field1206;
	@ObfuscatedName("cg")
	boolean field1174;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = 2129131609
	)
	@Export("overheadTextCyclesRemaining")
	int overheadTextCyclesRemaining;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = 788736699
	)
	int field1196;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -1899316695
	)
	int field1197;
	@ObfuscatedName("ce")
	int[] field1236;
	@ObfuscatedName("ct")
	@Export("hitSplatCount")
	byte hitSplatCount;
	@ObfuscatedName("cw")
	@Export("hitSplatTypes")
	int[] hitSplatTypes;
	@ObfuscatedName("cq")
	@Export("hitSplatValues")
	int[] hitSplatValues;
	@ObfuscatedName("cl")
	@Export("hitSplatCycles")
	int[] hitSplatCycles;
	@ObfuscatedName("cs")
	@Export("hitSplatTypes2")
	int[] hitSplatTypes2;
	@ObfuscatedName("co")
	@Export("hitSplatValues2")
	int[] hitSplatValues2;
	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	@Export("healthBars")
	IterableNodeDeque healthBars;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 2050397061
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("cr")
	@Export("false0")
	boolean false0;
	@ObfuscatedName("cj")
	@ObfuscatedGetter(
		intValue = -402115953
	)
	int field1208;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -1781317999
	)
	int field1178;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1627124457
	)
	int field1210;
	@ObfuscatedName("cu")
	boolean field1211;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = 320895825
	)
	@Export("movementSequence")
	int movementSequence;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 914542215
	)
	@Export("movementFrame")
	int movementFrame;
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = -1781899867
	)
	@Export("movementFrameCycle")
	int movementFrameCycle;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = 1428922331
	)
	int field1248;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -760216869
	)
	@Export("sequence")
	int sequence;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = -1935303951
	)
	@Export("sequenceFrame")
	int sequenceFrame;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = 1840118521
	)
	@Export("sequenceFrameCycle")
	int sequenceFrameCycle;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = -945394067
	)
	@Export("sequenceDelay")
	int sequenceDelay;
	@ObfuscatedName("dk")
	@ObfuscatedGetter(
		intValue = 2089660561
	)
	int field1199;
	@ObfuscatedName("dd")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("spotAnimations")
	IterableNodeHashTable spotAnimations;
	@ObfuscatedName("dx")
	@ObfuscatedGetter(
		intValue = 1707756343
	)
	@Export("graphicsCount")
	int graphicsCount;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = 199035841
	)
	int field1209;
	@ObfuscatedName("du")
	@ObfuscatedGetter(
		intValue = 1567601611
	)
	int field1224;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = -2005383469
	)
	int field1194;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		intValue = -66691109
	)
	int field1203;
	@ObfuscatedName("do")
	@ObfuscatedGetter(
		intValue = -104636043
	)
	@Export("spotAnimation")
	int spotAnimation;
	@ObfuscatedName("db")
	@ObfuscatedGetter(
		intValue = -886385083
	)
	int field1187;
	@ObfuscatedName("dm")
	@ObfuscatedGetter(
		intValue = 1723230919
	)
	int field1229;
	@ObfuscatedName("dr")
	@ObfuscatedGetter(
		intValue = -1534078943
	)
	@Export("npcCycle")
	int npcCycle;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		intValue = 28818581
	)
	@Export("defaultHeight")
	int defaultHeight;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = 2141692895
	)
	int field1232;
	@ObfuscatedName("dw")
	@ObfuscatedGetter(
		intValue = 2117888191
	)
	int field1215;
	@ObfuscatedName("dp")
	byte field1234;
	@ObfuscatedName("df")
	byte field1235;
	@ObfuscatedName("dv")
	byte field1171;
	@ObfuscatedName("dz")
	byte field1237;
	@ObfuscatedName("dl")
	@ObfuscatedGetter(
		intValue = 1089128167
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("de")
	@ObfuscatedGetter(
		intValue = -1697894425
	)
	int field1192;
	@ObfuscatedName("dn")
	@ObfuscatedGetter(
		intValue = 1330672397
	)
	int field1240;
	@ObfuscatedName("dq")
	@ObfuscatedGetter(
		intValue = -1742381503
	)
	@Export("pathLength")
	int pathLength;
	@ObfuscatedName("dj")
	@Export("pathX")
	int[] pathX;
	@ObfuscatedName("dy")
	@Export("pathY")
	int[] pathY;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "[Liz;"
	)
	@Export("pathTraversed")
	class228[] pathTraversed;
	@ObfuscatedName("ew")
	@ObfuscatedGetter(
		intValue = -107205191
	)
	int field1245;
	@ObfuscatedName("ex")
	@ObfuscatedGetter(
		intValue = 1253684241
	)
	int field1220;
	@ObfuscatedName("ev")
	@ObfuscatedGetter(
		intValue = -375551905
	)
	int field1247;

	Actor() {
		this.isWalking = false;
		this.field1198 = 1;
		this.idleSequence = -1;
		this.turnLeftSequence = -1;
		this.turnRightSequence = -1;
		this.walkSequence = -1;
		this.walkBackSequence = -1;
		this.walkLeftSequence = -1;
		this.walkRightSequence = -1;
		this.runSequence = -1;
		this.field1185 = -1;
		this.field1186 = -1;
		this.field1233 = -1;
		this.field1188 = -1;
		this.field1189 = -1;
		this.field1190 = -1;
		this.field1239 = -1;
		this.overheadText = null;
		this.field1174 = false;
		this.overheadTextCyclesRemaining = 100;
		this.field1196 = 0;
		this.field1197 = 0;
		this.field1236 = null;
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
		this.field1178 = -1;
		this.field1210 = -1;
		this.movementSequence = -1;
		this.movementFrame = 0;
		this.movementFrameCycle = 0;
		this.field1248 = 0;
		this.sequence = -1;
		this.sequenceFrame = 0;
		this.sequenceFrameCycle = 0;
		this.sequenceDelay = 0;
		this.field1199 = 0;
		this.spotAnimations = new IterableNodeHashTable(4);
		this.graphicsCount = 0;
		this.npcCycle = 0;
		this.defaultHeight = 200;
		this.field1232 = -1;
		this.field1215 = -1;
		this.field1192 = 0;
		this.field1240 = 32;
		this.pathLength = 0;
		this.pathX = new int[10];
		this.pathY = new int[10];
		this.pathTraversed = new class228[10];
		this.field1245 = 0;
		this.field1220 = 0;
		this.field1247 = -1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1221291483"
	)
	@Export("isVisible")
	boolean isVisible() {
		return false;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "585669071"
	)
	final void method2461() {
		this.pathLength = 0;
		this.field1220 = 0;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "31"
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
			HitSplatDefinition var12 = class149.method3275(var1);
			var10 = var12.field2069;
			var11 = var12.field2060;
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

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-2108984921"
	)
	@Export("addHealthBar")
	final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
		HealthBarDefinition var7 = class92.method2445(var1);
		HealthBar var8 = null;
		HealthBar var9 = null;
		int var10 = var7.int2;
		int var11 = 0;

		HealthBar var12;
		for (var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
			++var11;
			if (var12.definition.field1870 == var7.field1870) {
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

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-875440561"
	)
	@Export("removeHealthBar")
	final void removeHealthBar(int var1) {
		HealthBarDefinition var2 = class92.method2445(var1);

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
		garbageValue = "-702211426"
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

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(B)Ltz;",
		garbageValue = "-1"
	)
	IterableNodeHashTable method2467() {
		return this.spotAnimations;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "98"
	)
	@Export("clearSpotAnimations")
	void clearSpotAnimations() {
		IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

		for (ActorSpotAnim var2 = (ActorSpotAnim)var1.method8937(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
			var2.remove();
		}

		this.graphicsCount = 0;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(Lka;I)Lka;",
		garbageValue = "-1145530728"
	)
	Model method2469(Model var1) {
		if (this.graphicsCount == 0) {
			return var1;
		} else {
			IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
			int var3 = var1.verticesCount;
			int var4 = var1.indicesCount;
			int var5 = var1.texIndicesCount;
			byte var6 = var1.field2951;

			for (ActorSpotAnim var7 = (ActorSpotAnim)var2.method8937(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
				if (var7.spotAnimationFrame != -1) {
					Model var8 = Canvas.SpotAnimationDefinition_get(var7.spotAnimation).method3766();
					if (var8 != null) {
						var3 += var8.verticesCount;
						var4 += var8.indicesCount;
						var5 += var8.texIndicesCount;
					}
				}
			}

			Model var10 = new Model(var3, var4, var5, var6);
			var10.method5644(var1);

			for (ActorSpotAnim var11 = (ActorSpotAnim)var2.method8937(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
				if (var11.spotAnimationFrame != -1) {
					Model var9 = Canvas.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
					if (var9 != null) {
						var9.offsetBy(0, -var11.spotAnimationHeight, 0);
						var10.method5644(var9);
					}
				}
			}

			return var10;
		}
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method2480() {
		this.field1211 = false;
		this.field1208 = -1;
		this.field1178 = -1;
		this.field1210 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbm;Lpf;Lpf;I)V",
		garbageValue = "1431524852"
	)
	@Export("loginScreen")
	static void loginScreen(GameEngine var0, Font var1, Font var2) {
		int var6;
		int var78;
		int var79;
		boolean var93;
		if (Login.worldSelectOpen) {
			class223 var76 = Client.field724;
			class223 var4 = var76;

			while (true) {
				if (!var4.method4324()) {
					if (MouseHandler.MouseHandler_lastButton != 1 && (class19.mouseCam || MouseHandler.MouseHandler_lastButton != 4)) {
						break;
					}

					int var77 = Login.xPadding + 280;
					if (MouseHandler.MouseHandler_lastPressedX >= var77 && MouseHandler.MouseHandler_lastPressedX <= var77 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						VarcInt.changeWorldSelectSorting(0, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var77 + 15 && MouseHandler.MouseHandler_lastPressedX <= var77 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						VarcInt.changeWorldSelectSorting(0, 1);
						break;
					}

					var6 = Login.xPadding + 390;
					if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						VarcInt.changeWorldSelectSorting(1, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var6 + 15 && MouseHandler.MouseHandler_lastPressedX <= var6 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						VarcInt.changeWorldSelectSorting(1, 1);
						break;
					}

					var78 = Login.xPadding + 500;
					if (MouseHandler.MouseHandler_lastPressedX >= var78 && MouseHandler.MouseHandler_lastPressedX <= var78 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						VarcInt.changeWorldSelectSorting(2, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var78 + 15 && MouseHandler.MouseHandler_lastPressedX <= var78 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						VarcInt.changeWorldSelectSorting(2, 1);
						break;
					}

					var79 = Login.xPadding + 610;
					if (MouseHandler.MouseHandler_lastPressedX >= var79 && MouseHandler.MouseHandler_lastPressedX <= var79 + 14 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						VarcInt.changeWorldSelectSorting(3, 0);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= var79 + 15 && MouseHandler.MouseHandler_lastPressedX <= var79 + 80 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedY <= 18) {
						VarcInt.changeWorldSelectSorting(3, 1);
						break;
					}

					if (MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 708 && MouseHandler.MouseHandler_lastPressedY >= 4 && MouseHandler.MouseHandler_lastPressedX <= Login.xPadding + 708 + 50 && MouseHandler.MouseHandler_lastPressedY <= 20) {
						Login.worldSelectOpen = false;
						class250.leftTitleSprite.drawAt(Login.xPadding, 0);
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
						break;
					}

					if (Login.hoveredWorldIndex != -1) {
						World var80 = class361.World_worlds[Login.hoveredWorldIndex];
						if (var80.isDeadman()) {
							var80.field808 = "beta";
						}

						boolean var10 = false;
						if (var80.properties != Client.worldProperties) {
							var93 = (Client.worldProperties & class522.field5109.rsOrdinal()) != 0;
							boolean var94 = var80.isDeadman();
							if (var93 && !var94 || !var93 && var94) {
								var10 = true;
							}
						}

						class28.changeWorld(var80);
						Login.worldSelectOpen = false;
						class250.leftTitleSprite.drawAt(Login.xPadding, 0);
						Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
						Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
						if (var10) {
							ByteArrayPool.method7920();
						}
					} else {
						if (Login.worldSelectPage > 0 && Varps.worldSelectLeftSprite != null && MouseHandler.MouseHandler_lastPressedX >= 0 && MouseHandler.MouseHandler_lastPressedX <= Varps.worldSelectLeftSprite.subWidth && MouseHandler.MouseHandler_lastPressedY >= class47.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class47.canvasHeight / 2 + 50) {
							--Login.worldSelectPage;
						}

						if (Login.worldSelectPage < Login.worldSelectPagesCount && class105.worldSelectRightSprite != null && MouseHandler.MouseHandler_lastPressedX >= Language.canvasWidth - class105.worldSelectRightSprite.subWidth - 5 && MouseHandler.MouseHandler_lastPressedX <= Language.canvasWidth && MouseHandler.MouseHandler_lastPressedY >= class47.canvasHeight / 2 - 50 && MouseHandler.MouseHandler_lastPressedY <= class47.canvasHeight / 2 + 50) {
							++Login.worldSelectPage;
						}
					}
					break;
				}

				if (var4.field2360 == 13) {
					Login.worldSelectOpen = false;
					class250.leftTitleSprite.drawAt(Login.xPadding, 0);
					Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
					Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
					break;
				}

				if (var4.field2360 == 96) {
					if (Login.worldSelectPage > 0 && Varps.worldSelectLeftSprite != null) {
						--Login.worldSelectPage;
					}
				} else if (var4.field2360 == 97 && Login.worldSelectPage < Login.worldSelectPagesCount && class105.worldSelectRightSprite != null) {
					++Login.worldSelectPage;
				}
			}

		} else {
			if ((MouseHandler.MouseHandler_lastButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= Login.xPadding + 765 - 50 && MouseHandler.MouseHandler_lastPressedY >= 453) {
				WorldMapIcon_1.clientPreferences.updateTitleMusicDisabled(!WorldMapIcon_1.clientPreferences.isTitleMusicDisabled());
				if (!WorldMapIcon_1.clientPreferences.isTitleMusicDisabled()) {
					ArrayList var3 = new ArrayList();
					var3.add(new MusicSong(class514.archive6, "scape main", "", 255, false));
					PendingSpawn.method2459(var3, 0, 0, 0, 100, false);
				} else {
					WorldMapRenderer.method4769(0, 0);
				}

				HttpContentType.method8564();
			}

			if (Client.gameState != 5) {
				if (-1L == Login.field928) {
					Login.field928 = SpotAnimationDefinition.method3775() + 1000L;
				}

				long var37 = SpotAnimationDefinition.method3775();
				boolean var5;
				if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
					while (true) {
						if (Client.archiveLoadersDone >= Client.archiveLoaders.size()) {
							var5 = true;
							break;
						}

						ArchiveLoader var39 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone);
						if (!var39.isLoaded()) {
							var5 = false;
							break;
						}

						++Client.archiveLoadersDone;
					}
				} else {
					var5 = true;
				}

				if (var5 && Login.field906 == -1L) {
					Login.field906 = var37;
					if (Login.field906 > Login.field928) {
						Login.field928 = Login.field906;
					}
				}

				if (Client.gameState == 10 || Client.gameState == 11) {
					if (class85.clientLanguage == Language.Language_EN) {
						if (MouseHandler.MouseHandler_lastButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_lastButton == 4) {
							var6 = Login.xPadding + 5;
							short var7 = 463;
							byte var8 = 100;
							byte var40 = 35;
							if (MouseHandler.MouseHandler_lastPressedX >= var6 && MouseHandler.MouseHandler_lastPressedX <= var6 + var8 && MouseHandler.MouseHandler_lastPressedY >= var7 && MouseHandler.MouseHandler_lastPressedY <= var7 + var40) {
								if (class241.loadWorlds()) {
									Login.worldSelectOpen = true;
									Login.worldSelectPage = 0;
									Login.worldSelectPagesCount = 0;
								}

								return;
							}
						}

						if (class542.World_request != null && class241.loadWorlds()) {
							Login.worldSelectOpen = true;
							Login.worldSelectPage = 0;
							Login.worldSelectPagesCount = 0;
						}
					}

					var6 = MouseHandler.MouseHandler_lastButton;
					var78 = MouseHandler.MouseHandler_lastPressedX;
					var79 = MouseHandler.MouseHandler_lastPressedY;
					if (var6 == 0) {
						var78 = MouseHandler.MouseHandler_x;
						var79 = MouseHandler.MouseHandler_y;
					}

					if (!class19.mouseCam && var6 == 4) {
						var6 = 1;
					}

					class223 var9 = Client.field724;
					class223 var41 = var9;
					short var82;
					int var83;
					if (Login.loginIndex == 0) {
						var93 = false;

						while (var41.method4324()) {
							if (var41.field2360 == 84) {
								var93 = true;
							}
						}

						var83 = class157.loginBoxCenter - 80;
						var82 = 291;
						if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20) {
							HealthBar.openURL(WorldMapID.method4938("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var83 = class157.loginBoxCenter + 80;
						if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20 || var93) {
							if ((Client.worldProperties & class522.field5111.rsOrdinal()) != 0) {
								Login.Login_response0 = "";
								Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world.";
								Login.Login_response2 = "Your normal account will not be affected.";
								Login.Login_response3 = "";
								UserComparator7.method2966(1);
								class150.method3281();
							} else if ((Client.worldProperties & class522.field5095.rsOrdinal()) != 0) {
								if ((Client.worldProperties & class522.field5103.rsOrdinal()) != 0) {
									Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other almost everywhere";
									Login.Login_response3 = "and the Protect Item prayer won't work.";
								} else {
									Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world.";
									Login.Login_response2 = "Players can attack each other";
									Login.Login_response3 = "almost everywhere.";
								}

								Login.Login_response0 = "Warning!";
								UserComparator7.method2966(1);
								class150.method3281();
							} else if ((Client.worldProperties & class522.field5103.rsOrdinal()) != 0) {
								Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world.";
								Login.Login_response2 = "The Protect Item prayer will";
								Login.Login_response3 = "not work on this world.";
								Login.Login_response0 = "Warning!";
								UserComparator7.method2966(1);
								class150.method3281();
							} else {
								SoundSystem.Login_promptCredentials(false);
							}
						}
					} else {
						int var11;
						short var12;
						if (Login.loginIndex == 1) {
							while (true) {
								if (!var41.method4324()) {
									var11 = class157.loginBoxCenter - 80;
									var12 = 321;
									if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
										SoundSystem.Login_promptCredentials(false);
									}

									var11 = class157.loginBoxCenter + 80;
									if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
										UserComparator7.method2966(0);
									}
									break;
								}

								if (var41.field2360 == 84) {
									SoundSystem.Login_promptCredentials(false);
								} else if (var41.field2360 == 13) {
									UserComparator7.method2966(0);
								}
							}
						} else {
							int var15;
							short var81;
							if (Login.loginIndex == 2) {
								var81 = 201;
								var11 = var81 + 52;
								if (var6 == 1 && var79 >= var11 - 12 && var79 < var11 + 2) {
									Login.currentLoginField = 0;
								}

								var11 += 15;
								if (var6 == 1 && var79 >= var11 - 12 && var79 < var11 + 2) {
									Login.currentLoginField = 1;
								}

								var11 += 15;
								var81 = 361;
								if (Login.field918 != null) {
									var83 = Login.field918.highX / 2;
									if (var6 == 1 && var78 >= Login.field918.lowX - var83 && var78 <= var83 + Login.field918.lowX && var79 >= var81 - 15 && var79 < var81) {
										switch(Login.field931) {
										case 1:
											HealthBar.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
											return;
										case 2:
											HealthBar.openURL("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var83 = class157.loginBoxCenter - 80;
								var82 = 321;
								if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20) {
									class478.method8609();
									return;
								}

								var83 = Login.loginBoxX + 180 + 80;
								if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20) {
									UserComparator7.method2966(0);
									Login.Login_username = "";
									Login.Login_password = "";
									class53.otpMedium = 0;
									NpcOverrides.otp = "";
									Login.rememberUsername = true;
								}

								var83 = class157.loginBoxCenter + -117;
								var82 = 277;
								Login.field916 = var78 >= var83 && var78 < var83 + NPCComposition.field1966 && var79 >= var82 && var79 < var82 + class113.field1426;
								if (var6 == 1 && Login.field916) {
									Client.Login_isUsernameRemembered = !Client.Login_isUsernameRemembered;
									if (!Client.Login_isUsernameRemembered && WorldMapIcon_1.clientPreferences.getRememberedUsername() != null) {
										WorldMapIcon_1.clientPreferences.updateRememberedUsername((String)null);
									}
								}

								var83 = class157.loginBoxCenter + 24;
								var82 = 277;
								Login.field919 = var78 >= var83 && var78 < var83 + NPCComposition.field1966 && var79 >= var82 && var79 < var82 + class113.field1426;
								if (var6 == 1 && Login.field919) {
									WorldMapIcon_1.clientPreferences.updateHideUsername(!WorldMapIcon_1.clientPreferences.isUsernameHidden());
									if (!WorldMapIcon_1.clientPreferences.isUsernameHidden()) {
										Login.Login_username = "";
										WorldMapIcon_1.clientPreferences.updateRememberedUsername((String)null);
										class150.method3281();
									}
								}

								while (true) {
									int var88;
									Transferable var104;
									do {
										while (true) {
											label1776:
											do {
												while (true) {
													while (var41.method4324()) {
														if (var41.field2360 != 13) {
															if (Login.currentLoginField != 0) {
																continue label1776;
															}

															char var87 = var41.field2363;

															for (var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length() && var87 != "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15); ++var15) {
															}

															if (var41.field2360 == 85 && Login.Login_username.length() > 0) {
																Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
															}

															if (var41.field2360 == 84 || var41.field2360 == 80) {
																Login.currentLoginField = 1;
															}

															if (WorldMapScaleHandler.method5058(var41.field2363) && Login.Login_username.length() < 320) {
																Login.Login_username = Login.Login_username + var41.field2363;
															}
														} else {
															UserComparator7.method2966(0);
															Login.Login_username = "";
															Login.Login_password = "";
															class53.otpMedium = 0;
															NpcOverrides.otp = "";
															Login.rememberUsername = true;
														}
													}

													return;
												}
											} while(Login.currentLoginField != 1);

											if (var41.field2360 == 85 && Login.Login_password.length() > 0) {
												Login.Login_password = Login.Login_password.substring(0, Login.Login_password.length() - 1);
											} else if (var41.field2360 == 84 || var41.field2360 == 80) {
												Login.currentLoginField = 0;
												if (var41.field2360 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class139.setLoginResponseString("", "Please enter your username/email address.", "");
														return;
													}

													if (Login.Login_password.length() == 0) {
														class139.setLoginResponseString("", "Please enter your password.", "");
														return;
													}

													class139.setLoginResponseString("", "Connecting to server...", "");
													VerticalAlignment.setAuthenticationScheme(false);
													WorldMapSection2.updateGameState(20);
													return;
												}
											}

											if ((var41.method4316(82) || var41.method4316(87)) && var41.field2360 == 67) {
												Clipboard var103 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var104 = var103.getContents(SpriteMask.client);
												var88 = 20 - Login.Login_password.length();
												break;
											}

											if (DirectByteArrayCopier.method6830(var41.field2363) && WorldMapScaleHandler.method5058(var41.field2363) && Login.Login_password.length() < 20) {
												Login.Login_password = Login.Login_password + var41.field2363;
											}
										}
									} while(var88 <= 0);

									try {
										String var89 = (String)var104.getTransferData(DataFlavor.stringFlavor);
										int var92 = Math.min(var88, var89.length());

										for (int var19 = 0; var19 < var92; ++var19) {
											if (!DirectByteArrayCopier.method6830(var89.charAt(var19)) || !WorldMapScaleHandler.method5058(var89.charAt(var19))) {
												UserComparator7.method2966(3);
												return;
											}
										}

										Login.Login_password = Login.Login_password + var89.substring(0, var92);
									} catch (UnsupportedFlavorException var74) {
									} catch (IOException var75) {
									}
								}
							} else {
								Bounds var44;
								if (Login.loginIndex == 3) {
									var11 = Login.loginBoxX + 180;
									var12 = 241;
									var44 = var1.method7668(25, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.".length() - 34, "need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", var11, var12);
									if (var6 == 1 && var44.method8373(var78, var79)) {
										HealthBar.openURL("https://oldschool.runescape.com/launcher", true, false);
									}

									var11 = Login.loginBoxX + 180;
									var12 = 276;
									if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
										ClientPreferences.method2645(false);
									}

									var11 = Login.loginBoxX + 180;
									var12 = 326;
									if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
										HealthBar.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										return;
									}
								} else {
									int var14;
									if (Login.loginIndex == 4) {
										var11 = Login.loginBoxX + 180 - 80;
										var12 = 321;
										if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
											NpcOverrides.otp.trim();
											if (NpcOverrides.otp.length() != 6) {
												class139.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
												return;
											}

											class53.otpMedium = Integer.parseInt(NpcOverrides.otp);
											NpcOverrides.otp = "";
											VerticalAlignment.setAuthenticationScheme(true);
											class139.setLoginResponseString("", "Connecting to server...", "");
											WorldMapSection2.updateGameState(20);
											return;
										}

										if (var6 == 1 && var78 >= Login.loginBoxX + 180 - 9 && var78 <= Login.loginBoxX + 180 + 130 && var79 >= 263 && var79 <= 296) {
											Login.rememberUsername = !Login.rememberUsername;
										}

										if (var6 == 1 && var78 >= Login.loginBoxX + 180 - 34 && var78 <= Login.loginBoxX + 34 + 180 && var79 >= 351 && var79 <= 363) {
											HealthBar.openURL("https://support.runescape.com/hc/en-gb/articles/360001552065", true, false);
										}

										var11 = Login.loginBoxX + 180 + 80;
										if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
											UserComparator7.method2966(0);
											Login.Login_username = "";
											Login.Login_password = "";
											class53.otpMedium = 0;
											NpcOverrides.otp = "";
										}

										while (var41.method4324()) {
											boolean var13 = false;

											for (var14 = 0; var14 < "1234567890".length(); ++var14) {
												if (var41.field2363 == "1234567890".charAt(var14)) {
													var13 = true;
													break;
												}
											}

											if (var41.field2360 == 13) {
												UserComparator7.method2966(0);
												Login.Login_username = "";
												Login.Login_password = "";
												class53.otpMedium = 0;
												NpcOverrides.otp = "";
											} else {
												if (var41.field2360 == 85 && NpcOverrides.otp.length() > 0) {
													NpcOverrides.otp = NpcOverrides.otp.substring(0, NpcOverrides.otp.length() - 1);
												}

												if (var41.field2360 == 84) {
													NpcOverrides.otp.trim();
													if (NpcOverrides.otp.length() != 6) {
														class139.setLoginResponseString("", "Please enter a 6-digit PIN.", "");
														return;
													}

													class53.otpMedium = Integer.parseInt(NpcOverrides.otp);
													NpcOverrides.otp = "";
													VerticalAlignment.setAuthenticationScheme(true);
													class139.setLoginResponseString("", "Connecting to server...", "");
													WorldMapSection2.updateGameState(20);
													return;
												}

												if (var13 && NpcOverrides.otp.length() < 6) {
													NpcOverrides.otp = NpcOverrides.otp + var41.field2363;
												}
											}
										}
									} else if (Login.loginIndex == 5) {
										var11 = Login.loginBoxX + 180 - 80;
										var12 = 321;
										Buffer var22;
										if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
											Login.Login_username = Login.Login_username.trim();
											if (Login.Login_username.length() == 0) {
												class139.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
											} else {
												long var48;
												try {
													URL var45 = new URL(WorldMapID.method4938("services", false) + "m=accountappeal/login.ws");
													URLConnection var17 = var45.openConnection();
													var17.setRequestProperty("connection", "close");
													var17.setDoInput(true);
													var17.setDoOutput(true);
													var17.setConnectTimeout(5000);
													OutputStreamWriter var106 = new OutputStreamWriter(var17.getOutputStream());
													var106.write("data1=req");
													var106.flush();
													InputStream var107 = var17.getInputStream();
													Buffer var90 = new Buffer(new byte[1000]);

													while (true) {
														int var21 = var107.read(var90.array, var90.offset, 1000 - var90.offset);
														if (var21 == -1) {
															var90.offset = 0;
															long var50 = var90.readLong();
															var48 = var50;
															break;
														}

														var90.offset += var21;
														if (var90.offset >= 1000) {
															var48 = 0L;
															break;
														}
													}
												} catch (Exception var70) {
													var48 = 0L;
												}

												byte var84;
												if (var48 == 0L) {
													var84 = 5;
												} else {
													String var108 = Login.Login_username;
													Random var91 = new Random();
													Buffer var110 = new Buffer(128);
													var22 = new Buffer(128);
													int[] var96 = new int[]{var91.nextInt(), var91.nextInt(), (int)(var48 >> 32), (int)var48};
													var110.writeByte(10);

													int var24;
													for (var24 = 0; var24 < 4; ++var24) {
														var110.writeInt(var91.nextInt());
													}

													var110.writeInt(var96[0]);
													var110.writeInt(var96[1]);
													var110.writeLong(var48);
													var110.writeLong(0L);

													for (var24 = 0; var24 < 4; ++var24) {
														var110.writeInt(var91.nextInt());
													}

													var110.encryptRsa(class72.field870, class72.field871);
													var22.writeByte(10);

													for (var24 = 0; var24 < 3; ++var24) {
														var22.writeInt(var91.nextInt());
													}

													var22.writeLong(var91.nextLong());
													var22.writeLongMedium(var91.nextLong());
													class354.method6858(var22);
													var22.writeLong(var91.nextLong());
													var22.encryptRsa(class72.field870, class72.field871);
													var24 = ClanChannel.stringCp1252NullTerminatedByteSize(var108);
													if (var24 % 8 != 0) {
														var24 += 8 - var24 % 8;
													}

													Buffer var97 = new Buffer(var24);
													var97.writeStringCp1252NullTerminated(var108);
													var97.offset = var24;
													var97.xteaEncryptAll(var96);
													Buffer var26 = new Buffer(var22.offset + var110.offset + var97.offset + 5);
													var26.writeByte(2);
													var26.writeByte(var110.offset);
													var26.writeBytes(var110.array, 0, var110.offset);
													var26.writeByte(var22.offset);
													var26.writeBytes(var22.array, 0, var22.offset);
													var26.writeShort(var97.offset);
													var26.writeBytes(var97.array, 0, var97.offset);
													String var98 = class415.base64Encode(var26.array);

													byte var18;
													try {
														URL var99 = new URL(WorldMapID.method4938("services", false) + "m=accountappeal/login.ws");
														URLConnection var100 = var99.openConnection();
														var100.setDoInput(true);
														var100.setDoOutput(true);
														var100.setConnectTimeout(5000);
														OutputStreamWriter var101 = new OutputStreamWriter(var100.getOutputStream());
														var101.write("data2=" + WorldMapData_0.method4483(var98) + "&dest=" + WorldMapData_0.method4483("passwordchoice.ws"));
														var101.flush();
														InputStream var102 = var100.getInputStream();
														var26 = new Buffer(new byte[1000]);

														while (true) {
															int var32 = var102.read(var26.array, var26.offset, 1000 - var26.offset);
															if (var32 == -1) {
																var101.close();
																var102.close();
																String var111 = new String(var26.array);
																if (var111.startsWith("OFFLINE")) {
																	var18 = 4;
																} else if (var111.startsWith("WRONG")) {
																	var18 = 7;
																} else if (var111.startsWith("RELOAD")) {
																	var18 = 3;
																} else if (var111.startsWith("Not permitted for social network accounts.")) {
																	var18 = 6;
																} else {
																	var26.xteaDecryptAll(var96);

																	while (var26.offset > 0 && var26.array[var26.offset - 1] == 0) {
																		--var26.offset;
																	}

																	var111 = new String(var26.array, 0, var26.offset);
																	boolean var33;
																	if (var111 == null) {
																		var33 = false;
																	} else {
																		label1945: {
																			try {
																				new URL(var111);
																			} catch (MalformedURLException var68) {
																				var33 = false;
																				break label1945;
																			}

																			var33 = true;
																		}
																	}

																	if (var33) {
																		HealthBar.openURL(var111, true, false);
																		var18 = 2;
																	} else {
																		var18 = 5;
																	}
																}
																break;
															}

															var26.offset += var32;
															if (var26.offset >= 1000) {
																var18 = 5;
																break;
															}
														}
													} catch (Throwable var69) {
														var69.printStackTrace();
														var18 = 5;
													}

													var84 = var18;
												}

												switch(var84) {
												case 2:
													class139.setLoginResponseString(Strings.field4189, Strings.field4118, Strings.field4191);
													UserComparator7.method2966(6);
													break;
												case 3:
													class139.setLoginResponseString("", "Error connecting to server.", "");
													break;
												case 4:
													class139.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
													break;
												case 5:
													class139.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
													break;
												case 6:
													class139.setLoginResponseString("", "Error connecting to server.", "");
													break;
												case 7:
													class139.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
												}
											}

											return;
										}

										var11 = Login.loginBoxX + 180 + 80;
										if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
											SoundSystem.Login_promptCredentials(true);
										}

										var82 = 361;
										if (class7.field21 != null) {
											var14 = class7.field21.highX / 2;
											if (var6 == 1 && var78 >= class7.field21.lowX - var14 && var78 <= var14 + class7.field21.lowX && var79 >= var82 - 15 && var79 < var82) {
												HealthBar.openURL(WorldMapID.method4938("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var41.method4324()) {
											boolean var85 = false;

											for (var15 = 0; var15 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".length(); ++var15) {
												if (var41.field2363 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".charAt(var15)) {
													var85 = true;
													break;
												}
											}

											if (var41.field2360 == 13) {
												SoundSystem.Login_promptCredentials(true);
											} else {
												if (var41.field2360 == 85 && Login.Login_username.length() > 0) {
													Login.Login_username = Login.Login_username.substring(0, Login.Login_username.length() - 1);
												}

												if (var41.field2360 == 84) {
													Login.Login_username = Login.Login_username.trim();
													if (Login.Login_username.length() == 0) {
														class139.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address.");
													} else {
														long var52;
														try {
															URL var46 = new URL(WorldMapID.method4938("services", false) + "m=accountappeal/login.ws");
															URLConnection var47 = var46.openConnection();
															var47.setRequestProperty("connection", "close");
															var47.setDoInput(true);
															var47.setDoOutput(true);
															var47.setConnectTimeout(5000);
															OutputStreamWriter var20 = new OutputStreamWriter(var47.getOutputStream());
															var20.write("data1=req");
															var20.flush();
															InputStream var54 = var47.getInputStream();
															var22 = new Buffer(new byte[1000]);

															while (true) {
																int var56 = var54.read(var22.array, var22.offset, 1000 - var22.offset);
																if (var56 == -1) {
																	var22.offset = 0;
																	long var57 = var22.readLong();
																	var52 = var57;
																	break;
																}

																var22.offset += var56;
																if (var22.offset >= 1000) {
																	var52 = 0L;
																	break;
																}
															}
														} catch (Exception var73) {
															var52 = 0L;
														}

														byte var86;
														if (0L == var52) {
															var86 = 5;
														} else {
															String var109 = Login.Login_username;
															Random var95 = new Random();
															Buffer var23 = new Buffer(128);
															Buffer var61 = new Buffer(128);
															int[] var25 = new int[]{var95.nextInt(), var95.nextInt(), (int)(var52 >> 32), (int)var52};
															var23.writeByte(10);

															int var62;
															for (var62 = 0; var62 < 4; ++var62) {
																var23.writeInt(var95.nextInt());
															}

															var23.writeInt(var25[0]);
															var23.writeInt(var25[1]);
															var23.writeLong(var52);
															var23.writeLong(0L);

															for (var62 = 0; var62 < 4; ++var62) {
																var23.writeInt(var95.nextInt());
															}

															var23.encryptRsa(class72.field870, class72.field871);
															var61.writeByte(10);

															for (var62 = 0; var62 < 3; ++var62) {
																var61.writeInt(var95.nextInt());
															}

															var61.writeLong(var95.nextLong());
															var61.writeLongMedium(var95.nextLong());
															class354.method6858(var61);
															var61.writeLong(var95.nextLong());
															var61.encryptRsa(class72.field870, class72.field871);
															var62 = ClanChannel.stringCp1252NullTerminatedByteSize(var109);
															if (var62 % 8 != 0) {
																var62 += 8 - var62 % 8;
															}

															Buffer var27 = new Buffer(var62);
															var27.writeStringCp1252NullTerminated(var109);
															var27.offset = var62;
															var27.xteaEncryptAll(var25);
															Buffer var28 = new Buffer(var27.offset + var61.offset + var23.offset + 5);
															var28.writeByte(2);
															var28.writeByte(var23.offset);
															var28.writeBytes(var23.array, 0, var23.offset);
															var28.writeByte(var61.offset);
															var28.writeBytes(var61.array, 0, var61.offset);
															var28.writeShort(var27.offset);
															var28.writeBytes(var27.array, 0, var27.offset);
															String var29 = class415.base64Encode(var28.array);

															byte var65;
															try {
																URL var30 = new URL(WorldMapID.method4938("services", false) + "m=accountappeal/login.ws");
																URLConnection var31 = var30.openConnection();
																var31.setDoInput(true);
																var31.setDoOutput(true);
																var31.setConnectTimeout(5000);
																OutputStreamWriter var55 = new OutputStreamWriter(var31.getOutputStream());
																var55.write("data2=" + WorldMapData_0.method4483(var29) + "&dest=" + WorldMapData_0.method4483("passwordchoice.ws"));
																var55.flush();
																InputStream var63 = var31.getInputStream();
																var28 = new Buffer(new byte[1000]);

																while (true) {
																	int var64 = var63.read(var28.array, var28.offset, 1000 - var28.offset);
																	if (var64 == -1) {
																		var55.close();
																		var63.close();
																		String var34 = new String(var28.array);
																		if (var34.startsWith("OFFLINE")) {
																			var65 = 4;
																		} else if (var34.startsWith("WRONG")) {
																			var65 = 7;
																		} else if (var34.startsWith("RELOAD")) {
																			var65 = 3;
																		} else if (var34.startsWith("Not permitted for social network accounts.")) {
																			var65 = 6;
																		} else {
																			var28.xteaDecryptAll(var25);

																			while (var28.offset > 0 && var28.array[var28.offset - 1] == 0) {
																				--var28.offset;
																			}

																			var34 = new String(var28.array, 0, var28.offset);
																			boolean var35;
																			if (var34 == null) {
																				var35 = false;
																			} else {
																				label1947: {
																					try {
																						new URL(var34);
																					} catch (MalformedURLException var71) {
																						var35 = false;
																						break label1947;
																					}

																					var35 = true;
																				}
																			}

																			if (var35) {
																				HealthBar.openURL(var34, true, false);
																				var65 = 2;
																			} else {
																				var65 = 5;
																			}
																		}
																		break;
																	}

																	var28.offset += var64;
																	if (var28.offset >= 1000) {
																		var65 = 5;
																		break;
																	}
																}
															} catch (Throwable var72) {
																var72.printStackTrace();
																var65 = 5;
															}

															var86 = var65;
														}

														switch(var86) {
														case 2:
															class139.setLoginResponseString(Strings.field4189, Strings.field4118, Strings.field4191);
															UserComparator7.method2966(6);
															break;
														case 3:
															class139.setLoginResponseString("", "Error connecting to server.", "");
															break;
														case 4:
															class139.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later.");
															break;
														case 5:
															class139.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later.");
															break;
														case 6:
															class139.setLoginResponseString("", "Error connecting to server.", "");
															break;
														case 7:
															class139.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username.");
														}
													}

													return;
												}

												if (var85 && Login.Login_username.length() < 320) {
													Login.Login_username = Login.Login_username + var41.field2363;
												}
											}
										}
									} else if (Login.loginIndex != 6) {
										if (Login.loginIndex == 7) {
											if (PendingSpawn.field1169 && !Client.onMobile) {
												var11 = class157.loginBoxCenter - 150;
												var83 = var11 + 40 + 240 + 25;
												var82 = 231;
												var14 = var82 + 40;
												if (var6 == 1 && var78 >= var11 && var78 <= var83 && var79 >= var82 && var79 <= var14) {
													Login.field915 = ObjectSound.method1978(var11, var78);
												}

												var15 = Login.loginBoxX + 180 - 80;
												short var16 = 321;
												boolean var66;
												if (var6 == 1 && var78 >= var15 - 75 && var78 <= var15 + 75 && var79 >= var16 - 20 && var79 <= var16 + 20) {
													var66 = class36.method709();
													if (var66) {
														WorldMapSection2.updateGameState(50);
														return;
													}
												}

												var15 = Login.loginBoxX + 180 + 80;
												if (var6 == 1 && var78 >= var15 - 75 && var78 <= var15 + 75 && var79 >= var16 - 20 && var79 <= var16 + 20) {
													Login.field907 = new String[8];
													SoundSystem.Login_promptCredentials(true);
												}

												while (var41.method4324()) {
													if (var41.field2360 == 101) {
														Login.field907[Login.field915] = null;
													}

													if (var41.field2360 == 85) {
														if (Login.field907[Login.field915] == null && Login.field915 > 0) {
															--Login.field915;
														}

														Login.field907[Login.field915] = null;
													}

													if (var41.field2363 >= '0' && var41.field2363 <= '9') {
														Login.field907[Login.field915] = "" + var41.field2363;
														if (Login.field915 < 7) {
															++Login.field915;
														}
													}

													if (var41.field2360 == 84) {
														var66 = class36.method709();
														if (var66) {
															WorldMapSection2.updateGameState(50);
														}

														return;
													}
												}
											} else {
												var11 = Login.loginBoxX + 180 - 80;
												var12 = 321;
												if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
													HealthBar.openURL(WorldMapID.method4938("secure", true) + "m=dob/set_dob.ws", true, false);
													class139.setLoginResponseString("", "Page has opened in the browser.", "");
													UserComparator7.method2966(6);
													return;
												}

												var11 = Login.loginBoxX + 180 + 80;
												if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
													SoundSystem.Login_promptCredentials(true);
												}
											}
										} else if (Login.loginIndex == 8) {
											var11 = Login.loginBoxX + 180 - 80;
											var12 = 321;
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
												HealthBar.openURL("https://www.jagex.com/terms/privacy", true, false);
												class139.setLoginResponseString("", "Page has opened in the browser.", "");
												UserComparator7.method2966(6);
												return;
											}

											var11 = Login.loginBoxX + 180 + 80;
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
												SoundSystem.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 9) {
											var11 = Login.loginBoxX + 180;
											var12 = 311;
											if (var9.field2360 == 84 || var9.field2360 == 13 || var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
												ClientPreferences.method2645(false);
											}
										} else if (Login.loginIndex == 10) {
											var11 = Login.loginBoxX + 180;
											var12 = 209;
											if (var9.field2360 == 84 || var6 == 1 && var78 >= var11 - 109 && var78 <= var11 + 109 && var79 >= var12 && var79 <= var12 + 68) {
												class139.setLoginResponseString("", "Connecting to server...", "");
												Client.field526 = class531.field5192;
												VerticalAlignment.setAuthenticationScheme(false);
												WorldMapSection2.updateGameState(20);
											}
										} else if (Login.loginIndex == 12) {
											var11 = class157.loginBoxCenter;
											var12 = 233;
											var44 = var2.method7668(0, 30, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12);
											Bounds var42 = var2.method7668(32, 32, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12);
											Bounds var43 = var2.method7668(70, 34, "<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var11, var12);
											var83 = var12 + 17;
											Bounds var105 = var2.method7668(0, 34, "<col=ffd200>agreement (EULA)</col>.", var11, var83);
											if (var6 == 1) {
												if (var44.method8373(var78, var79)) {
													HealthBar.openURL("https://www.jagex.com/terms", true, false);
												} else if (var42.method8373(var78, var79)) {
													HealthBar.openURL("https://www.jagex.com/terms/privacy", true, false);
												} else if (var43.method8373(var78, var79) || var105.method8373(var78, var79)) {
													HealthBar.openURL("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var11 = class157.loginBoxCenter - 80;
											var12 = 311;
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
												WorldMapIcon_1.clientPreferences.method2561(Client.field488);
												ClientPreferences.method2645(true);
											}

											var11 = class157.loginBoxCenter + 80;
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
												Login.loginIndex = 13;
											}
										} else if (Login.loginIndex == 13) {
											var11 = class157.loginBoxCenter;
											var12 = 321;
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
												ClientPreferences.method2645(true);
											}
										} else if (Login.loginIndex == 14) {
											String var67 = "";
											switch(Login.Login_banType) {
											case 0:
												var67 = "https://secure.runescape.com/m=offence-appeal/account-history";
												break;
											case 1:
												var67 = "https://secure.runescape.com/m=accountappeal/passwordrecovery";
												break;
											case 2:
												var67 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												SoundSystem.Login_promptCredentials(false);
											}

											var83 = Login.loginBoxX + 180;
											var82 = 276;
											if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20) {
												HealthBar.openURL(var67, true, false);
												class139.setLoginResponseString("", "Page has opened in the browser.", "");
												UserComparator7.method2966(6);
												return;
											}

											var83 = Login.loginBoxX + 180;
											var82 = 326;
											if (var6 == 1 && var78 >= var83 - 75 && var78 <= var83 + 75 && var79 >= var82 - 20 && var79 <= var82 + 20) {
												SoundSystem.Login_promptCredentials(false);
											}
										} else if (Login.loginIndex == 24) {
											var11 = Login.loginBoxX + 180;
											var12 = 301;
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
												ClientPreferences.method2645(false);
											}
										} else if (Login.loginIndex == 32) {
											var11 = Login.loginBoxX + 180 - 80;
											var12 = 321;
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
												HealthBar.openURL(WorldMapID.method4938("secure", true) + "m=dob/set_dob.ws", true, false);
												class139.setLoginResponseString("", "Page has opened in the browser.", "");
												UserComparator7.method2966(6);
												return;
											}

											var11 = Login.loginBoxX + 180 + 80;
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
												SoundSystem.Login_promptCredentials(true);
											}
										} else if (Login.loginIndex == 33) {
											var11 = Login.loginBoxX + 180;
											var12 = 276;
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
												HealthBar.openURL("https://oldschool.runescape.com/launcher", true, false);
											}

											var11 = Login.loginBoxX + 180;
											var12 = 326;
											if (var6 == 1 && var78 >= var11 - 75 && var78 <= var11 + 75 && var79 >= var12 - 20 && var79 <= var12 + 20) {
												SoundSystem.Login_promptCredentials(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var41.method4324()) {
													var81 = 321;
													if (var6 == 1 && var79 >= var81 - 20 && var79 <= var81 + 20) {
														SoundSystem.Login_promptCredentials(true);
													}

													return;
												}
											} while(var41.field2360 != 84 && var41.field2360 != 13);

											SoundSystem.Login_promptCredentials(true);
										}
									}
								}
							}
						}
					}

				}
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-983398043"
	)
	static int method2495(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				var13 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var12;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var12 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
					if (class6.grandExchangeEvents != null) {
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var12 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
					if (class6.grandExchangeEvents != null) {
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					DbTableType.Interpreter_intStackSize -= 2;
					var12 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize] == 1;
					boolean var11 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1] == 1;
					if (class6.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var11;
						class6.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var12 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
					if (class6.grandExchangeEvents != null) {
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var12 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize] == 1;
					if (class6.grandExchangeEvents != null) {
						class6.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var12);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class6.grandExchangeEvents == null ? 0 : class6.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var4;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						long var5 = SpotAnimationDefinition.method3775() - class489.field4905 - var4.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var4 = (GrandExchangeEvent)class6.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.grandExchangeOffer.id;
						return 1;
					} else if (var0 == 3939) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class214.ItemDefinition_get(var3).isTradable ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
