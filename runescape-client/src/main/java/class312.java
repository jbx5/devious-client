import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public class class312 {
   @ObfuscatedName("jq")
   @ObfuscatedSignature(
      descriptor = "(ZLqx;B)V",
      garbageValue = "7"
   )
   @Export("updateNpcs")
   static final void updateNpcs(boolean var0, PacketBuffer var1) {
      Client.field779 = 0;
      Client.field564 = 0;
      var1.importIndex();
      int var2 = var1.readBits(8);
      int var3;
      if (var2 < Client.npcCount) {
         for(var3 = var2; var3 < Client.npcCount; ++var3) {
            Client.field641[++Client.field779 - 1] = Client.npcIndices[var3];
         }
      }

      if (var2 > Client.npcCount) {
         throw new RuntimeException("");
      } else {
         Client.npcCount = 0;

         int var4;
         int var7;
         int var8;
         int var9;
         for(var3 = 0; var3 < var2; ++var3) {
            var4 = Client.npcIndices[var3];
            NPC var13 = Client.npcs[var4];
            int var14 = var1.readBits(1);
            if (var14 == 0) {
               Client.npcIndices[++Client.npcCount - 1] = var4;
               var13.npcCycle = Client.cycle;
            } else {
               var7 = var1.readBits(2);
               if (var7 == 0) {
                  Client.npcIndices[++Client.npcCount - 1] = var4;
                  var13.npcCycle = Client.cycle;
                  Client.field565[++Client.field564 - 1] = var4;
               } else if (var7 == 1) {
                  Client.npcIndices[++Client.npcCount - 1] = var4;
                  var13.npcCycle = Client.cycle;
                  var8 = var1.readBits(3);
                  var13.method2533(var8, class204.field2355);
                  var9 = var1.readBits(1);
                  if (var9 == 1) {
                     Client.field565[++Client.field564 - 1] = var4;
                  }
               } else if (var7 == 2) {
                  Client.npcIndices[++Client.npcCount - 1] = var4;
                  var13.npcCycle = Client.cycle;
                  if (var1.readBits(1) == 1) {
                     var8 = var1.readBits(3);
                     var13.method2533(var8, class204.field2357);
                     var9 = var1.readBits(3);
                     var13.method2533(var9, class204.field2357);
                  } else {
                     var8 = var1.readBits(3);
                     var13.method2533(var8, class204.field2356);
                  }

                  var8 = var1.readBits(1);
                  if (var8 == 1) {
                     Client.field565[++Client.field564 - 1] = var4;
                  }
               } else if (var7 == 3) {
                  Client.field641[++Client.field779 - 1] = var4;
               }
            }
         }

         while(true) {
            var2 = ParamComposition.field2121 ? 16 : 15;
            var3 = 1 << var2;
            if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) < var2 + 12) {
               break;
            }

            var4 = var1.readBits(var2);
            if (var4 == var3 - 1) {
               break;
            }

            boolean var5 = false;
            if (Client.npcs[var4] == null) {
               Client.npcs[var4] = new NPC();
               var5 = true;
            }

            NPC var6 = Client.npcs[var4];
            Client.npcIndices[++Client.npcCount - 1] = var4;
            var6.npcCycle = Client.cycle;
            int var10;
            boolean var11;
            int var12;
            if (ParamComposition.field2121) {
               var10 = Client.defaultRotations[var1.readBits(3)];
               if (var5) {
                  var6.orientation = var6.rotation = var10;
               }

               var6.definition = class129.getNpcDefinition(var1.readBits(14));
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

               var7 = var1.readBits(1);
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

               var11 = var1.readBits(1) == 1;
               if (var11) {
                  var1.readBits(32);
               }

               var12 = var1.readBits(1);
               if (var12 == 1) {
                  Client.field565[++Client.field564 - 1] = var4;
               }
            } else {
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

               var10 = var1.readBits(1);
               if (var10 == 1) {
                  Client.field565[++Client.field564 - 1] = var4;
               }

               var11 = var1.readBits(1) == 1;
               if (var11) {
                  var1.readBits(32);
               }

               var6.definition = class129.getNpcDefinition(var1.readBits(14));
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
               var12 = Client.defaultRotations[var1.readBits(3)];
               if (var5) {
                  var6.orientation = var6.rotation = var12;
               }
            }

            GameObject.method4832(var6);
            var6.method2534(class155.localPlayer.pathX[0] + var8, class155.localPlayer.pathY[0] + var9, var7 == 1);
         }

         var1.exportIndex();
         class1.method7(var1);

         for(var2 = 0; var2 < Client.field779; ++var2) {
            var3 = Client.field641[var2];
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
}
