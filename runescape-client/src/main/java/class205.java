import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("gx")
public class class205 {
   @ObfuscatedName("v")
   @Export("directions")
   static int[][] directions = new int[128][128];
   @ObfuscatedName("x")
   @Export("distances")
   static int[][] distances = new int[128][128];
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1532404537
   )
   static int field2359;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 328320861
   )
   static int field2364;
   @ObfuscatedName("r")
   @Export("bufferX")
   static int[] bufferX = new int[4096];
   @ObfuscatedName("u")
   @Export("bufferY")
   static int[] bufferY = new int[4096];
   @ObfuscatedName("iu")
   @Export("regions")
   static int[] regions;
}
