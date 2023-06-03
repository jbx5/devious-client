import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
@Implements("Actor")
public abstract class Actor extends Renderable {
   @ObfuscatedName("ff")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   @Export("archive7")
   static Archive archive7;
   @ObfuscatedName("an")
   @Export("isWalking")
   boolean isWalking = false;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 583712055
   )
   @Export("x")
   int x;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 1173676427
   )
   @Export("y")
   int y;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -1020615965
   )
   @Export("rotation")
   int rotation;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 1279251520
   )
   int field1155 = 1;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -2131464391
   )
   @Export("playerCycle")
   int playerCycle;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 28557013
   )
   @Export("idleSequence")
   int idleSequence = -1;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 1411637209
   )
   @Export("turnLeftSequence")
   int turnLeftSequence = -1;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1071771523
   )
   @Export("turnRightSequence")
   int turnRightSequence = -1;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 1868003099
   )
   @Export("walkSequence")
   int walkSequence = -1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 1037251465
   )
   @Export("walkBackSequence")
   int walkBackSequence = -1;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 513535125
   )
   @Export("walkLeftSequence")
   int walkLeftSequence = -1;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 418026995
   )
   @Export("walkRightSequence")
   int walkRightSequence = -1;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1204336597
   )
   @Export("runSequence")
   int runSequence = -1;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -858811131
   )
   int field1191 = -1;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 351810389
   )
   int field1198 = -1;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = -1598920981
   )
   int field1167 = -1;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 333656943
   )
   int field1168 = -1;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = 978877079
   )
   int field1169 = -1;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -3972301
   )
   int field1183 = -1;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 250215379
   )
   int field1171 = -1;
   @ObfuscatedName("bl")
   @Export("overheadText")
   String overheadText = null;
   @ObfuscatedName("cs")
   boolean field1165;
   @ObfuscatedName("cu")
   boolean field1174 = false;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = -1595120141
   )
   @Export("overheadTextCyclesRemaining")
   int overheadTextCyclesRemaining = 100;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = 1190750381
   )
   int field1189 = 0;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 119631037
   )
   int field1177 = 0;
   @ObfuscatedName("ch")
   int[] field1224 = null;
   @ObfuscatedName("cy")
   @Export("hitSplatCount")
   byte hitSplatCount = 0;
   @ObfuscatedName("cd")
   @Export("hitSplatTypes")
   int[] hitSplatTypes = new int[4];
   @ObfuscatedName("cv")
   @Export("hitSplatValues")
   int[] hitSplatValues = new int[4];
   @ObfuscatedName("cr")
   @Export("hitSplatCycles")
   int[] hitSplatCycles = new int[4];
   @ObfuscatedName("cm")
   @Export("hitSplatTypes2")
   int[] hitSplatTypes2 = new int[4];
   @ObfuscatedName("cg")
   @Export("hitSplatValues2")
   int[] hitSplatValues2 = new int[4];
   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "Lom;"
   )
   @Export("healthBars")
   IterableNodeDeque healthBars = new IterableNodeDeque();
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = -1091801083
   )
   @Export("targetIndex")
   int targetIndex = -1;
   @ObfuscatedName("cc")
   @Export("false0")
   boolean false0 = false;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 2099679725
   )
   int field1228 = -1;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -697101729
   )
   int field1178 = -1;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = 974122433
   )
   int field1190 = -1;
   @ObfuscatedName("cj")
   boolean field1184;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -100139863
   )
   @Export("movementSequence")
   int movementSequence = -1;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = -1558692971
   )
   @Export("movementFrame")
   int movementFrame = 0;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 416993781
   )
   @Export("movementFrameCycle")
   int movementFrameCycle = 0;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = -1487680733
   )
   int field1195 = 0;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -254610587
   )
   @Export("sequence")
   int sequence = -1;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = 1629959799
   )
   @Export("sequenceFrame")
   int sequenceFrame = 0;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = 1901437587
   )
   @Export("sequenceFrameCycle")
   int sequenceFrameCycle = 0;
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = 2050917487
   )
   @Export("sequenceDelay")
   int sequenceDelay = 0;
   @ObfuscatedName("dm")
   @ObfuscatedGetter(
      intValue = 207129501
   )
   int field1200 = 0;
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "Lsv;"
   )
   @Export("spotAnimations")
   IterableNodeHashTable spotAnimations = new IterableNodeHashTable(4);
   @ObfuscatedName("dt")
   @ObfuscatedGetter(
      intValue = 1668243431
   )
   @Export("graphicsCount")
   int graphicsCount = 0;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = -1553245255
   )
   int field1203;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = 2134899839
   )
   int field1173;
   @ObfuscatedName("df")
   @ObfuscatedGetter(
      intValue = -1719951815
   )
   int field1205;
   @ObfuscatedName("dx")
   @ObfuscatedGetter(
      intValue = 1671304245
   )
   int field1206;
   @ObfuscatedName("dz")
   @ObfuscatedGetter(
      intValue = -1732730909
   )
   @Export("spotAnimation")
   int spotAnimation;
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      intValue = -556325665
   )
   int field1208;
   @ObfuscatedName("db")
   @ObfuscatedGetter(
      intValue = 39657223
   )
   int field1209;
   @ObfuscatedName("dq")
   @ObfuscatedGetter(
      intValue = -382884163
   )
   @Export("npcCycle")
   int npcCycle = 0;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = 518523699
   )
   @Export("defaultHeight")
   int defaultHeight = 200;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = 2055675235
   )
   int field1170 = -1;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = 987405931
   )
   int field1213 = -1;
   @ObfuscatedName("di")
   byte field1164;
   @ObfuscatedName("dj")
   byte field1215;
   @ObfuscatedName("dk")
   byte field1196;
   @ObfuscatedName("dy")
   byte field1217;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = 677869991
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      intValue = -588610153
   )
   int field1219 = 0;
   @ObfuscatedName("du")
   @ObfuscatedGetter(
      intValue = -1466211951
   )
   int field1220 = 32;
   @ObfuscatedName("dc")
   @ObfuscatedGetter(
      intValue = 1557847499
   )
   @Export("pathLength")
   int pathLength = 0;
   @ObfuscatedName("ds")
   @Export("pathX")
   int[] pathX = new int[10];
   @ObfuscatedName("dr")
   @Export("pathY")
   int[] pathY = new int[10];
   @ObfuscatedName("ee")
   @ObfuscatedSignature(
      descriptor = "[Lie;"
   )
   @Export("pathTraversed")
   class216[] pathTraversed = new class216[10];
   @ObfuscatedName("er")
   @ObfuscatedGetter(
      intValue = -392893065
   )
   int field1225 = 0;
   @ObfuscatedName("eh")
   @ObfuscatedGetter(
      intValue = 427678341
   )
   int field1226 = 0;
   @ObfuscatedName("eu")
   @ObfuscatedGetter(
      intValue = -1961345553
   )
   int field1227 = -1;

   Actor() {
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "11"
   )
   @Export("isVisible")
   boolean isVisible() {
      return false;
   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2144229618"
   )
   final void method2364() {
      this.pathLength = 0;
      this.field1226 = 0;
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "604654467"
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
         HitSplatDefinition var12 = PlayerComposition.method6053(var1);
         var10 = var12.field2128;
         var11 = var12.field2134;
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

   @ObfuscatedName("cv")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "390211439"
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
         var8.field1954 = var1;
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
      for(var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
         ++var12;
         if (var13.definition.field1954 == var8.field1954) {
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

   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "50"
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
         var3.field1954 = var1;
         if (var4 != null) {
            var3.decode(new Buffer(var4));
         }

         HealthBarDefinition.HealthBarDefinition_cached.put(var3, (long)var1);
         var2 = var3;
      }

      var3 = var2;

      for(HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
         if (var3 == var5.definition) {
            var5.remove();
            return;
         }
      }

   }

   @ObfuscatedName("cm")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "30"
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

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "(I)Lsv;",
      garbageValue = "1949828851"
   )
   IterableNodeHashTable method2391() {
      return this.spotAnimations;
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-131264283"
   )
   @Export("clearSpotAnimations")
   void clearSpotAnimations() {
      IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

      for(ActorSpotAnim var2 = (ActorSpotAnim)var1.method8589(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
         var2.remove();
      }

      this.graphicsCount = 0;
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(Ljd;I)Ljd;",
      garbageValue = "1334524793"
   )
   Model method2366(Model var1) {
      if (this.graphicsCount == 0) {
         return var1;
      } else {
         IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
         int var3 = var1.verticesCount;
         int var4 = var1.indicesCount;
         int var5 = var1.texIndicesCount;
         byte var6 = var1.field2706;

         for(ActorSpotAnim var7 = (ActorSpotAnim)var2.method8589(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
            if (var7.spotAnimationFrame != -1) {
               Model var8 = class53.SpotAnimationDefinition_get(var7.spotAnimation).method3764();
               if (var8 != null) {
                  var3 += var8.verticesCount;
                  var4 += var8.indicesCount;
                  var5 += var8.texIndicesCount;
               }
            }
         }

         Model var10 = new Model(var3, var4, var5, var6);
         var10.method4782(var1);

         for(ActorSpotAnim var11 = (ActorSpotAnim)var2.method8589(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
            if (var11.spotAnimationFrame != -1) {
               Model var9 = class53.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
               if (var9 != null) {
                  var9.offsetBy(0, -var11.spotAnimationHeight, 0);
                  var10.method4782(var9);
               }
            }
         }

         return var10;
      }
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1832865159"
   )
   void method2375() {
      this.field1184 = false;
      this.field1228 = -1;
      this.field1178 = -1;
      this.field1190 = -1;
   }
}
