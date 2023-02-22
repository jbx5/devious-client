import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1550818127
   )
   @Export("id")
   int id;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 644818899
   )
   @Export("type")
   int type;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 636202351
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 891835891
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 820061589
   )
   @Export("x")
   int x;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -198305785
   )
   @Export("y")
   int y;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lhx;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 819372407
   )
   @Export("frame")
   int frame;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -1368103957
   )
   @Export("cycleStart")
   int cycleStart;

   @ObfuscatedSignature(
      descriptor = "(IIIIIIIZLiq;)V"
   )
   DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
      this.id = var1;
      this.type = var2;
      this.orientation = var3;
      this.plane = var4;
      this.x = var5;
      this.y = var6;
      if (var7 != -1) {
         this.sequenceDefinition = Coord.SequenceDefinition_get(var7);
         this.frame = 0;
         this.cycleStart = Client.cycle - 1;
         if (this.sequenceDefinition.field2276 == 0 && var9 != null && var9 instanceof DynamicObject) {
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
               this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4015());
            }
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Lix;",
      garbageValue = "-1998422213"
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
            var2 = this.sequenceDefinition.method4015();
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

      ObjectComposition var12 = WallDecoration.getObjectDefinition(this.id);
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

   @ObfuscatedName("mw")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lde;",
      garbageValue = "739326708"
   )
   static final InterfaceParent method2142(int var0, int var1, int var2) {
      InterfaceParent var3 = new InterfaceParent();
      var3.group = var1;
      var3.type = var2;
      Client.interfaceParents.put(var3, (long)var0);
      ApproximateRouteStrategy.Widget_resetModelFrames(var1);
      Widget var4 = WorldMapSection1.getWidget(var0);
      class69.invalidateWidget(var4);
      if (Client.meslayerContinueWidget != null) {
         class69.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

      class278.revalidateWidgetScroll(class155.Widget_interfaceComponents[var0 >> 16], var4, false);
      WorldMapSection1.runWidgetOnLoadListener(var1);
      if (Client.rootInterface != -1) {
         NPCComposition.runIntfCloseListeners(Client.rootInterface, 1);
      }

      return var3;
   }
}
