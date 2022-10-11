import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hk")
@Implements("Occluder")
public final class Occluder {
   @ObfuscatedName("nq")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("mousedOverWidgetIf1")
   static Widget mousedOverWidgetIf1;
   @ObfuscatedName("nk")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   static Widget field2556;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1328868489
   )
   @Export("minTileX")
   int minTileX;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1276220617
   )
   @Export("maxTileX")
   int maxTileX;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1126010519
   )
   @Export("minTileY")
   int minTileY;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1669707599
   )
   @Export("maxTileY")
   int maxTileY;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1882765957
   )
   @Export("type")
   int type;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1054126167
   )
   @Export("minX")
   int minX;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 897248667
   )
   @Export("maxX")
   int maxX;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -117892981
   )
   @Export("minZ")
   int minZ;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1407177887
   )
   @Export("maxZ")
   int maxZ;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1931690143
   )
   @Export("minY")
   int minY;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 255925405
   )
   @Export("maxY")
   int maxY;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 30655429
   )
   int field2546;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1343869685
   )
   int field2549;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -1698854935
   )
   int field2544;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = -1216108319
   )
   int field2551;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -869780743
   )
   int field2552;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -862819647
   )
   int field2554;
   @ObfuscatedName("t")
   @ObfuscatedGetter(
      intValue = -1754682017
   )
   int field2550;

   Occluder() {
   }

   @ObfuscatedName("gr")
   @ObfuscatedSignature(
      descriptor = "(Lcl;I)V",
      garbageValue = "1543099786"
   )
   static final void method4470(Actor var0) {
      boolean var1 = var0.field1193 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
      if (!var1) {
         SequenceDefinition var2 = WorldMapElement.SequenceDefinition_get(var0.sequence);
         if (var2 != null && !var2.isCachedModelIdSet()) {
            var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame];
         } else {
            var1 = true;
         }
      }

      if (var1) {
         int var8 = var0.field1193 - var0.field1192;
         int var3 = Client.cycle - var0.field1192;
         int var4 = var0.field1150 * 128 + var0.field1201 * 64;
         int var5 = var0.field1190 * 128 + var0.field1201 * 64;
         int var6 = var0.field1189 * 128 + var0.field1201 * 64;
         int var7 = var0.field1188 * 128 + var0.field1201 * 64;
         var0.x = (var6 * var3 + var4 * (var8 - var3)) / var8;
         var0.y = (var3 * var7 + var5 * (var8 - var3)) / var8;
      }

      var0.field1172 = 0;
      var0.orientation = var0.field1194;
      var0.rotation = var0.orientation;
   }
}
