import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("if")
@Implements("FaceNormal")
public class FaceNormal {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1162796039
   )
   @Export("x")
   int x;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1074293343
   )
   @Export("y")
   int y;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 205085631
   )
   @Export("z")
   int z;

   FaceNormal() {
   }
}
