import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("ClanChannelMember")
public class ClanChannelMember {
   @ObfuscatedName("p")
   @Export("Tiles_hueMultiplier")
   static int[] Tiles_hueMultiplier;
   @ObfuscatedName("aa")
   @Export("client")
   @ObfuscatedSignature(
      descriptor = "Lclient;"
   )
   static Client client;
   @ObfuscatedName("a")
   @Export("rank")
   public byte rank;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1833678213
   )
   @Export("world")
   public int world;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lrg;"
   )
   @Export("username")
   public Username username;

   ClanChannelMember() {
   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "27643045"
   )
   static final void method3000() {
      PacketBuffer var0 = Client.packetWriter.packetBuffer;
      var0.importIndex();
      int var1 = var0.readBits(8);
      int var2;
      if (var1 < Client.npcCount) {
         for(var2 = var1; var2 < Client.npcCount; ++var2) {
            Client.field627[++Client.field626 - 1] = Client.npcIndices[var2];
         }
      }

      if (var1 > Client.npcCount) {
         throw new RuntimeException("");
      } else {
         Client.npcCount = 0;

         for(var2 = 0; var2 < var1; ++var2) {
            int var3 = Client.npcIndices[var2];
            NPC var4 = Client.npcs[var3];
            int var5 = var0.readBits(1);
            if (var5 == 0) {
               Client.npcIndices[++Client.npcCount - 1] = var3;
               var4.npcCycle = Client.cycle;
            } else {
               int var6 = var0.readBits(2);
               if (var6 == 0) {
                  Client.npcIndices[++Client.npcCount - 1] = var3;
                  var4.npcCycle = Client.cycle;
                  Client.field551[++Client.field550 - 1] = var3;
               } else {
                  int var7;
                  int var8;
                  if (var6 == 1) {
                     Client.npcIndices[++Client.npcCount - 1] = var3;
                     var4.npcCycle = Client.cycle;
                     var7 = var0.readBits(3);
                     var4.method2487(var7, class202.field2282);
                     var8 = var0.readBits(1);
                     if (var8 == 1) {
                        Client.field551[++Client.field550 - 1] = var3;
                     }
                  } else if (var6 == 2) {
                     Client.npcIndices[++Client.npcCount - 1] = var3;
                     var4.npcCycle = Client.cycle;
                     if (var0.readBits(1) == 1) {
                        var7 = var0.readBits(3);
                        var4.method2487(var7, class202.field2284);
                        var8 = var0.readBits(3);
                        var4.method2487(var8, class202.field2284);
                     } else {
                        var7 = var0.readBits(3);
                        var4.method2487(var7, class202.field2281);
                     }

                     var7 = var0.readBits(1);
                     if (var7 == 1) {
                        Client.field551[++Client.field550 - 1] = var3;
                     }
                  } else if (var6 == 3) {
                     Client.field627[++Client.field626 - 1] = var3;
                  }
               }
            }
         }

      }
   }
}
