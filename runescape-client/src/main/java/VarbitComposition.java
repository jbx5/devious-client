import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gb")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("VarbitDefinition_cached")
   public static EvictingDualNodeHashTable VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("j")
   static final int[] field2040 = new int[32];
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1460632023
   )
   @Export("baseVar")
   public int baseVar;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -22574883
   )
   @Export("startBit")
   public int startBit;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 103024431
   )
   @Export("endBit")
   public int endBit;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2040[var1] = var0 - 1;
         var0 += var0;
      }

   }

   VarbitComposition() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "1085245023"
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqr;II)V",
      garbageValue = "1482578522"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 1) {
         this.baseVar = var1.readUnsignedShort();
         this.startBit = var1.readUnsignedByte();
         this.endBit = var1.readUnsignedByte();
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-664240411"
   )
   static void method3635() {
      WorldMapRegion.WorldMapRegion_cachedSprites.clear();
   }
}
