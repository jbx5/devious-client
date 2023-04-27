import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
public class class294 {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("VarcInt_archive")
   public static AbstractArchive VarcInt_archive;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 554168439
   )
   static int field3366;
   @ObfuscatedName("ix")
   @ObfuscatedGetter(
      intValue = -1164741861
   )
   static int field3364;

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-22"
   )
   public static void method5724() {
      FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
   }
}
