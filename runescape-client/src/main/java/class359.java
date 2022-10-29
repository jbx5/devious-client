import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public final class class359 {
   @ObfuscatedName("a")
   @Export("base37Table")
   public static final char[] base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @ObfuscatedName("f")
   static long[] field4305 = new long[12];

   static {
      for(int var0 = 0; var0 < field4305.length; ++var0) {
         field4305[var0] = (long)Math.pow(37.0, (double)var0);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Lrw;",
      garbageValue = "-1543076313"
   )
   public static PrivateChatMode method6838(int var0) {
      PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5002, PrivateChatMode.field5000, PrivateChatMode.field5001};
      PrivateChatMode[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         PrivateChatMode var4 = var2[var3];
         if (var0 == var4.field4999) {
            return var4;
         }
      }

      return null;
   }
}
