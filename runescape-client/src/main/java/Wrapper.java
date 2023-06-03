import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ld")
@Implements("Wrapper")
public abstract class Wrapper extends DualNode {
   @ObfuscatedName("an")
   @Export("size")
   final int size;

   Wrapper(int var1) {
      this.size = var1;
   }

   @ObfuscatedName("at")
   @Export("get")
   abstract Object get();

   @ObfuscatedName("an")
   @Export("isSoft")
   abstract boolean isSoft();
}
