import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
   @ObfuscatedName("bw")
   static String field4623;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1866379087
   )
   @Export("compass")
   public int compass = -1;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1782755257
   )
   public int field4621 = -1;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -698628845
   )
   @Export("mapScenes")
   public int mapScenes = -1;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 748632551
   )
   @Export("headIconsPk")
   public int headIconsPk = -1;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -524027179
   )
   public int field4616 = -1;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -956565367
   )
   public int field4617 = -1;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1683050753
   )
   public int field4620 = -1;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1291720385
   )
   public int field4619 = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1754340917
   )
   public int field4622 = -1;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = 369714537
   )
   public int field4613 = -1;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1394168669
   )
   public int field4624 = -1;

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lln;B)V",
      garbageValue = "16"
   )
   @Export("decode")
   public void decode(AbstractArchive var1) {
      byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4610.group);
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
               this.field4621 = var3.readNullableLargeSmart();
               this.mapScenes = var3.readNullableLargeSmart();
               this.headIconsPk = var3.readNullableLargeSmart();
               this.field4616 = var3.readNullableLargeSmart();
               this.field4617 = var3.readNullableLargeSmart();
               this.field4620 = var3.readNullableLargeSmart();
               this.field4619 = var3.readNullableLargeSmart();
               this.field4622 = var3.readNullableLargeSmart();
               this.field4613 = var3.readNullableLargeSmart();
               this.field4624 = var3.readNullableLargeSmart();
         }
      }
   }
}
