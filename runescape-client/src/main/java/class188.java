import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class188 extends DualNode {
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("Widget_modelsArchive")
   public static AbstractArchive Widget_modelsArchive;
   @ObfuscatedName("ex")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive12")
   static Archive archive12;

   static {
      new EvictingDualNodeHashTable(64);
   }
}
