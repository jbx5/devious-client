import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
public class class280 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3179 = new class280(15);
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3172 = new class280(14);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3173 = new class280(16);
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3174 = new class280(7);
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3175 = new class280(7);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3178 = new class280(4);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3176 = new class280(5);
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3171 = new class280(2);
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3183 = new class280(6);
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3180 = new class280(4);
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3181 = new class280(14);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3182 = new class280(5);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   public static final class280 field3177 = new class280(11);

   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "15"
   )
   class280(int var1) {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1260897554"
   )
   @Export("addGameMessage")
   static void addGameMessage(int var0, String var1, String var2) {
      class134.addChatMessage(var0, var1, var2, (String)null);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "1433537546"
   )
   static int method5545(int var0, int var1) {
      ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var2 == null) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.quantities.length; ++var4) {
            if (var2.ids[var4] == var1) {
               var3 += var2.quantities[var4];
            }
         }

         return var3;
      }
   }
}
