import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
public class class196 extends DualNode {
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -56064935
   )
   static int field2072;

   static {
      new EvictingDualNodeHashTable(64);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1118661589"
   )
   public static int method3752() {
      return ViewportMouse.ViewportMouse_entityCount;
   }
}
