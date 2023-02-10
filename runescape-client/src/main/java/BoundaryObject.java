import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("BoundaryObject")
public final class BoundaryObject {
   @ObfuscatedName("an")
   static String field2768;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1225941573
   )
   @Export("z")
   int z;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -962187195
   )
   @Export("x")
   int x;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -834568319
   )
   @Export("y")
   int y;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -453008145
   )
   @Export("orientationA")
   int orientationA;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1304759669
   )
   @Export("orientationB")
   int orientationB;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("renderable1")
   public Renderable renderable1;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lhd;"
   )
   @Export("renderable2")
   public Renderable renderable2;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      longValue = -7566933810645434605L
   )
   @Export("tag")
   public long tag = 0L;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -596388311
   )
   @Export("flags")
   int flags = 0;

   BoundaryObject() {
   }

   @ObfuscatedName("gs")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1120121316"
   )
   static final void method4846() {
      class275.method5532(WorldMapRegion.field2874, PacketWriter.field1404, WorldMapDecoration.field2970);
      FloorOverlayDefinition.method4027(class135.field1629, class16.field88);
      if (ClanSettings.cameraX == WorldMapRegion.field2874 && UserComparator10.cameraY == PacketWriter.field1404 && WorldMapDecoration.field2970 == class366.cameraZ && class135.field1629 == class103.cameraPitch && class16.field88 == class285.cameraYaw) {
         Client.field767 = false;
         Client.isCameraLocked = false;
         WorldMapData_0.field2806 = 0;
         Players.field1352 = 0;
         FloorOverlayDefinition.field2266 = 0;
         Message.field485 = 0;
         AttackOption.field1320 = 0;
         UserComparator7.field1444 = 0;
         ModeWhere.field4340 = 0;
         Occluder.field2636 = 0;
         class108.field1416 = 0;
         class10.field55 = 0;
      }

   }
}
