import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("bt")
@Implements("VorbisMapping")
public class VorbisMapping {
   @ObfuscatedName("at")
   int field356;
   @ObfuscatedName("an")
   int field357;
   @ObfuscatedName("av")
   int[] field358;
   @ObfuscatedName("as")
   int[] field359;

   VorbisMapping() {
      class60 var1 = VorbisSample.field374;
      var1.readBits(16);
      this.field356 = var1.method1117() != 0 ? var1.readBits(4) + 1 : 1;
      if (var1.method1117() != 0) {
         var1.readBits(8);
      }

      var1.readBits(2);
      if (this.field356 > 1) {
         this.field357 = var1.readBits(4);
      }

      this.field358 = new int[this.field356];
      this.field359 = new int[this.field356];

      for(int var2 = 0; var2 < this.field356; ++var2) {
         var1.readBits(8);
         this.field358[var2] = var1.readBits(8);
         this.field359[var2] = var1.readBits(8);
      }

   }
}
