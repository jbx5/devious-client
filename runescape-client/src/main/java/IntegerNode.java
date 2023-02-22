import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("rx")
@Implements("IntegerNode")
public class IntegerNode extends Node {
   @ObfuscatedName("aj")
   @Export("integer")
   public int integer;

   public IntegerNode(int var1) {
      this.integer = var1;
   }
}
