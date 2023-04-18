import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iy")
@Implements("ItemLayer")
public final class ItemLayer {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 2064997173
   )
   @Export("z")
   int z;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1473635399
   )
   @Export("x")
   int x;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1341128704
   )
   @Export("y")
   int y;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Liv;"
   )
   @Export("first")
   Renderable first;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Liv;"
   )
   @Export("second")
   Renderable second;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Liv;"
   )
   @Export("third")
   Renderable third;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      longValue = -8562400470617197071L
   )
   @Export("tag")
   long tag;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1118938495
   )
   @Export("height")
   int height;

   ItemLayer() {
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-2088433826"
   )
   public static boolean method4307(int var0) {
      return var0 >= WorldMapDecorationType.field3768.id && var0 <= WorldMapDecorationType.field3769.id;
   }

   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      descriptor = "(ZLsq;I)V",
      garbageValue = "-875746645"
   )
   static final void method4306(boolean var0, PacketBuffer var1) {
      while(true) {
         byte var2 = 16;
         int var3 = 1 << var2;
         if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= var2 + 12) {
            int var4 = var1.readBits(var2);
            if (var4 != var3 - 1) {
               boolean var5 = false;
               if (Client.npcs[var4] == null) {
                  Client.npcs[var4] = new NPC();
                  var5 = true;
               }

               NPC var6 = Client.npcs[var4];
               Client.npcIndices[++Client.npcCount - 1] = var4;
               var6.npcCycle = Client.cycle;
               int var9;
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

               boolean var10 = var1.readBits(1) == 1;
               if (var10) {
                  var1.readBits(32);
               }

               int var11 = var1.readBits(1);
               if (var11 == 1) {
                  Client.field549[++Client.field548 - 1] = var4;
               }

               int var7 = var1.readBits(1);
               var6.definition = AbstractArchive.getNpcDefinition(var1.readBits(14));
               int var8;
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

               int var12 = Client.defaultRotations[var1.readBits(3)];
               if (var5) {
                  var6.orientation = var6.rotation = var12;
               }

               class142.method3236(var6);
               if (var6.field1190 == 0) {
                  var6.rotation = 0;
               }

               var6.method2563(MusicPatchNode.localPlayer.pathX[0] + var8, MusicPatchNode.localPlayer.pathY[0] + var9, var7 == 1);
               continue;
            }
         }

         var1.exportIndex();
         return;
      }
   }
}
