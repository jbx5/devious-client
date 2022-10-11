import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -569927599
   )
   @Export("objectDefId")
   final int objectDefId;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lii;"
   )
   @Export("region")
   final WorldMapRegion region;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1248972069
   )
   @Export("element")
   int element;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Liz;"
   )
   @Export("label")
   WorldMapLabel label;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -399666379
   )
   @Export("subWidth")
   int subWidth;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 2250007
   )
   @Export("subHeight")
   int subHeight;

   @ObfuscatedSignature(
      descriptor = "(Lki;Lki;ILii;)V"
   )
   WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
      super(var1, var2);
      this.objectDefId = var3;
      this.region = var4;
      this.init();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2040626258"
   )
   @Export("init")
   void init() {
      this.element = InterfaceParent.getObjectDefinition(this.objectDefId).transform().mapIconId;
      this.label = this.region.createMapLabel(Actor.WorldMapElement_get(this.element));
      WorldMapElement var1 = Actor.WorldMapElement_get(this.getElement());
      SpritePixels var2 = var1.getSpriteBool(false);
      if (var2 != null) {
         this.subWidth = var2.subWidth;
         this.subHeight = var2.subHeight;
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
      descriptor = "(IIB)I",
      garbageValue = "0"
   )
   public static int method4716(int var0, int var1) {
      int var2;
      for(var2 = 1; var1 > 1; var1 >>= 1) {
         if ((var1 & 1) != 0) {
            var2 = var0 * var2;
         }

         var0 *= var0;
      }

      if (var1 == 1) {
         return var0 * var2;
      } else {
         return var2;
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "109870945"
   )
   public static void method4715() {
      ItemComposition.ItemDefinition_cached.clear();
      ItemComposition.ItemDefinition_cachedModels.clear();
      ItemComposition.ItemDefinition_cachedSprites.clear();
   }
}
