import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("SpotAnimationDefinition_archive")
   static AbstractArchive SpotAnimationDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("SpotAnimationDefinition_modelArchive")
   static AbstractArchive SpotAnimationDefinition_modelArchive;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("SpotAnimationDefinition_cached")
   public static EvictingDualNodeHashTable SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("SpotAnimationDefinition_cachedModels")
   public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -190570391
   )
   @Export("id")
   int id;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -170244579
   )
   @Export("archive")
   int archive;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 374130911
   )
   @Export("sequence")
   public int sequence = -1;
   @ObfuscatedName("al")
   @Export("recolorFrom")
   short[] recolorFrom;
   @ObfuscatedName("at")
   @Export("recolorTo")
   short[] recolorTo;
   @ObfuscatedName("aa")
   @Export("retextureFrom")
   short[] retextureFrom;
   @ObfuscatedName("ay")
   @Export("retextureTo")
   short[] retextureTo;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1761247305
   )
   @Export("widthScale")
   int widthScale = 128;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1083521459
   )
   @Export("heightScale")
   int heightScale = 128;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -906961103
   )
   @Export("orientation")
   int orientation = 0;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = 742442999
   )
   @Export("ambient")
   int ambient = 0;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = -138140925
   )
   @Export("contrast")
   int contrast = 0;

   SpotAnimationDefinition() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;B)V",
      garbageValue = "2"
   )
   @Export("decode")
   void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsg;IB)V",
      garbageValue = "4"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.archive = var1.readUnsignedShort();
      } else if (var2 == 2) {
         this.sequence = var1.readUnsignedShort();
      } else if (var2 == 4) {
         this.widthScale = var1.readUnsignedShort();
      } else if (var2 == 5) {
         this.heightScale = var1.readUnsignedShort();
      } else if (var2 == 6) {
         this.orientation = var1.readUnsignedShort();
      } else if (var2 == 7) {
         this.ambient = var1.readUnsignedByte();
      } else if (var2 == 8) {
         this.contrast = var1.readUnsignedByte();
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.recolorFrom = new short[var3];
            this.recolorTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.recolorFrom[var4] = (short)var1.readUnsignedShort();
               this.recolorTo[var4] = (short)var1.readUnsignedShort();
            }
         } else if (var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.retextureFrom = new short[var3];
            this.retextureTo = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.retextureFrom[var4] = (short)var1.readUnsignedShort();
               this.retextureTo[var4] = (short)var1.readUnsignedShort();
            }
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)Lit;",
      garbageValue = "-1066689699"
   )
   @Export("getModel")
   public final Model getModel(int var1) {
      Model var2 = this.method3835();
      Model var3;
      if (this.sequence != -1 && var1 != -1) {
         var3 = ItemContainer.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
      } else {
         var3 = var2.toSharedSpotAnimationModel(true);
      }

      if (this.widthScale != 128 || this.heightScale != 128) {
         var3.scale(this.widthScale, this.heightScale, this.widthScale);
      }

      if (this.orientation != 0) {
         if (this.orientation == 90) {
            var3.rotateY90Ccw();
         }

         if (this.orientation == 180) {
            var3.rotateY90Ccw();
            var3.rotateY90Ccw();
         }

         if (this.orientation == 270) {
            var3.rotateY90Ccw();
            var3.rotateY90Ccw();
            var3.rotateY90Ccw();
         }
      }

      return var3;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Lit;",
      garbageValue = "-972501101"
   )
   public final Model method3835() {
      Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
      if (var1 == null) {
         ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
         if (var2 == null) {
            return null;
         }

         int var3;
         if (this.recolorFrom != null) {
            for(var3 = 0; var3 < this.recolorFrom.length; ++var3) {
               var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
            }
         }

         if (this.retextureFrom != null) {
            for(var3 = 0; var3 < this.retextureFrom.length; ++var3) {
               var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
            }
         }

         var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
         SpotAnimationDefinition_cachedModels.put(var1, (long)this.id);
      }

      return var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)Llg;",
      garbageValue = "0"
   )
   static PacketBufferNode method3844() {
      return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
   }
}
