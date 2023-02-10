import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class137 extends class139 {
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1690262715
   )
   static int field1639;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = 2074990388668468489L
   )
   long field1640;
   @ObfuscatedName("w")
   String field1638;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lex;)V"
   )
   class137(class142 var1) {
      this.this$0 = var1;
      this.field1640 = -1L;
      this.field1638 = null;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;S)V",
      garbageValue = "-5782"
   )
   void vmethod3394(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         this.field1640 = var1.readLong();
      }

      this.field1638 = var1.readStringCp1252NullTerminatedOrNull();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Leb;B)V",
      garbageValue = "-26"
   )
   void vmethod3393(ClanSettings var1) {
      var1.method3230(this.field1640, this.field1638, 0);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IS)Lgo;",
      garbageValue = "387"
   )
   @Export("getNpcDefinition")
   public static NPCComposition getNpcDefinition(int var0) {
      NPCComposition var1 = (NPCComposition)NPCComposition.NpcDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
         var1 = new NPCComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         NPCComposition.NpcDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lru;II)V",
      garbageValue = "-1171621468"
   )
   @Export("readPlayerUpdate")
   static void readPlayerUpdate(PacketBuffer var0, int var1) {
      boolean var2 = var0.readBits(1) == 1;
      if (var2) {
         Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
      }

      int var3 = var0.readBits(2);
      Player var4 = Client.players[var1];
      if (var3 == 0) {
         if (var2) {
            var4.field1132 = false;
         } else if (Client.localPlayerIndex == var1) {
            throw new RuntimeException();
         } else {
            Players.Players_regions[var1] = (var4.plane << 28) + (Client.baseY * 64 + var4.pathY[0] >> 13) + (ParamComposition.baseX * 64 + var4.pathX[0] >> 13 << 14);
            if (var4.field1195 != -1) {
               Players.Players_orientations[var1] = var4.field1195;
            } else {
               Players.Players_orientations[var1] = var4.orientation;
            }

            Players.Players_targetIndices[var1] = var4.targetIndex;
            Client.players[var1] = null;
            if (var0.readBits(1) != 0) {
               class285.updateExternalPlayer(var0, var1);
            }

         }
      } else {
         int var5;
         int var6;
         int var7;
         if (var3 == 1) {
            var5 = var0.readBits(3);
            var6 = var4.pathX[0];
            var7 = var4.pathY[0];
            if (var5 == 0) {
               --var6;
               --var7;
            } else if (var5 == 1) {
               --var7;
            } else if (var5 == 2) {
               ++var6;
               --var7;
            } else if (var5 == 3) {
               --var6;
            } else if (var5 == 4) {
               ++var6;
            } else if (var5 == 5) {
               --var6;
               ++var7;
            } else if (var5 == 6) {
               ++var7;
            } else if (var5 == 7) {
               ++var6;
               ++var7;
            }

            if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
               var4.resetPath(var6, var7);
               var4.field1132 = false;
            } else if (var2) {
               var4.field1132 = true;
               var4.tileX = var6;
               var4.tileY = var7;
            } else {
               var4.field1132 = false;
               var4.method2361(var6, var7, Players.field1340[var1]);
            }

         } else if (var3 == 2) {
            var5 = var0.readBits(4);
            var6 = var4.pathX[0];
            var7 = var4.pathY[0];
            if (var5 == 0) {
               var6 -= 2;
               var7 -= 2;
            } else if (var5 == 1) {
               --var6;
               var7 -= 2;
            } else if (var5 == 2) {
               var7 -= 2;
            } else if (var5 == 3) {
               ++var6;
               var7 -= 2;
            } else if (var5 == 4) {
               var6 += 2;
               var7 -= 2;
            } else if (var5 == 5) {
               var6 -= 2;
               --var7;
            } else if (var5 == 6) {
               var6 += 2;
               --var7;
            } else if (var5 == 7) {
               var6 -= 2;
            } else if (var5 == 8) {
               var6 += 2;
            } else if (var5 == 9) {
               var6 -= 2;
               ++var7;
            } else if (var5 == 10) {
               var6 += 2;
               ++var7;
            } else if (var5 == 11) {
               var6 -= 2;
               var7 += 2;
            } else if (var5 == 12) {
               --var6;
               var7 += 2;
            } else if (var5 == 13) {
               var7 += 2;
            } else if (var5 == 14) {
               ++var6;
               var7 += 2;
            } else if (var5 == 15) {
               var6 += 2;
               var7 += 2;
            }

            if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
               if (var2) {
                  var4.field1132 = true;
                  var4.tileX = var6;
                  var4.tileY = var7;
               } else {
                  var4.field1132 = false;
                  var4.method2361(var6, var7, Players.field1340[var1]);
               }
            } else {
               var4.resetPath(var6, var7);
               var4.field1132 = false;
            }

         } else {
            var5 = var0.readBits(1);
            int var8;
            int var9;
            int var10;
            int var11;
            if (var5 == 0) {
               var6 = var0.readBits(12);
               var7 = var6 >> 10;
               var8 = var6 >> 5 & 31;
               if (var8 > 15) {
                  var8 -= 32;
               }

               var9 = var6 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var8 + var4.pathX[0];
               var11 = var9 + var4.pathY[0];
               if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
                  var4.resetPath(var10, var11);
                  var4.field1132 = false;
               } else if (var2) {
                  var4.field1132 = true;
                  var4.tileX = var10;
                  var4.tileY = var11;
               } else {
                  var4.field1132 = false;
                  var4.method2361(var10, var11, Players.field1340[var1]);
               }

               var4.plane = (byte)(var7 + var4.plane & 3);
               if (Client.localPlayerIndex == var1) {
                  class103.Client_plane = var4.plane;
               }

            } else {
               var6 = var0.readBits(30);
               var7 = var6 >> 28;
               var8 = var6 >> 14 & 16383;
               var9 = var6 & 16383;
               var10 = (ParamComposition.baseX * 64 + var8 + var4.pathX[0] & 16383) - ParamComposition.baseX * 64;
               var11 = (Client.baseY * 64 + var9 + var4.pathY[0] & 16383) - Client.baseY * 64;
               if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
                  var4.resetPath(var10, var11);
                  var4.field1132 = false;
               } else if (var2) {
                  var4.field1132 = true;
                  var4.tileX = var10;
                  var4.tileY = var11;
               } else {
                  var4.field1132 = false;
                  var4.method2361(var10, var11, Players.field1340[var1]);
               }

               var4.plane = (byte)(var7 + var4.plane & 3);
               if (Client.localPlayerIndex == var1) {
                  class103.Client_plane = var4.plane;
               }

            }
         }
      }
   }
}
