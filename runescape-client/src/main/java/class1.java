import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class1 implements Callable {
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ldm;"
   )
   @Export("World_request")
   static UrlRequest World_request;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 735259681
   )
   static int field2;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   final Buffer field5;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lx;"
   )
   final class3 field1;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lr;"
   )
   final class7 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lr;Lqy;Lx;)V"
   )
   class1(class7 var1, Buffer var2, class3 var3) {
      this.this$0 = var1;
      this.field5 = var2;
      this.field1 = var3;
   }

   public Object call() {
      return this.field1.vmethod13(this.field5);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-2058763970"
   )
   static final void method10(String var0) {
      StringBuilder var10000 = (new StringBuilder()).append(var0);
      Object var10001 = null;
      String var1 = var10000.append(" is already on your friend list").toString();
      KitDefinition.addGameMessage(30, "", var1);
   }

   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "1539382446"
   )
   @Export("queueSoundEffect")
   static void queueSoundEffect(int var0, int var1, int var2) {
      if (StructComposition.clientPreferences.method2426() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
         Client.soundEffectIds[Client.soundEffectCount] = var0;
         Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
         Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
         Client.soundEffects[Client.soundEffectCount] = null;
         Client.soundLocations[Client.soundEffectCount] = 0;
         ++Client.soundEffectCount;
      }

   }

   @ObfuscatedName("jj")
   @ObfuscatedSignature(
      descriptor = "(Lqx;B)V",
      garbageValue = "0"
   )
   static final void method7(PacketBuffer var0) {
      for(int var1 = 0; var1 < Client.field564; ++var1) {
         int var2 = Client.field565[var1];
         NPC var3 = Client.npcs[var2];
         int var4 = var0.readUnsignedByte();
         int var5;
         if ((var4 & 1) != 0) {
            var5 = var0.readUnsignedByte();
            var4 += var5 << 8;
         }

         if ((var4 & 2048) != 0) {
            var5 = var0.readUnsignedByte();
            var4 += var5 << 16;
         }

         if ((var4 & 131072) != 0) {
            var5 = var0.readUnsignedIntLE();
            var3.turnLeftSequence = (var5 & 1) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.turnLeftSequence;
            var3.turnRightSequence = (var5 & 2) != 0 ? var0.readUnsignedShort() : var3.definition.turnRightSequence;
            var3.walkSequence = (var5 & 4) != 0 ? var0.readUnsignedShort() : var3.definition.walkSequence;
            var3.walkBackSequence = (var5 & 8) != 0 ? var0.readUnsignedShort() : var3.definition.walkBackSequence;
            var3.walkLeftSequence = (var5 & 16) != 0 ? var0.readUnsignedShort() : var3.definition.walkLeftSequence;
            var3.walkRightSequence = (var5 & 32) != 0 ? var0.readUnsignedShortLE() : var3.definition.walkRightSequence;
            var3.runSequence = (var5 & 64) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field2035;
            var3.field1191 = (var5 & 128) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2038;
            var3.field1201 = (var5 & 256) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2039;
            var3.field1193 = (var5 & 512) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field2040;
            var3.field1194 = (var5 & 1024) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field2041;
            var3.field1195 = (var5 & 2048) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2042;
            var3.field1226 = (var5 & 4096) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2043;
            var3.field1197 = (var5 & 8192) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field2044;
            var3.idleSequence = (var5 & 16384) != 0 ? var0.readUnsignedShortLE() : var3.definition.idleSequence;
         }

         if ((var4 & 4) != 0) {
            var3.definition = class129.getNpcDefinition(var0.readUnsignedShortLE());
            GameObject.method4832(var3);
            var3.method2541();
         }

         if ((var4 & 1024) != 0) {
            var3.field1238 = Client.cycle + var0.readUnsignedShortAddLE();
            var3.field1200 = Client.cycle + var0.readUnsignedShortAddLE();
            var3.field1240 = var0.readByteNeg();
            var3.field1220 = var0.readByte();
            var3.field1232 = var0.readByteNeg();
            var3.field1243 = (byte)var0.readUnsignedByteAdd();
         }

         int[] var6;
         int var7;
         int var8;
         int var9;
         int var10;
         short[] var13;
         short[] var14;
         long var15;
         if ((var4 & 512) != 0) {
            var5 = var0.readUnsignedByteAdd();
            if ((var5 & 1) == 1) {
               var3.method2567();
            } else {
               var6 = null;
               if ((var5 & 2) == 2) {
                  var7 = var0.readUnsignedByteSub();
                  var6 = new int[var7];

                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var0.readUnsignedShortLE();
                     var9 = var9 == 65535 ? -1 : var9;
                     var6[var8] = var9;
                  }
               }

               var13 = null;
               if ((var5 & 4) == 4) {
                  var8 = 0;
                  if (var3.definition.recolorTo != null) {
                     var8 = var3.definition.recolorTo.length;
                  }

                  var13 = new short[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var13[var9] = (short)var0.readUnsignedShortAddLE();
                  }
               }

               var14 = null;
               if ((var5 & 8) == 8) {
                  var9 = 0;
                  if (var3.definition.retextureTo != null) {
                     var9 = var3.definition.retextureTo.length;
                  }

                  var14 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var14[var10] = (short)var0.readUnsignedShortLE();
                  }
               }

               var15 = (long)(++NPC.field1315 - 1);
               var3.method2544(new NewStuff(var15, var6, var13, var14));
            }
         }

         if ((var4 & 8192) != 0) {
            var3.field1253 = var0.readUnsignedIntIME();
         }

         int var17;
         if ((var4 & 32) != 0) {
            var5 = var0.readUnsignedShortAdd();
            if (var5 == 65535) {
               var5 = -1;
            }

            var17 = var0.readUnsignedByte();
            if (var5 == var3.sequence && var5 != -1) {
               var7 = AABB.SequenceDefinition_get(var5).field2276;
               if (var7 == 1) {
                  var3.sequenceFrame = 0;
                  var3.sequenceFrameCycle = 0;
                  var3.sequenceDelay = var17;
                  var3.field1223 = 0;
               }

               if (var7 == 2) {
                  var3.field1223 = 0;
               }
            } else if (var5 == -1 || var3.sequence == -1 || AABB.SequenceDefinition_get(var5).field2300 >= AABB.SequenceDefinition_get(var3.sequence).field2300) {
               var3.sequence = var5;
               var3.sequenceFrame = 0;
               var3.sequenceFrameCycle = 0;
               var3.sequenceDelay = var17;
               var3.field1223 = 0;
               var3.field1252 = var3.pathLength;
            }
         }

         if ((var4 & 16) != 0) {
            var5 = var0.readUnsignedByteNeg();
            int var11;
            if (var5 > 0) {
               for(var17 = 0; var17 < var5; ++var17) {
                  var8 = -1;
                  var9 = -1;
                  var10 = -1;
                  var7 = var0.readUShortSmart();
                  if (var7 == 32767) {
                     var7 = var0.readUShortSmart();
                     var9 = var0.readUShortSmart();
                     var8 = var0.readUShortSmart();
                     var10 = var0.readUShortSmart();
                  } else if (var7 != 32766) {
                     var9 = var0.readUShortSmart();
                  } else {
                     var7 = -1;
                  }

                  var11 = var0.readUShortSmart();
                  var3.addHitSplat(var7, var9, var8, var10, Client.cycle, var11);
               }
            }

            var17 = var0.readUnsignedByte();
            if (var17 > 0) {
               for(var7 = 0; var7 < var17; ++var7) {
                  var8 = var0.readUShortSmart();
                  var9 = var0.readUShortSmart();
                  if (var9 != 32767) {
                     var10 = var0.readUShortSmart();
                     var11 = var0.readUnsignedByteNeg();
                     int var12 = var9 > 0 ? var0.readUnsignedByteAdd() : var11;
                     var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
                  } else {
                     var3.removeHealthBar(var8);
                  }
               }
            }
         }

         if ((var4 & 128) != 0) {
            var3.overheadText = var0.readStringCp1252NullTerminated();
            var3.overheadTextCyclesRemaining = 100;
         }

         if ((var4 & 4096) != 0) {
            var3.method2531(var0.readUnsignedByte());
         }

         if ((var4 & 256) != 0) {
            var3.method2573(var0.readStringCp1252NullTerminated());
         }

         if ((var4 & 8) != 0) {
            var5 = var0.readUnsignedShort();
            var17 = var0.readUnsignedShort();
            var3.field1228 = var0.readUnsignedByte() == 1;
            var7 = var3.x - (var5 - class154.baseX * 64 - class154.baseX * 64) * 64;
            var8 = var3.y - (var17 - class365.baseY * 64 - class365.baseY * 64) * 64;
            if (var7 != 0 || var8 != 0) {
               var3.field1190 = (int)(Math.atan2((double)var7, (double)var8) * 325.949) & 2047;
            }
         }

         if ((var4 & '耀') != 0) {
            var3.field1196 = var0.readByteNeg();
            var3.field1185 = var0.readByte();
            var3.field1230 = var0.readByteNeg();
            var3.field1213 = var0.readByteSub();
            var3.field1233 = var0.readUnsignedShort() + Client.cycle;
            var3.field1234 = var0.readUnsignedShortLE() + Client.cycle;
            var3.field1235 = var0.readUnsignedShort();
            var3.pathLength = 1;
            var3.field1252 = 0;
            var3.field1196 += var3.pathX[0];
            var3.field1185 += var3.pathY[0];
            var3.field1230 += var3.pathX[0];
            var3.field1213 += var3.pathY[0];
         }

         if ((var4 & 16384) != 0) {
            var5 = var0.readUnsignedByteSub();
            if ((var5 & 1) == 1) {
               var3.method2560();
            } else {
               var6 = null;
               if ((var5 & 2) == 2) {
                  var7 = var0.readUnsignedByte();
                  var6 = new int[var7];

                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var0.readUnsignedShortAdd();
                     var9 = var9 == 65535 ? -1 : var9;
                     var6[var8] = var9;
                  }
               }

               var13 = null;
               if ((var5 & 4) == 4) {
                  var8 = 0;
                  if (var3.definition.recolorTo != null) {
                     var8 = var3.definition.recolorTo.length;
                  }

                  var13 = new short[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var13[var9] = (short)var0.readUnsignedShortLE();
                  }
               }

               var14 = null;
               if ((var5 & 8) == 8) {
                  var9 = 0;
                  if (var3.definition.retextureTo != null) {
                     var9 = var3.definition.retextureTo.length;
                  }

                  var14 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var14[var10] = (short)var0.readUnsignedShortAdd();
                  }
               }

               var15 = (long)(++NPC.field1317 - 1);
               var3.method2542(new NewStuff(var15, var6, var13, var14));
            }
         }

         if ((var4 & 64) != 0) {
            var3.targetIndex = var0.readUnsignedShort();
            if (ParamComposition.field2121) {
               var3.targetIndex += var0.readUnsignedByteSub() << 16;
               var5 = 16777215;
            } else {
               var5 = 65535;
            }

            if (var5 == var3.targetIndex) {
               var3.targetIndex = -1;
            }
         }

         if ((var4 & 2) != 0) {
            var3.spotAnimation = var0.readUnsignedShort();
            var5 = var0.readUnsignedIntIME();
            var3.spotAnimationHeight = var5 >> 16;
            var3.field1227 = (var5 & '\uffff') + Client.cycle;
            var3.spotAnimationFrame = 0;
            var3.spotAnimationFrameCycle = 0;
            if (var3.field1227 > Client.cycle) {
               var3.spotAnimationFrame = -1;
            }

            if (var3.spotAnimation == 65535) {
               var3.spotAnimation = -1;
            }
         }

         if ((var4 & 65536) != 0) {
            var5 = var0.readUnsignedByteSub();
            var6 = new int[8];
            var13 = new short[8];

            for(var8 = 0; var8 < 8; ++var8) {
               if ((var5 & 1 << var8) != 0) {
                  var6[var8] = var0.readNullableLargeSmart();
                  var13[var8] = (short)var0.readShortSmartSub();
               } else {
                  var6[var8] = -1;
                  var13[var8] = -1;
               }
            }

            var3.method2540(var6, var13);
         }
      }

   }
}
