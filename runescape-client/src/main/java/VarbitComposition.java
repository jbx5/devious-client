import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("VarbitDefinition_archive")
   public static AbstractArchive VarbitDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("VarbitDefinition_cached")
   public static EvictingDualNodeHashTable VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ap")
   static final int[] field2100 = new int[32];
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 358239317
   )
   @Export("musicTrackGroupId")
   public static int musicTrackGroupId;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 157639063
   )
   @Export("baseVar")
   public int baseVar;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 348461267
   )
   @Export("startBit")
   public int startBit;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -2079175747
   )
   @Export("endBit")
   public int endBit;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2100[var1] = var0 - 1;
         var0 += var0;
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;I)V",
      garbageValue = "-2040707648"
   )
   @Export("decode")
   public void decode(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.decodeNext(var1, var2);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IB)V",
      garbageValue = "60"
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
