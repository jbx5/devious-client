import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -2082911727
   )
   @Export("compass")
   public int compass = -1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1391423821
   )
   public int field4575 = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -2081671237
   )
   @Export("mapScenes")
   public int mapScenes = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1543211827
   )
   @Export("headIconsPk")
   public int headIconsPk = -1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1634702607
   )
   public int field4572 = -1;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -437135967
   )
   public int field4576 = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1374101135
   )
   public int field4577 = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 637341399
   )
   public int field4578 = -1;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -827595631
   )
   public int field4573 = -1;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -1043626131
   )
   public int field4580 = -1;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 2077238163
   )
   public int field4581 = -1;

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lne;I)V",
      garbageValue = "1692757151"
   )
   @Export("decode")
   public void decode(AbstractArchive var1) {
      byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4569.group);
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
               this.field4575 = var3.readNullableLargeSmart();
               this.mapScenes = var3.readNullableLargeSmart();
               this.headIconsPk = var3.readNullableLargeSmart();
               this.field4572 = var3.readNullableLargeSmart();
               this.field4576 = var3.readNullableLargeSmart();
               this.field4577 = var3.readNullableLargeSmart();
               this.field4578 = var3.readNullableLargeSmart();
               this.field4573 = var3.readNullableLargeSmart();
               this.field4580 = var3.readNullableLargeSmart();
               this.field4581 = var3.readNullableLargeSmart();
         }
      }
   }
}
