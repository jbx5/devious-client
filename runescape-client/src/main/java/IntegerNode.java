import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ol")
@Implements("IntegerNode")
public class IntegerNode extends Node {
   @ObfuscatedName("o")
   @Export("integer")
   public int integer;

   public IntegerNode(int var1) {
      this.integer = var1;
   }
}
