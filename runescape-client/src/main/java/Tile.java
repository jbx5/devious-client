import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
@Implements("Tile")
public final class Tile extends Node {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 681659587
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1961417551
   )
   @Export("x")
   int x;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1921469309
   )
   @Export("y")
   int y;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 294967367
   )
   @Export("originalPlane")
   int originalPlane;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lhr;"
   )
   @Export("paint")
   SceneTilePaint paint;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lhc;"
   )
   @Export("model")
   SceneTileModel model;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lhu;"
   )
   @Export("boundaryObject")
   BoundaryObject boundaryObject;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lhi;"
   )
   @Export("wallDecoration")
   WallDecoration wallDecoration;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lgn;"
   )
   @Export("floorDecoration")
   FloorDecoration floorDecoration;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lgz;"
   )
   @Export("itemLayer")
   ItemLayer itemLayer;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1646797343
   )
   @Export("gameObjectsCount")
   int gameObjectsCount;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "[Lhs;"
   )
   @Export("gameObjects")
   GameObject[] gameObjects = new GameObject[5];
   @ObfuscatedName("p")
   @Export("gameObjectEdgeMasks")
   int[] gameObjectEdgeMasks = new int[5];
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 821893467
   )
   @Export("gameObjectsEdgeMask")
   int gameObjectsEdgeMask = 0;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 641904321
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("u")
   @Export("drawPrimary")
   boolean drawPrimary;
   @ObfuscatedName("z")
   @Export("drawSecondary")
   boolean drawSecondary;
   @ObfuscatedName("t")
   @Export("drawGameObjects")
   boolean drawGameObjects;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1201340535
   )
   @Export("drawGameObjectEdges")
   int drawGameObjectEdges;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 991426263
   )
   int field2405;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -609957303
   )
   int field2399;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 2111041405
   )
   int field2410;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lhp;"
   )
   @Export("linkedBelowTile")
   Tile linkedBelowTile;

   Tile(int var1, int var2, int var3) {
      this.originalPlane = this.plane = var1;
      this.x = var2;
      this.y = var3;
   }

   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-17"
   )
   @Export("getTapToDrop")
   static boolean getTapToDrop() {
      return Client.tapToDrop;
   }
}
