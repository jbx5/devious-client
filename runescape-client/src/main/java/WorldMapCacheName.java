import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljt;"
   )
   public static final WorldMapCacheName field3013 = new WorldMapCacheName("details");
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Ljt;"
   )
   public static final WorldMapCacheName field3016 = new WorldMapCacheName("compositemap");
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljt;"
   )
   public static final WorldMapCacheName field3011 = new WorldMapCacheName("compositetexture");
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ljt;"
   )
   static final WorldMapCacheName field3018 = new WorldMapCacheName("area");
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ljt;"
   )
   public static final WorldMapCacheName field3014 = new WorldMapCacheName("labels");
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1081287219
   )
   static int field3010;
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Lqj;"
   )
   @Export("loginType")
   static LoginType loginType;
   @ObfuscatedName("j")
   @Export("name")
   public final String name;

   WorldMapCacheName(String var1) {
      this.name = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/String;[SIII)V",
      garbageValue = "-2125263853"
   )
   @Export("sortItemsByName")
   public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var3 + var2) / 2;
         int var5 = var2;
         String var6 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var6;
         short var7 = var1[var4];
         var1[var4] = var1[var3];
         var1[var3] = var7;

         for(int var8 = var2; var8 < var3; ++var8) {
            if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
               String var9 = var0[var8];
               var0[var8] = var0[var5];
               var0[var5] = var9;
               short var10 = var1[var8];
               var1[var8] = var1[var5];
               var1[var5++] = var10;
            }
         }

         var0[var3] = var0[var5];
         var0[var5] = var6;
         var1[var3] = var1[var5];
         var1[var5] = var7;
         sortItemsByName(var0, var1, var2, var5 - 1);
         sortItemsByName(var0, var1, var5 + 1, var3);
      }

   }

   @ObfuscatedName("jm")
   @ObfuscatedSignature(
      descriptor = "(II)Ljava/lang/String;",
      garbageValue = "-813422245"
   )
   @Export("formatItemStacks")
   static final String formatItemStacks(int var0) {
      String var1 = Integer.toString(var0);

      for(int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
         var1 = var1.substring(0, var2) + "," + var1.substring(var2);
      }

      if (var1.length() > 9) {
         return " " + class149.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
      } else {
         return var1.length() > 6 ? " " + class149.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + class149.colorStartTag(16776960) + var1 + "</col>";
      }
   }
}
