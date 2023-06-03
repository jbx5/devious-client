import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 405209753
   )
   @Export("compass")
   public int compass = -1;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -2107532429
   )
   public int field4654 = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 1581349197
   )
   @Export("mapScenes")
   public int mapScenes = -1;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -973216231
   )
   @Export("headIconsPk")
   public int headIconsPk = -1;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = 812049877
   )
   public int field4657 = -1;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1595846741
   )
   public int field4658 = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1222094955
   )
   public int field4655 = -1;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1266276839
   )
   public int field4660 = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 148077025
   )
   public int field4661 = -1;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1022033619
   )
   public int field4662 = -1;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -134112561
   )
   public int field4659 = -1;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;I)V",
      garbageValue = "757040442"
   )
   @Export("decode")
   public void decode(AbstractArchive var1) {
      byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4651.group);
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
               this.field4654 = var3.readNullableLargeSmart();
               this.mapScenes = var3.readNullableLargeSmart();
               this.headIconsPk = var3.readNullableLargeSmart();
               this.field4657 = var3.readNullableLargeSmart();
               this.field4658 = var3.readNullableLargeSmart();
               this.field4655 = var3.readNullableLargeSmart();
               this.field4660 = var3.readNullableLargeSmart();
               this.field4661 = var3.readNullableLargeSmart();
               this.field4662 = var3.readNullableLargeSmart();
               this.field4659 = var3.readNullableLargeSmart();
         }
      }
   }
}
