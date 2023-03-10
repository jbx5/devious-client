import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("Tile")
public final class Tile extends Node {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -391615005
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1645845407
   )
   @Export("x")
   int x;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 961408753
   )
   @Export("y")
   int y;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -735817079
   )
   @Export("originalPlane")
   int originalPlane;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lit;"
   )
   @Export("paint")
   SceneTilePaint paint;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lil;"
   )
   @Export("model")
   SceneTileModel model;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ljc;"
   )
   @Export("boundaryObject")
   BoundaryObject boundaryObject;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Ljg;"
   )
   @Export("wallDecoration")
   WallDecoration wallDecoration;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lib;"
   )
   @Export("floorDecoration")
   FloorDecoration floorDecoration;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lij;"
   )
   @Export("itemLayer")
   ItemLayer itemLayer;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1305572939
   )
   @Export("gameObjectsCount")
   int gameObjectsCount;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "[Ljm;"
   )
   @Export("gameObjects")
   GameObject[] gameObjects = new GameObject[5];
   @ObfuscatedName("as")
   @Export("gameObjectEdgeMasks")
   int[] gameObjectEdgeMasks = new int[5];
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1825223363
   )
   @Export("gameObjectsEdgeMask")
   int gameObjectsEdgeMask = 0;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1881166943
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("az")
   @Export("drawPrimary")
   boolean drawPrimary;
   @ObfuscatedName("ae")
   @Export("drawSecondary")
   boolean drawSecondary;
   @ObfuscatedName("au")
   @Export("drawGameObjects")
   boolean drawGameObjects;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 3487329
   )
   @Export("drawGameObjectEdges")
   int drawGameObjectEdges;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -286370691
   )
   int field2448;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 990045079
   )
   int field2452;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -908465775
   )
   int field2458;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lid;"
   )
   @Export("linkedBelowTile")
   Tile linkedBelowTile;

   Tile(int var1, int var2, int var3) {
      this.originalPlane = this.plane = var1;
      this.x = var2;
      this.y = var3;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "-1086777475"
   )
   @Export("setLoginResponseString")
   static void setLoginResponseString(String var0, String var1, String var2) {
      Login.Login_response1 = var0;
      Login.Login_response2 = var1;
      Login.Login_response3 = var2;
   }
}
