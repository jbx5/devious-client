import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class149 extends class142 {
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 773809095
   )
   @Export("Interpreter_stringStackSize")
   static int Interpreter_stringStackSize;
   @ObfuscatedName("aj")
   @Export("Tiles_hueMultiplier")
   static int[] Tiles_hueMultiplier;
   @ObfuscatedName("at")
   boolean field1666;
   @ObfuscatedName("an")
   byte field1668;
   @ObfuscatedName("av")
   byte field1663;
   @ObfuscatedName("as")
   byte field1664;
   @ObfuscatedName("ax")
   byte field1665;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfh;"
   )
   final class145 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfh;)V"
   )
   class149(class145 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "59"
   )
   void vmethod3381(Buffer var1) {
      this.field1666 = var1.readUnsignedByte() == 1;
      this.field1668 = var1.readByte();
      this.field1663 = var1.readByte();
      this.field1664 = var1.readByte();
      this.field1665 = var1.readByte();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfs;B)V",
      garbageValue = "-72"
   )
   void vmethod3382(ClanSettings var1) {
      var1.allowGuests = this.field1666;
      var1.field1694 = this.field1668;
      var1.field1695 = this.field1663;
      var1.field1709 = this.field1664;
      var1.field1697 = this.field1665;
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-75"
   )
   @Export("runWidgetOnLoadListener")
   static void runWidgetOnLoadListener(int var0) {
      if (var0 != -1) {
         if (Client.loadInterface(var0)) {
            Widget[] var1 = class16.Widget_interfaceComponents[var0];

            for(int var2 = 0; var2 < var1.length; ++var2) {
               Widget var3 = var1[var2];
               if (var3.onLoad != null) {
                  ScriptEvent var4 = new ScriptEvent();
                  var4.widget = var3;
                  var4.args = var3.onLoad;
                  SoundSystem.runScript(var4, 5000000, 0);
               }
            }

         }
      }
   }

   @ObfuscatedName("jv")
   @ObfuscatedSignature(
      descriptor = "(ZLtl;I)V",
      garbageValue = "1237028886"
   )
   @Export("updateNpcs")
   static final void updateNpcs(boolean var0, PacketBuffer var1) {
      Client.field634 = 0;
      Client.field579 = 0;
      class92.method2344(var1);

      int var2;
      int var3;
      while(true) {
         var2 = 16;
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

         NPC var6 = Client.npcs[var4];
         Client.npcIndices[++Client.npcCount - 1] = var4;
         var6.npcCycle = Client.cycle;
         var6.definition = Bounds.getNpcDefinition(var1.readBits(14));
         int var7 = var1.readBits(1);
         int var10 = Client.defaultRotations[var1.readBits(3)];
         if (var5) {
            var6.orientation = var6.rotation = var10;
         }

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

         boolean var11 = var1.readBits(1) == 1;
         if (var11) {
            var1.readBits(32);
         }

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

         int var12 = var1.readBits(1);
         if (var12 == 1) {
            Client.field566[++Client.field579 - 1] = var4;
         }

         class381.method7122(var6);
         if (var6.field1220 == 0) {
            var6.rotation = 0;
         }

         var6.method2557(Projectile.localPlayer.pathX[0] + var8, Projectile.localPlayer.pathY[0] + var9, var7 == 1);
      }

      var1.exportIndex();
      class166.method3380(var1);

      for(var2 = 0; var2 < Client.field634; ++var2) {
         var3 = Client.field635[var2];
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
