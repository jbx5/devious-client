import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("VarbitDefinition_archive")
   static AbstractArchive VarbitDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("VarbitDefinition_cached")
   public static EvictingDualNodeHashTable VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ab")
   static final int[] field2107 = new int[32];
   @ObfuscatedName("at")
   @Export("SpriteBuffer_pixels")
   public static byte[][] SpriteBuffer_pixels;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 470400793
   )
   @Export("baseVar")
   public int baseVar;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1050888611
   )
   @Export("startBit")
   public int startBit;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1130237503
   )
   @Export("endBit")
   public int endBit;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2107[var1] = var0 - 1;
         var0 += var0;
      }

   }

   VarbitComposition() {
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "-27344201"
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
      descriptor = "(Lsg;II)V",
      garbageValue = "2050323828"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.baseVar = var1.readUnsignedShort();
         this.startBit = var1.readUnsignedByte();
         this.endBit = var1.readUnsignedByte();
      }

   }
}
