import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
@Implements("StructComposition")
public class StructComposition extends DualNode {
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("StructDefinition_archive")
   static AbstractArchive StructDefinition_archive;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lkt;"
   )
   @Export("StructDefinition_cached")
   static EvictingDualNodeHashTable StructDefinition_cached = new EvictingDualNodeHashTable(64);
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lrz;"
   )
   @Export("params")
   IterableNodeHashTable params;

   StructComposition() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-42"
   )
   @Export("postDecode")
   void postDecode() {
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "641873901"
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lsy;II)V",
      garbageValue = "-443433378"
   )
   @Export("decodeNext")
   void decodeNext(Buffer var1, int var2) {
      if (var2 == 249) {
         this.params = AABB.readStringIntParameters(var1, this.params);
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "4"
   )
   @Export("getIntParam")
   public int getIntParam(int var1, int var2) {
      return class139.method3104(this.params, var1, var2);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-2007282645"
   )
   @Export("getStringParam")
   public String getStringParam(int var1, String var2) {
      return class428.method7964(this.params, var1, var2);
   }

   @ObfuscatedName("nw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1561868773"
   )
   static void method3815(int var0) {
      Client.oculusOrbState = var0;
   }
}
