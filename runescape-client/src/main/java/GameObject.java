import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
@Implements("GameObject")
public final class GameObject {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1692376787
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1487795535
   )
   @Export("z")
   int z;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -85158661
   )
   @Export("centerX")
   int centerX;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1653532281
   )
   @Export("centerY")
   int centerY;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("renderable")
   public Renderable renderable;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1532913499
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 2094223063
   )
   @Export("startX")
   int startX;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1521710851
   )
   @Export("endX")
   int endX;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -277724547
   )
   @Export("startY")
   int startY;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1740988579
   )
   @Export("endY")
   int endY;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1657816971
   )
   int field2801;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -809829645
   )
   @Export("lastDrawn")
   int lastDrawn;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      longValue = 4495018918080100601L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 16792299
   )
   @Export("flags")
   int flags = 0;

   GameObject() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
      garbageValue = "71"
   )
   public static String method4868(CharSequence var0) {
      int var1 = var0.length();
      StringBuilder var2 = new StringBuilder(var1);

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
            if (var4 == ' ') {
               var2.append('+');
            } else {
               byte var5 = class31.charToByteCp1252(var4);
               var2.append('%');
               int var6 = var5 >> 4 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }

               var6 = var5 & 15;
               if (var6 >= 10) {
                  var2.append((char)(var6 + 55));
               } else {
                  var2.append((char)(var6 + 48));
               }
            }
         } else {
            var2.append(var4);
         }
      }

      return var2.toString();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[IIII)V",
      garbageValue = "988147954"
   )
   public static void method4867(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         int var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               int var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         method4867(var0, var1, var2, var5 - 1);
         method4867(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("mu")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "24"
   )
   static void method4866() {
      if (class136.field1633 != null) {
         Client.field796 = Client.cycle;
         class136.field1633.method6759();

         for(int var0 = 0; var0 < Client.players.length; ++var0) {
            if (Client.players[var0] != null) {
               class136.field1633.method6744(ParamComposition.baseX * 64 + (Client.players[var0].x >> 7), Client.baseY * 64 + (Client.players[var0].y >> 7));
            }
         }
      }

   }
}
