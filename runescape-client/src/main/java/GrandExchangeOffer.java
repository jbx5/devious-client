import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
   @ObfuscatedName("aj")
   @Export("state")
   byte state;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1677994713
   )
   @Export("id")
   public int id;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -445284831
   )
   @Export("unitPrice")
   public int unitPrice;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1293101251
   )
   @Export("totalQuantity")
   public int totalQuantity;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -315326791
   )
   @Export("currentQuantity")
   public int currentQuantity;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 566393859
   )
   @Export("currentPrice")
   public int currentPrice;

   public GrandExchangeOffer() {
   }

   @ObfuscatedSignature(
      descriptor = "(Lsy;Z)V",
      garbageValue = "0"
   )
   public GrandExchangeOffer(Buffer var1, boolean var2) {
      this.state = var1.readByte();
      this.id = var1.readUnsignedShort();
      this.unitPrice = var1.readInt();
      this.totalQuantity = var1.readInt();
      this.currentQuantity = var1.readInt();
      this.currentPrice = var1.readInt();
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "70"
   )
   @Export("status")
   public int status() {
      return this.state & 7;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1952832227"
   )
   @Export("type")
   public int type() {
      return (this.state & 8) == 8 ? 1 : 0;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-354706724"
   )
   void method6579(int var1) {
      this.state &= -8;
      this.state = (byte)(this.state | var1 & 7);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1603678725"
   )
   void method6587(int var1) {
      this.state &= -9;
      if (var1 == 1) {
         this.state = (byte)(this.state | 8);
      }

   }

   @ObfuscatedName("al")
   @Export("base37DecodeLong")
   public static String base37DecodeLong(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class369.base37Table[(int)(var6 - var0 * 37L)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lmy;I[B[BB)V",
      garbageValue = "-86"
   )
   @Export("Widget_setKey")
   static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
      if (var0.field3575 == null) {
         if (var2 == null) {
            return;
         }

         var0.field3575 = new byte[11][];
         var0.field3601 = new byte[11][];
         var0.field3583 = new int[11];
         var0.field3603 = new int[11];
      }

      var0.field3575[var1] = var2;
      if (var2 != null) {
         var0.field3599 = true;
      } else {
         var0.field3599 = false;

         for(int var4 = 0; var4 < var0.field3575.length; ++var4) {
            if (var0.field3575[var4] != null) {
               var0.field3599 = true;
               break;
            }
         }
      }

      var0.field3601[var1] = var3;
   }
}
