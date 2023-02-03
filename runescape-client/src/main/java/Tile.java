import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
@Implements("Tile")
public final class Tile extends Node {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1860038519
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1072152213
   )
   @Export("x")
   int x;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 307632737
   )
   @Export("y")
   int y;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -298498015
   )
   @Export("originalPlane")
   int originalPlane;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lhc;"
   )
   @Export("paint")
   SceneTilePaint paint;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lhj;"
   )
   @Export("model")
   SceneTileModel model;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lhg;"
   )
   @Export("boundaryObject")
   BoundaryObject boundaryObject;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lij;"
   )
   @Export("wallDecoration")
   WallDecoration wallDecoration;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lhq;"
   )
   @Export("floorDecoration")
   FloorDecoration floorDecoration;
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lhi;"
   )
   @Export("itemLayer")
   ItemLayer itemLayer;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1465434097
   )
   @Export("gameObjectsCount")
   int gameObjectsCount;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "[Liu;"
   )
   @Export("gameObjects")
   GameObject[] gameObjects = new GameObject[5];
   @ObfuscatedName("b")
   @Export("gameObjectEdgeMasks")
   int[] gameObjectEdgeMasks = new int[5];
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 16880637
   )
   @Export("gameObjectsEdgeMask")
   int gameObjectsEdgeMask = 0;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = 503958465
   )
   @Export("minPlane")
   int minPlane;
   @ObfuscatedName("h")
   @Export("drawPrimary")
   boolean drawPrimary;
   @ObfuscatedName("p")
   @Export("drawSecondary")
   boolean drawSecondary;
   @ObfuscatedName("o")
   @Export("drawGameObjects")
   boolean drawGameObjects;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 2038034063
   )
   @Export("drawGameObjectEdges")
   int drawGameObjectEdges;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1208782171
   )
   int field2483;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1698014089
   )
   int field2473;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -933600863
   )
   int field2488;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lhy;"
   )
   @Export("linkedBelowTile")
   Tile linkedBelowTile;

   Tile(int var1, int var2, int var3) {
      this.originalPlane = this.plane = var1;
      this.x = var2;
      this.y = var3;
   }
}
