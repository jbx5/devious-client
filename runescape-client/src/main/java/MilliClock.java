import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("MilliClock")
public class MilliClock extends Clock {
   @ObfuscatedName("vy")
   @ObfuscatedGetter(
      intValue = -1640184123
   )
   @Export("foundItemIdCount")
   static int foundItemIdCount;
   @ObfuscatedName("a")
   long[] field1834 = new long[10];
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 255214751
   )
   int field1836 = 256;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 796729565
   )
   int field1831 = 1;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      longValue = 7511515696013261305L
   )
   long field1832 = UserComparator8.method2748();
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1840697763
   )
   int field1833 = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -492984425
   )
   int field1830;

   public MilliClock() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1834[var1] = this.field1832;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1222008534"
   )
   @Export("mark")
   public void mark() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.field1834[var1] = 0L;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1655799397"
   )
   @Export("wait")
   public int wait(int var1, int var2) {
      int var3 = this.field1836;
      int var4 = this.field1831;
      this.field1836 = 300;
      this.field1831 = 1;
      this.field1832 = UserComparator8.method2748();
      if (this.field1834[this.field1830] == 0L) {
         this.field1836 = var3;
         this.field1831 = var4;
      } else if (this.field1832 > this.field1834[this.field1830]) {
         this.field1836 = (int)((long)(var1 * 2560) / (this.field1832 - this.field1834[this.field1830]));
      }

      if (this.field1836 < 25) {
         this.field1836 = 25;
      }

      if (this.field1836 > 256) {
         this.field1836 = 256;
         this.field1831 = (int)((long)var1 - (this.field1832 - this.field1834[this.field1830]) / 10L);
      }

      if (this.field1831 > var1) {
         this.field1831 = var1;
      }

      this.field1834[this.field1830] = this.field1832;
      this.field1830 = (this.field1830 + 1) % 10;
      int var5;
      if (this.field1831 > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if (this.field1834[var5] != 0L) {
               this.field1834[var5] += (long)this.field1831;
            }
         }
      }

      if (this.field1831 < var2) {
         this.field1831 = var2;
      }

      class197.method3946((long)this.field1831);

      for(var5 = 0; this.field1833 < 256; this.field1833 += this.field1836) {
         ++var5;
      }

      this.field1833 &= 255;
      return var5;
   }

   @ObfuscatedName("lt")
   @ObfuscatedSignature(
      descriptor = "(Lkn;B)Z",
      garbageValue = "-125"
   )
   static final boolean method3373(Widget var0) {
      int var1 = var0.contentType;
      if (var1 == 205) {
         Client.logoutTimer = 250;
         return true;
      } else {
         int var2;
         int var3;
         if (var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            Client.playerAppearance.changeAppearance(var2, var3 == 1);
         }

         if (var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            Client.playerAppearance.method5745(var2, var3 == 1);
         }

         if (var1 == 324) {
            Client.playerAppearance.method5732(0);
         }

         if (var1 == 325) {
            Client.playerAppearance.method5732(1);
         }

         if (var1 == 326) {
            PacketBufferNode var4 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3022, Client.packetWriter.isaacCipher);
            Client.playerAppearance.write(var4.packetBuffer);
            Client.packetWriter.addNode(var4);
            return true;
         } else {
            return false;
         }
      }
   }
}
