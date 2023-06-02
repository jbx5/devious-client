import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("StructComposition")
public class StructComposition extends DualNode {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("StructDefinition_archive")
   static AbstractArchive StructDefinition_archive;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Llf;"
   )
   @Export("StructDefinition_cached")
   static EvictingDualNodeHashTable StructDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ar")
   @Export("cacheParentPaths")
   static String[] cacheParentPaths;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lsv;"
   )
   @Export("params")
   IterableNodeHashTable params;

   StructComposition() {
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ltz;B)V",
      garbageValue = "0"
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

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IB)V",
      garbageValue = "-28"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 249) {
         this.params = ReflectionCheck.readStringIntParameters(var1, this.params);
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "661998652"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      IterableNodeHashTable var4 = this.params;
      int var3;
      if (var4 == null) {
         var3 = var2;
      } else {
         IntegerNode var5 = (IntegerNode)var4.get((long)var1);
         if (var5 == null) {
            var3 = var2;
         } else {
            var3 = var5.integer;
         }
      }

      return var3;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-1837954427"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return class165.method3374(this.params, var1, var2);
   }
}
