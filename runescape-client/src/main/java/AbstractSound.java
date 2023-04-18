import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("cu")
@Implements("AbstractSound")
public abstract class AbstractSound extends Node {
   @ObfuscatedName("ab")
   @Export("position")
   int position;

   AbstractSound() {
   }
}
