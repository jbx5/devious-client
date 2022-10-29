import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("WorldMapIcon_0")
public class WorldMapIcon_0 extends AbstractWorldMapIcon {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -2131241977
   )
   @Export("element")
   final int element;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Liz;"
   )
   @Export("label")
   final WorldMapLabel label;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -785582045
   )
   @Export("subWidth")
   final int subWidth;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1528838907
   )
   @Export("subHeight")
   final int subHeight;

   @ObfuscatedSignature(
      descriptor = "(Lki;Lki;ILiz;)V"
   )
   WorldMapIcon_0(Coord var1, Coord var2, int var3, WorldMapLabel var4) {
      super(var1, var2);
      this.element = var3;
      this.label = var4;
      WorldMapElement var5 = Actor.WorldMapElement_get(this.getElement());
      SpritePixels var6 = var5.getSpriteBool(false);
      if (var6 != null) {
         this.subWidth = var6.subWidth;
         this.subHeight = var6.subHeight;
      } else {
         this.subWidth = 0;
         this.subHeight = 0;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-410730858"
   )
   @Export("getElement")
   public int getElement() {
      return this.element;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)Liz;",
      garbageValue = "-1352130309"
   )
   @Export("getLabel")
   WorldMapLabel getLabel() {
      return this.label;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1449491180"
   )
   @Export("getSubWidth")
   int getSubWidth() {
      return this.subWidth;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2053294830"
   )
   @Export("getSubHeight")
   int getSubHeight() {
      return this.subHeight;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;I)V",
      garbageValue = "-1679452977"
   )
   public static void method5070(AbstractArchive var0) {
      FloorOverlayDefinition.FloorOverlayDefinition_archive = var0;
   }

   @ObfuscatedName("mv")
   @ObfuscatedSignature(
      descriptor = "(Lqr;IB)V",
      garbageValue = "-81"
   )
   static void method5075(Buffer var0, int var1) {
      byte[] var2 = var0.array;
      if (Client.randomDatData == null) {
         Client.randomDatData = new byte[24];
      }

      class370.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
      FloorOverlayDefinition.method3864(var0, var1);
   }
}
