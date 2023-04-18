import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class146 extends class139 {
   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("Widget_fontsArchive")
   static AbstractArchive Widget_fontsArchive;
   @ObfuscatedName("af")
   boolean field1689;
   @ObfuscatedName("an")
   byte field1686;
   @ObfuscatedName("aw")
   byte field1687;
   @ObfuscatedName("ac")
   byte field1688;
   @ObfuscatedName("au")
   byte field1685;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfa;)V"
   )
   class146(class142 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "168736686"
   )
   void vmethod3461(Buffer var1) {
      this.field1689 = var1.readUnsignedByte() == 1;
      this.field1686 = var1.readByte();
      this.field1687 = var1.readByte();
      this.field1688 = var1.readByte();
      this.field1685 = var1.readByte();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfj;I)V",
      garbageValue = "1712319228"
   )
   void vmethod3458(ClanSettings var1) {
      var1.allowGuests = this.field1689;
      var1.field1728 = this.field1686;
      var1.field1717 = this.field1687;
      var1.field1718 = this.field1688;
      var1.field1709 = this.field1685;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Lmd;",
      garbageValue = "1082139872"
   )
   public static GameBuild method3269(int var0) {
      GameBuild[] var1 = new GameBuild[]{GameBuild.LIVE, GameBuild.BUILDLIVE, GameBuild.RC, GameBuild.WIP};
      GameBuild[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         GameBuild var4 = var2[var3];
         if (var0 == var4.buildId) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "615247476"
   )
   public static int method3272(int var0) {
      return (var0 & class484.field4973) - 1;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "520752062"
   )
   public static final void method3265() {
      ViewportMouse.ViewportMouse_isInViewport = false;
      ViewportMouse.ViewportMouse_entityCount = 0;
   }

   @ObfuscatedName("kb")
   @ObfuscatedSignature(
      descriptor = "(ZLsq;I)V",
      garbageValue = "-1232221421"
   )
   @Export("updateNpcs")
   static final void updateNpcs(boolean var0, PacketBuffer var1) {
      Client.field616 = 0;
      Client.field548 = 0;
      class30.method467(var1);
      ItemLayer.method4306(var0, var1);

      int var2;
      int var3;
      for(var2 = 0; var2 < Client.field548; ++var2) {
         var3 = Client.field549[var2];
         NPC var4 = Client.npcs[var3];
         int var5 = var1.readUnsignedByte();
         int var6;
         if ((var5 & 128) != 0) {
            var6 = var1.readUnsignedByte();
            var5 += var6 << 8;
         }

         if ((var5 & 256) != 0) {
            var6 = var1.readUnsignedByte();
            var5 += var6 << 16;
         }

         int var7;
         int var8;
         if ((var5 & 64) != 0) {
            var6 = var1.readUnsignedShort();
            if (var6 == 65535) {
               var6 = -1;
            }

            var7 = var1.readUnsignedByteAdd();
            if (var6 == var4.sequence && var6 != -1) {
               var8 = ItemContainer.SequenceDefinition_get(var6).field2314;
               if (var8 == 1) {
                  var4.sequenceFrame = 0;
                  var4.sequenceFrameCycle = 0;
                  var4.sequenceDelay = var7;
                  var4.field1184 = 0;
               }

               if (var8 == 2) {
                  var4.field1184 = 0;
               }
            } else if (var6 == -1 || var4.sequence == -1 || ItemContainer.SequenceDefinition_get(var6).field2293 >= ItemContainer.SequenceDefinition_get(var4.sequence).field2293) {
               var4.sequence = var6;
               var4.sequenceFrame = 0;
               var4.sequenceFrameCycle = 0;
               var4.sequenceDelay = var7;
               var4.field1184 = 0;
               var4.field1210 = var4.pathLength;
            }
         }

         if ((var5 & 32) != 0) {
            var4.targetIndex = var1.readUnsignedShort();
            var4.targetIndex += var1.readUnsignedByteAdd() << 16;
            var6 = 16777215;
            if (var6 == var4.targetIndex) {
               var4.targetIndex = -1;
            }
         }

         if ((var5 & 2) != 0) {
            var4.overheadText = var1.readStringCp1252NullTerminated();
            var4.overheadTextCyclesRemaining = 100;
         }

         int var9;
         int var11;
         int var16;
         if ((var5 & 4) != 0) {
            var6 = var1.readUnsignedByte();
            int var12;
            if (var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var9 = -1;
                  var16 = -1;
                  var11 = -1;
                  var8 = var1.readUShortSmart();
                  if (var8 == 32767) {
                     var8 = var1.readUShortSmart();
                     var16 = var1.readUShortSmart();
                     var9 = var1.readUShortSmart();
                     var11 = var1.readUShortSmart();
                  } else if (var8 != 32766) {
                     var16 = var1.readUShortSmart();
                  } else {
                     var8 = -1;
                  }

                  var12 = var1.readUShortSmart();
                  var4.addHitSplat(var8, var16, var9, var11, Client.cycle, var12);
               }
            }

            var7 = var1.readUnsignedByteNeg();
            if (var7 > 0) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var1.readUShortSmart();
                  var16 = var1.readUShortSmart();
                  if (var16 != 32767) {
                     var11 = var1.readUShortSmart();
                     var12 = var1.readUnsignedByte();
                     int var13 = var16 > 0 ? var1.readUnsignedByteNeg() : var12;
                     var4.addHealthBar(var9, Client.cycle, var16, var11, var12, var13);
                  } else {
                     var4.removeHealthBar(var9);
                  }
               }
            }
         }

         if ((var5 & 8) != 0) {
            var4.definition = AbstractArchive.getNpcDefinition(var1.readUnsignedShortAddLE());
            class142.method3236(var4);
            var4.method2609();
         }

         if ((var5 & 1) != 0) {
            var6 = var1.readUnsignedShort();
            var7 = var1.readUnsignedIntLE();
            var4.method2375(0, var6, var7 >> 16, var7 & '\uffff');
         }

         if ((var5 & 16) != 0) {
            var6 = var1.readUnsignedShortAdd();
            var7 = var1.readUnsignedShortAdd();
            var4.field1142 = var1.readUnsignedByteAdd() == 1;
            if (Client.field497 >= 212) {
               var4.field1197 = var6;
               var4.field1174 = var7;
            } else {
               var8 = var4.x - (var6 - WorldMapData_0.baseX * 64 - WorldMapData_0.baseX * 64) * 64;
               var9 = var4.y - (var7 - GameObject.baseY * 64 - GameObject.baseY * 64) * 64;
               if (var8 != 0 || var9 != 0) {
                  var11 = (int)(Math.atan2((double)var8, (double)var9) * 325.94932345220167) & 2047;
                  var4.field1172 = var11;
               }
            }
         }

         if ((var5 & 16384) != 0) {
            var4.field1187 = var1.readByte();
            var4.field1189 = var1.readByteNeg();
            var4.field1188 = var1.readByteNeg();
            var4.field1207 = var1.readByteNeg();
            var4.spotAnimation = var1.readUnsignedShortAdd() + Client.cycle;
            var4.field1192 = var1.readUnsignedShortLE() + Client.cycle;
            var4.field1193 = var1.readUnsignedShortAddLE();
            var4.pathLength = 1;
            var4.field1210 = 0;
            var4.field1187 += var4.pathX[0];
            var4.field1189 += var4.pathY[0];
            var4.field1188 += var4.pathX[0];
            var4.field1207 += var4.pathY[0];
         }

         if ((var5 & '耀') != 0) {
            var4.field1211 = var1.readInt();
         }

         if ((var5 & 2048) != 0) {
            var4.field1168 = Client.cycle + var1.readUnsignedShortLE();
            var4.field1156 = Client.cycle + var1.readUnsignedShort();
            var4.field1180 = var1.readByteAdd();
            var4.field1199 = var1.readByteNeg();
            var4.field1200 = var1.readByteSub();
            var4.field1208 = (byte)var1.readUnsignedByteSub();
         }

         if ((var5 & 512) != 0) {
            var4.method2558(var1.readStringCp1252NullTerminated());
         }

         if ((var5 & 8192) != 0) {
            var4.method2613(var1.readUnsignedByte());
         }

         int[] var14;
         short[] var15;
         short[] var17;
         long var18;
         boolean var20;
         if ((var5 & 4096) != 0) {
            var6 = var1.readUnsignedByteSub();
            if ((var6 & 1) == 1) {
               var4.method2618();
            } else {
               var14 = null;
               if ((var6 & 2) == 2) {
                  var8 = var1.readUnsignedByteSub();
                  var14 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var16 = var1.readUnsignedShort();
                     var16 = var16 == 65535 ? -1 : var16;
                     var14[var9] = var16;
                  }
               }

               var15 = null;
               if ((var6 & 4) == 4) {
                  var9 = 0;
                  if (var4.definition.recolorTo != null) {
                     var9 = var4.definition.recolorTo.length;
                  }

                  var15 = new short[var9];

                  for(var16 = 0; var16 < var9; ++var16) {
                     var15[var16] = (short)var1.readUnsignedShortLE();
                  }
               }

               var17 = null;
               if ((var6 & 8) == 8) {
                  var16 = 0;
                  if (var4.definition.retextureTo != null) {
                     var16 = var4.definition.retextureTo.length;
                  }

                  var17 = new short[var16];

                  for(var11 = 0; var11 < var16; ++var11) {
                     var17[var11] = (short)var1.readUnsignedShortAdd();
                  }
               }

               var20 = false;
               if ((var6 & 16) != 0) {
                  var20 = var1.readUnsignedByte() == 1;
               }

               var18 = (long)(++NPC.field1274 - 1);
               var4.method2571(new NewStuff(var18, var14, var15, var17, var20));
            }
         }

         if ((var5 & 1024) != 0) {
            var6 = var1.readUnsignedByteAdd();
            if ((var6 & 1) == 1) {
               var4.method2575();
            } else {
               var14 = null;
               if ((var6 & 2) == 2) {
                  var8 = var1.readUnsignedByteAdd();
                  var14 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var16 = var1.readUnsignedShortAddLE();
                     var16 = var16 == 65535 ? -1 : var16;
                     var14[var9] = var16;
                  }
               }

               var15 = null;
               if ((var6 & 4) == 4) {
                  var9 = 0;
                  if (var4.definition.recolorTo != null) {
                     var9 = var4.definition.recolorTo.length;
                  }

                  var15 = new short[var9];

                  for(var16 = 0; var16 < var9; ++var16) {
                     var15[var16] = (short)var1.readUnsignedShortLE();
                  }
               }

               var17 = null;
               if ((var6 & 8) == 8) {
                  var16 = 0;
                  if (var4.definition.retextureTo != null) {
                     var16 = var4.definition.retextureTo.length;
                  }

                  var17 = new short[var16];

                  for(var11 = 0; var11 < var16; ++var11) {
                     var17[var11] = (short)var1.readUnsignedShortAddLE();
                  }
               }

               var20 = false;
               if ((var6 & 16) != 0) {
                  var20 = var1.readUnsignedByte() == 1;
               }

               var18 = (long)(++NPC.field1277 - 1);
               var4.method2573(new NewStuff(var18, var14, var15, var17, var20));
            }
         }

         if ((var5 & 131072) != 0) {
            var6 = var1.readUnsignedByteSub();
            var14 = new int[8];
            var15 = new short[8];

            for(var9 = 0; var9 < 8; ++var9) {
               if ((var6 & 1 << var9) != 0) {
                  var14[var9] = var1.readNullableLargeSmart();
                  var15[var9] = (short)var1.readShortSmartSub();
               } else {
                  var14[var9] = -1;
                  var15[var9] = -1;
               }
            }

            var4.method2593(var14, var15);
         }

         if ((var5 & 262144) != 0) {
            var6 = var1.readInt();
            var4.turnLeftSequence = (var6 & 1) != 0 ? var1.readUnsignedShort() : var4.definition.turnLeftSequence;
            var4.turnRightSequence = (var6 & 2) != 0 ? var1.readUnsignedShort() : var4.definition.turnRightSequence;
            var4.walkSequence = (var6 & 4) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.walkSequence;
            var4.walkBackSequence = (var6 & 8) != 0 ? var1.readUnsignedShort() : var4.definition.walkBackSequence;
            var4.walkLeftSequence = (var6 & 16) != 0 ? var1.readUnsignedShort() : var4.definition.walkLeftSequence;
            var4.walkRightSequence = (var6 & 32) != 0 ? var1.readUnsignedShort() : var4.definition.walkRightSequence;
            var4.runSequence = (var6 & 64) != 0 ? var1.readUnsignedShort() : var4.definition.field2048;
            var4.field1150 = (var6 & 128) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2008;
            var4.field1151 = (var6 & 256) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2025;
            var4.field1152 = (var6 & 512) != 0 ? var1.readUnsignedShortLE() : var4.definition.field2037;
            var4.field1153 = (var6 & 1024) != 0 ? var1.readUnsignedShort() : var4.definition.field2023;
            var4.field1196 = (var6 & 2048) != 0 ? var1.readUnsignedShort() : var4.definition.field2028;
            var4.field1155 = (var6 & 4096) != 0 ? var1.readUnsignedShortAdd() : var4.definition.field2029;
            var4.field1157 = (var6 & 8192) != 0 ? var1.readUnsignedShortAddLE() : var4.definition.field2030;
            var4.idleSequence = (var6 & 16384) != 0 ? var1.readUnsignedShortAdd() : var4.definition.idleSequence;
         }

         if ((var5 & 65536) != 0) {
            var6 = var1.readUnsignedByteAdd();

            for(var7 = 0; var7 < var6; ++var7) {
               var8 = var1.readUnsignedByteSub();
               var9 = var1.readUnsignedShortAddLE();
               var16 = var1.readUnsignedIntLE();
               var4.method2375(var8, var9, var16 >> 16, var16 & '\uffff');
            }
         }
      }

      for(var2 = 0; var2 < Client.field616; ++var2) {
         var3 = Client.field617[var2];
         if (Client.npcs[var3].npcCycle != Client.cycle) {
            Client.npcs[var3].definition = null;
            Client.npcs[var3] = null;
         }
      }

      if (var1.offset != Client.packetWriter.serverPacketLength) {
         throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
      } else {
         for(var2 = 0; var2 < Client.npcCount; ++var2) {
            if (Client.npcs[Client.npcIndices[var2]] == null) {
               throw new RuntimeException(var2 + "," + Client.npcCount);
            }
         }

      }
   }
}
