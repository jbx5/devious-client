import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("Actor")
public abstract class Actor extends Renderable {
   @ObfuscatedName("an")
   @Export("isWalking")
   boolean isWalking = false;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 770091805
   )
   @Export("x")
   int x;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 743230655
   )
   @Export("y")
   int y;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1722245845
   )
   @Export("rotation")
   int rotation;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 1676195648
   )
   int field1142 = 64;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -1235682795
   )
   @Export("playerCycle")
   int playerCycle;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -1420600879
   )
   @Export("idleSequence")
   int idleSequence = -1;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -1435384067
   )
   @Export("turnLeftSequence")
   int turnLeftSequence = -1;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -2086036387
   )
   @Export("turnRightSequence")
   int turnRightSequence = -1;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 1809627555
   )
   @Export("walkSequence")
   int walkSequence = -1;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1798474521
   )
   @Export("walkBackSequence")
   int walkBackSequence = -1;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -225554459
   )
   @Export("walkLeftSequence")
   int walkLeftSequence = -1;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -1735929425
   )
   @Export("walkRightSequence")
   int walkRightSequence = -1;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -1820789823
   )
   @Export("runSequence")
   int runSequence = -1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 252414335
   )
   int field1152 = -1;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 2143421625
   )
   int field1153 = -1;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 423632581
   )
   int field1154 = -1;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -1058735917
   )
   int field1155 = -1;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -1098651975
   )
   int field1200 = -1;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -343475767
   )
   int field1212 = -1;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -1389539495
   )
   int field1158 = -1;
   @ObfuscatedName("bi")
   @Export("overheadText")
   String overheadText = null;
   @ObfuscatedName("cl")
   boolean field1160;
   @ObfuscatedName("ca")
   boolean field1161 = false;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = 1578914273
   )
   @Export("overheadTextCyclesRemaining")
   int overheadTextCyclesRemaining = 100;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -967977927
   )
   int field1163 = 0;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -916611829
   )
   int field1156 = 0;
   @ObfuscatedName("ce")
   @Export("hitSplatCount")
   byte hitSplatCount = 0;
   @ObfuscatedName("cd")
   @Export("hitSplatTypes")
   int[] hitSplatTypes = new int[4];
   @ObfuscatedName("cc")
   @Export("hitSplatValues")
   int[] hitSplatValues = new int[4];
   @ObfuscatedName("ct")
   @Export("hitSplatCycles")
   int[] hitSplatCycles = new int[4];
   @ObfuscatedName("cy")
   @Export("hitSplatTypes2")
   int[] hitSplatTypes2 = new int[4];
   @ObfuscatedName("ck")
   @Export("hitSplatValues2")
   int[] hitSplatValues2 = new int[4];
   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "Lni;"
   )
   @Export("healthBars")
   IterableNodeDeque healthBars = new IterableNodeDeque();
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -2047391823
   )
   @Export("targetIndex")
   int targetIndex = -1;
   @ObfuscatedName("ch")
   @Export("false0")
   boolean false0 = false;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = 639827229
   )
   int field1164 = -1;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = 1778758151
   )
   int field1180 = -1;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = -1769365589
   )
   int field1176 = -1;
   @ObfuscatedName("cu")
   boolean field1157;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = -277162537
   )
   @Export("movementSequence")
   int movementSequence = -1;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = -978942791
   )
   @Export("movementFrame")
   int movementFrame = 0;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = -506604737
   )
   @Export("movementFrameCycle")
   int movementFrameCycle = 0;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = 1243951499
   )
   int field1181 = 0;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = -2121799935
   )
   @Export("sequence")
   int sequence = -1;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = -259160373
   )
   @Export("sequenceFrame")
   int sequenceFrame = 0;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 1001943181
   )
   @Export("sequenceFrameCycle")
   int sequenceFrameCycle = 0;
   @ObfuscatedName("du")
   @ObfuscatedGetter(
      intValue = 441642775
   )
   @Export("sequenceDelay")
   int sequenceDelay = 0;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = 265556645
   )
   int field1186 = 0;
   @ObfuscatedName("dc")
   @ObfuscatedGetter(
      intValue = -310147253
   )
   @Export("spotAnimation")
   int spotAnimation = -1;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = -513408173
   )
   @Export("spotAnimationFrame")
   int spotAnimationFrame = 0;
   @ObfuscatedName("dk")
   @ObfuscatedGetter(
      intValue = 249695979
   )
   @Export("spotAnimationFrameCycle")
   int spotAnimationFrameCycle = 0;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = 1512216599
   )
   int field1190;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      intValue = 990951261
   )
   @Export("spotAnimationHeight")
   int spotAnimationHeight;
   @ObfuscatedName("dx")
   @ObfuscatedGetter(
      intValue = -1525119837
   )
   int field1192;
   @ObfuscatedName("ds")
   @ObfuscatedGetter(
      intValue = 424860395
   )
   int field1202;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = -1087094495
   )
   int field1194;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = 412604959
   )
   int field1195;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = 507205937
   )
   int field1196;
   @ObfuscatedName("dj")
   @ObfuscatedGetter(
      intValue = 957541249
   )
   int field1197;
   @ObfuscatedName("da")
   @ObfuscatedGetter(
      intValue = 1398589867
   )
   int field1162;
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = -578602873
   )
   @Export("npcCycle")
   int npcCycle = 0;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = 1202490677
   )
   @Export("defaultHeight")
   int defaultHeight = 200;
   @ObfuscatedName("dt")
   @ObfuscatedGetter(
      intValue = 1568448827
   )
   int field1201 = -1;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = 641368537
   )
   int field1159 = -1;
   @ObfuscatedName("dm")
   byte field1203;
   @ObfuscatedName("dz")
   byte field1185;
   @ObfuscatedName("dl")
   byte field1165;
   @ObfuscatedName("df")
   byte field1206;
   @ObfuscatedName("dy")
   @ObfuscatedGetter(
      intValue = -1715212839
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      intValue = -332609061
   )
   int field1208 = 0;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = -484928621
   )
   int field1209 = 32;
   @ObfuscatedName("di")
   @ObfuscatedGetter(
      intValue = -314615841
   )
   @Export("pathLength")
   int pathLength = 0;
   @ObfuscatedName("en")
   @Export("pathX")
   int[] pathX = new int[10];
   @ObfuscatedName("ei")
   @Export("pathY")
   int[] pathY = new int[10];
   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      descriptor = "[Lis;"
   )
   @Export("pathTraversed")
   class211[] pathTraversed = new class211[10];
   @ObfuscatedName("ex")
   @ObfuscatedGetter(
      intValue = -1311143011
   )
   int field1214 = 0;
   @ObfuscatedName("ep")
   @ObfuscatedGetter(
      intValue = -43675601
   )
   int field1215 = 0;
   @ObfuscatedName("eb")
   @ObfuscatedGetter(
      intValue = 1290268989
   )
   int field1189 = -1;

   Actor() {
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1187706422"
   )
   @Export("isVisible")
   boolean isVisible() {
      return false;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "1"
   )
   final void method2371() {
      this.pathLength = 0;
      this.field1215 = 0;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)V",
      garbageValue = "1"
   )
   @Export("addHitSplat")
   final void addHitSplat(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
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
         HitSplatDefinition var12 = NewStuff.method3664(var1);
         var10 = var12.field2116;
         var11 = var12.field2107;
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

         for(int var13 = 1; var13 < 4; ++var13) {
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

         for(var14 = 0; var14 < 4; ++var14) {
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

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "-2123887600"
   )
   @Export("addHealthBar")
   final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
      HealthBarDefinition var7 = HealthBar.method2538(var1);
      HealthBar var8 = null;
      HealthBar var9 = null;
      int var10 = var7.int2;
      int var11 = 0;

      HealthBar var12;
      for(var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
         ++var11;
         if (var12.definition.field1946 == var7.field1946) {
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

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1332495526"
   )
   @Export("removeHealthBar")
   final void removeHealthBar(int var1) {
      HealthBarDefinition var2 = HealthBar.method2538(var1);

      for(HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
         if (var2 == var3.definition) {
            var3.remove();
            return;
         }
      }

   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1487000942"
   )
   void method2362() {
      this.field1157 = false;
      this.field1164 = -1;
      this.field1180 = -1;
      this.field1176 = -1;
   }
}
