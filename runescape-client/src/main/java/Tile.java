import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("he")
@Implements("Tile")
public final class Tile extends Node {
   @ObfuscatedName("tx")
   @ObfuscatedGetter(
      intValue = -325316609
   )
   static int field2481;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -850337333
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1304974879
   )
   @Export("x")
   int x;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 578479025
   )
   @Export("y")
   int y;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 2133290123
   )
   @Export("originalPlane")
   int originalPlane;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Lhj;"
   )
   @Export("paint")
   SceneTilePaint paint;
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Lhy;"
   )
   @Export("model")
   SceneTileModel model;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lhq;"
   )
   @Export("boundaryObject")
   BoundaryObject boundaryObject;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   @Export("wallDecoration")
   WallDecoration wallDecoration;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lhs;"
   )
   @Export("floorDecoration")
   FloorDecoration floorDecoration;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lgy;"
   )
   @Export("itemLayer")
   ItemLayer itemLayer;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1327449423
   )
   @Export("gameObjectsCount")
   int gameObjectsCount;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "[Lhp;"
   )
   @Export("gameObjects")
   GameObject[] gameObjects = new GameObject[5];
   @ObfuscatedName("i")
   @Export("gameObjectEdgeMasks")
   int[] gameObjectEdgeMasks = new int[5];
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1267903553
   )
   @Export("gameObjectsEdgeMask")
   int gameObjectsEdgeMask = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 879913943
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("k")
   @Export("drawPrimary")
   boolean drawPrimary;
   @ObfuscatedName("a")
   @Export("drawSecondary")
   boolean drawSecondary;
   @ObfuscatedName("s")
   @Export("drawGameObjects")
   boolean drawGameObjects;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 820043389
   )
   @Export("drawGameObjectEdges")
   int drawGameObjectEdges;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -683874913
   )
   int field2477;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1337126443
   )
   int field2470;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 427630575
   )
   int field2479;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lhe;"
   )
   @Export("linkedBelowTile")
   Tile linkedBelowTile;

   Tile(int var1, int var2, int var3) {
      this.originalPlane = this.plane = var1;
      this.x = var2;
      this.y = var3;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/CharSequence;IIB)Ljava/lang/String;",
      garbageValue = "-54"
   )
   public static String method4311(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var10 = var0[var1];
         return var10 == null ? "null" : var10.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var9 = var0[var5];
            if (var9 == null) {
               var4 += 4;
            } else {
               var4 += var9.length();
            }
         }

         StringBuilder var8 = new StringBuilder(var4);

         for(int var6 = var1; var6 < var3; ++var6) {
            CharSequence var7 = var0[var6];
            if (var7 == null) {
               var8.append("null");
            } else {
               var8.append(var7);
            }
         }

         return var8.toString();
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1595440207"
   )
   @Export("savePreferences")
   static void savePreferences() {
      AccessFile var0 = null;

      try {
         var0 = class87.getPreferencesFile("", LoginPacket.field3302.name, true);
         Buffer var1 = StructComposition.clientPreferences.toBuffer();
         var0.write(var1.array, 0, var1.offset);
      } catch (Exception var3) {
      }

      try {
         if (var0 != null) {
            var0.closeSync(true);
         }
      } catch (Exception var2) {
      }

   }
}
