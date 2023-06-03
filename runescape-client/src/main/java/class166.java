import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gz")
public class class166 extends class142 {
   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      descriptor = "Lph;"
   )
   @Export("fontBold12")
   static Font fontBold12;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -18195497
   )
   int field1786;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      longValue = -6556220409657227367L
   )
   long field1787;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class166(class145 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      this.field1786 = var1.readInt();
      this.field1787 = var1.readLong();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.method3264(this.field1786, this.field1787);
   }

   @ObfuscatedName("av")
   public static int method3386(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)Lcg;",
      garbageValue = "-1307291801"
   )
   @Export("Messages_getMessage")
   static Message Messages_getMessage(int var0) {
      return (Message)Messages.Messages_hashTable.get((long)var0);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)[Lfg;",
      garbageValue = "-27"
   )
   static class130[] method3387() {
      return new class130[]{class130.field1534, class130.field1529, class130.field1530, class130.field1531, class130.field1532, class130.field1533};
   }

   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      descriptor = "(Ltl;I)V",
      garbageValue = "1746629784"
   )
   static final void method3380(PacketBuffer var0) {
      for(int var1 = 0; var1 < Client.field579; ++var1) {
         int var2 = Client.field566[var1];
         NPC var3 = Client.npcs[var2];
         int var4 = var0.readUnsignedByte();
         int var5;
         if ((var4 & 8) != 0) {
            var5 = var0.readUnsignedByte();
            var4 += var5 << 8;
         }

         if ((var4 & 2048) != 0) {
            var5 = var0.readUnsignedByte();
            var4 += var5 << 16;
         }

         if ((var4 & 256) != 0) {
            var3.field1170 = Client.cycle + var0.readUnsignedShortAddLE();
            var3.field1213 = Client.cycle + var0.readUnsignedShortLE();
            var3.field1164 = var0.readByteAdd();
            var3.field1215 = var0.readByteNeg();
            var3.field1196 = var0.readByteAdd();
            var3.field1217 = (byte)var0.readUnsignedByteNeg();
         }

         if ((var4 & 1024) != 0) {
            var3.field1203 = var0.readByteSub();
            var3.field1205 = var0.readByteNeg();
            var3.field1173 = var0.readByteNeg();
            var3.field1206 = var0.readByteNeg();
            var3.spotAnimation = var0.readUnsignedShort() + Client.cycle;
            var3.field1208 = var0.readUnsignedShortLE() + Client.cycle;
            var3.field1209 = var0.readUnsignedShort();
            var3.pathLength = 1;
            var3.field1226 = 0;
            var3.field1203 += var3.pathX[0];
            var3.field1205 += var3.pathY[0];
            var3.field1173 += var3.pathX[0];
            var3.field1206 += var3.pathY[0];
         }

         int var6;
         int var7;
         int var8;
         if ((var4 & 1) != 0) {
            var5 = var0.readUnsignedShortLE();
            var6 = var0.readUnsignedShortAdd();
            var3.field1184 = var0.readUnsignedByteSub() == 1;
            if (Client.field512 >= 212) {
               var3.field1178 = var5;
               var3.field1190 = var6;
            } else {
               var7 = var3.x - (var5 - class213.baseX * 64 - class213.baseX * 64) * 64;
               var8 = var3.y - (var6 - class101.baseY * 64 - class101.baseY * 64) * 64;
               if (var7 != 0 || var8 != 0) {
                  var3.field1228 = class398.method7591(var7, var8);
               }
            }
         }

         if ((var4 & 128) != 0) {
            var3.definition = Bounds.getNpcDefinition(var0.readUnsignedShortLE());
            class381.method7122(var3);
            var3.method2567();
         }

         int var9;
         if ((var4 & 262144) != 0) {
            var5 = var0.readUnsignedByteSub();

            for(var6 = 0; var6 < var5; ++var6) {
               var7 = var0.readUnsignedByte();
               var8 = var0.readUnsignedShortAddLE();
               var9 = var0.readInt();
               var3.updateSpotAnimation(var7, var8, var9 >> 16, var9 & '\uffff');
            }
         }

         if ((var4 & 16) != 0) {
            var3.overheadText = var0.readStringCp1252NullTerminated();
            var3.overheadTextCyclesRemaining = 100;
         }

         if ((var4 & 16384) != 0) {
            var3.field1227 = var0.readInt();
         }

         int var10;
         if ((var4 & 2) != 0) {
            var5 = var0.readUnsignedByteNeg();
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

            var6 = var0.readUnsignedByte();
            if (var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var8 = var0.readUShortSmart();
                  var9 = var0.readUShortSmart();
                  if (var9 != 32767) {
                     var10 = var0.readUShortSmart();
                     var11 = var0.readUnsignedByte();
                     int var12 = var9 > 0 ? var0.readUnsignedByteNeg() : var11;
                     var3.addHealthBar(var8, Client.cycle, var9, var10, var11, var12);
                  } else {
                     var3.removeHealthBar(var8);
                  }
               }
            }
         }

         if ((var4 & 64) != 0) {
            var3.targetIndex = var0.readUnsignedShortAdd();
            var3.targetIndex += var0.readUnsignedByte() << 16;
            var5 = 16777215;
            if (var5 == var3.targetIndex) {
               var3.targetIndex = -1;
            }
         }

         if ((var4 & 32) != 0) {
            var0.readUnsignedShortAddLE();
            var0.readInt();
         }

         int[] var13;
         short[] var14;
         if ((var4 & 131072) != 0) {
            var5 = var0.readUnsignedByteAdd();
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

            var3.method2566(var13, var14);
         }

         if ((var4 & 65536) != 0) {
            var5 = var0.readUnsignedIntLE();
            var3.turnLeftSequence = (var5 & 1) != 0 ? var0.readUnsignedShortLE() : var3.definition.turnLeftSequence;
            var3.turnRightSequence = (var5 & 2) != 0 ? var0.readUnsignedShortLE() : var3.definition.turnRightSequence;
            var3.walkSequence = (var5 & 4) != 0 ? var0.readUnsignedShortAdd() : var3.definition.walkSequence;
            var3.walkBackSequence = (var5 & 8) != 0 ? var0.readUnsignedShortLE() : var3.definition.walkBackSequence;
            var3.walkLeftSequence = (var5 & 16) != 0 ? var0.readUnsignedShortLE() : var3.definition.walkLeftSequence;
            var3.walkRightSequence = (var5 & 32) != 0 ? var0.readUnsignedShort() : var3.definition.walkRightSequence;
            var3.runSequence = (var5 & 64) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field2014;
            var3.field1191 = (var5 & 128) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field2011;
            var3.field1198 = (var5 & 256) != 0 ? var0.readUnsignedShortAdd() : var3.definition.field2012;
            var3.field1167 = (var5 & 512) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2013;
            var3.field1168 = (var5 & 1024) != 0 ? var0.readUnsignedShortAddLE() : var3.definition.field1994;
            var3.field1169 = (var5 & 2048) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2015;
            var3.field1183 = (var5 & 4096) != 0 ? var0.readUnsignedShort() : var3.definition.field2016;
            var3.field1171 = (var5 & 8192) != 0 ? var0.readUnsignedShortLE() : var3.definition.field2017;
            var3.idleSequence = (var5 & 16384) != 0 ? var0.readUnsignedShortAdd() : var3.definition.idleSequence;
         }

         if ((var4 & 4) != 0) {
            var5 = var0.readUnsignedShortAdd();
            if (var5 == 65535) {
               var5 = -1;
            }

            var6 = var0.readUnsignedByteAdd();
            if (var5 == var3.sequence && var5 != -1) {
               var7 = WorldMapLabelSize.SequenceDefinition_get(var5).field2299;
               if (var7 == 1) {
                  var3.sequenceFrame = 0;
                  var3.sequenceFrameCycle = 0;
                  var3.sequenceDelay = var6;
                  var3.field1200 = 0;
               }

               if (var7 == 2) {
                  var3.field1200 = 0;
               }
            } else if (var5 == -1 || var3.sequence == -1 || WorldMapLabelSize.SequenceDefinition_get(var5).field2278 >= WorldMapLabelSize.SequenceDefinition_get(var3.sequence).field2278) {
               var3.sequence = var5;
               var3.sequenceFrame = 0;
               var3.sequenceFrameCycle = 0;
               var3.sequenceDelay = var6;
               var3.field1200 = 0;
               var3.field1226 = var3.pathLength;
            }
         }

         if ((var4 & 4096) != 0) {
            var3.method2615(var0.readUnsignedByteSub());
         }

         short[] var15;
         long var16;
         boolean var18;
         if ((var4 & 512) != 0) {
            var5 = var0.readUnsignedByteNeg();
            if ((var5 & 1) == 1) {
               var3.method2571();
            } else {
               var13 = null;
               if ((var5 & 2) == 2) {
                  var7 = var0.readUnsignedByteNeg();
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
                     var14[var9] = (short)var0.readUnsignedShortLE();
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

               var18 = false;
               if ((var5 & 16) != 0) {
                  var18 = var0.readUnsignedByteNeg() == 1;
               }

               var16 = (long)(++NPC.field1289 - 1);
               var3.method2579(new NewStuff(var16, var13, var14, var15, var18));
            }
         }

         if ((var4 & 8192) != 0) {
            var5 = var0.readUnsignedByteSub();
            if ((var5 & 1) == 1) {
               var3.method2572();
            } else {
               var13 = null;
               if ((var5 & 2) == 2) {
                  var7 = var0.readUnsignedByte();
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

               var18 = false;
               if ((var5 & 16) != 0) {
                  var18 = var0.readUnsignedByte() == 1;
               }

               var16 = (long)(++NPC.field1281 - 1);
               var3.method2570(new NewStuff(var16, var13, var14, var15, var18));
            }
         }

         if ((var4 & '耀') != 0) {
            var3.method2555(var0.readStringCp1252NullTerminated());
         }
      }

   }
}
