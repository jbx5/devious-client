import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
@Implements("WorldMapSection0")
public class WorldMapSection0 implements WorldMapSection {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 35817219
   )
   @Export("oldZ")
   int oldZ;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1619140395
   )
   @Export("newZ")
   int newZ;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1648907397
   )
   @Export("oldX")
   int oldX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1378537689
   )
   @Export("oldY")
   int oldY;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2109242451
   )
   @Export("newX")
   int newX;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 943209293
   )
   @Export("newY")
   int newY;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -101053359
   )
   @Export("oldChunkXLow")
   int oldChunkXLow;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -2054777205
   )
   @Export("oldChunkYLow")
   int oldChunkYLow;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1338466827
   )
   @Export("oldChunkXHigh")
   int oldChunkXHigh;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -605414873
   )
   @Export("oldChunkYHigh")
   int oldChunkYHigh;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 657340511
   )
   @Export("newChunkXLow")
   int newChunkXLow;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -548338019
   )
   @Export("newChunkYLow")
   int newChunkYLow;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -989921259
   )
   @Export("newChunkXHigh")
   int newChunkXHigh;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1376821153
   )
   @Export("newChunkYHigh")
   int newChunkYHigh;

   WorldMapSection0() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lit;S)V",
      garbageValue = "2518"
   )
   @Export("expandBounds")
   public void expandBounds(WorldMapArea var1) {
      if (var1.regionLowX > this.newX) {
         var1.regionLowX = this.newX;
      }

      if (var1.regionHighX < this.newX) {
         var1.regionHighX = this.newX;
      }

      if (var1.regionLowY > this.newY) {
         var1.regionLowY = this.newY;
      }

      if (var1.regionHighY < this.newY) {
         var1.regionHighY = this.newY;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Z",
      garbageValue = "24"
   )
   @Export("containsCoord")
   public boolean containsCoord(int var1, int var2, int var3) {
      if (var1 >= this.oldZ && var1 < this.oldZ + this.newZ) {
         return var2 >= (this.oldX << 6) + (this.oldChunkXLow << 3) && var2 <= (this.oldX << 6) + (this.oldChunkXHigh << 3) + 7 && var3 >= (this.oldY << 6) + (this.oldChunkYLow << 3) && var3 <= (this.oldY << 6) + (this.oldChunkYHigh << 3) + 7;
      } else {
         return false;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1979934212"
   )
   @Export("containsPosition")
   public boolean containsPosition(int var1, int var2) {
      return var1 >= (this.newX << 6) + (this.newChunkXLow << 3) && var1 <= (this.newX << 6) + (this.newChunkXHigh << 3) + 7 && var2 >= (this.newY << 6) + (this.newChunkYLow << 3) && var2 <= (this.newY << 6) + (this.newChunkYHigh << 3) + 7;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIII)[I",
      garbageValue = "-2141431041"
   )
   @Export("getBorderTileLengths")
   public int[] getBorderTileLengths(int var1, int var2, int var3) {
      if (!this.containsCoord(var1, var2, var3)) {
         return null;
      } else {
         int[] var4 = new int[]{this.newX * 64 - this.oldX * 64 + var2 + (this.newChunkXLow * 8 - this.oldChunkXLow * 8), var3 + (this.newY * 64 - this.oldY * 64) + (this.newChunkYLow * 8 - this.oldChunkYLow * 8)};
         return var4;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIB)Lki;",
      garbageValue = "1"
   )
   @Export("coord")
   public Coord coord(int var1, int var2) {
      if (!this.containsPosition(var1, var2)) {
         return null;
      } else {
         int var3 = this.oldX * 64 - this.newX * 64 + (this.oldChunkXLow * 8 - this.newChunkXLow * 8) + var1;
         int var4 = this.oldY * 64 - this.newY * 64 + var2 + (this.oldChunkYLow * 8 - this.newChunkYLow * 8);
         return new Coord(this.oldZ, var3, var4);
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "2122367720"
   )
   @Export("read")
   public void read(Buffer var1) {
      this.oldZ = var1.readUnsignedByte();
      this.newZ = var1.readUnsignedByte();
      this.oldX = var1.readUnsignedShort();
      this.oldChunkXLow = var1.readUnsignedByte();
      this.oldChunkXHigh = var1.readUnsignedByte();
      this.oldY = var1.readUnsignedShort();
      this.oldChunkYLow = var1.readUnsignedByte();
      this.oldChunkYHigh = var1.readUnsignedByte();
      this.newX = var1.readUnsignedShort();
      this.newChunkXLow = var1.readUnsignedByte();
      this.newChunkXHigh = var1.readUnsignedByte();
      this.newY = var1.readUnsignedShort();
      this.newChunkYLow = var1.readUnsignedByte();
      this.newChunkYHigh = var1.readUnsignedByte();
      this.postRead();
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-707218127"
   )
   @Export("postRead")
   void postRead() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2044547637"
   )
   public static void method5106() {
      synchronized(MouseHandler.MouseHandler_instance) {
         MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
         MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
         MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
         MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
         MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
         MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
         MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
         MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
         MouseHandler.MouseHandler_lastButtonVolatile = 0;
      }
   }

   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1396413547"
   )
   static final void method5101() {
      if (Client.logoutTimer > 0) {
         class376.logOut();
      } else {
         Client.timer.method7168();
         class21.updateGameState(40);
         Frames.field2528 = Client.packetWriter.getSocket();
         Client.packetWriter.removeSocket();
      }
   }

   @ObfuscatedName("iz")
   @ObfuscatedSignature(
      descriptor = "(ZLqk;B)V",
      garbageValue = "71"
   )
   @Export("updateNpcs")
   static final void updateNpcs(boolean var0, PacketBuffer var1) {
      Client.field626 = 0;
      Client.field550 = 0;
      ClanChannelMember.method3000();

      int var2;
      int var3;
      int var7;
      int var8;
      int var9;
      int var10;
      int var12;
      int var17;
      while(true) {
         var2 = GameObject.field2733 ? 16 : 15;
         var3 = 1 << var2;
         if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) {
            break;
         }

         int var4 = var1.readBits(var2);
         if (var4 == var3 - 1) {
            break;
         }

         boolean var5 = false;
         if (Client.npcs[var4] == null) {
            Client.npcs[var4] = new NPC();
            var5 = true;
         }

         NPC var15 = Client.npcs[var4];
         Client.npcIndices[++Client.npcCount - 1] = var4;
         var15.npcCycle = Client.cycle;
         if (GameObject.field2733) {
            var10 = var1.readBits(1);
            if (var10 == 1) {
               Client.field551[++Client.field550 - 1] = var4;
            }

            boolean var11 = var1.readBits(1) == 1;
            if (var11) {
               var1.readBits(32);
            }

            var7 = var1.readBits(1);
            var15.definition = HealthBarDefinition.getNpcDefinition(var1.readBits(14));
            if (var0) {
               var8 = var1.readBits(8);
               if (var8 > 127) {
                  var8 -= 256;
               }
            } else {
               var8 = var1.readBits(5);
               if (var8 > 15) {
                  var8 -= 32;
               }
            }

            var12 = Client.defaultRotations[var1.readBits(3)];
            if (var5) {
               var15.orientation = var15.rotation = var12;
            }

            if (var0) {
               var9 = var1.readBits(8);
               if (var9 > 127) {
                  var9 -= 256;
               }
            } else {
               var9 = var1.readBits(5);
               if (var9 > 15) {
                  var9 -= 32;
               }
            }
         } else {
            var15.definition = HealthBarDefinition.getNpcDefinition(var1.readBits(14));
            if (var0) {
               var9 = var1.readBits(8);
               if (var9 > 127) {
                  var9 -= 256;
               }
            } else {
               var9 = var1.readBits(5);
               if (var9 > 15) {
                  var9 -= 32;
               }
            }

            if (var0) {
               var8 = var1.readBits(8);
               if (var8 > 127) {
                  var8 -= 256;
               }
            } else {
               var8 = var1.readBits(5);
               if (var8 > 15) {
                  var8 -= 32;
               }
            }

            var7 = var1.readBits(1);
            var10 = Client.defaultRotations[var1.readBits(3)];
            if (var5) {
               var15.orientation = var15.rotation = var10;
            }

            var17 = var1.readBits(1);
            if (var17 == 1) {
               Client.field551[++Client.field550 - 1] = var4;
            }

            boolean var18 = var1.readBits(1) == 1;
            if (var18) {
               var1.readBits(32);
            }
         }

         var15.field1201 = var15.definition.size;
         var15.field1205 = var15.definition.rotation;
         if (var15.field1205 == 0) {
            var15.rotation = 0;
         }

         var15.walkSequence = var15.definition.walkSequence;
         var15.walkBackSequence = var15.definition.walkBackSequence;
         var15.walkLeftSequence = var15.definition.walkLeftSequence;
         var15.walkRightSequence = var15.definition.walkRightSequence;
         var15.idleSequence = var15.definition.idleSequence;
         var15.turnLeftSequence = var15.definition.turnLeftSequence;
         var15.turnRightSequence = var15.definition.turnRightSequence;
         var15.runSequence = var15.definition.field1970;
         var15.field1181 = var15.definition.field1984;
         var15.field1151 = var15.definition.field1972;
         var15.field1152 = var15.definition.field1954;
         var15.field1153 = var15.definition.field1971;
         var15.field1209 = var15.definition.field1975;
         var15.field1184 = var15.definition.field1995;
         var15.field1156 = var15.definition.field1992;
         var15.method2497(class296.localPlayer.pathX[0] + var8, class296.localPlayer.pathY[0] + var9, var7 == 1);
      }

      var1.exportIndex();

      for(var2 = 0; var2 < Client.field550; ++var2) {
         var3 = Client.field551[var2];
         NPC var14 = Client.npcs[var3];
         int var16 = var1.readUnsignedByte();
         int var6;
         if ((var16 & 32) != 0) {
            var6 = var1.readUnsignedByte();
            var16 += var6 << 8;
         }

         if ((var16 & 2) != 0) {
            var14.spotAnimation = var1.readUnsignedShortLE();
            var6 = var1.readInt();
            var14.spotAnimationHeight = var6 >> 16;
            var14.field1186 = (var6 & '\uffff') + Client.cycle;
            var14.spotAnimationFrame = 0;
            var14.spotAnimationFrameCycle = 0;
            if (var14.field1186 > Client.cycle) {
               var14.spotAnimationFrame = -1;
            }

            if (var14.spotAnimation == 65535) {
               var14.spotAnimation = -1;
            }
         }

         if ((var16 & 8) != 0) {
            var6 = var1.readUnsignedByteSub();
            if (var6 > 0) {
               for(var7 = 0; var7 < var6; ++var7) {
                  var9 = -1;
                  var10 = -1;
                  var17 = -1;
                  var8 = var1.readUShortSmart();
                  if (var8 == 32767) {
                     var8 = var1.readUShortSmart();
                     var10 = var1.readUShortSmart();
                     var9 = var1.readUShortSmart();
                     var17 = var1.readUShortSmart();
                  } else if (var8 != 32766) {
                     var10 = var1.readUShortSmart();
                  } else {
                     var8 = -1;
                  }

                  var12 = var1.readUShortSmart();
                  var14.addHitSplat(var8, var10, var9, var17, Client.cycle, var12);
               }
            }

            var7 = var1.readUnsignedByteAdd();
            if (var7 > 0) {
               for(var8 = 0; var8 < var7; ++var8) {
                  var9 = var1.readUShortSmart();
                  var10 = var1.readUShortSmart();
                  if (var10 != 32767) {
                     var17 = var1.readUShortSmart();
                     var12 = var1.readUnsignedByteSub();
                     int var13 = var10 > 0 ? var1.readUnsignedByteAdd() : var12;
                     var14.addHealthBar(var9, Client.cycle, var10, var17, var12, var13);
                  } else {
                     var14.removeHealthBar(var9);
                  }
               }
            }
         }

         if ((var16 & 2048) != 0) {
            var14.method2488(var1.readStringCp1252NullTerminated());
         }

         if ((var16 & 512) != 0) {
            var14.field1212 = var1.readUnsignedIntLE();
         }

         if ((var16 & 4) != 0) {
            var6 = var1.readUnsignedShortLE();
            var7 = var1.readUnsignedShortAddLE();
            var14.field1173 = var1.readUnsignedByteAdd() == 1;
            var8 = var14.x - (var6 - KeyHandler.baseX * 64 - KeyHandler.baseX * 64) * 64;
            var9 = var14.y - (var7 - class158.baseY * 64 - class158.baseY * 64) * 64;
            if (var8 != 0 || var9 != 0) {
               var14.field1203 = (int)(Math.atan2((double)var8, (double)var9) * 325.949) & 2047;
            }
         }

         if ((var16 & 128) != 0) {
            var6 = var1.readUnsignedShort();
            if (var6 == 65535) {
               var6 = -1;
            }

            var7 = var1.readUnsignedByteSub();
            if (var6 == var14.sequence && var6 != -1) {
               var8 = WorldMapElement.SequenceDefinition_get(var6).field2232;
               if (var8 == 1) {
                  var14.sequenceFrame = 0;
                  var14.sequenceFrameCycle = 0;
                  var14.sequenceDelay = var7;
                  var14.field1210 = 0;
               }

               if (var8 == 2) {
                  var14.field1210 = 0;
               }
            } else if (var6 == -1 || var14.sequence == -1 || WorldMapElement.SequenceDefinition_get(var6).field2225 >= WorldMapElement.SequenceDefinition_get(var14.sequence).field2225) {
               var14.sequence = var6;
               var14.sequenceFrame = 0;
               var14.sequenceFrameCycle = 0;
               var14.sequenceDelay = var7;
               var14.field1210 = 0;
               var14.field1211 = var14.pathLength;
            }
         }

         if ((var16 & 64) != 0) {
            var14.overheadText = var1.readStringCp1252NullTerminated();
            var14.overheadTextCyclesRemaining = 100;
         }

         if ((var16 & 1024) != 0) {
            var14.field1150 = var1.readByteAdd();
            var14.field1190 = var1.readByteNeg();
            var14.field1189 = var1.readByteAdd();
            var14.field1188 = var1.readByte();
            var14.field1192 = var1.readUnsignedShort() + Client.cycle;
            var14.field1193 = var1.readUnsignedShort() + Client.cycle;
            var14.field1194 = var1.readUnsignedShortAddLE();
            var14.pathLength = 1;
            var14.field1211 = 0;
            var14.field1150 += var14.pathX[0];
            var14.field1190 += var14.pathY[0];
            var14.field1189 += var14.pathX[0];
            var14.field1188 += var14.pathY[0];
         }

         if ((var16 & 4096) != 0) {
            var14.field1197 = Client.cycle + var1.readUnsignedShortAddLE();
            var14.field1198 = Client.cycle + var1.readUnsignedShortAdd();
            var14.field1199 = var1.readByte();
            var14.field1200 = var1.readByteSub();
            var14.field1185 = var1.readByte();
            var14.field1202 = (byte)var1.readUnsignedByte();
         }

         if ((var16 & 1) != 0) {
            var14.targetIndex = var1.readUnsignedShortLE();
            if (GameObject.field2733) {
               var14.targetIndex += var1.readUnsignedByteAdd() << 16;
               var6 = 16777215;
            } else {
               var6 = 65535;
            }

            if (var6 == var14.targetIndex) {
               var14.targetIndex = -1;
            }
         }

         if ((var16 & 16) != 0) {
            var14.definition = HealthBarDefinition.getNpcDefinition(var1.readUnsignedShortLE());
            var14.field1201 = var14.definition.size;
            var14.field1205 = var14.definition.rotation;
            var14.walkSequence = var14.definition.walkSequence;
            var14.walkBackSequence = var14.definition.walkBackSequence;
            var14.walkLeftSequence = var14.definition.walkLeftSequence;
            var14.walkRightSequence = var14.definition.walkRightSequence;
            var14.idleSequence = var14.definition.idleSequence;
            var14.turnLeftSequence = var14.definition.turnLeftSequence;
            var14.turnRightSequence = var14.definition.turnRightSequence;
         }

         if ((var16 & 256) != 0) {
            var14.method2489(var1.readUnsignedByteAdd());
         }
      }

      for(var2 = 0; var2 < Client.field626; ++var2) {
         var3 = Client.field627[var2];
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
