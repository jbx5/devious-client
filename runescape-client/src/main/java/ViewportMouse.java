import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("ViewportMouse")
public class ViewportMouse {
   @ObfuscatedName("at")
   @Export("ViewportMouse_isInViewport")
   public static boolean ViewportMouse_isInViewport = false;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 30823171
   )
   @Export("ViewportMouse_x")
   public static int ViewportMouse_x = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1515600057
   )
   @Export("ViewportMouse_y")
   public static int ViewportMouse_y = 0;
   @ObfuscatedName("as")
   @Export("ViewportMouse_false0")
   public static boolean ViewportMouse_false0 = false;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1486866381
   )
   static int field2766;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1436309573
   )
   static int field2767;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -526063657
   )
   static int field2762;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 1158638333
   )
   @Export("ViewportMouse_entityCount")
   public static int ViewportMouse_entityCount = 0;
   @ObfuscatedName("ac")
   @Export("ViewportMouse_entityTags")
   public static long[] ViewportMouse_entityTags = new long[1000];
   @ObfuscatedName("fy")
   @ObfuscatedSignature(
      descriptor = "Lny;"
   )
   static Archive field2770;

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IIIZIZI)V",
      garbageValue = "-1021092525"
   )
   @Export("doWorldSorting")
   static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var6 = (var0 + var1) / 2;
         int var7 = var0;
         World var8 = World.World_worlds[var6];
         World.World_worlds[var6] = World.World_worlds[var1];
         World.World_worlds[var1] = var8;

         for(int var9 = var0; var9 < var1; ++var9) {
            World var11 = World.World_worlds[var9];
            int var12 = Coord.compareWorlds(var11, var8, var2, var3);
            int var10;
            if (var12 != 0) {
               if (var3) {
                  var10 = -var12;
               } else {
                  var10 = var12;
               }
            } else if (var4 == -1) {
               var10 = 0;
            } else {
               int var13 = Coord.compareWorlds(var11, var8, var4, var5);
               if (var5) {
                  var10 = -var13;
               } else {
                  var10 = var13;
               }
            }

            if (var10 <= 0) {
               World var14 = World.World_worlds[var9];
               World.World_worlds[var9] = World.World_worlds[var7];
               World.World_worlds[var7++] = var14;
            }
         }

         World.World_worlds[var1] = World.World_worlds[var7];
         World.World_worlds[var7] = var8;
         doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
         doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1980405644"
   )
   @Export("Login_promptCredentials")
   static void Login_promptCredentials(boolean var0) {
      if (!class347.client.method1201() && !class347.client.method1509() && !class347.client.method1202()) {
         Login.Login_response1 = "";
         Login.Login_response2 = "Enter your username/email & password.";
         Login.Login_response3 = "";
         class390.method7249(2);
         if (var0) {
            Login.Login_password = "";
         }

         Messages.method2771();
         WorldMapSectionType.method5418();
      } else {
         class390.method7249(10);
      }
   }
}
