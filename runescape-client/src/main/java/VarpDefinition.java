import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("VarpDefinition_archive")
   static AbstractArchive VarpDefinition_archive;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 750056883
   )
   public static int field1890;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("VarpDefinition_cached")
   public static EvictingDualNodeHashTable VarpDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("as")
   public static boolean field1891;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -327176741
   )
   static int field1894;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1565547027
   )
   @Export("type")
   public int type = 0;

   VarpDefinition() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-1839808014"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsy;IS)V",
      garbageValue = "-22092"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 5) {
         this.type = var1.readUnsignedShort();
      }

   }
}
