import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ny")
public class class369 {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 654594661
   )
   int field4392;

   @ObfuscatedSignature(
      descriptor = "(IZ)V",
      garbageValue = "1"
   )
   class369(int var1, boolean var2) {
      this.field4392 = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-631047520"
   )
   public int method7145() {
      return this.field4392;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "700487735"
   )
   public static void method7151() {
      NPCComposition.NpcDefinition_cached.clear();
      NPCComposition.NpcDefinition_cachedModels.clear();
   }
}
