import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
   @ObfuscatedName("g")
   @Export("BZip2Decompressor_block")
   static int[] BZip2Decompressor_block;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -2145716013
   )
   @Export("objectDefId")
   final int objectDefId;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lid;"
   )
   @Export("region")
   final WorldMapRegion region;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = 260216997
   )
   @Export("element")
   int element;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lil;"
   )
   @Export("label")
   WorldMapLabel label;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1739546431
   )
   @Export("subWidth")
   int subWidth;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1262372839
   )
   @Export("subHeight")
   int subHeight;

   @ObfuscatedSignature(
      descriptor = "(Lko;Lko;ILid;)V"
   )
   WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
      super(var1, var2);
      this.objectDefId = var3;
      this.region = var4;
      this.init();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "103"
   )
   @Export("init")
   void init() {
      this.element = class463.getObjectDefinition(this.objectDefId).transform().mapIconId;
      this.label = this.region.createMapLabel(class4.WorldMapElement_get(this.element));
      WorldMapElement var1 = class4.WorldMapElement_get(this.getElement());
      SpritePixels var2 = var1.getSpriteBool(false);
      if (var2 != null) {
         this.subWidth = var2.subWidth;
         this.subHeight = var2.subHeight;
      } else {
         this.subWidth = 0;
         this.subHeight = 0;
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1964880024"
   )
   @Export("getElement")
   public int getElement() {
      return this.element;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Lil;",
      garbageValue = "-1317041670"
   )
   @Export("getLabel")
   WorldMapLabel getLabel() {
      return this.label;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "7"
   )
   @Export("getSubWidth")
   int getSubWidth() {
      return this.subWidth;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1769700454"
   )
   @Export("getSubHeight")
   int getSubHeight() {
      return this.subHeight;
   }
}
