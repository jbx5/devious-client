import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class157 {
   @ObfuscatedName("do")
   static boolean field1742;
   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      descriptor = "[Lsn;"
   )
   @Export("mapDotSprites")
   static SpritePixels[] mapDotSprites;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = -7475800268284802223L
   )
   long field1747;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      longValue = -6641352063649809363L
   )
   long field1744 = -1L;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lni;"
   )
   IterableNodeDeque field1743 = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lsy;)V"
   )
   public class157(Buffer var1) {
      this.method3302(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "257726987"
   )
   void method3302(Buffer var1) {
      this.field1747 = var1.readLong();
      this.field1744 = var1.readLong();

      for(int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
         Object var3;
         if (var2 == 1) {
            var3 = new class152(this);
         } else if (var2 == 4) {
            var3 = new class163(this);
         } else if (var2 == 3) {
            var3 = new class148(this);
         } else if (var2 == 2) {
            var3 = new class146(this);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class153(this);
         }

         ((class156)var3).vmethod3353(var1);
         this.field1743.addFirst((Node)var3);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lgn;I)V",
      garbageValue = "1833930837"
   )
   public void method3303(ClanChannel var1) {
      if (this.field1747 == var1.key && this.field1744 == var1.field1757) {
         for(class156 var2 = (class156)this.field1743.last(); var2 != null; var2 = (class156)this.field1743.previous()) {
            var2.vmethod3354(var1);
         }

         ++var1.field1757;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lsq;II)Z",
      garbageValue = "537506847"
   )
   @Export("updateExternalPlayer")
   static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
      int var2 = var0.readBits(2);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if (var2 == 0) {
         if (var0.readBits(1) != 0) {
            updateExternalPlayer(var0, var1);
         }

         var3 = var0.readBits(13);
         var4 = var0.readBits(13);
         boolean var12 = var0.readBits(1) == 1;
         if (var12) {
            Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
         }

         if (Client.players[var1] != null) {
            throw new RuntimeException();
         } else {
            Player var11 = Client.players[var1] = new Player();
            var11.index = var1;
            if (Players.field1335[var1] != null) {
               var11.read(Players.field1335[var1]);
            }

            var11.orientation = Players.Players_orientations[var1];
            var11.targetIndex = Players.Players_targetIndices[var1];
            var7 = Players.Players_regions[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            var11.pathTraversed[0] = Players.field1332[var1];
            var11.plane = (byte)var8;
            var11.resetPath((var9 << 13) + var3 - GameEngine.baseX * 64, (var10 << 13) + var4 - class178.baseY * 64);
            var11.field1111 = false;
            return true;
         }
      } else if (var2 == 1) {
         var3 = var0.readBits(2);
         var4 = Players.Players_regions[var1];
         Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455);
         return false;
      } else {
         int var5;
         int var6;
         if (var2 == 2) {
            var3 = var0.readBits(5);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var6 = Players.Players_regions[var1];
            var7 = (var6 >> 28) + var4 & 3;
            var8 = var6 >> 14 & 255;
            var9 = var6 & 255;
            if (var5 == 0) {
               --var8;
               --var9;
            }

            if (var5 == 1) {
               --var9;
            }

            if (var5 == 2) {
               ++var8;
               --var9;
            }

            if (var5 == 3) {
               --var8;
            }

            if (var5 == 4) {
               ++var8;
            }

            if (var5 == 5) {
               --var8;
               ++var9;
            }

            if (var5 == 6) {
               ++var9;
            }

            if (var5 == 7) {
               ++var8;
               ++var9;
            }

            Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
            return false;
         } else {
            var3 = var0.readBits(18);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 255;
            var6 = var3 & 255;
            var7 = Players.Players_regions[var1];
            var8 = (var7 >> 28) + var4 & 3;
            var9 = var5 + (var7 >> 14) & 255;
            var10 = var6 + var7 & 255;
            Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
            return false;
         }
      }
   }
}
