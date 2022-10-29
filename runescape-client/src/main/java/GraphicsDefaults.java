import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1143172387
   )
   @Export("compass")
   public int compass = -1;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -864189905
   )
   public int field4536 = -1;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 35824071
   )
   @Export("mapScenes")
   public int mapScenes = -1;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 2039169195
   )
   @Export("headIconsPk")
   public int headIconsPk = -1;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = -2112358395
   )
   public int field4538 = -1;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1102270247
   )
   public int field4539 = -1;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1708342261
   )
   public int field4540 = -1;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1036565301
   )
   public int field4541 = -1;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 539674131
   )
   public int field4542 = -1;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 178036597
   )
   public int field4543 = -1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1363465089
   )
   public int field4544 = -1;

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;I)V",
      garbageValue = "-2108438411"
   )
   @Export("decode")
   public void decode(AbstractArchive var1) {
      byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4533.group);
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
               this.field4536 = var3.readNullableLargeSmart();
               this.mapScenes = var3.readNullableLargeSmart();
               this.headIconsPk = var3.readNullableLargeSmart();
               this.field4538 = var3.readNullableLargeSmart();
               this.field4539 = var3.readNullableLargeSmart();
               this.field4540 = var3.readNullableLargeSmart();
               this.field4541 = var3.readNullableLargeSmart();
               this.field4542 = var3.readNullableLargeSmart();
               this.field4543 = var3.readNullableLargeSmart();
               this.field4544 = var3.readNullableLargeSmart();
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "70"
   )
   static void method7570(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         var1.remove();
      }
   }
}
