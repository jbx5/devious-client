import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("World")
public class World {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "[Lbz;"
   )
   @Export("World_worlds")
   static World[] World_worlds;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1789792685
   )
   @Export("World_count")
   static int World_count = 0;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1216377021
   )
   @Export("World_listCount")
   static int World_listCount = 0;
   @ObfuscatedName("r")
   @Export("World_sortOption2")
   static int[] World_sortOption2 = new int[]{1, 1, 1, 1};
   @ObfuscatedName("u")
   @Export("World_sortOption1")
   static int[] World_sortOption1 = new int[]{0, 1, 2, 3};
   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      descriptor = "[Lrx;"
   )
   @Export("headIconPkSprites")
   static SpritePixels[] headIconPkSprites;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -944957609
   )
   @Export("id")
   int id;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1208284293
   )
   @Export("properties")
   int properties;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -512350001
   )
   @Export("population")
   int population;
   @ObfuscatedName("o")
   @Export("host")
   String host;
   @ObfuscatedName("n")
   @Export("activity")
   String activity;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 2095420555
   )
   @Export("location")
   int location;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1217896967
   )
   @Export("index")
   int index;

   World() {
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "475623933"
   )
   @Export("isMembersOnly")
   boolean isMembersOnly() {
      return (1 & this.properties) != 0;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-2088011917"
   )
   boolean method1785() {
      return (2 & this.properties) != 0;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "80"
   )
   @Export("isPvp")
   boolean isPvp() {
      return (4 & this.properties) != 0;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1129666838"
   )
   boolean method1748() {
      return (8 & this.properties) != 0;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1842559739"
   )
   @Export("isDeadman")
   boolean isDeadman() {
      return (536870912 & this.properties) != 0;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1891731193"
   )
   @Export("isBeta")
   boolean isBeta() {
      return (33554432 & this.properties) != 0;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "7"
   )
   boolean method1806() {
      return (1073741824 & this.properties) != 0;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "19"
   )
   boolean method1804() {
      return (256 & this.properties) != 0;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1936366564"
   )
   boolean method1753() {
      return (134217728 & this.properties) != 0;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([Lme;II)Lme;",
      garbageValue = "64778385"
   )
   @Export("findEnumerated")
   public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
      MouseWheel[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         MouseWheel var4 = var2[var3];
         if (var1 == var4.rsOrdinal()) {
            return var4;
         }
      }

      return null;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(IIIB)I",
      garbageValue = "100"
   )
   static final int method1801(int var0, int var1, int var2) {
      int var3 = var0 / var2;
      int var4 = var0 & var2 - 1;
      int var5 = var1 / var2;
      int var6 = var1 & var2 - 1;
      int var7 = class143.method3131(var3, var5);
      int var8 = class143.method3131(var3 + 1, var5);
      int var9 = class143.method3131(var3, var5 + 1);
      int var10 = class143.method3131(var3 + 1, var5 + 1);
      int var11 = MouseHandler.method700(var7, var8, var4, var2);
      int var12 = MouseHandler.method700(var9, var10, var4, var2);
      return MouseHandler.method700(var11, var12, var6, var2);
   }
}
