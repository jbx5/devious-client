import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cl")
@Implements("Actor")
public abstract class Actor extends Renderable {
   @ObfuscatedName("an")
   @Export("isWalking")
   boolean isWalking = false;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 2082301251
   )
   @Export("x")
   int x;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 201162729
   )
   @Export("y")
   int y;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -843576201
   )
   @Export("rotation")
   int rotation;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -44581457
   )
   int field1201 = 1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 187862823
   )
   @Export("playerCycle")
   int playerCycle;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 2069657441
   )
   @Export("idleSequence")
   int idleSequence = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -344103579
   )
   @Export("turnLeftSequence")
   int turnLeftSequence = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1645061365
   )
   @Export("turnRightSequence")
   int turnRightSequence = -1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -2128083475
   )
   @Export("walkSequence")
   int walkSequence = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1087764383
   )
   @Export("walkBackSequence")
   int walkBackSequence = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1509034049
   )
   @Export("walkLeftSequence")
   int walkLeftSequence = -1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -938435851
   )
   @Export("walkRightSequence")
   int walkRightSequence = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 684246447
   )
   @Export("runSequence")
   int runSequence = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -749362017
   )
   int field1181 = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 433711015
   )
   int field1151 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 1396311481
   )
   int field1152 = -1;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1631079087
   )
   int field1153 = -1;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1713723467
   )
   int field1209 = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -308852591
   )
   int field1184 = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 916016745
   )
   int field1156 = -1;
   @ObfuscatedName("aa")
   @Export("overheadText")
   String overheadText = null;
   @ObfuscatedName("bx")
   @Export("isAutoChatting")
   boolean isAutoChatting;
   @ObfuscatedName("bh")
   boolean field1155 = false;
   @ObfuscatedName("bm")
   @ObfuscatedGetter(
      intValue = 2132728057
   )
   @Export("overheadTextCyclesRemaining")
   int overheadTextCyclesRemaining = 100;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 128260117
   )
   @Export("overheadTextColor")
   int overheadTextColor = 0;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = -513565809
   )
   @Export("overheadTextEffect")
   int overheadTextEffect = 0;
   @ObfuscatedName("bg")
   @Export("hitSplatCount")
   byte hitSplatCount = 0;
   @ObfuscatedName("bd")
   @Export("hitSplatTypes")
   int[] hitSplatTypes = new int[4];
   @ObfuscatedName("bq")
   @Export("hitSplatValues")
   int[] hitSplatValues = new int[4];
   @ObfuscatedName("bk")
   @Export("hitSplatCycles")
   int[] hitSplatCycles = new int[4];
   @ObfuscatedName("bc")
   @Export("hitSplatTypes2")
   int[] hitSplatTypes2 = new int[4];
   @ObfuscatedName("bv")
   @Export("hitSplatValues2")
   int[] hitSplatValues2 = new int[4];
   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   @Export("healthBars")
   IterableNodeDeque healthBars = new IterableNodeDeque();
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -177989563
   )
   @Export("targetIndex")
   int targetIndex = -1;
   @ObfuscatedName("br")
   @Export("false0")
   boolean false0 = false;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 1147619093
   )
   int field1203 = -1;
   @ObfuscatedName("by")
   boolean field1173;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = 1935010867
   )
   @Export("movementSequence")
   int movementSequence = -1;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -454451479
   )
   @Export("movementFrame")
   int movementFrame = 0;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -974665831
   )
   @Export("movementFrameCycle")
   int movementFrameCycle = 0;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -188171203
   )
   int field1160 = 0;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -1963515013
   )
   @Export("sequence")
   int sequence = -1;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 1749938985
   )
   @Export("sequenceFrame")
   int sequenceFrame = 0;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -986209861
   )
   @Export("sequenceFrameCycle")
   int sequenceFrameCycle = 0;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1799281131
   )
   @Export("sequenceDelay")
   int sequenceDelay = 0;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = 94715391
   )
   int field1210 = 0;
   @ObfuscatedName("cd")
   @ObfuscatedGetter(
      intValue = 358038643
   )
   @Export("spotAnimation")
   int spotAnimation = -1;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -1833683875
   )
   @Export("spotAnimationFrame")
   int spotAnimationFrame = 0;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = 1617465677
   )
   @Export("spotAnimationFrameCycle")
   int spotAnimationFrameCycle = 0;
   @ObfuscatedName("ci")
   @ObfuscatedGetter(
      intValue = 801618611
   )
   int field1186;
   @ObfuscatedName("cq")
   @ObfuscatedGetter(
      intValue = -1449841861
   )
   @Export("spotAnimationHeight")
   int spotAnimationHeight;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 201933441
   )
   int field1150;
   @ObfuscatedName("ca")
   @ObfuscatedGetter(
      intValue = 1846469473
   )
   int field1189;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = 661045753
   )
   int field1190;
   @ObfuscatedName("cj")
   @ObfuscatedGetter(
      intValue = 2028156093
   )
   int field1188;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = -2024536551
   )
   int field1192;
   @ObfuscatedName("co")
   @ObfuscatedGetter(
      intValue = -473772391
   )
   int field1193;
   @ObfuscatedName("cw")
   @ObfuscatedGetter(
      intValue = 1018346863
   )
   int field1194;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -1150467361
   )
   @Export("npcCycle")
   int npcCycle = 0;
   @ObfuscatedName("cu")
   @ObfuscatedGetter(
      intValue = -500790387
   )
   @Export("defaultHeight")
   int defaultHeight = 200;
   @ObfuscatedName("ch")
   @ObfuscatedGetter(
      intValue = 763616681
   )
   int field1197 = -1;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -866481861
   )
   int field1198 = -1;
   @ObfuscatedName("cm")
   byte field1199;
   @ObfuscatedName("cc")
   byte field1200;
   @ObfuscatedName("cr")
   byte field1185;
   @ObfuscatedName("ct")
   byte field1202;
   @ObfuscatedName("cb")
   @ObfuscatedGetter(
      intValue = 36455077
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = 1135644645
   )
   int field1204 = 0;
   @ObfuscatedName("cn")
   @ObfuscatedGetter(
      intValue = 1831269937
   )
   int field1205 = 32;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = 1973809325
   )
   @Export("pathLength")
   int pathLength = 0;
   @ObfuscatedName("cx")
   @Export("pathX")
   int[] pathX = new int[10];
   @ObfuscatedName("cp")
   @Export("pathY")
   int[] pathY = new int[10];
   @ObfuscatedName("ds")
   @ObfuscatedSignature(
      descriptor = "[Lgo;"
   )
   @Export("pathTraversed")
   class202[] pathTraversed = new class202[10];
   @ObfuscatedName("df")
   @ObfuscatedGetter(
      intValue = 1183618047
   )
   int field1172 = 0;
   @ObfuscatedName("dc")
   @ObfuscatedGetter(
      intValue = -220662997
   )
   int field1211 = 0;
   @ObfuscatedName("dk")
   @ObfuscatedGetter(
      intValue = 1419553213
   )
   int field1212 = -1;

   Actor() {
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "246357037"
   )
   @Export("isVisible")
   boolean isVisible() {
      return false;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1312167120"
   )
   final void method2316() {
      this.pathLength = 0;
      this.field1211 = 0;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "-1854118366"
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
         HitSplatDefinition var12 = class158.method3241(var1);
         var10 = var12.field2067;
         var11 = var12.field2056;
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

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "-1902970487"
   )
   @Export("addHealthBar")
   final void addHealthBar(int var1, int var2, int var3, int var4, int var5, int var6) {
      HealthBarDefinition var7 = ModeWhere.method6594(var1);
      HealthBar var8 = null;
      HealthBar var9 = null;
      int var10 = var7.int2;
      int var11 = 0;

      HealthBar var12;
      for(var12 = (HealthBar)this.healthBars.last(); var12 != null; var12 = (HealthBar)this.healthBars.previous()) {
         ++var11;
         if (var12.definition.field1929 == var7.field1929) {
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

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1211388115"
   )
   @Export("removeHealthBar")
   final void removeHealthBar(int var1) {
      HealthBarDefinition var2 = ModeWhere.method6594(var1);

      for(HealthBar var3 = (HealthBar)this.healthBars.last(); var3 != null; var3 = (HealthBar)this.healthBars.previous()) {
         if (var2 == var3.definition) {
            var3.remove();
            return;
         }
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Lfd;",
      garbageValue = "-1492294528"
   )
   @Export("WorldMapElement_get")
   public static WorldMapElement WorldMapElement_get(int var0) {
      return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "93"
   )
   static int method2332(int var0, Script var1, boolean var2) {
      int var3;
      int var4;
      if (var0 == ScriptOpcodes.ADD) {
         class379.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 + var4;
         return 1;
      } else if (var0 == ScriptOpcodes.SUB) {
         class379.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 - var4;
         return 1;
      } else if (var0 == ScriptOpcodes.MULTIPLY) {
         class379.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var4 * var3;
         return 1;
      } else if (var0 == ScriptOpcodes.DIV) {
         class379.Interpreter_intStackSize -= 2;
         var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 / var4;
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOM) {
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var3);
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOMINC) {
         var3 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var3 + 1));
         return 1;
      } else {
         int var5;
         int var6;
         int var7;
         if (var0 == ScriptOpcodes.INTERPOLATE) {
            class379.Interpreter_intStackSize -= 5;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3];
            var7 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 4];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 + (var4 - var3) * (var7 - var5) / (var6 - var5);
            return 1;
         } else if (var0 == ScriptOpcodes.ADDPERCENT) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 + var3 * var4 / 100;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 | 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 & -1 - (1 << var4);
            return 1;
         } else if (var0 == ScriptOpcodes.TESTBIT) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (var3 & 1 << var4) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.MOD) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 % var4;
            return 1;
         } else if (var0 == ScriptOpcodes.POW) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            if (var3 == 0) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
            } else {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, (double)var4);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.INVPOW) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            if (var3 == 0) {
               Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
               return 1;
            } else {
               switch (var4) {
                  case 0:
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3;
                     break;
                  case 2:
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var3);
                     break;
                  case 3:
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var3);
                     break;
                  case 4:
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var3));
                     break;
                  default:
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)Math.pow((double)var3, 1.0 / (double)var4);
               }

               return 1;
            }
         } else if (var0 == ScriptOpcodes.AND) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 & var4;
            return 1;
         } else if (var0 == ScriptOpcodes.OR) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 | var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SCALE) {
            class379.Interpreter_intStackSize -= 3;
            long var9 = (long)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            long var11 = (long)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            long var13 = (long)Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = (int)(var13 * var9 / var11);
            return 1;
         } else if (var0 == ScriptOpcodes.BITCOUNT) {
            var3 = Renderable.method4454(Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize]);
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3;
            return 1;
         } else if (var0 == ScriptOpcodes.TOGGLEBIT) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 ^ 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
            class379.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = WorldMapDecoration.method5148(var3, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
            class379.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class28.method442(var3, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
            class379.Interpreter_intStackSize -= 3;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
            var6 = 31 - var5;
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 << var6 >>> var4 + var6;
            return 1;
         } else if (var0 == 4030) {
            class379.Interpreter_intStackSize -= 4;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 3];
            var3 = class28.method442(var3, var5, var6);
            var7 = Archive.method6338(var6 - var5 + 1);
            if (var4 > var7) {
               var4 = var7;
            }

            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3 | var4 << var5;
            return 1;
         } else if (var0 == 4032) {
            Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = class315.method6250(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4033) {
            Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = VarpDefinition.method3429(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4034) {
            class379.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
            var5 = AbstractWorldMapData.method5137(var3, var4);
            Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var5;
            return 1;
         } else if (var0 == 4035) {
            Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize - 1]);
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZI)I",
      garbageValue = "391113383"
   )
   static int method2334(int var0, Script var1, boolean var2) {
      String var3;
      int var10;
      if (var0 == ScriptOpcodes.APPEND_NUM) {
         var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
         var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3 + var10;
         return 1;
      } else {
         String var4;
         if (var0 == ScriptOpcodes.APPEND) {
            class125.Interpreter_stringStackSize -= 2;
            var3 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize];
            var4 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1];
            Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3 + var4;
            return 1;
         } else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
            var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
            var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
            Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3 + Canvas.intToString(var10, true);
            return 1;
         } else if (var0 == ScriptOpcodes.LOWERCASE) {
            var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
            Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.toLowerCase();
            return 1;
         } else {
            int var6;
            int var7;
            int var11;
            if (var0 == ScriptOpcodes.FROMDATE) {
               var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
               long var14 = ((long)var11 + 11745L) * 86400000L;
               Interpreter.Interpreter_calendar.setTime(new Date(var14));
               var6 = Interpreter.Interpreter_calendar.get(5);
               var7 = Interpreter.Interpreter_calendar.get(2);
               int var8 = Interpreter.Interpreter_calendar.get(1);
               Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var7] + "-" + var8;
               return 1;
            } else if (var0 != ScriptOpcodes.TEXT_GENDER) {
               if (var0 == ScriptOpcodes.TOSTRING) {
                  var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = Integer.toString(var11);
                  return 1;
               } else if (var0 == ScriptOpcodes.COMPARE) {
                  class125.Interpreter_stringStackSize -= 2;
                  Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class297.method5726(Interpreter.compareStrings(Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1], class103.clientLanguage));
                  return 1;
               } else {
                  int var9;
                  byte[] var12;
                  Font var13;
                  if (var0 == ScriptOpcodes.PARAHEIGHT) {
                     var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
                     class379.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
                     var12 = class143.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.PARAWIDTH) {
                     var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
                     class379.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
                     var12 = class143.archive13.takeFile(var9, 0);
                     var13 = new Font(var12);
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
                     class125.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1];
                     if (Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize] == 1) {
                        Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3;
                     } else {
                        Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.ESCAPE) {
                     var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
                     return 1;
                  } else if (var0 == ScriptOpcodes.APPEND_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3 + (char)var10;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
                     var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = class340.isCharPrintable((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = ClanSettings.isAlphaNumeric((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
                     var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = BuddyRankComparator.isCharAlphabetic((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
                     var11 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = GrandExchangeOffer.isDigit((char)var11) ? 1 : 0;
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_LENGTH) {
                     var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
                     if (var3 != null) {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.length();
                     } else {
                        Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = 0;
                     }

                     return 1;
                  } else if (var0 == ScriptOpcodes.SUBSTRING) {
                     var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
                     class379.Interpreter_intStackSize -= 2;
                     var10 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize];
                     var9 = Interpreter.Interpreter_intStack[class379.Interpreter_intStackSize + 1];
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
                     return 1;
                  } else if (var0 == ScriptOpcodes.REMOVETAGS) {
                     var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
                     StringBuilder var16 = new StringBuilder(var3.length());
                     boolean var17 = false;

                     for(var6 = 0; var6 < var3.length(); ++var6) {
                        var7 = var3.charAt(var6);
                        if (var7 == 60) {
                           var17 = true;
                        } else if (var7 == 62) {
                           var17 = false;
                        } else if (!var17) {
                           var16.append((char)var7);
                        }
                     }

                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var16.toString();
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
                     var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
                     var10 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.indexOf(var10);
                     return 1;
                  } else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
                     class125.Interpreter_stringStackSize -= 2;
                     var3 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1];
                     var9 = Interpreter.Interpreter_intStack[--class379.Interpreter_intStackSize];
                     Interpreter.Interpreter_intStack[++class379.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
                     return 1;
                  } else if (var0 == 4122) {
                     var3 = Interpreter.Interpreter_stringStack[--class125.Interpreter_stringStackSize];
                     Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3.toUpperCase();
                     return 1;
                  } else if (var0 == 4123) {
                     class125.Interpreter_stringStackSize -= 3;
                     var3 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize];
                     var4 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1];
                     String var5 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 2];
                     if (class296.localPlayer.appearance == null) {
                        Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5;
                        return 1;
                     } else {
                        switch (class296.localPlayer.appearance.field3425) {
                           case 0:
                              Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3;
                              break;
                           case 1:
                              Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4;
                              break;
                           case 2:
                           default:
                              Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var5;
                        }

                        return 1;
                     }
                  } else {
                     return 2;
                  }
               }
            } else {
               class125.Interpreter_stringStackSize -= 2;
               var3 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize];
               var4 = Interpreter.Interpreter_stringStack[class125.Interpreter_stringStackSize + 1];
               if (class296.localPlayer.appearance != null && class296.localPlayer.appearance.isFemale != 0) {
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var4;
               } else {
                  Interpreter.Interpreter_stringStack[++class125.Interpreter_stringStackSize - 1] = var3;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "279996688"
   )
   @Export("stringCp1252NullTerminatedByteSize")
   public static int stringCp1252NullTerminatedByteSize(String var0) {
      return var0.length() + 1;
   }
}
