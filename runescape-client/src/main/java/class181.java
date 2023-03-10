import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
final class class181 implements ThreadFactory {
   @ObfuscatedName("aq")
   @Export("SpriteBuffer_spritePalette")
   public static int[] SpriteBuffer_spritePalette;

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Ltg;",
      garbageValue = "2034130252"
   )
   public static PrivateChatMode method3544(int var0) {
      PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5040, PrivateChatMode.field5037, PrivateChatMode.field5039};
      PrivateChatMode[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         PrivateChatMode var4 = var2[var3];
         if (var0 == var4.field5038) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lew;FZI)F",
      garbageValue = "-1190281991"
   )
   static float method3541(class127 var0, float var1, boolean var2) {
      float var3 = 0.0F;
      if (var0 != null && var0.method2980() != 0) {
         float var4 = (float)var0.field1501[0].field1455;
         float var5 = (float)var0.field1501[var0.method2980() - 1].field1455;
         float var6 = var5 - var4;
         if (0.0 == (double)var6) {
            return var0.field1501[0].field1446;
         } else {
            float var7 = 0.0F;
            if (var1 > var5) {
               var7 = (var1 - var5) / var6;
            } else {
               var7 = (var1 - var4) / var6;
            }

            double var8 = (double)((int)var7);
            float var10 = Math.abs((float)((double)var7 - var8));
            float var11 = var10 * var6;
            var8 = Math.abs(var8 + 1.0);
            double var12 = var8 / 2.0;
            double var14 = (double)((int)var12);
            var10 = (float)(var12 - var14);
            float var16;
            float var17;
            if (var2) {
               if (var0.field1499 == class125.field1486) {
                  if ((double)var10 != 0.0) {
                     var11 += var4;
                  } else {
                     var11 = var5 - var11;
                  }
               } else if (var0.field1499 != class125.field1484 && var0.field1499 != class125.field1483) {
                  if (var0.field1499 == class125.field1489) {
                     var11 = var4 - var1;
                     var16 = var0.field1501[0].field1447;
                     var17 = var0.field1501[0].field1448;
                     var3 = var0.field1501[0].field1446;
                     if ((double)var16 != 0.0) {
                        var3 -= var11 * var17 / var16;
                     }

                     return var3;
                  }
               } else {
                  var11 = var5 - var11;
               }
            } else if (var0.field1512 == class125.field1486) {
               if (0.0 != (double)var10) {
                  var11 = var5 - var11;
               } else {
                  var11 += var4;
               }
            } else if (var0.field1512 != class125.field1484 && var0.field1512 != class125.field1483) {
               if (var0.field1512 == class125.field1489) {
                  var11 = var1 - var5;
                  var16 = var0.field1501[var0.method2980() - 1].field1449;
                  var17 = var0.field1501[var0.method2980() - 1].field1450;
                  var3 = var0.field1501[var0.method2980() - 1].field1446;
                  if (0.0 != (double)var16) {
                     var3 += var11 * var17 / var16;
                  }

                  return var3;
               }
            } else {
               var11 += var4;
            }

            var3 = AttackOption.method2646(var0, var11);
            float var18;
            if (var2 && var0.field1499 == class125.field1483) {
               var18 = var0.field1501[var0.method2980() - 1].field1446 - var0.field1501[0].field1446;
               var3 = (float)((double)var3 - var8 * (double)var18);
            } else if (!var2 && var0.field1512 == class125.field1483) {
               var18 = var0.field1501[var0.method2980() - 1].field1446 - var0.field1501[0].field1446;
               var3 = (float)((double)var3 + var8 * (double)var18);
            }

            return var3;
         }
      } else {
         return var3;
      }
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      descriptor = "(Lsq;I)V",
      garbageValue = "-1830172640"
   )
   static final void method3542(PacketBuffer var0) {
      for(int var1 = 0; var1 < Client.field539; ++var1) {
         int var2 = Client.field662[var1];
         NPC var3 = Client.npcs[var2];
         int var4 = var0.readUnsignedByte();
         int var5;
         if ((var4 & 8) != 0) {
            var5 = var0.readUnsignedByte();
            var4 += var5 << 8;
         }

         if ((var4 & 4096) != 0) {
            var5 = var0.readUnsignedByte();
            var4 += var5 << 16;
         }

         int var6;
         int var7;
         if ((var4 & 16) != 0) {
            var5 = var0.readUnsignedShortAdd();
            if (var5 == 65535) {
               var5 = -1;
            }

            var6 = var0.readUnsignedByteNeg();
            if (var5 == var3.sequence && var5 != -1) {
               var7 = Coord.SequenceDefinition_get(var5).field2276;
               if (var7 == 1) {
                  var3.sequenceFrame = 0;
                  var3.sequenceFrameCycle = 0;
                  var3.sequenceDelay = var6;
                  var3.field1186 = 0;
               }

               if (var7 == 2) {
                  var3.field1186 = 0;
               }
            } else if (var5 == -1 || var3.sequence == -1 || Coord.SequenceDefinition_get(var5).field2269 >= Coord.SequenceDefinition_get(var3.sequence).field2269) {
               var3.sequence = var5;
               var3.sequenceFrame = 0;
               var3.sequenceFrameCycle = 0;
               var3.sequenceDelay = var6;
               var3.field1186 = 0;
               var3.field1215 = var3.pathLength;
            }
         }

         int var8;
         int[] var13;
         short[] var14;
         if ((var4 & 131072) != 0) {
            var5 = var0.readUnsignedByte();
            var13 = new int[8];
            var14 = new short[8];

            for(var8 = 0; var8 < 8; ++var8) {
               if ((var5 & 1 << var8) != 0) {
                  var13[var8] = var0.readNullableLargeSmart();
                  var14[var8] = (short)var0.readShortSmartSub();
               } else {
                  var13[var8] = -1;
                  var14[var8] = -1;
               }
            }

            var3.method2563(var13, var14);
         }

         if ((var4 & 8192) != 0) {
            var3.method2570(var0.readUnsignedByteAdd());
         }

         if ((var4 & 4) != 0) {
            var3.targetIndex = var0.readUnsignedShortLE();
            var3.targetIndex += var0.readUnsignedByteSub() << 16;
            var5 = 16777215;
            if (var5 == var3.targetIndex) {
               var3.targetIndex = -1;
            }
         }

         if ((var4 & 65536) != 0) {
            var5 = var0.readUnsignedIntIME();
            var3.turnLeftSequence = (var5 & 1) != 0 ? var0.readUnsignedShortAdd() : var3.definition.turnLeftSequence;
            var3.turnRightSequence = (var5 & 2) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.turnRightSequence;
            var3.walkSequence = (var5 & 4) != 0 ? var0.readUnsignedShortLE() : var3.definition.walkSequence;
            var3.walkBackSequence = (var5 & 8) != 0 ? var0.readUnsignedShort() : var3.definition.walkBackSequence;
            var3.walkLeftSequence = (var5 & 16) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.walkLeftSequence;
            var3.walkRightSequence = (var5 & 32) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.walkRightSequence;
            var3.runSequence = (var5 & 64) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2003;
            var3.field1152 = (var5 & 128) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field2004;
            var3.field1153 = (var5 & 256) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2005;
            var3.field1154 = (var5 & 512) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2006;
            var3.field1155 = (var5 & 1024) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2007;
            var3.field1200 = (var5 & 2048) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2008;
            var3.field1212 = (var5 & 4096) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field2009;
            var3.field1158 = (var5 & 8192) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field1989;
            var3.idleSequence = (var5 & 16384) != 0 ? var0.readUnsignedShort() : var3.definition.idleSequence;
         }

         if ((var4 & 32) != 0) {
            var3.spotAnimation = var0.readUnsignedShortAdd();
            var5 = var0.readInt();
            var3.spotAnimationHeight = var5 >> 16;
            var3.field1190 = (var5 & '\uffff') + Client.cycle;
            var3.spotAnimationFrame = 0;
            var3.spotAnimationFrameCycle = 0;
            if (var3.field1190 > Client.cycle) {
               var3.spotAnimationFrame = -1;
            }

            if (var3.spotAnimation == 65535) {
               var3.spotAnimation = -1;
            }
         }

         int var9;
         int var10;
         if ((var4 & 1) != 0) {
            var5 = var0.readUnsignedByte();
            int var11;
            if (var5 > 0) {
               for(var6 = 0; var6 < var5; ++var6) {
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

            var6 = var0.readUnsignedByteAdd();
            if (var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var0.readUShortSmart();
                  var9 = var0.readUShortSmart();
                  if (var9 != 32767) {
                     var10 = var0.readUShortSmart();
                     var11 = var0.readUnsignedByteAdd();
                     int var12 = var9 > 0 ? var0.readUnsignedByteAdd() : var11;
                     var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
                  } else {
                     var3.removeHealthBar(var8);
                  }
               }
            }
         }

         if ((var4 & '耀') != 0) {
            var3.field1201 = Client.cycle + var0.readUnsignedShortAdd();
            var3.field1159 = Client.cycle + var0.readUnsignedShort();
            var3.field1203 = var0.readByte();
            var3.field1185 = var0.readByteNeg();
            var3.field1165 = var0.readByteNeg();
            var3.field1206 = (byte)var0.readUnsignedByte();
         }

         if ((var4 & 512) != 0) {
            var3.field1189 = var0.readInt();
         }

         short[] var15;
         long var16;
         if ((var4 & 2048) != 0) {
            var5 = var0.readUnsignedByte();
            if ((var5 & 1) == 1) {
               var3.method2589();
            } else {
               var13 = null;
               if ((var5 & 2) == 2) {
                  var7 = var0.readUnsignedByteSub();
                  var13 = new int[var7];

                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var0.readUnsignedShortLE();
                     var9 = var9 == 65535 ? -1 : var9;
                     var13[var8] = var9;
                  }
               }

               var14 = null;
               if ((var5 & 4) == 4) {
                  var8 = 0;
                  if (var3.definition.recolorTo != null) {
                     var8 = var3.definition.recolorTo.length;
                  }

                  var14 = new short[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var14[var9] = (short)var0.readUnsignedShort();
                  }
               }

               var15 = null;
               if ((var5 & 8) == 8) {
                  var9 = 0;
                  if (var3.definition.retextureTo != null) {
                     var9 = var3.definition.retextureTo.length;
                  }

                  var15 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var15[var10] = (short)var0.readUnsignedShortLE();
                  }
               }

               var16 = (long)(++NPC.field1284 - 1);
               var3.method2565(new NewStuff(var16, var13, var14, var15));
            }
         }

         if ((var4 & 256) != 0) {
            var3.method2619(var0.readStringCp1252NullTerminated());
         }

         if ((var4 & 2) != 0) {
            var3.overheadText = var0.readStringCp1252NullTerminated();
            var3.overheadTextCyclesRemaining = 100;
         }

         if ((var4 & 1024) != 0) {
            var3.field1192 = var0.readByteSub();
            var3.field1194 = var0.readByteNeg();
            var3.field1202 = var0.readByte();
            var3.field1195 = var0.readByteSub();
            var3.field1196 = var0.readUnsignedShortLE() + Client.cycle;
            var3.field1197 = var0.readUnsignedShortLE() + Client.cycle;
            var3.field1162 = var0.readUnsignedShortLE();
            var3.pathLength = 1;
            var3.field1215 = 0;
            var3.field1192 += var3.pathX[0];
            var3.field1194 += var3.pathY[0];
            var3.field1202 += var3.pathX[0];
            var3.field1195 += var3.pathY[0];
         }

         if ((var4 & 64) != 0) {
            var3.definition = class188.getNpcDefinition(var0.readUnsignedShort());
            class418.method7808(var3);
            var3.method2585();
         }

         if ((var4 & 128) != 0) {
            var5 = var0.readUnsignedShortAddLE();
            var6 = var0.readUnsignedShortAddLE();
            var3.field1157 = var0.readUnsignedByte() == 1;
            if (Client.field557 >= 212) {
               var3.field1180 = var5;
               var3.field1176 = var6;
            } else {
               var7 = var3.x - (var5 - GameEngine.baseX * 64 - GameEngine.baseX * 64) * 64;
               var8 = var3.y - (var6 - class178.baseY * 64 - class178.baseY * 64) * 64;
               if (var7 != 0 || var8 != 0) {
                  var3.field1164 = HitSplatDefinition.method3856(var7, var8);
               }
            }
         }

         if ((var4 & 16384) != 0) {
            var5 = var0.readUnsignedByteNeg();
            if ((var5 & 1) == 1) {
               var3.method2607();
            } else {
               var13 = null;
               if ((var5 & 2) == 2) {
                  var7 = var0.readUnsignedByteSub();
                  var13 = new int[var7];

                  for(var8 = 0; var8 < var7; ++var8) {
                     var9 = var0.readUnsignedShortAdd();
                     var9 = var9 == 65535 ? -1 : var9;
                     var13[var8] = var9;
                  }
               }

               var14 = null;
               if ((var5 & 4) == 4) {
                  var8 = 0;
                  if (var3.definition.recolorTo != null) {
                     var8 = var3.definition.recolorTo.length;
                  }

                  var14 = new short[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var14[var9] = (short)var0.readUnsignedShortAddLE();
                  }
               }

               var15 = null;
               if ((var5 & 8) == 8) {
                  var9 = 0;
                  if (var3.definition.retextureTo != null) {
                     var9 = var3.definition.retextureTo.length;
                  }

                  var15 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var15[var10] = (short)var0.readUnsignedShortAdd();
                  }
               }

               var16 = (long)(++NPC.field1282 - 1);
               var3.method2567(new NewStuff(var16, var13, var14, var15));
            }
         }
      }

   }
}
