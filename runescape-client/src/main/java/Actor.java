import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("Actor")
public abstract class Actor extends Renderable {
   @ObfuscatedName("an")
   @Export("isWalking")
   boolean isWalking = false;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 1144428983
   )
   @Export("x")
   int x;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -411750205
   )
   @Export("y")
   int y;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -1703696531
   )
   @Export("rotation")
   int rotation;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 353040509
   )
   int field1140 = 1;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -1532330627
   )
   @Export("playerCycle")
   int playerCycle;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 1590591885
   )
   @Export("idleSequence")
   int idleSequence = -1;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 1319769839
   )
   @Export("turnLeftSequence")
   int turnLeftSequence = -1;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 1796560353
   )
   @Export("turnRightSequence")
   int turnRightSequence = -1;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 736907545
   )
   @Export("walkSequence")
   int walkSequence = -1;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 1648569641
   )
   @Export("walkBackSequence")
   int walkBackSequence = -1;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -127994241
   )
   @Export("walkLeftSequence")
   int walkLeftSequence = -1;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -1059657777
   )
   @Export("walkRightSequence")
   int walkRightSequence = -1;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 1939789287
   )
   @Export("runSequence")
   int runSequence = -1;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 793978951
   )
   int field1150 = -1;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = 1755337849
   )
   int field1151 = -1;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = 802247051
   )
   int field1152 = -1;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -1254675467
   )
   int field1153 = -1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 572220041
   )
   int field1196 = -1;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -1312118043
   )
   int field1155 = -1;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -428343529
   )
   int field1157 = -1;
   @ObfuscatedName("bw")
   @Export("overheadText")
   String overheadText = null;
   @ObfuscatedName("ce")
   boolean field1176;
   @ObfuscatedName("ci")
   boolean field1144 = false;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -536830723
   )
   @Export("overheadTextCyclesRemaining")
   int overheadTextCyclesRemaining = 100;
   @ObfuscatedName("cc")
   @ObfuscatedGetter(
      intValue = -1337884343
   )
   int field1161 = 0;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = 819594233
   )
   int field1206 = 0;
   @ObfuscatedName("cu")
   @Export("hitSplatCount")
   byte hitSplatCount = 0;
   @ObfuscatedName("ck")
   @Export("hitSplatTypes")
   int[] hitSplatTypes = new int[4];
   @ObfuscatedName("cq")
   @Export("hitSplatValues")
   int[] hitSplatValues = new int[4];
   @ObfuscatedName("cm")
   @Export("hitSplatCycles")
   int[] hitSplatCycles = new int[4];
   @ObfuscatedName("cf")
   @Export("hitSplatTypes2")
   int[] hitSplatTypes2 = new int[4];
   @ObfuscatedName("cl")
   @Export("hitSplatValues2")
   int[] hitSplatValues2 = new int[4];
   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   @Export("healthBars")
   IterableNodeDeque healthBars = new IterableNodeDeque();
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 1005900761
   )
   @Export("targetIndex")
   int targetIndex = -1;
   @ObfuscatedName("cy")
   @Export("false0")
   boolean false0 = false;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = -283165269
   )
   int field1172 = -1;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = -714961113
   )
   int field1197 = -1;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = -1282076959
   )
   int field1174 = -1;
   @ObfuscatedName("co")
   boolean field1142;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = -1302441815
   )
   @Export("movementSequence")
   int movementSequence = -1;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 424813829
   )
   @Export("movementFrame")
   int movementFrame = 0;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = -767724643
   )
   @Export("movementFrameCycle")
   int movementFrameCycle = 0;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = -463442209
   )
   int field1179 = 0;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = -1372355773
   )
   @Export("sequence")
   int sequence = -1;
   @ObfuscatedName("cp")
   @ObfuscatedGetter(
      intValue = -41215169
   )
   @Export("sequenceFrame")
   int sequenceFrame = 0;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 1356757385
   )
   @Export("sequenceFrameCycle")
   int sequenceFrameCycle = 0;
   @ObfuscatedName("dm")
   @ObfuscatedGetter(
      intValue = 1253892101
   )
   @Export("sequenceDelay")
   int sequenceDelay = 0;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = -92383341
   )
   int field1184 = 0;
   @ObfuscatedName("dc")
   @ObfuscatedSignature(
      descriptor = "Lro;"
   )
   @Export("spotAnimations")
   IterableNodeHashTable spotAnimations = new IterableNodeHashTable(4);
   @ObfuscatedName("do")
   @ObfuscatedGetter(
      intValue = -500494421
   )
   @Export("graphicsCount")
   int graphicsCount = 0;
   @ObfuscatedName("di")
   @ObfuscatedGetter(
      intValue = -1826657487
   )
   int field1187;
   @ObfuscatedName("dr")
   @ObfuscatedGetter(
      intValue = -603433453
   )
   int field1188;
   @ObfuscatedName("dl")
   @ObfuscatedGetter(
      intValue = -638797877
   )
   int field1189;
   @ObfuscatedName("dk")
   @ObfuscatedGetter(
      intValue = 1509120399
   )
   int field1207;
   @ObfuscatedName("dt")
   @ObfuscatedGetter(
      intValue = -435598119
   )
   @Export("spotAnimation")
   int spotAnimation;
   @ObfuscatedName("dv")
   @ObfuscatedGetter(
      intValue = -1274841313
   )
   int field1192;
   @ObfuscatedName("dz")
   @ObfuscatedGetter(
      intValue = 1929282871
   )
   int field1193;
   @ObfuscatedName("dg")
   @ObfuscatedGetter(
      intValue = -523202873
   )
   @Export("npcCycle")
   int npcCycle = 0;
   @ObfuscatedName("de")
   @ObfuscatedGetter(
      intValue = -767387641
   )
   @Export("defaultHeight")
   int defaultHeight = 200;
   @ObfuscatedName("dh")
   @ObfuscatedGetter(
      intValue = 1182789041
   )
   int field1168 = -1;
   @ObfuscatedName("dp")
   @ObfuscatedGetter(
      intValue = 707232483
   )
   int field1156 = -1;
   @ObfuscatedName("du")
   byte field1180;
   @ObfuscatedName("db")
   byte field1199;
   @ObfuscatedName("df")
   byte field1200;
   @ObfuscatedName("dq")
   byte field1208;
   @ObfuscatedName("dd")
   @ObfuscatedGetter(
      intValue = -1751341433
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("dj")
   @ObfuscatedGetter(
      intValue = -1223990063
   )
   int field1203 = 0;
   @ObfuscatedName("dx")
   @ObfuscatedGetter(
      intValue = 351748387
   )
   int field1190 = 32;
   @ObfuscatedName("dn")
   @ObfuscatedGetter(
      intValue = 1134756167
   )
   @Export("pathLength")
   int pathLength = 0;
   @ObfuscatedName("dy")
   @Export("pathX")
   int[] pathX = new int[10];
   @ObfuscatedName("ds")
   @Export("pathY")
   int[] pathY = new int[10];
   @ObfuscatedName("da")
   @ObfuscatedSignature(
      descriptor = "[Liu;"
   )
   @Export("pathTraversed")
   class210[] pathTraversed = new class210[10];
   @ObfuscatedName("ep")
   @ObfuscatedGetter(
      intValue = 1489558979
   )
   int field1209 = 0;
   @ObfuscatedName("eo")
   @ObfuscatedGetter(
      intValue = -1181739279
   )
   int field1210 = 0;
   @ObfuscatedName("eq")
   @ObfuscatedGetter(
      intValue = 674049519
   )
   int field1211 = -1;

   Actor() {
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1666539507"
   )
   @Export("isVisible")
   boolean isVisible() {
      return false;
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "32"
   )
   final void method2388() {
      this.pathLength = 0;
      this.field1210 = 0;
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "1919870398"
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
         HitSplatDefinition var12 = class122.method3046(var1);
         var10 = var12.field2149;
         var11 = var12.field2142;
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

   @ObfuscatedName("cz")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)V",
      garbageValue = "121"
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
         if (var13.definition.field1959 == var8.field1959) {
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

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1269115179"
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

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "329491762"
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

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(B)Lro;",
      garbageValue = "10"
   )
   IterableNodeHashTable method2376() {
      return this.spotAnimations;
   }

   @ObfuscatedName("ct")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2086288959"
   )
   void method2377() {
      IterableNodeHashTableIterator var1 = new IterableNodeHashTableIterator(this.spotAnimations);

      for(ActorSpotAnim var2 = (ActorSpotAnim)var1.method8686(); var2 != null; var2 = (ActorSpotAnim)var1.next()) {
         var2.remove();
      }

      this.graphicsCount = 0;
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(Lit;B)Lit;",
      garbageValue = "106"
   )
   Model method2374(Model var1) {
      if (this.graphicsCount == 0) {
         return var1;
      } else {
         IterableNodeHashTableIterator var2 = new IterableNodeHashTableIterator(this.spotAnimations);
         int var3 = var1.verticesCount;
         int var4 = var1.indicesCount;
         int var5 = var1.texIndicesCount;
         byte var6 = var1.field2707;

         for(ActorSpotAnim var7 = (ActorSpotAnim)var2.method8686(); var7 != null; var7 = (ActorSpotAnim)var2.next()) {
            if (var7.spotAnimationFrame != -1) {
               Model var8 = ItemContainer.SpotAnimationDefinition_get(var7.spotAnimation).method3835();
               if (var8 != null) {
                  var3 += var8.verticesCount;
                  var4 += var8.indicesCount;
                  var5 += var8.texIndicesCount;
               }
            }
         }

         Model var10 = new Model(var3, var4, var5, var6);
         var10.method4862(var1);

         for(ActorSpotAnim var11 = (ActorSpotAnim)var2.method8686(); var11 != null; var11 = (ActorSpotAnim)var2.next()) {
            if (var11.spotAnimationFrame != -1) {
               Model var9 = ItemContainer.SpotAnimationDefinition_get(var11.spotAnimation).getModel(var11.spotAnimationFrame);
               if (var9 != null) {
                  var9.offsetBy(0, -var11.spotAnimationHeight, 0);
                  var10.method4862(var9);
               }
            }
         }

         return var10;
      }
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2125761914"
   )
   void method2370() {
      this.field1142 = false;
      this.field1172 = -1;
      this.field1197 = -1;
      this.field1174 = -1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(III)Lcq;",
      garbageValue = "470709205"
   )
   @Export("Messages_getByChannelAndID")
   static Message Messages_getByChannelAndID(int var0, int var1) {
      ChatChannel var2 = (ChatChannel)Messages.Messages_channels.get(var0);
      return var2.getMessage(var1);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ILnm;IIIZI)V",
      garbageValue = "-1229709463"
   )
   public static void method2399(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
      class297.musicPlayerStatus = 1;
      class297.musicTrackArchive = var1;
      class379.musicTrackGroupId = var2;
      VarpDefinition.musicTrackFileId = var3;
      class100.musicTrackVolume = var4;
      class120.musicTrackBoolean = var5;
      class162.pcmSampleLength = var0;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)I",
      garbageValue = "59"
   )
   public static int method2400(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + var0.charAt(var3);
      }

      return var2;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1598492457"
   )
   static final int method2398(int var0, int var1) {
      int var2 = var0 + var1 * 57;
      var2 ^= var2 << 13;
      int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }
}
