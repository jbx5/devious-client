import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dl")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Ltj;"
   )
   static IndexedSprite field1008;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 42066401
   )
   @Export("id")
   int id;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1436945355
   )
   @Export("type")
   int type;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1497127871
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1001280961
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1464424995
   )
   @Export("x")
   int x;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1841030991
   )
   @Export("y")
   int y;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lhy;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -597814633
   )
   @Export("frame")
   int frame;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1587205733
   )
   @Export("cycleStart")
   int cycleStart;

   @ObfuscatedSignature(
      descriptor = "(IIIIIIIZLim;)V"
   )
   DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
      this.id = var1;
      this.type = var2;
      this.orientation = var3;
      this.plane = var4;
      this.x = var5;
      this.y = var6;
      if (var7 != -1) {
         this.sequenceDefinition = WorldMapLabelSize.SequenceDefinition_get(var7);
         this.frame = 0;
         this.cycleStart = Client.cycle - 1;
         if (this.sequenceDefinition.field2299 == 0 && var9 != null && var9 instanceof DynamicObject) {
            DynamicObject var10 = (DynamicObject)var9;
            if (this.sequenceDefinition == var10.sequenceDefinition) {
               this.frame = var10.frame;
               this.cycleStart = var10.cycleStart;
               return;
            }
         }

         if (var8 && this.sequenceDefinition.frameCount != -1) {
            if (!this.sequenceDefinition.isCachedModelIdSet()) {
               this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
               this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
            } else {
               this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4084());
            }
         }
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Ljd;",
      garbageValue = "-1953039490"
   )
   @Export("getModel")
   protected final Model getModel() {
      int var2;
      if (this.sequenceDefinition != null) {
         int var1 = Client.cycle - this.cycleStart;
         if (var1 > 100 && this.sequenceDefinition.frameCount > 0) {
            var1 = 100;
         }

         if (this.sequenceDefinition.isCachedModelIdSet()) {
            var2 = this.sequenceDefinition.method4084();
            this.frame += var1;
            var1 = 0;
            if (this.frame >= var2) {
               this.frame = var2 - this.sequenceDefinition.frameCount;
               if (this.frame < 0 || this.frame > var2) {
                  this.sequenceDefinition = null;
               }
            }
         } else {
            label82: {
               do {
                  do {
                     if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
                        break label82;
                     }

                     var1 -= this.sequenceDefinition.frameLengths[this.frame];
                     ++this.frame;
                  } while(this.frame < this.sequenceDefinition.frameIds.length);

                  this.frame -= this.sequenceDefinition.frameCount;
               } while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

               this.sequenceDefinition = null;
            }
         }

         this.cycleStart = Client.cycle - var1;
      }

      ObjectComposition var12 = class175.getObjectDefinition(this.id);
      if (var12.transforms != null) {
         var12 = var12.transform();
      }

      if (var12 == null) {
         return null;
      } else {
         int var3;
         if (this.orientation != 1 && this.orientation != 3) {
            var2 = var12.sizeX;
            var3 = var12.sizeY;
         } else {
            var2 = var12.sizeY;
            var3 = var12.sizeX;
         }

         int var4 = (var2 >> 1) + this.x;
         int var5 = (var2 + 1 >> 1) + this.x;
         int var6 = (var3 >> 1) + this.y;
         int var7 = (var3 + 1 >> 1) + this.y;
         int[][] var8 = Tiles.Tiles_heights[this.plane];
         int var9 = var8[var5][var7] + var8[var4][var7] + var8[var4][var6] + var8[var5][var6] >> 2;
         int var10 = (this.x << 7) + (var2 << 6);
         int var11 = (this.y << 7) + (var3 << 6);
         return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
      }
   }
}
