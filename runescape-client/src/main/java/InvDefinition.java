import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fu")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljx;"
   )
   @Export("InvDefinition_cached")
   static EvictingDualNodeHashTable InvDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("n")
   static int[] field1862;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 481394021
   )
   @Export("size")
   public int size = 0;

   InvDefinition() {
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(Lqr;S)V",
      garbageValue = "128"
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
      descriptor = "(Lqr;IB)V",
      garbageValue = "-1"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 2) {
         this.size = var1.readUnsignedShort();
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1272401355"
   )
   public static void method3413() {
      KitDefinition.KitDefinition_cached.clear();
   }
}
