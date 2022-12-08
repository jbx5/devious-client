import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2074471671
   )
   @Export("id")
   int id;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1709661329
   )
   @Export("type")
   int type;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1920524297
   )
   @Export("orientation")
   int orientation;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -14987683
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1813409375
   )
   @Export("x")
   int x;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1033732035
   )
   @Export("y")
   int y;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 1771160437
   )
   @Export("frame")
   int frame;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 672307685
   )
   @Export("cycleStart")
   int cycleStart;

   @ObfuscatedSignature(
      descriptor = "(IIIIIIIZLhr;)V"
   )
   DynamicObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, Renderable var9) {
      this.id = var1;
      this.type = var2;
      this.orientation = var3;
      this.plane = var4;
      this.x = var5;
      this.y = var6;
      if (var7 != -1) {
         this.sequenceDefinition = AABB.SequenceDefinition_get(var7);
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
               this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4024());
            }
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Lhh;",
      garbageValue = "-1279733976"
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
            var2 = this.sequenceDefinition.method4024();
            this.frame += var1;
            var1 = 0;
            if (this.frame >= var2) {
               this.frame = var2 - this.sequenceDefinition.frameCount;
               if (this.frame < 0 || this.frame > var2) {
                  this.sequenceDefinition = null;
               }
            }
         } else {
            label81: {
               do {
                  do {
                     if (var1 <= this.sequenceDefinition.frameLengths[this.frame]) {
                        break label81;
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

      ObjectComposition var12 = VarpDefinition.getObjectDefinition(this.id);
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
         int var9 = var8[var5][var7] + var8[var4][var6] + var8[var5][var6] + var8[var4][var7] >> 2;
         int var10 = (this.x << 7) + (var2 << 6);
         int var11 = (this.y << 7) + (var3 << 6);
         return var12.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;Lql;I)Lql;",
      garbageValue = "-1322672693"
   )
   @Export("readStringIntParameters")
   static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
      int var2 = var0.readUnsignedByte();
      int var3;
      if (var1 == null) {
         var3 = AccessFile.method8302(var2);
         var1 = new IterableNodeHashTable(var3);
      }

      for(var3 = 0; var3 < var2; ++var3) {
         boolean var4 = var0.readUnsignedByte() == 1;
         int var5 = var0.readMedium();
         Object var6;
         if (var4) {
            var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
         } else {
            var6 = new IntegerNode(var0.readInt());
         }

         var1.put((Node)var6, (long)var5);
      }

      return var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-59"
   )
   static void method2139(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         var1.remove();
      }
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1835636041"
   )
   static int method2141(int var0) {
      Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(ILkd;IIIII[FB)Lkd;",
      garbageValue = "42"
   )
   static Widget method2137(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
      Widget var8 = new Widget();
      var8.type = var0;
      var8.parentId = var1.id;
      var8.childIndex = var2;
      var8.isIf3 = true;
      var8.xAlignment = var3;
      var8.yAlignment = var4;
      var8.widthAlignment = var5;
      var8.heightAlignment = var6;
      var8.rawX = (int)((float)var1.width * var7[0]);
      var8.rawY = (int)(var7[1] * (float)var1.height);
      var8.rawWidth = (int)(var7[2] * (float)var1.width);
      var8.rawHeight = (int)(var7[3] * (float)var1.height);
      return var8;
   }
}
