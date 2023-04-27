import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -25531251
   )
   @Export("compass")
   public int compass = -1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -740583791
   )
   public int field4636 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -506869823
   )
   @Export("mapScenes")
   public int mapScenes = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 84664645
   )
   @Export("headIconsPk")
   public int headIconsPk = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 842447949
   )
   public int field4644 = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1721152621
   )
   public int field4641 = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1343036557
   )
   public int field4642 = -1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1146186045
   )
   public int field4640 = -1;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 130583873
   )
   public int field4643 = -1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 233709739
   )
   public int field4645 = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -2142254499
   )
   public int field4637 = -1;

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;I)V",
      garbageValue = "-1761039075"
   )
   @Export("decode")
   public void decode(AbstractArchive var1) {
      byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4635.group);
      Buffer var3 = new Buffer(var2);

      while(true) {
         int var4 = var3.readUnsignedByte();
         if (var4 == 0) {
            return;
         }

         switch (var4) {
            case 1:
               var3.readMedium();
               break;
            case 2:
               this.compass = var3.readNullableLargeSmart();
               this.field4636 = var3.readNullableLargeSmart();
               this.mapScenes = var3.readNullableLargeSmart();
               this.headIconsPk = var3.readNullableLargeSmart();
               this.field4644 = var3.readNullableLargeSmart();
               this.field4641 = var3.readNullableLargeSmart();
               this.field4642 = var3.readNullableLargeSmart();
               this.field4640 = var3.readNullableLargeSmart();
               this.field4643 = var3.readNullableLargeSmart();
               this.field4645 = var3.readNullableLargeSmart();
               this.field4637 = var3.readNullableLargeSmart();
         }
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Lgz;",
      garbageValue = "-1565571529"
   )
   @Export("VarpDefinition_get")
   public static VarpDefinition VarpDefinition_get(int var0) {
      VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
         var1 = new VarpDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("jg")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-93"
   )
   static final void method8084() {
      for(GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
         if (var0.plane == GameEngine.Client_plane && !var0.isFinished) {
            if (Client.cycle >= var0.cycleStart) {
               var0.advance(Client.graphicsCycle);
               if (var0.isFinished) {
                  var0.remove();
               } else {
                  class31.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false);
               }
            }
         } else {
            var0.remove();
         }
      }

   }
}
