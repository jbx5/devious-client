import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sx")
@Implements("DbTableType")
public class DbTableType extends DualNode {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   public static AbstractArchive field4874;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("DBTableType_cache")
   public static EvictingDualNodeHashTable DBTableType_cache = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "Lml;"
   )
   static StudioGame field4870;
   @ObfuscatedName("ac")
   @Export("types")
   public int[][] types;
   @ObfuscatedName("ab")
   @Export("defaultValues")
   public Object[][] defaultValues;

   DbTableType() {
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-2070277964"
   )
   void method8503(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         this.method8502(var1, var2);
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "1718940042"
   )
   void method8502(Buffer var1, int var2) {
      if (var2 == 1) {
         int var3 = var1.readUnsignedByte();
         if (this.types == null) {
            this.types = new int[var3][];
         }

         for(int var4 = var1.readUnsignedByte(); var4 != 255; var4 = var1.readUnsignedByte()) {
            int var5 = var4 & 127;
            boolean var6 = (var4 & 128) != 0;
            int[] var7 = new int[var1.readUnsignedByte()];

            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] = var1.readUShortSmart();
            }

            this.types[var5] = var7;
            if (var6) {
               if (this.defaultValues == null) {
                  this.defaultValues = new Object[this.types.length][];
               }

               this.defaultValues[var5] = Clock.method3525(var1, var7);
            }
         }
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-24"
   )
   void method8505() {
   }
}
