import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class160 {
   @ObfuscatedName("qm")
   @ObfuscatedSignature(
      descriptor = "Lsu;"
   )
   @Export("HitSplatDefinition_cachedSprites")
   static class473 HitSplatDefinition_cachedSprites;

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IS)Lfl;",
      garbageValue = "1990"
   )
   static class134 method3440(int var0) {
      class134 var1 = (class134)StructComposition.findEnumerated(class425.method8243(), var0);
      if (var1 == null) {
         var1 = class134.field1607;
      }

      return var1;
   }
}
